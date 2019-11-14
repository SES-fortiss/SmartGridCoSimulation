package linprogMPC.websocket;

import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketAdapter;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

import linprogMPC.JettyStart;
import linprogMPC.components.ClientConsumer;
import linprogMPC.components.ClientCoupler;
import linprogMPC.components.ClientProducer;
import linprogMPC.components.ClientStorage;
import linprogMPC.components.ClientVolatileProducer;
import linprogMPC.components.prototypes.Device;
import linprogMPC.controller.BuildingController;;

/**
 * 
 * EchoSocket class defines the methods of our websocket. The methods allow to
 * connect, close, specify errors, and defines how the server responds to
 * requests.
 * 
 * @author freiesleben
 * 
 */

public class EchoSocket extends WebSocketAdapter {
    private static final Logger LOG = Log.getLogger(EchoSocket.class);
    JettyStart js = new JettyStart();
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

    public void onWebSocketClose(int statusCode, String reason) {
	super.onWebSocketClose(statusCode, reason);
	LOG.info("WebSocket Close: {} - {}", statusCode, reason);
    }

    public void onWebSocketConnect(Session session) {
	super.onWebSocketConnect(session);
	LOG.info("WebSocket Connect: {}", session);
//        getRemote().sendStringByFuture("You are now connected to " + this.getClass().getName());
    }

    public void onWebSocketError(Throwable cause) {
	LOG.warn("WebSocket Error", cause);
    }

