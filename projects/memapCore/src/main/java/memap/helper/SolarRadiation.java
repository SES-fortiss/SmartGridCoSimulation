package memap.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import memap.helper.profilehandler.Interpolation;
import memap.helper.profilehandler.TimedSimpleData;
import memap.helper.profilehandler.TimedSimpleDataHandler;
import memap.main.TopologyConfig;
import simulation.SimulationStarter;

public class SolarRadiation {

	private ArrayList<Double> normalizedSolarProductionProfile;
	private TopologyConfig topologyConfig;
	private int timeStepsPerDay;
	private int stepLength;
	
	public SolarRadiation(String csvFile, TopologyConfig topologyConfig) {
		this.timeStepsPerDay = topologyConfig.getTimeStepsPerDay();
		this.topologyConfig = topologyConfig;
		stepLength = (int) (TimeUnit.DAYS.toMinutes(1)/timeStepsPerDay);
		getNormalizedSolarProductionFromFile(csvFile);
	}
	
	/**
	 * 
	 * @param timestep - the time step to obtain the current normalized solar production
	 * @return returns a double value to the normalized solarProduction for that time step
	 */
	public double getSolarProduction(int timestep) {
		return normalizedSolarProductionProfile.get(timestep % normalizedSolarProductionProfile.size()); // % ensures that to large indeces leads to a readout as a loop 
	}

	/**
	 * 
	 * Uses the  <b>csvFile </b> <i>string</i> to read a file and create an normalized profile for volatile production from that.
	 * 
	 * @param csvFile
	 */
	private void getNormalizedSolarProductionFromFile(String csvFile) {
		try {
			FileManager fm = new FileManager();
			if (csvFile.isEmpty()) {
				normalizedSolarProductionProfile = readOriginalFormat(fm.getBuffer("FORECASTEXAMPLE"));
			} else {
				normalizedSolarProductionProfile = readOriginalFormat(fm.getBuffer(csvFile));
			}
		} catch (IOException | ParseException | ArrayIndexOutOfBoundsException  e) {
			
			try {
				FileManager fm = new FileManager();
				normalizedSolarProductionProfile = readScenarioFormat(fm.getBuffer(csvFile));
			} catch (Exception e2) {
				System.err.println("Error reading or parsing CSV data from " + csvFile);
				SimulationStarter.stopSimulation();
				e.printStackTrace();
				e2.printStackTrace();
			}
		}
	}

	private ArrayList<Double> readScenarioFormat(BufferedReader br) throws IOException, ParseException {		
		TimedSimpleData tsd = new TimedSimpleData(br);
		TimedSimpleDataHandler tsh = new TimedSimpleDataHandler(tsd, topologyConfig);		
		ArrayList<Double> result = tsh.getProfile();		
		return result;
	}

	private ArrayList<Double> readOriginalFormat(BufferedReader br) throws IOException, ParseException, ArrayIndexOutOfBoundsException  {
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		ArrayList<Double> originalValues = new ArrayList<Double>();
		ArrayList<Double> result = new ArrayList<Double>();
		
		String row;
		String[] buffer;

		int j = 0;
		while ((row = br.readLine()) != null) {
			buffer = row.split(",");
			if (j != 0) { // Skip header
				// write Value in kW, in original format the file has [Watt] as phys. unit
				originalValues.add(nf.parse(buffer[2]).doubleValue() / 1000);
			}
			j++;
		}

		/*
		 * Note, it seems here that the method converted the power in energy units 
		 * and interpolated them afterwards.
		*/
		
		double[] x = new double[originalValues.size()];
		double[] y = new double[originalValues.size()];
		for (int i = 0; i < originalValues.size(); i++) {
			x[i] = 15 * i; // 15 min * 1 Days = 96
			y[i] = originalValues.get(i);
		}

		double[] xi = new double[timeStepsPerDay];
		for (int j1 = 0; j1 < timeStepsPerDay; j1++) {
			//xi[j1] = j1 * MyTimeUnit.stepLength(TimeUnit.MINUTES);
			xi[j1] = j1 * stepLength;
		}

		double[] yi = Interpolation.interpLinear(x, y, xi);
		// Sometimes NAN appears, which is bad
		for (int i = 0; i < yi.length; i++) {
			if (Double.isNaN(yi[i])) {
				yi[i] = 0.0;
			}
		}

		for (int k = 0; k < yi.length; k++) {
			result.add(yi[k]);
		}
		br.close();

		return result;
	}
}
