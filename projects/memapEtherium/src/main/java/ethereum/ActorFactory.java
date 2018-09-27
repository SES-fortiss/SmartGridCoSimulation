package ethereum;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import ethereum.components.Building1;
import ethereum.components.Building3;
import ethereum.components.Building2;
import ethereum.components.Building4;
import ethereum.components.Building5;
import ethereum.components.Timekeeper;
import ethereum.helper.ConsumptionProfiles;


public abstract class ActorFactory {
	
	public static ActorOptions createTimekeeper(int rpcport){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Timekeeper(rpcport));
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
