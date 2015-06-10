/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package faultStrategy;

import akka.basicMessages.RequestContent;

public class TestRequest1 implements RequestContent {
	public String value;
	
	/*public TestRequest1() {
		value = null;
	}*/
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof TestRequest1)
		{
			TestRequest1 t = (TestRequest1) o;

			return value.equals(t.value);
		}
		else
			return false;
	}

	@Override
	public String toString() {
		return "TestRequest1: " + value;
	}
}

