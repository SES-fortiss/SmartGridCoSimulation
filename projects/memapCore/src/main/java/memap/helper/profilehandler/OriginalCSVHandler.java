package memap.helper.profilehandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import com.google.gson.Gson;

import memap.main.TopologyConfig;

public class OriginalCSVHandler {
	
	/** Heat profile values */
	private ArrayList<Double> heatProfile = new ArrayList<Double>();
	/** Electricity profile values */
	private ArrayList<Double> electricityProfile = new ArrayList<Double>();
	
	/**
	 * Interpolates the consumption profiles. The method is called by the
	 * constructor.
	 * 
	 * @param br a buffer reader with the data to be interpolated
	 * @param topologyConfig 
	 * @throws IOException
	 * @throws ParseException
	 */
	public OriginalCSVHandler(BufferedReader br, TopologyConfig topologyConfig) throws IOException, ParseException {
		double stepLengthInMinutes = topologyConfig.getStepLengthInMinutes();
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);		

		HashMap<Integer, ArrayList<Double>> profiles = new HashMap<Integer, ArrayList<Double>>();
		HashMap<Integer, ArrayList<Double>> dailyProfiles = new HashMap<Integer, ArrayList<Double>>();

		profiles.put(0, heatProfile);
		profiles.put(1, electricityProfile);
		for (int i = 0; i < 2; i++) {
			dailyProfiles.put(i, new ArrayList<Double>());
		}

		String row;
		String[] buffer;
		double[] consumptionBuffer = new double[2]; // Heat[0] + Electricity[1]

		int rowIndex = 0;
		int k = 0;

		/*
		 * TODO make this more flexible, i.e. the time resolution in the file might not
		 * be always the one minute resolution.
		 */

		// Read-in of consumption values for every minute (in the example files)
		while ((row = br.readLine()) != null) {
			// get values
			buffer = row.split(";");
			consumptionBuffer[0] += nf.parse(buffer[0]).doubleValue() / stepLengthInMinutes;
			consumptionBuffer[1] += nf.parse(buffer[1]).doubleValue() / stepLengthInMinutes;
			rowIndex++;

			// Sum up consumption over the number of minutes per time step
			if ((rowIndex >= (k + 1) * stepLengthInMinutes) && (buffer.length != 0)) {
				for (int j = 0; j < buffer.length; j++) {
					/**
					 * // Necessary if the time step is not exactly one minute. double
					 * deltaOverMinute = rowIndex - (k + 1) *
					 * MyTimeUnit.stepLength(TimeUnit.MINUTES); double deduction =
					 * nf.parse(buffer[j]).doubleValue() * deltaOverMinute; consumptionBuffer[j] =
					 * consumptionBuffer[j] - deduction; We ignore this for now
					 */
					dailyProfiles.get(j).add(consumptionBuffer[j]);
					consumptionBuffer[j] = 0;
				}
				k++;
			}
		}

		br.close();

		// Calculate the consumption for one day longer than necessary because of MPC
		// horizon
		// the heat profile of one day is copied for n_days; ( k = N_STEPS/N_Days )
		int daysToConsider = (int) Math.round(topologyConfig.getNrSteps() / k + 0.5);
		for (int m = 0; m < daysToConsider; m++) {
			for (int j = 0; j < 2; j++) {
				for (int i = 0; i < dailyProfiles.get(1).size(); i++) {
					profiles.get(j).add(dailyProfiles.get(j).get(i));
				}
			}
		}
		
		Gson gson = new Gson();

		System.out
				.println("Profiles available. Heat: " + profiles.get(0).size() + " : " + gson.toJson(profiles.get(0)));
		System.out
				.println("Profiles available. Elec: " + profiles.get(1).size() + " : " + gson.toJson(profiles.get(1)));
	}
	
	public ArrayList<Double> getHeatProfile() {
		return heatProfile;
	}
	
	public ArrayList<Double> getElectricityProfile() {
		return electricityProfile;
	}

}
