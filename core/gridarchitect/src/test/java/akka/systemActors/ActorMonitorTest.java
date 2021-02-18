/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemActors;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import scala.concurrent.duration.Duration;
import topology.ActorTopology;
import akka.ActorFactory;
import akka.actor.ActorSystem;
import akka.actor.Inbox;
import akka.basicActors.LoggingMode;
import akka.systemMessages.StartMessage;
import akka.testkit.TestActorRef;

/**
 * ActorMonitor Test
 * 
 * @author bytschkow
 */

public class ActorMonitorTest {

    public ActorMonitor actorMonitor;
    public ActorSystem actorSystem;
    public TestActorRef<ActorMonitor> actorMonitorRef;
    private ActorTopology actorTopology;
    private Inbox inbox;
    final int maxTimeStep = 10;

	@SuppressWarnings("deprecation")
	@Before
    public void setUp() {  
        actorTopology = new ActorTopology("TestSystem");
        actorTopology.addActor("/user/ActorSupervisor/Child", ActorFactory.createPlainActor());                

        actorSystem  = ActorSystem.create("TestSystem");              
        actorSystem.actorOf(ActorSupervisor.create("TestSystem", LoggingMode.UNIT_TEST, actorTopology), "ActorSupervisor");       
        
        actorMonitorRef = TestActorRef.create(actorSystem, ActorMonitor.create(LoggingMode.UNIT_TEST), "ActorMonitor");
        actorMonitor = actorMonitorRef.underlyingActor();
        actorMonitor.operationMode = LoggingMode.UNIT_TEST;
        
        inbox = Inbox.create(actorSystem);        
        inbox.send(actorSystem.actorFor("/user/ActorMonitor"), "Inbox");
        actorSystem.actorSelection("/user/ActorSupervisor").tell("Init", null);
        inbox.receive(Duration.create(1, TimeUnit.SECONDS));
        
        System.out.println("setUp()");
    }

    @Test
    public void testIncrementTimeStep() throws Exception {
        actorMonitor.setCurrentTimeStep(10);
        actorMonitor.setLastTimeStep(11);
        actorMonitor.startNewTimeStep();
        Assert.assertEquals(11, actorMonitor.getCurrentTimeStep());
    }

    @Test
    public void testIncrementTimeStepMaxReached() throws InterruptedException {
        actorMonitor.setCurrentTimeStep(8);
    	actorMonitor.setLastTimeStep(10);
        actorMonitor.startNewTimeStep();
        Assert.assertEquals(9, actorMonitor.getCurrentTimeStep());

        actorMonitor.startNewTimeStep();
        Assert.assertEquals(10, actorMonitor.getCurrentTimeStep());

        actorMonitor.startNewTimeStep();
        Assert.assertEquals(10, actorMonitor.getCurrentTimeStep());
    }

	@Test
    public void testBroadcastTimeStep() {        
    	TestActorRef<ActorSupervisor> gridActorSupervisorRef = TestActorRef.create(actorSystem, ActorSupervisor.create("TestSystem", LoggingMode.UNIT_TEST, actorTopology), "GridActorSupervisor");
        ActorSupervisor gridActorSupervisor = gridActorSupervisorRef.underlyingActor();
        actorMonitor.setLastTimeStep(100);
        actorMonitor.setCurrentTimeStep(2);

        //actorMonitor.broadcastTimeStep();
        Assert.assertEquals(2, gridActorSupervisor.getCurrentTimeStep());
    }

	@Test
    public void testLoggingTypes() {		
        Assert.assertEquals(LoggingMode.UNIT_TEST, actorMonitor.operationMode);        
        TestActorRef<ActorMonitor> actorMonitorProductionRef =  TestActorRef.create(actorSystem, ActorMonitor.create(LoggingMode.PRODUCTION), "TestActorMonitorProduction");
        ActorMonitor actorMonitorProduction = actorMonitorProductionRef.underlyingActor();        
        Assert.assertEquals(LoggingMode.PRODUCTION, actorMonitorProduction.operationMode);        
    }

	@Test    
    public void testStartSimulation() {  
        
        actorMonitor.setLastTimeStep(10);
        actorMonitor.setCurrentTimeStep(0);               
        
        // Systen simulation
        actorMonitor.startSimulation(new StartMessage(0, 10));        
        inbox.receive(Duration.create(1, TimeUnit.SECONDS));
        
        Assert.assertEquals(10, actorMonitor.getCurrentTimeStep());
    }
    
    @After
    public void tearDown() {
        actorSystem.shutdown();
        System.out.println("tearDown()");
    }
}
