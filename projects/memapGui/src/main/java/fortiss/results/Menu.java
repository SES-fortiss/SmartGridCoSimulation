package fortiss.results;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

import fortiss.gui.Designer;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import linprogMPC.TopologyConfig;

/**
 * Shows the available results
 */
@SuppressWarnings("serial")
public class Menu extends JTree {
	static int buildingCount = Designer.buildingCount;
	// private static ArrayList<String> series;

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
	Menu() {
		super(createTree(treeStructure()));
		this.setSelectionModel(new MenuSelectionModel());
		DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) this.getCellRenderer();
		setBackground(Colors.background);
		setFont(Fonts.getOpenSans());
		renderer.setTextNonSelectionColor(Colors.normal);
		renderer.setTextSelectionColor(Colors.accent2);
		renderer.setBorderSelectionColor(Color.black);
		treeStructure();
	}

	private static Object[] treeStructure() {
		Object[] structure;
		if (TopologyConfig.MEMAP_ON == true) {
			structure = memapOnStructure();
		} else {
			structure = memapOffStructure();
		}
		return structure;
	}

	/**
	 * Tree structure when Memap is off
	 */
	private static Object[] memapOffStructure() {
		Object[] structure = new Object[buildingCount + 1];
		structure[0] = "Results";
		for (int i = 1; i <= buildingCount; i++) {
			int numberOfSeries = Reporter.output.getDataSetSize(0);

			Object[] subs = new Object[numberOfSeries];
			subs[0] = Designer.buildings.get(i - 1).getName();

			for (int j = 1; j < subs.length; j++) {
				subs[j] = Reporter.output.getDataLabel(i - 1, j);
			}
			structure[i] = subs;
		}

		return structure;
	}

	/**
	 * Tree structure when Memap is on
	 */
	private static Object[] memapOnStructure() {
		int numberOfSeries = Reporter.output.getDataSetSize(0);
		Object[] structure = new Object[numberOfSeries];
		structure[0] = "Results";
		for (int j = 1; j < structure.length; j++) {
			structure[j] = Reporter.output.getDataLabel(0, j - 1);
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
	static DefaultMutableTreeNode createTree(final Object[] list) {
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
}
