/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package _ieeea300BusWithImport;

import java.util.ArrayList;


import powerflowApi.helper.IeeeSystemFromFile;
import topology.ActorTopology;

public class _ieee300BusTopologyImport {
	
	public static String simulationName = "IEEE300BusWithImport";
	
	public static ActorTopology createTopology(){		
		ActorTopology top = new ActorTopology(simulationName);
		ArrayList<String> file = IeeeSystemFromFile.readFile("src/main/resources/ieeeExamples/300Bus/ieee300cdf.txt");		
		IeeeSystemFromFile.createSystemFromFile(top, file);
		return top;
	}
}
