package opcMEMAP;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import opcMEMAP.serverConfigurationClassesJSON.MyFolderNode;
import opcMEMAP.serverConfigurationClassesJSON.MyVariableNode;

public class ConfigInterface {
	
	private String host = "localhost";	
	private int port = 9999;
	private String uri = "urn:fortiss:opc:sever:memap" + UUID.randomUUID();
	private String namespace = "sessim";
	private double minSamplingInterval = 499;
	private ServerConfigurationImpl serverReference = null;

	private List<MyFolderNode> folderNodeList = new ArrayList<>();
	private List<MyVariableNode> variableNodeList = new ArrayList<>();
		
	public String getHost() {
		return host;
	}
	
	public int getPort() {
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
