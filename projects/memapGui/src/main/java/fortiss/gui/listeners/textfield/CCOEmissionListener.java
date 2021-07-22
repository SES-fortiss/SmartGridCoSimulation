package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;
import fortiss.gui.listeners.helper.NumberVerifier;

public class CCOEmissionListener extends ComponentFieldListener {

	public CCOEmissionListener() {
		super("Error. Invalid value!",
				new NumberVerifier().withNegativeAllowed().withDecimalAllowed().withMaxLength(10));
	}

	@Override
	public String getAttribute() {
		double co2 = ((Coupler) component).getCOEmission();
		return String.valueOf(co2);
	}

	@Override
	public void update(String text) {
		((Coupler) component).setCOEmission(Double.parseDouble(text));
	}
}
