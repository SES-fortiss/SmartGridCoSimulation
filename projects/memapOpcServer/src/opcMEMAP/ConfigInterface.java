package opcMEMAP;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.net.InetAddress;
import java.net.DatagramSocket;
import opcMEMAP.serverConfigurationClassesJSON.MyFolderNode;
import opcMEMAP.serverConfigurationClassesJSON.MyVariableNode;

public class ConfigInterface {
	
	//private String host = "localhost";
	private static String host;
	private static int port = 9999;
	private String uri = "urn:fortiss:opc:sever:memap" + UUID.randomUUID();
	private String namespace = "sessim";
	private double minSamplingInterval = 499;
	private ServerConfigurationImpl serverReference = null;

	private List<MyFolderNode> folderNodeList = new ArrayList<>();
	private List<MyVariableNode> variableNodeList = new ArrayList<>();
		
	/**
	 * Creates an UDP socket and returns the corresponding IP address. Retrieving
	 * the IP address of a server is a cumbersome and this might not work on all
	 * systems. Please refer to this discussion:
	 * stackoverflow.com/questions/9481865/getting-the-ip-address-of-the-current-machine-using-java
	 * 
	 * @return String hostIP-address
	 */
	public static String getHost() {
		try (final DatagramSocket socket = new DatagramSocket()) {
			socket.connect(InetAddress.getByName("8.8.8.8"), 10002); // 8.8.8.8. can be unreachable, which is ok
			host = socket.getLocalAddress().getHostAddress();
		} catch (Exception e) {
			System.out.println("Invalid IP!");
		}
		return host;
	}
	
	public static int getPort() {
		return port;
	}

	public String getUri() {
		return uri;
	}

	public String getNamespace() {
		return namespace;
	}

	public List<MyFolderNode> getFolderNodeList() {
		return folderNodeList;
	}

	public List<MyVariableNode> getVariableNodeList() {
		return variableNodeList;
	}

	public double getMinSamplingInterval() {
		return minSamplingInterval;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ServerConfigurationImpl getServerReference() {
		return serverReference;
	}

	public void setServerReference(ServerConfigurationImpl serverReference) {
		this.serverReference = serverReference;
	}
}
