/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package org.fortiss.powerflowsim.simulation.internal;

import java.util.Arrays;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.fortiss.powerflowsim.simulation.helper.ExtendedMatrixFunctions;
import org.jblas.ComplexDoubleMatrix;
import org.jblas.DoubleMatrix;
import org.jblas.Solve;

/**
 * This class is the main class for the Newton-Raphson implementation.
 * It follows the approach described in <a href="home.eng.iastate.edu/~jdm/ee553/PowerFlow.doc" > Power Flow Doc from Iowa State University</a>
 */
public class NewtonExplicit {
	
	private static Logger log  = Logger.getLogger(NewtonExplicit.class);
	private static int maxIterationSteps = 10;
	private static double tolerance = 1e-6;
	
	private static ComplexDoubleMatrix admittanceMatrix = null;
	private static DoubleMatrix realAdmittance = null;
	private static DoubleMatrix imagAdmittance = null;
	
	private static int[] pIndices = null;
	private static int[] qIndices = null;
	private static int[] angleIndices = null;
	private static int[] voltageIndices = null;
	
	private static int n_dPower = 0;
	private static int n_dQ = 0;
	private static int n_dAngles = 0;
	private static int n_dVoltages = 0;	
	
	private static boolean init = false;

	public static ComplexDoubleMatrix newtonIterations(boolean converged,			
			int[] pvIndices, int[] pqIndices, int[] pvpqIndices,
			ComplexDoubleMatrix sPowerInjectionVector,
			ComplexDoubleMatrix voltVector, ComplexDoubleMatrix yMatrix) {		
		
		log.setLevel(Level.INFO);
		log.debug("enter newtonIterations() method\n");		
		log.debug("Initial voltages: " + voltVector);
		
		if (init == false) {
			// Everything that relates to the admittance Matrix
			admittanceMatrix = yMatrix;
			realAdmittance = admittanceMatrix.real();
			imagAdmittance = admittanceMatrix.imag();
			
			log.debug("realAdmittance - size " +realAdmittance.columns+"x"+ realAdmittance.rows+ ": " + realAdmittance);
			log.debug("imagAdmittance - size " +imagAdmittance.columns+"x"+ imagAdmittance.rows+ ": " + imagAdmittance);
			
			/*
			 * Actually, p and angle indices are the same, from the mathematical point of view.
			 * We separate them here for maintainability, as they have a slightly different background.
			 * p-indices represent the known power values --> pv and pq nodes.
			 * Angle-indices represent the not known angles of pv and pq nodes.
			 * The same argumentation is true for "q" and "voltages".
			 */
			
			pIndices = pvpqIndices;
			qIndices = pqIndices;
			angleIndices = pvpqIndices; 	// Winkel werden für alle PV und PQ benötigt
			voltageIndices = pqIndices; 	// Spannungen werden für alle PQ benötigt.
			
			// die Indices werden für die einzelnen JacobiAnteile benötigt
			
			n_dPower = pIndices.length; 			// Anzahl der P's (im Zähler der JacobiMatrix)
			n_dQ = qIndices.length; 				// Anzahl der Q's (im Zähler)		
			n_dAngles = angleIndices.length; 		// Anzahl der Winkel (im Nenner)
			n_dVoltages = voltageIndices.length;	// Anzahl der V (im Nenner)		
			
		}
		
		ComplexDoubleMatrix result = null;
		
		// Everything that relates to the expected result
		log.debug("PV Indices: " + Arrays.toString(pvIndices));
		log.debug("PQ Indices: " + Arrays.toString(pqIndices));
		log.trace("PVPQ Indices: " + Arrays.toString(pvpqIndices));
		
		// SolutionVector i.e. non know values
		DoubleMatrix voltMagnitude = ExtendedMatrixFunctions.abs(voltVector);
		DoubleMatrix voltAngles = ExtendedMatrixFunctions.arg(voltVector);		
		
		/*
		 * Calculate JACOBI this will be a large matrix
		 *  
		 * We need to calculate the expected vector that contains all active power of PV nodes,
		 * all active power of PQ nodes, and all reactive power of PQ nodes.
		 * Hence, the size of the matrix will be (PV + PQ + PQ) x (PV + PQ + PQ). 
		 */		
		for (int iteration = 0; iteration < maxIterationSteps; iteration++) {
			
			log.debug("Voltvector: " + voltVector);
			
			ComplexDoubleMatrix powerCalculated = Solver.calculate_power(admittanceMatrix, voltVector);
			ComplexDoubleMatrix differenceComplex = powerCalculated.sub(sPowerInjectionVector);
			
			DoubleMatrix requiredP = differenceComplex.real().get(pvpqIndices);
			DoubleMatrix requiredQ = differenceComplex.imag().get(pqIndices);
			DoubleMatrix powerDifference = DoubleMatrix.concatVertically(requiredP, requiredQ);
			log.debug("difference in P and Q: "+ powerDifference);
			
			double diff = powerDifference.norm2();
			
			log.debug("iteration: " + iteration);
			log.debug("voltageUsed: " + voltVector);
			log.debug("powerCalculated: " + powerCalculated);
			log.debug("diff: "+ diff);
			
			if (diff < tolerance) {
				log.debug("return at iteration: "+ iteration);
				log.debug("voltageVector: " + voltVector);
				return voltVector;
			}
					
			/*
			 *  rechne die Anteile der Matrix
			 *  --> J11, J12, J21, J22 
			 *  getestet durch sysouts und vergleiche
			 */
			DoubleMatrix J11 = calculateJ11(voltMagnitude, voltAngles);		
			DoubleMatrix J12 = calculateJ12(voltMagnitude, voltAngles);				
			DoubleMatrix J21 = calculateJ21(voltMagnitude, voltAngles);
			DoubleMatrix J22 = calculateJ22(voltMagnitude, voltAngles);		
			
			DoubleMatrix J1 = DoubleMatrix.concatHorizontally(J11, J12);
			log.debug("J1:" + J1);
			DoubleMatrix J2 = DoubleMatrix.concatHorizontally(J21, J22);
			log.debug("J2:" + J2);					
			DoubleMatrix jacobian = DoubleMatrix.concatVertically(J1, J2);
			log.debug("jacobian:" + jacobian);
					
			DoubleMatrix deltaVector = Solve.solve(jacobian, powerDifference).neg();
			
			double lenghtDeltaX = deltaVector.norm2();
			
			log.debug("deltaX: " + deltaVector);
			log.debug("Length: " + lenghtDeltaX);
			
			
			if (lenghtDeltaX >= 1) {
				deltaVector = deltaVector.div(lenghtDeltaX*2);
			}			

			// update voltageVector
			// zuerst winkel, dann die Spannungen
			double radDegreeFactor = 360.0 / 2 / 3.141526;
			double winkelTolerance = 30;
			double limitAngle = winkelTolerance / radDegreeFactor;
			
			for (int l = 0; l < angleIndices.length; l++) {
				double newAngle = voltAngles.get(angleIndices[l]) + deltaVector.get(l);
				
				// winkel auf einen bereich zwischen +30 grad und -30 grad beschränken. Sonst ist das physikalisch nicht sinnvoll.
				if (newAngle < -limitAngle) {newAngle = -limitAngle;}
				if (newAngle > limitAngle) {newAngle = limitAngle;}
				
				voltAngles.put(angleIndices[l], newAngle);
			}
			
			for (int i = 0; i < voltageIndices.length; i++) {
				double deltaVoltage = deltaVector.get(angleIndices.length+i);	 			
				double newVoltage = voltMagnitude.get(voltageIndices[i]) + deltaVoltage;
				
				// Spannung auf einen Bereich zwischen 0.5 und 1.5 beschränken. Sonst ist der Betrieb physikalisch nicht sinnvoll.
				if (newVoltage < 0.5) {newVoltage = 0.5;}
				if (newVoltage > 1.5) {newVoltage = 1.5;}				
				
				voltMagnitude.put(voltageIndices[i], newVoltage);
			}									
						
			log.debug("Neue Werte:");
			log.debug("voltAngles in rad: "+ voltAngles);
			log.debug("voltMagnitude: "+ voltMagnitude);			
			
			voltVector = ExtendedMatrixFunctions.polar(voltMagnitude, voltAngles);
			log.info(voltVector);
		}
		
		log.debug("leave newtonIterations() method");
		return result;
	}

