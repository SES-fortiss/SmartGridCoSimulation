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
 * Currently 
 */

public class ActorResults {
	
    public final String actorPath; // An ActorResult Object belongs to a specific Actor
    public Double setPointActivePower = 0.0;
    public Double setPointReactivePower = 0.0;

    
    public ActorResults(String actorPath) {
        this.actorPath = actorPath;
    }
    
    public ActorResults(String actorPath, double setPointActivePower) {
        this.actorPath = actorPath;
        this.setPointActivePower = setPointActivePower;
    }
    
    public ActorResults(String actorPath, Double setPointActivePower, Double setPointReactivePower) {
        this.actorPath = actorPath;
        this.setPointActivePower = setPointActivePower;
        this.setPointReactivePower = setPointReactivePower;
    }
    
    @Override
    public String toString() {
        return "Results{" +
                "actorPath='" + actorPath + "\', " +
                "setPointActivePower='" + setPointActivePower + "\', " +
                "setPointReactivePower='" + setPointReactivePower + "\' " +
                '}';
    }
}
