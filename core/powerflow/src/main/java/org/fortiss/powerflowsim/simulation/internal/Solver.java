/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.simulation.internal;

import static edu.emory.mathcs.utils.Utils.icat;
import static edu.emory.mathcs.utils.Utils.irange;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.fortiss.powerflowsim.Properties;
import org.fortiss.powerflowsim.model.Model;
import org.fortiss.powerflowsim.util.Utils;
import org.jblas.ComplexDouble;
import org.jblas.ComplexDoubleMatrix;
import org.jblas.DoubleMatrix;
import org.jblas.Solve;


/**
 * This class contains the newton raphson solver for the powerflow calculation.
 *
 * For the mathematical matrix/vector calculations the math-library JBLAS is used.
 */
public abstract class Solver {

	private static Logger log = Logger.getRootLogger();
	private static double tolerance = Properties.solverTolerance;
	private static int maxInterations = Properties.solverMaxIterations;
	private static SimulationModel simModel;

	/**
	 * Solve the model with Newton-Raphson
	 * 
	 * @param model
	 *            the model to be solved
	 * @return a string with debug messages
	 */
	public static String solve_model(Model model) {
		simModel = new SimulationModel(model);

		int[] pv = Utils.convertIntegers(simModel.pvNodeIds); // Indices of all
																// PV busses
		int[] pq = Utils.convertIntegers(simModel.pqNodeIds); // Indices of all
																// PQ busses

		log.debug("About to solve the following powerflow problem:");
		// log.debug("Y matrix: " + simModel.y.toString());
		log.debug("Initial voltage vector u: " + simModel.v.toString());
		// log.debug("Power injection vector S_g: " + simModel.s_g.toString());
		// log.debug("Power demand vector S_d: " + simModel.s_d.toString());
		log.debug("The swing node is node number " + simModel.swingNodeId);
		log.debug("PQ nodes vector :" + Arrays.toString(pq));
		log.debug("PV nodes vector: " + Arrays.toString(pv));

		// calculate power injection vector
		// s = s_g - s_d (injected power = generated power - demanded power at
		// node i )
		ComplexDoubleMatrix s = new ComplexDoubleMatrix(simModel.numberOfNodes);
		s = simModel.s_g;
		s = s.sub(simModel.s_d);

		log.info("calculated node power injection vector as: " + s.toString());
		
		// Solve the optimization problem with the input parameters:
		// - admittance matrix y
		// - power injection vector s
		// - start values for the voltages v
		// - ids and types of the busses (SWING, PV, PQ)
		ComplexDoubleMatrix optimumVoltage = solve(simModel.y, s, simModel.v, simModel.swingNodeId, pv, pq);

		if (optimumVoltage == null) {
			return "Newton-Raphson could not solve the Powerflow";
		}

		// Calculate the optimum power (injections)
		ComplexDoubleMatrix optimumPower = ComplexDoubleMatrix.diag(simModel.y.mmul(optimumVoltage).conj()).mmul(optimumVoltage);

		// Indices of all lines
		int[] lineIndex = ArrayUtils.toPrimitive(simModel.lineSet.toArray(new Integer[0]));

		// Calculate power flowing into/out of a branch
		ComplexDoubleMatrix power_from_branch = calculate_branch_power_from(optimumVoltage, simModel.y_from, simModel.lineFrom, lineIndex);
		ComplexDoubleMatrix power_to_branch = calculate_branch_power_to(optimumVoltage, simModel.y_to, simModel.lineTo, lineIndex);


		// map bus results
		for (int i = 0; i < optimumVoltage.rows; i++) {
			simModel.mapBusResult(i, optimumVoltage.get(i).abs(), optimumVoltage.get(i).arg(), optimumPower.getReal(i), optimumPower.getImag(i));
		}

		// map branch results
		for (int i = 0; i < power_from_branch.rows; i++) {
			simModel.mapBranchResult(i, power_from_branch.getReal(i), power_from_branch.getImag(i), power_to_branch.getReal(i), power_to_branch.getImag(i));
		}
		simModel.setPowerValues(power_to_branch, power_from_branch);
		log.debug( "Voltages: " + optimumVoltage.toString() + "\n" + "Power: " + optimumPower.toString());
		return "Voltages: " + optimumVoltage.toString() + "\n" + "Power: " + optimumPower.toString();
	}

