package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;
import fortiss.gui.listeners.helper.NumberVerifier;

public class VCOEmissionListener extends ComponentFieldListener {

	public VCOEmissionListener() {
		super("Invalid number!", new NumberVerifier().withNegativeAllowed().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public String getAttribute() {
		double co2 = ((Volatile) component).getCOEmission();
		return String.valueOf(co2);
	}

	@Override
	public void update(String text) {
		((Volatile) component).setCOEmission(Double.parseDouble(text));
	}

}