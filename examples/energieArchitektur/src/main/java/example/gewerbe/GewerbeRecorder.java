package example.gewerbe;

import helper.FileRecorderGridarchitect;
import behavior.BehaviorModel;

public class GewerbeRecorder extends FileRecorderGridarchitect{
	
	public GewerbeRecorder(BehaviorModel behaviorModel){
		this.model = behaviorModel;
		this.header = "Zeit, Verbrauch, Erzeugung, Last";
	}
}
