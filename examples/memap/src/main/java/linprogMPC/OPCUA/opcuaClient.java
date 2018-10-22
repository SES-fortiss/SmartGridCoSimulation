package linprogMPC.OPCUA;

import java.io.File;
import java.security.Security;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfig;
import org.eclipse.milo.opcua.stack.client.UaTcpStackClient;
import org.eclipse.milo.opcua.stack.core.Stack;
import org.eclipse.milo.opcua.stack.core.security.SecurityPolicy;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;
import org.eclipse.milo.opcua.stack.core.util.CryptoRestrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;



public class opcuaClient {

	static {
        CryptoRestrictions.remove();

        // Required for SecurityPolicy.Aes256_Sha256_RsaPss
        Security.addProvider(new BouncyCastleProvider());
    }

	private OpcUaClient client;
//	private String host;
//	private String opcPort;
	private String clientName;
	private String clientURI;
	private NodeId nodeid;
	
	
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final CompletableFuture<OpcUaClient> future = new CompletableFuture<>();

    //private ExampleServer exampleServer;

    private final MemapClient memapClient;
//    private final boolean serverRequired = 0;

    public opcuaClient(MemapClient memapClient, String clientName, String clientURI, NodeId nodeid) throws Exception {
        this.memapClient = memapClient;
        this.clientName = clientName;
        this.clientURI = clientURI;
        this.nodeid = nodeid;
        		
        
//        try {
//			client = createClient(clientName, clientURI);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			logger.error(e.getStackTrace().toString());
//		}
        
    }

    /**
	 *  Read value of Node from server
	 *  
	 * @return none
	 */
//    public DataValue ReadNodeValue(OpcUaClient client, NodeId nodeid) throws Exception {
////    	ReadValueId readValueID= new ReadValueId(nodeid,AttributeId.Value.uid(), null, null);
////    	return client.read(0, TimestampsToReturn.Both, Arrays.asList(readValueID)).get();
//    	return client.readValue(0, TimestampsToReturn.Both, nodeid).get();
//    }
    

    private OpcUaClient createClient(String clientName, String clientURI) throws Exception {
        File securityTempDir = new File(System.getProperty("java.io.tmpdir"), "security");
        if (!securityTempDir.exists() && !securityTempDir.mkdirs()) {
            throw new Exception("unable to create security dir: " + securityTempDir);
        }
        LoggerFactory.getLogger(getClass())
            .info("security temp dir: {}", securityTempDir.getAbsolutePath());

//        KeyStoreLoader loader = new KeyStoreLoader().load(securityTempDir);

        SecurityPolicy securityPolicy = memapClient.getSecurityPolicy();

        EndpointDescription[] endpoints;

        try {
            endpoints = UaTcpStackClient
                .getEndpoints(memapClient.getEndpointUrl())
                .get();
        } catch (Throwable ex) {
            // try the explicit discovery endpoint as well
            String discoveryUrl = memapClient.getEndpointUrl() + "/discovery";
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
//            .setCertificate(loader.getClientCertificate())
//            .setKeyPair(loader.getClientKeyPair())
            .setEndpoint(endpoint)
            .setIdentityProvider(memapClient.getIdentityProvider())
            .setRequestTimeout(uint(5000))
            .build();
        OpcUaClient client= new OpcUaClient(config);
		return client;
    }

    public void run() {
        try {
            OpcUaClient client = createClient(clientName, clientURI);

            future.whenComplete((c, ex) -> {
                if (ex != null) {
                    logger.error("Error running example: {}", ex.getMessage(), ex);
                }

                try {
                    client.disconnect().get();
                    System.out.println("Client Disconnected");
                    Stack.releaseSharedResources();
                } catch (InterruptedException | ExecutionException e) {
                    logger.error("Error disconnecting:", e.getMessage(), e);
                }

                try {
                    Thread.sleep(1000);
                    System.exit(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            try {
                memapClient.run(client, nodeid);
                future.get(15, TimeUnit.SECONDS);
            } catch (Throwable t) {
                logger.error("Error running Memap client: {}", t.getMessage(), t);
                future.completeExceptionally(t);
            }
        } catch (Throwable t) {
            logger.error("Error getting client: {}", t.getMessage(), t);

            future.completeExceptionally(t);

            try {
                Thread.sleep(1000);
                System.exit(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(999999999);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static DataValue ReadNodeValue(OpcUaClient client, NodeId nodeid) throws Exception {
    	return client.readValue(0, TimestampsToReturn.Both, nodeid).get();
    }
    
}
