/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemMessages;

/**
* Created with IntelliJ IDEA.
* User: amack
* Date: 6/13/13
* Time: 11:53 AM
* To change this template use File | Settings | File Templates.
*/
public class TimeStepMessage {
    public int timeStep;
    public TimeStepMessage(int timeStep) {this.timeStep = timeStep;}

    @Override
    public String toString() {
        return String.format("timeStep:[%s]", timeStep);
    }
}
