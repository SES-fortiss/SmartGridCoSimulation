package linprogMPC.OPCUA;

import java.util.concurrent.CompletableFuture;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class TestClient implements MemapClient{

	public static DataValue value = null;
	public NodeId nodeid;
	
	public void startClient(String clientName, String clientURI, NodeId nodeid) throws Exception {
		this.nodeid  = nodeid;
		
		TestClient example = new TestClient();

		//  configure and launch OPC UA Client
        new opcuaClient(example, clientName, clientURI).run();
    		
    }
	
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void run(OpcUaClient client, CompletableFuture<OpcUaClient> future) throws Exception {
        // synchronous connect
        client.connect().get();
        
//        NodeId node1 = new NodeId(2,30);
        NodeId node2 = new NodeId(2,27);
        
        value = client.readValue(0, TimestampsToReturn.Both, node2)
                .get();
//      value = ReadNode.ReadNodeValue(client, nodeid);

        logger.info("Node={}", value.toString());
     
        future.complete(client);
    }
    
	public double getData() {
		return (double) value.getValue().getValue();
	}

    
}    
        
