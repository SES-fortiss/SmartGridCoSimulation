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
 * This class allows the specification of a three phased line configuration 
 * to create adapted power flow models. 
 * <p>The following properties are available:<br>
 * The series resistance <b>R1/R2/R3</b> (in OHM) or <b>normR1/...</b> (in OHM per KM).<br>
 * The series reactance <b>X1/...</b> (in OHM) or <b>normX1/...</b> (in OHM per KM).<br> 
 * The shunt susceptance <b>B1/...</b> (in SIEMENS) or <b>normB1/...</b> (in SIEMENS per KM).<br>
 * Additionally, the length property can be set to define the length of the line
 * </p>
 * 
 * @author Denis Bytschkow
 *
 */
public class ThreePhaseLineConfiguration {
	
	// Matrix ROW i.e. normR1 is the first row, etc.
	// The values represent normalized Impedances in OHMs per KILOMETER
	
	public double[] normR1 = {0,0,0};
	public double[] normR2 = {0,0,0};
	public double[] normR3 = {0,0,0};
	
	public double[] normX1 = {0,0,0};
	public double[] normX2 = {0,0,0};
	public double[] normX3 = {0,0,0};
	
	// in micro Siemens per KILOMETER
	public double[] normB1 = {0,0,0};
	public double[] normB2 = {0,0,0};
	public double[] normB3 = {0,0,0};
	
	// calculated values in ohms (not normalized)
	
	public double[] R1 = {0,0,0};
	public double[] R2 = {0,0,0};
	public double[] R3 = {0,0,0};
	
	public double[] X1 = {0,0,0};
	public double[] X2 = {0,0,0};
	public double[] X3 = {0,0,0};
		
	// in micro Siemens
	public double[] B1 = {0,0,0};
	public double[] B2 = {0,0,0};
	public double[] B3 = {0,0,0};
	
	// length represent the length of the line in METER
	public double length = 1000;

	// Constructor with parameter
	public ThreePhaseLineConfiguration(double length) {
		setLength(length);		
	}
	
	/**
	 * Constructor with a default length (1000m and all line parameters set to 0)
	 */
	public ThreePhaseLineConfiguration() {}
	
	private double[] scale(double[] in){
		double [] result = {0,0,0};
		result[0] = in[0] / 1000 * length;
		result[1] = in[1] / 1000 * length;
		result[2] = in[2] / 1000 * length;
		return result;
	}
	
	private double[] normalize(double[] in){
		double [] result = {0,0,0};
		result[0] = in[0] * 1000 / length;
		result[1] = in[1] * 1000 / length;
		result[2] = in[2] * 1000 / length;
		return result;
	}
	
	public void setNormR1(double r11, double r12, double r13){
		normR1[0] = r11; normR1[1] = r12; normR1[2] = r13;
		R1 = scale(normR1);
	}
	
	public void setR1(double r11, double r12, double r13){
		R1[0] = r11; R1[1] = r12; R1[2] = r13;
		normR1 = normalize(R1);
	}
	
	public void setNormR2(double r21, double r22, double r23){
		normR2[0] = r21; normR2[1] = r22; normR2[2] = r23;
		R2 = scale(normR2);
	}
	
	public void setR2(double r21, double r22, double r23){
		R2[0] = r21; R2[1] = r22; R2[2] = r23;
		normR2 = normalize(R2);
	}
	
	public void setNormR3(double r31, double r32, double r33){
		normR3[0] = r31; normR3[1] = r32; normR3[2] = r33;
		R3 = scale(normR3);
	}
	
	public void setR3(double r31, double r32, double r33){
		R3[0] = r31; R3[1] = r32; R3[2] = r33;
		normR3 = normalize(R3);
	}
	
	public void setNormX1(double x11, double x12, double x13){
		normX1[0] = x11; normX1[1] = x12; normX1[2] = x13;
		X1 = scale(normX1);
	}

	public void setX1(double x11, double x12, double x13){
		X1[0] = x11; X1[1] = x12; X1[2] = x13;
		normX1 = normalize(X1);
	}
	
	public void setNormX2(double x21, double x22, double x23){
		normX2[0] = x21; normX2[1] = x22; normX2[2] = x23;
		X2 = scale(normX2);
	}
	
	public void setX2(double x21, double x22, double x23){
		X2[0] = x21; X2[1] = x22; X2[2] = x23;
		normX2 = normalize(X2);
	}
	
	public void setNormX3(double x31, double x32, double x33){
		normX3[0] = x31; normX3[1] = x32; normX3[2] = x33;
		X3 = scale(normX3);
	}
	
	public void setX3(double x31, double x32, double x33){
		X3[0] = x31; X3[1] = x32; X3[2] = x33;
		normX3 = normalize(X3);
	}
	
	public void setNormB1(double b11, double b12, double b13){
		normB1[0] = b11; normB1[1] = b12; normB1[2] = b13;
		B1 = scale(normB1);
	}
	
	public void setB1(double b11, double b12, double b13){
		B1[0] = b11; B1[1] = b12; B1[2] = b13;
		normB1 = normalize(B1);
	}
	
	public void setNormB2(double b21, double b22, double b23){
		normB2[0] = b21; normB2[1] = b22; normB2[2] = b23;
		B2 = scale(normB2);
	}
	
	public void setB2(double b21, double b22, double b23){
		B2[0] = b21; B2[1] = b22; B2[2] = b23;
		normB2 = normalize(B2);
	}
	
	public void setNormB3(double b31, double b32, double b33){
		normB3[0] = b31; normB3[1] = b32; normB3[2] = b33;
		B3 = scale(normB3);
	}
	
	public void setB3(double b31, double b32, double b33){
		B3[0] = b31; B3[1] = b32; B3[2] = b33;
		normB3 = normalize(B3);
	}
	
	/**
	 * This changes the desired length and recalculates Impedances 
	 * based on the normalized values
	 */
	public void setLength (double l){
		this.length = l;
		R1 = scale(normR1);
		R2 = scale(normR2);
		R3 = scale(normR3);
		X1 = scale(normX1);
		X2 = scale(normX2);
		X3 = scale(normX3);
		B1 = scale(normB1);
		B2 = scale(normB2);
		B3 = scale(normB3);
	}
	
	public double[] getR1(){return R1;}
	public double[] getR2(){return R2;}
	public double[] getR3(){return R3;}
	public double[] getX1(){return X1;}
	public double[] getX2(){return X2;}
	public double[] getX3(){return X3;}
	public double[] getB1(){return B1;}
	public double[] getB2(){return B2;}
	public double[] getB3(){return B3;}
}
