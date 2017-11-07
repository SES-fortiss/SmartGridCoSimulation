package example.solar;

import helper.FileRecorderGridarchitect;
import behavior.BehaviorModel;

public class SolarRecorder extends FileRecorderGridarchitect{
	
	public SolarRecorder(BehaviorModel behaviorModel){
		this.model = behaviorModel;
		this.header = "Zeit, Verbrauch, Erzeugung, Last";
	}
}