	/**
	 * solves the power flow problem
	 * 
	 * @param y
	 *            the admittance matrix
	 * @param s
	 *            the vector with power injections
	 * @param V0
	 *            the vector with the initial voltages
	 * @param swingNodeId
	 *            the id of the SWING-Busses
	 * @param pv
	 *            the ids of the PV-Busses
	 * @param pq
	 *            the ids of the PQ-Busses
	 * @return a vector containing the optimal voltages. Null if NR did not
	 *         converge
	 */
	private static ComplexDoubleMatrix solve(ComplexDoubleMatrix y,
			ComplexDoubleMatrix s, ComplexDoubleMatrix V0, int swingNodeId, int[] pv,
			int[] pq) {

		boolean converged = false;

		int[] pvpq = icat(pv, pq); // contains all indicies but the swing bus

		double tol = 1.0e-6; // tolerance

		ComplexDoubleMatrix V = V0; // init V with the voltage start vector

		/**
		 * Check if system is already optimal
		 */
		DoubleMatrix x_mis = calculate_power_mismatch(pq, pvpq, s, V, y);

		// TODO look into the different norm functions of JBLAS
		double norm_x_mis = x_mis.normmax();
		log.debug("Infinity Norm: " + norm_x_mis);

		if (norm_x_mis < tol) {
			converged = true;
			log.info("Problem is already optimal");
			return V0;
		}

		log.info("starting solving");

		/**
		 * Newton-Raphson
		 */
		ComplexDoubleMatrix optimumVoltage = do_newton_iterations(converged, pv, pq, pvpq, s, V, y, x_mis);
		return optimumVoltage;
	}

	/**
	 * calculates the difference between current power levels and the optimum
	 * 
	 * @param pq
	 * @param pvpq
	 * @param s
	 * @param V
	 * @param Ybus
	 * @return a vector containing the difference from the optimum
	 */
	private static DoubleMatrix calculate_power_mismatch(int[] pq, int[] pvpq, ComplexDoubleMatrix s, ComplexDoubleMatrix V, ComplexDoubleMatrix Ybus) {
		// calculate complex conj of i
		// I = ( Y (n x n) * V (1 x n) )^*
		ComplexDoubleMatrix i_conj = Ybus.mmul(V).conj();

		// calculate power mismatch
		// mis = diag(I^*) *  V - S
		ComplexDoubleMatrix mis = ComplexDoubleMatrix.diag(i_conj).mmul(V).sub(s);

		DoubleMatrix realMismatch = mis.get(pvpq).real();
		DoubleMatrix imagMismatch = mis.get(pq).imag();

		DoubleMatrix x_mis = DoubleMatrix.concatVertically(realMismatch, imagMismatch);

		return x_mis;
	}

