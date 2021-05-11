package fortiss.gui.listeners.helper;

public class ElectricityPrice extends Price {

	private static final String DEFAULT_FILE = "ELECTRICITYPRICEEXAMPLE";
	private static final double DEFAULT_PRICE = 0.3;
	private static final String [] labels = { "Price [EUR/kWh]" };
	private static final String units = "[EUR/kWh]";

	public ElectricityPrice(double price, int mpcHorizon) {
		super(true, price, DEFAULT_FILE, mpcHorizon);
	}

	public ElectricityPrice(String priceFilePath, int mpcHorizon) {
		super(false, DEFAULT_PRICE, priceFilePath, mpcHorizon);
	}
	
	/** Intended for deserialization */
	public ElectricityPrice(boolean fixed, double price, String priceFilePath, int mpcHorizon) {
		super(fixed, price, priceFilePath, mpcHorizon);
	}

	@Override
	public String getUnits() {
		return units;
	}
	
	@Override
	public String[] getLabels() {
		return labels;
	}

	@Override
	public String getDefaultFile() {
		return DEFAULT_FILE;
	}

}
