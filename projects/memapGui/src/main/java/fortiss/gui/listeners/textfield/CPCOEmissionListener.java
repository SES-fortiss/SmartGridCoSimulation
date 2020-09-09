package fortiss.gui.listeners.textfield;

import fortiss.components.Controllable;

public class CPCOEmissionListener extends NumberListener{

	public CPCOEmissionListener() {
		super(true, true, 10);
	}

	@Override
	String getAttribute() {
		double co2 = ((Controllable) component).getCOEmission();
		return String.valueOf(co2);
	}

	@Override
	void update(String text) {
		((Controllable) component).setCOEmission(Double.parseDouble(text));	
	}
	
}