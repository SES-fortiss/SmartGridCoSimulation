/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.helper;

import topology.ActorTopology;
import vppClusterHeads.ClusterHeadActorFactory;

/**
 * @author Denis Bytschkow
 *
 */
public class JsonElement {
	
	public String type;	
	public String name;			// the name of the component
	public String absolutePath;	// the absolute path of the component
	public String value;
	public JsonElement[] children;
	/**
	 * @param top
	 */
	
	public void createActorTopology(ActorTopology top){
		
		// zuerst ein Root Element
		top.addActor(this.name, ClusterHeadActorFactory.createDEMSActor());
		
		// dann denn Rest
		this.absolutePath = this.name;		
		this.makeModel(top, this.absolutePath);
	}
	
	public void makeModel(ActorTopology top, String path) {

		this.absolutePath = path;
		
		if(this.type.equals("ClusterHead")){
			top.addActorAsChild(path, ClusterHeadActorFactory.createClusterHeadActor());
			System.out.println("ClusterHead created");
		}			
		
		if(this.type.equals("Solar"))
			top.addActorAsChild(path, ClusterHeadActorFactory.createSolarActor(Double.parseDouble(this.value)));
		
		if(this.type.equals("Water")){
			top.addActorAsChild(path, ClusterHeadActorFactory.createWaterActor(Double.parseDouble(this.value)));
		}
		
		if(this.type.equals("Wind")){
			top.addActorAsChild(path, ClusterHeadActorFactory.createWindActor(Double.parseDouble(this.value)));
		}
		
		if(this.type.equals("BioGas")){
			top.addActorAsChild(path, ClusterHeadActorFactory.createBioGasActor(Double.parseDouble(this.value)));
		}
		
		if(this.type.equals("BioMass")){
			top.addActorAsChild(path, ClusterHeadActorFactory.createBioMassActor(Double.parseDouble(this.value)));
		}
		
		// hier wirds rekursiv
		if (children != null){
			for (JsonElement jsonElement : children) {
				jsonElement.makeModel(top, this.absolutePath + "/" + jsonElement.name );				
			}
		}
		
	}

}
