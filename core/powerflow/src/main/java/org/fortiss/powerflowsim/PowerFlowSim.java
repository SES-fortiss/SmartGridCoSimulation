/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fortiss.powerflowsim.exporters.GLMExporter;
import org.fortiss.powerflowsim.importers.RDFImporter;
import org.fortiss.powerflowsim.importers.TopologyGenerator;
import org.fortiss.powerflowsim.model.CimModel;
import org.fortiss.powerflowsim.simulation.gridlabd.GridLabDController;
import org.fortiss.powerflowsim.simulation.gridlabd.Timestep;
import org.fortiss.powerflowsim.simulation.internal.Solver;

import CIM15.IEC61970.Topology.TopologicalNode;

/**
 * the main class
 * 
 * @author Martin Zellner
 */
public final class PowerFlowSim {
	private CimModel model = null;
	private static Logger log = LogManager.getRootLogger();

	/**
	 * creates a new PowerFlowSim Instance
	 */
	public PowerFlowSim() {

		// Import Sample
		// SampleImporter sampleImporter = new SampleImporter();
		// this.model = sampleImporter.importSample();

		TopologyGenerator topologyGenerator = new TopologyGenerator();
		this.model = topologyGenerator.generateConsumerFullMeshDistributionSystem(8);
		// this.model = SampleCases.create9BusExample();

		log.info("Ready");
	}

	/**
	 * runs the simulation in GridLAB-D
	 * 
	 * @return the output of the simulation process
	 */
	public String runSimulation() {
		if (Properties.solverEngine.equals("gridlab")) {

			File glmFile = new File("test.glm");

			// Create sample timestep
			Timestep timestep = new Timestep();

			// Create new GLMExporter class
			GLMExporter glmExporter = new GLMExporter();
			glmExporter.export(glmFile, this.getModel(), timestep);

			// Create GridLabDController GridLabDController
			GridLabDController gridLabDController = new GridLabDController(this.getModel());
			String outputString = gridLabDController.runSimulation(glmFile);
			this.setModel(gridLabDController.getModel());

			return outputString;

		} else if (Properties.solverEngine.equals("internal")) {
			return Solver.solve_model(this.model);
		} else {
			// if no solver is specified use the internal solver
			return Solver.solve_model(this.model);
		}

	}

	/**
	 * loads a new RDF File
	 * 
	 * @param file
	 *            the file to be loaded
	 */
	public void loadFile(File file) {

		RDFImporter rdfImporter = new RDFImporter();

		this.setModel(rdfImporter.importRDF(file));
		this.model.createTopologicalNodes();
		this.model.setSWINGNode((TopologicalNode) this.model.getTopologicalNodes().toArray()[0]);
		log.info("File loaded");
	}

	/**
	 * Setter and Getter
	 */
	/**
	 * @return the model
	 */
	public CimModel getModel() {
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(CimModel model) {
		this.model = model;
	}

}
