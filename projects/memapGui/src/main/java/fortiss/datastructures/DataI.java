package fortiss.datastructures;

import java.util.ArrayList;
import java.util.Set;

public interface DataI {

	/** Returns an array list with Double values*/
	ArrayList<Double> getSeries(String seriesName);
	Set<String> getSeriesList();
	
}
