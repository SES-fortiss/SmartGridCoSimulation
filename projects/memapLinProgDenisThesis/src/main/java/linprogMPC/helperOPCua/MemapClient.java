
package linprogMPC.helperOPCua;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.identity.IdentityProvider;
import org.eclipse.milo.opcua.sdk.client.api.identity.UsernameProvider;
import org.eclipse.milo.opcua.stack.core.security.SecurityPolicy;


public interface MemapClient {
	
		// CLIENT
	
		default String getclientName() {
			return "MEMAP Test Client";
		}

		default String getApplicationUri() {	    	
	    	return "urn:eclipse:memap:client";
	    }
		
		
		// SERVER
		
		default String getEndpointUrl() {	    	
//	    	return "opc.tcp://192.168.17.12:4840"; // Local Python Server
	    	return "opc.tcp://10.10.10.52:48040/"; // Sauter Server
//	    	return "opc.tcp://192.168.21.230:4840/"; // SmartPi
//	    	return "opc.tcp://opcua.demo-this.com:51210/UA/SampleServer"; //testServer
	    }
		
	    default SecurityPolicy getSecurityPolicy() {
	        return SecurityPolicy.None;
	    }

	    default IdentityProvider getIdentityProvider() {
//	        return new AnonymousProvider();
	        return new UsernameProvider("OPCUA","OPCUA");
	    }
	    
	    void run(OpcUaClient client, CompletableFuture<OpcUaClient> future) throws Exception;


	    
	    
	    
	

}
