package memap.controller;

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
import com.google.gson.Gson;

import memap.components.prototypes.Device;
import memap.helper.HelperUnnestingJSON;
import memap.components.ClientDemand;
import memap.components.ClientCoupler;
import memap.components.ClientProducer;
import memap.components.ClientStorage;
import memap.components.ClientVolatileProducer;
import memap.helperOPCua.BasicClient;

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
 * An IllegalStateException will be raised.
 * 
 * @author Adrian.Krueger
 * @see BuildingController
 * @see EndpointConfigHandler
 * @see NodesConfigHandler
 */
public class OpcUaBuildingController implements BuildingController {

	TopologyController topologyController;
	public BasicClient client;
	private static AtomicInteger nextId = new AtomicInteger(0); // Counter for providing unique names

	public JsonObject endpointConfig;
	public JsonObject fullNodesConfig;
	public JsonObject nodesConfig;
	protected Gson gson = new Gson();

	public String name;
	private String endpointURL;
	private int endpointDescriptor;
	private Set<Device> devices = new HashSet<Device>();
	private Logger logger = LoggerFactory.getLogger(OpcUaBuildingController.class);

	/**
	 * Initializing the OpcUaBuildingController has two steps: i) Creating a Client
	 * and connect to the OPC-Server of the Building (endpointConfig) ii) Creating
	 * subscriptions/reading values from the connected Opc-Server of the
	 * building(nodesConfig)
	 * 
	 * Creating subscriptions/reading values might fail, but creating the client
	 * cannot.
	 * 
	 * @param opcUaEndpointConfig the endpoint config file (@see
	 *                            EndpointConfigHandler)
	 * @param opcUaNodesConfig    the nodes config file (@see NodesConfigHandler)
	 * @throws IllegalStateException when connection to server cannot be established
	 */
	public OpcUaBuildingController(TopologyController topologyController, JsonObject opcUaEndpointConfig,
			JsonObject opcUaNodesConfig) throws IllegalStateException {

		this.topologyController = topologyController;
		this.endpointConfig = opcUaEndpointConfig;
		this.fullNodesConfig = opcUaNodesConfig;
		EndpointConfigHandler endpointConfigHandler = new EndpointConfigHandler();
		NodesConfigHandler nodesConfigHandler = new NodesConfigHandler();
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
	public Set<? extends Device> getDevices() {
		return devices;
	}

	@Override
	public void attach(Device device) {
		devices.add(device);
	}

	/**
	 * The EndpointConfigHandler is used to establish the connection to the Opc-Ua
	 * Server of a building (i.e. the local EMS).
	 * 
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
			
			System.out.println("Reading " + name + " (" + endpointURL + ")");
		}

		/**
		 * Returns the name of the building. If no name is provided, a unique name is
		 * automatically given.
		 * 
		 * @return name of Building
		 */
		private String getName() {
			if (endpointConfig.containsKey("name")) {
				String name = (String) endpointConfig.get("name");
				// remove all whitespaces and non-visible Characters
				name = name.replaceAll("\\s+","_");
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
			if (endpointConfig.containsKey("url")) {
				String endpointurl = (String) endpointConfig.get("url");
				return endpointurl;
			} else {
				throw new NoSuchElementException(
						"Could not find a key 'url' in the endpoint config file. Please add this key");
			}
		}

		private int getEndpointDescriptor() {
			if (endpointConfig.containsKey("description")) {
				String descr = (String) endpointConfig.get("description");
				if (descr != null && !descr.isEmpty()) {
					return Integer.parseInt((String) endpointConfig.get("description"));
				} else {
//					throw new NoSuchElementException(
//							"Value of key 'description' is empty. Please add a value here");
					System.out.println("Missing endpoint description: EndpointDescriptor set to \"0\" ");
					return 0;
				}
			} else {
				throw new NoSuchElementException(
						"Could not find a key 'description' in the endpoint config file or value is empty. Please add this key");
			}
		}
	}

	/**
	 * The NodesConfigHHandler is used to read JSON files containing the location of
	 * devices of an OPC UA Building in the adressspace. In the future, instead of
	 * reading in a JSON config, the memap client shall automatically detect and
	 * correctly classify all devices from the OpcUa Server of the building. For now
	 * it is not clear how this can be done. Passing JSON config files to the
	 * BuildingController provides a lot of flexibility for now.
	 * 
	 * Nodes JSON config Files must have the following format:
	 * 
	 * { "deviceName": [ { "device1Id1" : "ns=X;i=X", "device1Id2": "ns=X;i=X", ...
	 * }, { "device2Id1" : "ns=X;i=X", "device2Id2": "ns=X;i=X", ... },...}]
	 * "deviceName:" [...] ... }
	 * 
	 * Refer to initDevices() for device names and required Ids. Also have a look in
	 * the resource directory for examples.
	 * 
	 * TODO: Implement automatic device detection
	 * 
	 * @author Adrian.Krueger, JanAxelMayer
	 *
	 */
	private class NodesConfigHandler {
		
		private void initDevices() {
			
			for ( String EMSkey : fullNodesConfig.keySet()) {
				JsonObject emsNodesConfig = (JsonObject) fullNodesConfig.get(EMSkey);
				System.out.println("Found EMS " + EMSkey + " (reading...)");
				
				// Trigger for CoSES-Lab
				NodeId trigger = null;
				
				for (String key : emsNodesConfig.keySet()) {
					switch (key) {
					
					case "NO": //"EMS":
						JsonArray ems = (JsonArray) ((JsonArray) emsNodesConfig.get("NO")).get(0);	

						try {
							JsonObject info = HelperUnnestingJSON.unnestJsonAry(ems);
							NodeId nid0 = NodeId.parse((String) info.get("nameID"));
							String EmsName = client.readFinalStringValue(nid0);
							System.out.println("EMS-Description (nameID) = " + EmsName);
						} catch (Exception e) {
							System.err.println("WARNING: Could not add name string to building " + name
									+ ".\nPlease check " + ems.toString());
						}
						break;
					
					case "COUPL":
						JsonObject coupler = (JsonObject) emsNodesConfig.get("COUPL");
						
						for (int i = 0; i < coupler.keySet().size(); i++) {							
							JsonObject coupl = HelperUnnestingJSON.unnestJsonObj(i, coupler);							
							try {
								NodeId primarySectId = NodeId.parse((String) coupl.get("PrimSect"));
								NodeId secondarySectId = NodeId.parse((String) coupl.get("SecdSect"));
								NodeId minPowerId = NodeId.parse((String) coupl.get("MinPower"));
								NodeId maxPowerId = NodeId.parse((String) coupl.get("MaxPower"));
								NodeId effHeatId = NodeId.parse((String) coupl.get("EffPrim"));
								NodeId effElecId = NodeId.parse((String) coupl.get("EffSec"));
								NodeId opCostId = NodeId.parse((String) coupl.get("PrimEnCost"));
								NodeId costCO2Id = NodeId.parse((String) coupl.get("CO2PerKWh"));
								NodeId setpointsId = NodeId.parse((String) coupl.get("SPDevPwr"));

								String couplerName = EMSkey + "_COUPL" + String.format("%02d",  i+1);
								ClientCoupler cc = new ClientCoupler(client, couplerName, primarySectId, secondarySectId, minPowerId, maxPowerId, effHeatId,
										effElecId, opCostId, costCO2Id, setpointsId, 0);
								attach(cc);
								cc.setTopologyController(topologyController);
								System.out.println("Coupler (" + (i+1) + "/" + coupler.keySet().size() + ") added to " + EMSkey);
							} catch (Exception e) {
								System.err.println("WARNING: Could not add coupler " + i + " to " + EMSkey
										+ ".\nPlease check " + coupl.toString());
							}
						}
						break;
	
					case "DEMND":
						JsonObject demands = (JsonObject) emsNodesConfig.get("DEMND");
						for (int i = 0; i < demands.keySet().size(); i++) {							
							JsonObject demnd = HelperUnnestingJSON.unnestJsonObj(i, demands);
							try {
								NodeId demndSectId = NodeId.parse((String) demnd.get("PrimSect"));
								NodeId arrayForecastId = NodeId.parse((String) demnd.get("DemandFC"));
								NodeId consumptionId = NodeId.parse((String) demnd.get("currentDem"));
								NodeId demandSetpointId = NodeId.parse((String) demnd.get("DemndSetPt"));
								
								String demandName = EMSkey + "_DEMND" + String.format("%02d",  i+1);
								ClientDemand cd = new ClientDemand(client, demandName, trigger, demndSectId, consumptionId, arrayForecastId, demandSetpointId, 0);
								attach(cd);
								cd.setTopologyController(topologyController);
								System.out.println("Demand (" + (i+1) + "/" + demands.keySet().size() + ") added to " + EMSkey);
							} catch (Exception e) {
								System.err.println("WARNING: Could not add demand " + i + " to " + EMSkey
										+ ".\nPlease check " + demnd.toString());
							}
						}
						break;
	
					case "CPROD":
						JsonObject controllableProd = (JsonObject) emsNodesConfig.get("CPROD");
						for (int i = 0; i < controllableProd.keySet().size(); i++) {
							JsonObject cprod = HelperUnnestingJSON.unnestJsonObj(i, controllableProd);
							try {
								NodeId primarySectId = NodeId.parse((String) cprod.get("PrimSect"));	
								NodeId minPowerId = NodeId.parse((String) cprod.get("MinPower"));
								NodeId maxPowerId = NodeId.parse((String) cprod.get("MaxPower"));
								NodeId effId = NodeId.parse((String) cprod.get("EffPrim"));
								NodeId costCO2Id = NodeId.parse((String) cprod.get("CO2PerKWh"));
								NodeId opCostId = NodeId.parse((String) cprod.get("PrimEnCost"));
								NodeId setpointsId = NodeId.parse((String) cprod.get("SPDevPwr"));
								
								String producerName = EMSkey + "_CPROD" + String.format("%02d",  i+1);
								ClientProducer cp = new ClientProducer(client, producerName, trigger, primarySectId, minPowerId, maxPowerId,
										effId, opCostId, costCO2Id, setpointsId, 0);
								attach(cp);
								cp.setTopologyController(topologyController);
								System.out.println("Controllable producer (" + (i+1) + "/" + controllableProd.keySet().size() + ") added to " + EMSkey);
							} catch (Exception e) {
								System.err.println(e);
								System.err.println("WARNING: Could not add controllable producer " + i + " to " + EMSkey
										+ ".\nPlease check " + cprod.toString());
							}
						}
						break;
	
					case "VPROD":
						JsonObject volatileProd = (JsonObject) emsNodesConfig.get("VPROD");
						for (int i = 0; i < volatileProd.keySet().size(); i++) {
							JsonObject vprod = HelperUnnestingJSON.unnestJsonObj(i, volatileProd);
							try {
								NodeId primarySectId = NodeId.parse((String) vprod.get("PrimSect"));
	//							NodeId effId = NodeId.parse((String) vprod.get("EffPrim"));
	//							NodeId minPowerId = NodeId.parse((String) vprod.get("MinPower"));
								NodeId maxPowerId = NodeId.parse((String) vprod.get("MaxPower"));
								NodeId productionId = NodeId.parse((String) vprod.get("curPwrPrim"));
								NodeId opCostId = NodeId.parse((String) vprod.get("PrimEnCost"));
								NodeId costCO2Id = NodeId.parse((String) vprod.get("CO2PerKWh"));
								
								String vproducerName = EMSkey + "_VPROD" + String.format("%02d",  i+1);
								ClientVolatileProducer cvp = new ClientVolatileProducer(client, vproducerName, primarySectId,
										maxPowerId, productionId, opCostId, costCO2Id, 0);
								attach(cvp);
								cvp.setTopologyController(topologyController);
								System.out.println("Volatile producer (" + (i+1) + "/" + volatileProd.keySet().size() + ") added to " + EMSkey);
							} catch (Exception e) {
								System.err.println("WARNING: Could not add volatile producer " + i + " to " + EMSkey
										+ ".\nPlease check " + vprod.toString());
							}
						}
						break;
						
					case "STRGE":
						JsonObject storages = (JsonObject) emsNodesConfig.get("STRGE");
						for (int i = 0; i < storages.keySet().size(); i++) {
							JsonObject strge = HelperUnnestingJSON.unnestJsonObj(i, storages);
							try {
								NodeId primarySectId = NodeId.parse((String) strge.get("PrimSect"));
								NodeId effInId = NodeId.parse((String) strge.get("EffPrim"));
								NodeId effOutId = NodeId.parse((String) strge.get("DisEffPrim"));
								NodeId maxChargingId = NodeId.parse((String) strge.get("MaxPowerIn"));
								NodeId maxDischargingId = NodeId.parse((String) strge.get("MaxPower"));
								NodeId capacityId = NodeId.parse((String) strge.get("Capacity"));
								NodeId stateOfChargeId = NodeId.parse((String) strge.get("curSOC"));
//								NodeId calculatedSocId = NodeId.parse((String) strge.get("calcSOC"));  // Only availible in CoSES
								NodeId calculatedSocId = NodeId.parse((String) strge.get("curSOC"));
								NodeId storageLossId = NodeId.parse((String) strge.get("StorLossPD"));
								NodeId opCostId = NodeId.parse((String) strge.get("PrimEnCost"));
								NodeId costCO2Id = NodeId.parse((String) strge.get("CO2PerKWh"));
								NodeId inputSetpointsId = NodeId.parse((String) strge.get("SPCharge"));
								NodeId outputSetpointsId = NodeId.parse((String) strge.get("SPDisChrg"));
	
								String storageName = EMSkey + "_STRGE" + String.format("%02d",  i+1);
								ClientStorage cs = new ClientStorage(client, storageName, capacityId, trigger, stateOfChargeId, calculatedSocId,
										maxChargingId, maxDischargingId, effInId, effOutId, storageLossId, primarySectId,
										opCostId, costCO2Id, inputSetpointsId, outputSetpointsId, 0);
								attach(cs);
								cs.setTopologyController(topologyController);
								System.out.println("Storgae (" + (i+1) + "/" + storages.keySet().size() + ") added to " + EMSkey);
							} catch (Exception e) {
								System.err.println("WARNING: Could not add storage " + i + " to " + EMSkey
										+ ".\nPlease check " + strge.toString());
							}
						}
						break;
					}
				}
			}
		}
	}

	private static String getNextId() {
		return Integer.toString(nextId.incrementAndGet());
	}
}
