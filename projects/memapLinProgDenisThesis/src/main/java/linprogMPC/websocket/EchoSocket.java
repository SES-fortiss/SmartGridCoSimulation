package linprogMPC.websocket;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketAdapter;
import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import linprogMPC.JettyStart;
import linprogMPC.components.ClientConsumer;
import linprogMPC.components.ClientCoupler;
import linprogMPC.components.ClientProducer;
import linprogMPC.components.ClientStorage;
import linprogMPC.components.ClientVolatileProducer;
import linprogMPC.components.prototypes.Device;
import linprogMPC.controller.BuildingController;
import linprogMPC.controller.TopologyController;;



public class EchoSocket extends WebSocketAdapter
{
    private static final Logger LOG = Log.getLogger(EchoSocket.class);

    public void onWebSocketClose(int statusCode, String reason)
    {
        super.onWebSocketClose(statusCode,reason);
        LOG.info("WebSocket Close: {} - {}",statusCode,reason);
    }

    public void onWebSocketConnect(Session session)
    {
        super.onWebSocketConnect(session);
        LOG.info("WebSocket Connect: {}",session);
//        getRemote().sendStringByFuture("You are now connected to " + this.getClass().getName());
    }

    public void onWebSocketError(Throwable cause)
    {
        LOG.warn("WebSocket Error",cause);
    }

    public void onWebSocketText(String message)
    {
        JettyStart js=new JettyStart();
    	if (message.equals("disconnect")) {
    		js.stopSimulation();
    	} else {
        
    			//Transfer String to JsonArray
    	JsonArray messageJsonArray=	new StringToJsonArray().StringToJsonArray(message);
    		

        // Regular Update (every 10 sec) of current Building data.
        //Every Building is iterated through
        //Every Device in every Building is iterated through
        //Key Values of each device are displayed
    	  		Runnable helloRunnable = new Runnable() {
  		    public void run() {
  		    	JsonObject connectionStatus=js.getErrorCode();
  		    	Iterator<BuildingController> iterator=js.getTopology().managedBuildings.iterator();
		    		getRemote().sendStringByFuture("empty");
		    		getRemote().sendStringByFuture("Connection Status:");
		    		Iterator<String> key=connectionStatus.keySet().iterator();
		    		while (key.hasNext()) {
		    			String nameOfBuilding=key.next();
		    			int status=(int) connectionStatus.get(nameOfBuilding);
		    			String statusDisplay=null;
		    			switch(status){ 
		    	        case 0: 
		    	            statusDisplay="Connected"; 
		    	            break; 
		    	        case 1: 
		    	            statusDisplay="Not Connected"; 
		    	            break; 
		    	        default: 
		    	            System.out.println("Something strange happened"); 
		    	        } 
		  				getRemote().sendStringByFuture(nameOfBuilding+": "+statusDisplay);
		    		}
		    		
  		    	while (iterator.hasNext()) {
	  				BuildingController build=iterator.next();
	  				String name=build.getName();
	  				getRemote().sendStringByFuture(" ");
	  				getRemote().sendStringByFuture("Name of Building: " + name);
//	  				getRemote().sendStringByFuture(" Connection Status:");
	  				//(js.getErrorCode()).get(name).toString());
//	  				unconnectedBuildings.remove(name);
	  				
	  				Iterator<? extends Device> devices= build.getDevices().iterator();

	  				while (devices.hasNext()) {
	  				Device device=devices.next();
	  				
	  				if (device instanceof ClientConsumer) {
	  				    ClientConsumer consumer = (ClientConsumer) device;
	  				    getRemote().sendStringByFuture("    Consumer");
	  				    String output="        Electricity Profile: "+consumer.electricityProfile.get(0) + " Heat Profile: "+ consumer.heatProfile.get(0);
	  				    getRemote().sendStringByFuture(output);
	  				}
	  				if (device instanceof ClientCoupler) {
	  				    ClientCoupler coupler = (ClientCoupler) device;
	  				    getRemote().sendStringByFuture("    Coupler");
	  				    String output="        Efficiency Elec: "+coupler.efficiencyElec+" Efficiency Heat: "+ coupler.efficiencyHeat + " Installed Power: "+ coupler.installedPower;
	  				    getRemote().sendStringByFuture(output);
	  				}
	  				if (device instanceof ClientProducer) {
	  				    ClientProducer producer = (ClientProducer) device;
	  				    getRemote().sendStringByFuture("    Producer");
	  				    String output="        Costs: "+producer.costs+" Efficiency: "+producer.efficiency + " Installed Power: " + producer.installedPower;
	  				    getRemote().sendStringByFuture(output);
	  				}
	  				if (device instanceof ClientStorage) {
	  				    ClientStorage storage = (ClientStorage) device;
	  				    getRemote().sendStringByFuture("    Storage");
	  				    String output="        State of Charge: "+ storage.myStateOfCharge+" Capacity: " + storage.capacity + " Efficiency: "+ storage.effIN;
	  				    getRemote().sendStringByFuture(output);
	  				}
	  				if (device instanceof ClientVolatileProducer) {
	  				    ClientVolatileProducer volatileProducer = (ClientVolatileProducer) device;
	  				    getRemote().sendStringByFuture("VolatileProducer");
	  				    String output="        Efficiency: " + volatileProducer.efficiency+" Installed Power: " + volatileProducer.installedPower;
	  				    getRemote().sendStringByFuture(output);
	  				}
	  				}
	  				
//	  				elect=Math.round(100.0 * elect) / 100.0;
  		    }   		
  		    }
  		};
  		
  		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
  		executor.scheduleAtFixedRate(helloRunnable, 10, 10, TimeUnit.SECONDS);
  		
        // Connection to selected endpoints. Moreover, Simulation can get started.(See JettyStart in linprogMPC)
        js.run(messageJsonArray);

            LOG.info("Sending: Successful"); 
    	} 
    }

    @Override
    public void onWebSocketBinary(byte[] arg0, int arg1, int arg2)
    {
        /* ignore */
    }
}
