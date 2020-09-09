package fortiss.gui.listeners.textfield;

import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;

public class FixedValueListener extends NumberListener{

	public FixedValueListener() {
		super(true, true, 10);
	}

	@Override
	void update(String text) {
		Parameters pars = PlanningTool.getInstance().getParameters();
		pars.setFixedMarketPrice(Integer.parseUnsignedInt(text));		
	}

	@Override
	String getAttribute() {
		Parameters pars = PlanningTool.getInstance().getParameters();
		return String.valueOf(pars.getFixedMarketPrice());
	}
	
}