	private static DoubleMatrix calculateJ22(DoubleMatrix voltMagnitude,
			DoubleMatrix voltAngles) {
		DoubleMatrix J22 = DoubleMatrix.zeros(n_dQ, n_dVoltages);
		for (int k = 0; k < n_dQ; k++) {
			for (int j = 0; j < n_dVoltages; j++) {
				int nodeIndexQ = qIndices[k];
				int nodeIndexV = voltageIndices[j];
				
				double voltage = voltMagnitude.get(nodeIndexQ);
				
				// k != j
				if (nodeIndexQ != nodeIndexV) {
					
					double difAngle = voltAngles.get(nodeIndexQ)- voltAngles.get(nodeIndexV);
					double g = realAdmittance.get(nodeIndexQ, nodeIndexV);
					double b = imagAdmittance.get(nodeIndexQ, nodeIndexV);
					double resultBuffer = voltage*(g*Math.sin(difAngle) - b*Math.cos(difAngle));					
					J22.put(k, j, resultBuffer);
					//System.out.println("resultBuffer:" + resultBuffer);
				}
				
				// k==j
				if (nodeIndexQ == nodeIndexV) {
					double B = imagAdmittance.get(nodeIndexQ, nodeIndexV);
					double resultBuffer = -2*B*voltage; // part1, here it differs from the other solver
					
					for (int i = 0; i < realAdmittance.rows; i++) {
						
						if (i != nodeIndexQ) {
							double g = realAdmittance.get(nodeIndexQ, i);
							double b = imagAdmittance.get(nodeIndexQ, i);
							if (g!= 0 || b!= 0) {
								double voltNeighboor = voltMagnitude.get(i);
								double difAngles = voltAngles.get(nodeIndexQ) - voltAngles.get(j);
								resultBuffer += voltNeighboor*(g*Math.sin(difAngles) - b*Math.cos(difAngles) );
							}
						}						
					}
					
					J22.put(k, j, resultBuffer);
				}				
			}
		}
		log.debug("J22 - size: " + J22.columns+"x"+J22.rows+"   " + J22);
		return J22;
	}

