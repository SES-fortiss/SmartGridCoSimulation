/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.advancedMessages;

import akka.basicMessages.RequestContent;

/**
 * {@link SingleReceiverRequestContent} is only send to one specified actor
 * 
 * @author Luc
 *
 */
public abstract class SingleReceiverRequestContent implements RequestContent {

	public String recieverPath;

	@Override
	public String toString() {
		String res = super.toString();

		String tmp = "Reciever " + recieverPath + " ";

		return tmp + res;
	}
}
