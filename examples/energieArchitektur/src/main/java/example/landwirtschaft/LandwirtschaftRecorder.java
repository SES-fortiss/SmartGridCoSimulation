package example.landwirtschaft;

import helper.FileRecorderGridarchitect;
import behavior.BehaviorModel;

public class LandwirtschaftRecorder extends FileRecorderGridarchitect{
	
	public LandwirtschaftRecorder(BehaviorModel behaviorModel){
		this.model = behaviorModel;
		this.header = "Zeit, Verbrauch, Erzeugung, Last";
	}
}
