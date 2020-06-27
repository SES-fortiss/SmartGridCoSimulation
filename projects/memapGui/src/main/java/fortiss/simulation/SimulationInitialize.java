package fortiss.simulation;

import fortiss.simulation.helper.ProgressManager;

public class SimulationInitialize extends SimulationState {

	/**
	 * Initialize the application
	 * 
	 * @param pm the progress manager
	 */
	@Override
	public void execute(ProgressManager pm) {
		PlanningTool.init();
		pm.setState(new SimulationDesing());
		pm.execute();
	}

}
