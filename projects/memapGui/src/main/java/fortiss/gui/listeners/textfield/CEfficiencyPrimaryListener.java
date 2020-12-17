package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;

public class CEfficiencyPrimaryListener extends NumberListener{

	public CEfficiencyPrimaryListener() {
		super(true, true, -1, 10, 10);
	}

	@Override
	void update(String text) {
		((Coupler) component).setEfficiencyPrimary(Double.parseDouble(text));
	}

	@Override
	String getAttribute() {
		double efficiency = ((Coupler) component).getEfficiencyPrimary();
		return String.valueOf(efficiency);
	}
	
}
