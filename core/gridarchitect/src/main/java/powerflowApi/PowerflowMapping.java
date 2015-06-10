/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package powerflowApi;

import java.util.HashMap;

import powerflowApi.helper.AutoMapException;
import topology.ActorTopology;

/**
 * This class represents the mapping between <tt>actorTopology</tt> and
 * <tt>powerflowTopology</tt>.
 * 
 * <p>
 * Actors will write their results to the actorResultMap. The powerflowSolver
 * will read the results and take the values to solve the powerFlow problem.
 * 
 * @author Martin Zellner
 * @author Denis Bytschkow
 *
 */
public abstract class PowerflowMapping {
 
	/* Topologies */
	public static PowerflowModel powerflowModel;
	public static ActorTopology actorTopology;

	/* Mappings */
	public static HashMap<String, String> pathMridMap =
			new HashMap<String, String>(); // actor path -> mrid
	public static HashMap<String, String> mridPathMap =
			new HashMap<String, String>(); // mrid -> actor path
	private static boolean mappingAvailable = false;

	/* Results */
	public static HashMap<String, ActorResults> actorResultsMap =
			new HashMap<String, ActorResults>();
	public static HashMap<String, SolverResults> solverResultsMap =
			new HashMap<String, SolverResults>();

	public static boolean isMapped() {
		return mappingAvailable;
	}

	public static void setIsMapped(boolean b) {
		mappingAvailable = b;
	}
	
	public static PowerflowModel getPowerflowModel(){
		return powerflowModel;
	}

	/**
	 * The mapping method creates a mapping, that is required to receive the
	 * maps between the names of the actors, the ActorResults, the SolverResults
	 * and the MRIDs of the TopologicalNodes.
	 * 
	 * @param aTopology
	 * @param pfTopology
	 */
	public static void autoMap(ActorTopology aTopology, PowerflowModel pfModel) throws AutoMapException {
		
		powerflowModel = pfModel; 
		actorTopology = aTopology;
		
		for (String name : actorTopology.getActorTopology().keySet()) {			
			pathMridMap.put(name, name);
			mridPathMap.put(name, name);
			actorResultsMap.put(name, new ActorResults(name));
			solverResultsMap.put(name, new SolverResults(name));
		}
		setIsMapped(true);
	}
}


