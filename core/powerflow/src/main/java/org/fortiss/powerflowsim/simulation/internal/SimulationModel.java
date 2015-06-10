/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.simulation.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.fortiss.powerflowsim.model.Model;
import org.jblas.ComplexDouble;
import org.jblas.ComplexDoubleMatrix;

import CIM15.IEC61970.Core.Terminal;
import CIM15.IEC61970.StateVariables.StateVariablesFactory;
import CIM15.IEC61970.StateVariables.SvInjection;
import CIM15.IEC61970.StateVariables.SvPowerFlow;
import CIM15.IEC61970.StateVariables.SvVoltage;
import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Wires.ACLineSegment;
import CIM15.IEC61970.Wires.EnergyConsumer;
import CIM15.IEC61970.Wires.EnergySource;
import CIM15.IEC61970.Wires.PowerTransformer;

/**
 * a simulation model consists of a vector I for the node currents, a vector U
 * for the node voltages and the admittance matrix Y connecting U and I
 * 
 * @author murphy
 * 
 */
public class SimulationModel {
	private static Logger log = Logger.getRootLogger();
	public ComplexDoubleMatrix v; // bus voltages (n x 1)
	public ComplexDoubleMatrix i; // bus currents (n x 1)
	public ComplexDoubleMatrix y; // admittance matrix (n x n)
	public ComplexDoubleMatrix y_from; // admittance matrix with source lines (for powerflow calculation on the lines) (n x n)
	public ComplexDoubleMatrix y_to; // admittance matrix with destination lines (for powerflow calculation on the lines) (n x n)
	public ComplexDoubleMatrix s_d; // demand vector
	public ComplexDoubleMatrix s_g; // generation vector
	public Integer numberOfNodes;
	public Integer numberOfBranches;

	public int swingNodeId;
	public List<Integer> pvNodeIds = new ArrayList<Integer>();
	public List<Integer> pqNodeIds = new ArrayList<Integer>();

	// maps for mapping CIM to the powerflow model
	public HashMap<TopologicalNode, Integer> nodeNumberMap = new HashMap<TopologicalNode, Integer>();
	public HashMap<Integer, TopologicalNode> numberNodeMap = new HashMap<Integer, TopologicalNode>();

	private HashMap<ACLineSegment, Integer> lineNumberMap =	new HashMap<ACLineSegment, Integer>();
	private HashMap<Integer, ACLineSegment> numberLineMap =	new HashMap<Integer, ACLineSegment>();

	// map for mapping with the nodeInformationMap
	private HashMap<Integer, NodeInformation> nodeInformationMap =
			new HashMap<Integer, NodeInformation>();

	private ComplexDoubleMatrix power_to_branch;
	private ComplexDoubleMatrix power_from_branch;

	// line connection map
	public int[] lineFrom;
	public int[] lineTo;
	public Set<Integer> lineSet = new HashSet<Integer>();

	/**
	 * creates a simulation model out of the internal CIM model
	 * 
	 * @param model
	 */
	public SimulationModel(Model model) {

		// get the number of busses (represented through a topological node in CIM) and lines (represented through a ACLineSegment CIM object)
		numberOfNodes = model.getTopologicalNodes().size();
		numberOfBranches = model.getLines().size();

		initVariables(numberOfNodes, numberOfBranches);
		mapNodes(model);
		createLines(model);
		createLoads(model);
		createGenerators(model);
		createNodeVoltages(model);
		createTransformers(model);
		evaluateNodeTypes(model);
		log.debug("Created  a simulation model with " + numberOfNodes + " nodes.");
		log.debug("Our SWING node has the CIM id " + model.getSWINGNode().getMRID() + " and is mapped to simulation node "	+ nodeNumberMap.get(model.getSWINGNode()));
	}

	/**
	 * map the nodes to the simulation busses
	 * 
	 * @param model
	 */
	private void mapNodes(Model model) {
		// SWING node must be at index 0

		TopologicalNode swing = model.getSWINGNode();
		nodeNumberMap.put(swing, 0);
		numberNodeMap.put(0, swing);
		nodeInformationMap.put(0, new NodeInformation(swing, 0));

		int index = 1;
		for (TopologicalNode node : model.getTopologicalNodes()) {
			if (!node.equals(model.getSWINGNode())) {
				nodeNumberMap.put(node, index);
				numberNodeMap.put(index, node);
				nodeInformationMap.put(index, new NodeInformation(node, index));
				index++;
			}
		}
	}

