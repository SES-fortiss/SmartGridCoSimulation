package memap.helper.profilehandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * 
 * This class is used to obtain the data from a csv file of MEMAP as specified in the scenario.
 * It expects four entrances Date, Time, Elecr.Value, Heat.Value, as specified by the project
 * 
 * @param br
 * @return
 */
public class TimedData {
	
	// disclaimer for code quality, this class uses in some methods some hard coded values.
	// this can be of course more general, but due to our specification we keep it like that
	// for the moment
	
	private Map<String, ArrayList<TimeDataPoint>> dataset = new LinkedHashMap<String, ArrayList<TimeDataPoint>>();
	private int length = 0;
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);

	public TimedData(BufferedReader readFromSource) throws IOException, ParseException {
		dataset = read(readFromSource);
	}

	private Map<String, ArrayList<TimeDataPoint>> read(BufferedReader br) throws IOException, ParseException {
		
		// instantiating the dataset
		
		String[] br_names = { "Date", "Time", "Electricity", "Heat" }; // the hard coding part of specifications
		
		dataset.put(br_names[2], new ArrayList<TimeDataPoint>());
		dataset.put(br_names[3], new ArrayList<TimeDataPoint>());
		
		String line;
		while ((line = br.readLine()) != null) {
			
			if (line.charAt(0) != '#') // skipping the header which starts with '#' 
			{			
				List<String> br_values = Arrays.asList(line.split(";"));
				
				// expecting four entrances Date, Time, Elecr.Value, Heat.Value
				
				LocalDateTime ldt = LocalDateTime.parse( br_values.get(0).concat(" ").concat(br_values.get(1)) , formatter ); // first two for date and time
				double electricity = nf.parse(br_values.get(2)).doubleValue();
				double heat = nf.parse(br_values.get(3)).doubleValue();
				
				TimeDataPoint tdp_electricity = new TimeDataPoint(ldt, electricity);
				TimeDataPoint tdp_heat = new TimeDataPoint(ldt, heat);

				dataset.get(br_names[2]).add(tdp_electricity);
				dataset.get(br_names[3]).add(tdp_heat);
				
				length++;
			}
		}		
		return dataset;
	}
	
	public int getLength() {
		return length;
	}
	
	public Map<String, ArrayList<TimeDataPoint>> getDataset(){
		return dataset;
	}	
}
