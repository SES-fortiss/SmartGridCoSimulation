package piWebServer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import piWebServer.collector.DataCollectorInterface;

public class PiHandler extends AbstractHandler {
		
	int numberCalled = 0;
	DataCollectorInterface dc;
		
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		numberCalled++;
		System.out.println("handle() called " + numberCalled + " times since start");		
		
		String output = dc.generateMessage(request);
		System.out.println(output);	
		
		/*
		String output = "{ \"targetValue\": 2, " + 
			  "\"currentValue\": 3.0," +
			  "\"solar\": 0.5," +
			  "\"wind\": 1.5," +
			  "\"biogas\": 0.5," +
			  "\"battery\": -0.5," +
			  "\"clusterOutput\": 1.0" +
			"}";
		*/
		
		response.setContentType("application/json; charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println(output);		
		baseRequest.setHandled(true);		
	}
	
	public void setDataCollector(DataCollectorInterface dc){
		this.dc = dc;
	}
}
