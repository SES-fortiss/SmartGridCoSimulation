/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemActors;

import static akka.dispatch.Futures.sequence;
import static akka.pattern.Patterns.ask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.basicActors.BasicActor;
import akka.basicActors.LoggingMode;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.BasicRequest;
import akka.systemMessages.CompletionMessage;
import akka.systemMessages.EndSimulationMessage;
import akka.systemMessages.TimeStepMessage;
import akka.systemMessages.TimeoutMessage;
import akka.timeManagement.CurrentTimeStepSubscriber;
import akka.timeManagement.GlobalTime;
import configuration.GridArchitectConfiguration;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;
import simulation.SimulationStarter;
import topology.ActorTopology;


/**
 * 
 * Last Change: denis
 * Date: 14.02.2014

 * ActorSupervisor to handle Akka internals.
 * 
 */
public class ActorSupervisor extends UntypedActor implements CurrentTimeStepSubscriber {

    public boolean receivedAllStates = false;
    public List<ActorRef> responseTrace = new ArrayList<ActorRef>();
    
	public final Map<ActorRef, List<ActorRef>> responseTraceMap = new HashMap<ActorRef, List<ActorRef>>();
	
    public LoggingMode operationMode;
    public int actorCount = 0;
    public int totalActorCount = 0;
    public String simulationName;
    public ActorTopology actorTopology;
    
    /** Reference to global time in {@link SimulationStarter} */
	GlobalTime globalTime;
	int currentTimeStep;


    /*
     * ActorSupervisor Constructor
     */
    public ActorSupervisor(String simulationName, LoggingMode operationMode, ActorTopology actorTopology){
    	
        try {
            if (actorTopology == null) 
            	throw new IntitializeException("Supervisor init Error: gridTopology = NULL");
            if (actorTopology.getActorTopology().isEmpty()) 
            	throw new IntitializeException("Supervisor init Error: gridTopology = EMPTY");
            
            this.simulationName = simulationName;
            this.operationMode = operationMode;
            
            this.totalActorCount = actorTopology.getActorTopology().size();
            this.actorTopology = actorTopology;
            
        } catch (Exception e) {
            e.printStackTrace();
            getContext().system().shutdown();
        }
    }
      
	public static Props create(String simulationName, LoggingMode operationMode, ActorTopology actorTopology) {
		 return Props.create(ActorSupervisor.class, simulationName, operationMode, actorTopology);
	}
    
    @Override
	public void preStart() {
        getContext().system().eventStream().subscribe(getSelf(), TimeStepMessage.class);
        
    }
    
    @Override
	public void postStop() {
        System.out.println("ActorSupervisor STOP");
    }

    @Override
    public String toString() {
        return "GridActorSupervisor{" +
              //  ", timeStep=" + timeStep +
              ", timeStep=" + globalTime.getCurrentTimeStep() +
                ", receivedPower=" + receivedAllStates +
                ", responseTrace=" + responseTrace +
                ", responseTraceMap=" + responseTraceMap +
                ", operationMode=" + operationMode +
                ", actorCount=" + actorCount +
                ", totalActorCount=" + totalActorCount +
                ", simulationName='" + simulationName + '\'' +
                ", gridTopology=" + actorTopology +
                '}';
    }
    @Override
    public void onReceive(Object message) throws Exception {             	
        
    	if (message instanceof GlobalTime) {
        	globalTime = (GlobalTime) message;
        	globalTime.subscribeToCurrentTimeStep(this);
        	return;
        }
    	
        if (message instanceof TimeStepMessage) {
        	handleTimeStepMessage(getSender(), (TimeStepMessage)message);
        	return;
        }
                
        if (message == "Init") {
        	this.initialiseGrid();
        	return;
        }
         
        if (message == "Register") {
            this.actorCount++;
            // Logging der registrierten Aktoren. Alle 1000 und die letzten 5 Aktoren werden ausgegeben
            if (this.actorCount % 1000 == 0 || this.totalActorCount-this.actorCount < 5) {
                System.out.println(String.format(System.currentTimeMillis()+"ms Actor [%s] of [%s] registered", this.actorCount, this.totalActorCount));                
            }
                          
            if (this.actorCount == this.totalActorCount){
            	getContext().actorSelection("/user/ActorMonitor").tell("System created", getSelf());            	 
            }
            return;
        }
         
        if (message == "InitComplete") {
            System.out.println("initComplete?");
            getSender().tell(this.actorCount == this.totalActorCount, getSelf());
            return;
        }
        
        if (message instanceof EndSimulationMessage){
        	handleEndSimulation();
        	getSender().tell("ShutDown", getSelf());        	
        	return;
        }
        
        System.out.println("Kann die Nachricht nicht verarbeiten.");        
        System.out.println("Sender: " + getSender());
    }
   
