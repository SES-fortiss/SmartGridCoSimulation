/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package behavior.advancedBehaviorModels;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import resultLogger.ConstantLogger;
import akka.advancedMessages.ErrorAnswerContent;
import akka.advancedMessages.MultiRequestContainer;
import akka.advancedMessages.PingAnswerContent;
import akka.advancedMessages.SingleReceiverRequestContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import faultStrategy.backEnd.BasicFaultStrategy;
import faultStrategy.requests.GetAverageHistoryRequestContent;
import faultStrategy.requests.GetLastHistoryRequestContent;

/**
 *  helps to organize the {@link MultiRequestContainer} and handle the {@link BasicFaultStrategy}. Should only be used as root of the topology
 * @author Luc
 *
 */
public class AbstractMultiMessageInitiatorBehaviorModel extends BehaviorModel {

	public MultiRequestContainer multiRequest;
	protected AnswerContent answerContentToSend;
	protected boolean debugging = false;

	protected AbstractMessageHelper messageHelper;
	protected SimpleBehaviorModel myBehaviorModel;
	private SimpleInitiatorBehaviorModel myInitiatorBehaviorModel;

	protected int maxNumberOfMessages = -1;
	private InitialRequestsHandler initialRequestHandeler;

	private boolean strategyAlreadyChanged;

	public AbstractMultiMessageInitiatorBehaviorModel(String path, SimpleInitiatorBehaviorModel myBehaviorModel) {
		calcMaxNumberofMessages();

		this.actorName = path;
		this.myInitiatorBehaviorModel = myBehaviorModel;
		this.myBehaviorModel = myBehaviorModel;
		this.initialRequestHandeler = new InitialRequestsHandler();
		this.messageHelper = new AbstractMessageHelper();
		this.strategyAlreadyChanged = false;
	}

	public AbstractMultiMessageInitiatorBehaviorModel(String path, SimpleBehaviorModel myBehaviorModel) {
		calcMaxNumberofMessages();

		this.actorName = path;
		this.myBehaviorModel = myBehaviorModel;
		this.myInitiatorBehaviorModel = null;
		this.messageHelper = new AbstractMessageHelper();
		this.strategyAlreadyChanged = false;
	}

	/**
	 * calculate the maximum Number of Messages which need to be exchanged with the current initial Request and the current strategy. Does already
	 * create the appropriate MultiRequest
	 */
	protected void calcMaxNumberofMessages() {
		// Strategy not yet set
		if (getCurrentStrategy() == null)
		{
			if (multiRequest == null)
				multiRequest = new MultiRequestContainer(1, this);
			else
			{
				multiRequest.resetMultiRequest();
				multiRequest.reSizeMultiRequest(1);
			}
		}

		// Strategy is set
		if (getCurrentStrategy() != null)
		{
			int strategySteps = getCurrentStrategy().getMaxNumberOfSteps();

			if (multiRequest == null)
			{
				multiRequest = new MultiRequestContainer(strategySteps, this);
			}
			else
			{
				int tmp = multiRequest.getNumberOfFreeRequestSpaces() - strategySteps;

				if (tmp < 0)
				{
					tmp = Math.abs(tmp);

					multiRequest.reSizeMultiRequest(tmp);
				}
			}
		}
	}

	/**
	 * create a new MultiRequestContent with the given number of free spaces
	 * 
	 * @param numberOfSteps
	 *            the number of spaces the new MultiRequest should contain
	 */
	protected void createNewMultiRequest(int numberOfSteps) {
		if (multiRequest == null)
			multiRequest = new MultiRequestContainer(numberOfSteps, this);
		else
		{
			multiRequest.resetMultiRequest();
			multiRequest.reSizeMultiRequest(numberOfSteps);
		}

	}

