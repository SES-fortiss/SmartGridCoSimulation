package fortiss.results;

import java.util.HashMap;
import java.util.Map.Entry;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import fortiss.gui.style.Colors;
import fortiss.simulation.PlanningTool;
import memap.media.Strings;

/**
 * Populates the panels of the result overview tab
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

	/**
	 * This method create the result views. It is called only once after simulation.
	 */
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

		ReporterOverviewPanel reporterOverviewPanel = PlanningTool.getReporterOverviewPanel();
		reporterOverviewPanel.reset();
		
		// Add a summary panel
		SummaryPanel summaryPanel = new SummaryPanel();
				
		reporterOverviewPanel.addTitleToSelectionPanel("MEMAP views");	
		reporterOverviewPanel.addSubpanel(summaryPanel, "Comparison results", true);
		
		// Add general metric panels - this is just the memap result panel!
		MetricsPanel globalMetricsPanel = new MetricsPanel();
		globalMetricsPanel.setBackground(Colors.white);		
		metricsPanelMap.put(Strings.memapOnModeName, globalMetricsPanel);
		reporterOverviewPanel.addSubpanel(metricsPanelMap.get(Strings.memapOnModeName), Strings.memapOnModeName);

		// These are the building views
		reporterOverviewPanel.addEmptyCell();
		reporterOverviewPanel.addTitleToSelectionPanel("Single building views");		
		// Add one metrics panel per building
		for (Entry<String, Building> entry : DesignerPanel.buildings.entrySet()) {
			Building building = entry.getValue();
			
			MetricsPanel buildingPanel = new MetricsPanel();
			buildingPanel.setBackground(Colors.white);
			metricsPanelMap.put(building.getName(), buildingPanel);
			reporterOverviewPanel.addSubpanel(metricsPanelMap.get(building.getName()), building.getName() + " (opt.)");
		}
		
		MetricsGenerator metricsGenerator;
		
		metricsGenerator = new MetricsGenerator(getDetailedResult(), getOverviewResult());
		metricsGenerator.populateMetricsPanels(summaryPanel, metricsPanelMap);
		
		reporterOverviewPanel.showPanel("Comparison results");
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
