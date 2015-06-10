/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.basicActors;

import java.util.HashSet;

import resultSaving.SavingInterface;
import behavior.BehaviorModel;

/**
 * This class is the basic Builder
 * 
 * @param loggingMode - DEBUG, PRODUCTION, UNIT_TEST, MINIMAL
 * @param childrenNameList - List with paths to children 
 * @param directConnectionsPathList - List with paths to direct connections
 * @param behaviorModel - Derived classes of the behaviorParameter class
 * @param savingInterface - Saving Interface (NoSave(), SaveCSV, ...
 * 
 * @author bytschkow
 *
 */

public class ActorOptions {
	
    public LoggingMode loggingMode;
	public HashSet<String> childrenNameList;
	public HashSet<String> childrenPathList;
    public HashSet<String> directConnectionsPathList;   

    // behavior represents all kinds of behavior
    public BehaviorModel behaviorModel;
    public SavingInterface savingInterface;
    public boolean hasAlreadyBeenSpawned = false;    

    @Override
    public String toString() {
        return "BasicBuilder{" +
                "loggingMode=" + loggingMode +
                ", childrenNameList=" + childrenNameList +
                ", childrenPathList=" + childrenPathList +
                ", directConnectionsList=" + directConnectionsPathList +
                ", savingInterface=" + savingInterface +
                ", behaviorModel=" + behaviorModel +
                '}';
    }

    /**
     * The preferred BasicActor constructor
     * 
     * @param loggingMode - DEBUG, PRODUCTION, UNIT_TEST, MINIMAL
     * @param childrenNameList - List with names to children 
     * @param childrenPathList - List with fullActorPaths of the children 
     * @param directConnectionsPathList - List with paths to direct connections
     * @param behaviorModel - Derived classes of the behaviorParameter class
     * @param savingInterface - Saving Interface (NoSave(), SaveCSV, ...)
     * 
     * @author bytschkow
     */    
    
    public ActorOptions(LoggingMode loggingMode, HashSet<String> childrenNameList, HashSet<String> childrenPathList,HashSet<String> directConnectionsPathList,
                        BehaviorModel behaviorModel, SavingInterface savingInterface) {
        this.loggingMode = loggingMode;
        this.childrenNameList = childrenNameList;
        this.childrenPathList = childrenPathList;
        this.directConnectionsPathList = directConnectionsPathList;
        this.behaviorModel = behaviorModel;
        this.savingInterface = savingInterface;
    }

    //Empty Constructor needed for JSON serialization
    public ActorOptions(){
    	
    }    
}
