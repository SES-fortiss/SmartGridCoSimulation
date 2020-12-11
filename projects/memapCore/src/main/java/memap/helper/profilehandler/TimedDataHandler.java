package memap.helper.profilehandler;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import memap.main.TopologyConfig;

/**
 * This class is intended to be handle general timed data. It should not be
 * modified to include hard coded values or to serve a particular application.
 */
public class TimedDataHandler extends LinkedHashMap<String, ArrayList<Double>> {

	private static final long serialVersionUID = 1L;

	public TimedDataHandler(TimedData timedData, TopologyConfig topologyConfig, String[] columnNames) {
		super();
		double intervalInSeconds = topologyConfig.getStepLengthInSeconds();
		
		for(int i = 0; i < columnNames.length; i++) {
			this.put(columnNames[i], handleProfiles(timedData.get(columnNames[i]), intervalInSeconds));
		}
	}

	private ArrayList<Double> handleProfiles(ArrayList<TimeDataPoint> profile, double intervalInSeconds) {

		ArrayList<Double> result = new ArrayList<Double>();

		LocalDateTime start = profile.get(0).getDateTime();
		LocalDateTime end = profile.get(profile.size() - 1).getDateTime();

		long intervalInSeconds_long = Math.round(intervalInSeconds);
		end = end.plusSeconds(intervalInSeconds_long);

		long duration = Duration.between(start, end).toMillis() / 1000;
		long NSteps = duration / intervalInSeconds_long;

		int counterOfIndexProfile = 0;
		for (int i = 0; i < NSteps; i++) {

			double average = 0.0;
			int counterOfElements = 0;

			LocalDateTime end_loop = start.plusSeconds(intervalInSeconds_long * (i + 1));

			while (counterOfIndexProfile < profile.size()
					&& end_loop.isAfter(profile.get(counterOfIndexProfile).getDateTime())) {
				average += profile.get(counterOfIndexProfile).getValue();
				counterOfIndexProfile++;
				counterOfElements++;
			}

			if (counterOfElements != 0) {
				average = average / counterOfElements;
			} else {
				// in case we have to little data available
				System.err.println(new Throwable().getStackTrace()[0]
						+ " WARNING: some data intervals is missing data! The inteval value is set to 0.0");
			}

			// The result profile has an average consumption value
			result.add(average);
		}

		return result;
	}
}
