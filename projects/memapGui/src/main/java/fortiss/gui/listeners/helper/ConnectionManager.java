package fortiss.gui.listeners.helper;

import java.awt.Color;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JLabel;

/**
 * Manager of connections between building icons/labels
 */
public abstract class ConnectionManager {

	/** Total number of connections in the topology */
	public static int connectionNumber = 0;
	/** List of color lines. As many as connections */
	public static ArrayList<Color> lineColors = new ArrayList<>();
	/** List of lines in the topology */
	public static ArrayList<Line2D> lines = new ArrayList<Line2D>();
	/** List of connections in the topology */
	public static ArrayList<Connection> cl = new ArrayList<Connection>();

	/**
	 * Add a connection between two buildings to {@value ConnectionManager#cl}.
	 * Increases the value of {@value ConnectionManager#connectionNumber}
	 */
	public static void addConnection(JLabel nodeA, JLabel nodeB) {
		Connection c = new Connection(nodeA, nodeB);
		cl.add(c);
		addColor();
		lines.add(c.getLn());
		connectionNumber++;
	}

	/**
	 * Removes all the connections between node and other nodes in the connections
	 * list. Calls {@link ConnectionManager#updateLines()}
	 */
	public static void removeConnectionsOf(JLabel node) {
		ArrayList<Connection> rm = new ArrayList<Connection>();
		for (Connection c : cl) {
			if (c.isNode(node)) {
				rm.add(c);
				connectionNumber -= 1;
			}
		}
		cl.removeAll(rm);
	}

	/**
	 * Clears {@value ConnectionManager#cl}, {@value ConnectionManager#lines} and
	 * the {@value ConnectionManager#lineColors}. Sets
	 * {@value ConnectionManager#connectionNumber} to zero.
	 */
	public static void resetConnections() {
		/* nodes.clear(); */
		cl.clear();
		lines.clear();
		lineColors.clear();
		connectionNumber = 0;
	}

	/**
	 * Removes the connection between two buildings from the structure. Decreases
	 * the value of {@value #connectionNumber}.
	 * 
	 * @param nodeA a building label
	 * @param nodeB a building label (different from nodeA)
	 */
	public static void removeConnection(JLabel nodeA, JLabel nodeB) {
		cl.remove(getConnection(nodeA, nodeB));
		connectionNumber--;
	}

	/**
	 * Updates the line of every connection in {@link ConnectionManager#cl}
	 */
	public static void updateLines() {
		ArrayList<Line2D> newLines = new ArrayList<Line2D>();
		for (Connection c : cl) {
			c.updateLine();
			newLines.add(c.getLn());
		}
		lines = newLines;
	}

	/**
	 * Adds a random color to {@value #lineColors}
	 */
	private static void addColor() {

		int decision = (int) Math.round(Math.random());
		int g = ThreadLocalRandom.current().nextInt(27, 247 + 1);
		int r = 0;
		int b = 0;
		if (decision == 0) {
			r = 27;
			b = 247;
		} else {
			r = 247;
			b = 27;
		}

		Color randomColor = new Color(r, g, b);
		lineColors.add(randomColor);
	}

	/**
	 * Removes colors from {@value #lineColors}
	 * 
	 * @param nErase number of colors to be removed
	 */
	public static void removeColor(int nErase) {
		for (int i = 0; i < nErase; i++) {
			lineColors.remove(lineColors.size() - 1);
		}
	}

	/**
	 * Returns the connection between the specified nodes
	 * 
	 * @return c the connection between nodeA and NodeB, or null.
	 */
	public static Connection getConnection(JLabel nodeA, JLabel nodeB) {
		for (Connection c : cl) {
			if (c.isNode(nodeA) && c.isNode(nodeB)) {
				return c;
			}
		}
		return null;
	}
}
