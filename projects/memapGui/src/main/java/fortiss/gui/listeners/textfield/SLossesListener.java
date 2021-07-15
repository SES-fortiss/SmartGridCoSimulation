package fortiss.gui.listeners.textfield;

import fortiss.components.Storage;
import fortiss.gui.listeners.helper.NumberVerifier;

public class SLossesListener extends ComponentFieldListener{

	public SLossesListener() {
		super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMin(0).withMax(1).withMaxLength(10));
	}

	@Override
	public void update(String text) {
		((Storage) component).setLosses(Double.parseDouble(text));
	}

	@Override
	public String getAttribute() {
		double soc = ((Storage) component).getLosses();
		return String.valueOf(soc);
	}
	
}