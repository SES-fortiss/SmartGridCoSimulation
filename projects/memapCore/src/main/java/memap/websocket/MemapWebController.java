package memap.websocket;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;
import com.github.cliftonlabs.json_simple.Jsoner;

import memap.main.JettyStart;
import simulation.SimulationStarter;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MemapWebController {

	private JsonObject memapStartMessage;
	private Gson gson = new Gson();
	
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
	
		js.stopSimulation();
		SimulationStarter.actorSystemRef.shutdown();
	    executor.shutdown();
	    executor = Executors.newScheduledThreadPool(2);
	    System.out.println("Disconnecting was sucessful");

	}
	
}
