package fortiss.biminterface;

import com.google.gson.annotations.SerializedName;

public class UserCredential {

	@SerializedName("user_id")
	private String userName;
	@SerializedName("password")
	private String password;
	@SerializedName("application_id")
	private final String applicationId = "A1A9FE2EDE9D4E8CB4561BE787748C97";
	@SerializedName("remember_me")
	private boolean rememberMe;
	
	public UserCredential() {
		setUserName("");
		setPassword("");
		setRememberMe(true);
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
	
}
