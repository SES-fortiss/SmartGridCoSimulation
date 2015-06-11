/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package smartMeterExample.message;

import akka.basicMessages.AnswerContent;

/**
 * Smart Meter AnswerContent
 * 
 * @author bytschkow
 * 
 */
public class SmartMeterAnswer implements AnswerContent  {
	public int size;
}
