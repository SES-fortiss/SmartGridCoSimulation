package meritorder.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

import simulation.SimulationStarter;

public class ReadMemapFiles {
	
	boolean readFiles = false;
	
	ArrayList<LocalTime> time = new ArrayList<LocalTime>();
	ArrayList<Double> strom = new ArrayList<Double>();
	ArrayList<Double> heizwaerme = new ArrayList<Double>();
	ArrayList<Double> warmwasser = new ArrayList<Double>();

	public ReadMemapFiles(String filename) {
		readFile(filename);
	}
	
	private boolean readFile(String filename){
		try {
			String source = "res/"+ filename;			
			String location = ReadMemapFiles.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length()-15);
			location = location + source;			
			FileReader fr = new FileReader(location);
			BufferedReader br = new BufferedReader(fr);
		    read(br);	
		} catch (IOException | ParseException e1) {
				e1.printStackTrace();
				SimulationStarter.stopSimulationStatic();
				return false;
		}
		
		readFiles = true;
		return true;
	}
	
	
	// Seiteneffekt: die Arrays werden befüllt.
	private void read(BufferedReader br) throws IOException, ParseException{
	    String zeile;
	    String[] buffer;
	    
	    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");	    
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
    	
    	// Skip first lines
    	// zeile = br.readLine();    	
    	zeile = br.readLine();
    	
    	while ((zeile = br.readLine()) != null){		    			
				buffer = zeile.split(";");
				
				if (buffer.length != 0) {
					try {
						LocalTime ldt = LocalTime.parse(buffer[0], timeFormatter);
						time.add(ldt);
						strom.add(nf.parse(buffer[1]).doubleValue());				
						heizwaerme.add(nf.parse(buffer[2]).doubleValue());
						warmwasser.add(nf.parse(buffer[3]).doubleValue());
					} catch (Exception e) {
						// do nothing
					}
				}
		}
    	
	    br.close();
	}	

	public int getIndex(LocalDateTime ldt) {
		return getIndex(ldt.toLocalTime());
	}
	
	// ineffizient, spielt im Moment aber keine Rolle
	public int getIndex(LocalTime lt) {
		int result = 0;
		while (time.get(result).isBefore(lt) && (result < time.size()) ) {
			result++;
		}
		return result;
	}
	
	public double getHeizWaerme(LocalDateTime ldt) {
		return heizwaerme.get( getIndex(ldt) );
	}
	
	public double getStrom(LocalDateTime ldt) {
		return strom.get(getIndex(ldt));
	}
	
	public double getWarmwasser(LocalDateTime ldt) {
		return warmwasser.get( getIndex(ldt) );
	}
	
}
