package fortiss.results.listeners.label;

import java.util.ArrayList;

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
		
		Menu h = (Menu) e.getSource();
		
		// Clicked: selected or deselected path (does not apply for re-selected components)
		TreePath clickedPath = e.getPath();
		// Selected: Equals to clicked only for selected components
		TreePath selectedPath = e.getNewLeadSelectionPath();

		if (selectedPath == null) {
			reporterPanel.plotPanel.clearSeries();
			return;
		}

		String clicked = ((DefaultMutableTreeNode) clickedPath.getLastPathComponent()).toString();
		int currentlySelected = h.getSelectionPaths().length;
		
		ArrayList<Double> timeSteps = detailedResult.getDataSeries(getParent(clickedPath), "Time step");
		
		ArrayList<String> timeStepsString = new ArrayList<>();
		
		for (Double value : timeSteps) {
			timeStepsString.add(""+value);
		}

		if (currentlySelected > previouslySelected) {
			// We are adding a series
			String parent = getParent(clickedPath);
			reporterPanel.plotPanel.addSeries(
					getSeriesName(parent, clicked),
					timeStepsString, 
					detailedResult.getDataSeries(parent, clicked));
		} else if (currentlySelected < previouslySelected && currentlySelected > 1) {
			// We are deselecting a series (first condition)
			// or we are re-selecting one of the series that was previously selected (!second
			// condition, goes to else)
			String parent = getParent(clickedPath);
			reporterPanel.plotPanel.removeSeries(getSeriesName(parent, clicked));
		} else {
			// We are changing one series for another or re-selecting
			clicked = ((DefaultMutableTreeNode) selectedPath.getLastPathComponent()).toString();
			String parent = getParent(selectedPath);
			reporterPanel.plotPanel.clearSeries();
			reporterPanel.plotPanel.addSeries(
					getSeriesName(parent, clicked),
					timeStepsString,
					detailedResult.getDataSeries(getParent(selectedPath), clicked.toString()));
		}

		previouslySelected = currentlySelected;
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
