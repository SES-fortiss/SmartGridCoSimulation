package example.aggregator;

import helper.FileRecorderGridarchitect;
import behavior.BehaviorModel;

public class AggregatorRecorder extends FileRecorderGridarchitect{
	
	public AggregatorRecorder(BehaviorModel behaviorModel){
		this.model = behaviorModel;
		this.header = "Time, TotalDemand, House, Commercial, Farms, StreetLights"
				+ ", TotalGeneration,  Solar, TotalPower";
	}
}
