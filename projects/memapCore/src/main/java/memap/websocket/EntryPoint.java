package memap.websocket;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import javax.ws.rs.Consumes;
 


@Path("/memap")
public class EntryPoint {
	
    @POST
    @Path("message")
    @Consumes(MediaType.TEXT_PLAIN)
    public Response receiveStartMessage(String startMessage) throws Exception {
    	
    	String response;
    	JsonObject messageJson = (JsonObject) Jsoner.deserialize(startMessage);
    	MemapWebController mwc = new MemapWebController(messageJson);

    	if (messageJson.containsKey("disconnect")) {
			mwc.stopMemap();
			response = "[MEMAP] Simulation terminated. Client Disconnected.";
			System.out.println(response);
		} else {
			response = "[MEMAP] Your startMessage will be processed... ";
			mwc.startMemap();
		}

    	return Response.status(201).entity(response).build();
    		
    }

}