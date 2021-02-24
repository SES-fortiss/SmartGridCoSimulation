package memap.websocket;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.github.cliftonlabs.json_simple.JsonObject;

import memap.main.JettyStart;
import simulation.SimulationStarter;

public class MemapWebController {

	private JsonObject memapStartMessage;
	
	JettyStart js = new JettyStart();
	ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

	public MemapWebController(JsonObject inputJsonObj) {
		// TODO Auto-generated constructor stub
		this.memapStartMessage = inputJsonObj;
	}
	
	public void startMemap() {
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("============================= STARTING MEMAP =============================");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		Runnable simulationRunnable = new Runnable() {
		public void run() {
			js.run(memapStartMessage);
		}
		};
		executor.schedule(simulationRunnable, 0, TimeUnit.SECONDS);
	}
	
	
	public void stopMemap() {

		js.simLoop = false;
		SimulationStarter.actorSystemRefStatic.terminate();
	    executor.shutdown();
	    executor = Executors.newScheduledThreadPool(2);
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Disconnecting was sucessful");

	    return;
	}
	
}
