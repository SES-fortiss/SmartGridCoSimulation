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
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.fortiss.powerflowsim.Properties;
import org.fortiss.powerflowsim.model.CimModel;
import org.fortiss.powerflowsim.simulation.helper.ExtendedMatrixFunctions;
import org.fortiss.powerflowsim.util.Utils;
import org.jblas.ComplexDouble;
import org.jblas.ComplexDoubleMatrix;
import org.jblas.DoubleMatrix;
import org.jblas.Solve;


/**
 * This class contains the Newton-Raphson solver for the powerflow calculation.
 * For the mathematical matrix/vector calculations the math-library JBLAS is used.
 * 
 * Originally, this was the only solver by Martin. To check it functionality, a 
 * second solver was implemented by Denis. The second solver is called NetwonExplicit.
 * As some models could not be solved, additionally, the solver was modified to consider
 * physical limits (voltage levels and angle levels) and a step size modification was added.
 * Both solvers provide similar results, but Martins's solver is faster ;-) .
 * 
 * @author murphy, denis
 */
public abstract class Solver {

	private static Logger log = LogManager.getLogger(Solver.class);
	private static double tolerance = Properties.solverTolerance;
	private static int maxIterations = Properties.solverMaxIterations;
	private static BusBranchModel busBranchModel;

	/**
	 * Solve the model with Newton-Raphson
	 * 
	 * @param model
	 *            the model to be solved
	 * @return a string with debug messages
	 */
	public static String solve_model(CimModel model){
		
		// previous solution only as reminder 
		// log.setLevel(Level.WARN);
		Configurator.setLevel(log.getName(), Level.WARN);
		
		log.info("enter solve_model() method of Solver.class");
		
		/*
		 * The SimulationModel.class converts the CIM-Model to the bus-branch representation.
		 * It calculates also the admittance matrix.
		 */
		busBranchModel = new BusBranchModel(model);

		int[] pvIndices = Utils.convertIntegers(busBranchModel.pvNodeIds); // Indices of all PV busses
		int[] pqIndices = Utils.convertIntegers(busBranchModel.pqNodeIds); // Indices of all PQ busses

		log.debug("About to solve the following powerflow problem:");
		log.info("Y matrix: " + busBranchModel.yMatrix.toString());
		log.debug("Initial voltage vector u: " + busBranchModel.voltVector.toString());
		
		log.debug("Power vector S: " + busBranchModel.s.toString());
		log.debug("The swing node is node number " + busBranchModel.swingNodeId);
		log.debug("PQ nodes vector :" + Arrays.toString(pqIndices));
		log.debug("PV nodes vector: " + Arrays.toString(pvIndices));
		
		for (int i = 0; i < busBranchModel.indexNodeMap.size(); i++) {
			log.info("nodeIndex: "+i + " --> Node: " + busBranchModel.indexNodeMap.get(i).getMRID());
		}		
		
		ComplexDoubleMatrix s = new ComplexDoubleMatrix(busBranchModel.numberOfNodes);		
		s = busBranchModel.s;
		
		log.info("voltVector by simModel: " + busBranchModel.voltVector);
		log.info("Initial node power injection vector: " + s.toString());
		
		// Solve the optimization problem with the input parameters:
		// - admittance matrix y
		// - power injection vector s
		// - start values for the voltages v
		// - ids and types of the busses (SWING, PV, PQ)
		ComplexDoubleMatrix optimumVoltage; 
		
		try {
			
			optimumVoltage = solve(busBranchModel.yMatrix, s, busBranchModel.voltVector, busBranchModel.swingNodeId, pvIndices, pqIndices);
			
		} catch (Exception e) {
			log.warn("Newton-Raphson could not solve the Powerflow --> matrice is null");
			e.printStackTrace();			
			return null;
		}

		// Calculate the optimum power (injections)
		ComplexDoubleMatrix optimumPower = ComplexDoubleMatrix.diag(busBranchModel.yMatrix.mmul(optimumVoltage).conj()).mmul(optimumVoltage);
		// Indices of all lines
		int[] lineIndex = ArrayUtils.toPrimitive(busBranchModel.lineSet.toArray(new Integer[0]));
		
		//Calculate power flowing into/out of a branch		
		ComplexDoubleMatrix power_from_branch = calculate_branch_power_from(optimumVoltage, busBranchModel.y_from, busBranchModel.lineFrom, lineIndex);
		ComplexDoubleMatrix power_to_branch = calculate_branch_power_to(optimumVoltage, busBranchModel.y_to, busBranchModel.lineTo, lineIndex);
		// map bus results
		
		for (int i = 0; i < optimumVoltage.rows; i++) {
			
			/*
			 *  old code: gives wrong angles (angles are alway positive)
			 *  simModel.mapBusResult(i, optimumVoltage.get(i).abs(), optimumVoltage.get(i).arg(), optimumPower.getReal(i), optimumPower.getImag(i));
			 */			
			double angle =  Math.atan(optimumVoltage.getImag(i)/optimumVoltage.getReal(i));
			busBranchModel.mapBusResult(i, optimumVoltage.get(i).abs(), angle, optimumPower.getReal(i), optimumPower.getImag(i));
		}
		
		// map branch results
		for (int i = 0; i < power_from_branch.rows; i++) {
			busBranchModel.mapBranchResult(i, power_from_branch.getReal(i), power_from_branch.getImag(i), power_to_branch.getReal(i), power_to_branch.getImag(i));
		}
		
		busBranchModel.setPowerValues(power_to_branch, power_from_branch);
		
		String result ="Voltages: " + optimumVoltage.toString() + "\n" + "Power: " + optimumPower.toString(); 		
		log.debug(result);
		return result;
	}

