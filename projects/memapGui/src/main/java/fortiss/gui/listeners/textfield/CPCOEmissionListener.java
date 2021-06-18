package fortiss.gui.listeners.textfield;

import fortiss.components.Controllable;
import fortiss.gui.listeners.helper.NumberVerifier;

public class CPCOEmissionListener extends ComponentFieldListener {

	public CPCOEmissionListener() {
		super("Invalid number!", new NumberVerifier().withNegativeAllowed().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public String getAttribute() {
		double co2 = ((Controllable) component).getCOEmission();
		return String.valueOf(co2);
	}

	@Override
	public void update(String text) {
		((Controllable) component).setCOEmission(Double.parseDouble(text));
	}

}