/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemActors;

import static akka.dispatch.Futures.sequence;
import static akka.pattern.Patterns.ask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import resultLogger.ConstantLogger;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;
import akka.actor.ActorRef;
import akka.advancedMessages.MultiRequestContainer;
import akka.advancedMessages.PingRequestContent;
import akka.advancedMessages.SingleReceiverRequestContainer;
import akka.advancedMessages.SingleReceiverRequestContent;
import akka.basicActors.BasicActor;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.BasicRequest;
import akka.basicMessages.RequestContent;
import akka.pattern.Patterns;
import akka.systemMessages.DirectAnswerMessage;
import akka.systemMessages.DirectMessage;
import behavior.BehaviorModel;
import configuration.GridArchitectConfiguration;

/**
 * @author Luc
 *
 * Helper Class containing all akka specific Communication.
 */
public class MultipleCommunicationPattern {
	
	private static HashMap<String, RequestContent> senderToMultipleRequestMapping;
	private static boolean debugging = false;

	/*****************************************************************************
	 * BEGIN: Methods to handle specificActor communication 
	 * 
	 * taken from original communication pattern from Alex
	 *****************************************************************************/
	
	public static void answerSpecificActor(BasicActor gridActor, ActorRef sender) {
		if (!gridActor.detectCircle())
		{
			gridActor.reportToParentEnabled = false;
			sender.tell(new DirectAnswerMessage(gridActor.getCurrentTimeStep(), gridActor.upStreamTrace, 0.0), gridActor.getSelf());
		}
		else
		{
			gridActor.reportToParentEnabled = true;
			
			sender.tell(new DirectAnswerMessage(gridActor.getCurrentTimeStep(), gridActor.upStreamTrace, 0.0), gridActor.getSelf());
			
			BasicAnswer basicAnswer = new BasicAnswer(
					gridActor.getCurrentTimeStep(), 
					gridActor.upStreamTrace, true, false,
					gridActor.getSelf().path().toString(), gridActor.answerContent);
			
			gridActor.getContext().parent().tell(basicAnswer, gridActor.getSelf());
		}
	}
	