	/**
	 * solves the power flow problem
	 * 
	 * @param yMatrix
	 *            the admittance matrix
	 * @param sPowerInjectionVector
	 *            the vector with power injections
	 * @param voltInitialVector
	 *            the vector with the initial voltages
	 * @param swingNodeId
	 *            the id of the SWING-Busses
	 * @param pvIndices
	 *            the ids of the PV-Busses
	 * @param pqIndices
	 *            the ids of the PQ-Busses
	 * @return a vector containing the optimal voltages. Null if NR did not
	 *         converge
	 */
	private static ComplexDoubleMatrix solve(ComplexDoubleMatrix yMatrix, 
			ComplexDoubleMatrix sPowerInjectionVector, 
			ComplexDoubleMatrix voltInitialVector, 
			int swingNodeId, int[] pvIndices, int[] pqIndices) throws SolverException {

		boolean converged = false;
		double tolerance = 1.0e-6;
		
		ComplexDoubleMatrix voltVector = voltInitialVector; // the voltage start vector		
		int[] pvpqIndices = icat(pvIndices, pqIndices);		// contains all indices but the swing bus

		log.debug("Array of node indices: " + Arrays.toString(pvpqIndices));
						
		ComplexDoubleMatrix powerCalculated = calculate_power(yMatrix, voltVector);		
		ComplexDoubleMatrix difference = powerCalculated.sub(sPowerInjectionVector);
		
		log.debug("power calculated: " + powerCalculated);
		log.debug("difference: " + difference);		
		
		converged = checkConvergence(difference, pvpqIndices, pqIndices, tolerance); // if the solution is ok, no Newton-Raphson is required

		/*
		 * Newton-Raphson
		 */		
		ComplexDoubleMatrix result = null;
		
		log.info("start solving");
		
		if (result == null){
			log.info("Martin's solver is used.");
			result = do_newton_iterations(converged, pvIndices, pqIndices, pvpqIndices, sPowerInjectionVector, voltVector, yMatrix);
			log.info("Result found: " + (result != null) );
		}	
		
		/*
		 * If result is not found, use the other Solver.
		 * The other solver is slower, but a has a slightly more accurate
		 * calculation of the Jacobian. The derivative of dP_i / dV_i 
		 * differs slightly, since a factor 2 is considered, if k = i.
		 */	
		if (result == null){
			log.info("Denis' solver is used");
			result = NewtonExplicit.newtonIterations(converged, pvIndices, pqIndices, pvpqIndices, sPowerInjectionVector, voltVector, yMatrix);
			log.info("Result found: " + (result != null) );			
		}		
				
		
		if (result == null){
			log.warn("Still no result --> do you want to implement another Solver @ Solver.class .");
			/*
			 * Implement GridLabD solver if needed, this was done for a prove a concept in a
			 * student's work, but was not fully transferred to production code.
			 */			
			log.info("Result found: " + (result != null) );
		}
		
		return result;
	}

