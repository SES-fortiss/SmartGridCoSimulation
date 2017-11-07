package example.aggregator;

import helper.FileRecorderGridarchitect;
import behavior.BehaviorModel;

public class AggregatorRecorder extends FileRecorderGridarchitect{
	
	public AggregatorRecorder(BehaviorModel behaviorModel){
		this.model = behaviorModel;
		this.header = "Zeit, VerbrauchGesamt, Haus, Gewerbe, Landwirtschaft, Strassenbeleuchtung, ErzeugungGesamt,  Solar, Last ";
	}
}
