package fortiss.components;

import java.awt.Color;
import java.awt.geom.Line2D;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JLabel;

import com.google.gson.annotations.Expose;

import fortiss.gui.BuildingIcon;
import fortiss.simulation.helper.PositionManager;

/**
 * Represents the connection between two labels and its characteristics.
 */
public class Connection {

	/** Name of the node A. For serialization purposes */
	@Expose
	private String nameNodeA;
	/** Name of the node B. For serialization purposes */
	@Expose
	private String nameNodeB;

	/** A color to draw the line (ln) */
	private Color color;
	/** Reference to an existing building label */
	private BuildingIcon nodeA;
	/** Reference to an existing building label */
	private BuildingIcon nodeB;
	/** Default length of connection */
	private static final double DEFAULT_LENGTH = 10.0;
	/** Default looses value of connection */
	private static final double DEFAULT_LOSSES = 0.1;
	/** Line between nodeA and nodeB */
	private Line2D ln;
	/** Length of connection [m] */
	@Expose
	private double length;
	/** Looses of connection [%] */
	@Expose
	private double losses;

	/**
	 * Constructor for class Connection.
	 * 
	 * @param nodeA a building label
	 * @param nodeB a building label
	 */
	public Connection(BuildingIcon nodeA, BuildingIcon nodeB) {
		setNodeA(nodeA);
		setNameNodeA(nodeA.getText());
		setNodeB(nodeB);
		setNameNodeB(nodeB.getText());
		setColor();
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
	public void setNodeA(BuildingIcon nodeA) {
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
	public void setNodeB(BuildingIcon nodeB) {
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
	 * sets {@link Connection#ln} to it. The instance of {@link PositionManager}
	 * must be retrieved within the method in order to allow for correct
	 * deserialization
	 */
	public void setLn() {
		PositionManager pm = PositionManager.getInstance();
		this.ln = new Line2D.Float(pm.getPositionOf(nameNodeA), pm.getPositionOf(nameNodeB));
	}

	/**
	 * @return the name of node A
	 */
	public String getNameNodeA() {
		return nameNodeA;
	}

	/**
	 * Set the name of node A
	 * @param nameNodeA
	 */
	public void setNameNodeA(String nameNodeA) {
		this.nameNodeA = nameNodeA;
	}

	/**
	 * @return the name of node B
	 */
	public String getNameNodeB() {
		return nameNodeB;
	}

	/**
	 * Set the name of node B
	 * @param nameNodeB
	 */
	public void setNameNodeB(String nameNodeB) {
		this.nameNodeB = nameNodeB;
	}
	
	/**
	 * Set a random color to {@link #color}
	 */
	public void setColor() {

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
		this.color = randomColor;
	}

	/**
	 * @return the color used to draw a connection
	 */
	public Color getColor() {
		return color;
	}

}
