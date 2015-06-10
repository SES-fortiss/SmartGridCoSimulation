/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package powerflowApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.fortiss.powerflowsim.model.Model;
import org.fortiss.powerflowsim.simulation.internal.SimulationModel;
import org.fortiss.powerflowsim.simulation.internal.Solver;

import CIM15.IEC61970.Core.ConductingEquipment;
import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Wires.EnergyConsumer;
import CIM15.IEC61970.Wires.EnergySource;
import configuration.GridArchitectConfiguration;

/**
 * PowerflowApi is used to initialize trigger the solver to calculate the
 * powerflow equations.
 * 
 * @author Denis Bytschkow
 * @since Mar 13, 2014
 *
 */
public class PowerflowApi {

	public static void execute() {
		
		System.out.println(PowerflowMapping.getPowerflowModel() + " --- Hello");
		Model cimModel = PowerflowMapping.getPowerflowModel().CIMmodel;

		for (String key : PowerflowMapping.actorResultsMap.keySet()) {
			// get mrid from mapping
			String mRID = PowerflowMapping.pathMridMap.get(key);

			// get object for mapped mRID
			Object object = cimModel.getObjectWithMRID(mRID);

			if (object instanceof TopologicalNode) {
				TopologicalNode bus = (TopologicalNode) object;

				ConductingEquipment conductingEquipment =
						bus.getTerminal().get(0).getConductingEquipment();

				// if the conducting equipment is a consumer set the active
				// power consumption to the value of the active power set point
				// multiplied by (-1) and the reactive power consumption to the
				// value of the reactive power set point multiplied by (-1).
				if (conductingEquipment instanceof EnergyConsumer) {
					EnergyConsumer energyConsumer =
							(EnergyConsumer) conductingEquipment;
					energyConsumer
							.setPfixed(new Float(
									PowerflowMapping.actorResultsMap.get(key).setPointActivePower));
					energyConsumer
							.setQfixed(new Float(
									PowerflowMapping.actorResultsMap.get(key).setPointReactivePower));
				}

				// if the conducting equipment is a source set the power
				// consumption to the value of the active power set point
				// reactive power is a lose variable for sources (!)
				else if (conductingEquipment instanceof EnergySource) {
					EnergySource energySource =
							(EnergySource) conductingEquipment;
					energySource
							.setActivePower(new Float(
									PowerflowMapping.actorResultsMap.get(key).setPointActivePower));
				}
			}
		}

		@SuppressWarnings("unused")
		String matrixResults = Solver.solve_model(cimModel);
		//System.out.println(matrixResults);
		
		if (GridArchitectConfiguration.showPowerFlowDetails){
			SimulationModel model = Solver.getSimulationModel();
			
			ArrayList<TopologicalNode> myList = new ArrayList<TopologicalNode>(model.numberNodeMap.values());
			Collections.sort(myList, new Comparator<TopologicalNode>(){
				public int compare(TopologicalNode t1, TopologicalNode t2) {
					return t1.getMRID().compareTo(t2.getMRID());
				}
			});			
			for (TopologicalNode topologicalNode : myList) {
				System.out.println(model.getPowerToNode(model.nodeNumberMap.get(topologicalNode)));
			}			
		}
	}
}