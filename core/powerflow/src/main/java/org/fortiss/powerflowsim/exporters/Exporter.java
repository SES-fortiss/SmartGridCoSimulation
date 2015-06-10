/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.exporters;

import org.apache.log4j.Logger;

/**
 * 
 * @author murphy
 *
 */
public class Exporter {
	
	protected boolean swingSet = false;
	protected String swingNodeName = "";
	protected static Logger log = Logger.getRootLogger();
	
	/**
	 * Getters and Setters
	 */
	public String getSwingNodeName() {
		return swingNodeName;
	}
	
	public void setSwingNodeName(String swingNodeName) {
		this.swingNodeName = swingNodeName;
	}
	
}
