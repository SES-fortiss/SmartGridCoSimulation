package org.fortiss.strategy.demonstrator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class PiHandler extends AbstractHandler {
		
	int numberCalled = 0;
		
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		numberCalled++;
		System.out.println("handle() called");
		
		String output = "Hello I'm there " + numberCalled;
		
		response.setContentType("application/json; charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);			
		response.getWriter().println(output);
		
		baseRequest.setHandled(true);
		
		
		
	}
}
