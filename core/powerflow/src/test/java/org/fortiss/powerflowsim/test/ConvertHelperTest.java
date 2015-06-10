/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.test;

import org.fortiss.powerflowsim.simulation.internal.ConvertHelper;
import org.jblas.ComplexDoubleMatrix;
import org.jblas.DoubleMatrix;
import org.junit.Test;

import cern.colt.matrix.tdcomplex.DComplexFactory2D;
import cern.colt.matrix.tdcomplex.DComplexMatrix2D;

/**
 * This tests the ConvertHelper
 * 
 * @author Denis Bytschkow
 *
 */
public class ConvertHelperTest {
	
	@Test
	public void convertFromCERNmethodTest(){		
		DComplexMatrix2D input = DComplexFactory2D.dense.random(2, 2);
		ComplexDoubleMatrix output = ConvertHelper.convertFromCERN(input);
		
		System.out.println("CERN");
		System.out.println(input);
		
		System.out.println("JBLAS");
		System.out.println(output);
	}
	
	@Test
	public void convertFromJBLASmethodTest(){
		
		double[][] realData = new double[2][2];
		double[][] imagData = new double[2][2];
		
		for (int i = 0; i < imagData.length; i++) {
			for (int j = 0; j < imagData[0].length; j++) {
				realData[i][j] = i + 2*j + 0.1;
				imagData[i][j] = i + 2*j + 0.1;
			}
		}
		
		DoubleMatrix input1 = new DoubleMatrix(realData);
		DoubleMatrix input2 = new DoubleMatrix(imagData);
		ComplexDoubleMatrix input = new ComplexDoubleMatrix(input1, input2);
		
		DComplexMatrix2D output = ConvertHelper.convertFromJBLAS(input);
		
		System.out.println("JBLAS");
		System.out.println(input);
		
		System.out.println("CERN");
		System.out.println(output);
		
	}
	
	@Test
	public void check(){
		DComplexMatrix2D input = DComplexFactory2D.dense.random(2, 2);
		ComplexDoubleMatrix output = ConvertHelper.convertFromCERN(input);
		DComplexMatrix2D check = ConvertHelper.convertFromJBLAS(output);
		
		System.out.println(input);
		System.out.println(output);
		System.out.println(check);
	}
	
	@Test
	public void testMultiplication(){
		
		DComplexMatrix2D input1 = DComplexFactory2D.dense.random(2, 2);
		DComplexMatrix2D input2 = DComplexFactory2D.dense.random(2, 2);
		
		DComplexMatrix2D resultCERN = input1.zMult(input2, null);
		
		System.out.println(input1);
		System.out.println(input2);
		System.out.println(resultCERN);
		
		ComplexDoubleMatrix jblas1 = ConvertHelper.convertFromCERN(input1);
		ComplexDoubleMatrix jblas2 = ConvertHelper.convertFromCERN(input2);
		ComplexDoubleMatrix jblas = jblas1.mmul(jblas2);
		
		System.out.println(jblas1);
		System.out.println(jblas2);
		System.out.println(jblas);
		System.out.println(ConvertHelper.convertFromJBLAS(jblas));
		
	}

	private ComplexDoubleMatrix createJBLAS(){
		
		// ComplexDoubleMatrix zuerst die reihe, dann zeile + 1
		
		double[][] realData = new double[2][2];
		double[][] imagData = new double[2][2];
		
		for (int i = 0; i < imagData.length; i++) {
			for (int j = 0; j < imagData[0].length; j++) {
				realData[i][j] = i + 2*j;
				imagData[i][j] = i + 2*j;
			}
		}
		
		DoubleMatrix input1 = new DoubleMatrix(realData);
		DoubleMatrix input2 = new DoubleMatrix(imagData);
		ComplexDoubleMatrix input = new ComplexDoubleMatrix(input1, input2);
		
		return input;		
	}
	
	@Test
	public void testMulJBLAS(){
		ComplexDoubleMatrix i = createJBLAS();
		ComplexDoubleMatrix j = createJBLAS();				
		
		ComplexDoubleMatrix k = j.mmul(i);
		System.out.println(i);
		System.out.println(ConvertHelper.convertFromJBLAS(i));
		System.out.println(j);
		System.out.println(ConvertHelper.convertFromJBLAS(j));
		System.out.println(k);
		System.out.println(ConvertHelper.convertFromJBLAS(k));
		
		// result seems correct
	}
	
	@Test
	public void testMulCERN(){
		DComplexMatrix2D i = ConvertHelper.convertFromJBLAS(createJBLAS());
		DComplexMatrix2D j = ConvertHelper.convertFromJBLAS(createJBLAS());
		DComplexMatrix2D k = j.zMult(i, null);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		// result seems correct
	}
	
}
