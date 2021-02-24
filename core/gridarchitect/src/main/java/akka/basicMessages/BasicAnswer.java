/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.basicMessages;

import java.util.List;

import akka.actor.ActorRef;

/**
* Created with IntelliJ IDEA.
* User: amack
* Date: 6/14/13
* Time: 9:29 AM
* To change this template use File | Settings | File Templates.
*/
public class BasicAnswer {
    
	public final int timeStep;
    public final List<ActorRef> upstreamActorTrace;
    public final String senderPath;
    public final AnswerContent answerContent;

    /**
     * Constructor
     * 
     * @param timeStep - currentTimeStep
     * @param actorTrace - 
     * @param sane
     * @param overrideReportToParent
     * @param senderPath
     * @param answerContent
     */
    public BasicAnswer(int timeStep, 
    		List<ActorRef> upstreamActorTrace, 
    		String senderPath, 
    		AnswerContent answerContent) {
    	
        this.timeStep = timeStep;
        this.upstreamActorTrace = upstreamActorTrace;
        this.senderPath = senderPath;
        this.answerContent = answerContent;
    }

    @Override
    public String toString() {
        return "BasicAnswer{" +
                "timeStep=" + timeStep +
                ", actorTrace=" + upstreamActorTrace +
                ", senderPath='" + senderPath + '\'' +
                ", behaviorMessage='" + answerContent + '\'' +
                '}';
    }

}