	/**
	 * initialize the variables of the simulation models (create JBLAS matrices and vectors)
	 * @param numberOfNodes
	 * @param numberOfBranches
	 */
	private void initVariables(Integer numberOfNodes, Integer numberOfBranches) {

		this.lineFrom = new int[numberOfBranches];
		this.lineTo = new int[numberOfBranches];

		this.v = new ComplexDoubleMatrix(numberOfNodes);
		this.i = new ComplexDoubleMatrix(numberOfNodes);
		this.s_d = new ComplexDoubleMatrix(numberOfNodes);
		this.s_g = new ComplexDoubleMatrix(numberOfNodes);

		this.y = new ComplexDoubleMatrix(numberOfNodes, numberOfNodes);		
		this.y_from = new ComplexDoubleMatrix(numberOfBranches, numberOfNodes);
		this.y_to = new ComplexDoubleMatrix(numberOfBranches, numberOfNodes);

	}

	/**
	 * creates the line values in the admittance matrix y
	 * 
	 * @param model
	 *            the CIM model to get the line values from
	 */
	private void createLines(Model model) {
		int index = 0; // line index
		for (ACLineSegment line : model.getLines()) {
			// identify source and destination node indices with the help of the mapping
			Integer sourceNode =
					nodeNumberMap.get(line.getTerminals().get(0)
							.getTopologicalNode());
			Integer destNode =
					nodeNumberMap.get(line.getTerminals().get(1)
							.getTopologicalNode());

			// map line
			lineNumberMap.put(line, index);
			numberLineMap.put(index, line);

			// line connection set
			lineFrom[index] = sourceNode;
			lineTo[index] = destNode;
			lineSet.add(index);

			// Add to the nodeInformationMap
			NodeInformation nodeSource = nodeInformationMap.get(sourceNode);
			NodeInformation nodeDest = nodeInformationMap.get(destNode);
			nodeSource.addLine(index, line);
			nodeDest.addLine(index, line);

			// some logging for debugging
			if (log.isDebugEnabled()) {
				String fromStr = "   From: " + numberNodeMap.get(sourceNode).getMRID();
				String toStr = "   To: " + numberNodeMap.get(destNode).getMRID();
				log.debug("Line Index: " + index + fromStr + toStr);
			}

			// calculate line properties
			Double r = new Double(line.getR());
			Double x = new Double(line.getX());
			Double g = new Double(line.getGch());
			Double b = new Double(line.getBch());

			ComplexDouble Z_s = new ComplexDouble(r, x);
			ComplexDouble Y_s = (new ComplexDouble(1.0)).div(Z_s);
			ComplexDouble Bc =	new ComplexDouble(g, b);

			// calculate matrix elements
			ComplexDouble y11 = y.get(sourceNode, sourceNode);
			ComplexDouble y12 = y.get(sourceNode, destNode);
			ComplexDouble y21 = y.get(destNode, sourceNode);
			ComplexDouble y22 = y.get(destNode, destNode);

			// add matrix elements to y matrix
			y11 = y11.add(Bc.div(2.0)).add(Y_s);
			y22 = y22.add(Bc.div(2.0)).add(Y_s);	
			y12 = y12.sub(Y_s);
			y21 = y21.sub(Y_s);

			y.put(sourceNode, sourceNode, y11);
			y.put(sourceNode, destNode, y12);
			y.put(destNode, sourceNode, y21);
			y.put(destNode, destNode, y22);

			// add matrix elements to y_from matrix
			ComplexDouble y11_from = y_from.get(index, sourceNode);
			ComplexDouble y12_from = y_from.get(index, destNode);
			y11_from = y11_from.add(Bc.div(2.0)).add(Y_s);
			y12_from = y12_from.sub(Y_s);
			
			y_from.put(index, sourceNode, y11_from);
			y_from.put(index, destNode, y12_from);

			// add matrix elements to y_to matrix
			ComplexDouble y21_to = y_to.get(index, sourceNode);
			ComplexDouble y22_to = y_to.get(index, destNode);
			y22_to = y22_to.add(Bc.div(2.0)).add(Y_s);
			y21_to = y21_to.sub(Y_s);
			y_to.put(index, sourceNode, y21_to);
			y_to.put(index, destNode, y22_to);

			index++;
		}
	}

