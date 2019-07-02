package linprogMPC.components;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import linprogMPC.ThesisTopologySimple;
import linprogMPC.helper.MyTimeUnit;

public class CSVConsumer extends Consumer {

	private ArrayList<Double> heatProfile;
	private ArrayList<Double> electricityProfile;

	public CSVConsumer(String csvHeatFileName, String csvElectricityFileName, int port) {
		super(port);
		this.heatProfile = readCSVFile(csvHeatFileName);
		this.electricityProfile = readCSVFile(csvElectricityFileName);
	}

	@Override
	public List<Double> getHeatProfile(int timeStep, int mpcHorizon) {
		return heatProfile.subList(timeStep, timeStep + mpcHorizon);

	}

	@Override
	public List<Double> getElectricityProfile(int timeStep, int mpcHorizon) {
		return electricityProfile.subList(timeStep, timeStep + mpcHorizon);
	}

	private ArrayList<Double> readCSVFile(String csvFileName) {
		ArrayList<Double> records = new ArrayList<Double>();
		ArrayList<Double> dailyRecords = new ArrayList<Double>();
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(this.getClass().getResourceAsStream("/" + csvFileName)));

			String record;
			double consumptionBuffer = 0;
			int index = 0;
			int k = 0;

			while ((record = br.readLine()) != null) {
				consumptionBuffer += nf.parse(record).doubleValue();
				index++;
				if ((index >= (k + 1) * MyTimeUnit.stepLength(TimeUnit.MINUTES))) {
					// *********das ist n�tig, falls der Zeitschritt nicht genau einer minute
					// entspricht.
					double deltaOverMinute = index - (k + 1) * MyTimeUnit.stepLength(TimeUnit.MINUTES);
					double abzug = nf.parse(record).doubleValue() * deltaOverMinute;
					consumptionBuffer = consumptionBuffer - abzug;

					// *********Anpassung abgeschlossen

					// TODO den rest noch draufAddieren

					dailyRecords.add(consumptionBuffer);

					consumptionBuffer = 0;
					k++;
				}

			}
			br.close();
			// Calculate the consumption for one day longer than necessary because of MPC
			// horizon
			int daysToConsider = (int) Math.round(ThesisTopologySimple.N_STEPS / k + 0.5);
			System.out.println("Days to Consider because of MPC: " + daysToConsider);

			// the heat profile of one day is copied for n_days; ( k = N_STEPS/N_Days )
			for (int m = 0; m < daysToConsider; m++) {
				for (int i = 0; i < dailyRecords.size(); i++) {
					records.add(dailyRecords.get(i));
				}

			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return records;
	}
}
