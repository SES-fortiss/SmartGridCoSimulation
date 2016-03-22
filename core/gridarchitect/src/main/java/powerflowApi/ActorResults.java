/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package powerflowApi;


/**
 * ActorResults are used to store the results for each timeStep.
 * The following properties are available:
 * 
 * activePower, reactivePower, voltage and nodeType
 * 
 * @author denis
 * 
 */

public class ActorResults {
	
    public final String actorPath; 			// An ActorResult Object belongs to a specific Actor
    public NodeType nodeType = NodeType.PQ; // default value, should be specified if necessary
    public Double activePower = 0.0;
    public Double reactivePower = 0.0;
    public Double voltage = 0.0;
    public Double angle = 0.0;

    
    public ActorResults(String actorPath) {
        this.actorPath = actorPath;
    }
    
    public ActorResults(String actorPath, double setPointActivePower) {
        this.actorPath = actorPath;
        this.activePower = setPointActivePower;
    }
    
    public ActorResults(String actorPath, Double setPointActivePower, Double setPointReactivePower) {
        this.actorPath = actorPath;
        this.activePower = setPointActivePower;
        this.reactivePower = setPointReactivePower;
    }
    
    @Override
    public String toString() {
        return "Results{" +
                "actorPath='" + actorPath + "\', " +
                "activePower='" + activePower + "\', " +
                "reactivePower='" + reactivePower + "\' " +
                '}';
    }
}
