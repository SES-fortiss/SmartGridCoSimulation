package memap.helper;

import java.io.IOException;

public interface MetricsHandler {


	void calculateOverviewMetrics(String filename)
			throws IOException;
	
	void initializeMetrics(int nrIterations, int nrContributors);

	void saveOverviewMetrics(String filename) throws IOException;

}
