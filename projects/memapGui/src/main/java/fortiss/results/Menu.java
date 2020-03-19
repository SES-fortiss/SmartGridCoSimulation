package fortiss.results;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;

import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;

/**
 * Shows the available results
 */
@SuppressWarnings("serial")
public class Menu extends JTree {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Colors.background);
		setForeground(Colors.normal);
	}

	/**
	 * Constructor for the class Menu. Calls JTree constructor. Modifies color
	 * properties.
	 */
	Menu(Output output) {
		setSelectionModel(new MenuSelectionModel());
		populateMenu(output); // with empty list
		DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) this.getCellRenderer();
		setBackground(Colors.background);
		setFont(Fonts.getOpenSans());
		renderer.setTextNonSelectionColor(Colors.normal);
		renderer.setTextSelectionColor(Colors.accent2);
		renderer.setBorderSelectionColor(Color.black);
	}

	/**
	 * @return the treeStructure for a given data
	 */
	private Object[] getTreeStructure(Output output) {
		Object[] structure = new Object[output.getNumOfDatasets() + 1];
		structure[0] = "Results";

		int i = 1;
		for (String building : output.getResultList()) {
			int numberOfSeries = output.getDatasetSize(building);

			Object[] subs = new Object[numberOfSeries];
			subs[0] = building;

			int j = 1;
			for (String key : output.getSeriesList(building)) {
				if (!key.equals("Time step")) {
					subs[j] = key;
					j++;
				}
			}
			structure[i] = subs;
			i++;
		}

		return structure;
	}

	/**
	 * Creates a DefaultMutableTreeNode hierarchy using an array of Objects as
	 * input.
	 * 
	 * @param Object [] The hierarchy of the tree.
	 * @return A DefaultMutableTreeNode
	 */
	private DefaultMutableTreeNode createTree(final Object[] list) {

		final DefaultMutableTreeNode node = new DefaultMutableTreeNode(list[0]);
		DefaultMutableTreeNode child;
		for (int i = 1; i < list.length; i++) {
			Object item = list[i];

			if (item instanceof Object[]) {
				child = createTree((Object[]) item);
			} else {
				child = new DefaultMutableTreeNode(item);
			}
			node.add(child);
		}
		return (node);
	}

	/**
	 * Populates the menu with results
	 * 
	 * @param output set of results
	 */
	public void populateMenu(Output output) {
		final Object[] list = getTreeStructure(output);
		setModel(new DefaultTreeModel(createTree(list)));
	}

}