	private static boolean checkConvergence(ComplexDoubleMatrix difference,
			int[] pvpqIndices, int[] pqIndices, double tolerance2) {
		
		DoubleMatrix realMismatch = difference.get(pvpqIndices).real();		// hier werden alle realen Werte genommen --> alle P
		DoubleMatrix imagMismatch = difference.get(pqIndices).imag();		// hier werden alle Q genommen
		DoubleMatrix x_mis = DoubleMatrix.concatVertically(realMismatch, imagMismatch);	// macht einen großen, langen Vektor draus.

		// calculates the length of the vector using Euklidian Form --> standard way of doing it
		double norm_x_mis = x_mis.norm2();
		
		log.debug("Infinity Norm: " + norm_x_mis);

		// Check if system is already optimal
		if (norm_x_mis < tolerance) {			
			log.info("Problem is already optimal");
			return true;
		}
		
		return false;
		
	}

	/**
	 * Calculates the complex power using P = I*U = (YU)*U
	 * 
	 * @param yMatrix
	 * @param voltVector
	 * @return
	 */
	public static ComplexDoubleMatrix calculate_power(
			ComplexDoubleMatrix yMatrix, ComplexDoubleMatrix voltVector) {		
		// calculate complex conj of i
		// I = ( Y (n x n) * V (1 x n) )^*
		ComplexDoubleMatrix i_conj = yMatrix.mmul(voltVector).conj();
		// calculate the complex power based on the voltageVector
		ComplexDoubleMatrix power = ComplexDoubleMatrix.diag(i_conj).mmul(voltVector);
		
		return power;
	}

	/**
	 * Calculates the difference between current power levels and the optimum
	 * 
	 * @param pqIndices
	 * @param pvpqIndices
	 * @param sPowerInjectionVector
	 * @param voltVector
	 * @param yMatrix
	 * @return a vector containing the difference from the optimum
	 */
	private static DoubleMatrix calculate_power_mismatch(int[] pqIndices, int[] pvpqIndices, 
			ComplexDoubleMatrix sPowerInjectionVector, ComplexDoubleMatrix voltVector, ComplexDoubleMatrix yMatrix) {			
		
		// calculate complex conj of i
		// I = ( Y (n x n) * V (1 x n) )^*
		ComplexDoubleMatrix i_conj = yMatrix.mmul(voltVector).conj();

		log.debug("calculate_power_mismatch(...) --> calculated values of i: " + i_conj.toString());
		log.debug("calculate_power_mismatch(...) --> calculated norm of i: " + i_conj.normmax());
		
		// calculate power mismatch
		// mis = diag(I^*) *  V - S
		ComplexDoubleMatrix mis = ComplexDoubleMatrix.diag(i_conj).mmul(voltVector).sub(sPowerInjectionVector); // passt.

		DoubleMatrix realMismatch = mis.get(pvpqIndices).real();	
		DoubleMatrix imagMismatch = mis.get(pqIndices).imag();		
		DoubleMatrix powesMosmatch = DoubleMatrix.concatVertically(realMismatch, imagMismatch);

		return powesMosmatch;
	}

