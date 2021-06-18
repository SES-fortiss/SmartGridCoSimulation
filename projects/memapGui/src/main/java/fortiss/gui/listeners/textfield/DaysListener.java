package fortiss.gui.listeners.textfield;

import fortiss.gui.listeners.helper.NumberVerifier;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class DaysListener extends TextFieldListener {

	public DaysListener() {
		super("Invalid number!", new NumberVerifier().withMaxLength(4));
	}

	@Override
	public void update(String text) {
		Parameters pars = PlanningTool.getInstance().getParameters();
		pars.setDays(Integer.parseUnsignedInt(text));
	}

	@Override
	public String getAttribute() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		return String.valueOf(pars.getDays());
	}

}
