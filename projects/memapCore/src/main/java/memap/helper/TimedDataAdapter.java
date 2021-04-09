package memap.helper;

import java.util.ArrayList;
import java.util.Set;

import memap.helper.profilehandler.TimeDataPoint;
import memap.helper.profilehandler.TimedData;

/**
 * Implements the adapter pattern for TimedData 
 */
public class TimedDataAdapter implements DataInterface {
	
	private TimedData timedData;
	
	public TimedDataAdapter(TimedData timedData) {
		this.timedData = timedData;
	}

	@Override
	public ArrayList<Double> getYValues(String seriesName) {
		ArrayList<Double> series = new ArrayList<Double>();
		for(TimeDataPoint point : timedData.get(seriesName)) {
			series.add(point.getValue());
		}
		return series;
	}
	
	@Override
	public ArrayList<String> getXValues(String seriesName) {
		ArrayList<String> series = new ArrayList<String>();
		for(TimeDataPoint point : timedData.get(seriesName)) {
			series.add(point.getDateTime().toString());
		}
		return series;
	}

	@Override
	public Set<String> getSeriesList() {
		return timedData.keySet();
	}
}
