package linprogMPC.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import linprogMPC.ThesisTopologySimple;
import linprogMPC.components.Consumer;
import linprogMPC.components.prototypes.Device;
import linprogMPC.helper.MyTimeUnit;

public class CSVExampleController implements BuildingController {

    public String name;
    public boolean hasLDHeating;
    public int heatTransportLength;
    private Set<Device> devices = new HashSet<Device>();
    private ArrayList<Double> heatConsumption;
    private ArrayList<Double> electricityConsumption;

    public CSVExampleController(String name, String csvHeatFileName, String csvElectricityFileName,
	    boolean hasLDHeating, int heatTransportLength) {
	this.name = name;
	this.hasLDHeating = hasLDHeating;
	this.heatTransportLength = heatTransportLength;
	this.heatConsumption = readCSVFile(csvHeatFileName);
	this.electricityConsumption = readCSVFile(csvElectricityFileName);

	// adding Consumers from CSV files
	devices.add(new Consumer(heatConsumption, electricityConsumption, 0));
    }

    @Override
    public String getName() {
	return name;
    }

    @Override
    public boolean hasLDHeaeting() {
	return hasLDHeating;
    }

    @Override
    public int getHeatTransportLength() {
	return heatTransportLength;
    }

    @Override
    public Set<Device> getDevices() {
	return devices;
    }

    @Override
    public void attach(Device device) {
	this.devices.add(device);
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
		    // *********das ist nötig, falls der Zeitschritt nicht genau einer minute
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