    private void handleEndSimulation() throws Exception {
    	
    	List<Future<Object>> childrenResponseList = new ArrayList<Future<Object>>();    	
    	
    	for (ActorRef child: getContext().getChildren()) {
            childrenResponseList.add(ask(child, new EndSimulationMessage(), GridArchitectConfiguration.rootActorResponseTime));
        }    	
        
        Future<Iterable<Object>> childrenFuturesIterable = sequence(childrenResponseList, getContext().system().dispatcher());
        
        // hier wird gewartet bis die Kinder geantwortet haben.
        Await.result(childrenFuturesIterable, Duration.create(GridArchitectConfiguration.rootActorResponseTime, TimeUnit.MILLISECONDS));        
	}

	public void initialiseGrid() { 
        /**
         * In der Topologie sind alle Kinder gespeichert, hier wird nur das erste Layer initialisiert
         */        	
        for (String actorPath : actorTopology.getActorTopology().keySet()) {
        	// Children of the first layer
            if (3 == StringUtils.countMatches(actorPath, "/")){
            	// If the actor has not spawned
            	if (!actorTopology.getActorTopology().get(actorPath).hasAlreadyBeenSpawned){            		
            		spawnGridActor(actorPath.replace("/user/ActorSupervisor/", ""),this.actorTopology);
            		actorTopology.getActorTopology().get(actorPath).hasAlreadyBeenSpawned = true;
            	}
            }        	
        }
    }

    /**
    * Spawn Grid Actor.
    */
	public void spawnGridActor(String actorName, ActorTopology actorTopology) {
    	getContext().actorOf(BasicActor.create(simulationName, "/user/ActorSupervisor/"+ actorName, actorTopology), actorName);
    	getContext().actorSelection("/user/ActorSupervisor/" + actorName).tell(globalTime, getSelf());
    }

    /*
    *  Forwards the new TimeStep to the first Layer of Actors.
    *  */
    public void handleTimeStepMessage(ActorRef sender, TimeStepMessage message) {
    	globalTime.setCurrentTimeStep(message.timeStep);
        this.responseTrace = new ArrayList<ActorRef>();
        try {
            askChildren();
        }
        catch (Exception e) {System.out.println(e);}
    	
    }
    
    /*
    * Reports to ActorMonitor as soon as all Actors have completed their decision.
    * */
    public void reportToMonitor() {
        if (this.receivedAllStates) {
        	getContext().actorSelection("/user/ActorMonitor").tell(new CompletionMessage(true), getSelf());
        }
        else {
            System.out.println("reportToMonitor false");
        }
    }

    /*
    * Wrapper for ExecuteResponseLogic.
    * */
    public void askChildren(){
    	
        List<ActorRef> actorTrace = new ArrayList<ActorRef>();
        actorTrace.add(getSelf());
        
        try {
            askChildrenLogic(actorTrace);
        } catch (Exception e) {
            System.out.println("SUPERVISOR - askChildren: askChildrenLogic() GEHT NICHT");
        	e.printStackTrace();
        	this.getContext().actorSelection("/user/ActorMonitor").tell(new TimeoutMessage(), getSelf());
        }
    }

    
    /*
    * Asks first GridActor layer for Decision.
    * */
    
    private void askChildrenLogic (List<ActorRef> actorTrace) throws Exception{
    	
        List<Future<Object>> childrenResponseList = new ArrayList<Future<Object>>();                
        
        for (ActorRef child: getContext().getChildren()) {
        	//System.out.println("Request: "+ new BasicRequest(timeStep, actorTrace, null));
            childrenResponseList.add(ask(child, new BasicRequest(globalTime.getCurrentTimeStep(), globalTime.getCurrentTime(), actorTrace, null), GridArchitectConfiguration.rootActorResponseTime));
            //System.out.println("Supervisor: ASK A CHILD");
        }
        
        //System.out.println("-------------------------");        
        
        Future<Iterable<Object>> childrenFuturesIterable = sequence(childrenResponseList, getContext().system().dispatcher());
        Iterable<Object> childrenResponsesIterable = Await.result(childrenFuturesIterable, Duration.create(GridArchitectConfiguration.rootActorResponseTime, TimeUnit.MILLISECONDS));        

        this.receivedAllStates = true;
        for (Iterator<Object> i = childrenResponsesIterable.iterator(); i.hasNext();) {
        	BasicAnswer response = (BasicAnswer) i.next();        	
        	
            this.receivedAllStates = this.receivedAllStates && response.sane;
            //System.out.println(response);
            if (response.upstreamActorTrace.size() > 0){
            	responseTraceMap.put(response.upstreamActorTrace.get(response.upstreamActorTrace.size()-1), response.upstreamActorTrace);
            }
            
            for (ActorRef actor: response.upstreamActorTrace) 
            	this.responseTrace.add(actor);
        }
        
        this.reportToMonitor();
    }
    
    public int getCurrentTimeStep() {
    	return globalTime.getCurrentTimeStep();
    }
    
    public class IntitializeException extends Exception {
		private static final long serialVersionUID = 0L;
		public IntitializeException(String string){
    		super(string);
    	}
    }

	@Override
	public void update(int currentTimeStep) {
		this.currentTimeStep = currentTimeStep;
	}
}
