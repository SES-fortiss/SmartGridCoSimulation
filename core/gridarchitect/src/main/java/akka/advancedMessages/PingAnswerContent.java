/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.advancedMessages;

import akka.basicMessages.AnswerContent;
import behavior.BehaviorModel;

/**
 * PingAnswerContent
 * 
 * @author Luc
 *
 */
public class PingAnswerContent implements AnswerContent {

	private BehaviorModel sender;

	/**
	 * creates a new {@link PingAnswerContent}
	 * 
	 * @param sender
	 *            the sender of this answer
	 */
	public PingAnswerContent(BehaviorModel sender) {
		this.sender = sender;
	}

	public PingAnswerContent() {
		this.sender = null;
	}

	public BehaviorModel getSender() {
		return sender;
	}

	@Override
	public String toString() {
		String res = "PingAnswerContent";
		if (sender != null)
		{
			res += " Sender " + sender.fullActorPath;
		}
		return res;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof PingAnswerContent)
		{
			PingAnswerContent tmp = (PingAnswerContent) o;

			if (sender != null)
				return this.sender.equals(tmp.getSender());
			else
				return (sender == tmp.getSender());
		}
		else
			return false;
	}
}
