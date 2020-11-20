/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.util;

import java.util.Enumeration;

import javax.swing.JTree;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

/**
 * 
 * @author murphy
 *
 */
public class TreeUtils {

	/**
	 * Expand or collapse all nodes
	 * 
	 * @param tree
	 * @param expand
	 */
	static public void expandAll(JTree tree, boolean expand) {
		TreeNode root = (TreeNode) tree.getModel().getRoot();
		expandAll(tree, new TreePath(root), expand);
	}

	/**
	 * Expand all tree nodes
	 * 
	 * @param tree
	 *            subject tree
	 * @param parent
	 *            parent tree path
	 * @param expand
	 *            expand or collapse
	 */
	static private void expandAll(JTree tree, TreePath parent, boolean expand) {
		TreeNode node = (TreeNode) parent.getLastPathComponent();
		if (node.getChildCount() >= 0) {
			for (Enumeration<? extends TreeNode> e = node.children(); e.hasMoreElements();) {
				TreeNode treeNode = (TreeNode) e.nextElement();
				TreePath path = parent.pathByAddingChild(treeNode);
				expandAll(tree, path, expand);
			}
		}
		// Expansion or collapse must be done bottom-up
		if (expand) {
			tree.expandPath(parent);
		} else {
			tree.collapsePath(parent);
		}
	}

}
