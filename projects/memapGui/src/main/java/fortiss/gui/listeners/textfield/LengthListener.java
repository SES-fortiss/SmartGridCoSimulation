package fortiss.gui.listeners.textfield;

import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

/**
 * Listener for the number of simulation steps
 */
public class LengthListener extends NumberListener{

	public LengthListener() {
		super(false, false, 4);
	}

	@Override
	void update(String text) {
		Parameters pars = PlanningTool.getInstance().getParameters();
		pars.setLength(Integer.parseUnsignedInt(text));
	}

	@Override
	String getAttribute() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		return String.valueOf(pars.getStepsPerDay());
	}
			
}
