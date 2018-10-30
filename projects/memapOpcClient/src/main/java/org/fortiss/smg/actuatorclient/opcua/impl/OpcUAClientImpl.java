package org.fortiss.smg.actuatorclient.opcua.impl;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfig;
import org.eclipse.milo.opcua.sdk.client.api.identity.AnonymousProvider;
import org.eclipse.milo.opcua.stack.client.UaTcpStackClient;
import org.eclipse.milo.opcua.stack.core.security.SecurityPolicy;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class OpcUAClientImpl {

    private static org.slf4j.Logger logger = LoggerFactory
			.getLogger(OpcUAClientImpl.class);

	private ScheduledExecutorService executor;
	private int pollFrequency;
	private String host;
	private String port;
	private String username; // for later adaptations
	private String password; // for later adaptations
	private OpcUaClient client;
	private String endpointUlr;
		
	public String getEndpointUlr() {
		return endpointUlr;
	}

	List<NodeId> nodeids =new ArrayList<NodeId>();
	
	public OpcUAClientImpl(String host, String port, String serverPath,
			int pollFreq, String username, String password) {
		this.host = host;
		this.port = port;
	    this.pollFrequency = pollFreq;
		this.username = username;
		this.password = password;
	    this.endpointUlr = "opc.tcp://" + this.host + ":" + this.port + "/" + serverPath;
		
		//configure the client		    
		try {
			client = configureOPCUAClient("myOpcUAClient","urn:smg:actuatorclient:opcua:client");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getStackTrace().toString());
		}
	}		
	
	public synchronized void activate() {
		executor = Executors.newSingleThreadScheduledExecutor();
		executor.execute(new OpcUASubscriber(this, client));			
	}

	public synchronized void deactivate() {
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public int getPollFrequency() {
		return pollFrequency;
	}

	
    /**
	 * Read value of Node from server, this method is currently not used
	 *  
	 * @return none
	 */	
    public DataValue readNodeValue(OpcUaClient client, NodeId nodeid) throws Exception {
//    	ReadValueId readValueID= new ReadValueId(nodeid,AttributeId.Value.uid(), null, null);
//    	return client.read(0, TimestampsToReturn.Both, Arrays.asList(readValueID)).get();
    	return client.readValue(0, TimestampsToReturn.Both, nodeid).get();
    }
    
    /**
	 *  write value to Node and returns the status code of execution, currently, this method does not do anything
	 *  
	 * @return status code of write operation (indicates weather successful or not)
	 */
    public StatusCode writeNodeValue(OpcUaClient client, NodeId nodeid,Variant writeValue) throws Exception {
    	try {
	    	CompletableFuture<StatusCode> f =client.writeValue(nodeid, DataValue.valueOnly(writeValue));
	    	return f.get();
    	}
    	catch (InterruptedException e) {
			logger.error(e.getMessage());
			return StatusCode.BAD;
		} catch (ExecutionException e) {
			logger.error(e.getMessage());
			return StatusCode.BAD;
		} catch (Exception e) {
			logger.error(e.getMessage());
			return StatusCode.BAD;
		}
    	
    }
    
    /**
	 *  Set configuration of client. setting server url, client name, etc.
	 *  @return opcua client with desired configuration
	 */
    public OpcUaClient configureOPCUAClient(String clientName, String clientURI) throws Exception {
    	try {
			SecurityPolicy securityPolicy = SecurityPolicy.None;

			EndpointDescription[] endpoints;

			try {				
			    endpoints = UaTcpStackClient
			        .getEndpoints(endpointUlr)
			        .get();
			    			    
			    
			    // nur fürs das debuggen
			    String[] buffer = new String[endpoints.length];
			    
			    int i = 0;
			    for (EndpointDescription ep : endpoints) {
					buffer[i] = ep.getEndpointUrl();
					i++;
				}
			    
			    System.out.println(Arrays.toString(buffer));
			    // der Server hat dieses Endpoint vier mal!!!
			    
			    
			} catch (Throwable ex) {
			    // try the explicit discovery endpoint as well
				ex.printStackTrace();
			    String discoveryUrl = endpointUlr + "/discovery";
			    logger.info("Trying explicit discovery URL: {}", discoveryUrl);
			    endpoints = UaTcpStackClient
			        .getEndpoints(discoveryUrl)
			        .get();
			}

			EndpointDescription endpoint = Arrays.stream(endpoints) 
					.filter(e -> e.getSecurityPolicyUri().equals(securityPolicy.getSecurityPolicyUri()))
			        .findFirst().orElseThrow(() -> new Exception("no desired endpoints returned"));

			logger.info("Using endpoint: {} [{}]", endpoint.getEndpointUrl(), securityPolicy);

			OpcUaClientConfig config = OpcUaClientConfig.builder()
			    .setApplicationName(LocalizedText.english(clientName))
			    .setApplicationUri(clientURI)
			    .setEndpoint(endpoint)
			    .setIdentityProvider(new AnonymousProvider())
			    .setRequestTimeout(uint(5000))
			    .build();
			
			OpcUaClient client= new OpcUaClient(config);
			return client;
			
		}  
    		catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return null;
		}
    	
    }
    
    
}
