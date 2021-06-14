/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.fortiss.powerflowsim.Properties;

import CIM15.IEC61970.Core.ConductingEquipment;
import CIM15.IEC61970.Core.ConnectivityNode;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.Terminal;
import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Topology.TopologyFactory;
import CIM15.IEC61970.Wires.ACLineSegment;
import CIM15.IEC61970.Wires.EnergyConsumer;
import CIM15.IEC61970.Wires.EnergySource;
import CIM15.IEC61970.Wires.PowerTransformer;

/**
 * internal data model for the powerflowsim
 * 
 * @author Martin Zellner
 * 
 */
public class CimModel {

	private static Logger log = LogManager.getLogger(CimModel.class);
	public Set<Object> model = new HashSet<Object>();
	private TopologicalNode swingNode;

	/**
	 * Creates a new empty Model
	 */
	public CimModel() {
		Configurator.setLevel("org.fortiss.powerflowsim.model.CimModel", Level.DEBUG);		
	}

	/**
	 * add object to the model
	 * 
	 * @param object
	 *            the object to be added
	 */
	public void add(Object object) {
		this.model.add(object);
	}

	/**
	 * returns an object with the specified mrid
	 * 
	 * @param mrid
	 * @return the object in the model
	 */
	public Object getObjectWithMRID(String mrid) {
		
		for (Object object : this.model) {
			if (((IdentifiedObject) object).getMRID().equals(mrid)) {
				return object;
			}
		}
		log.warn("powerflow.model.Model.getObjectWithMRID() - Could not find object with mRID: " + mrid);

		return null;
	}

	public Set<Object> getAllObjects() {
		return model;
	}

	/**
	 * gets all objects in a model with the given class
	 * 
	 * @param objectClass
	 * @return a HashSet that contains all objects
	 */
	public Set<Object> getAllObjectsWithClass(Class<?> objectClass) {
		Set<Object> objectSet = new HashSet<Object>();

		for (Object object : this.model) {
			if (object.getClass().equals(objectClass)) {
				objectSet.add(object);
			}
		}
		return objectSet;
	}

	/**
	 * gets all connectivityNodes of a model
	 * 
	 * @param model
	 * @return
	 */
	public Set<Object> getConnectivityNodes() {

		return this.getAllObjectsWithClass(ConnectivityNode.class);

	}

	/**
	 * gets all topological nodes of a model
	 * 
	 * @param model
	 * @return
	 */
	public Set<TopologicalNode> getTopologicalNodes() {
		Set<TopologicalNode> nodeSet = new HashSet<TopologicalNode>();
		for (Object node : this.getAllObjectsWithClass(TopologicalNode.class)) {
			nodeSet.add((TopologicalNode) node);
		}
		return nodeSet;

	}

	/**
	 * gets all lines of a model
	 * 
	 * @param model
	 * @return
	 */
	public Set<ACLineSegment> getLines() {
		Set<ACLineSegment> lineSet = new HashSet<ACLineSegment>();
		for (Object line : this.getAllObjectsWithClass(ACLineSegment.class)) {
			lineSet.add((ACLineSegment) line);
		}
		return lineSet;

	}

	/**
	 * gets all loads of a model
	 * 
	 * @param model
	 * @return
	 */
	public Set<EnergyConsumer> getLoads() {
		Set<EnergyConsumer> loadSet = new HashSet<EnergyConsumer>();
		for (Object load : this.getAllObjectsWithClass(EnergyConsumer.class)) {
			loadSet.add((EnergyConsumer) load);
		}
		return loadSet;

	}

	/**
	 * gets all sources of a model
	 * 
	 * @param model
	 * @return
	 */
	public Set<EnergySource> getSources() {
		Set<EnergySource> sourceSet = new HashSet<EnergySource>();
		for (Object source : this.getAllObjectsWithClass(EnergySource.class)) {
			sourceSet.add((EnergySource) source);
		}
		return sourceSet;

	}

	/**
	 * get all primary equipment contained in the model
	 * 
	 * @return a Set with all Primary Equipment of the model
	 */
	public Set<Object> getPrimaryEquipment() {

		Set<Object> primaryEquipmentList = new HashSet<Object>();

		for (Class<?> currentClass : Properties.primaryEquipmentClasses) {
			primaryEquipmentList.addAll(this.getAllObjectsWithClass(currentClass));
		}

		return primaryEquipmentList;

	}

	public TopologicalNode getSWINGNode() {
		return this.swingNode;
	}

