package memap.websocket;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;

import java.io.InputStream;

import javax.annotation.Resource;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
 

@Path("/memap")
public class EntryPoint {

    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "test";
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public void passJSON(InputStream incomingData) {
    	
    	
    	
    }
}