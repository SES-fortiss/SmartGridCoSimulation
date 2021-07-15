package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;
import fortiss.gui.listeners.helper.NumberVerifier;

public class CEfficiencyPrimaryListener extends ComponentFieldListener{

	public CEfficiencyPrimaryListener() {
		super("Invalid number!", new NumberVerifier().withNegativeAllowed().withDecimalAllowed().withMin(-1).withMax(10).withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Coupler) component).setEfficiencyPrimary(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double efficiency = ((Coupler) component).getEfficiencyPrimary();
		return String.valueOf(efficiency);
	}
	
}
