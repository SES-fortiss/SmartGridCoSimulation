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

	public static ActorOptions createCHP(double qdot_max, double efficiency_el, double efficiency_H, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new CHP(qdot_max, efficiency_el, efficiency_H, port));	
		return result;
	}
	
	public static ActorOptions createGasBoiler(double qdot_max, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new GasBoiler(qdot_max, efficiency, port));	
		return result;
	}
	
	public static ActorOptions createOilBoiler(double qdot_max, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new OilBoiler(qdot_max, efficiency, port));	
		return result;
	}
	
	public static ActorOptions createHeatPump(double qdot_max, double efficiency, int port){
		ActorOptions result = new ActorOptions(
				LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new HeatPump(qdot_max, efficiency, port));	
		return result;
	}
	
	public static ActorOptions createBattery( // Parameters
			double qdot_max_in, double qdot_max_out, 
			double efficiencyCharge, double efficiencyDischarge, 
			double capacity, int port
			){ // Factory
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Battery(qdot_max_in, qdot_max_out, efficiencyCharge, efficiencyDischarge, capacity, port));	
		return result;
	}
	
	public static ActorOptions createConsumer(ConsumptionProfiles consumptionProfiles, int consumerIndex, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Consumer(consumptionProfiles, consumerIndex, port));	
		return result;
	}
	
	public static ActorOptions createPV(double installedPower, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new PV(installedPower, port));	
		return result;
	}
	
	public static ActorOptions createSolarThermic(double installedPower, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new SolarThermic(installedPower, port));	
		return result;
	}
	
	public static ActorOptions createThermalStorage(double qdot_max_in, double qdot_max_out, double capacity, double efficiency, int port){
		ActorOptions result = 
				new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new ThermalStorage(qdot_max_in, qdot_max_out, capacity, efficiency, port));	
		return result;
	}
	
	public static ActorOptions createBuilding(int port, boolean LDHeating, int heatTransportLength){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Building(port, LDHeating, heatTransportLength));	
		return result;
	}
	

}
