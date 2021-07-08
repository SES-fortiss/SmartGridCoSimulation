package fortiss.gui.listeners.textfield;

public class BMaxLimitListener extends NumberListener {

		public BMaxLimitListener() {
			super(false, true, 10000);
		}
		
		@Override
		void update(String text) {
			building.setMax_buy_limit(Integer.parseInt(text));
		}

		@Override
		String getAttribute() {			
			return String.valueOf(building.getMax_buy_limit());
		}
}
