package opcMEMAP;

import static org.eclipse.milo.opcua.sdk.server.api.config.OpcUaServerConfig.USER_TOKEN_POLICY_ANONYMOUS;
import static org.eclipse.milo.opcua.sdk.server.api.config.OpcUaServerConfig.USER_TOKEN_POLICY_USERNAME;

import java.io.File;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.server.OpcUaServer;
import org.eclipse.milo.opcua.sdk.server.api.config.OpcUaServerConfig;
import org.eclipse.milo.opcua.sdk.server.identity.UsernameIdentityValidator;
import org.eclipse.milo.opcua.stack.core.application.DefaultCertificateManager;
import org.eclipse.milo.opcua.stack.core.application.DirectoryCertificateValidator;
import org.eclipse.milo.opcua.stack.core.security.SecurityPolicy;
import org.eclipse.milo.opcua.stack.core.types.builtin.DateTime;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.BuildInfo;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;

import opcMEMAP.serverConfigurationClassesJSON.GenericJsonReader;
import opcMEMAP.serverConfigurationClassesJSON.ServerJsonConfig;



public class StartOPCUAServer implements Runnable{	
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(StartOPCUAServer.class);
		
	private OpcUaServer server;
	private SecurityConfig securityConfig;
	private ServerJsonConfig jsonConfig = new ServerJsonConfig();
	private String path = null;
	
	public StartOPCUAServer(String interfacePath) {
		path = interfacePath;
	}
	
	public StartOPCUAServer() { path = "src/Building2.json";}

	@Override
	public void run() {
		
		try {			
			jsonConfig = createConfig(path);
			
			securityConfig = prepareSecurityConfiguration();
			server = prepareServerNodesConfiguration();
		    server.startup().get(); 			// hier wird der Server gestartet.		    		     
		    
		    
		    // start: bin mir nicht unsicher, ob das überhaupt gebraucht wird.
		    final CompletableFuture<Void> future = new CompletableFuture<>();
		    Runtime.getRuntime().addShutdownHook(new Thread(() -> future.complete(null)));
		    future.get();		    
		    // ende: bin mir unsicher

		}  catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		

	}	

	private ServerJsonConfig createConfig(String path) {
		ServerJsonConfig result = null;
		
		try {    
			result = GenericJsonReader.readFileAndCreateConfig(path);
		}
		catch (Exception e) {
			e.printStackTrace(); 
		}
										
		return result;
	}
	
	private OpcUaServer prepareServerNodesConfiguration() {
		List<String> bindAddresses = new ArrayList<String>();
	    bindAddresses.add(jsonConfig.getHost());
	
	    List<String> endpointAddresses = new ArrayList<String>();	    
	    endpointAddresses.add(jsonConfig.getHost());	    
	    String applicationUri = jsonConfig.getUri();	    
	    
	    OpcUaServerConfig serverConfig = OpcUaServerConfig.builder()
	        .setApplicationUri(applicationUri)
	        .setApplicationName(LocalizedText.english("MEMAP-OPC-UA-Server"))
	        .setBindPort(jsonConfig.getPort())
	        .setBindAddresses(bindAddresses)
	        .setEndpointAddresses(endpointAddresses)
	        .setBuildInfo(
	            new BuildInfo(
	                "urn:fortiss:opc:server:memap",
	                "fortiss",
	                "Memap OPC UA Server 0.0.1",
	                OpcUaServer.SDK_VERSION,
	                "",
	                DateTime.now()))
	        .setCertificateManager(securityConfig.certManager)
	        .setCertificateValidator(securityConfig.certValidator)
	        .setIdentityValidator(securityConfig.identValidatior)
	        .setServerName("sessim")
	        .setSecurityPolicies(EnumSet.of(SecurityPolicy.None))
	        .setUserTokenPolicies(
	            ImmutableList.of(
	                USER_TOKEN_POLICY_ANONYMOUS,
	                USER_TOKEN_POLICY_USERNAME))
	        .build();

	    server = new OpcUaServer(serverConfig);
	    
	    // magic here, hier werden vermutlich die Nodes gesetzt???
	    
	    server.getNamespaceManager()
	    	.registerAndAdd(
	    		"urn:memap:opcua:server:"+jsonConfig.getNamespace(),
	    		namespaceIndex -> new ServerNameSpace(server, namespaceIndex, jsonConfig)
	    		);
		return server;
	}
	
	@SuppressWarnings("resource")
	private SecurityConfig prepareSecurityConfiguration() throws Exception {
		File securityTempDir = new File(System.getProperty("java.io.tmpdir"), "security");
	    
		if (!securityTempDir.exists() && !securityTempDir.mkdirs()) {
	        throw new Exception("unable to create security temp dir: " + securityTempDir);
	    }
	    
	    LoggerFactory.getLogger(getClass()).info("security temp dir: {}", securityTempDir.getAbsolutePath());
	
		DefaultCertificateManager certificateManager = new DefaultCertificateManager();
		
		File pkiDir = securityTempDir.toPath().resolve("pki").toFile();
		DirectoryCertificateValidator certificateValidator = new DirectoryCertificateValidator(pkiDir);
		LoggerFactory.getLogger(getClass()).info("pki dir: {}", pkiDir.getAbsolutePath());
		
		UsernameIdentityValidator identityValidator = new UsernameIdentityValidator(
		    true,
		    authChallenge -> {
		        String username = authChallenge.getUsername();
		        String password = authChallenge.getPassword();
		        //it's configured with only 2 users at the moment.  user and admin.
		        boolean userOk = "user".equals(username) && "password1".equals(password);
		        boolean adminOk = "admin".equals(username) && "password2".equals(password);
		
		        return userOk || adminOk;
		    }
		);		
		SecurityConfig secConfig = new SecurityConfig();
		secConfig.certManager = certificateManager;
		secConfig.certValidator = certificateValidator;
		secConfig.identValidatior = identityValidator;		
		return secConfig;
	}

	public OpcUaServer getServer() {
	    return server;
	}
	
	public CompletableFuture<OpcUaServer> startup() {
	    return server.startup();
	}
	
	public CompletableFuture<OpcUaServer> shutdown() {
	    return server.shutdown();
	}
}

class SecurityConfig{

	public UsernameIdentityValidator identValidatior;
	public DirectoryCertificateValidator certValidator;
	public DefaultCertificateManager certManager;
	
}