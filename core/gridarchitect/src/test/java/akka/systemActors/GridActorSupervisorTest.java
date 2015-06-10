/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemActors;

//import Sessim.Behavior.HackBehavior;
//import Sessim.Behavior.HackBehaviorOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import scala.concurrent.duration.Duration;
import topology.ActorTopology;
import akka.ActorFactory;
import akka.actor.ActorSystem;
import akka.actor.Inbox;
import akka.basicActors.LoggingMode;
import akka.systemMessages.TimeStepMessage;
import akka.testkit.TestActorRef;

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
	private Inbox inbox;

    @SuppressWarnings("deprecation")
	@Before
    public void setUp() {
        actorTopology = new ActorTopology("TestSystem");
        actorTopology.addActor("/user/ActorSupervisor/Child", ActorFactory.createPlainActor());                

        actorSystem  = ActorSystem.create("TestSystem");              
        
        actorSupervisorRef = TestActorRef.create(actorSystem, ActorSupervisor.create("TestSystem", LoggingMode.DEBUG, actorTopology), "ActorSupervisor");
        actorSupervisor = actorSupervisorRef.underlyingActor();               
        
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
    public void testHandleTimeStepMessage() {		
        Assert.assertEquals(0, actorSupervisor.getCurrentTimeStep());                
        TimeStepMessage message = new TimeStepMessage(5);
        actorSupervisor.handleTimeStepMessage(actorMonitorRef, message);
        Assert.assertEquals(5, actorSupervisor.getCurrentTimeStep());
    }

	@Test
    public void testAskChildrenOneLayer()  throws Exception {
        actorTopology.addActor("/user/ActorSupervisor/TestGridActor0", ActorFactory.createPlainActor());
        actorTopology.addActor("/user/ActorSupervisor/TestGridActor1", ActorFactory.createPlainActor());
        actorTopology.addActor("/user/ActorSupervisor/TestGridActor2", ActorFactory.createPlainActor());

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
        actorSystem.shutdown();
    }
}
