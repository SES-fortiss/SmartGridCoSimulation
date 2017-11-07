package example.streetLights;

import helper.FileRecorderGridarchitect;
import behavior.BehaviorModel;

public class StreetLightsRecorder extends FileRecorderGridarchitect{
	
	public StreetLightsRecorder(BehaviorModel behaviorModel){
		this.model = behaviorModel;
		this.header = "Zeit, Verbrauch, Erzeugung, Last";
	}
}
