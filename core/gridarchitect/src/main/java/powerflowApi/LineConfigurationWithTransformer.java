/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package powerflowApi;


/**
 * This class represents a transformer connection. It has all the values as a line plus the ratio value. 
 * The ratio is used for the calculation of the admittance matrix.
 * 
 * @author denis
 *
 */
public class LineConfigurationWithTransformer extends LineConfiguration {
	
	private double ratio;

	public LineConfigurationWithTransformer(double R, double X, double ratio) {
		super(R, X);
		this.ratio = ratio;
	}
	
	public double getRatio(){return ratio;}

}
