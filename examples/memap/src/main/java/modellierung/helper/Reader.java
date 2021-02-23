package modellierung.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import simulation.SimulationStarter;

public class Reader {
	
	boolean isDataThere = false;
	final int NUM = 96;
	double[] werte = new double[NUM];
	LocalTime[] lt = new LocalTime[NUM];
	
	String filename = "";
	
	public Reader(String file) {
		this.filename = file;
	}

	public boolean readFile(){
		try {
			String source = "res/" + filename;			
			String location = Reader.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			location = location.replace("%20", " ");
			location = location.substring(0, location.length()-15);
			location = location + source;
			
			FileReader fr = new FileReader(location);
			BufferedReader br = new BufferedReader(fr);
		    read(br);			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
			SimulationStarter.stopSimulationStatic();
			return false;
		}
		isDataThere = true;		
		return true;
	}
	
	private void read(BufferedReader br) throws IOException, ParseException{
	    String zeile;
	    String[] buffer;
	    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");	    
	    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
	    int i = 0;
    	while ((zeile = br.readLine()) != null){		    			
				buffer = zeile.split(";");
				lt[i] = LocalTime.parse(buffer[0], timeFormatter);
				werte[i] = nf.parse(buffer[1]).doubleValue();
				i++;
		}
    	
	    br.close();
	}

	public double getLoad(LocalDateTime actualTimeValue) {
		if (isDataThere == false) readFile();
		int i = getIndex(actualTimeValue);	
		return werte[i];
	}

	private int getIndex(LocalDateTime actualTimeValue) {
		LocalTime time = actualTimeValue.toLocalTime();
		int seconds = time.toSecondOfDay();
		int result = seconds * 96 /(24 * 60 * 60); 
		return result;
	}
}
