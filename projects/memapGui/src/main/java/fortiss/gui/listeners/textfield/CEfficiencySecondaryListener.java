package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;
import fortiss.gui.listeners.helper.NumberVerifier;

public class CEfficiencySecondaryListener extends ComponentFieldListener{

	public CEfficiencySecondaryListener() {
		super("Invalid number!", new NumberVerifier().withNegativeAllowed().withDecimalAllowed().withMin(-1).withMax(10).withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Coupler) component).setEfficiencySecondary(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double efficiency = ((Coupler) component).getEfficiencySecondary();
		return String.valueOf(efficiency);
	}
	
}