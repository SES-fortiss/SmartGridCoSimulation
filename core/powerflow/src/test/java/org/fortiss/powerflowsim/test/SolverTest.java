/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.test;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.fortiss.powerflowsim.importers.SampleCases;
import org.fortiss.powerflowsim.importers.TopologyGenerator;
import org.fortiss.powerflowsim.model.Model;
import org.fortiss.powerflowsim.simulation.internal.SimulationUtils;
import org.fortiss.powerflowsim.simulation.internal.Solver;
import org.jblas.ComplexDoubleMatrix;
import org.jblas.DoubleMatrix;
import org.junit.Before;
import org.junit.Test;

public class SolverTest {
	private static Logger log = Logger.getRootLogger();
	private Model model9bus;
	private Model model1000bus;

	@Before
	public void createLogger() {
		PatternLayout layout = new PatternLayout("%d{ISO8601} %-5p [%t] %c: %m%n");
		ConsoleAppender consoleAppender = new ConsoleAppender(layout);
		log.addAppender(consoleAppender);
		// ALL | DEBUG | INFO | WARN | ERROR | FATAL | OFF:
		log.setLevel(Level.ALL);
	}

	@Before
	public void generateModels() {
		this.model9bus = SampleCases.create9BusExample();
		TopologyGenerator topologyGenerator = new TopologyGenerator();
		this.model1000bus = topologyGenerator.generateConsumerFullMeshDistributionSystem(300);
	}

	@Test
	public void Solver9BusTest() {

		Solver.solve_model(this.model9bus);
		model9bus.toString();
		double[] lineLoss = SimulationUtils.calculateTotalLineLosses(model9bus);
		log.info("Total line loss: " + lineLoss[0] + " + j " + lineLoss[1]);
	}

	@Test
	public void SolverJacobianCalculationTest() {
		ComplexDoubleMatrix y = ComplexDoubleMatrix.ones(3,3);
		ComplexDoubleMatrix v = ComplexDoubleMatrix.ones(3);
		int[] pq = {2};
		int[] pvpq = {1, 2};
		DoubleMatrix jacobian = Solver.calculate_jacobian(pq,pvpq, v, y);

		// TODO check result data
		double[][] jacobianResultData = {{0.0, 0.0, 1.0}, {0.0, 0.0, 4.0}, {-1.0, 2.0, 0.0}};
		DoubleMatrix jacobianResult = new DoubleMatrix(jacobianResultData);


		assertTrue(jacobianResult.eq(jacobian).min() == 1.0);
	}
	@Test
	public void SolverPerformanceTest() {

		Solver.solve_model(this.model1000bus);
		this.model1000bus.toString();
	}

}