	private void createTransformers(Model model) {
		for (PowerTransformer transformer : model.getTransformers()) {
			Integer sourceNode =
					nodeNumberMap.get(transformer.getPowerTransformerEnd()
							.get(0).getTerminal().getTopologicalNode());
			Integer destNode =
					nodeNumberMap.get(transformer.getPowerTransformerEnd()
							.get(1).getTerminal().getTopologicalNode());

			// y_s
			// TODO for reasons of simplification we assume that the admittance
			// and impedance on both sides are equal. This is an approximation
			// and could be fixed in future versions since CIM offers a deeper
			// level of detail.
			Double r = new Double(transformer.getPowerTransformerEnd().get(0).getR());
			Double x = new Double(transformer.getPowerTransformerEnd().get(0).getX());
			Double g = new Double(transformer.getPowerTransformerEnd().get(0).getG());
			Double b = new Double(transformer.getPowerTransformerEnd().get(0).getB());

			ComplexDouble Z_s = new ComplexDouble(r, x);
			ComplexDouble Y_s = (new ComplexDouble(1.0)).div(Z_s);
			ComplexDouble Bc = new ComplexDouble(g, b);

			ComplexDouble y11 = y.get(sourceNode, sourceNode);
			ComplexDouble y12 = y.get(sourceNode, destNode);
			ComplexDouble y21 = y.get(destNode, sourceNode);
			ComplexDouble y22 = y.get(destNode, destNode);

			ComplexDouble rat;
			int ratio_normal_step = transformer.getPowerTransformerEnd().get(0).getRatioTapChanger().getNormalStep();
			int phase_normal_sept = transformer.getPowerTransformerEnd().get(0).getPhaseTapChanger().getNormalStep();
			double ratio = transformer.getPowerTransformerEnd().get(0).getRatioTapChanger().getRatioTapChangerTabular().getRatioTapChangerTabularPoint().get(ratio_normal_step).getRatio();
			double phase = transformer.getPowerTransformerEnd().get(0)
							.getPhaseTapChanger().getPhaseTapChangerTabular()
							.getPhaseTapChangerTabularPoint()
							.get(phase_normal_sept).getAngle();

			rat = new ComplexDouble(ratio * Math.cos(phase), ratio * Math.sin(phase));

			ComplexDouble rat_conj = rat.conj();
			ComplexDouble rat_squared = rat.mul(rat);

			// (Ys + Bc/2 ) / r^2
			y11 = y11.add(Y_s.add(Bc.div(2.0)).div(rat_squared));
			y22 = y22.add(Y_s).add(Bc.div(2.0));
			y12 = y12.sub(Y_s.mul(rat_conj));
			y21 = y21.sub(Y_s.mul(rat));

			y.put(sourceNode, sourceNode, y11);
			y.put(sourceNode, destNode, y12);
			y.put(destNode, sourceNode, y21);
			y.put(destNode, destNode, y22);

		}
	}

	private void createLoads(Model model) {
		for (EnergyConsumer load : model.getLoads()) {
			Integer nodeId =
					nodeNumberMap.get(load.getTerminals().get(0)
							.getTopologicalNode());
			this.s_d.put(nodeId, load.getPfixed(), load.getQfixed());
		}
	}

	private void createGenerators(Model model) {
		for (EnergySource source : model.getSources()) {
			Integer nodeId =
					nodeNumberMap.get(source.getTerminals().get(0)
							.getTopologicalNode());
			this.s_g.put(nodeId, source.getActivePower(), 0);
		}
	}

	private void createNodeVoltages(Model model) {
		for (TopologicalNode node : model.getTopologicalNodes()) {
			this.v.put(nodeNumberMap.get(node), node.getBaseVoltage()
					.getNominalVoltage(), 0.0);
		}
	}

