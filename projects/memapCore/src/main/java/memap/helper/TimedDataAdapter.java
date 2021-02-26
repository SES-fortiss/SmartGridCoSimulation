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
	public ArrayList<Double> getSeries(String seriesName) {
		ArrayList<Double> series = new ArrayList<Double>();
		for(TimeDataPoint point : timedData.get(seriesName)) {
			series.add(point.getValue());
		}
		return series;
	}

	@Override
	public Set<String> getSeriesList() {
		return timedData.keySet();
	}
}
