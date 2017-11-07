package example.haus;

import helper.FileRecorderGridarchitect;
import behavior.BehaviorModel;

public class HausRecorder extends FileRecorderGridarchitect{
	
	public HausRecorder(BehaviorModel behaviorModel){
		this.model = behaviorModel;
		this.header = "Zeit, Verbrauch [W], Erzeugung [W], Batterie [W], Last [W], SOC[kWh], Einspeisung [kWh], Eigenverbrauch [kWh], Bezug [kWh], pot. Autarkie, Selbstversorgung[%]";
	}
}