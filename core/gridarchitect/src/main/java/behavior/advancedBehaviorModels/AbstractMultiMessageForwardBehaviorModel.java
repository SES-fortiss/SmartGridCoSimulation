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
import java.util.Map.Entry;

import faultStrategy.backEnd.BasicFaultStrategy;
import akka.advancedMessages.MultiRequestContainer;
import akka.advancedMessages.PingRequestContent;
import akka.advancedMessages.SingleReceiverRequestContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;

/**
 * helps to organize the {@link MultiRequestContainer} and handle the
 * {@link BasicFaultStrategy}. Should only be used inside the topology
 * 
 * @author Luc
 *
 */

public class AbstractMultiMessageForwardBehaviorModel extends AbstractMultiMessageInitiatorBehaviorModel {

	private final boolean debugging = false;

	/**
	 * creates a new actor
	 * 
	 * @param path            the path of the actor inside the topology
	 * @param myBehaviorModel the behavior model of the actor
	 */
	public AbstractMultiMessageForwardBehaviorModel(String path, SimpleBehaviorModel myBehaviorModel) {
		super(path, myBehaviorModel);

		super.debugging = this.debugging;
	}

	@Override
	public void handleRequest() {
		if (debugging) {
			String s = this.actorName + " handleRequest " + requestContentReceived;
			if (getCurrentStrategy() != null)
				s += " error handling " + getCurrentStrategy().isErrorHandlingActive();

			System.out.println(s);
		}

		// maybe change Strategy
		if (getCurrentStrategy() == null
				|| (getCurrentStrategy().isFinished() && !getCurrentStrategy().isErrorHandlingActive())) {
			BasicFaultStrategy newStrategy = myBehaviorModel.changeStrategy(requestContentReceived);
			if (newStrategy != null) {
				if (debugging)
					System.out
							.println(this.actorName + " Changed strategy to " + getCurrentStrategy().getStrategyName());
				setStrategy(newStrategy);
			} else
				calcMaxNumberofMessages();
		}

		// initial startup or new round started
		if (multiRequest.isEmpty()) {
			answerContentToSend = null;
			if (debugging)
				System.out.println(this.actorName + " got message " + requestContentReceived);
			if (requestContentReceived instanceof PingRequestContent) {
				// No Strategy should be used to handle a PingRequest!!
				getCurrentStrategy().resetStrategy();
			} else {
				getCurrentStrategy().resetStrategy();
				getCurrentStrategy().addChildren(this.actor, this.actor.actorOptions.childrenNameList);

				// has the strategy the correct message
				if (messageHelper.needToChangeStrategyMessages(getCurrentStrategy(), requestContentReceived)) {
					if (debugging)
						System.out.println(this.actorName + " changed the request content");
					messageHelper.changeRequestAndAnswersInStrategy(getCurrentStrategy(), requestContentReceived);
				}

				if (debugging)
					System.out.println(this.actorName + " handleRequest initial ( added children)");

			}
		} else {
			if (debugging)
				System.out.println(this.actorName + " handleRequest No initialization needed");
		}

		// if no error handling is currently active
		if (!getCurrentStrategy().isErrorHandlingActive()) {
			RequestContent currentRequest = null;

			// ask the Simple BehaviorModel
			requestContentReceived = myBehaviorModel.handleRequest(requestContentReceived, actor.getCurrentTimeStep());

			if (requestContentReceived instanceof MultiRequestContainer) {
				currentRequest = ((MultiRequestContainer) requestContentReceived).getCurrentRequestContent();

				multiRequest.addRequestContent(currentRequest);
			} else {
				// cannot answer a single reciever request, need to ask children
				if (requestContentReceived instanceof SingleReceiverRequestContent
						&& !(requestContentReceived instanceof PingRequestContent)) {
					boolean isRequestInserted = multiRequest
							.addSingleRequest((SingleReceiverRequestContent) requestContentReceived);
					if (isRequestInserted == false) {
						multiRequest.addNewSingleRequestContainer();
						multiRequest.addSingleRequest((SingleReceiverRequestContent) requestContentReceived);
					}

				} else {
					if (requestContentReceived != null) {
						currentRequest = requestContentReceived;
						multiRequest.addRequestContent(currentRequest);
					}
				}
			}

		} else {
			if (debugging)
				System.out.println(this.actorName + " is errorhandling");
			// ask the Simple BehaviorModel
			requestContentReceived = myBehaviorModel.handleRequest(requestContentReceived, actor.getCurrentTimeStep());
		}
		if (debugging)
			System.out.println(this.actorName + " handleRequest multi " + multiRequest);

	}

	public void makeDecision() {
		if (debugging) {
			System.out.println(this.actorName + " before makeDecision multi is " + multiRequest);
			System.out.println(this.actorName + " makeDecision got " + requestContentReceived);
		}

		HashMap<BasicAnswer, RequestContent> decisionResult = myBehaviorModel.makeDecision(answerListReceived);

		if (decisionResult == null) {
			// System.out.println(this.actor.downStreamTrace);
			// System.out.println(this.actor.actorOptions.childrenNameList);
			setAllChildrenFinished();
			getCurrentStrategy().resetStrategy();
		} else {
			// check who still needs processing
			for (Entry<BasicAnswer, RequestContent> entry : decisionResult.entrySet()) {
				// no more processing needed
				if (entry.getValue() == null) {
					setChildFinished(entry.getKey().senderPath);
				} else {
					RequestContent nextRequestContent = entry.getValue();
					if (nextRequestContent instanceof SingleReceiverRequestContent) {
						messageHelper.createNewSingleRecieverContainer(multiRequest);

						((SingleReceiverRequestContent) nextRequestContent).recieverPath = entry.getKey().senderPath;

						multiRequest.addSingleRequest((SingleReceiverRequestContent) nextRequestContent);
					} else {
						multiRequest.addRequestContent(nextRequestContent);
					}
				}
			}
		}

		if (debugging)
			System.out.println(this.actorName + " after Children makeDecision " + multiRequest);

		// System.out.println(this.actorName + " makeDecision strategy finished? " +
		// getCurrentStrategy().isFinished());

		if (getCurrentStrategy().isFinished()) {
			// calculate the answer
			if (requestContentReceived instanceof PingRequestContent) {
				answerContentToSend = handlePingRequest();
			} else {
				// Strategy over, we can calculate the Result

				answerContentToSend = myBehaviorModel.returnAnswerContentToSend();
			}

			myBehaviorModel.clearForNextTimeStep();

			createNewMultiRequest(1);
		} else {
			// there are still some steps
			messageHelper.nextStepMakeDecision();
		}
	}
}