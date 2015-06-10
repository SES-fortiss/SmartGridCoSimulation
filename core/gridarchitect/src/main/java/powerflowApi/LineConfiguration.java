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
 * This class allows the specification of a line configuration to create adapted
 * power flow models. The class can be extended if required to create more
 * dedicated line configurations, e.g. for three phase systems, or including
 * shunt parameters
 * 
 * @author Denis Bytschkow
 *
 */
public class LineConfiguration {

	public double R;
	public double X;

	/**
	 * The impedance Z = R + jX. The admittance is the inverse of the impedance.
	 * For further information look in the literature.
	 * 
	 * @param R
	 *            that is the series resistance of the line
	 * @param X
	 *            that is the series reactance of the line
	 */
	public LineConfiguration(double R, double X) {
		this.R = R;
		this.X = X;
	}
}