	/**
	 * Does the newton power flow iterations
	 * 
	 * @param converged
	 * @param pv
	 * @param pq
	 * @param pvpq
	 * @param s
	 * @param voltage
	 * @param y_bus
	 * @param voltage_angle
	 * @param voltage_magnitude
	 * @param x_mis
	 * @return a complex vector containing the optimal voltages. If NR did not
	 *         converge it returns null.
	 */
	private static ComplexDoubleMatrix do_newton_iterations(boolean converged,
			int[] pv, int[] pq, int[] pvpq, ComplexDoubleMatrix s,
			ComplexDoubleMatrix voltage, ComplexDoubleMatrix y_bus,
			DoubleMatrix x_mis) {

		// voltage angle and magnitude
		DoubleMatrix voltage_magnitude = ExtendedMatrixFunctions.abs(voltage);
		DoubleMatrix voltage_angle = ExtendedMatrixFunctions.arg(voltage);

		double norm_x_mis = 0;
		DoubleMatrix jacobian;
		DoubleMatrix voltage_new;

		/* set up indexing for updating V */
		int pv_busses_number = pv.length;
		int pq_busses_number = pq.length;
		int pv_angle_start_index = 0;
		int pv_angle_end_index = pv_busses_number;
		int pq_angle_start_index = pv_angle_end_index;
		int pq_angle_end_index = pv_angle_end_index + pq_busses_number;
		int pq_magnitude_start_index = pq_angle_end_index;
		int pq_magnitude_end_index = pq_angle_end_index + pq_busses_number;

		int iteration_number = 0;		
		
		while ((!converged) & (iteration_number < maxInterations)) {
			// increment iteration number
			iteration_number += 1;

			/* takes 3.8 von 4.5s*/
			log.debug("Calc Jacobian");
			jacobian = calculate_jacobian(pq, pvpq, voltage, y_bus);			
			
			/* takes 0.6 von 4.5s*/
			log.debug("Solve Jacobian");
			voltage_new = Solve.solve(jacobian, x_mis).neg();			

			/* update voltage */
			/* takes 1ms*/
			if (pv_busses_number > 0) {
				voltage_angle.put(pv, voltage_angle.get(pv).add(voltage_new.get(irange(pv_angle_start_index, pv_angle_end_index))));
			}
			if (pq_busses_number > 0) {
				voltage_angle.put(pq, voltage_angle.get(pq).add(voltage_new.get(irange(pq_angle_start_index, pq_angle_end_index))));
				voltage_magnitude.put(pq, voltage_magnitude.get(pq).add(voltage_new.get(irange(pq_magnitude_start_index, pq_magnitude_end_index))));
			}		
			
			/* takes 2ms*/
			voltage = ExtendedMatrixFunctions.polar(voltage_magnitude, voltage_angle);
			log.debug("New voltage values:" + voltage);			

			/* evalute x_mis(x) */
			/* takes 24ms*/
			x_mis = calculate_power_mismatch(pq, pvpq, s, voltage, y_bus);			

			/* check for convergence */
			/* takes 0ms*/
			norm_x_mis = x_mis.normmax();
			
			log.debug("Iteration " + iteration_number + " with norm "
					+ norm_x_mis);					

			if (norm_x_mis < tolerance) {
				converged = true;
				log.info("Voltages: " + voltage);
				log.info("\nNewton's method power flow converged in " + iteration_number + "  iterations.\n");
				return voltage;
			}
		}

		return null;
	}

	/**
	 * calculates the jacobian matrix
	 * 
	 * @param pq
	 *            a int array containing all indexes of pq busses
	 * @param pvpq
	 *            a int array containing all indexes of pq and pv busses
	 * @param V
	 *            the (complex) voltage vector
	 * @param Ybus
	 *            the admittance matrix of the system
	 * @return a SparseRCDoubleMatrix2D matrix containing the jacobian matrix of
	 *         the system
	 */
	public static DoubleMatrix calculate_jacobian(int[] pq, int[] pvpq, ComplexDoubleMatrix V, ComplexDoubleMatrix Ybus) {
		ComplexDoubleMatrix dSbus_dVm;
		ComplexDoubleMatrix dSbus_dVa;
		DoubleMatrix J11;
		DoubleMatrix J12;
		DoubleMatrix J21;
		DoubleMatrix J22;
		DoubleMatrix J1;
		DoubleMatrix J2;
		DoubleMatrix J;

		// Jacobian matrix		
		
		// takes 2200 ms
		dSbus_dVm = calculate_dS_dVm(Ybus, V);
		
		// takes 1500ms
		dSbus_dVa = calculate_dS_dVa(Ybus, V);		

		// Rest takes 115ms
		log.debug("Select Jacobian Parts");
		J11 = dSbus_dVa.real().get(pvpq, pvpq);
		J12 = dSbus_dVm.real().get(pvpq, pq);
		J21 = dSbus_dVa.imag().get(pq, pvpq);
		J22 = dSbus_dVm.imag().get(pq, pq);

		log.debug("Reorder and join Jacobian");
		J1 = DoubleMatrix.concatHorizontally(J11, J12);
		J2 = DoubleMatrix.concatHorizontally(J21, J22);
		J = DoubleMatrix.concatVertically(J1, J2);
		log.debug("Create final JJ matrix");		
		
		return J;
	}

