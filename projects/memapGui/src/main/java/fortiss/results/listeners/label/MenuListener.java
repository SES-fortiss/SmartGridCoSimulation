package fortiss.results.listeners.label;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import fortiss.results.Menu;
import fortiss.results.Reporter;
import fortiss.results.ReporterDetailedResultPanel;
import fortiss.results.ResultsLibrary;
import fortiss.simulation.PlanningTool;
import fortiss.simulation.helper.Logger;

public class MenuListener implements TreeSelectionListener {

	/** A reference to the reporter */
	Reporter reporter;
	/** A reference to the reporter panel */
	ReporterDetailedResultPanel reporterPanel;
	
	int previouslySelected = 0;
	
	Set<String> selectedSeriesCurrent;
	Set<String> selectedSeriesOld;
	
	/**
	 * Identifies the field selected by the user in the results tree and calls
	 * plotResults. Only leafs can be selected. @see MenuSelectionModel
	 */
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		
		PlanningTool planningTool = PlanningTool.getInstance();
		reporter = planningTool.getReporter();
		
		ResultsLibrary detailedResult = reporter.getDetailedResult();
		reporterPanel = planningTool.getReporterPanel();
		
		reporterPanel.plotPanel.clearSeries();
		
		Menu menu = (Menu) e.getSource();
		selectedSeriesCurrent = new HashSet<String>();
		
		if (menu.getSelectionPaths() == null) {
			reporterPanel.plotPanel.addEmptySeries();
			return;
		}
		
		for (int i = 0; i < menu.getSelectionPaths().length; i++) {
			
			TreePath clickedPath = menu.getSelectionPaths()[i];
			String parent = getParent(clickedPath);
			String clicked = ((DefaultMutableTreeNode) clickedPath.getLastPathComponent()).toString();
			
			// TimeStep Strings for the xAxis
			ArrayList<Double> timeSteps = detailedResult.getDataSeries(getParent(clickedPath), "Time step");		
			ArrayList<String> timeStepsString = new ArrayList<>();		
				for (Double value : timeSteps) {
					timeStepsString.add(""+value);
				}
			
			String clickedItem = menu.getSelectionPaths()[i].toString();
			selectedSeriesCurrent.add(clickedItem);			
			reporterPanel.plotPanel.addSeries(
					getSeriesName(parent, clicked),
					timeStepsString, 
					detailedResult.getDataSeries(parent, clicked));
		}
	}
	
	/**
	 * @param child a child node
	 * @return the name of the parent node for a given node
	 */
	private String getParent(TreePath child) {
		String parent = null;
		try {
			parent = ((DefaultMutableTreeNode) child.getParentPath().getLastPathComponent()).toString();
		} catch (Exception e1) {
			Logger.getInstance().writeInfo("There are no results to show.");
		}
		return parent;
	}

	/**
	 * @param parent the name of the parent node
	 * @param child  the name of the child node
	 * @return a name to be assigned to a data series in the results window
	 */
	public String getSeriesName(String parent, String child) {
		String name = parent + " - " + child;
		return name;
	}

}