	private static DoubleMatrix calculateJ21(DoubleMatrix voltMagnitude, DoubleMatrix voltAngles) {
		DoubleMatrix J21 = DoubleMatrix.zeros(n_dQ, n_dAngles);
		for (int k = 0; k < n_dQ; k++) {
			int nodeIndexQ = qIndices[k];
			for (int j = 0; j < n_dAngles; j++) {
				int nodeIndexAngle = angleIndices[j];
				
				// If k!=j
				if (nodeIndexQ != nodeIndexAngle) {
					double voltK = voltMagnitude.get(nodeIndexQ);
					double voltJ = voltMagnitude.get(nodeIndexAngle);
					
					double G = realAdmittance.get(nodeIndexQ,nodeIndexAngle);
					double B = imagAdmittance.get(nodeIndexQ,nodeIndexAngle);				
					double difAngles = voltAngles.get(nodeIndexQ) - voltAngles.get(nodeIndexAngle);
					double resultBuffer = voltK*voltJ*(B*Math.sin(difAngles)-G*Math.cos(difAngles));				
					J21.put(k,j, resultBuffer);
				} 
				// if k==j
				else {
					double voltK = voltMagnitude.get(nodeIndexQ);					
					double resultBuffer = 0;
					
					// schleife über die ganze AdmittanzMatrix
					for (int i = 0; i < realAdmittance.columns; i++) {						
						if (i != nodeIndexQ) {
							double g = realAdmittance.get(nodeIndexQ, i);
							double b = imagAdmittance.get(nodeIndexQ, i);
							if (g!= 0 || b!= 0) {
								double voltNeighboor = voltMagnitude.get(i);
								double difAngles = voltAngles.get(nodeIndexQ) - voltAngles.get(i);
								resultBuffer += voltNeighboor*(g*Math.cos(difAngles) + b*Math.sin(difAngles) );
							}
						}
					}
					
					resultBuffer = resultBuffer * voltK;
					
					J21.put(k,j, resultBuffer);
				}
			}
		}		
		log.debug("J21 - size: " + J21.columns+"x"+J21.rows+"   " + J21);
		return J21;
	}

