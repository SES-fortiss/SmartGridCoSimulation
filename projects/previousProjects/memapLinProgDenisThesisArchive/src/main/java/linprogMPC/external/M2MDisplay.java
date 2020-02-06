/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package linprogMPC.external;

import org.eclipse.jetty.server.Server;

public class M2MDisplay implements Runnable{
	
	public Server server;
	public MemapHandler memapHandler; 

	public M2MDisplay(int port) {
		server = new Server(port);
		memapHandler = new MemapHandler();
		server.setHandler(memapHandler);
	}

	public void run(){		
		try {
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(String json) {
		memapHandler.update(json);		
	}

}
