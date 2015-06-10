/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package resultLogger.utils;

import akka.basicMessages.AnswerContent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public interface AnswerContent_LoggerInterface {
	
	public Element convertAnswerToXML(AnswerContent answer, Document doc);
	
	public String getResultFileName();
}
