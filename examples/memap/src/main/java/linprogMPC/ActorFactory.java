package linprogMPC;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import linprogMPC.components.Battery;
import linprogMPC.components.Building;
import linprogMPC.components.CHP;
import linprogMPC.components.Consumer;
import linprogMPC.components.GasBoiler;
import linprogMPC.components.HeatPump;
import linprogMPC.components.LinProgBehavior;
import linprogMPC.components.OilBoiler;
import linprogMPC.components.PV;
import linprogMPC.components.SolarThermic;
import linprogMPC.components.ThermalStorage;
import linprogMPC.helper.ConsumptionProfiles;

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
				new CHP(name, qdot_max, efficiency_el, efficiency_H, port));	
		return result;
	}
	
	public static ActorOptions createGasBoiler(String name, double qdot_max, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new GasBoiler(name, qdot_max, efficiency, port));	
		return result;
	}
	
	public static ActorOptions createOilBoiler(String name, double qdot_max, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new OilBoiler(name, qdot_max, efficiency, port));	
		return result;
	}
	
	public static ActorOptions createHeatPump(String name, double qdot_max, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new HeatPump(name, qdot_max, efficiency, port));	
		return result;
	}
	
	public static ActorOptions createBattery(String name, double qdot_max_in, double qdot_max_out, double efficiency, double capacity, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Battery(name, qdot_max_in, qdot_max_out, efficiency, capacity, port));	
		return result;
	}
	
	public static ActorOptions createConsumer(String name, ConsumptionProfiles consumptionProfiles, int consumerIndex, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Consumer(name, consumptionProfiles, consumerIndex, port));	
		return result;
	}
	
	public static ActorOptions createPV(String name, double area, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new PV(name, area, efficiency, port));	
		return result;
	}
	
	public static ActorOptions createSolarThermic(String name, double area, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new SolarThermic(name, area, efficiency, port));	
		return result;
	}
	
	public static ActorOptions createThermalStorage(String name, double qdot_max_in, double qdot_max_out, double capacity, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new ThermalStorage(name, qdot_max_in, qdot_max_out, capacity, efficiency, port));	
		return result;
	}
	
	public static ActorOptions createBuilding(String name, int port, boolean LDHeating, int heatTransportLength){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Building(name, port, LDHeating, heatTransportLength));	
		return result;
	}
	

}
