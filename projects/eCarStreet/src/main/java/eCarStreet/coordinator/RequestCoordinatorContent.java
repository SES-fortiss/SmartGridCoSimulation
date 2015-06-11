/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.coordinator;

import akka.basicMessages.RequestContent;

/**
 * @author Denis Bytschkow
 *
 */
public class RequestCoordinatorContent implements RequestContent{
	
	public double carLoad;
	public double totalLoadRemaining;
	
	public boolean optimizeLine = false;

}
