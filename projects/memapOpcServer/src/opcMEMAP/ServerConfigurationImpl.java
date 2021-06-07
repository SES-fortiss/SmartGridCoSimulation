package opcMEMAP;


import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.ubyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.core.Reference;
import org.eclipse.milo.opcua.sdk.server.OpcUaServer;
import org.eclipse.milo.opcua.sdk.server.api.AccessContext;
import org.eclipse.milo.opcua.sdk.server.api.DataItem;
import org.eclipse.milo.opcua.sdk.server.api.MethodInvocationHandler;
import org.eclipse.milo.opcua.sdk.server.api.MonitoredItem;
import org.eclipse.milo.opcua.sdk.server.api.Namespace;
import org.eclipse.milo.opcua.sdk.server.api.ServerNodeMap;
import org.eclipse.milo.opcua.sdk.server.model.nodes.variables.AnalogItemNode;
import org.eclipse.milo.opcua.sdk.server.nodes.AttributeContext;
import org.eclipse.milo.opcua.sdk.server.nodes.NodeFactory;
import org.eclipse.milo.opcua.sdk.server.nodes.ServerNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaFolderNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaMethodNode;
import org.eclipse.milo.opcua.sdk.server.util.SubscriptionModel;
import org.eclipse.milo.opcua.stack.core.AttributeId;
import org.eclipse.milo.opcua.stack.core.Identifiers;
import org.eclipse.milo.opcua.stack.core.StatusCodes;
import org.eclipse.milo.opcua.stack.core.UaException;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UShort;
import org.eclipse.milo.opcua.stack.core.types.enumerated.NodeClass;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.ReadValueId;
import org.eclipse.milo.opcua.stack.core.types.structured.WriteValue;
import org.eclipse.milo.opcua.stack.core.util.FutureUtils;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;

import opcMEMAP.serverConfigurationClassesJSON.MyFolderNode;
import opcMEMAP.serverConfigurationClassesJSON.MyVariableNode;

public class ServerConfigurationImpl implements Namespace {
	
    private final SubscriptionModel subscriptionModel;
    private final NodeFactory nodeFactory;
    private final OpcUaServer server;
    private final UShort namespaceIndex;
    private final String nsName;
    private List<UaFolderNode> folderNodesList;
    
    private ArrayList<AnalogItemNode> analogNodeList = new ArrayList<AnalogItemNode>();

	private static org.slf4j.Logger logger = LoggerFactory
			.getLogger(ServerConfigurationImpl.class);
	
	private ConfigInterface configInterface;
	
	//public ReadContext myReadContext = null; // wurde mal ausprobiert, kann teoretisch bald weg.
    
    //constructor of the class
    public ServerConfigurationImpl(OpcUaServer server, UShort namespaceIndex, ConfigInterface configInterface) {
    	
    	
        this.server = server;
        this.configInterface = configInterface;
        this.configInterface.setServerReference(this);
        
        this.namespaceIndex = namespaceIndex; //  index of the namespace. Usually=2;
        this.nsName = configInterface.getNamespace();
        
        
        subscriptionModel = new SubscriptionModel(server, this);

        nodeFactory = new NodeFactory(
            server.getNodeMap(),
            server.getObjectTypeManager(),
            server.getVariableTypeManager()
        );

        try {            
        	addFolderNodes();
            addNodes();
        } catch (Exception e) {
            logger.error("Error adding nodes: {}", e.getMessage(), e);
        }
}
    
