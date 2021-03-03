package fortiss.biminterface;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;

import okhttp3.ConnectionSpec;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class BimRestClient {
	
	private static final String baseUrl = "https://cloud-dev.datarig.io/api/";
	public static final MediaType JSON = MediaType.get("application/json");
	
	static BimLoginResponse bimLoginResponse;
	static BimDocumentsResponse[] bimDocumentsResponse;
	static BimModelDataResponse[] bimModelDataResponse;

    public static void main(String[] args) throws IOException {
    	
    	OkHttpClient client = new OkHttpClient.Builder()
    		    .connectionSpecs(Arrays.asList(ConnectionSpec.MODERN_TLS, ConnectionSpec.COMPATIBLE_TLS))
    		    .connectTimeout(60, TimeUnit.SECONDS)
    	        .writeTimeout(120, TimeUnit.SECONDS)
    	        .readTimeout(60, TimeUnit.SECONDS)
    		    .build();
    	
        Gson gson = new Gson();
        
        String responseLogin = performLogin(client);
        System.out.println(responseLogin);
        // update the response object with login data
        bimLoginResponse = gson.fromJson(responseLogin, BimLoginResponse.class);        
        
        String responseDocuments = performDocuments(client);
        bimDocumentsResponse = gson.fromJson(responseDocuments, BimDocumentsResponse[].class);
        System.out.println(responseDocuments);
        
        String responseModel = performGetBuildingData(client);        
        bimModelDataResponse = gson.fromJson(responseModel, BimModelDataResponse[].class);
        System.out.println(responseModel);
        
        System.out.println("Anzahl an Komponenten: " + bimModelDataResponse.length);
        
        for (int i = 0; i < 3; i++) {
			System.out.println(gson.toJson(bimModelDataResponse[i]));
		}
        
        System.out.println("done");
  
    }
    
    private static String performGetBuildingData(OkHttpClient client) throws IOException {
		
    	System.out.print("Start performGetBuildingData()");
		
        Gson gson = new Gson();
        
        BimModelDataPostRequest bimPostRequest = new BimModelDataPostRequest();
        bimPostRequest.modelId = bimDocumentsResponse[0].id;
        
        
        String inputRequest = gson.toJson(bimPostRequest);
        
        inputRequest = inputRequest.replace("aPIKomponententyp", "API-Komponententyp");
        
        RequestBody body = RequestBody.create(JSON, inputRequest);
        
        System.out.println(inputRequest);

    	Request request = new Request.Builder()
    			.addHeader("Content-Type", "application/json")
    			.addHeader("Authorization", bimLoginResponse.access)
    			.post(body)
    			.url(baseUrl + "v1/Documents/Forge/ModelMetadata/ObjectPropertiesById")
    			.build();
    	
	    try (Response response = client.newCall(request).execute()) {	    	
	    	System.out.println(" --> Login Code: " + response.code());	    	
	        return response.body().string();
	    }
    	    	
	}

	private static String performDocuments(OkHttpClient client) throws IOException {
    	
    	System.out.print("Start performDocuments()");
		
        Gson gson = new Gson();
        String inputRequest = gson.toJson(new BimDocumentsGetRequest());
    	
    	Request request = new Request.Builder()
    			.addHeader("Content-Type", "application/json")
    			.addHeader("Authorization", bimLoginResponse.access)
    			.get()
    			.url(baseUrl + "v1/Documents")
    			.build();
    	
	    try (Response response = client.newCall(request).execute()) {	    	
	    	System.out.println(" --> Response Code: " + response.code());	    	
	        return response.body().string();
	    }
	}

	public static String performLogin(OkHttpClient client) throws IOException {
    	System.out.print("Start performLogin()");
		
        Gson gson = new Gson();
        String inputRequest = gson.toJson(new BimLoginPostRequest());
    	RequestBody body = RequestBody.create(JSON, inputRequest);
    	
    	Request request = new Request.Builder()
    			.addHeader("Content-Type", "application/json")
    			.addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoidGVzdEBleGFtcGxlLmNvbSIsInVzZXJJZCI6IjUzIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiQWRtaW4iLCJjb21wYW55SWQiOiIxNSIsIm5iZiI6MTYxMjM1MjE1MSwiZXhwIjoxNjEyMzUzOTUxLCJpc3MiOiJDb25CSU0gcHVibGlzaGVyIiwiYXVkIjoiaHR0cHM6Ly9oZWFsdGh5LWhlYXJ0aC0xODg3MTQuYXBwc3BvdC5jb20ifQ.kahWLEowLqLjZs12VGobN3Kcc04-vjmETYiLiBr03ug")
    			.post(body)
    			.url(baseUrl + "v1/Login")
    			.build();
    	
	    try (Response response = client.newCall(request).execute()) {	    	
	    	System.out.println(" --> Response Code: " + response.code());	   	
	        return response.body().string();
	    }
    }

}