	/**
	 * Get the next RequestContent from the current Strategy
	 * 
	 * @param path
	 *            the full path of the asking Node
	 * @param answer
	 *            the last answer which the Node got. null is ok for the first request
	 * @return the next Step (RequestContent) according to the current Strategy
	 */
	protected RequestContent getNextStrategyRequestContent(String path, AnswerContent answer) {
		return getCurrentStrategy().getNextRequest(path, answer);
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		if (debugging)
			System.out.println("---------handleError--------");

		for (ErrorAnswerContent error : errors)
		{
			if (debugging)
				System.out.println(this.actorName + " handleError " + error.getSender());

			if (getCurrentStrategy().existsNextRequest(error.getSender(), error))
			{
				RequestContent request = this.getNextStrategyRequestContent(error.getSender(), error);

				if (debugging)
					System.out.println(this.actorName + " handleError found next message " + request);

				if (request instanceof GetLastHistoryRequestContent)
				{

					if (debugging)
						System.out.println(this.actorName + " got GetLastHistoryRequest");
					BasicAnswer answer = messageHelper.getLastHistoryEntry(error, this);

					ConstantLogger.logHistoryRequest((GetLastHistoryRequestContent) request, answer);

					LinkedList<BasicAnswer> answers = new LinkedList<BasicAnswer>();
					answers.add(answer);

					BasicAnswer resultingAnswer;
					if (myInitiatorBehaviorModel == null)
						resultingAnswer = myBehaviorModel.handleHistoryMessage(answers, error, request);
					else
						resultingAnswer = myInitiatorBehaviorModel.handleHistoryMessage(answers, error, request);

					messageHelper.addAlteredHistoryEntry(resultingAnswer, this);

					// answer was found
					if (resultingAnswer != null)
					{
						// needs to be added to history otherwise there might be no answer in history
						this.actor.messageHistory.addHistoryEntry(actor.getCurrentTimeStep(), resultingAnswer);
					}

					setChildFinished(error.getSender());

				}
				else
				{
					if (request instanceof GetAverageHistoryRequestContent)
					{

						if (debugging)
							System.out.println(this.actorName + " got GetAverageHistoryRequest");
						LinkedList<BasicAnswer> answers = messageHelper.getAverageHistoryEntry(error, this);

						ConstantLogger.logHistoryRequest((GetAverageHistoryRequestContent) request, answers.getFirst());

						BasicAnswer resultingAnswer;
						if (myInitiatorBehaviorModel == null)
							resultingAnswer = myBehaviorModel.handleHistoryMessage(answers, error, request);
						else
							resultingAnswer = myInitiatorBehaviorModel.handleHistoryMessage(answers, error, request);

						messageHelper.addAlteredHistoryEntry(resultingAnswer, this);
						// answer was found
						if (resultingAnswer != null)
						{
							// needs to be added to history otherwise there might be no answer in history
							this.actor.messageHistory.addHistoryEntry(actor.getCurrentTimeStep(), resultingAnswer);
						}

						setChildFinished(error.getSender());

					}
					else
					{
						if (request instanceof SingleReceiverRequestContent)
						{
							// there was an error so we need to create a new SingleRequestContainer
							messageHelper.createNewSingleRecieverContainer(multiRequest);

							SingleReceiverRequestContent nextRequest;
							if (myInitiatorBehaviorModel == null)
								nextRequest = myBehaviorModel.handleErrorSingleReciever(error, (SingleReceiverRequestContent) request);
							else
								nextRequest = myInitiatorBehaviorModel.handleErrorSingleReciever(error, (SingleReceiverRequestContent) request);

							nextRequest.recieverPath = error.getSender();

							multiRequest.addSingleRequest(nextRequest);
						}
						else
						{
							RequestContent nextRequest;
							if (myInitiatorBehaviorModel == null)
								nextRequest = myBehaviorModel.handleError(error, request);
							else
								nextRequest = myInitiatorBehaviorModel.handleError(error, request);

							multiRequest.addRequestContent(nextRequest);
						}
					}
				}
			}
			else
			{
				// EndMessage found
				setChildFinished(error.getSender());
			}
		}
		if (errors.isEmpty())
			throw new IllegalArgumentException("Why entered this methode?");

		if (debugging)
			System.out.println(this.actorName + " after error handling " + multiRequest);
		if (debugging)
			System.out.println("---------handleError over------------");
	}

	/**
	 * replies to an PingRequest
	 * 
	 * @return the appropriate AnswerContent
	 */
	protected AnswerContent handlePingRequest() {
		if (answerContentToSend instanceof PingAnswerContent)
		{
			// do nothing
			return answerContentToSend;
		}
		else
		{
			AnswerContent answer = new PingAnswerContent(this);
			return answer;
		}
	}

	protected boolean tryChangeStrategy() {
		if ((getCurrentStrategy() == null || (getCurrentStrategy().isFinished() && !getCurrentStrategy().isErrorHandlingActive()))
				&& strategyAlreadyChanged == false)
		{
			BasicFaultStrategy newStrategy;
			if (myInitiatorBehaviorModel == null)
				newStrategy = myBehaviorModel.changeStrategy(initialRequestHandeler.getCurrentInitalRequest());
			else
				newStrategy = myInitiatorBehaviorModel.changeStrategy(initialRequestHandeler.getCurrentInitalRequest());

			if (newStrategy != null)
			{
				if (debugging)
					System.out.println(this.actorName + " Changed strategy to " + getCurrentStrategy().getStrategyName());
				setStrategy(newStrategy);
			}
			else
			{
				calcMaxNumberofMessages();
			}
			return true;
		}
		else
		{
			strategyAlreadyChanged = false;
			return false;
		}
	}

