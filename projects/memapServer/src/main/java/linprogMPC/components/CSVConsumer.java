package linprogMPC.components;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import linprogMPC.TopologyConfig;
import linprogMPC.components.prototypes.Consumer;
import linprogMPC.helper.FileManager;
import linprogMPC.helper.MyTimeUnit;
import linprogMPC.messages.extension.NetworkType;

public class CSVConsumer extends Consumer {

	private static final String DEFAULT_HEAT_PROFILE = "WaermeVerbraeucheAngepasstGebaeude1.csv";
	private static final String DEFAULT_ELECTRICITY_PROFILE = "StromVerbraeucheAngepasstGebaeude1.csv";
	private NetworkType networkType;
	private ArrayList<Double> heatProfile;
	private ArrayList<Double> electricityProfile;

	/*
	 * public CSVConsumer(String csvProfilePath, String csvElectricityFileName, int
	 * port) { super(port); this.heatProfile = readCSVFile(csvHeatFileName);
	 * this.electricityProfile = readCSVFile(csvElectricityFileName); }
	 */
	public CSVConsumer(String csvProfilePath, NetworkType networkType, int port) {
		super(port);
		this.networkType = networkType;
		System.out.println("Set consumptionFile " + csvProfilePath);
		setConsumptionProfile(csvProfilePath);
	}

	private void setConsumptionProfile(String csvProfilePath) {
		BufferedReader br = null;

		if (csvProfilePath.isEmpty()) {
			if (networkType == NetworkType.HEAT) {
				br = new BufferedReader(FileManager.readFromResources(DEFAULT_HEAT_PROFILE));
				this.heatProfile = readCSVFile(br);
				this.electricityProfile = new ArrayList<Double>(Collections.nCopies(heatProfile.size(), 0.0));
			} else {
				br = new BufferedReader(FileManager.readFromResources(DEFAULT_ELECTRICITY_PROFILE));
				this.electricityProfile = readCSVFile(br);
				this.heatProfile = new ArrayList<Double>(Collections.nCopies(electricityProfile.size(), 0.0));
			}
		} else {
			br = new BufferedReader(FileManager.readFromSource(csvProfilePath));
			if (networkType == NetworkType.HEAT) {
				this.heatProfile = readCSVFile(br);
				this.electricityProfile = new ArrayList<Double>(Collections.nCopies(heatProfile.size(), 0.0));
			} else {
				this.electricityProfile = readCSVFile(br);
				this.heatProfile = new ArrayList<Double>(Collections.nCopies(electricityProfile.size(), 0.0));
			}
		}
	}

	private ArrayList<Double> readCSVFile(BufferedReader br) {
		ArrayList<Double> records = new ArrayList<Double>();
		ArrayList<Double> dailyRecords = new ArrayList<Double>();
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		try {
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
			int daysToConsider = (int) Math.round(TopologyConfig.N_STEPS / k + 0.5);
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

	// @Override
	public List<Double> getProfile(int timeStep, int mpcHorizon) {
		List<Double> profile = new ArrayList<Double>();
		if (networkType == NetworkType.DEMANDWITHBOTH) {
			profile.addAll(getHeatProfile(timeStep, mpcHorizon));
			profile.addAll(getElectricityProfile(timeStep, mpcHorizon));
		}
		
		if (networkType == NetworkType.HEAT) {
			profile = getHeatProfile(timeStep, mpcHorizon);
		}
		
		if (networkType == NetworkType.ELECTRICITY) {
			profile = getElectricityProfile(timeStep, mpcHorizon);
		}
		
		return profile;
	}

	@Override
	public List<Double> getHeatProfile(int timeStep, int mpcHorizon) {
		return heatProfile.subList(timeStep, timeStep + mpcHorizon);
	}

	@Override
	public List<Double> getElectricityProfile(int timeStep, int mpcHorizon) {
		return electricityProfile.subList(timeStep, timeStep + mpcHorizon);
	}

	@Override
	public NetworkType getNetworkType() {
		return networkType;
	}
}
