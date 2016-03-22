/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package powerflowApi.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.fortiss.powerflowsim.model.AdditionalInformationMapping;
import org.fortiss.powerflowsim.model.ExtendedTopologyInformation;

import powerflowApi.LineConfiguration;
import powerflowApi.LineConfigurationWithTransformer;
import powerflowApi.PowerflowTopology;
import powerflowApi.standardActors.PowerFlowBusActorFactory;
import topology.ActorTopology;
import CIM15.IEC61970.Topology.TopologicalNode;

public class IeeeSystemFromFile {
	
private static ArrayList<IeeeBusData> busDataList = new ArrayList<IeeeBusData>();
	
public static void createSystemFromFile(ActorTopology top, ArrayList<String> file) {
		
		String stringForFactorDetermination =  file.get(0);
		String[] elements = stringForFactorDetermination.split("\\s+");
		double factor = 1.0/Double.parseDouble(elements[4]);
		
		// Every Model has a swingBus
		PowerflowTopology pfModel = new PowerflowTopology();		
		TopologicalNode swing = pfModel.CIMmodel.getSWINGNode();
		HashMap<Integer, TopologicalNode> busList = new HashMap<Integer, TopologicalNode>(); 
		
		ArrayList<String> buses = selectStrings(file, "BUS");
		
		// add all the nodes to the model, according FormatDescription Specification
		for (String string : buses) {
			
			IeeeBusData busData = new IeeeBusData();
			busData.parseDate(string);
			busDataList.add(busData);

			if (busData.type == 3) {
				pfModel.setSwingNodeVoltage(busData.voltageMagnitude);
				busList.put(busData.number, swing);
			}
			
			if (busData.type == 2) {
				top.addActor(""+busData.number, PowerFlowBusActorFactory.createPVactor(""+busData.number, (busData.genP - busData.loadP)*factor, busData.voltageMagnitude));
				busList.put(busData.number, pfModel.createPVNode("/user/ActorSupervisor/"+busData.number));
			}
			
			if (busData.type == 0) {
				top.addActor(""+busData.number, PowerFlowBusActorFactory.createPQactor(""+busData.number, factor*(busData.genP - busData.loadP), factor*(busData.genQ - busData.loadQ)));
				busList.put(busData.number, pfModel.createPQNode("/user/ActorSupervisor/"+busData.number));
			}
			
			if (busData.shuntSusceptance != 0.0) {
				ExtendedTopologyInformation node9eti = new ExtendedTopologyInformation();
				node9eti.setB_shunt(busData.shuntSusceptance);
				AdditionalInformationMapping.nodeETI_HashMap.put(busList.get(busData.number), node9eti);
			}
		}
		
		
		ArrayList<String> branches = selectStrings(file, "BRANCH");
		for (String string : branches) {			
			int fromNode = Integer.parseInt(string.substring(0, 4).replaceAll("\\s+",""));
			int toNode = Integer.parseInt(string.substring(5, 9).replaceAll("\\s+",""));
			
			double resistance = Double.parseDouble(string.substring(20, 29));
			double reactance = Double.parseDouble(string.substring(30, 40));
			double lineCharging = Double.parseDouble(string.substring(41, 50));
			double ratio = Double.parseDouble(string.substring(76, 82));
			
			//System.out.println(fromNode + " \t" + toNode+ " \t" +resistance+ " \t" +reactance + " \t" + lineCharging+ " \t" +ratio);
			
			if (ratio == 0.0) {
				pfModel.connectNodes(busList.get(fromNode), busList.get(toNode), new LineConfiguration(resistance, reactance, lineCharging));					
			}
			
			if (ratio != 0.0) {
				pfModel.connectNodes(busList.get(fromNode), busList.get(toNode), new LineConfigurationWithTransformer(resistance, reactance, ratio));
			}
		}
		
		pfModel.autoMap(top);
	}

	private static ArrayList<String> selectStrings(ArrayList<String> file, String identifier) {
		
		ArrayList<String> selection = new ArrayList<String>();		
		
		boolean next = false;
		
		for (String string : file) {
			String[] elements = string.split("\\s+");
			
			if (elements[0].equals("-999")){
				next = false;
			}
			
			if (next) {
				selection.add(string);
			}
			
			if (elements[0].equals(identifier)) {
				next = true;
			}
		}
		
		return selection;
	}

	public static ArrayList<String> readFile(String string){		
		ArrayList<String> result = new ArrayList<String>();		
		try {
		    BufferedReader br = new BufferedReader(new FileReader(string)); 		    		    
		    String zeile = null; 		    
		    while ((zeile = br.readLine()) != null) {
				result.add(zeile);				
			}
		    
		    br.close();
		     
		} catch (IOException e) {
			e.printStackTrace();		
		}
		
		return result;
		
	}

	public static ArrayList<IeeeBusData> getBusDataList() {
		return busDataList;
	}
}
