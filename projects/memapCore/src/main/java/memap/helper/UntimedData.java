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
	public ArrayList<Double> getYValues(String seriesName) {
		return dataset.get(seriesName);
	}
	
	@Override
	public ArrayList<String> getXValues(String seriesName) {
		ArrayList<String> xValues = new ArrayList<String>();
		int size = dataset.get(seriesName).size();
		for(int i = 0; i < size; i++) {
			xValues.add("T" + String.valueOf(i));
		}
		return xValues;
	}

	@Override
	public Set<String> getSeriesList() {
		return dataset.keySet();
	}

}