	@Override
	public void handleRequest() {
		if (debugging)
			System.out.println(this.actorName + " handleRequest " + requestContentReceived);
		if (debugging)
			System.out.println(this.actorName + " before handleRequest " + multiRequest);

		// maybe change Strategy
		tryChangeStrategy();

		// check if the very first step
		if (this.initialRequestHandeler.isIntitalStep())
		{
			this.initialRequestHandeler.setIntitalStep(false);
			this.initialRequestHandeler.resetIntialRequestCounter();

			// delete the previous Answer
			answerContentToSend = null;

			// reset Strategy
			getCurrentStrategy().resetStrategy();
			getCurrentStrategy().addChildren(this.actor, this.actor.actorOptions.childrenNameList);

			// check if we need to change the Messages in the Strategy
			if (messageHelper.needToChangeStrategyMessages(getCurrentStrategy(), this.initialRequestHandeler.getCurrentInitalRequest()))
			{
				if (debugging)
					System.out.println(this.actorName + " changed the request content");
				messageHelper.changeRequestAndAnswersInStrategy(getCurrentStrategy(), this.initialRequestHandeler.getCurrentInitalRequest());
			}

			RequestContent currentRequest = null;

			if (this.initialRequestHandeler.getCurrentInitalRequest() instanceof MultiRequestContainer)
			{
				throw new IllegalArgumentException("Should not hand over an MultiMessage");
			}
			else
			{
				if (this.initialRequestHandeler.getCurrentInitalRequest() instanceof SingleReceiverRequestContent)
				{
					multiRequest.addNewSingleRequestContainer();
					multiRequest.addSingleRequest((SingleReceiverRequestContent) this.initialRequestHandeler.getCurrentInitalRequest());
				}
				else
				{
					if (this.initialRequestHandeler.getCurrentInitalRequest() != null)
					{
						currentRequest = this.initialRequestHandeler.getCurrentInitalRequest();
						multiRequest.addRequestContent(currentRequest);
					}
				}
			}
		}
		else
		{
			// not initial Step anymore
			if (getCurrentStrategy().isFinished() && !getCurrentStrategy().isErrorHandlingActive())
			{
				if (initialRequestHandeler.foundNextInitialRequestLastTimeStep())
				{
					initialRequestHandeler.setfoundNextInitialRequestLastTimeStep(false);

					calcMaxNumberofMessages();

					messageHelper.changeRequestAndAnswersInStrategy(getCurrentStrategy(), initialRequestHandeler.getCurrentInitalRequest());

					// initial startup or new round started
					getCurrentStrategy().resetStrategy();
					getCurrentStrategy().addChildren(this.actor, this.actor.actorOptions.childrenNameList);

					if (myInitiatorBehaviorModel == null)
						myBehaviorModel.clearForNextTimeStep();
					else
						myInitiatorBehaviorModel.clearForNextTimeStep();

					if (debugging)
						System.out.println(this.actorName + " There are more Requests to process : "
								+ initialRequestHandeler.getCurrentInitalRequest());

				}
				else
				{
					throw new NullPointerException("Think never reach this ");
				}
			}
		}

		if (myInitiatorBehaviorModel == null)
			myBehaviorModel.handleRequest(multiRequest.getCurrentRequestContent(), this.actor.getCurrentTimeStep());
		else
			myInitiatorBehaviorModel.handleRequest(multiRequest.getCurrentRequestContent(), this.actor.getCurrentTimeStep());

	}

