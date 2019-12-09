package serverConnection;

import org.eclipse.jetty.server.Server;

public class PiServer extends Thread{
	
	public Server server;
	
	public PiServer() {
		super("Pi Server Thread");
	}

	public void run() {

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
		System.out.println("stopit!");
		try {
			if (server.isRunning()) {
				server.stop();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
