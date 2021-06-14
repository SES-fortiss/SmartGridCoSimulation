package fortiss.gui.listeners.textfield;

import fortiss.components.Coupler;

public class CCOEmissionListener extends NumberListener {

	public CCOEmissionListener() {
		super(true, true, 10);
	}

	@Override
	String getAttribute() {
		double co2 = ((Coupler) component).getCOEmission();
		return String.valueOf(co2);
	}

	@Override
	void update(String text) {
		((Coupler) component).setCOEmission(Double.parseDouble(text));	
	}
}
