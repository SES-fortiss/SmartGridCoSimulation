package linprogMPC;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import linprogMPC.components.Battery;
import linprogMPC.components.Building;
import linprogMPC.components.CHP;
import linprogMPC.components.Connection;
import linprogMPC.components.Consumer;
import linprogMPC.components.GasBoiler;
import linprogMPC.components.HeatPump;
import linprogMPC.components.MEMAPCoordination;
import linprogMPC.components.PV;
import linprogMPC.components.SolarThermic;
import linprogMPC.components.ThermalStorage;
import linprogMPC.helper.ConsumptionProfiles;

public abstract class ActorFactory {
	
	public static ActorOptions createMEMAPCoordinationBehavior(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new MEMAPCoordination());
		return result;
	}
	
	public static ActorOptions createMEMAPCoordinationBehavior2(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new MEMAPCoordination());
		return result;
	}

	public static ActorOptions createCHP(double qdot_max, double qdot_min, double efficiencyHeat, double efficiencyElec, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new CHP(qdot_max, qdot_min, efficiencyHeat, efficiencyElec, port));	
		return result;
	}
	
	public static ActorOptions createGasBoiler(double max, double min, double efficiency, double costs, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new GasBoiler(max, min, efficiency, costs, port));	
		return result;
	}	
	
	public static ActorOptions createHeatPump(double qdot_max, double qdot_min, double efficiencyHeat, double efficiencyElec, int port){
		ActorOptions result = new ActorOptions(
				LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new HeatPump(qdot_max, qdot_min, efficiencyHeat, efficiencyElec, port));
		return result;
	}
	
	public static ActorOptions createBattery( // Parameters
			double capacity,
			double max_charging, double max_discharging, 
			double efficiencyCharge, double efficiencyDischarge, 
			int port
			){ // Factory
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Battery(capacity, max_charging, max_discharging, efficiencyCharge, efficiencyDischarge, port));	
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
	
	public static ActorOptions createThermalStorage( // Parameters
			double capacity,
			double qdot_max_in, double qdot_max_out, 
			double efficiencyCharge, double efficiencyDischarge, 
			int port
			){
		ActorOptions result = 
				new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new ThermalStorage(capacity, qdot_max_in, qdot_max_out, efficiencyCharge, efficiencyDischarge, port));	
		return result;
	}
	
	public static ActorOptions createThermalConnection(
			String connectedBuilding, double pipeLengthInMeter, double lossesPer100m, double q_max){
		ActorOptions result = 
				new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Connection(connectedBuilding, pipeLengthInMeter, lossesPer100m, q_max));	
		return result;
	}
	
	public static ActorOptions createBuilding(int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Building(port));	
		return result;
	}
	

}
