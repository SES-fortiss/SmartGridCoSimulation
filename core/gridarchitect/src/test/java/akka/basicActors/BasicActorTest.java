/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.basicActors;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import akka.actor.ActorSystem;
import akka.testkit.TestActorRef;
import topology.ActorTopology;

/**
 * This test should actually test the behaviour of a basic actor.
 * However, at the current stage it tests only the actor system initialiation. 
 * 
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 6/14/13
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */
@SuppressWarnings("unused")
public class BasicActorTest {

    public ActorSystem actorSystem;
    private String simulationName = "TestSystem";
	private ActorTopology actorTopology =  new ActorTopology(simulationName);
    
    public BasicActor actor;
    public TestActorRef<BasicActor> actorRef; 
    
    public List<String> directConnections = new ArrayList<String>();
    public final double[] demandArray = new double[101];      
    
    final int maxTimeStep = 10;

    @After
    public void tearDown() {
        actorSystem.terminate();
    }

	@Before
    public void setUp() {
		initGrid();
    }

	private void initGrid(){
		/** TODO - a lot of refactoring was ongining. This Test wont execute and need to be fixed.
		actorSystem = ActorSystem.create(simulationName);
		
		actorSystem.actorOf(ActorMonitor.create(LoggingMode.DEBUG), "ActorMonitor");		
		actorSystem.actorOf(ActorSupervisor.create(simulationName, LoggingMode.DEBUG, actorTopology), "ActorSupervisor"); 
		
		CompletableFuture<Void> future =
			    ask(actorSystem.actorSelection("/user/ActorMonitor"), "Inbox intitialize", 
			    		Duration.ofSeconds(1)).toCompletableFuture().thenAccept(s -> {}); 
		
		try {
			future.get(); // blocking, i.e. it waits until the topology is created
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();			
			System.out.println("Actor System could not be created correctly. Actor System terminating...");
			actorSystem.terminate();
		} 

		System.out.println("Actor System initiated");
		System.out.println("****************************************************************");
		*/
		return;
        
	}	

	@Test
	public void testSpawnActor(){
	}
	    
    public TestActorRef<BasicActor> spawnAsChild(String childPath, ActorOptions builder, ActorTopology topology){
    	return null;
    }
    
	@Test
    public void testConstructorSpawnAsChild() {
    }
    
	@Test
    public void testConstructorNoBehaviorModel() throws Exception{    	
    }
    
	@Test
    public void testSavingMode() {
    }
}