package example.commericalComponents;

import helper.FileRecorderGridarchitect;
import behavior.BehaviorModel;

public class CommercialBuildingRecorder extends FileRecorderGridarchitect{
	
	public CommercialBuildingRecorder(BehaviorModel behaviorModel){
		this.model = behaviorModel;
		this.header = "Zeit, Verbrauch, Erzeugung, Last";
	}
}
