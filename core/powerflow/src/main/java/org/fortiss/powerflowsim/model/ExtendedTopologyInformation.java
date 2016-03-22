/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package org.fortiss.powerflowsim.model;


/**
 * This class is used to help with modeling additional information that is required
 * to build a correct and complete power flow models, as we currently miss some
 * properties from the CIM Model.
 * 
 * @author denis
 *
 */
public class ExtendedTopologyInformation {
	
	private double b_shunt = 0;
	
	private double TansformerRatio = 1;
	
	public ExtendedTopologyInformation(){}

	public double getB_shunt() {
		return b_shunt;
	}

	public void setB_shunt(double b_shunt) {
		this.b_shunt = b_shunt;
	}

	public double getTansformerRatio() {
		return TansformerRatio;
	}

	public void setTansformerRatio(double tansformerRatio) {
		TansformerRatio = tansformerRatio;
	}
	

}
