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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.fortiss.powerflowsim.model.CimModel;
import org.fortiss.powerflowsim.simulation.internal.BusBranchModel;
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
	
	private static Logger log = LogManager.getLogger(PowerflowApi.class);

	public static void execute() {
		
		// previous solution only as reminder 
		// log.setLevel(Level.WARN);
		Configurator.setLevel(log.getName(), Level.WARN);
		
		log.debug("enter execute() method of PowerflowApi.class");
		log.info(PowerflowMapping.getPowerflowTopology() + " --- Execute Power Flow Calcultations");
	
		CimModel cimModel = PowerflowMapping.getPowerflowTopology().CIMmodel;

		for (String key : PowerflowMapping.actorResultsMap.keySet()) {
			// get mrid from mapping
			String mRID = PowerflowMapping.pathMridMap.get(key);

			// get object for mapped mRID
			Object object = cimModel.getObjectWithMRID(mRID);

			if (object instanceof TopologicalNode) {
				TopologicalNode bus = (TopologicalNode) object;

				ConductingEquipment conductingEquipment = bus.getTerminal().get(0).getConductingEquipment();

				// if the conducting equipment is a consumer, set the active
				// power consumption to the value of the active power set point
				// multiplied by (-1) and the reactive power consumption to the
				// value of the reactive power set point multiplied by (-1).
				// TODO check weather the multiplication with (-1) is really done.
				if (conductingEquipment instanceof EnergyConsumer) {					
					
					//System.out.println("PowerflowApi.execute(): EnergyConsumer " + mRID);					
					
					EnergyConsumer energyConsumer =	(EnergyConsumer) conductingEquipment;
					energyConsumer.setPfixed(new Float(PowerflowMapping.actorResultsMap.get(key).activePower));
					energyConsumer.setQfixed(new Float(PowerflowMapping.actorResultsMap.get(key).reactivePower));
				}

				// if the conducting equipment is a source, set the power
				// consumption to the value of the active power set point
				// reactive power is a lose variable for sources (!)
				else if (conductingEquipment instanceof EnergySource) {
					
					//System.out.println("PowerflowApi.execute(): EnergySource " + mRID);
					
					EnergySource energySource = (EnergySource) conductingEquipment;
					energySource.setActivePower(new Float(PowerflowMapping.actorResultsMap.get(key).activePower));
					energySource.setVoltageMagnitude(new Float(PowerflowMapping.actorResultsMap.get(key).voltage));
				}
			}
		}

		String matrixResults = Solver.solve_model(cimModel);
		log.debug(matrixResults);		
		printResults();
	}

	/**
	 * Print the results to the console
	 */
	private static void printResults() {
		
		if (GridArchitectConfiguration.showPowerFlowDetails){
			
			System.out.println(PowerflowApi.class + " --> Results of the solver\n");
			
			BusBranchModel model = Solver.getSimulationModel();
			
			ArrayList<TopologicalNode> myList = new ArrayList<TopologicalNode>(model.indexNodeMap.values());
			
			Collections.sort(myList, new Comparator<TopologicalNode>(){
				
				/*
				public int compare(TopologicalNode t1, TopologicalNode t2) {
					return t1.getMRID().compareTo(t2.getMRID());
				}
				*/
				
	            public int compare(TopologicalNode t1, TopologicalNode t2) {
	                /*
	                 * Pattern:
	                 * Groß-/Kleinbuchstaben mit einem Vorkommen von 0 ... unendlich
	                 * Zahlen mit einem Vorkommen von 1 ... unendlich
	                 */
	                Pattern p = Pattern.compile("([a-zA-Z]*)([0-9]+)");
	                Matcher m;
	                int num1 = -1;
	                int num2 = -1;
	                String str1 = ""; // ÄNDERUNG
	                String str2 = ""; // ÄNDERUNG
	 
	                // str1 & num1
	                m = p.matcher(t1.getMRID());
	                if(m.find()) {
	                    // Gruppenindex 0 => Gesamter Fund
	                    // Gruppenindex 1 => 1. Gruppe (hier die
	                    // Buchstabenkombination)
	                    // Gruppenindex 2 => 2. Gruppe (hier die Zahlenkombination)
	                    str1 = m.group(1); // ÄNDERUNG
	                    num1 = Integer.parseInt(m.group(2));
	                }
	 
	                // str2 & num2
	                m = p.matcher(t2.getMRID());
	                if(m.find()) {
	                    // Gruppenindex 0 => Gesamter Fund
	                    // Gruppenindex 1 => 1. Gruppe (hier die
	                    // Buchstabenkombination)
	                    // Gruppenindex 2 => 2. Gruppe (hier die Zahlenkombination)
	                    str2 = m.group(1); // ÄNDERUNG
	                    num2 = Integer.parseInt(m.group(2));
	                }
	 
	                // Vergleichen
	                if(str1.compareTo(str2) != 0) return str1.compareTo(str2); // ÄNDERUNG
	 
	                // Gleiche Strings? Also Zahlenwerte prüfen!
	                if(num1 < num2) return -1;
	                if(num1 > num2) return 1;
	 
	                return 0;
	            }
			});			
			for (TopologicalNode topologicalNode : myList) {
				System.out.println(model.getPowerToNode(model.nodeIndexMap.get(topologicalNode)));
			}
		}
	}
}