package linprog;

import java.time.Duration;
import java.time.LocalDateTime;

import linprog.Simulation;
import topology.ActorTopology;

public class Simulation {
	
	private ActorTopology topology;
	
	//For the moment, the following 3 parameters need to stay as defined to match data input
	public static LocalDateTime startTime = LocalDateTime.of(2014,7,1,11,0);
	public static LocalDateTime endTime = LocalDateTime.of(2014,7,1,12,0);
	public static Duration timeInterval = Duration.ofMinutes(15);
	
	
	private void run() {
		
		
	}
	
	public static void main(String[] args){
		new Simulation().run();
	}

}
