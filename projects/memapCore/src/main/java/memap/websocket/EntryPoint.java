package memap.websocket;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.google.gson.Gson;

import memap.main.JettyStart;

import javax.ws.rs.core.Application;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javax.annotation.Resource;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
 


@Path("/memap")
public class EntryPoint {
	
//	JsonObject message = new JsonObject();
	private Gson gson = new Gson();
	

    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "test";
    }


    @POST
    @Path("message")
    @Consumes(MediaType.TEXT_PLAIN)
    public Response receiveStartMessage(String startMessage) throws Exception {
    	
    	String response;
    	JsonObject messageJson = (JsonObject) Jsoner.deserialize(startMessage);
    	MemapWebController mwc = new MemapWebController(messageJson);

    	if (messageJson.containsKey("disconnect")) {
			mwc.stopMemap();
			response = "Simulation terminated. Client Disconnected.";
			System.out.println(response);
		} else {
			response = "[MEMAP] your startMessage will be processed... ";
			mwc.startMemap();
		}

    	return Response.status(201).entity(response).build();
    		
    }

//    @POST
//    @Path("exit")
//    @Consumes(MediaType.TEXT_PLAIN)
//    public Response receiveStartMessage(String startMessage) throws Exception {
//    
//    	String response;
//    	JsonObject messageJson = (JsonObject) Jsoner.deserialize(startMessage);
//    	MemapWebController mwc = new MemapWebController(messageJson);
//
//		mwc.stopMemap();
//		response = "Simulation terminated. Client Disconnected.";
//		System.out.println(response);
//    
//    }
//    }
}