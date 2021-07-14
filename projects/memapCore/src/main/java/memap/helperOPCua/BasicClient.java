package memap.helperOPCua;


import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.UaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfigBuilder;
import org.eclipse.milo.opcua.sdk.client.api.identity.UsernameProvider;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaSubscriptionManager;
import org.eclipse.milo.opcua.stack.client.UaTcpStackClient;
import org.eclipse.milo.opcua.stack.core.security.SecurityPolicy;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;


public class BasicClient {
	public CompletableFuture<EndpointDescription[]> endpoints;
	OpcUaClientConfigBuilder cfg = new OpcUaClientConfigBuilder();
	OpcUaClient client;


	public BasicClient(String endpointURI, int endpointDescriptor) throws Exception, InterruptedException, ExecutionException {
		this.endpoints = UaTcpStackClient.getEndpoints(endpointURI);

		try {
			SecurityPolicy securityPolicy = SecurityPolicy.None;
			EndpointDescription endpoint = Arrays.stream(endpoints.get())
				    .filter(e -> e.getSecurityPolicyUri().equals(securityPolicy.getSecurityPolicyUri())).findFirst()
				    .orElseThrow(() -> new Exception("no desired endpoints returned"));
	  
//			System.out.println("Endpoint = " + endpoint);
			endpoint = updateEndpointUrl(endpoint, "10.10.10.52");
		    
			cfg.setApplicationName(LocalizedText.english("MEMAP Test Client"));
			cfg.setApplicationUri("urn:eclipse:memap:client");
			cfg.setEndpoint(endpoint); // Decide which endpoint you want to use
	//		cfg.setCertificateValidator(certificateValidator);
	//		cfg.setCertificate(loader.getClientCertificate());
	//		cfg.setKeyPair(loader.getClientKeyPair());
			cfg.setIdentityProvider(new UsernameProvider("MEMAP", "memap"));
			cfg.setRequestTimeout(uint(5000)).build();
	
			this.client = new OpcUaClient(cfg.build());
			
	        client.connect().get();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	        e.getMessage();
	        e.getCause();
	        e.getLocalizedMessage();
	    }
	}
	
	private static EndpointDescription updateEndpointUrl(EndpointDescription original, String hostname)
		    throws URISyntaxException {

		URI uri = new URI(original.getEndpointUrl()).parseServerAuthority();

		String endpointUrl = String.format("%s://%s:%s%s", uri.getScheme(), hostname, uri.getPort(), uri.getPath());

		return new EndpointDescription(endpointUrl, original.getServer(), original.getServerCertificate(),
			original.getSecurityMode(), original.getSecurityPolicyUri(), original.getUserIdentityTokens(),
			original.getTransportProfileUri(), original.getSecurityLevel());
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
			System.out.println(obj.toString());
			System.out.println(nodeId.toString());
		}
		return null;
	}
	
	public double[] readFinalDoubleArrayValue(NodeId nodeId) throws InterruptedException, ExecutionException {
		Object obj = client.readValue(Integer.MAX_VALUE, TimestampsToReturn.Neither, nodeId).get().getValue()
				.getValue();
		if (obj.getClass().isArray()) {
			double[] value = Stream.of((Double[]) obj).mapToDouble(Double::doubleValue).toArray();
			return value;
		} else {
			System.out.println("This is not an array!");
			System.out.println(obj.toString());
			System.out.println(nodeId.toString());
		}
		return null;
	}
	
	public String readFinalStringValue(NodeId nodeId) throws InterruptedException, ExecutionException {
		Object obj = client.readValue(Integer.MAX_VALUE, TimestampsToReturn.Neither, nodeId).get().getValue()
				.getValue();
		if (obj instanceof String) {
			String string = ((String) obj);
			return string;
		} else {
			System.out.println("This is not a string!");
			System.out.println(obj.toString());
			System.out.println(nodeId.toString());
		}
		return null;
	}	

	public UaSubscriptionManager getSubscriptionManager() {
		return client.getSubscriptionManager();
	}

	public CompletableFuture<UaClient> connect() {
		return client.connect();
	}

	public void writeValue(NodeId setpointsId, DataValue setpoint) {
		this.client.writeValue(setpointsId, setpoint);
	}

}
