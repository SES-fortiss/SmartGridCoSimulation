package opcMEMAP;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class StartNoGui {

	private ScheduledExecutorService executor;
	
	private String interfacePath = "src/Building2.json";
	
	public static void main(String[] args) {
		
		StartNoGui sng = new StartNoGui();
		try {
			sng.run();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private void run() throws Exception {
		executor = Executors.newSingleThreadScheduledExecutor();
        executor.execute(new StartOPCUAServer(interfacePath) );
	}
}
