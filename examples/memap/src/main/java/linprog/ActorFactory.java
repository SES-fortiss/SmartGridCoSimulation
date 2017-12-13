package linprog;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import linprog.components.BHKW;
import linprog.components.LinProgBehavior;

public abstract class ActorFactory {
	
	public static ActorOptions createBHKW(String name, double qt_max, double efficiency, int port){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new BHKW(name, qt_max, efficiency));	
		return result;
	}
	
	public static ActorOptions createLinProgBehavior(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new LinProgBehavior());
		return result;
	}

}
