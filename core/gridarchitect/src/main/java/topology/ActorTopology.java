/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package topology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import akka.basicActors.ActorOptions;

/**
 *
 * Internal representation of the ActorTopology used in the Simulation. <br>
 * Can be (de-)serialized with the Helper Class: {@link helper.GridTopologyJson}
 * 
 * @author Alex Mack
 * @author Denis Bytschkow
 *
 */
public class ActorTopology {

    public String simulationName;
    private Map<String, ActorOptions> actorTopology = new HashMap<String, ActorOptions>();
    
    public ActorTopology(String simulationName) {
        this.simulationName = simulationName;
    }

    @Override
    public String toString() {
        return actorTopology.toString();
    }
    
    /**
     *  This Class adds the Actor to the topology
     *  <br>
     *  Example: addActor("/user/ActorSupervisor/Solar1", new SolarPanelActor()");
     *  <br>
     *  Example2: addActor("Solar1", new SolarPanelActor()"); --> in this case the 
     *  "/user/ActorSupervisor/" will be added automatically by convention
     *  
     *  @param actorPath - contains the path of the Actor in the topology
     *  @param builder - contains the specification of the actor (BasicActor)
     *  
     */    
    
    public void addActor(String actorPath, ActorOptions builder) {
    	
    	//System.out.println(actorPath);
    	
    	if (actorPath.contains("ActorSupervisor")) {
    		if (this.actorTopology.containsKey(actorPath)){
    			System.out.println("actorPath [" +actorPath+ "] already exists. --> Exception");
    			throw new IllegalArgumentException("actorPath ["+actorPath+"] already exists.");
    		}
            actorTopology.put(actorPath, builder);
    	} else {
    		actorPath = "/user/ActorSupervisor/" + actorPath;
    		if (this.actorTopology.containsKey(actorPath)){
    			System.out.println("actorPath [" +actorPath+ "] already exists. --> Exception");
    			throw new IllegalArgumentException("actorPath ["+actorPath+"] already exists.");
    		}            
    		actorTopology.put(actorPath, builder);
    	}
    }
    

    public void addActorAsChild(String actorPath, ActorOptions actor) {
        String actorName = this.getActorName(actorPath);
        String parentPath = "";               
        
        if (actorPath.contains("/user/ActorSupervisor/")){
        	parentPath = actorPath.substring(0,actorPath.length()-actorName.length()-1);
        } else {
        	parentPath = "/user/ActorSupervisor/" + actorPath.substring(0,actorPath.length()-actorName.length()-1);
        }
                
        ActorTopology top = new ActorTopology("");        
        top.addActor(actorName, actor);
        
        //System.out.println(top);
        //System.out.println(parentPath);
        //System.out.println(actorName);
        
        this.addSubTopology(parentPath, top);
    }

    public void removeActor(String actorPath) {

    	if (actorPath.contains("/user/ActorSupervisor/")) actorTopology.remove(actorPath);
    	else {
    		actorPath = "/user/ActorSupervisor/" + actorPath;
    	}
    	
		actorTopology.remove(actorPath);
		String parentPath = actorPath.substring(0, actorPath.lastIndexOf("/"));
		String childName = actorPath.substring(actorPath.lastIndexOf("/")+1, actorPath.length());
		actorTopology.get(parentPath).childrenNameList.remove(childName);
    	

        
    }

    /**
     * @return HashMap of the Grid. Every <b>unique</b> Actor has its own {@link ActorOptions} Object.
     *  <br></br>
     *  Layout:
     *  <table>
     *      <tr>
     *          <th>ActorPath</th>
     *          <th>{@link ActorOptions}</th>
     *      </tr>
     *      <tr>
     *          <td>"/user/ActorSupervisor/SomeActor"</td>
     *          <td>{@link ActorOptions}</td>
     *      </tr>
     *  </table>
     */
    public Map<String,ActorOptions> getActorTopology() {
        return actorTopology;
    }


    public ActorOptions getActorOptions(String actorPath) {
    	if (!actorPath.contains("ActorSupervisor")){
    		actorPath = "/user/ActorSupervisor/" + actorPath;
    	}
        if (!actorTopology.containsKey(actorPath)) throw new NullPointerException(String.format("Actor [%s] does not exist in GridTopology.", actorPath));
        return actorTopology.get(actorPath);
    }

