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

import akka.actor.ActorRef;

/**
* Created with IntelliJ IDEA.
* User: amack
* Date: 6/17/13
* Time: 2:37 PM
* To change this template use File | Settings | File Templates.
*/
public class DirectMessage {
    public final int timeStep;
    public final List<ActorRef> actorTrace;
    public DirectMessage(int timeStep, List<ActorRef> actorTrace) {this.timeStep = timeStep; this.actorTrace = actorTrace;}

}
