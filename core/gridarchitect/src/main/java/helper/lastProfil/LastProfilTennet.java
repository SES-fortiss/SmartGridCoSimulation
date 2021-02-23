/**
 * 
 */
package helper.lastProfil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import simulation.SimulationStarter;

/**
 * @author Denis Bytschkow
 *
 */
public class LastProfilTennet {
	
	
	private static final int NUM = 35043;
	
	private static double[] loadDomestic = new double[NUM];
	private static double[] loadCommercial = new double[NUM];
	private static double[] loadAgriculture = new double[NUM];
	private static double[] loadStreetLights = new double[NUM];
	private static LocalDateTime[] time = new LocalDateTime[NUM];
	
	private static boolean isDataThere = false;  // flag
	private static int timeIndex = 0;
 
	public static final double scalingFactor = 4.0 / 1000; // Um die Leistung zu berechnen
	
	/**
	 * Methode um die Leistung zu einem Zeitpunkt zu bekommen in Watt!
	 * 
	 * @param jahresVerbrauch in kWh
	 * @param inputTime Zeitpunkt der Leistung
	 * @return Last in kWh
	 */
	public static double getLoadCommercial(double jahresVerbrauch, LocalDateTime inputTime){		
		updateTimeIndex(inputTime);		
		return loadCommercial[timeIndex]*scalingFactor*jahresVerbrauch;
	}
	
	public static double getLoadDomestic(double jahresVerbrauch, LocalDateTime inputTime){
		updateTimeIndex(inputTime);
		return loadDomestic[timeIndex]*scalingFactor*jahresVerbrauch;
	}
	
	public static double getLoadAgriculture(double jahresVerbrauch, LocalDateTime inputTime){
		updateTimeIndex(inputTime);
		return loadAgriculture[timeIndex]*scalingFactor*jahresVerbrauch;
	}
	
	public static double getLoadStreetLights(double jahresVerbrauch, LocalDateTime inputTime){
		updateTimeIndex(inputTime);
		return loadStreetLights[timeIndex]*scalingFactor*jahresVerbrauch;
	}
	
	public static synchronized boolean updateTimeIndex(LocalDateTime inputTime) {
		if (!isDataThere) {						
			readFile();
		}
		
		// wegen Daten von 2014, Schaltjahre nicht berücksichtigt
		LocalDateTime iTime;
		if (inputTime.getYear() != 2014) {
			iTime = LocalDateTime.of(2014, inputTime.getMonth(), inputTime.getDayOfMonth(), inputTime.getHour(), inputTime.getMinute());
		} else {
			iTime = inputTime;
		}
		
		int minIndex = iTime.getMinute() / 15;
		int hIndex = iTime.getHour() * 4;
		
		// wegen Zeitumstellung
		if (iTime.isAfter(LocalDateTime.of(2014, 3, 30, 2,0))) {
			hIndex = hIndex - 4;
		}
		
		if (iTime.isAfter(LocalDateTime.of(2014, 10, 26, 3,0))){
			hIndex = hIndex + 4;
		}				
		int dayIndex = (iTime.getDayOfYear()-1) * 24 * 4;
		
		timeIndex = dayIndex + hIndex + minIndex;		
		return true;
	}

	public static boolean readFile(){
		try {
			String source = "src/main/resources/lastProfiles/StandardlastprofileTenneT.csv";
			
			String location = LastProfilTennet.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length()-15);
			location = location + source;
			
			FileReader fr = new FileReader(location);
			BufferedReader br = new BufferedReader(fr);
		    read(br);			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
			try {
				String source = "/resources/lastProfiles/StandardlastprofileTenneT.csv";
				InputStreamReader isr = new InputStreamReader(LastProfilTennet.class.getResourceAsStream(source));					
				BufferedReader br2 = new BufferedReader(isr);					
				read(br2);		
			} catch (IOException | ParseException e1) {
				e1.printStackTrace();
				SimulationStarter.stopSimulationStatic();
				return false;
			}
		}		
		isDataThere = true;		
		return true;
	}
	
	private static void read(BufferedReader br) throws IOException, ParseException{
	    String zeile;
	    String[] buffer;
	    
	    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	    
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
	    
    	int i = 0;
    	
    	// Skip first two lines
    	zeile = br.readLine();
    	
    	//System.out.println(zeile);
    	
    	zeile = br.readLine();
    	
    	while ((zeile = br.readLine()) != null){		    			
				buffer = zeile.split(";");				
				LocalDateTime ldt = LocalDateTime.of(LocalDate.parse(buffer[0], dateFormatter), LocalTime.parse(buffer[1], timeFormatter));
				time[i] = ldt;
				
				loadCommercial[i] = nf.parse(buffer[4]).doubleValue();
				loadDomestic[i]= nf.parse(buffer[5]).doubleValue();
				loadAgriculture[i] = nf.parse(buffer[6]).doubleValue();
				loadStreetLights[i] = nf.parse(buffer[9]).doubleValue();								
				i++;
		}
    	
	    br.close();
	}	

}
