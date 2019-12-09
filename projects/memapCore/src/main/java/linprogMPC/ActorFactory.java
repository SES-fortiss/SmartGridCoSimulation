package linprogMPC;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import behavior.BehaviorModel;

public abstract class ActorFactory {
	
	public static <T extends BehaviorModel> ActorOptions createDevice(T device) {
	ActorOptions result = new ActorOptions(LoggingMode.MINIMAL, new HashSet<String>(), new HashSet<String>(),
		new HashSet<String>(), device);
	return result;
    }
}
