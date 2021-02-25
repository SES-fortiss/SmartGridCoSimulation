package memap.helper;

/**
 * Helper class to return the network's co2 emission levels for the timesteps.
 */
public class CO2profiles {
	
	// TODO improve later with profile
	public static double getCO2emissions(int timestep) {
		
		double co2StromDeutschland = 0.474; // nach Statistischen Daten
		
		co2StromDeutschland = 0.540; // nach Stefan's Master Arbeit - als Vergleich für Riemerling
		
		return co2StromDeutschland; // current co2 emission level of Germany
	}
	
}
