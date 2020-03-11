package fortiss.results.listeners.label;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import fortiss.results.Menu;
import fortiss.results.ReporterPanel;

public class MenuListener implements TreeSelectionListener {

	int previouslySelected = 0;

	/**
	 * Identifies the field selected by the user in the results tree and calls
	 * plotResults. Only leafs can be selected. @see MenuSelectionModel
	 */
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		Menu h = (Menu) e.getSource();
		
		// Clicked: selected or deselected path (does not apply for re-selected components)
		TreePath clickedPath = e.getPath();
		// Selected: Equals to clicked only for selected components
		TreePath selectedPath = e.getNewLeadSelectionPath();

		if (selectedPath == null) {
			ReporterPanel.plotPanel.clearSeries();
			return;
		}

		String clicked = ((DefaultMutableTreeNode) clickedPath.getLastPathComponent()).toString();
		int currentlySelected = h.getSelectionPaths().length;

		if (currentlySelected > previouslySelected) {
			// We are adding a series
			String parent = getParent(clickedPath);
			ReporterPanel.plotPanel.addSeries(getSeriesName(parent, clicked),
					ReporterPanel.output.getDataSeries(parent, clicked));
			ReporterPanel.plotPanel.paintSeries();
		} else if (currentlySelected < previouslySelected && currentlySelected > 1) {
			// We are deselecting a series (first condition)
			// or we are re-selecting one of the series that was previously selected (!second
			// condition, goes to else)
			String parent = getParent(clickedPath);
			ReporterPanel.plotPanel.removeSeries(getSeriesName(parent, clicked));
			ReporterPanel.plotPanel.paintSeries();
		} else {
			// We are changing one series for another or re-selecting
			clicked = ((DefaultMutableTreeNode) selectedPath.getLastPathComponent()).toString();
			String parent = getParent(selectedPath);
			ReporterPanel.plotPanel.clearSeries();
			ReporterPanel.plotPanel.addSeries(getSeriesName(parent, clicked),
					ReporterPanel.output.getDataSeries(getParent(selectedPath), clicked.toString()));
			ReporterPanel.plotPanel.paintSeries();
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
			System.out.println(">> There are no results to show.");
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
