package fortiss.results.listeners.label;

import java.util.ArrayList;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import fortiss.results.Menu;
import fortiss.results.Reporter;

public class MenuListener implements TreeSelectionListener {

	private DefaultMutableTreeNode sel;
	private DefaultMutableTreeNode par;
	private ArrayList<ArrayList<Double>> data;
	private int seriesIndex;
	private int index;

	/**
	 * Identifies the field selected by the user in the results tree and calls
	 * plotResults. Only leafs can be selected. @see MenuSelectionModel
	 */
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		Menu h = (Menu) e.getSource();
		TreePath selPath = e.getPath();
		sel = (DefaultMutableTreeNode) e.getPath().getLastPathComponent();
		try {
			par = (DefaultMutableTreeNode) e.getPath().getParentPath().getLastPathComponent();
		} catch (Exception e1) {
			System.out.println(">> There are no results to show.");
		}
		index = getBuildingIndex();
		data = Reporter.output.getData(index).values;
		seriesIndex = Reporter.output.getData(index).labels.indexOf(sel.toString());

		if (h.isPathSelected(selPath)) {
			if (h.getSelectionCount() == 1) {
				Reporter.plotPanel.clearSeries();
			}
			Reporter.plotPanel.addSeries(getSeriesName(), data.get(seriesIndex));
			Reporter.plotPanel.paintSeries();
		} else {
			Reporter.plotPanel.removeSeries(getSeriesName(), data.get(seriesIndex));
			Reporter.plotPanel.paintSeries();
		}
	}

	/**
	 * @return the index of the building to which the selected results correspond.
	 */
	private int getBuildingIndex() {
		for (int i = 0; i < Reporter.output.size(); i++) {
			if (Reporter.output.buildingNames.get(i).equals(par.toString())) {
				return i;
			}
		}
		return 0;
	}

	/**
	 * @return a name to be assigned to a data series in the results interface.
	 */
	public String getSeriesName() {
		String name = par.toString() + " - " + Reporter.output.getData(index).labels.get(seriesIndex);
		return name;
	}

}
