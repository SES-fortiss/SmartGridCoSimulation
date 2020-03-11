package fortiss.results;

import java.util.ArrayList;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

@SuppressWarnings("serial")
public class MenuSelectionModel extends DefaultTreeSelectionModel {

	MenuSelectionModel() {
		setSelectionMode(TreeSelectionModel.DISCONTIGUOUS_TREE_SELECTION);
	}

	/**
	 * Identifies and the paths that correspond to leafs.
	 * 
	 * @param paths an array of TreePaths.
	 * @return leafPaths an array of TreePaths that correspond to leafs.
	 */
	private TreePath[] leafPaths(TreePath[] paths) {
		ArrayList<TreePath> leafPaths = new ArrayList<TreePath>();

		for (int i = 0; i < paths.length; i++) {
			if (((DefaultMutableTreeNode) paths[i].getLastPathComponent()).isLeaf()
					&& !((DefaultMutableTreeNode) paths[i].getLastPathComponent()).isRoot()) {
				leafPaths.add(paths[i]);
			}
		}

		return leafPaths.toArray(paths);
	}

	/**
	 * Sets an array of TrePaths to leafs as selection paths. Calls leafPaths.
	 * 
	 * @param paths an array of TreePaths.
	 */
	@Override
	public void setSelectionPaths(TreePath[] paths) {
		super.setSelectionPaths(leafPaths(paths));
	}

	/**
	 * Adds an array of TrePaths to leafs as selection paths. Calls leafPaths.
	 * 
	 * @param paths an array of TreePaths.
	 */
	@Override
	public void addSelectionPaths(TreePath[] paths) {
		super.addSelectionPaths(leafPaths(paths));
	}

}
