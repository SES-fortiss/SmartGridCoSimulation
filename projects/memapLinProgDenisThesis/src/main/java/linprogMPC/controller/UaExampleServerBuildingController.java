package linprogMPC.controller;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;

import linprogMPC.components.ClientConsumer;
import linprogMPC.components.Consumer;
import linprogMPC.components.prototypes.Device;
import linprogMPC.helperOPCua.BasicClient;

public class UaExampleServerBuildingController implements BuildingController {
    BasicClient client; // address of example server

    public final String name;
    public final boolean hasLDHeating;
    public final int heatTransportLength;
    private final String endpointURI;
    private final int endpointDescriptor;
    private Set<Device> devices = new HashSet<Device>();

    public UaExampleServerBuildingController(String name, String endpointURI, int endpointDescriptor) {
	this.name = name;
	this.endpointURI = endpointURI;
	this.endpointDescriptor = endpointDescriptor;
	client = new BasicClient(endpointURI, endpointDescriptor);
	hasLDHeating = retrieveHasLDHeating();
	heatTransportLength = retrieveHeatTransportLength();

	Consumer consumer = new ClientConsumer(client, NodeId.parse("ns=3;s=AirConditioner_1.PowerConsumption"),
		NodeId.parse("ns=3;s=Furnace_6.PowerConsumption"), heatTransportLength); // AirConditioner switching 0
											 // and 182, Furnace 0.913 and
											 // 913
	attach(consumer);
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
	// TODO Auto-generated method stub
	return 50;
    }

    @Override
    public Set<? extends Device> getDevices() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void attach(Device device) {
	devices.add(device);
    }

    private boolean retrieveHasLDHeating() {
	NodeId nodeId = NodeId.parse("ns=3;s=AirConditioner_1.State"); // This, in fact, resembles the state of an Air
	// Conditioner
	try {
	    Variant value = client.readValue(0, TimestampsToReturn.Both, nodeId).getValue();
	    if (value.getValue() instanceof Integer) {
		return (Integer) value.getValue() == 1;
	    } else {
		System.out.println("hasLDHeating is not of Type integer");
	    }
	} catch (InterruptedException | ExecutionException e) {
	    e.printStackTrace();
	}
	return false;
    }

    private int retrieveHeatTransportLength() {
	return 50;
    }

    public String getEndpointURI() {
	return endpointURI;
    }

    public int endpointDescriptor() {
	return endpointDescriptor;
    }
}
