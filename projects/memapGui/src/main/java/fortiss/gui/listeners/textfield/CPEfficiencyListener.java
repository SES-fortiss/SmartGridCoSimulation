package fortiss.gui.listeners.textfield;

import fortiss.components.Controllable;
import fortiss.gui.listeners.helper.NumberVerifier;

public class CPEfficiencyListener extends ComponentFieldListener{

	public CPEfficiencyListener() {
		super("Invalid number!", new NumberVerifier().withNegativeAllowed().withDecimalAllowed().withMin(0).withMax(1).withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Controllable) component).setEfficiency(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double efficiency = ((Controllable) component).getEfficiency();
		return String.valueOf(efficiency);
	}
	
}