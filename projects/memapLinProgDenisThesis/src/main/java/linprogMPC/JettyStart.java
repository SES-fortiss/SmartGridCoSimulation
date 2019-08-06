package linprogMPC;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonKey;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import akka.actor.ActorSystem;
import linprogMPC.controller.BuildingController;
import linprogMPC.controller.OpcUaBuildingController;
import linprogMPC.controller.TopologyController;
import linprogMPC.helperOPCua.BasicClient;
import linprogMPC.helperOPCua.OpcuaClient;
import opcMEMAP.ConfigInterface;
import simulation.SimulationStarter;
import topology.ActorTopology;

/**
 * 
 * JettyStart class initiates new topology controller. 
 * run method demands JsonArray as input. This JsonArray has to contain the buildingName, the OPC-UA address, the endpointDescriptor, and the nodesConfig Json file.
 * Then run tries to add the buildings to the building topology and starts the simulation in a loop.
 * 
 * @author freiesleben
 * 
 */

public class JettyStart {


	public TopologyController topologyMemapOn;
	public TopologyController topologyMemapOff;
	public JsonObject errorCode;
	public boolean simLoop=true;
	ScheduledExecutorService memapOnOffRegulator = Executors.newScheduledThreadPool(2);
	
	
	
	public TopologyController getTopology() {
		return topologyMemapOn;
	}
	
	public JsonObject getErrorCode() {
		return errorCode;
	}
	
	public void stopSimulation() {
		simLoop=false;
		topologyMemapOn.endSimulation();
		topologyMemapOff.endSimulation();
	}
	
	//initializes topologyController with all required buildings and has a Json containing the endpointValues(currently contains the configFile) as its input
	//The errorCode contains a list of all requested buildings and an error code for their status. (Currently 0=connected, 1=not connected)
	public void run(JsonArray endpointValues) {
		topologyMemapOn = new TopologyController("MemapOn", true, 1, 96, 7, 0, false, 9999);
		topologyMemapOff = new TopologyController("MemapOff", false, 1, 96, 7, 0, false, 9999);
		errorCode=new JsonObject();
		
		
		
		//Iterating through all the endpoint Jsons inputed in the user interface
		//generates a building controller for every jsonEndpoint,jsonNodes tuple
		//Buildings get attached to the topology
		for (int i=0;i<endpointValues.size();i++) {
					JsonObject jsonEndpoint = (JsonObject) endpointValues.get(i);
					try {
					String NodeConfig=(String) jsonEndpoint.get("config");
					JsonObject jsonNodes=null;
					try {
						jsonNodes = (JsonObject) Jsoner.deserialize(NodeConfig);
					} catch (JsonException e) {
						System.out.println("could not be deserialized");
						e.printStackTrace();
					}
					BuildingController sampleBuilding = new OpcUaBuildingController(jsonEndpoint, jsonNodes);
					topologyMemapOn.attach(sampleBuilding);
					topologyMemapOff.attach(sampleBuilding);
					errorCode.put((String) jsonEndpoint.get("name"), 0);
			
		} catch (IllegalStateException e2) {
			System.err.println("WARNING: Failed to create Client. Building has not been initialised");
			e2.printStackTrace();
			errorCode.put((String) jsonEndpoint.get("name"), 1);
		}
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Wait so that we get initial values for all devices

		//Here, the topology Controller gets started and runs in a loop.		
  		Runnable simulationMemapOn =
  			    new Runnable(){
  			        public void run(){
  			  		while (simLoop) {
  						topologyMemapOn.startSimulation();
  					}
  			        }
  			    };
  		Runnable simulationMemapOff =
  		  		new Runnable(){
  		          	public void run(){
  		  			while (simLoop) {
  		  			topologyMemapOff.startSimulation();
  		  			}
  		          	}
  		  		};
  			    
  		  	memapOnOffRegulator.schedule(simulationMemapOn, 0, TimeUnit.SECONDS);
  		  	memapOnOffRegulator.schedule(simulationMemapOff, 0, TimeUnit.SECONDS);
	}
}
