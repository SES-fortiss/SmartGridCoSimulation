package memap.helper;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UntimedData implements DataInterface {

	private Map<String, ArrayList<Double>> dataset;
	
	public UntimedData() {
		dataset = new LinkedHashMap<String, ArrayList<Double>>();
	}
	
	public void addSeries(String seriesName, ArrayList<Double> series){
		dataset.put(seriesName, series);
	}
	
	public void removeSeries(String seriesName){
		dataset.remove(seriesName);
	}
	
	@Override
	public ArrayList<Double> getSeries(String seriesName) {
		return dataset.get(seriesName);
	}

	@Override
	public Set<String> getSeriesList() {
		return dataset.keySet();
	}

}
