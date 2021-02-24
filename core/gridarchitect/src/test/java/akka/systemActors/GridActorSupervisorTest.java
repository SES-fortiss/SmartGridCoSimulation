/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemActors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import akka.ActorFactory;
import akka.actor.ActorSystem;
import akka.systemMessages.TimeStepMessage;
import akka.testkit.TestActorRef;
import topology.ActorTopology;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 6/13/13
 * Time: 1:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class GridActorSupervisorTest {
	
	public ActorSystem actorSystem;
    public ActorSupervisor actorSupervisor;    
    public TestActorRef<ActorSupervisor> actorSupervisorRef;
    public TestActorRef<ActorMonitor> actorMonitorRef;
    public ActorMonitor actorMonitor;
    
    public final double[] demandArray = new double[100];
    public List<String> directConnections = new ArrayList<String>();
    public Map<String, Map<String, Object>> childrenOptionsMap = new HashMap<String, Map<String, Object>>();
    public ActorTopology actorTopology;
    public final int maxTimeStep = 100;

	@Before
    public void setUp() {
		/** TODO - a lot of refactoring was ongining. This Test wont execute and need to be fixed.
    	String name = "TestSystem";
    	
        actorTopology = new ActorTopology(name);
        actorTopology.addActor("/user/ActorSupervisor/Child", ActorFactory.createPlainActor());                

        actorSystem  = ActorSystem.create(name);              
        
        actorSystem.actorOf(ActorMonitor.create(LoggingMode.DEBUG), "ActorMonitor");		
		actorSystem.actorOf(ActorSupervisor.create(name, LoggingMode.DEBUG, actorTopology), "ActorSupervisor"); 
        
        System.out.println("setUp()");
        */
    }

	@Test
    public void testHandleTimeStepMessage() {		
        Assert.assertEquals(0, actorSupervisor.getCurrentTimeStep());                
        TimeStepMessage message = new TimeStepMessage(5);
        actorSupervisor.handleTimeStepMessage(message);
        Assert.assertEquals(5, actorSupervisor.getCurrentTimeStep());
    }

	@Test
    public void testAskChildrenOneLayer()  throws Exception {
        actorTopology.addActor("/user/ActorSupervisor/TestGridActor0", ActorFactory.createPlainActor());
        actorTopology.addActor("/user/ActorSupervisor/TestGridActor1", ActorFactory.createPlainActor());
        actorTopology.addActor("/user/ActorSupervisor/TestGridActor2", ActorFactory.createPlainActor());

		//TODO actorSupervisior ist null, genau wie ActorMonitor...
        actorSupervisor.initialiseGrid();   
        actorMonitor.startNewTimeStep();

        Assert.assertEquals(1, actorSupervisor.getCurrentTimeStep());
    }   

    @Test
    public void testRegisterActor() {
        Assert.assertEquals(1, actorSupervisor.actorCount);
        actorSupervisorRef.tell("Register", null);
        Assert.assertEquals(2, actorSupervisor.actorCount);
    }

    @After
    public void tearDown() {
        actorSystem.terminate();
    }
}
