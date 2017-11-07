package example.strasse;

import helper.FileRecorderGridarchitect;
import behavior.BehaviorModel;

public class StrassenBeleuchtungRecorder extends FileRecorderGridarchitect{
	
	public StrassenBeleuchtungRecorder(BehaviorModel behaviorModel){
		this.model = behaviorModel;
		this.header = "Zeit, Verbrauch, Erzeugung, Last";
	}
}
