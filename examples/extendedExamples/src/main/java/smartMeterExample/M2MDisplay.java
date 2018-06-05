/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package smartMeterExample;

import org.eclipse.jetty.server.Server;

public class M2MDisplay implements Runnable{
	
	public Server server;
	public ServerHandler serverHandler; 

	public M2MDisplay(int port) {
		server = new Server(port);
		serverHandler = new ServerHandler();
		server.setHandler(serverHandler);
	}

	public void run(){		
		try {
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(String json) {
		serverHandler.update(json);		
	}

}