    /**
     * Adds <b>topologyToAdd</b> as Children to the Actor specified by <b>parentPath</b>.
     * <br><br>
     * Example:  <br>
     * <b>{Grid_1}</b> has 2 Actors: <b>/user/ActorSupervisor/Actor_1</b> and <b>/user/ActorSupervisor/Actor_2</b>.   <br>
     * <b>{Grid_2}</b> has 1 Actor: <b>/user/ActorSupervisor/OtherActor</b>                                  <br>
     * <b>{Grid_1}.addSubGrid("/user/ActorSupervisor/Actor_2", {Grid_2})</b> will add <b>/user/ActorSupervisor/OtherActor</b>.<br>
     * <b>{Grid_1}</b> has then 3 Actors:    <br>
     *  - <b>/user/ActorSupervisor/Actor_1</b>
     *  - <b>/user/ActorSupervisor/Actor_2</b>
     *  - <b>/user/ActorSupervisor/Actor_2/OtherActor</b>
     *
     * @param parentPath Unique path of the Actor (in {@link #actorTopology}) that serves as the Anchor of <b>topologyToAdd</b>.
     * @param topInput SubGrid to be added.
     *
     * @throws NullPointerException if <b>parentPath</b> does not exist in {@link #actorTopology}
     * @throws IllegalArgumentException if the Actor specified by <b>parentPath</b> has a Child of the same Name as the Root Actors of <b>topologyToAdd</b>
     */        
    public void addSubTopology(String parentPath, ActorTopology topInput) {
    	
    	//System.out.println(topInput);
    	//System.out.println(parentPath);        
    	List<String> rootActorNames = this.getRootActorNames(topInput);    	    	
 	
    	for (String actorPath: topInput.actorTopology.keySet()) {
    		//System.out.println("TOP vorher: " + topInput);
    		String newPath = this.replaceActorPathForSubGridAddition(parentPath, actorPath);
    		//System.out.println("newPath:" + newPath);
    		//System.out.println(topInput.getActorBuildOptions(actorPath));
            this.addActor(newPath,topInput.getActorOptions(actorPath));
        }
   
        ActorOptions parentOptions = this.getActorOptions(parentPath);
        this.appendChildrenList(parentPath,parentOptions, rootActorNames);
    }

    /**
     * Stores all RootActor names of a given Topology in a List. </br>
     * A RootActor is an Actor on the first Level (/user/ActorSupervisor/Level1/Level2...) of a GridTopology: </br>
     * <b>/user/ActorSupervisor/RootActor</b>
     *
     * @param topology GridTopology to be analysed.
     * @return List of RootActor names.
     */
    private List<String> getRootActorNames(ActorTopology topology) {
    	//System.out.println(topology);
        List<String> rootActorNames = new ArrayList<>();
        for (String actorPath: topology.actorTopology.keySet()) {
            if (this.isRootActor(actorPath)) rootActorNames.add(this.getActorName(actorPath));
        }
        //System.out.println(rootActorNames); 
        return rootActorNames;
    }

    /**
     * Appends <b>childrenNameList</b> to {@link ActorOptions#childrenNameList}
     *
     * @param parentPath the full path of the parent
     * @param options ActorOptions to be modified.
     * @param childrenNameList List of ChildrenNames to be added.
     *
     * @throws IllegalArgumentException if ChildName is not unique.
     */    
    protected void appendChildrenList(String parentPath, ActorOptions options, List<String> childrenNameList) {
    	
    	// System.out.println(childrenNameList);    	
    	boolean securityCheck = true;
    	
        for (String child: childrenNameList) {
        	if (securityCheck && options.childrenNameList.contains(child)){
        		System.out.println("ActorOptions.childrenNameList already contains "+child);
        		throw new IllegalArgumentException("ActorOptions.childrenNameList already contains "+child);
        	}
        }
        options.childrenNameList.addAll(childrenNameList);
        // add also the paths
        
        for (String child: childrenNameList) 
        {
        	options.childrenPathList.add(parentPath+"/"+child);
        }
        
       // System.out.println(options.childrenPathList);
        
    }

    /**
     * Replaces the "/user/ActorSupervisor" part of the given <b>actorPath</b> with <b>parentPath</b>.
     * <br>
     * Example: <br>
     * replaceActorPathForSubGridAddition("/user/ActorSupervisor/Parent", "/user/ActorSupervisor/Child") -> <b>"/user/ActorSupervisor/Parent/Child"</b>
     * @param parentPath Path of the Anchor Actor.
     * @param actorPath Path to be modified.
     *
     * @return Modified ActorPath.
     */
    protected String replaceActorPathForSubGridAddition(String parentPath, String actorPath) {
    	// System.out.println(actorPath.replace("/user/ActorSupervisor", parentPath));
        return actorPath.replace("/user/ActorSupervisor", parentPath);
    }

    /**
     * Checks if an Actor is located on Level 1 on the Grid hierarchy. (/user/ActorSupervisor/Level_1/Level_2)
     *
     * @param actorPath
     * @return True if Actor is located on Level 1.
     */
    protected boolean isRootActor(String actorPath) {
        return StringUtils.countMatches(actorPath, "/") == 3;
    }

    /**
     * Returns the name of the Actor specified by <b>actorPath</b>. <br>
     * Example: <br>
     * getActorName("/user/ActorSupervisor/Some/Actor/Stuff") -> "Stuff"
     *
     * @param actorPath ActorPath (/user/ActorSupervisor/Some/Actor)
     * @return ActorName
     */
    protected String getActorName(String actorPath) {
        int indexOfLastSlash = StringUtils.lastIndexOf(actorPath, "/");
        return actorPath.substring(indexOfLastSlash+1);
    }

    /**
     * Replaces all occurrences of <b>oldPath</b> in {@link #actorTopology} with <b>newPath</b>.
     *
     * @param oldPath ActorPath to be replaced.
     * @param newPath New Path.
     */
    public void replaceActorPath(String oldPath, String newPath) {
        ActorTopology replacedTopology = new ActorTopology(this.simulationName);
        for (String currentPath: this.actorTopology.keySet()) {
            if (currentPath.contains(oldPath)) {
                String replaced = currentPath.replace(oldPath, newPath);
                replacedTopology.addActor(replaced, this.getActorOptions(currentPath));
            }
            else replacedTopology.addActor(currentPath, this.getActorOptions(currentPath));
        }
        this.actorTopology = replacedTopology.getActorTopology();
    }
}
