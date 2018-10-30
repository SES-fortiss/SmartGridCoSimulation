package org.fortiss.smg.actuatorclient.opcua.impl;

public class OpcUAClientStarter {

	private static int pollFrequency = 2000; // in ms
	private static String host = "localhost";
	private static String port = "9999";
	private static String username = "admin";
	private static String password = "password";
	private static String serverPath = "sessim";
	
	public static void main(String[] args) {
		
		OpcUAClientImpl actuatorClient = new OpcUAClientImpl(host, port, serverPath, pollFrequency, username, password);
		actuatorClient.activate();

	}

}
