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

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.fortiss.powerflowsim.model.AdditionalInformationMapping;
import org.fortiss.powerflowsim.model.CimModel;
import org.fortiss.powerflowsim.model.ExtendedTopologyInformation;
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
 * The BusBranchModel class. It consists of a vector I for the node currents, a vector U
 * for the node voltages and the admittance matrix Y connecting U and I.
 * 
 * @author murphy
 * @author denis
 * 
 */
public class BusBranchModel {
	
	private static Logger log = LogManager.getLogger(BusBranchModel.class);
	
	//public static ActorTopology actorTopology = null;
	
	public ComplexDoubleMatrix s;
	public ComplexDoubleMatrix voltVector; 	// bus voltages (n x 1)
	public ComplexDoubleMatrix i; 			// bus currents (n x 1)
	public ComplexDoubleMatrix yMatrix; 	// admittance matrix (n x n)
	public ComplexDoubleMatrix y_from; 		// admittance matrix with source lines (for powerflow calculation on the lines) (not n x n)
	public ComplexDoubleMatrix y_to; 		// admittance matrix with destination lines (for powerflow calculation on the lines) (not n x n)	
	public Integer numberOfNodes;
	public Integer numberOfBranches;

	public int swingNodeId;
	public List<Integer> pvNodeIds = new ArrayList<Integer>();
	public List<Integer> pqNodeIds = new ArrayList<Integer>();

	// maps for mapping CIM to the powerflow model
	public HashMap<TopologicalNode, Integer> nodeIndexMap = new HashMap<TopologicalNode, Integer>();
	public HashMap<Integer, TopologicalNode> indexNodeMap = new HashMap<Integer, TopologicalNode>();

	private HashMap<ACLineSegment, Integer> lineNumberMap =	new HashMap<ACLineSegment, Integer>();
	private HashMap<Integer, ACLineSegment> numberLineMap =	new HashMap<Integer, ACLineSegment>();

	// map for mapping with the nodeInformationMap
	private HashMap<Integer, NodeInformation> indexNodeInformationMap =
			new HashMap<Integer, NodeInformation>();

	private ComplexDoubleMatrix power_to_branch;
	private ComplexDoubleMatrix power_from_branch;

	// line connection map
	public int[] lineFrom;
	public int[] lineTo;
	public Set<Integer> lineSet = new HashSet<Integer>();

	/**
	 * creates a simulation model out of the internal CIM model, 
	 * i.e. this is a model transformation
	 * 
	 * @param model
	 */
	public BusBranchModel(CimModel model) {
		
		// previous solution only as reminder 
		// log.setLevel(Level.WARN);
		Configurator.setLevel(log.getName(), Level.WARN);

		// get the number of busses (represented through a topological node in CIM) and lines (represented through a ACLineSegment CIM object)
		numberOfNodes = model.getTopologicalNodes().size();
		numberOfBranches = model.getLines().size();

		initVariables(numberOfNodes, numberOfBranches);
		mapNodes(model);
		createLines(model);
		createLoadsAndGenerators(model);
		createNodeVoltages(model);
		createTransformers(model);
		evaluateNodeTypes(model);
		log.debug("Created  a simulation model with " + numberOfNodes + " nodes.");
		log.debug("Our SWING node has the CIM id " + model.getSWINGNode().getMRID() + " and is mapped to simulation node "	+ nodeIndexMap.get(model.getSWINGNode()));
	}

