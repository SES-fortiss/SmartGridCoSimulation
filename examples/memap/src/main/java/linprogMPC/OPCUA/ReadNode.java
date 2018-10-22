package linprogMPC.OPCUA;


import java.util.concurrent.Callable;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class ReadNode implements Callable<DataValue> {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
//	private static org.slf4j.Logger logger = LoggerFactory
//			.getLogger(ReadNode.class);
	
	private OpcUaClient client;
	private NodeId nodeid;
    
	public ReadNode(OpcUaClient client, NodeId nodeid) {
//        this(memapClient, true);
		this.client = client;
		this.nodeid = nodeid;
    }
	
	
	public void run() {	
		
		try {
			ReadNodeValue( client, nodeid);
		} catch (Exception e) {
			logger.error("exeptionr", e);
		}

	}

	public static DataValue ReadNodeValue(OpcUaClient client, NodeId nodeid) throws Exception {
    	return client.readValue(0, TimestampsToReturn.Both, nodeid).get();
    }
	
	
//	@Override
//    public void run(OpcUaClient client, CompletableFuture<OpcUaClient> future) throws Exception {
//        // synchronous connect
//        client.connect().get();
//
//        // synchronous read request via VariableNode
//        VariableNode node = client.getAddressSpace().createVariableNode(Identifiers.Server_ServerStatus_StartTime);
//        DataValue value = node.readValue().get();
//
//        logger.info("StartTime={}", value.getValue().getValue());
//
//        // asynchronous read request
//        readServerStateAndTime(client).thenAccept(values -> {
//            DataValue v0 = values.get(0);
//            DataValue v1 = values.get(1);
//
//            logger.info("State={}", ServerState.from((Integer) v0.getValue().getValue()));
//            logger.info("CurrentTime={}", v1.getValue().getValue());
//
//            future.complete(client);
//        });
//    }
//
//    private CompletableFuture<List<DataValue>> readServerStateAndTime(OpcUaClient client) {
//        List<NodeId> nodeIds = ImmutableList.of(
//            Identifiers.Server_ServerStatus_State,
//            Identifiers.Server_ServerStatus_CurrentTime);
//
//        return client.readValues(0.0, TimestampsToReturn.Both, nodeIds);
//    }

	
}