	/**
	 * Does the newton-raphson power flow iterations
	 * 
	 * @param converged
	 * @param pvIndices
	 * @param pqIndices
	 * @param pvpqIndices
	 * @param sInjectionVector
	 * @param voltageVector
	 * @param yMatrix
	 * @param voltage_angle
	 * @param voltage_magnitude
	 * @return a complex vector containing the optimal voltages. If NR did not
	 *         converge it returns null.
	 */
	private static ComplexDoubleMatrix do_newton_iterations(boolean converged,
			int[] pvIndices, int[] pqIndices, int[] pvpqIndices, ComplexDoubleMatrix sInjectionVector,
			ComplexDoubleMatrix voltageVector, ComplexDoubleMatrix yMatrix) {

		// voltage angle and magnitude, required for the the jacobian matrix
		DoubleMatrix voltage_magnitude = ExtendedMatrixFunctions.abs(voltageVector);
		DoubleMatrix voltage_angle = ExtendedMatrixFunctions.arg(voltageVector);

		double norm_x_mis = 0;
		DoubleMatrix jacobian;
		DoubleMatrix voltage_delta;
		
		DoubleMatrix powerMissmatch = null; // temporary

		/* set up indexing for updating V */
		int pv_busses_number = pvIndices.length;
		int pq_busses_number = pqIndices.length;
		
		int pv_angle_start_index = 0;
		int pv_angle_end_index = pv_busses_number;
		
		int pq_angle_start_index = pv_angle_end_index;
		int pq_angle_end_index = pv_angle_end_index + pq_busses_number;
		
		int pq_magnitude_start_index = pq_angle_end_index;
		int pq_magnitude_end_index = pq_angle_end_index + pq_busses_number;

		int iteration = 0;
		
		powerMissmatch = calculate_power_mismatch(pqIndices, pvpqIndices, sInjectionVector, voltageVector, yMatrix);
		
		// Checked this for correctness with an IEEE 3bus system and it worked
		// It is still not possible to calculate the IEEE 13bus example
		while ((!converged) & (iteration < maxIterations)) {
			/* takes 3.8 von 4.5s*/
			 
			// Jacobian Matrix is fine and tested
			log.debug("Calc Jacobian");
			jacobian = calculate_jacobian(pqIndices, pvpqIndices, voltageVector, yMatrix);			
			
			log.trace("Iteration: "+iteration);
			log.trace("voltage magnitudes: "+voltage_magnitude.toString());
			log.trace("voltage angles: "+voltage_angle.toString());
			log.info("jacobian: "+jacobian);
			
			/* takes 0.6 von 4.5s*/
			log.debug("Solve Jacobian");
			voltage_delta = Solve.solve(jacobian, powerMissmatch).neg();
			
			// make a smaller step to have convergency
			if (voltage_delta.normmax() > 1) {
				log.warn("Iteration: " +iteration+ " Martin's solver adapted step size to reach convergency");
				voltage_delta = voltage_delta.div(voltage_delta.normmax() * 10);
			}

			/* update voltage */
			/* takes 1ms*/
			if (pv_busses_number > 0) {
				voltage_angle.put(
						pvIndices,
						voltage_angle.get(pvIndices).add(voltage_delta.get(irange(pv_angle_start_index, pv_angle_end_index))));
			}			
			if (pq_busses_number > 0) {
				
				voltage_angle.put(
						pqIndices, 
						voltage_angle.get(pqIndices).add(voltage_delta.get(irange(pq_angle_start_index, pq_angle_end_index))));
				
				voltage_magnitude.put(
						pqIndices, 
						voltage_magnitude.get(pqIndices).add(voltage_delta.get(irange(pq_magnitude_start_index, pq_magnitude_end_index))));
			}		
			
			/* takes 2ms*/
			voltageVector = ExtendedMatrixFunctions.polar(voltage_magnitude, voltage_angle);
			log.debug("New voltage values:" + voltageVector);			

			/* evalute powerMissmatch(x) */
			/* takes 24ms*/
			powerMissmatch = calculate_power_mismatch(pqIndices, pvpqIndices, sInjectionVector, voltageVector, yMatrix);			

			/* check for convergence */
			/* takes 0ms*/
			norm_x_mis = powerMissmatch.norm2();
			
			log.debug("Iteration " + iteration + " with norm "
					+ norm_x_mis);					

			if (norm_x_mis < tolerance) {
				converged = true;
				log.info("Voltages: " + voltageVector);
				log.info("Newton's method power flow converged in " + iteration + "  iterations.");
				return voltageVector;
			}

			iteration++;
		}
		
		log.warn("leaving Martin's solver after " + iteration + " iterations");
		
		return null;
	}

