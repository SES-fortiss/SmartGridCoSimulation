/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemActors;

import static akka.pattern.Patterns.ask;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import akka.ActorFactory;
import akka.actor.ActorSystem;
import akka.basicActors.LoggingMode;
import akka.systemMessages.StartMessage;
import akka.testkit.TestActorRef;
import topology.ActorTopology;

/**
 * ActorMonitor Test
 * 
 * @author bytschkow
 */
@SuppressWarnings("unused")
public class ActorMonitorTest {

    public ActorMonitor actorMonitor;
    public ActorSystem actorSystem;
    public TestActorRef<ActorMonitor> actorMonitorRef;
    private ActorTopology actorTopology;
    final int maxTimeStep = 10;

	@Before
    public void setUp() {  
		
		/** TODO - a lot of refactoring was ongining. This Test wont execute and need to be fixed.
		
        actorTopology = new ActorTopology("TestSystem");
        actorTopology.addActor("/user/ActorSupervisor/Child", ActorFactory.createPlainActor());                

        actorSystem  = ActorSystem.create("TestSystem");              
        actorSystem.actorOf(ActorSupervisor.create("TestSystem", LoggingMode.UNIT_TEST, actorTopology), "ActorSupervisor");       
        
        actorMonitorRef = TestActorRef.create(actorSystem, ActorMonitor.create(LoggingMode.UNIT_TEST), "ActorMonitor");
        actorMonitor = actorMonitorRef.underlyingActor();
        actorMonitor.operationMode = LoggingMode.UNIT_TEST;
        
        
        @SuppressWarnings("unused")
		CompletableFuture<Void> future =
			    ask(actorSystem.actorSelection("/user/ActorMonitor"), "Inbox intitialize", 
			    		Duration.ofSeconds(1)).toCompletableFuture().thenAccept(s -> {}); 
        
        // If future is done, the system is initiated.
        
        System.out.println("setUp()");
        */
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
        CompletableFuture<Void> future =
			    ask(actorSystem.actorSelection("/user/ActorMonitor"), 
			    		new StartMessage(0, 10),
			    		Duration.ofSeconds(5)).toCompletableFuture().thenAccept(s -> {}); 
		
		try {
			future.get(); // blocking, i.e. it waits until the topology is created
			
			Assert.assertEquals(10, actorMonitor.getCurrentTimeStep());
			
			System.out.println("SimulationStarter: Simulation completed. Terminating system.");			
			actorSystem.terminate();
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 
    }
    
    @After
    public void tearDown() {
        actorSystem.terminate();
        System.out.println("ActorMonitorTest tearDown(), i.e. terminate()");
    }
}
