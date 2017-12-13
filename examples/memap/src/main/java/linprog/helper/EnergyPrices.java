package linprog.helper;

import java.util.Calendar;
import java.util.Random;

/**
 * Helper class to return the gas price.
 */
public class EnergyPrices {
	
	/**
	 * Returns the gas price in cents per kWh at any given point in time. For now, it constantly returns 6.12 ct/kWh,
	 * but here CSV-files or web services or other mechanisms could be plugged in.
	 * 
	 * @param time the point in time for which to get the gas price
	 * @return gas price in ct/kWh at specified point in time
	 */
	public static double getGasPriceInCent(Calendar time) {
		return 6.12d;
	}
	
	/**
	 * Returns the electricity price in cents per kWh at any given point in time. For now, it constantly returns
	 * a value between 27.5 and 32.5 ct/kWh, but here CSV-files or web services or other mechanisms could be plugged in.
	 * 
	 * @param time the point in time for which to get the electricity price
	 * @return electricity price in ct/kWh at specified point in time
	 */
	public static double getElectricityPriceInCent(Calendar time) {
		return 30 + (new Random()).nextDouble()*5 - 2.5;
	}

}