    // message contains the String message send by the javascript webapp.
    public void onWebSocketText(String message) {
	// System.out.println(message);
	// If User clicks disconnect the simulation is stopped, the executor is ended, a
	// new one is created and the console is emptied.
	if (message.equals("disconnect")) {
	    js.stopSimulation();
	    executor.shutdown();
	    executor = Executors.newScheduledThreadPool(2);
	    getRemote().sendStringByFuture("empty");
	    System.out.println("Disconnecting was sucessful");

	} else {
	    JsonArray messageAsJsonArray = null;
	    // Transfer String to JsonArray
	    if (message.equals("standard")) {
		String standardBuildings = "{\"name\":\"FortissBuilding1\",\"endpointURL\":\"opc.tcp://10.10.10.60:4880\",\"endpointDescriptor\":\"0\",\"config\":\"{\\\"battery\\\":[{\\\"capacityId\\\":\\\"ns=2;i=43\\\",\\\"maxChargingId\\\":\\\"ns=2;i=45\\\",\\\"maxDischargingId\\\":\\\"ns=2;i=46\\\",\\\"effInId\\\":\\\"ns=2;i=42\\\",\\\"effOutId\\\":\\\"ns=2;i=42\\\"}],\\\"chp\\\":[],\\\"consumer\\\":[{\\\"heatConsumptionId\\\":\\\"ns=2;i=10\\\",\\\"powerConsumptionId\\\":\\\"ns=2;i=14\\\"}],\\\"gasboiler\\\":[],\\\"heatpump\\\":[{\\\"installedPowerId\\\":\\\"ns=2;i=35\\\",\\\"effHeatId\\\":\\\"ns=2;i=32\\\",\\\"effElecId\\\":\\\"ns=2;i=33\\\"}],\\\"pv\\\":[{\\\"installedPowerId\\\":\\\"ns=2;i=25\\\",\\\"effId\\\":\\\"ns=2;i=23\\\",\\\"productionId\\\":\\\"ns=2;i=27\\\"}],\\\"solarthermic\\\":[],\\\"thermalstorage\\\":[]}\"},{\"name\":\"FortissBuilding2\",\"endpointURL\":\"opc.tcp://10.10.10.60:4890\",\"endpointDescriptor\":\"0\",\"config\":\"{\\\"battery\\\":[],\\\"chp\\\":[{\\\"installedPowerId\\\":\\\"ns=2;i=35\\\",\\\"effHeatId\\\":\\\"ns=2;i=32\\\",\\\"effElecId\\\":\\\"ns=2;i=33\\\"}],\\\"consumer\\\":[{\\\"heatConsumptionId\\\":\\\"ns=2;i=10\\\",\\\"powerConsumptionId\\\":\\\"ns=2;i=14\\\"}],\\\"gasboiler\\\":[],\\\"heatpump\\\":[],\\\"pv\\\":[],\\\"solarthermic\\\":[{\\\"installedPowerId\\\":\\\"ns=2;i=25\\\",\\\"effId\\\":\\\"ns=2;i=23\\\",\\\"productionId\\\":\\\"ns=2;i=27\\\"}],\\\"thermalstorage\\\":[{\\\"capacityId\\\":\\\"ns=2;i=43\\\",\\\"maxChargingId\\\":\\\"ns=2;i=45\\\",\\\"maxDischargingId\\\":\\\"ns=2;i=46\\\",\\\"effInId\\\":\\\"ns=2;i=42\\\",\\\"effOutId\\\":\\\"ns=2;i=42\\\"}]}\"}\r\n";
		messageAsJsonArray = StringToJsonArray.convertStringToJsonArray(standardBuildings);
	    } else {
		messageAsJsonArray = StringToJsonArray.convertStringToJsonArray(message);
	    }

	    JsonArray messageJsonArray = messageAsJsonArray;
	    // Regular Update (every 10 sec) of current Building data.
	    // Every Building is iterated through
	    // Every Device in every Building is iterated through
	    // Key Values of each device are displayed
	    Runnable displayRunnable = new Runnable() {
		public void run() {
		    JsonObject connectionStatus = js.getErrorCode();
		    Iterator<BuildingController> iterator = js.getTopology().managedBuildings.iterator();
		    getRemote().sendStringByFuture("empty");
		    getRemote().sendStringByFuture("Connection Status:");
		    Iterator<String> key = connectionStatus.keySet().iterator();
		    while (key.hasNext()) {
			String nameOfBuilding = key.next();
			int status = (int) connectionStatus.get(nameOfBuilding);
			String statusDisplay = null;
			switch (status) {
			case 0:
			    statusDisplay = "Connected";
			    break;
			case 1:
			    statusDisplay = "Not Connected";
			    break;
			default:
			    System.out.println("Something strange happened");
			}
			getRemote().sendStringByFuture(nameOfBuilding + ": " + statusDisplay);
		    }

		    while (iterator.hasNext()) {
			BuildingController build = iterator.next();
			String name = build.getName();
			getRemote().sendStringByFuture(" ");
			getRemote().sendStringByFuture("Name of Building: " + name);

			Iterator<? extends Device> devices = build.getDevices().iterator();

			while (devices.hasNext()) {
			    Device device = devices.next();

			    if (device instanceof ClientConsumer) {
				ClientConsumer consumer = (ClientConsumer) device;
				getRemote().sendStringByFuture("    Consumer");
				String output = "        Electricity Profile: " + consumer.electricityProfile[0]
					+ " Heat Profile: " + consumer.heatProfile[0];
				getRemote().sendStringByFuture(output);
			    }
			    if (device instanceof ClientCoupler) {
				ClientCoupler coupler = (ClientCoupler) device;
				getRemote().sendStringByFuture("    Coupler");
				String output = "        Efficiency Elec: " + coupler.efficiencyElec
					+ " Efficiency Heat: " + coupler.efficiencyHeat + " Installed Power: "
					+ coupler.installedPower;
				getRemote().sendStringByFuture(output);
			    }
			    if (device instanceof ClientProducer) {
				ClientProducer producer = (ClientProducer) device;
				getRemote().sendStringByFuture("    Producer");
				String output = "        Costs: " + producer.costs + " Efficiency: "
					+ producer.efficiency + " Installed Power: " + producer.installedPower;
				getRemote().sendStringByFuture(output);
			    }
			    if (device instanceof ClientStorage) {
				ClientStorage storage = (ClientStorage) device;
				getRemote().sendStringByFuture("    Storage");
				String output = "        State of Charge: " + storage.myStateOfCharge + " Capacity: "
					+ storage.capacity + " Efficiency: " + storage.effIN;
				getRemote().sendStringByFuture(output);
			    }
			    if (device instanceof ClientVolatileProducer) {
				ClientVolatileProducer volatileProducer = (ClientVolatileProducer) device;
				getRemote().sendStringByFuture("VolatileProducer");
				String output = "        Efficiency: " + volatileProducer.efficiency
					+ " Installed Power: " + volatileProducer.installedPower;
				getRemote().sendStringByFuture(output);
			    }
			}
			// Um zu runden nutze: Math.round(100.0 * number) / 100.0;
		    }
		}
	    };

	    // Connection to selected endpoints is initiated. Moreover, simulation can get
	    // started.(See JettyStart class in linprogMPC)
	    // This has to happen in a different Thread because otherwise the simulation
	    // blocks.
	    Runnable simulationRunnable = new Runnable() {
		public void run() {
		    js.run(messageJsonArray);
		}
	    };

	    // Excecutes displayRunnable. Has a first time delay of 10 Seconds and excecutes
	    // again every 10 seconds.
	    executor.scheduleAtFixedRate(displayRunnable, 10, 10, TimeUnit.SECONDS);
	    executor.schedule(simulationRunnable, 0, TimeUnit.SECONDS);

	    LOG.info("Submission of Data was Successful");
	}
    }

    @Override
    public void onWebSocketBinary(byte[] arg0, int arg1, int arg2) {
	/* ignore */
    }
}
