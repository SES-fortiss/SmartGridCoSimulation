package fortiss.biminterface.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BimLogin {

	@SerializedName("access_token")
	@Expose
	private String accessToken;
	@SerializedName("expires_in")
	@Expose
	private Integer expiresIn;
	@SerializedName("client_id")
	@Expose
	private String clientId;
	@SerializedName("token_type")
	@Expose
	private String tokenType;
	@SerializedName("remember_me")
	@Expose
	private Boolean rememberMe;
	@SerializedName("remember_me_token")
	@Expose
	private String rememberMeToken;
	@SerializedName("remember_me_expires_in")
	@Expose
	private Integer rememberMeExpiresIn;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Integer getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public Boolean getRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(Boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public String getRememberMeToken() {
		return rememberMeToken;
	}

	public void setRememberMeToken(String rememberMeToken) {
		this.rememberMeToken = rememberMeToken;
	}

	public Integer getRememberMeExpiresIn() {
		return rememberMeExpiresIn;
	}

	public void setRememberMeExpiresIn(Integer rememberMeExpiresIn) {
		this.rememberMeExpiresIn = rememberMeExpiresIn;
	}

}
