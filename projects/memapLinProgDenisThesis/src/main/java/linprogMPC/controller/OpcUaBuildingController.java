package linprogMPC.controller;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

import linprogMPC.components.ClientConsumer;
import linprogMPC.components.ClientCoupler;
import linprogMPC.components.ClientProducer;
import linprogMPC.components.ClientStorage;
import linprogMPC.components.ClientVolatileProducer;
import linprogMPC.components.prototypes.Device;
import linprogMPC.helperOPCua.BasicClient;
import linprogMPC.messages.extension.NetworkType;

/**
 * OpcUaBuildingController is an implementation of BuildingController used for
 * reading data via OPC-UA Clients. OpcUaBuildingController are configured with
 * JSON Files, which must contain all necessary Client and OPC-Nodes
 * information. See EndpointConfigHandler and NodesConfigHandler for formatting
 * the JSON config files.
 * 
 * Do not use a single OpcUaBuildingController for multiple buildings, i.e. if
 * data of multiple buildings is stored on a single OPC-Server, use multiple
 * OpcUaBuildingController connecting to the same Server.
 * OpcUaBuildingController can, however, share a single client to connect to
 * this server.
 * 
 * It is okay, if OpcUaBuildingController cannot find all devices from the
 * JSONNodes-config on the server (they will be ignored).
 * 
 * It is not okay, if OpcUaBuildingController cannot connect to the OPC-Server.
 * An IllegalStateException will be raised in this case.
 * 
 * @author Adrian.Krueger
 * @see BuildingController
 * @see EndpointConfigHandler
 * @see NodesConfigHandler
 */
public class OpcUaBuildingController implements BuildingController {

	public BasicClient client;
	private static AtomicInteger nextId = new AtomicInteger(0); // Counter for providing unique names

	public JsonObject endpointConfig;
	public JsonObject nodesConfig;

	public String name;
	public boolean hasLDHeating;
	public int heatTransportLength;
	private String endpointURL;
	private int endpointDescriptor;
	private Set<Device> devices = new HashSet<Device>();
	private Logger logger = LoggerFactory.getLogger(OpcUaBuildingController.class);