	/**
	 * map the nodes to the simulation busses
	 * 
	 * @param model
	 */
	private void mapNodes(CimModel model) {
		// SWING node will be at index 0
		// However, this is not a necessary property for the solver

		TopologicalNode swing = model.getSWINGNode();
		nodeIndexMap.put(swing, 0);
		indexNodeMap.put(0, swing);
		indexNodeInformationMap.put(0, new NodeInformation(swing, 0));
		
		int index = 1;
		for (TopologicalNode node : model.getTopologicalNodes()) {
			
			// each topological node is a bus			
			if (!node.equals(model.getSWINGNode())) {
				
				nodeIndexMap.put(node, index);
				indexNodeMap.put(index, node);				
				indexNodeInformationMap.put(index, new NodeInformation(node, index));
								
				if (AdditionalInformationMapping.nodeETI_HashMap.containsKey(node)) {
					ExtendedTopologyInformation eti = AdditionalInformationMapping.nodeETI_HashMap.get(node);
					
					ComplexDouble y11 = yMatrix.get(index, index);
					y11 = y11.add(new ComplexDouble(0, eti.getB_shunt()));
					yMatrix.put(index, index, y11);
					
					log.info("add b_shunt of: " + yMatrix.get(index, index) + " to Node" + node.getMRID());					
				}
								
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

		this.voltVector = new ComplexDoubleMatrix(numberOfNodes);
		this.i = new ComplexDoubleMatrix(numberOfNodes);
		this.s = new ComplexDoubleMatrix(numberOfNodes);

		this.yMatrix = new ComplexDoubleMatrix(numberOfNodes, numberOfNodes);
		
		this.y_from = new ComplexDoubleMatrix(numberOfBranches, numberOfNodes);
		this.y_to = new ComplexDoubleMatrix(numberOfBranches, numberOfNodes);

	}

	/**
	 * creates the line values in the admittance matrix y
	 * 
	 * @param model
	 *            the CIM model to get the line values from
	 */
	private void createLines(CimModel model) {
		
		/*
		 *  NOTE: This method was checked and seems correct
		 *  It does several things for every line:
		 *  - it creates several sets and lists for mapping
		 *  - it calculates all the admittances and adds them to
		 *  the overall admittance matrix.
		 *  - it modifies two further matrices: the y_from and y_to matrix.
		 *  Those two matrices helps for the calculation of the power flow.
		 * 
		 */

		int index = 0; // line index
		
		for (ACLineSegment line : model.getLines()) {
			// identify source and destination node indices with the help of the mapping
			
			Integer sourceNode =
					nodeIndexMap.get(line.getTerminals().get(0)
							.getTopologicalNode());
			
			Integer destNode =
					nodeIndexMap.get(line.getTerminals().get(1)
							.getTopologicalNode());

			// map line
			lineNumberMap.put(line, index);
			numberLineMap.put(index, line);
			
			// line connection set
			lineFrom[index] = sourceNode;									
			lineTo[index] = destNode;
			lineSet.add(index);

			// Add to the nodeInformationMap
			NodeInformation nodeSource = indexNodeInformationMap.get(sourceNode);
			NodeInformation nodeDest = indexNodeInformationMap.get(destNode);
			nodeSource.addLine(index, line);
			nodeDest.addLine(index, line);

			// calculate line properties
			Double r = new Double(line.getR());
			Double x = new Double(line.getX());
			Double g = new Double(line.getGch());
			Double b = new Double(line.getBch());
			
			ComplexDouble Z_s = new ComplexDouble(r, x);
			ComplexDouble Y_s = (new ComplexDouble(1.0)).div(Z_s);
			
			ComplexDouble B_shunt =	new ComplexDouble(g, b);  // the line shunts in Siemens
			ComplexDouble B_shuntD2 = B_shunt.div(2.0);
			log.debug("B_shunt_ " + B_shunt);			
			
			double tf = 1;
			double tfSquared = 1;
			
			if (AdditionalInformationMapping.lineETI_HashMap.containsKey(line)) {				
				tf = AdditionalInformationMapping.lineETI_HashMap.get(line).getTansformerRatio();
				tfSquared = tf * tf;
				log.info("transformerFactor is set to: " + tf);
			}			
			
			// calculate matrix elements by summation of the additional elements	
			ComplexDouble y11 = yMatrix.get(sourceNode, sourceNode);
			ComplexDouble y12 = yMatrix.get(sourceNode, destNode);
			ComplexDouble y21 = yMatrix.get(destNode, sourceNode);
			ComplexDouble y22 = yMatrix.get(destNode, destNode);

			// add matrix elements to y matrix			
			y11 = y11.add((Y_s.add(B_shuntD2)).div(tfSquared));
			y22 = y22.add(Y_s).add(B_shuntD2);
			
			y12 = y12.sub(Y_s.div(tf));
			y21 = y21.sub(Y_s.div(tf));
			
			yMatrix.put(sourceNode, sourceNode, y11);
			yMatrix.put(sourceNode, destNode, y12);
			yMatrix.put(destNode, sourceNode, y21);
			yMatrix.put(destNode, destNode, y22);
			
			// add matrix elements to y_from matrix
			ComplexDouble y11_from = y_from.get(index, sourceNode);
			ComplexDouble y12_from = y_from.get(index, destNode);
			
			y11_from = y11_from.add((Y_s.add(B_shuntD2)).div(tfSquared));
			y12_from = y12_from.sub(Y_s.div(tf));
			
			y_from.put(index, sourceNode, y11_from);
			y_from.put(index, destNode, y12_from);

			// add matrix elements to y_to matrix
			ComplexDouble y21_to = y_to.get(index, sourceNode);
			ComplexDouble y22_to = y_to.get(index, destNode);			
			
			y21_to = y21_to.sub(Y_s.div(tf));
			y22_to = y22_to.add(Y_s.add(B_shuntD2));
			
			y_to.put(index, sourceNode, y21_to);
			y_to.put(index, destNode, y22_to);
			
			index++;		
		}
	}

	private void createTransformers(CimModel model) {
		
		for (PowerTransformer transformer : model.getTransformers()) {
			Integer sourceNode =
					nodeIndexMap.get(transformer.getPowerTransformerEnd()
							.get(0).getTerminal().getTopologicalNode());
			Integer destNode =
					nodeIndexMap.get(transformer.getPowerTransformerEnd()
							.get(1).getTerminal().getTopologicalNode());

			// y_s
			// Note for reasons of simplification we assume that the admittance
			// and impedance on both sides are equal. This is an approximation
			// and could be fixed in future versions since CIM offers a deeper
			// level of detail.
			
			Double r = new Double(transformer.getPowerTransformerEnd().get(0).getR());
			Double x = new Double(transformer.getPowerTransformerEnd().get(0).getX());
			Double g = new Double(transformer.getPowerTransformerEnd().get(0).getG());
			Double b = new Double(transformer.getPowerTransformerEnd().get(0).getB());

			ComplexDouble Z_s = new ComplexDouble(r, x);
			ComplexDouble Y_s = (new ComplexDouble(1.0)).div(Z_s);
			
			ComplexDouble Bc = new ComplexDouble(g, b); // is already in Siemens (so reciprocal of ohm)

			ComplexDouble y11 = yMatrix.get(sourceNode, sourceNode);
			ComplexDouble y12 = yMatrix.get(sourceNode, destNode);
			ComplexDouble y21 = yMatrix.get(destNode, sourceNode);
			ComplexDouble y22 = yMatrix.get(destNode, destNode);
			
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

			yMatrix.put(sourceNode, sourceNode, y11);
			yMatrix.put(sourceNode, destNode, y12);
			yMatrix.put(destNode, sourceNode, y21);
			yMatrix.put(destNode, destNode, y22);

		}
	}

	private void createLoadsAndGenerators(CimModel model) {
		
		for (EnergyConsumer load : model.getLoads()) {
			Integer nodeId = nodeIndexMap.get(load.getTerminals().get(0).getTopologicalNode());
			this.s.put(nodeId, load.getPfixed(), load.getQfixed());
		}
		
		for (EnergySource source : model.getSources()) {
			Integer nodeId = nodeIndexMap.get(source.getTerminals().get(0).getTopologicalNode());
			ComplexDouble buffer = s.get(nodeId).add(source.getActivePower());
			this.s.put(nodeId, buffer);
		}
	}

	private void createNodeVoltages(CimModel model) {
		
		// first give all the nominal voltage, after that the voltage of a source
		for (TopologicalNode node : model.getTopologicalNodes()) {			
			voltVector.put(nodeIndexMap.get(node), node.getBaseVoltage().getNominalVoltage(), 0.0);
		}
		
		for (EnergySource source : model.getSources()) {
			Integer nodeId = nodeIndexMap.get(source.getTerminals().get(0).getTopologicalNode());			
			double voltage = source.getVoltageMagnitude();			
			voltVector.put(nodeId, voltage);
		}
	}

	private void evaluateNodeTypes(CimModel model) {
		this.swingNodeId = nodeIndexMap.get(model.getSWINGNode());

		for (TopologicalNode node : model.getTopologicalNodes()) {
			// if node is connected to at least one load, treat it as a PQ node
			boolean isSet = false;
			for (Terminal terminal : node.getTerminal()) {
				if (terminal.getConductingEquipment().getClass().equals(EnergyConsumer.class)) {
					this.pqNodeIds.add(nodeIndexMap.get(node));
					isSet = true;
					break;
				}
			}
			if (isSet == false && !node.equals(model.getSWINGNode())) {
				this.pvNodeIds.add(nodeIndexMap.get(node));
			}
		}
	}

	public void mapBusResult(int index, double voltageAbs, double voltageAngle, double powerReal, double powerImag) {
		TopologicalNode topologicalNode = indexNodeMap.get(index);

		SvVoltage svVoltage = StateVariablesFactory.eINSTANCE.createSvVoltage();
		svVoltage.setV((float) voltageAbs);
		svVoltage.setAngle((float) Math.toDegrees(voltageAngle));
		topologicalNode.setSvVoltage(svVoltage);

		SvInjection svInjection = StateVariablesFactory.eINSTANCE.createSvInjection();
		svInjection.setPNetInjection((float) powerReal);
		svInjection.setQNetInjection((float) powerImag);
		topologicalNode.setSvInjection(svInjection);
	}

	public void mapBranchResult(int branchIndex, double activePowerFrom,
			double reactivePowerFrom, double activePowerTo,	double reactivePowerTo) {
		ACLineSegment acLineSegment = numberLineMap.get(branchIndex);

		SvPowerFlow svPowerFlowSource =	StateVariablesFactory.eINSTANCE.createSvPowerFlow();
		svPowerFlowSource.setP((float) activePowerFrom);
		svPowerFlowSource.setQ((float) reactivePowerFrom);
		acLineSegment.getTerminals().get(0).setSvPowerFlow(svPowerFlowSource);

		SvPowerFlow svPowerFlowDest = StateVariablesFactory.eINSTANCE.createSvPowerFlow();
		svPowerFlowDest.setP((float) activePowerTo);
		svPowerFlowDest.setQ((float) reactivePowerTo);
		acLineSegment.getTerminals().get(1).setSvPowerFlow(svPowerFlowDest);
	}

	/**
	 * The getPowerToNode() method gives the power values for a node of interest
	 * with the convention that if power flows into the node, the sign is
	 * positive; if the power flows out of the node, the sign is negative.
	 * 
	 * @param index
	 * @return
	 */
	public NodeInformation getPowerToNode(int index) {
		
		NodeInformation nodeOfInterest = indexNodeInformationMap.get(index);
		ArrayList<Integer> list = nodeOfInterest.getPowerLineIndices();

		double nodeVoltage = 0; // This is required to find out the direction of the reactive power flow
		double otherVoltage = 0; // This is required to find out the direction of the reactive power flow
		double nodeAngle = 0; // this is required for active power flow determination
		double otherAngle = 0;	// this is required for active power flow determination

		for (Integer i : list) {
			ACLineSegment line = numberLineMap.get(i);
			List<Terminal> terminalList = line.getTerminals();
			TopologicalNode otherNode = null;

			for (Terminal terminal : terminalList) {
				TopologicalNode topNode = terminal.getTopologicalNode();
				double voltage = topNode.getSvVoltage().getV();
				double angle = topNode.getSvVoltage().getAngle();

				String mrid = topNode.getMRID();
				if (!mrid.equals(nodeOfInterest.nodeName)) {
					otherNode = topNode;
					otherVoltage = voltage;
					otherAngle = angle; 
				} else {
					nodeVoltage = voltage;
					nodeAngle = angle;
				}
			}
						
			ComplexDouble complexPowerA = power_from_branch.get(i);
			ComplexDouble complexPowerB = power_to_branch.get(i);
			
			double realA = complexPowerA.real();
			double realB = complexPowerB.real();
			double realLosses = realA + realB;			
			
			boolean angleDecreasing = (nodeAngle - otherAngle) > 0.0;	
			boolean AhigherB = (Math.abs(realA) >= Math.abs(realB)); 
			
			ComplexDouble complexHigh = (AhigherB) ? complexPowerA : complexPowerB;
			ComplexDouble complexLow = (!AhigherB) ? complexPowerA : complexPowerB;			
			 			
			if (complexHigh.real() < 0){
				complexHigh = complexHigh.neg();
			}
			
			if (complexLow.real() < 0) {
				complexLow = complexLow.neg();
			}
			
			ComplexDouble complexSelected = (angleDecreasing) ?  complexHigh.neg(): complexLow;
			ComplexDouble complexOther = (angleDecreasing) ?  complexLow : complexHigh.neg();
			
			boolean close = realLosses < 1e-6;
			
			// Man muss mehr Q reinstecken, als rauskommt, wegen vorhandenen Verlusten!!!			
			// die höhere Imaginäre Zahl muss ein negatives Vorzeichen haben!!!
						
			if (close) { // dann können zufällige nummerische Unsicherheiten dominieren
				double imagA = complexSelected.imag();
				double imagB = complexOther.imag();						
				
				boolean selectedHasHigherAbsValue = (Math.abs(imagA) >= Math.abs(imagB));
				boolean selectedHasNegativeSign = (0 >  Math.signum(imagA));
				boolean voltageDecreasing = (nodeVoltage > otherVoltage);
				
				if (imagA > 0 && selectedHasHigherAbsValue) {					
					if (Math.abs(complexSelected.real()) < 0.00001 && voltageDecreasing) {
						complexSelected = complexSelected.neg();
					} else {
						complexSelected = complexOther.neg();
					}
				}				
				
				if (!selectedHasHigherAbsValue && selectedHasNegativeSign) {
					complexSelected = complexOther.neg();
				}
			}	
			nodeOfInterest.setVoltage(nodeVoltage, nodeAngle);
			nodeOfInterest.addLine(new NodeLineInformation(complexSelected, realLosses, otherNode));
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
