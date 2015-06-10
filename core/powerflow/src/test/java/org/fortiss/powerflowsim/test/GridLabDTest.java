/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.test;

import java.io.File;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.fortiss.powerflowsim.exporters.GLMExporter;
import org.fortiss.powerflowsim.importers.SampleCases;
import org.fortiss.powerflowsim.model.Model;
import org.fortiss.powerflowsim.simulation.gridlabd.GridLabDController;
import org.fortiss.powerflowsim.simulation.gridlabd.Timestep;
import org.junit.Before;
import org.junit.Test;

public class GridLabDTest {
	private static Logger log = Logger.getRootLogger();
	private Model model9bus;

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

	}

	@Test
	public void Solver9BusTest() {
		Timestep timestep = new Timestep();
		File file = new File("glmFile.glm");
		GLMExporter exporter = new GLMExporter();
		exporter.export(file, model9bus, timestep);
		GridLabDController controller = new GridLabDController(model9bus);
		controller.runSimulation(file);

		model9bus.toString();
	}

}
