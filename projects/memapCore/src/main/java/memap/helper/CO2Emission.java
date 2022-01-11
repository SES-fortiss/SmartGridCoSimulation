package memap.helper;

public class CO2Emission extends Price {

	private static final String DEFAULT_FILE = "CO2EMISSIONEXAMPLE";
	private static final String [] labels = { "Factor [g/kWh]" };
	private static final String units = "[g CO2/kWh]";

	public CO2Emission(double price, int mpcHorizon) {
		super(price, mpcHorizon);
	}

	public CO2Emission(String priceFilePath, int mpcHorizon) {
		super(priceFilePath);
	}
	
	/** Intended for deserialization */
	public CO2Emission(boolean fixed, double price, String priceFilePath, int mpcHorizon) {
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