    /**
     * Add desired Folder Nodes to Namespace under the folder of rootnode
     * @param rootNode
     */
    private void addFolderNodes() {
    	folderNodesList = new ArrayList<UaFolderNode>();

    	// System.out.println("Begin configuration of server from created Configuration");
    	// achtung reihenfolge wird wichtig sein!!!
    	
    	try {
	    	for(MyFolderNode node : configInterface.getFolderNodeList() )	{
	    		
		    	//System.out.println("Folder: nodeID="+node.nodeID+" namespace=" + node.namespace);
		    	//System.out.println("Folder: nodeDescription="+node.description);	

				NodeId parent = null;
				if (node.nodeID.contains("/")) {
					String[] buffer = node.nodeID.split("/");
					
					String lookUpString = "";
					
					if (buffer.length > 1) {
						lookUpString = buffer[0];
					}
					for (int i = 1; i < buffer.length-1; i++) {
						lookUpString += "/" + buffer[i];
					}					
					
					ServerNodeMap serverNodeMap = server.getNodeMap();
					for (NodeId _nodeId : serverNodeMap.keySet()) {
						if (_nodeId.getIdentifier().toString().contentEquals(lookUpString)) {
							parent = _nodeId;
						}
					}
				}
			
            	NodeId folderNodeId = new NodeId(namespaceIndex, node.nodeID);

            	// DisplayName is not the full path
            	String testString = node.nodeID;            	
            	String[] testBuffer = testString.split("/");
            	testString = testBuffer[testBuffer.length-1];
            	
            	UaFolderNode folderNode = new UaFolderNode(
	                server.getNodeMap(),
	                folderNodeId,
	                new QualifiedName(namespaceIndex, node.displayName),
	                LocalizedText.english(testString)
	            );

            	server.getNodeMap().addNode(folderNode);

	        	// Make sure our new folder shows up under the server's Objects folder                
	            NodeId source = parent == null ? Identifiers.ObjectsFolder : parent;                
	            server.getUaNamespace().addReference(
	                source,
	                Identifiers.Organizes,
	                true,
	                folderNodeId.expanded(),
	                NodeClass.Object
	            );
            
            	folderNodesList.add(folderNode);
            	
            	//System.out.println();
	    	}
    	} catch (UaException e) {
            logger.error("Error adding nodes: {}", e.getMessage(), e);
        }
    	
    }

    /**
     * Add desired Nodes to Namespace under the folder of rootnode
     * @param rootNode
     */
    private void addNodes() {    	
        try {
        	
	    	for(MyVariableNode node : configInterface.getVariableNodeList()){	    		
	    		logger.info("Variable nodeID: " + node.nodeID);
	    		NodeId nodeId = new NodeId(namespaceIndex, node.nodeID);
	   			
				AnalogItemNode itemNode = nodeFactory.createVariable(
					nodeId,
		            new QualifiedName(namespaceIndex, node.displayName),
		            LocalizedText.english(node.displayName),
		            Identifiers.AnalogItemType,
		            AnalogItemNode.class
		        );
				
				itemNode.setAccessLevel( ubyte(node.getAccessLevelAsInt()) );
		        itemNode.setUserAccessLevel( ubyte(node.getAccessLevelAsInt()) );
		        itemNode.setDataType(node.getDataType());
		        itemNode.setDescription(LocalizedText.english(node.description));
		        itemNode.setValue(new DataValue(new Variant(node.getValueWithDataType())));
		        //node1.setEURange(new Range(0.0, 100.0));
		        itemNode.setMinimumSamplingInterval(node.getMinSamplingInterval());
		        itemNode.setHistorizing(node.isHistorizing());	
		        
		        server.getNodeMap().addNode(itemNode); 
		        // this list directly contains all itemNodes, to allow access from any JAVA class
		        analogNodeList.add(itemNode);
		        
		        // Make sure our new folder shows up under the server's Objects folder
		        
		        NodeId parent = null;
				if (node.nodeID.contains("/")) {
					String[] buffer = node.nodeID.split("/");
					
					String lookUpString = "";
					
					if (buffer.length > 1) {
						lookUpString = buffer[0];
					}
					for (int i = 1; i < buffer.length-1; i++) {
						lookUpString += "/" + buffer[i];
					}					
					
					ServerNodeMap serverNodeMap = server.getNodeMap();
					for (NodeId _nodeId : serverNodeMap.keySet()) {
						if (_nodeId.getIdentifier().toString().contentEquals(lookUpString)) {
							parent = _nodeId;
						}
					}
				}
		        
		        NodeId source = parent == null ? Identifiers.ObjectsFolder : parent;
				server.getUaNamespace().addReference(
					source,
				    Identifiers.Organizes,
				    true,
				    nodeId.expanded(),
				    NodeClass.Object
				);
    		}
        } catch (UaException e) {
			e.printStackTrace();
		}    	
    }     
    
    /**
     * Diese Methode wird aufgerufen, wenn man die Struktur abfragt (aus dem UaExpert)
     */
    @Override
    public CompletableFuture<List<Reference>> browse(AccessContext context, NodeId nodeId) {
        ServerNode node = server.getNodeMap().get(nodeId);
        if (node != null) {
            return CompletableFuture.completedFuture(node.getReferences());
        } else {
            return FutureUtils.failedFuture(new UaException(StatusCodes.Bad_NodeIdUnknown));
        }
    }
    
