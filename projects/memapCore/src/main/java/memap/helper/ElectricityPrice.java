package memap.helper;

public class ElectricityPrice extends Price {

	private static final String DEFAULT_FILE = "ELECTRICITYPRICEEXAMPLE";
	private static final String [] labels = { "Price [EUR/kWh]" };
	private static final String units = "[EUR/kWh]";

	public ElectricityPrice(double price, int mpcHorizon) {
		super(price, mpcHorizon);
	}

	public ElectricityPrice(String priceFilePath) {
		super(priceFilePath);
	}

	/** Intended for deserialization */
	public ElectricityPrice(boolean fixed, double price, String priceFilePath, int mpcHorizon) {
		super(fixed, price, priceFilePath, mpcHorizon);
	}

	@Override
	public String[] getLabels() {
		return labels;
	}

	@Override
	public String getUnits() {
		return units;
	}

	@Override
	public String getDefaultFile() {
		return DEFAULT_FILE;
	}

}
