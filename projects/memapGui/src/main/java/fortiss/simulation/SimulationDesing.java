package fortiss.simulation;

import fortiss.simulation.helper.ProgressManager;

public class SimulationDesing extends SimulationState {

	/**
	 * Start the design stage
	 * 
	 * @param pm the progress manager
	 */
	@Override
	public void execute(ProgressManager pm) {
		PlanningTool.showDesigner();
	}
}
