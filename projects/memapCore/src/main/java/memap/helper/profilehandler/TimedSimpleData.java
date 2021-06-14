package memap.helper.profilehandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;


/**
 * 
 * This class is used to obtain the data from a csv file of MEMAP as specified in the scenario for single profiles.
 * It expects 3 entrances Date, Time, Value.
 * 
 * @param br
 * @return
 */
public class TimedSimpleData {
	
	// disclaimer for code quality, this class uses in some methods some hard coded values.
		// this can be of course more general, but due to our specification we keep it like that
		// for the moment
		
		private ArrayList<TimeDataPoint> dataset = new ArrayList<TimeDataPoint>();
		private int length = 0;
		
		private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);

		public TimedSimpleData(BufferedReader readFromSource) throws IOException, ParseException {
			dataset = read(readFromSource);
		}

		private ArrayList<TimeDataPoint> read(BufferedReader br) throws IOException, ParseException {
						
			String line;
			while ((line = br.readLine()) != null) {
				
				if (line.charAt(0) != '#') // skipping the header which starts with '#' 
				{			
					List<String> br_values = Arrays.asList(line.split(";"));
					
					// expecting 3 entrances Date, Time, Value					
					LocalDateTime ldt = LocalDateTime.parse( br_values.get(0).concat(" ").concat(br_values.get(1)) , formatter ); // first two for date and time
					double value = nf.parse(br_values.get(2)).doubleValue();
					
					TimeDataPoint tdp_value = new TimeDataPoint(ldt, value);
					dataset.add(tdp_value);					
					length++;
				}
			}		
			return dataset;
		}
		
		public int getLength() {
			return length;
		}
		
		public ArrayList<TimeDataPoint> getDataset(){
			return dataset;
		}	

}
