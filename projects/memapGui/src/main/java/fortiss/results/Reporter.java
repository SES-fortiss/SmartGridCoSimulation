package fortiss.results;

import java.util.HashMap;
import java.util.Map.Entry;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import fortiss.simulation.PlanningTool;

/**
 * Populates the result panels
 */
public class Reporter {

	private ResultsLibrary detailedResult;
	private ResultsLibrary overviewResult;
	/** Maps the metrics panels to their name */
	private HashMap<String, MetricsPanel> metricsPanelMap = new HashMap<String, MetricsPanel>();

	

	/**
	 * Create the application.
	 */
	public Reporter() {
		setDetailedResult(new DetailedResults());
		setOverviewResult(new OverviewResults());
	}

	public void showResults() {
		showDetailedResults();
		showOverviewResults();
	}
	
	private void showDetailedResults() {
		getDetailedResult().load();
		PlanningTool.getReporterPanel().populateMenu(getDetailedResult());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void showOverviewResults() {
		getOverviewResult().load();

		ReporterOverviewPanel overviewPanel = PlanningTool.getReporterOverviewPanel();
		overviewPanel.reset();

		// Add one summary panel
		SummaryPanel summaryPanel = new SummaryPanel();
		overviewPanel.addSubpanel(summaryPanel, "Summary");
		
		// Add one general metrics panel
		MetricsPanel globalMetricsPanel = new MetricsPanel();
		metricsPanelMap.put("Global optimization", globalMetricsPanel);
		overviewPanel.addSubpanel(metricsPanelMap.get("Global optimization"), "Optimization with MEMAP");

		// Add one metrics panel per building
		for (Entry<String, Building> entry : DesignerPanel.buildings.entrySet()) {
			Building building = entry.getValue();
			metricsPanelMap.put(building.getName(), new MetricsPanel());
			overviewPanel.addSubpanel(metricsPanelMap.get(building.getName()), "Optimization without MEMAP - " + building.getName());
		}
		
		MetricsGenerator metricsGenerator;
		if (DesignerPanel.parameterPanel.pars.getOptimizer().equals("lp")) {
			metricsGenerator = new LPMetricsGenerator(getDetailedResult(), getOverviewResult());
		} else {
			metricsGenerator = new MILPMetricsGenerator(getDetailedResult(), getOverviewResult());
		} 
		
		metricsGenerator.populateMetricsPanels(summaryPanel, metricsPanelMap);
	}

	/**
	 * @return the detailed results library
	 */
	public ResultsLibrary getDetailedResult() {
		return detailedResult;
	}

	/**
	 * Set the detailed results library
	 */
	public void setDetailedResult(ResultsLibrary detailedResult) {
		this.detailedResult = detailedResult;
	}

	/**
	 * @return the overview results library
	 */
	public ResultsLibrary getOverviewResult() {
		return overviewResult;
	}

	/**
	 * Set the overview results library
	 */
	public void setOverviewResult(ResultsLibrary overviewResult) {
		this.overviewResult = overviewResult;
	}

}
