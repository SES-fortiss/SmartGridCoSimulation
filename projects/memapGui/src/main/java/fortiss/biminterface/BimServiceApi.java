package fortiss.biminterface;

import com.google.gson.internal.LinkedTreeMap;

import fortiss.biminterface.response.BimLogin;
import fortiss.components.Controllable;
import fortiss.components.Coupler;
import fortiss.components.Demand;
import fortiss.components.Storage;
import fortiss.components.Volatile;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * This class is used to define end-points exposed by BIM and required by MEMAP
 * GUI.
 */
public interface BimServiceApi {

	@POST("/v2/authorize")
	Call<BimLogin> authorize(@Body UserCredential userCredential);

	@GET("/v2/{team}/objects/{projectId}/attributes/{API-Komponententyp-ID}")
	Call<LinkedTreeMap<String, String>> getComponentList(
			@Header("authorization") String authorization,
			@Header("Content-Type") String contentType, 
			@Path("team") String team, 
			@Path("projectId") String projectId,
			@Path("API-Komponententyp-ID") String componentTypeID, 
			@Query("children") boolean withChildren);
	
	@GET("v2/{team}/objects/{objectId}")
	Call<Demand> getDemand (
			@Header("authorization") String authorization,
			@Header("Content-Type") String contentType, 
			@Path("team") String team, 
			@Path("objectId") String objectId);
	
	@GET("v2/{team}/objects/{objectId}")
	Call<Storage> getStorage (
			@Header("authorization") String authorization,
			@Header("Content-Type") String contentType, 
			@Path("team") String team, 
			@Path("objectId") String objectId);
	
	@GET("v2/{team}/objects/{objectId}")
	Call<Controllable> getControllable (
			@Header("authorization") String authorization,
			@Header("Content-Type") String contentType, 
			@Path("team") String team, 
			@Path("objectId") String objectId);
	
	@GET("v2/{team}/objects/{objectId}")
	Call<Volatile> getVolatile (
			@Header("authorization") String authorization,
			@Header("Content-Type") String contentType, 
			@Path("team") String team, 
			@Path("objectId") String objectId);
	
	@GET("v2/{team}/objects/{objectId}")
	Call<Coupler> getCoupler (
			@Header("authorization") String authorization,
			@Header("Content-Type") String contentType, 
			@Path("team") String team, 
			@Path("objectId") String objectId);
}
