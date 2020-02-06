package org.fortiss.strategy.demonstrator.external;

import java.io.IOException;

public class ConnectorMain {

	public static void main(String[] args) {
		Connector myConnector;
		
		try {
			myConnector = new Connector();
			myConnector.readMessage();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
