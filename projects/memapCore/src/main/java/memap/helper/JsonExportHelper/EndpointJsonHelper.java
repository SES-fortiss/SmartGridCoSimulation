package memap.helper.JsonExportHelper;

import java.math.BigDecimal;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.google.gson.annotations.Expose;

public class EndpointJsonHelper {

	@Expose
	private String name;
	@Expose
	private String description; 
	@Expose
	private String url;
	@Expose
	private int opcua_namespaceindex;
	@Expose
	private JsonObject config;


	public EndpointJsonHelper(int k, JsonObject testEndpoint, String EMSKey, JsonObject EMS) {

		this.name = testEndpoint.get("name") + "_" + k;
		this.description = (String) testEndpoint.get("description");
		this.url = (String) testEndpoint.get("url");
		BigDecimal nsIndex = (BigDecimal) testEndpoint.get("opcua_namespaceindex");
		this.opcua_namespaceindex = nsIndex.intValue();
		this.config = new JsonObject();
		config.put(EMSKey, EMS);
	}

}

