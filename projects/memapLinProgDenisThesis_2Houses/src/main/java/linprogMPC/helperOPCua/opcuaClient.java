package linprogMPC.helperOPCua;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.Security;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfig;
import org.eclipse.milo.opcua.stack.client.UaTcpStackClient;
import org.eclipse.milo.opcua.stack.core.security.SecurityPolicy;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;
import org.eclipse.milo.opcua.stack.core.util.CryptoRestrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class opcuaClient {

	static {
        CryptoRestrictions.remove();
        // Required for SecurityPolicy.Aes256_Sha256_RsaPss
        Security.addProvider(new BouncyCastleProvider());
    }

	private String clientName;
	private String clientURI;
	

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final CompletableFuture<OpcUaClient> future = new CompletableFuture<>();


    private final MemapClient memapClient;

    

    public opcuaClient(MemapClient memapClient) throws Exception {
        this.memapClient = memapClient;
        this.clientName = memapClient.getclientName();
        this.clientURI = memapClient.getEndpointUrl();
    }
        		

    private OpcUaClient createClient() throws Exception {
        File securityTempDir = new File(System.getProperty("java.io.tmpdir"), "security");
        if (!securityTempDir.exists() && !securityTempDir.mkdirs()) {
            throw new Exception("unable to create security dir: " + securityTempDir);
        }
//        LoggerFactory.getLogger(getClass())
//            .warn("security temp dir: {}", securityTempDir.getAbsolutePath());

//        KeyStoreLoader loader = new KeyStoreLoader().load(securityTempDir, clientName, clientURI);
        
        try {
			SecurityPolicy securityPolicy = memapClient.getSecurityPolicy();

			EndpointDescription[] endpoints;

			try {
			    endpoints = UaTcpStackClient
			        .getEndpoints(memapClient.getEndpointUrl())
			        .get();
			} catch (Throwable ex) {
			    // try the explicit discovery endpoint as well
			    String discoveryUrl = memapClient.getEndpointUrl() + "/discovery";
			    logger.warn("Trying explicit discovery URL: {}", discoveryUrl);
			    endpoints = UaTcpStackClient
			        .getEndpoints(discoveryUrl)
			        .get();
			}

			EndpointDescription endpoint = Arrays.stream(endpoints)
			    .filter(e -> e.getSecurityPolicyUri().equals(securityPolicy.getSecurityPolicyUri()))
			    .findFirst().orElseThrow(() -> new Exception("no desired endpoints returned"));

			
			endpoint = updateEndpointUrl(endpoint, memapClient.getEndpointIp());
//			logger.warn("Using endpoint: {} [{}]", endpoint.getEndpointUrl(), securityPolicy);

			OpcUaClientConfig config = OpcUaClientConfig.builder()
			    .setApplicationName(LocalizedText.english(clientName))
			    .setApplicationUri(clientURI)
//            .setCertificateValidator(certificateValidator)
//			    .setCertificate(loader.getClientCertificate())
//			    .setKeyPair(loader.getClientKeyPair())
			    .setEndpoint(endpoint)
			    .setIdentityProvider(memapClient.getIdentityProvider())
			    .setRequestTimeout(uint(5000))
			    .build();
			OpcUaClient client= new OpcUaClient(config);
			return client;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }

    private static EndpointDescription updateEndpointUrl(
    	    EndpointDescription original, String hostname) throws URISyntaxException {

    	    URI uri = new URI(original.getEndpointUrl()).parseServerAuthority();

    	    String endpointUrl = String.format(
    	        "%s://%s:%s%s",
    	        uri.getScheme(),
    	        hostname,
    	        uri.getPort(),
    	        uri.getPath()
    	    );

    	    return new EndpointDescription(
    	        endpointUrl,
    	        original.getServer(),
    	        original.getServerCertificate(),
    	        original.getSecurityMode(),
    	        original.getSecurityPolicyUri(),
    	        original.getUserIdentityTokens(),
    	        original.getTransportProfileUri(),
    	        original.getSecurityLevel()
    	    );
    	}
    
    public void run() {
        try {
            OpcUaClient client = createClient();

            future.whenComplete((c, ex) -> {
                if (ex != null) {
                    logger.error("Error running example: {}", ex.getMessage(), ex);
                }
            });

            try {
                memapClient.run(client, future);
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
    }   
}
