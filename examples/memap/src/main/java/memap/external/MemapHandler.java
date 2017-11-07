/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package memap.external;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class MemapHandler extends AbstractHandler {
	
	String output = "Hello World";
	
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		response.setContentType("application/json; charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println(output);
		baseRequest.setHandled(true);		
	}

	public void update(String json) {
		output = json;		
	}

}
