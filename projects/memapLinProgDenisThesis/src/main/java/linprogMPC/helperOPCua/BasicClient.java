package linprogMPC.helperOPCua;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.UaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfigBuilder;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaSubscriptionManager;
import org.eclipse.milo.opcua.stack.client.UaTcpStackClient;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;

public class BasicClient {
    public CompletableFuture<EndpointDescription[]> endpoints;
    OpcUaClientConfigBuilder cfg = new OpcUaClientConfigBuilder();
    OpcUaClient client;

    public BasicClient(String endpointURI, int endpointDescriptor) {
	this.endpoints = UaTcpStackClient.getEndpoints(endpointURI);
	try {
	    cfg.setEndpoint(endpoints.get()[endpointDescriptor]); // Decide which endpoint you want to use
	} catch (InterruptedException | ExecutionException e) {

	    e.printStackTrace();
	}
	this.client = new OpcUaClient(cfg.build());
	try {
	    this.client.connect().get();
	} catch (InterruptedException | ExecutionException e) {
	    e.printStackTrace();
	}
    }

    public DataValue readValue(int maxAge, TimestampsToReturn timestampstoreturn, NodeId nodeId)
	    throws InterruptedException, ExecutionException {
	return client.readValue(maxAge, timestampstoreturn, nodeId).get();
    }

    public Double readFinalDoubleValue(NodeId nodeId) throws InterruptedException, ExecutionException {
	Object obj = client.readValue(Integer.MAX_VALUE, TimestampsToReturn.Neither, nodeId).get().getValue()
		.getValue();
	if (obj instanceof Number) {
	    Double value = ((Number) obj).doubleValue();
	    return value;
	} else {
	    System.out.println("This is not a number!");
	}
	return null;
    }

    public UaSubscriptionManager getSubscriptionManager() {
	return client.getSubscriptionManager();
    }

    public CompletableFuture<UaClient> connect() {
	return client.connect();
    }

}
