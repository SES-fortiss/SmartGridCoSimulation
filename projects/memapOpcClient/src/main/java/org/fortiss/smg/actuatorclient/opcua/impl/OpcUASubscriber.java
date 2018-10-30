/** OpcUA subscriber client.Subscribes all the nodes mentioned in wrapper config xml
 * 
 */
package org.fortiss.smg.actuatorclient.opcua.impl;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaMonitoredItem;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaSubscription;
import org.eclipse.milo.opcua.stack.core.AttributeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.enumerated.MonitoringMode;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoredItemCreateRequest;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoringParameters;
import org.eclipse.milo.opcua.stack.core.types.structured.ReadValueId;
import org.slf4j.LoggerFactory;

/**
 * @author pampana
 *
 */
public class OpcUASubscriber implements Runnable {


		private static org.slf4j.Logger logger = LoggerFactory
				.getLogger(OpcUASubscriber.class);

		private OpcUAClientImpl clientImpl;
		private OpcUaClient client;
	    int qos;
	    private final CompletableFuture<OpcUaClient> future = new CompletableFuture<>();
	    private final AtomicLong clientHandles = new AtomicLong(1L);
	    
	    OpcUASubscriber(OpcUAClientImpl clientImpl,OpcUaClient client) {
			this.clientImpl = clientImpl;
		    this.client = client;
		}

		@Override
		public void run() {
			
			try {
				
			//start the subscription of required topics/nodes of interest
			logger.info("subscription starting: " + (new Date()));
			subscribeNodes(client, future, "ns=2;s=verbrauch/zaehler1/AktuellerWert");
			
			future.complete(client);
			}  catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getStackTrace().toString());
			}
			

		}	
	    
		
	    /**
		 * subscribes to nodes passed through nodeIdentifier
		 * @return none
		 */
	    public void subscribeNodes(OpcUaClient client, CompletableFuture<OpcUaClient> future, String nodeIdentifier) throws Exception {
	        // synchronous connect
	        client.connect().get();
	        int pollFrequency = clientImpl.getPollFrequency();

	        // create a subscription
	        UaSubscription subscription = client.getSubscriptionManager().createSubscription(pollFrequency).get();
	        
	        NodeId nodeid=NodeId.parse(nodeIdentifier);
	        
	        ReadValueId readValueId = new ReadValueId(
	        		nodeid,
		            AttributeId.Value.uid(), 
		            null, 
		            QualifiedName.NULL_VALUE);
	        
	        // important: client handle must be unique per item
	        UInteger clientHandle = uint(clientHandles.getAndIncrement());

	        MonitoringParameters parameters = new MonitoringParameters(
	            clientHandle,
	            //1000.0,     // sampling interval
	            (double) pollFrequency, // sampling interval
	            null,       // filter, null means use default
	            uint(10),   // queue size
	            true        // discard oldest
	        );

	        MonitoredItemCreateRequest request = new MonitoredItemCreateRequest(
	            readValueId, MonitoringMode.Reporting, parameters);

	        // when creating items in MonitoringMode.Reporting this callback is where each item needs to have its
	        // value/event consumer hooked up. The alternative is to create the item in sampling mode, hook up the
	        // consumer after the creation call completes, and then change the mode for all items to reporting.
	        BiConsumer<UaMonitoredItem, Integer> onItemCreated =
	            (item, id) -> item.setValueConsumer(this::onSubscriptionValue);

	        List<UaMonitoredItem> items = subscription.createMonitoredItems(
	            TimestampsToReturn.Both,
	            Arrays.asList(request),
	            onItemCreated
	        ).get();

	        for (UaMonitoredItem item : items) {
	            if (item.getStatusCode().isGood()) {
	                logger.info("item created for nodeId={}", item.getReadValueId().getNodeId());
	            } else {
	                logger.warn(
	                    "failed to create item for nodeId={} (status={})",
	                    item.getReadValueId().getNodeId(), item.getStatusCode());
	            }
	        }
	        logger.info("subscription started: " + (new Date()));
	        future.complete(client);
	    }
	    
	    /**
	     * called whenever a new value is received from server on subscribed topics
	     */
	    private void onSubscriptionValue(UaMonitoredItem item, DataValue value) {
	        logger.info(
	            "subscription value received: item={}, value={}",
	            item.getReadValueId().getNodeId(), value.getValue().getValue());
	        //store the received value in database by using createdoubleevent
	        //createNewEvent(value.getValue().getValue().toString(),String.valueOf(item.getReadValueId().getNodeId().getNamespaceIndex()),String.valueOf(item.getReadValueId().getNodeId().getIdentifier()));
	        System.out.println("Value: " + value.getValue().getValue().toString());
	        
	        
	    } 
}