	/**
	 * Initializing the OpcUaBuildingController has two steps: i) Creating a Client
	 * and connect to the OPC-Server (endpointConfig) ii) Creating
	 * subscriptions/reading values from the OPc-Server (nodesConfig)
	 * 
	 * Creating subscriptions/reading values might fail, but creating the client
	 * cannot.
	 * 
	 * @param opcUaEndpointConfig the endpoint config file (@see
	 *                            EndpointConfigHandler)
	 * @param opcUaNodesConfig    the nodes config file (@see NodesConfigHandler)
	 * @throws IllegalStateException when connection to server cannot be established
	 */
	public OpcUaBuildingController(JsonObject opcUaEndpointConfig, JsonObject opcUaNodesConfig)
			throws IllegalStateException {

		// Initialize ConfigHandlers to access the Jsons
		this.endpointConfig = opcUaEndpointConfig;
		this.nodesConfig = opcUaNodesConfig;
		EndpointConfigHandler endpointConfigHandler = new EndpointConfigHandler();
		NodesConfigHandler nodesConfigHandler = new NodesConfigHandler();

		// TODO: How should these valued be accessed?
		this.heatTransportLength = 50;
		this.hasLDHeating = false;

		// Initialize the client which connects to the OpcUaServer
		endpointConfigHandler.initEndpoint();
		try {
			this.client = new BasicClient(endpointURL, endpointDescriptor);
		} catch (InterruptedException | ExecutionException e1) {
			System.err.println("ERROR: Connection to " + endpointURL + " with endpoint descriptor " + endpointDescriptor
					+ " failed. Please check network settings.");
			throw new IllegalStateException();
		}
		// Subscribe to all devices on the OpcUaServer which are referenced in the
		// nodesConfig File
		nodesConfigHandler.initDevices();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean hasLDHeaeting() {
		return hasLDHeating;
	}

	@Override
	public int getHeatTransportLength() {
		return heatTransportLength;
	}

	@Override
	public Set<? extends Device> getDevices() {
		return devices;
	}

	@Override
	public void attach(Device device) {
		devices.add(device);
	}

	/**
	 * Endpoint JSON config Files must have the following format:
	 * 
	 * { "name": "NameOfBuilding", "endpointURL": "opc.tcp://ipAdress:Port",
	 * "endpointDescriptor": "0, if default" }
	 * 
	 * @author Adrian.Krueger
	 *
	 */
	private class EndpointConfigHandler {

		public void initEndpoint() {
			name = getName();
			endpointURL = getEndpointURL();
			endpointDescriptor = getEndpointDescriptor();
		}

		/**
		 * Returns the name of the building. If no name is provided, a unique name is
		 * automatically provided.
		 * 
		 * @return name of Building
		 */
		private String getName() {
			if (endpointConfig.containsKey("name")) {
				String name = (String) endpointConfig.get("name");
				if (name.startsWith("Building X")) {
					name = getNextId();
					logger.info("Names starting with 'Building X' are allocated by the system. Changed name to '" + name
							+ "'");
				}
				return name;
			} else {
				String name = "Building X" + getNextId();
				logger.info("Could not find a 'name' key in the OpcUaEndpoint config file. Using name: '" + name
						+ "' instead.");
				return name;
			}
		}

		private String getEndpointURL() {
			if (endpointConfig.containsKey("endpointURL")) {
				return (String) endpointConfig.get("endpointURL");
			} else {
				throw new NoSuchElementException(
						"Could not find a key 'endpointURL' in the endpoint config file. Please add this key");
			}
		}

		private int getEndpointDescriptor() {
			if (endpointConfig.containsKey("endpointDescriptor")) {
				return Integer.parseInt((String) endpointConfig.get("endpointDescriptor"));
			} else {
				throw new NoSuchElementException(
						"Could not find a key 'endpointDescriptor' in the endpoint config file. Please add this key");
			}
		}
	}

	/**
	 * 
	 * Nodes JSON config Files must have the following format:
	 * 
	 * 
	 * { "deviceName": [ { "device1Id1" : "ns=X;i=X", "device1Id2": "ns=X;i=X", ...
	 * }, { "device2Id1" : "ns=X;i=X", "device2Id2": "ns=X;i=X", ... },...}]
	 * "deviceName:" [...] ... }
	 * 
	 * Refer to initDevices() for device names and required Ids.
	 * 
	 * @author Adrian.Krueger
	 *
	 */
	private class NodesConfigHandler {

		private void initDevices() {
			for (String key : nodesConfig.keySet()) {
				switch (key) {
				case "battery":
					JsonArray batteries = (JsonArray) nodesConfig.get("battery");
					for (int i = 0; i < batteries.size(); i++) {
						try {
							JsonObject battery = (JsonObject) batteries.get(i);
							NodeId capacityId = NodeId.parse((String) battery.get("capacityId"));
							NodeId maxChargingId = NodeId.parse((String) battery.get("maxChargingId"));
							NodeId maxDischargingId = NodeId.parse((String) battery.get("maxDischargingId"));
							NodeId effInId = NodeId.parse((String) battery.get("effInId"));
							NodeId effOutId = NodeId.parse((String) battery.get("effOutId"));
							attach(new ClientStorage(client, capacityId, maxChargingId, maxDischargingId, effInId,
									effOutId, NetworkType.ELECTRICITY, 0));
							System.out.println("Added battery to " + name);
						} catch (Exception e) {
							System.err.println("WARNING: Could not add battery " + i + " to building " + name
									+ ".\nPlease check " + batteries.toString());
						}
					}
					break;

				case "chp":
					JsonArray chps = (JsonArray) nodesConfig.get("chp");
					for (int i = 0; i < chps.size(); i++) {
						try {
							JsonObject chp = (JsonObject) chps.get(i);
							NodeId installedPowerId = NodeId.parse((String) chp.get("installedPowerId"));
							NodeId effHeatId = NodeId.parse((String) chp.get("effHeatId"));
							NodeId effElecId = NodeId.parse((String) chp.get("effElecId"));
							attach(new ClientCoupler(client, installedPowerId, effHeatId, effElecId, 0));
							System.out.println("Added chp to " + name);
						} catch (Exception e) {
							System.err.println("WARNING: Could not add chp " + i + " to building " + name
									+ ".\nPlease check " + chps.toString());
						}
					}
					break;

				case "consumer":
					JsonArray consumers = (JsonArray) nodesConfig.get("consumer");
					for (int i = 0; i < consumers.size(); i++) {
						try {
							JsonObject consumer = (JsonObject) consumers.get(i);
							attach(new ClientConsumer(client, NodeId.parse((String) consumer.get("heatConsumptionId")),
									NodeId.parse((String) consumer.get("powerConsumptionId")), 0));
							System.out.println("Added consumer to " + name);
						} catch (Exception e) {
							System.err.println("WARNING: Could not add consumer " + i + " to building " + name
									+ ".\nPlease check " + consumers.toString());
						}
					}
					break;

				case "gasboiler":
					JsonArray gasboilers = (JsonArray) nodesConfig.get("gasboiler");
					for (int i = 0; i < gasboilers.size(); i++) {
						try {
							JsonObject gasboiler = (JsonObject) gasboilers.get(i);
							NodeId installedPowerId = NodeId.parse((String) gasboiler.get("installedPowerId"));
							NodeId effId = NodeId.parse((String) gasboiler.get("effId"));
							NodeId costsId = NodeId.parse((String) gasboiler.get("costsId"));
							attach(new ClientProducer(client, installedPowerId, effId, costsId, NetworkType.HEAT, 0));
							System.out.println("Added gasboiler to " + name);
						} catch (Exception e) {
							System.err.println("WARNING: Could not add gasboiler " + i + " to building " + name
									+ ".\nPlease check " + gasboilers.toString());
						}
					}
					break;

				case "heatpump":
					JsonArray heatpumps = (JsonArray) nodesConfig.get("heatpump");
					for (int i = 0; i < heatpumps.size(); i++) {
						try {
							JsonObject heatpump = (JsonObject) heatpumps.get(i);
							NodeId installedPowerId = NodeId.parse((String) heatpump.get("installedPowerId"));
							NodeId effHeatId = NodeId.parse((String) heatpump.get("effHeatId"));
							NodeId effElecId = NodeId.parse((String) heatpump.get("effElecId"));
							attach(new ClientCoupler(client, installedPowerId, effHeatId, effElecId, 0));
							System.out.println("Added heatpump to " + name);
						} catch (Exception e) {
							System.err.println("WARNING: Could not add heatpump " + i + " to building " + name
									+ ".\nPlease check " + heatpumps.toString());
						}
					}
					break;

				case "PV":
					JsonArray pvs = (JsonArray) nodesConfig.get("pc");
					for (int i = 0; i < pvs.size(); i++) {
						try {
							JsonObject pv = (JsonObject) pvs.get(i);
							NodeId installedPowerId = NodeId.parse((String) pv.get("installedPowerId"));
							NodeId effId = NodeId.parse((String) pv.get("effId"));
							NodeId productionId = NodeId.parse((String) pv.get("productionId"));
							attach(new ClientVolatileProducer(client, installedPowerId, effId, productionId,
									NetworkType.ELECTRICITY, 0));
							System.out.println("Added pv to " + name);
						} catch (Exception e) {
							System.err.println("WARNING: Could not add pv " + i + " to building " + name
									+ ".\nPlease check " + pvs.toString());
						}
					}
					break;

				case "solarthermic":
					JsonArray solarthermics = (JsonArray) nodesConfig.get("solarthermic");
					for (int i = 0; i < solarthermics.size(); i++) {
						try {
							JsonObject solarthermic = (JsonObject) solarthermics.get(i);
							NodeId installedPowerId = NodeId.parse((String) solarthermic.get("installedPowerId"));
							NodeId effId = NodeId.parse((String) solarthermic.get("effId"));
							NodeId productionId = NodeId.parse((String) solarthermic.get("productionId"));
							attach(new ClientVolatileProducer(client, installedPowerId, effId, productionId,
									NetworkType.HEAT, 0));
							System.out.println("Added solarthermic to " + name);
						} catch (Exception e) {
							System.err.println("WARNING: Could not add solarthermic " + i + " to building " + name
									+ ".\nPlease check " + solarthermics.toString());
						}
					}
					break;

				case "thermalstorage":
					JsonArray thermalStorages = (JsonArray) nodesConfig.get("thermalstorage");
					for (int i = 0; i < thermalStorages.size(); i++) {
						try {
							JsonObject thermalStorage = (JsonObject) thermalStorages.get(i);
							NodeId capacityId = NodeId.parse((String) thermalStorage.get("capacityId"));
							NodeId maxChargingId = NodeId.parse((String) thermalStorage.get("maxChargingId"));
							NodeId maxDischargingId = NodeId.parse((String) thermalStorage.get("maxDischargingId"));
							NodeId effInId = NodeId.parse((String) thermalStorage.get("effInId"));
							NodeId effOutId = NodeId.parse((String) thermalStorage.get("effOutId"));
							attach(new ClientStorage(client, capacityId, maxChargingId, maxDischargingId, effInId,
									effOutId, NetworkType.ELECTRICITY, 0));
							System.out.println("Added thermalstorage to " + name);
						} catch (Exception e) {
							System.err.println("WARNING: Could not add thermalstorage " + i + " to building " + name
									+ ".\nPlease check " + thermalStorages.toString());
						}
					}
					break;
				}
			}
		}
	}

	private static String getNextId() {
		return Integer.toString(nextId.incrementAndGet());
	}

}
