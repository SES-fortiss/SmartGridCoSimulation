package fortiss.gui.listeners.textfield;

import fortiss.components.Volatile;

public class VCOEmissionListener extends NumberListener {

	public VCOEmissionListener() {
		super(true, true, 10);
	}

	@Override
	String getAttribute() {
		double co2 = ((Volatile) component).getCOEmission();
		return String.valueOf(co2);
	}

	@Override
	void update(String text) {
		((Volatile) component).setCOEmission(Double.parseDouble(text));	
	}
	
}