	public static void askSpecificActor(BasicActor gridActor) {
		if (!gridActor.actorOptions.directConnectionsPathList.isEmpty() && !gridActor.detectCircle())
		{
			for (String actorPath : gridActor.actorOptions.directConnectionsPathList)
			{
				
				gridActor.getContext().actorSelection("/user/ActorSupervisor/" + actorPath)
						.tell(new DirectMessage(gridActor.getCurrentTimeStep(), gridActor.downStreamTrace), gridActor.getSelf());
			}
			List<Future<Object>> actorResponseList = new ArrayList<Future<Object>>();
			for (String actorPath : gridActor.actorOptions.directConnectionsPathList)
				actorResponseList.add(ask(gridActor.getContext().actorSelection(actorPath), new DirectMessage(gridActor.getCurrentTimeStep(),
						gridActor.downStreamTrace), 2000));
			Future<Iterable<Object>> actorFuturesIterable = sequence(actorResponseList, gridActor.getContext().system().dispatcher());
			try
			{
				Iterable<Object> actorResponsesIterable = Await.result(actorFuturesIterable, Duration.create((GridArchitectConfiguration.childrenResponseTime), TimeUnit.MILLISECONDS)); // childrenResponsesIterableTimeOut
				for (Object response : actorResponsesIterable)
				{
					for (ActorRef actor : ((DirectAnswerMessage) response).actorTrace)
						gridActor.upStreamTrace.add(actor);
				}
				gridActor.upStreamTrace.add(gridActor.getSelf());
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	/*****************************************************************************
	 * END: Methods to handle specificActor communication 
	 *****************************************************************************/

	/*****************************************************************************
	 * Begin: Methods to handle children communication 
	 *****************************************************************************/
	
	public static void askChildren(BasicActor gridActor) throws Exception {		
		
		// If there are children, then ...
		if (gridActor.getContext().getChildren().iterator().hasNext())
		{			
			BasicRequest request;
			RequestContent requestContent = gridActor.returnRequestContentToSend();

			// check if it is a MultiRequestContainer
			if (requestContent instanceof MultiRequestContainer)
			{
				MultiRequestContainer mrequest = (MultiRequestContainer) requestContent;
				
				// send the current message to the children
				if (mrequest.getCurrentRequestContent() instanceof SingleReceiverRequestContainer)
				{
					executeAskSpecificChildrenLogic(gridActor, (SingleReceiverRequestContainer) mrequest.getCurrentRequestContent());
				}
				else
				{
					request = new BasicRequest(gridActor.getCurrentTimeStep(), gridActor.getCurrentTime(), gridActor.getTimeStepDuration(), gridActor.downStreamTrace, mrequest.getCurrentRequestContent());
					executeAskChildrenLogic(gridActor, request);
				}
			}
			else // normal execution without MultiRequestContainer
			{
				request = new BasicRequest(gridActor.getCurrentTimeStep(), gridActor.getCurrentTime(), gridActor.getTimeStepDuration(), gridActor.downStreamTrace, requestContent);
				executeAskChildrenLogic(gridActor, request);
			}
		}
		gridActor.upStreamTrace.add(gridActor.getSelf());
	}

	/**
	 * Check if the given BasicActor has an entry in the HashMap.
	 * 
	 * @param gridActor
	 *            The BasicActor which needs to be checked
	 * @return Is true if the BasicActor has an MultiMessage entry in the HashMap
	 */
	private static boolean checkIfMultiMessage(BasicActor gridActor) {
		return checkIfMultiMessage(gridActor.actorOptions.behaviorModel);
	}

	/**
	 * Check if the given BehaviorModel has an entry in the HashMap.
	 * 
	 * @param gridActorModel
	 * @return Is true if the BehaviorModel has an MultiMessage entry in the HashMap
	 */
	private static boolean checkIfMultiMessage(BehaviorModel gridActorModel) {
		if (senderToMultipleRequestMapping == null)
		{
			senderToMultipleRequestMapping = new HashMap<>();
			return false;
		}
		else
		{
			String path = gridActorModel.fullActorPath;
			return senderToMultipleRequestMapping.containsKey(path);
		}
	}

	/**
	 * Thats an important method
	 * 
	 * @param gridActor
	 * @param message
	 */
	public static void doSomeWork(BasicActor gridActor, BasicRequest message) {
		// check if Map needs some initialization		
		if (senderToMultipleRequestMapping == null)	senderToMultipleRequestMapping = new HashMap<>();
		
		// check first if the given Message is a MultiMessage		
		handleMultiRequest(message.requestContent);		

		// if the current gridActor has send a MultiMessage, all the messages inside the MultiMessage have to be processed
		if (checkIfMultiMessage(gridActor))
		{
			MultiRequestContainer mrequest = ((MultiRequestContainer) getMultiMessage(gridActor));

			if (debugging)
			{
				System.out.println("---------" + gridActor.getBasicActor().behaviorModel.actorName + "------------");
				System.out.println("-------------Loop-----------------");
			}

			// loop over all the messages inside the MultiMessage
			for (int i = 0; i < mrequest.maxNbCommunicationSteps; i++)
			{
				if (debugging)
				{
					System.out.println("		---- Loop " + i + " " + gridActor.actorOptions.behaviorModel.actorName + "--------> Steps "+mrequest.maxNbCommunicationSteps);
				}

				executeAskLogic(gridActor, mrequest);

				// if we reached the last step, we can remove it from the HashMap ( everything is processed)
				if (mrequest.isLastStep())
				{
					removeMultiMessageValue(gridActor);
				}
				else
				{
					mrequest.nextStep();
				}

				if (debugging)
				{
					// System.out.println(gridActor.actorOptions.behaviorModel.actorName+" --> What kind of message "+getMultiMessage(gridActor));
					System.out.println("		---- Loop " + i + " " + gridActor.actorOptions.behaviorModel.actorName + " over--------");
				}
			}
			if (debugging)
			{
				System.out.println("-------------Loop over--------------");

				System.out.println("---------" + gridActor.getBasicActor().behaviorModel.actorName + " end-------");
			}
		}
		else
		// no MultiMessage found -> proceed to normal communication
		{

			executeAskLogic(gridActor, message);
		}
		
		// AB HIER wird die Antwort vorbereitet
		
		// If the actor didn't replyed yet, then do reply
		if (gridActor.reportToParentEnabled)
		{
			BasicAnswer answer = new BasicAnswer(gridActor.getCurrentTimeStep(), gridActor.upStreamTrace, true, false, 
					gridActor.getSelf().path().toString(), gridActor.returnAnswerContentToSend());

			gridActor.getSender().tell(answer, gridActor.getSelf());
			// REMINDER warum wird ein upStreamTrace benötigt (evtl. gehts auch ohne?)
			// System.out.println("ANSWER MESSAGE SENDED - " +gridActor.getSelf() +": " + answer);
			gridActor.upStreamTrace = new ArrayList<ActorRef>();
		}
		else
		{
			gridActor.initializationMessageCache = message;

			gridActor.getSender().tell(
					new BasicAnswer(gridActor.getCurrentTimeStep(), gridActor.upStreamTrace, true, false, gridActor.getSelf().path().toString(),
							gridActor.answerContent), gridActor.getSelf());
		}

	}

	private static void executeAskChildrenLogic(BasicActor gridActor, BasicRequest request) throws Exception {		
		
		// Patterns.ask() returns a Future<Object>
		List<Future<Object>> childrenResponseList = new ArrayList<Future<Object>>();

		Iterable<ActorRef> children = gridActor.getContext().getChildren();
		
		for (ActorRef child : children)
		{
			ConstantLogger.logMessageSendCounter(request);
			// wait x ms for response
			childrenResponseList.add(Patterns.ask(child, request, GridArchitectConfiguration.childrenResponseTime));//childrenResponseListTimeOut
		}

		Future<Iterable<Object>> childrenFuturesIterable = sequence(childrenResponseList, gridActor.getContext().system().dispatcher());
		Iterable<Object> childrenResponsesIterable = Await.result(childrenFuturesIterable, Duration.create((GridArchitectConfiguration.childrenResponseTime), TimeUnit.MILLISECONDS)); // childrenResponsesIterableTimeOut		
		
		gridActor.answerListReceived = new ArrayList<BasicAnswer>();
		for (Object iteratorResponses : childrenResponsesIterable)
		{
			BasicAnswer receivedAnswer = (BasicAnswer) iteratorResponses;
			
			gridActor.answerListReceived.add( receivedAnswer);
			ConstantLogger.logMessageSendCounter(receivedAnswer);
			if (receivedAnswer.overrideReportToParent)
			{
				gridActor.reportToParentEnabled = true;
				gridActor.overrideReportToParent = true;
			}

			// if multiple levels of hierarchie exist all actors will be included in the list 
			for (ActorRef actor : receivedAnswer.upstreamActorTrace)
			{
				gridActor.upStreamTrace.add(actor);
			}			
		}
	}

	private static void executeAskLogic(BasicActor gridActor, BasicRequest request) {
		gridActor.prepareRequest();
		executeAskLogic(gridActor, request.requestContent);
	}

	private static void executeAskLogic(BasicActor gridActor, MultiRequestContainer mrequest) {
		gridActor.prepareRequest();
		if (debugging)
		{
			System.out.println("---- Loop " + " Message type " + mrequest.getCurrentRequestContent() + " --------");
		}
		executeAskLogic(gridActor, mrequest.getCurrentRequestContent());
	}

	private static void executeAskLogic(BasicActor gridActor, RequestContent request) {
		
		// FIXME the check if the request is a ping or not shall be part of the errorHandling mechanism, not the normal execution
		if (request instanceof PingRequestContent)
		{
			gridActor.makeDecision();
		}
		else
		{
			gridActor.askChildren();			
			gridActor.makeDecision();
		}
	}

	private static void executeAskSpecificChildrenLogic(BasicActor gridActor, SingleReceiverRequestContainer messages) throws Exception {
		// Patterns.ask() returns a Future<Object>
		List<Future<Object>> childrenResponseList = new ArrayList<Future<Object>>();

		for (SingleReceiverRequestContent secondMessage : messages.getRequests())
		{
			for (ActorRef child : gridActor.getContext().getChildren())
			{
				if (secondMessage.recieverPath.equals(child.path().toString()))
				{
					
					BasicRequest request = new BasicRequest(gridActor.getCurrentTimeStep(), gridActor.getCurrentTime(), gridActor.getTimeStepDuration(), gridActor.downStreamTrace, secondMessage);
					ConstantLogger.logMessageSendCounter(request);
					// wait x ms for response
					childrenResponseList.add(Patterns.ask(child, request, GridArchitectConfiguration.childrenResponseTime)); 
				}
			}
		}

		Future<Iterable<Object>> childrenFuturesIterable = sequence(childrenResponseList, gridActor.getContext().system().dispatcher());
		Iterable<Object> childrenResponsesIterable = Await.result(childrenFuturesIterable, Duration.create((GridArchitectConfiguration.childrenResponseTime), TimeUnit.MILLISECONDS)); //childrenResponsesIterableTimeOut

		gridActor.answerListReceived = new ArrayList<BasicAnswer>();
		for (Object receivedAnswer : childrenResponsesIterable)
		{
			
			gridActor.answerListReceived.add((BasicAnswer) receivedAnswer);
			
			ConstantLogger.logMessageSendCounter((BasicAnswer) receivedAnswer);
			
			if (((BasicAnswer) receivedAnswer).overrideReportToParent)
			{
				gridActor.reportToParentEnabled = true;
				gridActor.overrideReportToParent = true;
			}

			for (ActorRef actor : ((BasicAnswer) receivedAnswer).upstreamActorTrace)
			{
				gridActor.upStreamTrace.add(actor);
			}
		}
	}

	/**
	 * Checks if there exists a Multimessage in the HashMap for the given BasicActor
	 * 
	 * @param gridActorModel
	 *            the BasicActor which should be checked
	 * @return the MultiMessage or null if there is no entry for the given BasicActor
	 */
	private static RequestContent getMultiMessage(BasicActor gridActorModel) {
		String path = gridActorModel.actorOptions.behaviorModel.fullActorPath;

		return senderToMultipleRequestMapping.get(path);
	}

	/**
	 * Checks if the given RequestContent is a MultiMessage. If this is the case, the message and the sender of the message are saved. So all the data
	 * is available in all the possible loops
	 * 
	 * @param message
	 *            the RequestContent which should be checked
	 */
	public static void handleMultiRequest(RequestContent message) {
		if (message instanceof MultiRequestContainer)
		{
			MultiRequestContainer mrequest = ((MultiRequestContainer) message);			
			String path = mrequest.sender.fullActorPath;

			// add the sender and the message to the HashMap. Needs to be available in the next loops
			if (senderToMultipleRequestMapping == null) senderToMultipleRequestMapping = new HashMap<>();
			senderToMultipleRequestMapping.put(path, mrequest);
		}
	}

	/**
	 * Removes the MultiMessage of the given BasicActor from the HashMap
	 * 
	 * @param gridActor
	 *            the BasicActor which should be checked
	 */
	private static void removeMultiMessageValue(BasicActor gridActor) {
		if (senderToMultipleRequestMapping == null) senderToMultipleRequestMapping = new HashMap<>();
		else
		{
			String path = gridActor.actorOptions.behaviorModel.fullActorPath;
			if (senderToMultipleRequestMapping.containsKey(path))
			{
				senderToMultipleRequestMapping.remove(path);
			}
		}
	}
}
