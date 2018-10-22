package linprogMPC.OPCUA;


import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaSubscription;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.slf4j.LoggerFactory;
import org.eclipse.milo.opcua.sdk.client.model.nodes.objects.ServerNode;
import org.eclipse.milo.opcua.sdk.client.model.nodes.variables.ServerStatusNode;
import org.eclipse.milo.opcua.stack.core.AttributeId;
import org.eclipse.milo.opcua.stack.core.Identifiers;
import org.eclipse.milo.opcua.stack.core.types.builtin.DateTime;
import org.eclipse.milo.opcua.stack.core.types.enumerated.ServerState;
import org.eclipse.milo.opcua.stack.core.types.structured.BuildInfo;
import org.eclipse.milo.opcua.stack.core.types.structured.ReadValueId;
import org.eclipse.milo.opcua.stack.core.types.structured.ServerStatusDataType;
import org.slf4j.Logger;


public class TestClient implements MemapClient{

	public static DataValue value = null;
	
	public void startClient(String clientName, String clientURI, NodeId nodeid) throws Exception {
		TestClient example = new TestClient();

        new opcuaClient(example, clientName, clientURI, nodeid).run();
        
//		return opcuaClient.ReadNodeValue(example, node1);
        		
    }
	
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void run(OpcUaClient client, NodeId nodeid) throws Exception {
        // synchronous connect
        client.connect().get();
        
        value = client.readValue(0, TimestampsToReturn.Both, nodeid)
                .get();
        
        System.out.println("Wert gelesen: " + value.getValue().getValue());
        
        
        
        // === or
//        ReadValueId readValueId = new ReadValueId(
//        		nodeid, AttributeId.Value.uid(), null, null);
//        
//        client.read(0, TimestampsToReturn.Both, Arrays.asList(readValueId))
//                .get();
        // ===
        
        
        // create a subscription @ 1000ms
//        UaSubscription subscription = client.getSubscriptionManager().createSubscription(1000.0).get();

        
        
//        // Get a typed reference to the Server object: ServerNode
        ServerNode serverNode = client.getAddressSpace().getObjectNode(
            Identifiers.Server,
            ServerNode.class
        ).get();
//
//        // Read properties of the Server object...
//        String[] serverArray = serverNode.getServerArray().get();
//        String[] namespaceArray = serverNode.getNamespaceArray().get();
//
//        logger.info("ServerArray={}", Arrays.toString(serverArray));
//        logger.info("NamespaceArray={}", Arrays.toString(namespaceArray));
//
//        // Read the value of attribute the ServerStatus variable component
//        ServerStatusDataType serverStatus = serverNode.getServerStatus().get();
//
//        logger.info("ServerStatus={}", serverStatus);
//
//        // Get a typed reference to the ServerStatus variable
//        // component and read value attributes individually
        
        ServerStatusNode serverStatusNode = serverNode.getServerStatusNode().get();
        BuildInfo buildInfo = serverStatusNode.getBuildInfo().get();
        DateTime startTime = serverStatusNode.getStartTime().get();
        DateTime currentTime = serverStatusNode.getCurrentTime().get();
        ServerState state = serverStatusNode.getState().get();

        logger.info("ServerStatus.BuildInfo={}", buildInfo);
        logger.info("ServerStatus.StartTime={}", startTime);
        logger.info("ServerStatus.CurrentTime={}", currentTime);
        logger.info("ServerStatus.State={}", state);
//
//        future.complete(client);
    }
    
	public static double getData() {
		return (double) value.getValue().getValue();
	}
//  public static DataValue ReadNodeValue(OpcUaClient client, NodeId nodeid) throws Exception {
//
//  	return client.readValue(0, TimestampsToReturn.Both, nodeid).get();
//  }
    
}


	
	
	
	
	
	
//	public static void run(OpcUaClient client, NodeId nodeid) throws Exception {
//		// TODO Auto-generated method stub
//		
//		try {
//			ReadNodeValue(client,  nodeid);
//		} catch (Exception e) {
//			logger.error("exeptionr", e);
//		}
//		
//	}

	
//    private CompletableFuture<List<DataValue>> readServerStateAndTime(OpcUaClient client) {
//    	List<NodeId> nodeIds = null;
//    	NodeId node1 = new NodeId(2,30);
//    	NodeId node2 = new NodeId(2,27);
//    	nodeIds.add(node1);
//    	nodeIds.add(node2);
//    	
//        return client.readValues(0.0, TimestampsToReturn.Both, nodeIds);
//    }
    

//}
