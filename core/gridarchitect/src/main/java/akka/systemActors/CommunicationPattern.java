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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import akka.actor.ActorRef;
import akka.basicActors.BasicActor;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.BasicRequest;
import akka.basicMessages.RequestContent;
import akka.pattern.Patterns;
import configuration.GridArchitectConfiguration;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

/**
 * Helper Class containing akka specific xommunication.
 */
public class CommunicationPattern {

	/*****************************************************************************
	 * Begin: Methods to handle children communication 
	 *****************************************************************************/

	/**
	 * Thats an important method
	 * 
	 * @param gridActor
	 * @param message
	 */
	public static void doSomeWork(BasicActor gridActor) {
		
		// Step 1 handleRequest and get requestContent from Actor
		
		gridActor.handleRequest();
		RequestContent requestContent = gridActor.returnRequestContentToSend();
		
		// Step 2 send Request to children and wait until children have replied
		
		try {
			if (gridActor.getContext().getChildren().iterator().hasNext())
			{					
				BasicRequest request = new BasicRequest(
						gridActor.getCurrentTimeStep(), 
						gridActor.getCurrentTime(), 
						gridActor.getTimeStepDuration(), 
						//gridActor.downStreamTrace,
						null,
						requestContent);
				executeAskChildrenLogic(gridActor, request);
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Step 3 make Decision based on Answers received
		
		//TODO gridActor.upStreamTrace.add(gridActor.getSelf());
		gridActor.makeDecision();
				
		// AB HIER wird die Antwort vorbereitet
		
		gridActor.getSender().tell(
				new BasicAnswer(
						gridActor.getCurrentTimeStep(), 
						//gridActor.upStreamTrace,
						null,
						gridActor.getSelf().path().toString(),
						gridActor.returnAnswerContentToSend()), 
				gridActor.getSelf());
		
		// Next Steps are implemented in the BasicActor
	}

	private static void executeAskChildrenLogic(BasicActor gridActor, BasicRequest request) throws Exception {		
		
		List<Future<Object>> childrenResponseList = new ArrayList<Future<Object>>();
		Iterable<ActorRef> children = gridActor.getContext().getChildren();
		
		for (ActorRef child : children)
		{
			// wait x ms for response
			// Patterns.ask() returns a Future<Object>
			childrenResponseList.add(Patterns.ask(child, request, GridArchitectConfiguration.childrenResponseTime));//childrenResponseListTimeOut
		}

		Future<Iterable<Object>> childrenFuturesIterable = sequence(childrenResponseList, gridActor.getContext().system().dispatcher());
		Iterable<Object> childrenResponsesIterable = Await.result(childrenFuturesIterable, Duration.create((GridArchitectConfiguration.childrenResponseTime), TimeUnit.MILLISECONDS)); // childrenResponsesIterableTimeOut		
		
		gridActor.answerListReceived = new ArrayList<BasicAnswer>();
		for (Object iteratorResponses : childrenResponsesIterable)
		{
			BasicAnswer receivedAnswer = (BasicAnswer) iteratorResponses;
			
			gridActor.answerListReceived.add(receivedAnswer);			

			// if multiple levels of hierarchie exist all actors will be included in the list 
			/*
			for (ActorRef actor : receivedAnswer.upstreamActorTrace)
			{
				gridActor.upStreamTrace.add(actor);
			}
			*/			
		}
	}
}