	@Override
	public void makeDecision() {

		if (debugging)
		{
			System.out.println(this.actorName + " before makeDecision multi is " + multiRequest);
			System.out.println(this.actorName + " makeDecision got " + requestContentReceived);
		}
		HashMap<BasicAnswer, RequestContent> decisionResult = myInitiatorBehaviorModel.makeDecision(answerListReceived);

		if (decisionResult == null)
		{
			// System.out.println(this.actor.downStreamTrace);
			// System.out.println(this.actor.actorOptions.childrenNameList);
			setAllChildrenFinished();
			getCurrentStrategy().resetStrategy();

		}
		else
		{
			// check who still needs processing
			for (Entry<BasicAnswer, RequestContent> entry : decisionResult.entrySet())
			{
				// no more processing needed
				if (entry.getValue() == null)
				{
					setChildFinished(entry.getKey().senderPath);
				}
				else
				{
					RequestContent nextRequestContent = entry.getValue();
					if (nextRequestContent instanceof SingleReceiverRequestContent)
					{
						messageHelper.createNewSingleRecieverContainer(multiRequest);

						((SingleReceiverRequestContent) nextRequestContent).recieverPath = entry.getKey().senderPath;

						multiRequest.addSingleRequest((SingleReceiverRequestContent) nextRequestContent);
					}
					else
					{
						multiRequest.addRequestContent(nextRequestContent);
					}
				}
			}
		}

		if (!getCurrentStrategy().isFinished())
		{
			// there are still some steps
			messageHelper.nextStepMakeDecision();
		}
		else
		{
			if (getCurrentStrategy().isFinished() && !getCurrentStrategy().isErrorHandlingActive())
			{

				if (this.initialRequestHandeler.existsNextInitalRequest())
				{
					// Calculate the answer
					answerContentToSend = myInitiatorBehaviorModel.returnAnswerContentToSend();
					ConstantLogger.logFinalAnswer(answerContentToSend);

					this.initialRequestHandeler.switchToNextInitalRequest();

					if (debugging)
						System.out.println(this.actorName + " There are more Requests to process : "
								+ this.initialRequestHandeler.getCurrentInitalRequest());

					// test if we need to change strategy
					tryChangeStrategy();
					strategyAlreadyChanged = true;

					multiRequest.addRequestContent(this.initialRequestHandeler.getCurrentInitalRequest());
					this.initialRequestHandeler.setfoundNextInitialRequestLastTimeStep(true);
				}
				else
				{

					// do the preparations for the next Step
					answerContentToSend = myInitiatorBehaviorModel.returnAnswerContentToSend();
					ConstantLogger.logFinalAnswer(answerContentToSend);

					ConstantLogger.writeResultToFile(actor.getCurrentTimeStep());

					myInitiatorBehaviorModel.clearForNextTimeStep();

					this.initialRequestHandeler.setIntitalStep(true);
					this.initialRequestHandeler.setfoundNextInitialRequestLastTimeStep(true);

					// create the new Multi Request
					createNewMultiRequest(1);

					// ask the behaviorModel if in the next step should change the requests
					List<RequestContent> newRequests = myInitiatorBehaviorModel.changeRequestsForNextTimeStep();
					if (newRequests != null)
					{
						// System.out.println(this.actorName + " changed Requests to "+newRequests);
						this.initialRequestHandeler.setInitalRequest(newRequests);
						this.initialRequestHandeler.resetIntialRequestCounter();
					}
					else
						this.initialRequestHandeler.resetIntialRequestCounter();

					// System.out.println(this.actorName + " should delete the stuff multiRequest " + multiRequest);
				}
			}
		}

		if (debugging)
			System.out.println(this.actorName + " after Children makeDecision " + multiRequest);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		if (debugging)
			System.out.println(this.actorName + " returnAnswerContentToSend " + answerContentToSend);
		if (debugging)
			System.out.println(this.actorName + " returnAnswerContentToSend MultiRequest " + multiRequest);

		return answerContentToSend;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return multiRequest;
	}

	/**
	 * If there is no more next RequestContent available to be executed, the Child should be marked as finished
	 * 
	 * @param path
	 *            the full Actorpath of the children
	 */
	protected void setChildFinished(String path) {
		if (getCurrentStrategy() != null)
		{
			getCurrentStrategy().setFinished(path);
		}
	}

	protected void setAllChildrenFinished() {
		if (getCurrentStrategy() != null)
		{
			getCurrentStrategy().setAllFinished();
		}
	}

	/**
	 * Add a List of RequestContents which should be executed every TimeStep
	 * 
	 * @param initialRequest
	 *            the RequestContents which should be executed every TimeStep
	 */
	public void setInitalRequest(LinkedList<RequestContent> initialRequest) {
		this.initialRequestHandeler.setInitalRequest(initialRequest);
		calcMaxNumberofMessages();
	}

	/**
	 * Add a RequestContent which should be executed every TimeStep
	 * 
	 * @param initialRequest
	 *            the RequestContent which should be executed every TimeStep
	 */
	public void setInitalRequest(RequestContent initialRequest) {
		this.initialRequestHandeler.setInitalRequest(initialRequest);

		calcMaxNumberofMessages();
	}

	/**
	 * Set the strategy which should be applied during the next TimeSteps
	 * 
	 * @param newStrategy
	 *            the strategy in context
	 */
	public void setStrategy(BasicFaultStrategy newStrategy) {
		this.setCurrentStrategy(newStrategy);

		calcMaxNumberofMessages();
	}

	/**
	 * Add a Mapping which is applied to the strategy if the current request changes to the provided RequestContent
	 * 
	 * @param mapping
	 *            a mapping from the old RequestContent to the new RequestContent
	 * @param newInitialRequest
	 *            the new initial request
	 */
	public void setStrategyChangeRequestMapping(HashMap<Class<? extends RequestContent>, Class<? extends RequestContent>> mapping,
			Class<? extends RequestContent> newInitialRequest) {
		this.messageHelper.setStrategyChangeRequestMapping(mapping, newInitialRequest);
	}
}
