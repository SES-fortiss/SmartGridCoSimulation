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
import java.util.HashMap;
import java.util.HashSet;

import org.apache.commons.lang3.RandomStringUtils;
import org.fortiss.powerflowsim.importers.RDFImporter;
import org.fortiss.powerflowsim.importers.TopologyGenerator;
import org.fortiss.powerflowsim.model.AdditionalInformationMapping;
import org.fortiss.powerflowsim.model.CimModel;
import org.fortiss.powerflowsim.model.ExtendedTopologyInformation;
import org.fortiss.powerflowsim.model.ModelUtils;

import powerflowApi.helper.AutoMapException;
import topology.ActorTopology;
import CIM15.IEC61970.Core.BaseVoltage;
import CIM15.IEC61970.Core.ConnectivityNode;
import CIM15.IEC61970.Core.CoreFactory;
import CIM15.IEC61970.Core.PhaseCode;
import CIM15.IEC61970.Core.Terminal;
import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Wires.ACLineSegment;
import CIM15.IEC61970.Wires.EnergySource;
import CIM15.IEC61970.Wires.WiresFactory;

/**
 * The PowerflowTopology class is used to interact with the powerflowApi. It
 * contains a CimModel according to CIM. It also provides some generation
 * methods.
 * 
 * @since Mar 16, 2014
 * @author Martin Zellner
 * @author Denis Bytschkow
 * 
 */
public class PowerflowTopology {	
	
	/*
	 * The decision to have an extra class that contains the model, instead of
	 * using the model directly is based on the splitting the packages of the
	 * core functionalities - the actors representing the communication and the
	 * powerflow solver.
	 */

	public CimModel CIMmodel; // The CIM Model
	public HashSet<String> nameIDs = new HashSet<String>();
	public HashMap<String, String> mapping = new HashMap<String, String>();

	private TopologicalNode lastNode;
	private BaseVoltage baseVoltageObject;
	private double standardVoltage = 1;

	/**
	 * This class constructor creates a new PowerflowModel with a predefined
	 * slackBus / swingNode.
	 */
	public PowerflowTopology() {
		initialize();
	}

	public PowerflowTopology(CimModel CIMmodel) {
		this.CIMmodel = CIMmodel;
	}

	public void addNodeBelow(String actorName) {
		TopologicalNode newNode = createPQNode(actorName);
		ModelUtils.createDefaultLine(CIMmodel, lastNode, newNode);
		lastNode = newNode;
	}
	
	public void setStandardVoltage(double voltage){
		standardVoltage = voltage;
		baseVoltageObject.setNominalVoltage((float) standardVoltage);
	}

	/**
	 * creates a new TopologicalNode (PQBus) and adds that to the model.
	 * 
	 * @param actorName
	 * @return
	 */
	public TopologicalNode createPQNode(String actorName) {
		nameIDs.add(actorName);
		TopologicalNode newNode = ModelUtils.createPQBus(CIMmodel, baseVoltageObject, 0, 0);
		newNode.setMRID(actorName);
		CIMmodel.add(newNode);		
		return newNode;
	}
	
	/**
	 * creates a new TopologicalNode (PVBus) and adds that to the model.
	 * 
	 * @param actorName
	 * @return
	 */
	public TopologicalNode createPVNode(String actorName){
		TopologicalNode newNode = createPVNode(actorName, 0, 0);
		return newNode;
	}
	
	public TopologicalNode createPVNode(String actorName, double power, double voltageMagnitude) {
		nameIDs.add(actorName);
		TopologicalNode newNode = ModelUtils.createPVBus(CIMmodel, baseVoltageObject, power, voltageMagnitude, 0);
		newNode.setMRID(actorName);
		CIMmodel.add(newNode);
		return newNode;
	}
	
	
	/*
	public void test(){
		TopologicalNode newNode = ModelUtils.createPVBus(model, baseVoltage, Pq, voltage_magnitude, voltage_angle)
	}
	*/

	public void initialize() {
		CIMmodel = new CimModel();

		// create base voltage object
		baseVoltageObject = ModelUtils.createBaseVoltage(CIMmodel, standardVoltage);
		CIMmodel.add(baseVoltageObject);

		// create swing bus
		TopologicalNode swingNode = ModelUtils.createSlackBus(CIMmodel, baseVoltageObject);
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
	public void connectNodes(TopologicalNode sourceNode,TopologicalNode destNode, LineConfiguration lineConf) {	
		
		ACLineSegment lineSegment = ModelUtils.createLine(CIMmodel, sourceNode, destNode, lineConf.getR(), lineConf.getX(), lineConf.getB()); 
		
		if (  lineConf instanceof LineConfigurationWithTransformer) {
			ExtendedTopologyInformation eti = new ExtendedTopologyInformation();			
			eti.setTansformerRatio(((LineConfigurationWithTransformer) lineConf).getRatio());			
			AdditionalInformationMapping.lineETI_HashMap.put(lineSegment,eti);	
		}
		
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

	// note:if this method is called several times, this might lead to a bug
	public void setSwingNodeVoltage(double voltage_magnitude) {
		TopologicalNode swing = this.CIMmodel.getSWINGNode();
		
		ConnectivityNode connectivityNode = swing.getConnectivityNodes().get(0);
		
		EnergySource source = WiresFactory.eINSTANCE.createEnergySource();
		source.setMRID("ID-" + RandomStringUtils.random(8, true, true));		
		source.setVoltageMagnitude((float) voltage_magnitude);
		source.setBaseVoltage(swing.getBaseVoltage());
		
		this.CIMmodel.model.add(source);
		
		Terminal sourceTerminal = CoreFactory.eINSTANCE.createTerminal();
		sourceTerminal.setMRID("ID-" + RandomStringUtils.random(8, true, true));
		sourceTerminal.setConductingEquipment(source);
		sourceTerminal.setConnectivityNode(connectivityNode);
		sourceTerminal.setTopologicalNode(connectivityNode.getTopologicalNode());
		sourceTerminal.setPhases(PhaseCode.ABCN);
		this.CIMmodel.model.add(sourceTerminal);
		
	}
}
