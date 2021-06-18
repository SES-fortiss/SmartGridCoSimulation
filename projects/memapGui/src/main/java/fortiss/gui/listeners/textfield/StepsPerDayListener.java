package fortiss.gui.listeners.textfield;

import fortiss.gui.listeners.helper.NumberVerifier;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

/**
 * Listener for the number of simulation steps
 */
public class StepsPerDayListener extends TextFieldListener{

	public StepsPerDayListener() {
		super("Invalid number!", new NumberVerifier().withMaxLength(4));
	}

	@Override
	public void update(String text) {
		Parameters pars = PlanningTool.getInstance().getParameters();
		pars.setStepsPerDay(Integer.parseUnsignedInt(text));
	}

	@Override
	public String getAttribute() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		return String.valueOf(pars.getStepsPerDay());
	}
			
}
