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
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import scala.concurrent.duration.Duration;
import topology.ActorTopology;
import akka.actor.ActorSystem;
import akka.actor.Inbox;
import akka.systemActors.ActorMonitor;
import akka.systemActors.ActorSupervisor;
import akka.testkit.TestActorRef;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 6/14/13
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class BasicActorTest {

    public ActorSystem actorSystem;
    private String simulationName = "TestSystem";
    private ActorTopology actorTopology =  new ActorTopology(simulationName);
    
    public BasicActor actor;
    public TestActorRef<BasicActor> actorRef; 
    
    public List<String> directConnections = new ArrayList<String>();
    public final double[] demandArray = new double[101];      
    
    private Inbox inbox;
    final int maxTimeStep = 10;

    @After
    public void tearDown() {
        actorSystem.shutdown();
    }

	@Before
    public void setUp() {
		initGrid();
    }

	@SuppressWarnings("deprecation")
	private void initGrid(){		
		actorSystem = ActorSystem.create(simulationName);
		TestActorRef.create(actorSystem, ActorSupervisor.create(simulationName, LoggingMode.DEBUG, actorTopology), "ActorSupervisor");		
		TestActorRef.create(actorSystem, ActorMonitor.create(LoggingMode.DEBUG), "ActorMonitor");
        
        inbox = Inbox.create(actorSystem);        
        inbox.send(actorSystem.actorFor("/user/ActorMonitor"), "Inbox");
		
        actorSystem.actorSelection("/user/ActorSupervisor").tell("Init", null);
        inbox.receive(Duration.create(1, TimeUnit.SECONDS));
	}	

	@Test
	public void testSpawnActor(){
	}
	
    
    /**
     * 
     * 
     *         actorRef = this.spawnBasicActor("GridActor/Child", childrenOptionsA);
     * 
     */
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