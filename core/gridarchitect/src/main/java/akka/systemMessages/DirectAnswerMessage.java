/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemMessages;

import java.util.List;

import scala.Serializable;
import akka.actor.ActorRef;
import akka.basicMessages.BasicAnswer;

/**
* Created with IntelliJ IDEA.
* User: amack
* Date: 6/14/13
* Time: 9:29 AM
* To change this template use File | Settings | File Templates.
*/
@SuppressWarnings("serial")
public class DirectAnswerMessage implements Serializable {
    public final int timeStep;
    public final List<ActorRef> actorTrace;
    public final double power;
    public BasicAnswer basicAnswer;
        
    public DirectAnswerMessage (int timeStep, List<ActorRef> actorTrace, double power) {
    	this.timeStep = timeStep; 
    	this.actorTrace = actorTrace;
    	this.power = power;
    	this.basicAnswer = null;
    }

    @Override
    public String toString() {
        return String.format("timeStep:[%s], actorTrace:[%s], power:[%s]", timeStep, actorTrace, power);
    }
}
