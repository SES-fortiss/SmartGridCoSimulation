package linprogMPC.components;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import linprogMPC.TopologyConfig;
import linprogMPC.components.prototypes.Consumer;
import linprogMPC.helper.FileManager;
import linprogMPC.helper.MyTimeUnit;
import linprogMPC.messages.extension.NetworkType;

public class CSVConsumer extends Consumer {

	/** Default heat profile. Loaded from resources directory */
	private static final String DEFAULT_HEAT_PROFILE = "WaermeVerbraeucheAngepasstGebaeude1.csv";
	/** Default electricity profile. Loaded from resources directory */
	private static final String DEFAULT_ELECTRICITY_PROFILE = "StromVerbraeucheAngepasstGebaeude1.csv";
	/** Network type */
	private NetworkType networkType;
	/** Heat consumption profile */
	private ArrayList<Double> heatProfile;
	/** Electricity consumption profile */
	private ArrayList<Double> electricityProfile;

	/**
	 * Constructor for a CSVConsumer with electricity or heat demand
	 */
	public CSVConsumer(String csvProfilePath, NetworkType networkType, int port) {
		super(port);
		this.networkType = networkType;
		setProfile(csvProfilePath);
	}

	/**
	 * Constructor for a CSVConsumer with electricity and heat demand
	 */
	public CSVConsumer(String csvHeatProfilePath, String csvElecProfilePath, int port) {
		super(port);
		this.networkType = NetworkType.DEMANDWITHBOTH;
		setHeatProfile(csvHeatProfilePath);
		setElectricityProfile(csvElecProfilePath);
	}

	/**
	 * Call {@link #setElectricityProfile(String)}, {@link #setHeatProfile(String)},
	 * or both according to the {@link #networkType}
	 */
	private void setProfile(String csvProfilePath) {
		if (networkType == NetworkType.HEAT) {
			setHeatProfile(csvProfilePath);
		} else {
			setElectricityProfile(csvProfilePath);
		}
	}

	/**
	 * Set {@link #heatProfile}
	 */
	private void setHeatProfile(String csvHeatProfilePath) {
		BufferedReader br = null;
		if (csvHeatProfilePath.isEmpty()) {
			br = new BufferedReader(FileManager.readFromResources(DEFAULT_HEAT_PROFILE));
		} else {
			br = new BufferedReader(FileManager.readFromSource(csvHeatProfilePath));
		}
		this.heatProfile = readCSVFile(br);
	}

	/**
	 * Set {@link #electricityProfile}
	 */
	private void setElectricityProfile(String csvElecProfilePath) {
		BufferedReader br = null;
		if (csvElecProfilePath.isEmpty()) {
			br = new BufferedReader(FileManager.readFromResources(DEFAULT_ELECTRICITY_PROFILE));
		} else {
			br = new BufferedReader(FileManager.readFromSource(csvElecProfilePath));
		}
		this.electricityProfile = readCSVFile(br);
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

	/**
	 * @return current {@link #heatProfile}
	 */
	private List<Double> getHeatProfile(int timeStep, int mpcHorizon) {
		return heatProfile.subList(timeStep, timeStep + mpcHorizon);
	}

	/**
	 * @return current {@link #electricityProfile}
	 */
	private List<Double> getElectricityProfile(int timeStep, int mpcHorizon) {
		return electricityProfile.subList(timeStep, timeStep + mpcHorizon);
	}

	/**
	 * Calls {@link #getElectricityProfile(int, int)},
	 * {@link #getHeatProfile(int, int)} or both according to the
	 * {@link #networkType}
	 * 
	 * @return current consumption profile
	 */
	@Override
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

	/**
	 * @return {@link #networkType}
	 */
	@Override
	public NetworkType getNetworkType() {
		return networkType;
	}
}
