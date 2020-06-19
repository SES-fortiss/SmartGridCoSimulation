package fortiss.results;

import java.util.HashMap;

public interface MetricsGenerator {

	/**
	 * Populates the metrics panels
	 */
	public void populateMetricsPanels(SummaryPanel summaryPanel, HashMap<String, MetricsPanel> metricsPanelMap);

}
