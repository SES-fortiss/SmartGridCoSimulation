/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.advancedMessages;

import akka.ErrorType;
import akka.basicActors.BasicActor;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;

/**
 * ErrorAnswerContent is an abstract implementation of a fault. Every fault needs to extend this class
 * @author Luc
 *
 */
public abstract class ErrorAnswerContent implements AnswerContent{
	
	private RequestContent request;
	private String sender;
	private BasicActor reciever;
	private AnswerContent answerContent;
	private BasicAnswer basicAnswer;
	
	protected ErrorType error;
	/**
	 * abstract Constructur
	 * @param request the request that triggered the answer
	 * @param basicAnswer the answer that is faulty
	 * @param sender the sender of the basicAnswer 
	 * @param reciever the receiver of the basicAnswer
	 * @param error the type of fault that should be simulated
	 */
	public ErrorAnswerContent(RequestContent request, BasicAnswer basicAnswer, String sender,BasicActor reciever,ErrorType error)
	{
		this.setRequest(request);
		
		this.setSender(sender);
		this.setReciever(reciever);
		this.setErrorType(error);
		this.setAnswerContent(basicAnswer.answerContent);
		this.setBasicAnswer(basicAnswer);
	}
	/**
	 * abstract Constructur
	 * @param answer the answer that is faulty
	 * @param error the type of fault that should be simulated
	 */
	public ErrorAnswerContent(AnswerContent answer,ErrorType error)
	{
		this.setErrorType(error);
		this.setAnswerContent(answer);
	}
	/**
	 * get the sender of the faulty answer
	 * @return the fullActorPath of the sender
	 */
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public ErrorType getErrorType() {
		return error;
	}

	public void setErrorType(ErrorType errortype) {
		this.error = errortype;
	}

	public BasicActor getReciever() {
		return reciever;
	}

	public void setReciever(BasicActor reciever) {
		this.reciever = reciever;
	}

	public RequestContent getRequest() {
		return request;
	}

	public void setRequest(RequestContent request) {
		this.request = request;
	}

	public AnswerContent getAnswerContent() {
		return answerContent;
	}

	public void setAnswerContent(AnswerContent answer) {
		this.answerContent = answer;
	}
	
	public BasicAnswer getBasicAnswer() {
		return basicAnswer;
	}

	public void setBasicAnswer(BasicAnswer answer) {
		this.basicAnswer = answer;
	}
	
	@Override
	public String toString()
	{
		String res;
		
		res = "ErrorAnswerContent : { ";
		if (request instanceof MultiRequestContainer)
		{
			MultiRequestContainer tmp = (MultiRequestContainer)this.request;
			if (!tmp.isEmpty())
				res +="Request  [["+tmp.getCurrentRequestContent()+"]] ,";
			else
				res+="Request  [["+tmp+"]] ,";
		}
		else
			res +="Request  [["+this.request+"]] ,";
		res +="Sender "+this.sender+" ,";
		if (reciever !=null)
			res +="Reciever "+this.reciever.actorOptions.behaviorModel.actorName+" ,";
		else
			res +=" Reciever null"+" ,";
		if (answerContent !=null)
			res +="answerContent "+this.answerContent+" ,";
		else
			res +=" answerContent null"+" ,";
		res +="ErrorType "+this.error;
		res+=" }";
		return res;
	}
	
	@Override
	public boolean equals(Object o)
	{
		boolean res = true;
		
		if (o instanceof ErrorAnswerContent)
		{
			ErrorAnswerContent other = (ErrorAnswerContent) o;
			
			if (answerContent != null)
				res = res && answerContent.equals(other.answerContent);
			else
				res = res && ( answerContent == other.answerContent);
			
			if (sender != null)
				res = res && sender.equals(other.sender);
			else
				res = res && ( sender == other.sender);
			
			if (reciever != null)
				res = res && reciever.equals(other.reciever);
			else
				res = res && ( reciever == other.reciever);
			
			if (request != null)
				res = res && request.equals(other.request);
			else
				res = res && ( request == other.request);
			if (error != null)
				res = res && error.equals(other.error);
			else
				res = res && ( error == other.error);
		}
		else
			res = false;
		
		return res;
	}
}
