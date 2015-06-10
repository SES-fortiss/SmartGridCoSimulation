/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package powerflowApi;

import java.io.File;
import java.util.HashSet;

import org.fortiss.powerflowsim.importers.RDFImporter;
import org.fortiss.powerflowsim.importers.TopologyGenerator;
import org.fortiss.powerflowsim.model.Model;
import org.fortiss.powerflowsim.model.ModelUtils;

import powerflowApi.helper.AutoMapException;
import topology.ActorTopology;
import CIM15.IEC61970.Core.BaseVoltage;
import CIM15.IEC61970.Topology.TopologicalNode;

/**
 * The PowerflowTopology class is used to interact with the powerflowApi. It
 * contains a powerflowModel according to CIM. It also provides some generation
 * methods.
 * 
 * @since Mar 16, 2014
 * @author Martin Zellner
 * @author Denis Bytschkow
 * 
 */
public class PowerflowModel {

	/*
	 * The decision to have an extra class that contains the model, instead of
	 * using the model directly is based on the splitting the packages of the
	 * core functionalities - the actors representing the communication and the
	 * powerflow solver.
	 */

	public Model CIMmodel; // The CIM Model
	public HashSet<String> nameIDs = new HashSet<String>();

	private TopologicalNode lastNode;
	private BaseVoltage baseVoltageObject;
	private double standardVoltage = 240;

	/**
	 * This class constructor creates a new PowerflowModel with a predefined
	 * slackBus.
	 */
	public PowerflowModel() {
		initialize();
	}

	public PowerflowModel(Model CIMmodel) {
		this.CIMmodel = CIMmodel;
	}

	public void addNodeBelow(String actorName) {
		TopologicalNode newNode = createNode(actorName);
		ModelUtils.createDefaultLine(CIMmodel, lastNode, newNode);
		lastNode = newNode;
	}
	
	public void setStandardVoltage(double voltage){
		standardVoltage = voltage;
		baseVoltageObject.setNominalVoltage((float) standardVoltage);
	}

	/**
	 * creates a new TopologicalNode and adds that to the model.
	 * 
	 * @param actorName
	 * @return
	 */
	public TopologicalNode createNode(String actorName) {
		nameIDs.add(actorName);
		TopologicalNode newNode =
				ModelUtils.createPQBus(CIMmodel, baseVoltageObject, 0, 0);
		newNode.setMRID(actorName);
		CIMmodel.add(newNode);
		return newNode;
	}

	public void initialize() {
		CIMmodel = new Model();

		// base Voltage
		baseVoltageObject =
				ModelUtils.createBaseVoltage(CIMmodel, standardVoltage);
		CIMmodel.add(baseVoltageObject);

		// create swing bus
		TopologicalNode swingNode =
				ModelUtils.createSlackBus(CIMmodel, baseVoltageObject);
		swingNode.setMRID("swingNode");
		CIMmodel.setSWINGNode(swingNode);
		CIMmodel.add(swingNode);
		lastNode = swingNode;
	}

	/**
	 * The method connects two nodes with a standard line configuration, that is
	 * defined in the ModeUtils.class
	 * 
	 * @param sourceNode
	 * @param destNode
	 */
	public void connectNodes(TopologicalNode sourceNode,
			TopologicalNode destNode) {
		ModelUtils.createDefaultLine(CIMmodel, sourceNode, destNode);
		lastNode = destNode;
	}

	/**
	 * The method connects two nodes using a special line configuration.
	 * 
	 * @param sourceNode
	 * @param destNode
	 * @param lineConf
	 */
	public void connectNodes(TopologicalNode sourceNode,
			TopologicalNode destNode, LineConfiguration lineConf) {
		ModelUtils.createLine(CIMmodel, sourceNode, destNode, lineConf.R,
				lineConf.X);
		lastNode = destNode;
	}

	public TopologicalNode getLastNode() {
		return this.lastNode;
	}

	/**
	 * This method creates the mapping between the actorTopology and the
	 * powerflowModel
	 * 
	 * @param top 
	 */
	public void autoMap(ActorTopology top) {
		try {
			PowerflowMapping.autoMap(top, this);
		} catch (AutoMapException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates the powerFlowModel from an RDFfile
	 * 
	 * @param rdfFile
	 *            used as input
	 */
	public void generatePowerflowModelUsingRDFFile(File rdfFile) {
		RDFImporter importer = new RDFImporter();
		this.CIMmodel = importer.importRDF(rdfFile);
	}

	/**
	 * Generate a powerFlowModel with int:buses and a desired topologyType
	 * 
	 * @param buses
	 * @param topologyType
	 */
	public void generatePowerFlowModel(int buses, PowerflowType topologyType) {
		TopologyGenerator pfModelGenerator = new TopologyGenerator();
		if (topologyType.equals(PowerflowType.LINE)) {
			this.CIMmodel =
					pfModelGenerator.generateLineDistributionSystem(buses);
		} else if (topologyType.equals(PowerflowType.RADIAL)) {
			this.CIMmodel =
					pfModelGenerator.generateRadialDistributionSystem(
							Math.round((float) Math.ceil(buses / 4)), 4);
		} else if (topologyType.equals(PowerflowType.MESH)) {
			this.CIMmodel =
					pfModelGenerator
							.generateConsumerFullMeshDistributionSystem(buses);
		}
	}
}
