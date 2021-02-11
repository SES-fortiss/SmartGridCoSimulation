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

/**
 * This class is intended to be a general structure for timed data. It should
 * not be modified to include hard coded values or to serve a particular
 * application.
 */
public class TimedData extends LinkedHashMap<String, ArrayList<TimeDataPoint>> {

	private static final long serialVersionUID = 1L;

	private String[] columnNames;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);

	/**
	 * Represents data of any kind marked with a date.
	 * 
	 * @param sourceFile  a CSV source file with dated data and headers. The first
	 *                    column must correspond to a date and the second one to
	 *                    time. The data columns can have any name.
	 * @param columnNames the names for the data columns. (It does not include date;
	 *                    and time columns)
	 * @throws ParseException
	 * @throws IOException
	 */
	public TimedData(BufferedReader sourceFile, String[] columnNames) throws IOException, ParseException {
		super();
		this.columnNames = columnNames;
		read(sourceFile);
	}

	private void read(BufferedReader br) throws IOException, ParseException {

		// Add data sets
		for (int i = 0; i < columnNames.length; i++) {
			this.put(columnNames[i], new ArrayList<TimeDataPoint>());
		}
		String line;
		while ((line = br.readLine()) != null) {

			if (line.charAt(0) != '#') // skipping the header which starts with '#'
			{
				List<String> br_values = Arrays.asList(line.split(";"));

				// parse date and time
				LocalDateTime ldt = LocalDateTime.parse(br_values.get(0).concat(" ").concat(br_values.get(1)),
						formatter);

				// parse data: starts in 2 to avoid date and time columns
				for (int i = 0; i < columnNames.length; i++) {
					// nf set the formatter, currently GERMAN, i.e. ","
					double value_temp = nf.parse(br_values.get(i + 2)).doubleValue();					
					
					TimeDataPoint tdp_temp = new TimeDataPoint(ldt, value_temp);
					this.get(columnNames[i]).add(tdp_temp);
				}
			}
		}
	}

	public int getLength() {
		return this.size();
	}
}