	private static DoubleMatrix calculateJ12(DoubleMatrix voltMagnitude,
			DoubleMatrix voltAngles) {
		DoubleMatrix J12 = DoubleMatrix.zeros(n_dPower, n_dVoltages);
		for (int k = 0; k < n_dVoltages; k++) {
			int nodeIndexV = voltageIndices[k];
						
			for (int j = 0; j < n_dPower; j++) {				
				int nodeIndexP = pIndices[j];
				double volt = voltMagnitude.get(nodeIndexP);
				
				// k != j
				if (nodeIndexP != nodeIndexV) {
					double G = realAdmittance.get(nodeIndexP,nodeIndexV);
					double B = imagAdmittance.get(nodeIndexP,nodeIndexV);				
					double difAngles = voltAngles.get(nodeIndexP) - voltAngles.get(nodeIndexV);
					double resultBuffer = volt*(G*Math.cos(difAngles)+B*Math.sin(difAngles));				
					J12.put(j,k,resultBuffer);					
				}
				
				// k==j
				if (nodeIndexP == nodeIndexV) {
					double G = realAdmittance.get(nodeIndexP, nodeIndexV);
					double resultBuffer = 2*G*volt; // part1
					
					// System.out.println("resultBuffer:" + resultBuffer);					
					for (int i = 0; i < realAdmittance.rows; i++) {
						
						if (i != nodeIndexP){
							double g = realAdmittance.get(nodeIndexP, i);
							double b = imagAdmittance.get(nodeIndexP, i);
							if (g!= 0 || b!= 0) {
								double voltNeighboor = voltMagnitude.get(i);
								double difAngles = voltAngles.get(nodeIndexP) - voltAngles.get(i);
								resultBuffer += voltNeighboor*(g*Math.cos(difAngles) + b*Math.sin(difAngles) );
								//System.out.println("resultBuffer:" + resultBuffer);
							}
						}						
					}					
					J12.put(j, k, resultBuffer);
				}
			}
		}
		log.debug("J12 - size: " + J12.columns+"x"+J12.rows+"   " + J12);
		return J12;
	}

	private static DoubleMatrix calculateJ11(DoubleMatrix voltMagnitude,
			DoubleMatrix voltAngles) {
		DoubleMatrix J11 = DoubleMatrix.zeros(n_dPower, n_dAngles);
		for (int k = 0; k < n_dPower ; k++) {
			// for each row
			int nodeIndexP = pIndices[k];					// get the right nodeIndex for Power
			double voltNode = voltMagnitude.get(nodeIndexP);// get the right voltage of the node
			
			for (int j = 0; j < n_dAngles; j++) {
				int nodeIndexAngle = angleIndices[j];				
				//System.out.println("nodeIndexP: " + nodeIndexP +"  nodeIndexAngle: " + nodeIndexAngle);
				
				// diagonal elements
				if (nodeIndexP==nodeIndexAngle){
					double resultBuffer = 0;
					
					for (int i = 0; i < admittanceMatrix.columns; i++) {
						double resultBufferInternal = 0;
						double G = realAdmittance.get(nodeIndexP, i);
						double B = imagAdmittance.get(nodeIndexP, i);					
						
						if (i==nodeIndexP) {G = 0;B = 0;} // because angle difference = 0, derivative = 0
						
						if (G != 0.0 || B!=0.0) {
							double difAngles = voltAngles.get(nodeIndexP) - voltAngles.get(i);							
							resultBufferInternal += -G*Math.sin(difAngles);
							resultBufferInternal += B*Math.cos(difAngles);
							double voltNeighboor = voltMagnitude.get(i);				
							resultBuffer += resultBufferInternal * voltNeighboor * voltNode;							
							//System.out.println("resultBuffer: "+resultBuffer);
						}
					}
					J11.put(k,j,resultBuffer);
					
				} // for non diagonal elements (less variables have to be considered)
				if (nodeIndexP != nodeIndexAngle){
					//System.out.println("non-diagonal elements node "+nodeIndex+"   voltage of node"+nodeIndex+":"+voltage);					
					double G = realAdmittance.get(nodeIndexP, nodeIndexAngle);
					double B = imagAdmittance.get(nodeIndexP, nodeIndexAngle);
					//System.out.println("B"+ "_"+nodeIndex+"," + j+":"+B);
					if (G != 0.0 || B != 0.0) {
						double resultBuffer = 0;
						double voltNeighboor = voltMagnitude.get(nodeIndexAngle);
						double difAngles = voltAngles.get(nodeIndexP) - voltAngles.get(nodeIndexAngle);						
						resultBuffer = voltNode*voltNeighboor*(G*Math.sin(difAngles)-B*Math.cos(difAngles));
						J11.put(k,j,resultBuffer);
					}
				}
			}
		}
		log.debug("J11 - size: " + J11.columns+"x"+J11.rows+"   " + J11);
		return J11;
	}
}