	public void setSWINGNode(TopologicalNode topologicalNode) {
		this.swingNode = topologicalNode;
	}

	public void setSWINGNodeWithMRID(String mrid) {
		try {
			this.swingNode = (TopologicalNode) getObjectWithMRID(mrid);
		} catch (ClassCastException ex) {
			log.error("A SWING node must be a TopologicalNode");
		}
	}

	/**
	 * gets all PowerTransformers of a model
	 * 
	 * @return
	 */
	public Set<PowerTransformer> getTransformers() {
		Set<PowerTransformer> transformerSet = new HashSet<PowerTransformer>();
		for (Object transformer : this.getAllObjectsWithClass(PowerTransformer.class)) {
			transformerSet.add((PowerTransformer) transformer);
		}
		return transformerSet;
	}

	/**
	 * Creates Topological Nodes automatically
	 * 
	 * @param model
	 * @return the new model Containing the Topological Nodes
	 */
	public void createTopologicalNodes() {
		Map<Object, Boolean> primaryEquipmentMap = createPrimaryEquipmentMap();
		Map<Object, Boolean> connectivityNodesMap = createConnectivityNodesMap();

		// for each piece of primary equipment;
		for (Map.Entry<Object, Boolean> primaryEquipment : primaryEquipmentMap.entrySet()) {
			// if the equipment has not been processed
			if (primaryEquipment.getValue() == false) {

				// for each of the equipment's unprocessed connectivity nodes
				for (Terminal terminal : ((ConductingEquipment) primaryEquipment.getKey()).getTerminals()) {

					ConnectivityNode connectivityNode = terminal.getConnectivityNode();
					if (connectivityNode != null && connectivityNode.getTopologicalNode() == null) {
						if (connectivityNodesMap.get(connectivityNode) == false) {

							// create a new topological node
							TopologyFactory topologyFactory = TopologyFactory.eINSTANCE;
							TopologicalNode topologicalNode = topologyFactory.createTopologicalNode();
							topologicalNode.setMRID(connectivityNode.getMRID() + "_TopoNode");
							terminal.setTopologicalNode(topologicalNode);
							topologicalNode.setBaseVoltage(((ConductingEquipment) primaryEquipment.getKey()).getBaseVoltage());
							model.add(topologicalNode);

							// add the current connectivity node to the current
							// topological node
							connectivityNode.setTopologicalNode(topologicalNode);
							// mark the connectivity node as having been
							// processed
							connectivityNodesMap.put(connectivityNode, true);

							// for each of the connectivity node's other
							// connected
							// equipment
							for (Terminal otherTerminals : connectivityNode.getTerminals()) {
								otherTerminals.setTopologicalNode(topologicalNode);

								// if the equipment is a piece of primary
								// equipment
								// or open switch
								if (otherTerminals.getConductingEquipment().getClass().equals(ACLineSegment.class)) {
									// stop

									break;
									// otherwise
								} else {
									// find the equipment's other connectivity
									// nodes;
									// // for each of these connectivity nodes
									for (Terminal otherTerminal : otherTerminals.getConductingEquipment().getTerminals()) {
										// // // // // // // go back to step 5
										otherTerminal.getConnectivityNode().setTopologicalNode(topologicalNode);
										otherTerminal.setTopologicalNode(topologicalNode);

										connectivityNodesMap.put(otherTerminal.getConnectivityNode(), true);
									}

								}

							}
						}
					}

				}
			}
		}

		// To make sure all Terminals are associated with the right Topological
		// Node
		/*
		 * for (Object topoNode :
		 * this.getAllObjectsWithClass(TopologicalNode.class)) { for
		 * (ConnectivityNode connNode : ((TopologicalNode)
		 * topoNode).getConnectivityNodes()) { for (Terminal term :
		 * connNode.getTerminals()) { term.setTopologicalNode((TopologicalNode)
		 * topoNode); } } }
		 */
	}

	private Map<Object, Boolean> createPrimaryEquipmentMap() {
		Map<Object, Boolean> primaryEquipmentMap = new HashMap<Object, Boolean>();
		for (Object object : getPrimaryEquipment()) {
			primaryEquipmentMap.put(object, false);
		}
		return primaryEquipmentMap;
	}

	private Map<Object, Boolean> createConnectivityNodesMap() {
		Map<Object, Boolean> connectivityNodesMap = new HashMap<Object, Boolean>();
		for (Object object : getConnectivityNodes()) {
			connectivityNodesMap.put(object, false);
		}
		return connectivityNodesMap;
	}
}
