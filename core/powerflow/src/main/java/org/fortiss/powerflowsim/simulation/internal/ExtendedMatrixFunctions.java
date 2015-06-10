/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.simulation.internal;

import org.jblas.ComplexDouble;
import org.jblas.ComplexDoubleMatrix;
import org.jblas.DoubleMatrix;
import org.jblas.MatrixFunctions;

/**
 * 
 * @author murphy
 *
 */
public class ExtendedMatrixFunctions extends MatrixFunctions {
	public static DoubleMatrix abs(ComplexDoubleMatrix x) {
		DoubleMatrix result = new DoubleMatrix(x.length);
		for (int i = 0; i < x.length; i++)
			result.put(i, x.get(i).abs());
		return result;
	}

	public static DoubleMatrix arg(ComplexDoubleMatrix x) {
		DoubleMatrix result = new DoubleMatrix(x.length);
		for (int i = 0; i < x.length; i++)
			result.put(i, x.get(i).arg());
		return result;
	}

	public static ComplexDoubleMatrix polar(DoubleMatrix abs, DoubleMatrix arg) {
		if (abs.length != arg.length) {
			return null;
		}
		
		ComplexDoubleMatrix result = new ComplexDoubleMatrix(abs.length);
		
		for (int i = 0; i < abs.length; i++) {
			ComplexDouble value = new ComplexDouble(abs.get(i) * Math.cos(arg.get(i)), abs.get(i) * Math.sin(arg.get(i)));
			result.put(i, value);
		}
		return result;

	}
}
