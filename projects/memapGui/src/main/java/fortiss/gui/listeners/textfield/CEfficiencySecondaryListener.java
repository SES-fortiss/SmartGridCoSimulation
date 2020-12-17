package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;

public class CEfficiencySecondaryListener extends NumberListener{

	public CEfficiencySecondaryListener() {
		super(true, true, -1, 10, 10);
	}

	@Override
	void update(String text) {
		((Coupler) component).setEfficiencySecondary(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double efficiency = ((Coupler) component).getEfficiencySecondary();
		return String.valueOf(efficiency);
	}
	
}