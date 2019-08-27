package memap.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import memap.MemapConfig;

public class ConsumptionProfiles {

	private static final String DEFAULT_HEAT_PROFILE = "WaermeVerbraeuche.csv";
	private static final String DEFAULT_ELECTRICITY_PROFILE = "StromVerbraeuche.csv";

	private HashMap<Integer, ArrayList<Double>> profiles = new HashMap<Integer, ArrayList<Double>>();
	private final int nrOfProfiles;

	public ConsumptionProfiles(String profilesPath, String networkType) {
		nrOfProfiles = MemapConfig.NR_OF_CONSUMERS;
		setProfiles(networkType, profilesPath);
	}

	/**
	 * Returns the current heat consumption at a given time step.
	 * Inputs, originally in kW/minute, are converted to kWh and the multiplied by
	 * the time step in hours
	 * 
	 * @param timestep the time step for which to get the heat consumption
	 * @return heat consumption at given time step
	 * @throws Exception
	 */

	public double getHeatConsumption(int consumptionIndex, int timestep) throws Exception {
		if (consumptionIndex > nrOfProfiles) {
			throw new Exception();
		}
		return getProfiles().get(consumptionIndex).get(timestep) / 60;
	}

	public double getElectricConsumption(int consumptionIndex, int timestep) throws Exception {
		if (consumptionIndex > nrOfProfiles) {
			throw new Exception();
		}
		return getProfiles().get(consumptionIndex).get(timestep) / 60;
	}

	/**
	 * Returns the number of profiles for which this object was initialized
	 * 
	 * @return number of profiles
	 */
	public int getNrOfProfiles() {
		return nrOfProfiles;
	}

	/**
	 * Interpolates the consumption profile in the buffer according too the number
	 * of profiles.
	 * 
	 * @param br           a character buffer with the consumption profiles data
	 * @param nrOfProfiles number of consumption profiles
	 * @throws IOException
	 * @throws ParseException
	 */
	private void interpolateConsumption(BufferedReader br, int nrOfProfiles) throws ParseException, IOException {

		HashMap<Integer, ArrayList<Double>> dailyProfiles = new HashMap<Integer, ArrayList<Double>>();
		for (int i = 0; i < nrOfProfiles; i++) {
			getProfiles().put(i, new ArrayList<Double>());
			dailyProfiles.put(i, new ArrayList<Double>());
		}

		String row;
		String[] buffer;
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);

		int rowIndex = 0;
		int k = 0;

		double[] consumptionBuffer = new double[nrOfProfiles];

		// Read-in of consumption values in kJ for every minute
		while ((row = br.readLine()) != null) {

			buffer = row.split(";");
			for (int j = 0; j < nrOfProfiles; j++) { // Number of houses
				consumptionBuffer[j] += nf.parse(buffer[j]).doubleValue();
			}
			rowIndex++;

			// Sum up consumption over the number of minutes per timestep
			if ((rowIndex >= (k + 1) * MyTimeUnit.stepLength(TimeUnit.MINUTES)) && (buffer.length != 0)) {

				for (int j = 0; j < buffer.length; j++) {

					// Necessary if the time step is not exactly one minute.
					double deltaOverMinute = rowIndex - (k + 1) * MyTimeUnit.stepLength(TimeUnit.MINUTES);
					double deduction = nf.parse(buffer[j]).doubleValue() * deltaOverMinute;
					consumptionBuffer[j] = consumptionBuffer[j] - deduction;

					// ********* Customization completed
					// TODO Add the rest on it

					dailyProfiles.get(j).add(consumptionBuffer[j]);
					consumptionBuffer[j] = 0;
				}
				k++;

			}
		}

		br.close();

		// Calculate the consumption for one day longer than necessary because of MPC
		// horizon
		int daysToConsider = (int) Math.round(MemapConfig.N_STEPS / k + 0.5);
		System.out.println("Days to Consider because of MPC: " + daysToConsider);

		// TODO that happens twice

		// the heat profile of one day is copied for n_days; ( k = N_STEPS/N_Days )
		for (int m = 0; m < daysToConsider; m++) {
			for (int j = 0; j < nrOfProfiles; j++) {
				for (int v = 0; v < dailyProfiles.get(1).size(); v++) {
					getProfiles().get(j).add(dailyProfiles.get(j).get(v));
				}
			}
		}
	}

	public HashMap<Integer, ArrayList<Double>> getProfiles() {
		return profiles;
	}

	public void setProfiles(String networkType, String profilesPath) {
		if (profilesPath.equals("")) {
			if (networkType.equals("Heat")) {
				try {
					BufferedReader br = new BufferedReader(ReadFileManager.readFromResources(DEFAULT_HEAT_PROFILE));
					interpolateConsumption(br, nrOfProfiles);
				} catch (ParseException | IOException e) {
					System.err.println("Error reading " + profilesPath + "thrown at class ConsumptionProfiles");
					e.printStackTrace();
				}
				System.out.println(">> Loading default heat profiles: " + getProfiles().get(0).size());
			} else if (networkType.equals("Electricity")) {
				try {
					BufferedReader br = new BufferedReader(
							ReadFileManager.readFromResources(DEFAULT_ELECTRICITY_PROFILE));
					interpolateConsumption(br, nrOfProfiles);
				} catch (ParseException | IOException e) {
					System.err.println("Error reading " + profilesPath + "thrown at class ConsumptionProfiles");
					e.printStackTrace();
				}
				System.out.println(">> Loading default electricity profiles: " + getProfiles().get(0).size());
			}
		} else {
			System.out.println(">> Reading from: " + profilesPath);
			if (networkType.equals("Heat")) {
				try {
					BufferedReader br = new BufferedReader(ReadFileManager.readFromSource(profilesPath));
					interpolateConsumption(br, nrOfProfiles);
				} catch (ParseException | IOException e) {
					System.err.println("Error reading " + profilesPath + "thrown at class ConsumptionProfiles");
					e.printStackTrace();
				}
				System.out.println(">> Loading custom heat profiles: " + getProfiles().get(0).size());
			} else if (networkType.equals("Electricity")) {
				try {
					BufferedReader br = new BufferedReader(ReadFileManager.readFromSource(profilesPath));
					interpolateConsumption(br, nrOfProfiles);
				} catch (ParseException | IOException e) {
					System.err.println("Error reading " + profilesPath + "thrown at class ConsumptionProfiles");
					e.printStackTrace();
				}
				System.out.println(">> Loading custom electricity profiles: " + getProfiles().get(0).size());
			}
		}
	}
}