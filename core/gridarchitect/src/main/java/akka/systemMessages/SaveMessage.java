/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemMessages;

import akka.basicMessages.AnswerContent;

/**
* Created with IntelliJ IDEA.
* User: amack
* Date: 15.10.13
* Time: 14:35
* To change this template use File | Settings | File Templates.
*/
public class SaveMessage {
    public final int timeStep;
    public final String actorPath;
    public final AnswerContent answerContent;
    
    public SaveMessage(int timeStep, String actorPath, AnswerContent answerContent) {
        this.timeStep = timeStep;
        this.actorPath = actorPath;
        this.answerContent = answerContent;
    }
}
