package linprogMPC.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import linprogMPC.ThesisTopologySimple;
import simulation.SimulationStarter;

public class SolarRadiation {
		
	private static String SOLARPRODUCTION_FILENAME = "Discovergy_PVAnlage15kWp.csv";	
	//private static final String SOLARPRODUCTION_FILENAME = "Discovergy_PVAnlage15kWp_badDay.csv";
	
	private ArrayList<Double> solarProductionPerKWp;
	
	public SolarRadiation() {
		// Production of a 15kWp solar installation (source: https://my.discovergy.com/export?9
		solarProductionPerKWp = readSolarProduction(SOLARPRODUCTION_FILENAME);
	}

	public double getSolarProductionPerKWp(int timestep) {
		// devide through 15 to get the Production per kWp
		return solarProductionPerKWp.get(timestep % solarProductionPerKWp.size())/15.0;
	}
	
	private ArrayList<Double> readSolarProduction(String filename) {
		ArrayList<Double> solarProductionPerKWp = new ArrayList<Double>();
		try {
			// Retrieve Consumptionprofiles from res folder. Note that actual path
			// to res folder varies across different systems and using explicit paths 
			// is therefore not recommended.
			BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/" + filename)));
		    readProd(br, solarProductionPerKWp);	
		} catch (IOException | ParseException e1) {
				e1.printStackTrace();
				SimulationStarter.stopSimulation();
				return null;
		}
		
		return solarProductionPerKWp;
	}
	
	
	private void readProd(BufferedReader br, ArrayList<Double> solarProductionPerKWp) throws IOException, ParseException{
	    String zeile;
	    String[] buffer; 
	    ArrayList<Double> originalValues = new  ArrayList<Double>();
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
    	
	    int j = 0;
    	while ((zeile = br.readLine()) != null){	
    		buffer = zeile.split(",");	
    		
    		if ( j !=0) { // Skip header
				try {
					// write Value in kW
					originalValues.add(nf.parse(buffer[2]).doubleValue()/1000);	
				} catch (Exception e) {
					// do nothing
				}
    		}
			j++;
		}
    	
    	double[] x = new double[originalValues.size()];
    	double[] y = new double[originalValues.size()];
    	
		for (int i = 0; i < originalValues.size() ; i++) {
    		x[i]=15*i;    		// 15 min * 1 Days = 96 
    		y[i]=originalValues.get(i);
    	}
		
		int timestepsPerDay = ThesisTopologySimple.TIMESTEPS_PER_DAY;
    	
		double[] xi = new double[timestepsPerDay];
		for (int j1 = 0; j1 < timestepsPerDay ; j1++) {
    		xi[j1]=j1*MyTimeUnit.stepLength(TimeUnit.MINUTES);    
    	}	   		
		
		double[] yi = Interpolation.interpLinear(x, y, xi);
	    // Sometimes NAN appears, which is bad
	    for (int i = 0; i < yi.length; i++) {
			if ( Double.isNaN(yi[i]) ) {
				yi[i]= 0.0;
			}			
		}
		
		for (int k = 0; k < yi.length; k++) {
			solarProductionPerKWp.add(yi[k]);
    	}
	    br.close();	    	   
    	//SolutionHandler.exportVector(yi, "Solarradiation_1Day.csv");
	}
}
