package memap.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import memap.helper.profilehandler.Interpolation;
import simulation.SimulationStarter;

public class SolarRadiation {

	/** Solar production per KWp */
	private ArrayList<Double> solarProductionPerKWp;
	private int timeStepsPerDay;
	private int stepLength;
	
	public SolarRadiation(String csvFile, int timeStepsPerDay) {
		this.timeStepsPerDay = timeStepsPerDay;
		stepLength = (int) (TimeUnit.DAYS.toMinutes(1)/timeStepsPerDay);
		readSolarProductionPerKWp(csvFile);
	}

	/**
	 * @param timestep the time step for which to get the solar production per KWp
	 * @return solar production per KWp
	 */
	public double getSolarProductionPerKWp(int timestep) {
		// divide through 15 to get the Production per kWp
		return solarProductionPerKWp.get(timestep % solarProductionPerKWp.size()) / 15.0;
	}

	/**
	 * Assign values to SolarProductionPerKWp
	 */
	private void readSolarProductionPerKWp(String csvFile) {
		try {
			FileManager fm = new FileManager();
			if (csvFile.isEmpty()) {
				readSolarProfileFile(fm.getBuffer("SOLARPRODUCTIONEXAMPLE"));
			} else {
				readSolarProfileFile(fm.getBuffer(csvFile));
			}
		} catch (IOException | ParseException e) {
			System.err.println("Error reading or parsing CSV data from " + csvFile);
			SimulationStarter.stopSimulation();
			e.printStackTrace();
		}

	}

	/**
	 * Assign values to solar production {@link #solarProductionPerKWp} from buffer
	 * @param br buffer
	 */
	private void readSolarProfileFile(BufferedReader br) throws IOException, ParseException {
		
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		ArrayList<Double> originalValues = new ArrayList<Double>();
		solarProductionPerKWp = new ArrayList<Double>();
		String row;
		String[] buffer;

		int j = 0;
		while ((row = br.readLine()) != null) {
			buffer = row.split(",");
			if (j != 0) { // Skip header
				try {
					// write Value in kW
					originalValues.add(nf.parse(buffer[2]).doubleValue() / 1000);
				} catch (Exception e) {
					// do nothing
				}
			}
			j++;
		}

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
			solarProductionPerKWp.add(yi[k]);
		}
		br.close();
	}
}
