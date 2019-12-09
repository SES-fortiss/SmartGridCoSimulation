package example.farmComponents;

import helper.FileRecorderGridarchitect;
import behavior.BehaviorModel;

public class FarmRecorder extends FileRecorderGridarchitect{
	
	public FarmRecorder(BehaviorModel behaviorModel){
		this.model = behaviorModel;
		this.header = "Zeit, Verbrauch, Erzeugung, Last";
	}
}
