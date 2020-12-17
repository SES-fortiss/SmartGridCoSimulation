package fortiss.gui.listeners.textfield;

import fortiss.components.Controllable;

public class CPEfficiencyListener extends NumberListener{

	public CPEfficiencyListener() {
		super(true, true, 0, 1, 10);
	}

	@Override
	void update(String text) {
		((Controllable) component).setEfficiency(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double efficiency = ((Controllable) component).getEfficiency();
		return String.valueOf(efficiency);
	}
	
}