/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.simulation.helper;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.jblas.ComplexDouble;
import org.jblas.ComplexDoubleMatrix;
import org.jblas.DoubleMatrix;

import cern.colt.matrix.tdcomplex.DComplexFactory2D;
import cern.colt.matrix.tdcomplex.DComplexMatrix1D;
import cern.colt.matrix.tdcomplex.DComplexMatrix2D;
import cern.colt.matrix.tdouble.DoubleMatrix2D;

/**
 * This class supports the conversion of CERN Matrices to JBLAS
 * Matrices and vice versa to speed up the calculation
 * 
 * @author Denis Bytschkow
 *
 */
public class ConvertHelper {
	
	private final static Logger log = LogManager.getLogger(ConvertHelper.class );
	
	public static ComplexDoubleMatrix convertFromCERN(DComplexMatrix2D input){		
		// the first version will not be optimized
		
		DoubleMatrix2D real = input.getRealPart();
		DoubleMatrix2D imag = input.getImaginaryPart();		
		
		double[][] realData;
		double[][] imagData;
		
		realData = real.toArray();
		imagData = imag.toArray();
		
		DoubleMatrix realJBLAS = new DoubleMatrix(realData);
		DoubleMatrix imagJBLAS = new DoubleMatrix(imagData);
		
		ComplexDoubleMatrix result = new ComplexDoubleMatrix(realJBLAS, imagJBLAS);				
		return result;
	}
	
	public static ComplexDoubleMatrix convertFromCERN(DComplexMatrix1D input){
		// previous solution only as reminder 
		// log.setLevel(Level.OFF);
		Configurator.setLevel(log.getName(), Level.OFF);

		log.debug("\nInput: " + input);
		double[] inputData = input.toArray();
		DComplexMatrix2D matrix = DComplexFactory2D.dense.make(inputData.length/2, 1, inputData);
		ComplexDoubleMatrix output = convertFromCERN(matrix);
		log.debug("\nOutput: "+ output);
		return output;
	}
	
	public static DComplexMatrix2D convertFromJBLAS(ComplexDoubleMatrix input){
		
		ComplexDouble[][] data;		
		data = input.toArray2();		
		
		int n = data.length;
		int m = data[0].length;
		
		double[][] mytestData = new double[n][2*m];
		
		
		DComplexMatrix2D result = DComplexFactory2D.dense.make(n, m);		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mytestData[i][2*j] = data[i][j].real();
				mytestData[i][2*j+1] = data[i][j].imag();
			}
		}

		result.assign(mytestData);
		return result;
	}
}
