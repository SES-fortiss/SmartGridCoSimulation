/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package georg.models;

import akka.basicMessages.AnswerContent;

/**
 * 
 * This is a specific AnswerContent
 * 
 * @author bytschkow
 *
 */

public class GeorgAnswerContent implements AnswerContent{
	
	public double currentPower;
 
	public GeorgAnswerContent() {
	}
	
	public String toString(){
		return ("currentPower: " + currentPower + 
				"}");
	}

	public boolean simpleEquals(Object o) {
		return false;
	}
}
