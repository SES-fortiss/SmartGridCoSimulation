/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package faultStrategy;

import akka.basicMessages.AnswerContent;

public class TestAnswer2 implements AnswerContent {
	public String answer;
	
	public TestAnswer2() {
		answer = null;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof TestAnswer2)
		{
			TestAnswer2 t = (TestAnswer2) o;

			return this.answer.equals(t.answer);
		}
		else
			return false;
	}

	@Override
	public String toString() {
		return "TestAnswer2: " + answer;
	}
}

