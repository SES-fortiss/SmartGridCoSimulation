/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package faultStrategy;


import akka.advancedMessages.ErrorAnswerContent;
import akka.basicActors.BasicActor;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;

public class TestErrorNoAnswerContent extends ErrorAnswerContent{

	public TestErrorNoAnswerContent(AnswerContent answer) {
		super(answer, null);
	}
	
	public TestErrorNoAnswerContent(RequestContent request, BasicAnswer basicAnswer, String sender,BasicActor reciever)
	{
		super(request, basicAnswer, sender, reciever, null);
	}
}