	/**
	 * calculates the jacobian matrix derived to the voltage magnitude
	 * 
	 * @param Y
	 *            the admittance matrix of the system
	 * @param V
	 *            the (complex) voltage vector
	 * @return the DComplexMatrix2D jacobian matrix derived with respect to the
	 *         voltage magnitude
	 */
	private static ComplexDoubleMatrix calculate_dS_dVm(ComplexDoubleMatrix Y, ComplexDoubleMatrix V) {

		// ||V||
		DoubleMatrix absV = ExtendedMatrixFunctions.abs(V);

		// V / ||V|| --> Vnorm ist ein Vektor, dessen komplexe Einträge normiert
		// sind, d.h. die Länge eins haben
		ComplexDoubleMatrix Vnorm = V.div(new ComplexDoubleMatrix(absV));

		// Diagonilize
		ComplexDoubleMatrix diagVnorm = ComplexDoubleMatrix.diag(Vnorm);

		// (Y diag(V / ||V||))*
		ComplexDoubleMatrix yDiagVnormConj = Y.mmul(diagVnorm).conj();

		// calculate parts of equation 4.44
		ComplexDoubleMatrix diagV = ComplexDoubleMatrix.diag(V);

		// diag(V) (Y diag(V / ||V||))*
		ComplexDoubleMatrix firstPart = diagV.mmul(yDiagVnormConj);

		// I
		ComplexDoubleMatrix I = Y.mmul(V);

		// diag(I)*
		ComplexDoubleMatrix diagIconj = ComplexDoubleMatrix.diag(I).conj();

		// diag(I) * diag(V / ||V||)
		ComplexDoubleMatrix secondPart = diagIconj.mmul(diagVnorm);

		// result
		ComplexDoubleMatrix result = firstPart.add(secondPart);

		return result;
	}

	/**
	 * calculates the jacobian matrix derived to the voltage angle
	 * 
	 * @param Y
	 *            the admittance matrix of the system
	 * @param V
	 *            the (complex) voltage vector
	 * @return the DComplexMatrix2D jacobian matrix derived with respect to the
	 *         voltage angle
	 */
	private static ComplexDoubleMatrix calculate_dS_dVa(ComplexDoubleMatrix Y, ComplexDoubleMatrix V) {
		// calculate current vector
		ComplexDoubleMatrix I = Y.mmul(V);

		ComplexDoubleMatrix diagI = ComplexDoubleMatrix.diag(I);
		ComplexDoubleMatrix diagV = ComplexDoubleMatrix.diag(V);

		ComplexDoubleMatrix yDiagV = Y.mmul(diagV);

		// (diag(I) - Y diag(V))*
		ComplexDoubleMatrix diagIminusYdiagVconj = diagI.sub(yDiagV).conj();

		// j diag(V) (diag(I) - Y diag(V))*
		return diagV.mmul(diagIminusYdiagVconj).mul(ComplexDouble.I);
	}

	private static ComplexDoubleMatrix calculate_branch_power_from(ComplexDoubleMatrix voltage, ComplexDoubleMatrix y_from, int[] fromIndexes, int[] lineIndexes) {
		ComplexDoubleMatrix branch_power_from = ComplexDoubleMatrix.diag(y_from.get(lineIndexes, irange(0, y_from.columns)).mmul(voltage).conj()).mmul(voltage.get(fromIndexes));
		log.debug("Branch Power from: " + branch_power_from);
		return branch_power_from;
	}

	private static ComplexDoubleMatrix calculate_branch_power_to(ComplexDoubleMatrix voltage, ComplexDoubleMatrix y_to, int[] toIndexes, int[] lineIndexes) {
		ComplexDoubleMatrix branch_power_to = ComplexDoubleMatrix.diag(y_to.get(lineIndexes, irange(0, y_to.columns)).mmul(voltage).conj()).mmul(voltage.get(toIndexes));
		log.debug("Branch Power to: " + branch_power_to);
		return branch_power_to;
	}
	
	public static SimulationModel getSimulationModel(){
		return simModel;
	}

}
