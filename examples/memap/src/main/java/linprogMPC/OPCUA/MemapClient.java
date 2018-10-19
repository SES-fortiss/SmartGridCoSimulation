package linprogMPC.OPCUA;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.identity.AnonymousProvider;
import org.eclipse.milo.opcua.sdk.client.api.identity.IdentityProvider;
import org.eclipse.milo.opcua.stack.core.security.SecurityPolicy;

public interface MemapClient {
	

	    default String getEndpointUrl() {
	        return "opc.tcp://0.0.0.0:4840";
//	        return "opc.tcp://localhost:12686/example";
	    }

	    default SecurityPolicy getSecurityPolicy() {
	        return SecurityPolicy.None;
	    }

	    default IdentityProvider getIdentityProvider() {
	        return new AnonymousProvider();
	    }

	    void run(OpcUaClient client, CompletableFuture<OpcUaClient> future) throws Exception;

}
