package fortiss.gui.listeners.textfield;

import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class DaysListener extends NumberListener {

	public DaysListener() {
		super(false, false, 4);
	}

	@Override
	void update(String text) {
		Parameters pars = PlanningTool.getInstance().getParameters();
		pars.setDays(Integer.parseUnsignedInt(text));
	}

	@Override
	String getAttribute() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		return String.valueOf(pars.getDays());
	}

}
