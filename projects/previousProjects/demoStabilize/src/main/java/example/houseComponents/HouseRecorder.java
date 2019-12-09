package example.houseComponents;

import helper.FileRecorderGridarchitect;
import behavior.BehaviorModel;

public class HouseRecorder extends FileRecorderGridarchitect{
	
	public HouseRecorder(BehaviorModel behaviorModel){
		this.model = behaviorModel;
		this.header = "Zeit, Verbrauch, Erzeugung, Last";
	}
}
