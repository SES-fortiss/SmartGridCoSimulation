/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package behavior;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

public class InactiveBehaviorModel extends BehaviorModel {

	@Override
	public void makeDecision() {
	}
	
	@Override
	public void handleRequest() {
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return null;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}

}