	/**
	 * Calculates the jacobian matrix. For the calculation, it is required to know 
	 * 
	 * @param pqIndices a int array containing all indexes of pq busses
	 * @param pvpqIndices a int array containing all indexes of pq and pv busses
	 * @param voltageVector the (complex) voltage vector
	 * @param y_Matrix the admittance matrix of the system
	 * @return a DoubleMatrix matrix containing the jacobian matrix of the system
	 */
	public static DoubleMatrix calculate_jacobian(int[] pqIndices, int[] pvpqIndices, ComplexDoubleMatrix voltageVector, ComplexDoubleMatrix y_Matrix) {
		
		log.debug("enter calculate jacobian(...) function");
		
		/*
		*  The calculation of the jacobian is described in Martin's thesis in chapter 4.
		*/
		ComplexDoubleMatrix dSbus_dVmagnitude;
		ComplexDoubleMatrix dSbus_dVangle;
		
		DoubleMatrix J11;
		DoubleMatrix J12;
		DoubleMatrix J21;
		DoubleMatrix J22;
		DoubleMatrix J;

		// Jacobian matrix
		
		// takes 2200 ms				
		dSbus_dVmagnitude = calculate_dS_dVmagnitude(y_Matrix, voltageVector);		
		log.debug("Martins solver size of dS_dVmagnitude: " + dSbus_dVmagnitude.columns +"x"+dSbus_dVmagnitude.rows);
		
		// takes 1500ms
		dSbus_dVangle = calculate_dS_dVa(y_Matrix, voltageVector);
		log.debug("Martins solver size of dS_dVangle: " + dSbus_dVangle.columns +"x"+dSbus_dVangle.rows);

		// Rest takes 115ms
		log.debug("Select Jacobian Parts");
		J11 = dSbus_dVangle.real().get(pvpqIndices, pvpqIndices);
		log.debug("Martins solver size of J11: " + J11.columns + "x" + J11.rows);		
		J12 = dSbus_dVmagnitude.real().get(pvpqIndices, pqIndices);
		log.debug("Martins solver size of J12: " + J12.columns + "x" + J12.rows);		
		J21 = dSbus_dVangle.imag().get(pqIndices, pvpqIndices);
		J22 = dSbus_dVmagnitude.imag().get(pqIndices, pqIndices);
		
		log.debug("J22: " +J22);
		log.debug("Reorder and join Jacobian");
		DoubleMatrix J1 = DoubleMatrix.concatHorizontally(J11, J12);
		DoubleMatrix J2 = DoubleMatrix.concatHorizontally(J21, J22);
		J = DoubleMatrix.concatVertically(J1, J2);
		log.debug("Create final JJ matrix and return it. Leave calculate_jacobian(...) function");		
		
		return J;
	}

	/**
	 * calculates the jacobian matrix derived to the voltage magnitude
	 * 
	 * A comment by Denis - the jacobian matrix has a different size, than the admittance matrix.
	 * The jacobian matrix's size is:
	 * quadratic size = 2times number of PQ nodes plus 1time number of PV nodes minus 1 for slack.
	 * 
	 * @param admittanceMatrix
	 *            the admittance matrix of the system
	 * @param voltageVector
	 *            the (complex) voltage vector
	 * @return the DComplexMatrix2D jacobian matrix derived with respect to the
	 *         voltage magnitude
	 */
	private static ComplexDoubleMatrix calculate_dS_dVmagnitude(ComplexDoubleMatrix admittanceMatrix, ComplexDoubleMatrix voltageVector) {

		// |V|
		DoubleMatrix absV = ExtendedMatrixFunctions.abs(voltageVector);		
		
		// V / |V| --> Vnorm ist ein Vektor, dessen komplexe Einträge normiert
		// sind, d.h. die Länge eins haben
		ComplexDoubleMatrix Vnorm = voltageVector.div(new ComplexDoubleMatrix(absV));

		// Diagonilize
		ComplexDoubleMatrix diagVnorm = ComplexDoubleMatrix.diag(Vnorm);

		// (Y diag(V / ||V||))*
		ComplexDoubleMatrix yDiagVnormConj = admittanceMatrix.mmul(diagVnorm).conj();

		// calculate parts of equation 4.44
		ComplexDoubleMatrix diagV = ComplexDoubleMatrix.diag(voltageVector);

		// diag(V) (Y diag(V / ||V||))*
		ComplexDoubleMatrix firstPart = diagV.mmul(yDiagVnormConj);

		
		// I
		ComplexDoubleMatrix I = admittanceMatrix.mmul(voltageVector);

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
	
	public static BusBranchModel getSimulationModel(){
		return busBranchModel;
	}

}

@SuppressWarnings("serial")
class SolverException extends Exception{
	public SolverException(){}
	public SolverException(String message){
		super (message);
	}
	public SolverException (Throwable cause) {
        super (cause);
    }

    public SolverException (String message, Throwable cause) {
        super (message, cause);
    }
}
