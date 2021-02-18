/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package _ieee57BusWithImport;

import java.util.ArrayList;

import powerflowApi.helper.IeeeSystemFromFile;
import topology.ActorTopology;

public class _ieee57BusTopologyImport {
	
	public static String simulationName = "IEEE57BusWithImport";
	
	public static ActorTopology createTopology(){		
		ActorTopology top = new ActorTopology(simulationName);
		ArrayList<String> file = IeeeSystemFromFile.readFile("src/main/resources/ieeeExamples/57Bus/ieee57cdf.txt");		
		IeeeSystemFromFile.createSystemFromFile(top, file);
		return top;
	}	
	
	
	

}
