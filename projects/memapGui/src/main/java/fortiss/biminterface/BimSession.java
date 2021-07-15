package fortiss.biminterface;

public class BimSession {

	private static BimSession bimSession;
	private ConnectionStatus status;
	private UserCredential userCredential;
	private String accessToken;
	private final String componentTypeID = "7af498ea-0211-4203-84e0-267b0f6ea467";
	private final String team = "fortiss-gmbh-ft";
	private final String projectId = "a5e1fbd3-be13-45f7-8898-3c4f2735c0d4";
	private final String host = "https://api-stage.bimplus.net";
	private final String contentType = "application/json";
	Client client;

	private BimSession() {
		setUserCredential(new UserCredential());
		setStatus(ConnectionStatus.CLOSE);
		setAccessToken("");
	}

	public static BimSession getInstance() {
		if (bimSession == null)
			bimSession = new BimSession();
		return bimSession;
	}

	public static void reset() {
		bimSession = null;
	}

	public UserCredential getUserCredential() {
		return userCredential;
	}

	public void setUserCredential(UserCredential userCredential) {
		this.userCredential = userCredential;
	}

	public ConnectionStatus getStatus() {
		return status;
	}

	public void setStatus(ConnectionStatus status) {
		this.status = status;
	}

	public void openSession() {
		client = new Client();
		client.login(userCredential);	
	}
	
	public void loadTopology() {
		client.loadTopology();
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = "BimPlus " + accessToken;
	}

	public String getComponentTypeID() {
		return componentTypeID;
	}

	public String getTeam() {
		return team;
	}

	public String getProjectId() {
		return projectId;
	}

	public String getHost() {
		return host;
	}

	public String getContentType() {
		return contentType;
	}

}