	private void evaluateNodeTypes(Model model) {
		this.swingNodeId = nodeNumberMap.get(model.getSWINGNode());

		for (TopologicalNode node : model.getTopologicalNodes()) {
			// if node is connected to at least one load, treat it as a PQ node
			boolean isSet = false;
			for (Terminal terminal : node.getTerminal()) {
				if (terminal.getConductingEquipment().getClass()
						.equals(EnergyConsumer.class)) {
					this.pqNodeIds.add(nodeNumberMap.get(node));
					isSet = true;
					break;
				}
			}
			if (isSet == false && !node.equals(model.getSWINGNode())) {
				this.pvNodeIds.add(nodeNumberMap.get(node));
			}
		}
	}

	public void mapBusResult(int index, double voltageAbs, double voltageAngle,
			double powerReal, double powerImag) {
		TopologicalNode topologicalNode = numberNodeMap.get(index);

		SvVoltage svVoltage = StateVariablesFactory.eINSTANCE.createSvVoltage();
		svVoltage.setV((float) voltageAbs);
		svVoltage.setAngle((float) Math.toDegrees(voltageAngle));
		topologicalNode.setSvVoltage(svVoltage);

		SvInjection svInjection =
				StateVariablesFactory.eINSTANCE.createSvInjection();
		svInjection.setPNetInjection((float) powerReal);
		svInjection.setQNetInjection((float) powerImag);
		topologicalNode.setSvInjection(svInjection);
	}

	public void mapBranchResult(int branchIndex, double activePowerFrom,
			double reactivePowerFrom, double activePowerTo,
			double reactivePowerTo) {
		ACLineSegment acLineSegment = numberLineMap.get(branchIndex);

		SvPowerFlow svPowerFlowSource =
				StateVariablesFactory.eINSTANCE.createSvPowerFlow();
		svPowerFlowSource.setP((float) activePowerFrom);
		svPowerFlowSource.setQ((float) reactivePowerFrom);
		acLineSegment.getTerminals().get(0).setSvPowerFlow(svPowerFlowSource);

		SvPowerFlow svPowerFlowDest =
				StateVariablesFactory.eINSTANCE.createSvPowerFlow();
		svPowerFlowDest.setP((float) activePowerTo);
		svPowerFlowDest.setQ((float) reactivePowerTo);
		acLineSegment.getTerminals().get(1).setSvPowerFlow(svPowerFlowDest);
	}

	/**
	 * The getPowerToNode() method gives the power values for a node of interest
	 * with the convention that if power flows into the node the sign is
	 * positive if the power flows out of the node the sign is negative.
	 * 
	 * @param index
	 * @return
	 */
	public NodeInformation getPowerToNode(int index) {
		NodeInformation nodeOfInterest = nodeInformationMap.get(index);
		ArrayList<Integer> list = nodeOfInterest.getPowerLineInzies();

		double nodeVoltage = 0; // This is required to find out the
								// direction of the power flow
		double otherVoltage = 0; // This is required to find out the
									// direction of the power flow

		for (Integer i : list) {
			ACLineSegment line = numberLineMap.get(i);
			List<Terminal> terminalList = line.getTerminals();// you will get
																// two Terminals
			TopologicalNode otherNode = null;

			for (Terminal terminal : terminalList) {
				TopologicalNode topNode = terminal.getTopologicalNode();
				double voltage = topNode.getSvVoltage().getV();

				String mrid = topNode.getMRID();
				if (!mrid.equals(nodeOfInterest.nodeName)) {
					otherNode = topNode;
					otherVoltage = voltage;
				} else
					nodeVoltage = voltage;
			}

			double powerA = Math.abs(power_from_branch.get(i).real());
			double powerB = Math.abs(power_to_branch.get(i).real());
			double powerHigh = (powerA > powerB) ? powerA : powerB;
			double powerLow = (powerA < powerB) ? powerA : powerB;
			double power = (nodeVoltage > otherVoltage) ? -powerHigh : powerLow;

			nodeOfInterest.voltage = nodeVoltage;
			nodeOfInterest.lines.add(new NodeLineInformation(power, otherNode));

		}
		return nodeOfInterest;
	}

	/**
	 * @param power_to_branch
	 * @param power_from_branch
	 */
	public void setPowerValues(ComplexDoubleMatrix power_to_branch,
			ComplexDoubleMatrix power_from_branch) {
		this.power_from_branch = power_from_branch;
		this.power_to_branch = power_to_branch;
	}
}