    /**
     * methodoverwrite: this method is called when ever there a client try to read a node from this server namespace
     */
    @Override
    public void read(
        ReadContext context,
        Double maxAge,
        TimestampsToReturn timestamps,
        List<ReadValueId> readValueIds) {
    	    	
    	// myReadContext = context;

        List<DataValue> results = Lists.newArrayListWithCapacity(readValueIds.size());

        for (ReadValueId readValueId : readValueIds) {
            ServerNode node = server.getNodeMap().get(readValueId.getNodeId());

            if (node != null) {
                DataValue value = node.readAttribute(
                    new AttributeContext(context),
                    readValueId.getAttributeId(),
                    timestamps,
                    readValueId.getIndexRange(),
                    readValueId.getDataEncoding()
                );

                results.add(value);
                logger.info("read value={} for node {}", value.getValue(), node.getBrowseName());
            } else {
                results.add(new DataValue(StatusCodes.Bad_NodeIdUnknown));
            }
        }

        context.complete(results);
    }

    /**
     * methodoverwrite: this method is called when ever there a client try to write a node value into this server namespace
     * generally you do not have to touch this method unless you wanna perform some advanced operations.
     */
    @Override
    public void write(WriteContext context, List<WriteValue> writeValues) {
        List<StatusCode> results = Lists.newArrayListWithCapacity(writeValues.size());
        
        // Das Problem ist hier, dass diese methode den richtigen context benötigt.
        // Ich habe noch nicht rausgefunden, wie man das richtig einsetzt.
        
        for (WriteValue writeValue : writeValues) {
        	
        	/*
        	System.out.println("NodeID: " + writeValue.getNodeId());
        	System.out.println("AttributeId: " + writeValue.getAttributeId());
        	System.out.println("IndexRange: " + writeValue.getIndexRange());
        	System.out.println("Value: " + writeValue.getValue());
        	*/
        	
            ServerNode node = server.getNodeMap().get(writeValue.getNodeId());
            if (node != null) {
                try {
                    node.writeAttribute(
                        new AttributeContext(context),
                        writeValue.getAttributeId(),
                        writeValue.getValue(),
                        writeValue.getIndexRange()
                    );
                    results.add(StatusCode.GOOD);
                    logger.info(
                        "Wrote value {} to {} attribute of {}",
                        writeValue.getValue().getValue(),
                        AttributeId.from(writeValue.getAttributeId()).map(Object::toString).orElse("unknown"),
                        node.getNodeId());
                } catch (UaException e) {
                    logger.error("Unable to write value={}", writeValue.getValue(), e);
                    results.add(e.getStatusCode());
                }
            } else {
                results.add(new StatusCode(StatusCodes.Bad_NodeIdUnknown));
            }
        }
        context.complete(results);
    }

    @Override
    public void onDataItemsCreated(List<DataItem> dataItems) {
        subscriptionModel.onDataItemsCreated(dataItems);
    }

    @Override
    public void onDataItemsModified(List<DataItem> dataItems) {
        subscriptionModel.onDataItemsModified(dataItems);
    }

    @Override
    public void onDataItemsDeleted(List<DataItem> dataItems) {
        subscriptionModel.onDataItemsDeleted(dataItems);
    }

    @Override
    public void onMonitoringModeChanged(List<MonitoredItem> monitoredItems) {
        subscriptionModel.onMonitoringModeChanged(monitoredItems);
    }

    @Override
    public Optional<MethodInvocationHandler> getInvocationHandler(NodeId methodId) {
        Optional<ServerNode> node = server.getNodeMap().getNode(methodId);

        Optional<MethodInvocationHandler> result = node.flatMap(n -> {
            if (n instanceof UaMethodNode) {
                return ((UaMethodNode) n).getInvocationHandler();
            } else {
                return Optional.empty();
            }
        });
        
        return result;
}
    @Override
    public UShort getNamespaceIndex() {
        return namespaceIndex;
    }

	@Override
	public String getNamespaceUri() {		
		return nsName;
	}

	public ArrayList<AnalogItemNode> getAnalogNodeList() {
		return analogNodeList;
	}
}
