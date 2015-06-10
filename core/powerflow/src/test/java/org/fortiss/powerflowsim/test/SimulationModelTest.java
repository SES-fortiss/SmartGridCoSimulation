/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.test;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.fortiss.powerflowsim.importers.SampleCases;
import org.fortiss.powerflowsim.model.Model;
import org.fortiss.powerflowsim.simulation.internal.SimulationModel;
import org.junit.Before;
import org.junit.Test;

public class SimulationModelTest {
	private static Logger log = Logger.getRootLogger();

	@Before
	public void createLogger() {
		SimpleLayout layout = new SimpleLayout();
		ConsoleAppender consoleAppender = new ConsoleAppender(layout);
		log.addAppender(consoleAppender);
		// ALL | DEBUG | INFO | WARN | ERROR | FATAL | OFF:
		log.setLevel(Level.ALL);
	}

	@Test
	public void ThreeBusSimulationModelTest() {
		Model model = SampleCases.create9BusExample();
		@SuppressWarnings("unused")
		SimulationModel simModel = new SimulationModel(model);
	}

}
