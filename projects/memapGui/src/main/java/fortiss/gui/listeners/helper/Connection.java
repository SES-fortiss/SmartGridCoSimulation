package fortiss.gui.listeners.helper;

import java.awt.geom.Line2D;

import javax.swing.JLabel;

/**
 * Represents the connection between two labels and its characteristics.
 */
public class Connection {

	/** Reference to an existing building label */
	private JLabel nodeA;
	/** Reference to an existing building label */
	private JLabel nodeB;
	/** Default length of connection */
	private static final double DEFAULT_LENGTH = 10.0;
	/** Default looses value of connection */
	private static final double DEFAULT_LOSSES = 10.0;
	/** Line between nodeA and nodeB */
	private Line2D ln;
	/** Length of connection */
	private double length;
	/** Looses of connection */
	private double losses;

	/**
	 * Constructor for class Connection.
	 * 
	 * @param nodeA a building label
	 * @param nodeB a building label
	 */
	public Connection(JLabel nodeA, JLabel nodeB) {
		setNodeA(nodeA);
		setNodeB(nodeB);
		setLn();
		setLength(DEFAULT_LENGTH);
		setLosses(DEFAULT_LOSSES);
	}

	/**
	 * Return the starting point of the connection.
	 * 
	 * @return nodeA
	 */
	public JLabel getNodeA() {
		return nodeA;
	}

	/**
	 * Set {@link Connection#nodeA} to a building label.
	 */
	public void setNodeA(JLabel nodeA) {
		this.nodeA = nodeA;
	}

	/**
	 * Return the end point of the connection.
	 * 
	 * @return nodeB
	 */
	public JLabel getNodeB() {
		return nodeB;
	}

	/**
	 * Set {@link Connection#nodeB} to a building label.
	 */
	public void setNodeB(JLabel nodeB) {
		this.nodeB = nodeB;
	}

	/**
	 * Return the length of the connection.
	 * 
	 * @return length of the connection
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Sets the length of the connection to the specified value.
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * Return the length of the connection.
	 * 
	 * @return losses of the connection
	 */
	public double getLosses() {
		return losses;
	}

	/**
	 * Sets the looses of the connection to the specified value.
	 * 
	 * @param losses looses value [units]
	 */
	public void setLosses(double losses) {
		this.losses = losses;
	}

	/**
	 * Return the line between nodeA and nodeB.
	 * 
	 * @return line between the nodes
	 */
	public Line2D getLn() {
		return ln;
	}

	/**
	 * Updates the line between nodeA and nodeB.
	 */
	public void updateLine() {
		setLn();
	}

	/**
	 * Creates a line between the position of nodeA and the position of nodeB and
	 * sets {@link Connection#ln} to it.
	 */
	public void setLn() {
		this.ln = new Line2D.Float(PositionManager.getPositionOf(nodeA), PositionManager.getPositionOf(nodeB));
	}

	/**
	 * Verifies if the input is a node of the connection
	 * 
	 * @return <code>true</code> if input is node of the connection and
	 *         <code>false</code> otherwise
	 */
	public boolean isNode(JLabel icon) {
		return nodeB.equals(icon) || nodeA.equals(icon);
	}

}
