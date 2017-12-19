package linprog;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import linprog.components.Battery;
import linprog.components.CHP;
import linprog.components.Consumer;
import linprog.components.GasBoiler;
import linprog.components.HeatPump;
import linprog.components.LinProgBehavior;
import linprog.components.PV;
import linprog.components.SolarThermic;
import linprog.components.ThermalStorage;

public abstract class ActorFactory {
	
	public static ActorOptions createLinProgBehavior(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new LinProgBehavior());
		return result;
	}

	public static ActorOptions createCHP(String name, double qdot_max, double efficiency_el, double efficiency_H, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new CHP(name, qdot_max, efficiency_el, efficiency_H));	
		return result;
	}
	
	public static ActorOptions createGasBoiler(String name, double qdot_max, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new GasBoiler(name, qdot_max, efficiency));	
		return result;
	}
	
	public static ActorOptions createHeatPump(String name, double qdot_max, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new HeatPump(name, qdot_max, efficiency));	
		return result;
	}
	
	public static ActorOptions createBattery(String name, double qdot_max_in, double qdot_max_out, double capacity, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Battery(name, qdot_max_in, qdot_max_out, capacity));	
		return result;
	}
	
	public static ActorOptions createConsumer(String name, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Consumer(name));	
		return result;
	}
	
	public static ActorOptions createPV(String name, double area, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new PV(name, area, efficiency));	
		return result;
	}
	
	public static ActorOptions createSolarThermic(String name, double area, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new SolarThermic(name, area, efficiency));	
		return result;
	}
	
	public static ActorOptions createThermalStorage(String name, double qdot_max_in, double qdot_max_out, double capacity, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new ThermalStorage(name, qdot_max_in, qdot_max_out, capacity, efficiency));	
		return result;
	}
	

}
