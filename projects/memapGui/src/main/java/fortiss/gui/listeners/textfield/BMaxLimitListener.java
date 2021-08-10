package fortiss.gui.listeners.textfield;

import fortiss.gui.listeners.helper.NumberVerifier;

public class BMaxLimitListener extends ComponentFieldListener {

		public BMaxLimitListener() {
			super("Invalid number!", new NumberVerifier().withDecimalAllowed().withMaxLength(10000));	
		}
		
		@Override
		public void update(String text) {
			building.setMax_buy_limit(Integer.parseInt(text));
		}

		@Override
		public String getAttribute() {			
			return String.valueOf(building.getMax_buy_limit());
		}
}
