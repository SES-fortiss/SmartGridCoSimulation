package memap.helper;

/**
 * Helper class to return the energy prices.
 */
public class EnergyPrices {

	/**
	 * This is a Singleton class. It builds and holds an instance of the
	 * ElectricityPrices and the HeatPrices classes.
	 */
	private static EnergyPrices instance = new EnergyPrices();

	// Hochlastzeitfenster
	private Price maxBuyLimit;
	
	private Price elecBuyingPrice;
	private Price elecSellingPrice;
	private Price heatBuyingPrices;

	
	public void init(Price maxBuyLimit, Price elecBuyingPrice2, Price elecSellingPrice2, Price heatBuyingPrice) {
		this.maxBuyLimit = maxBuyLimit;
		this.elecBuyingPrice = elecBuyingPrice2;
		this.elecSellingPrice = elecSellingPrice2;
		this.heatBuyingPrices = heatBuyingPrice;
	}

	public double getMaxBuyLimit(int timestep) {
		return maxBuyLimit.getPriceForTimeStep(timestep);
	}
	
	public double getElecBuyingPrice(int timestep) {
		return elecBuyingPrice.getPriceForTimeStep(timestep);
	}

	public double getElecSellingPrice(int timestep) {
		return elecSellingPrice.getPriceForTimeStep(timestep);
	}

	public double getHeatBuyingPrice(int timestep) {
		return heatBuyingPrices.getPriceForTimeStep(timestep);
	}

	/**
	 * Returns the electricity price in cents per kWh at any given time step in
	 * ct/kJ, read from a CSV-file.
	 * 
	 * Prices vary between 25-50 ct/kWh within 7days converted to EUR/kWh The prices
	 * are expected to have a time interval of 15 minutes (see readEnergyPrices)
	 * 
	 * @param time the time step for which to get the electricity price
	 * @return electricity price in ct/kWh at specified time step
	 * 
	 *         Kept for compatibility
	 */
	//@Deprecated
	//public double getElectricityPriceInEuro(int timestep) {
	//	return getElecBuyingPrice(timestep);
	//}

	/**
	 * Returns the heat price in Euro per kWh at any given time step. For now, it
	 * constantly returns 5,34 ct/kWh (Stadtwerke Wuerzburg), but here CSV-files or
	 * web services or other mechanisms could be plugged in.
	 * 
	 * @param time the time step for which to get the gas price
	 * @return gas price in ct/kWh at specified time step
	 * 
	 *         Kept for compatibility. Note that since commit
	 *         31ea694b186cd3eda7ad8b17649c386864a6f748 the returned value does not
	 *         coincide with the description.
	 */
	/*@Deprecated
	public double getHeatPriceInEuro(int timestep) {
		double value = 0.0534d;
		value = 0.7;
		return value;
	}*/

	public static EnergyPrices getInstance() {
		return instance;
	}

}
