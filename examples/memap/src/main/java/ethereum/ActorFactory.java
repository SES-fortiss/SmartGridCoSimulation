package ethereum;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import ethereum.components.Building1;
import ethereum.components.Building2;
import ethereum.components.Building3;
import ethereum.components.Building4;
import ethereum.components.Building5;
import ethereum.components.Timekeeper;
import ethereum.helper.ConsumptionProfiles;
import linprog.components.Battery;
import linprog.components.Building;
import linprog.components.CHP;
import linprog.components.Consumer;
import linprog.components.GasBoiler;
import linprog.components.HeatPump;
import linprog.components.LinProgBehavior;
import linprog.components.OilBoiler;
import linprog.components.PV;
import linprog.components.SolarThermic;
import linprog.components.ThermalStorage;

public abstract class ActorFactory {
	
	public static ActorOptions createTimekeeper(int rpcport){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Timekeeper(rpcport));
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
	
	public static ActorOptions createBattery(String name, double qdot_max_in, double qdot_max_out, double capacity, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Battery(name, qdot_max_in, qdot_max_out, capacity, port));	
		return result;
	}
	
	public static ActorOptions createConsumer(String name, linprog.helper.ConsumptionProfiles consumptionProfiles, int consumerIndex, int port){
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
	
	public static ActorOptions createBuilding1(String name,
			int rpcport,
			String privateKey,
			ConsumptionProfiles consumptionProfiles,
			int consumerIndex
	){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Building1(name, rpcport, privateKey, consumptionProfiles, consumerIndex));	
		return result;
	}
	
	public static ActorOptions createBuilding2(String name,
			int rpcport,
			String privateKey,
			ConsumptionProfiles consumptionProfiles,
			int consumerIndex
	){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Building2(name, rpcport, privateKey, consumptionProfiles, consumerIndex));	
		return result;
	}
	
	public static ActorOptions createBuilding3(String name,
			int rpcport,
			String privateKey,
			ConsumptionProfiles consumptionProfiles,
			int consumerIndex
	){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Building3(name, rpcport, privateKey, consumptionProfiles, consumerIndex));	
		return result;
	}
	
	public static ActorOptions createBuilding4(String name,
			int rpcport,
			String privateKey,
			ConsumptionProfiles consumptionProfiles,
			int consumerIndex
	){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Building4(name, rpcport, privateKey, consumptionProfiles, consumerIndex));	
		return result;
	}
	
	public static ActorOptions createBuilding5(String name,
			int rpcport,
			String privateKey,
			ConsumptionProfiles consumptionProfiles,
			int consumerIndex
	){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Building5(name, rpcport, privateKey, consumptionProfiles, consumerIndex));	
		return result;
	}
	

}
