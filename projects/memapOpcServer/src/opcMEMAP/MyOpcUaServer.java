package opcMEMAP;

import static org.eclipse.milo.opcua.sdk.server.api.config.OpcUaServerConfig.USER_TOKEN_POLICY_ANONYMOUS;
import static org.eclipse.milo.opcua.sdk.server.api.config.OpcUaServerConfig.USER_TOKEN_POLICY_USERNAME;
import java.io.File;
import java.io.IOException;
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



public class MyOpcUaServer implements Runnable {
  private static org.slf4j.Logger logger = LoggerFactory.getLogger(MyOpcUaServer.class);

  private OpcUaServer server;
  private ServerUpdater serverUpdater;
  private SecurityConfig securityConfig;
  private int port = 0;
  private boolean serverStarted = false;

  private String interfaceString = null;
  private boolean createFromFile = true;


  public MyOpcUaServer(boolean createFromFile, String interfacePath, int port) {
    this(interfacePath);
    this.port = port;
    this.createFromFile = createFromFile;
  }

  public MyOpcUaServer(String interfacePath) {
    interfaceString = interfacePath;
  }

  @Override
  public void run() {
    try {
      ConfigInterface jsonInterface = null;
      if (createFromFile) {
        jsonInterface = createInterfaceFromFile(interfaceString);
      } else {
        jsonInterface = createInterfaceFromJson(interfaceString);
      }


      if (port != 0) {
        jsonInterface.setPort(this.port);
      }
      securityConfig = prepareSecurityConfiguration();
      server = prepareServerNodesConfiguration(jsonInterface);
      server.startup().get(); // hier wird der Server gestartet.
      
//      System.out.println("Server started: " + server.getApplicationDescription().getProductUri());
//      System.out.println("Server started: " + server.getApplicationDescription().getApplicationUri());
//      System.out.println("Server started: " + server.getApplicationDescription().getGatewayServerUri());
//      System.out.println("Server started: " + server.getApplicationDescription().getDiscoveryProfileUri());
      
      System.out.println("OPC UA - Server started: " + server.getConfig().getBindAddresses() + "\n");
      
//      for (String str : server.getConfig().getBindAddresses()) {
//		System.out.println(str);
//	}

      serverStarted = true;
      serverUpdater = new ServerUpdater(server, jsonInterface.getServerReference());

      // start: bin mir nicht unsicher, ob das überhaupt gebraucht wird.
      final CompletableFuture<Void> future = new CompletableFuture<>();
      Runtime.getRuntime().addShutdownHook(new Thread(() -> future.complete(null)));
      future.get();
      // ende: bin mir unsicher

    } catch (Exception e) {
      e.printStackTrace();
    }


  }

  private ConfigInterface createInterfaceFromFile(String path) throws IOException {
    return GenericJsonReader.createConfigFromFile(path);
  }

  private ConfigInterface createInterfaceFromJson(String json) throws IOException {
    return GenericJsonReader.createConfigFromString(json);
  }

  private OpcUaServer prepareServerNodesConfiguration(ConfigInterface jsonInterface) {

    List<String> bindAddresses = new ArrayList<String>();
    bindAddresses.add(jsonInterface.getHost());

    List<String> endpointAddresses = new ArrayList<String>();
    endpointAddresses.add(jsonInterface.getHost());
    String applicationUri = jsonInterface.getUri();

    OpcUaServerConfig serverConfig = OpcUaServerConfig.builder().setApplicationUri(applicationUri)
        .setApplicationName(LocalizedText.english("MEMAP-OPC-UA-Server"))
        .setBindPort(jsonInterface.getPort()).setBindAddresses(bindAddresses)
        .setEndpointAddresses(endpointAddresses)
        .setBuildInfo(new BuildInfo("urn:fortiss:opc:server:memap", "fortiss",
            "Memap OPC UA Server 0.0.1", OpcUaServer.SDK_VERSION, "", DateTime.now()))
        .setCertificateManager(securityConfig.certManager)
        .setCertificateValidator(securityConfig.certValidator)
        .setIdentityValidator(securityConfig.identValidatior).setServerName("sessim")
        .setSecurityPolicies(EnumSet.of(SecurityPolicy.None)).setUserTokenPolicies(
            ImmutableList.of(USER_TOKEN_POLICY_ANONYMOUS, USER_TOKEN_POLICY_USERNAME))
        .build();

    server = new OpcUaServer(serverConfig);
    server = configureNodes(jsonInterface);
    return server;
  }

  private OpcUaServer configureNodes(ConfigInterface jsonInterface) {
    // here happens a lot!
    server.getNamespaceManager().registerAndAdd(
        "urn:memap:opcua:server:" + jsonInterface.getNamespace(),
        namespaceIndex -> new ServerConfigurationImpl(server, namespaceIndex, jsonInterface));
    return server;
  }

  @SuppressWarnings("resource")
  private SecurityConfig prepareSecurityConfiguration() throws Exception {
    File securityTempDir = new File(System.getProperty("java.io.tmpdir"), "security");

    if (!securityTempDir.exists() && !securityTempDir.mkdirs()) {
      throw new Exception("unable to create security temp dir: " + securityTempDir);
    }

    logger.info("security temp dir: {}", securityTempDir.getAbsolutePath());

    DefaultCertificateManager certificateManager = new DefaultCertificateManager();

    File pkiDir = securityTempDir.toPath().resolve("pki").toFile();
    DirectoryCertificateValidator certificateValidator = new DirectoryCertificateValidator(pkiDir);
    logger.info("pki dir: {}", pkiDir.getAbsolutePath());

    UsernameIdentityValidator identityValidator =
        new UsernameIdentityValidator(true, authChallenge -> {
          String username = authChallenge.getUsername();
          String password = authChallenge.getPassword();
          // it's configured with only 2 users at the moment. user and admin.
          boolean userOk = "user".equals(username) && "password1".equals(password);
          boolean adminOk = "admin".equals(username) && "password2".equals(password);

          return userOk || adminOk;
        });
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

  public boolean isServerRunning() {
    return serverStarted;
  }

  public void updateServer(String json) {
    try {
      serverUpdater.update(json);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}


class SecurityConfig {
  public UsernameIdentityValidator identValidatior;
  public DirectoryCertificateValidator certValidator;
  public DefaultCertificateManager certManager;
}
