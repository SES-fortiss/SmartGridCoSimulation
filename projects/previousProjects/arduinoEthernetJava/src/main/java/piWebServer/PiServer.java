package piWebServer;

import org.eclipse.jetty.server.Server;

import piWebServer.collector.DataCollectorSolar;

public class PiServer extends Thread{	
	
	public Server server;
	
	public DataCollectorSolar dc = new DataCollectorSolar(); // die einzige Stelle zum anpassen!
	//public DataCollectorWind dc = new DataCollectorWind(); // die einzige Stelle zum anpassen!
	//public DataCollectorBattery dc = new DataCollectorBattery(); // die einzige Stelle zum anpassen!
	//public DataCollectorBiogas dc = new DataCollectorBiogas(); // die einzige Stelle zum anpassen!
	
	public PiHandler ph;
	
	public static void main(String[] args) {
		PiServer myServer = new PiServer();	
		myServer.run();
	}
	
	public void run(){
		
		server = new Server(80);
		ph = new PiHandler();
		ph.setDataCollector(dc);		
		server.setHandler(ph);
		
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
