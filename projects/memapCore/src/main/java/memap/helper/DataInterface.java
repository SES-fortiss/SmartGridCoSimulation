package memap.helper;

import java.util.ArrayList;
import java.util.Set;

public interface DataInterface {

	/** Returns an array list with Double values*/
	ArrayList<Double> getYValues(String seriesName);
	ArrayList<String> getXValues(String seriesName);
	Set<String> getSeriesList();
	
}
