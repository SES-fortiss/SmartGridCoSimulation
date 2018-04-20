package org.fortiss.strategy.demonstrator;

import org.eclipse.jetty.server.Server;

public class PiServer extends Thread{	
	
	public Server server;
	
	public static void main(String[] args) {		
		PiServer myServer = new PiServer();		
		myServer.run();
	}
	
	public void run(){
		
		server = new Server(8080);
		server.setHandler(new PiHandler());
		
		try {
			server.start();
			server.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void stopIt(){
		System.out.println("stop-jetty-server!");		
		try {
			if (server.isRunning()) server.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
