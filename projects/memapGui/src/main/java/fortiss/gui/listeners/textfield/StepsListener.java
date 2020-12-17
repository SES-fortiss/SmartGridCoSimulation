package fortiss.gui.listeners.textfield;

import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class StepsListener extends NumberListener {

	public StepsListener() {
		super(false, false, 4);
	}

	@Override
	void update(String text) {
		Parameters pars = PlanningTool.getInstance().getParameters();
		pars.setSteps(Integer.parseUnsignedInt(text));
	}

	@Override
	String getAttribute() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		return Integer.toString(pars.getMPCHorizon());
	}	
	
}
