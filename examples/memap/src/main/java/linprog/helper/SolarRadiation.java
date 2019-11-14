package linprog.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import linprog.LinProgSimulation;
import meritorder.helper.ReadMemapFiles;
import simulation.SimulationStarter;

public class SolarRadiation {
	
	
	private static final String SOLARRADIATION_FILENAME = "PStrahlung.csv";
	private static final String SOLARPRODUCTION_FILENAME = "Discovergy_PVAnlage15kWp.csv";
	
	private ArrayList<Double> solarRadiation;
	private ArrayList<Double> solarProductionPerKWp;
	
	public SolarRadiation() {
		solarRadiation = readSolarRadiation(SOLARRADIATION_FILENAME);
		// Production of a 15kWp solar installation (source: https://my.discovergy.com/export?9
		solarProductionPerKWp = readSolarProduction(SOLARPRODUCTION_FILENAME);
	}
	
	
	/**
	 * Returns the current solar radiation at a given point in time.
	 * 
	 * @param time the point in time for which to get the radiation
	 * @return solar radiation in kW/m²
	 */
//	public static double getRadiation(Calendar time) {
//		return 0.0;
//	}
	
	/**
	 * Returns the current solar radiation at a given timestep. Assumes timestep 0 at 12 am.
	 * 
	 * @param time the timestep for which to get the radiation
	 * @return solar radiation in kW/m²
	 */
	
	public double getRadiation(int timestep) {
		return solarRadiation.get(timestep % solarRadiation.size());
	}
	

	
	
// 	public static double getRadiation(int timestep) {
//		double hourOfDay = (timestep * Simulation.stepLength(TimeUnit.HOURS)) % 24;
//		if(hourOfDay > 5 && hourOfDay < 21) {
//			return 0.1*Math.pow(Math.exp(-(hourOfDay-13.5)),2)/10*Math.random();
//		}
//		else return 0.0;
//	}

	public double getSolarProductionPerKWp(int timestep) {
		// devide through 15 to get the Production per kWp
		return solarProductionPerKWp.get(timestep % solarProductionPerKWp.size())/15.0;
	}
	
	
	private ArrayList<Double> readSolarRadiation(String filename){
		ArrayList<Double> solarRadiation = new ArrayList<Double>();
		try {
			String source = "res/"+ filename;			
			String location = ReadMemapFiles.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length()-15);
			location = location + source;	
			FileReader fr = new FileReader(location);
			BufferedReader br = new BufferedReader(fr);
		    read(br, solarRadiation);	
		} catch (IOException | ParseException e1) {
				e1.printStackTrace();
				SimulationStarter.stopSimulation();
				return null;
		}
		
		return solarRadiation;
	}
	
	private ArrayList<Double> readSolarProduction(String filename) {
		ArrayList<Double> solarProductionPerKWp = new ArrayList<Double>();
		try {
			String source = "res/"+ filename;			
			String location = ReadMemapFiles.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length()-15);
			location = location + source;	
			FileReader fr = new FileReader(location);
			BufferedReader br = new BufferedReader(fr);
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
		
		int timestepsPerDay = (int)(LinProgSimulation.N_STEPS/LinProgSimulation.N_DAYS);
    	
		double[] xi = new double[timestepsPerDay];
		for (int j1 = 0; j1 < timestepsPerDay ; j1++) {
    		xi[j1]=j1*LinProgSimulation.stepLength(TimeUnit.MINUTES);    
    	}	   		
		
		double[] yi = Interpolation.interpLinear(x, y, xi);
		for (int k = 0; k < yi.length; k++) {
			solarProductionPerKWp.add(yi[k]);
    	}
		
    	SolutionHandler.exportData(y, "Solarradiation_1Day.csv");
    	SolutionHandler.exportData(yi, "Solarradiation_1Day_interpolated.csv");
	    br.close();
	}	
	
	private void read(BufferedReader br, ArrayList<Double> solarRadiation) throws IOException, ParseException{
	    String zeile;
	      
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
    	
    	while ((zeile = br.readLine()) != null){	
				
			try {
				solarRadiation.add(nf.parse(zeile).doubleValue());	
			} catch (Exception e) {
				// do nothing
			}
		}
    	
	    br.close();
	}	

}
