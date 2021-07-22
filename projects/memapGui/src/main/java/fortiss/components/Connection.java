package fortiss.components;

import java.awt.Color;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JLabel;

import com.google.gson.annotations.Expose;

import fortiss.gui.icons.BuildingIcon;
import fortiss.simulation.helper.PositionManager;

/**
 * Represents the connection between two labels and its characteristics.
 */
public class Connection {

	/** Name of the node A. For serialization purposes ~ MEMAP gui */
	@Expose
	private String nameNodeA;
	/** Formatted name of the node A. For serialization purposes ~ MEMAP core */
	@Expose
	private String formattedNameNodeA;
	/** Name of the node B. For serialization purposes */
	@Expose
	private String nameNodeB;
	/** Formatted name of the node B. For serialization purposes ~ MEMAP core */
	@Expose
	private String formattedNameNodeB;

	/** A color to draw the line (ln) */
	private Color color;
	/** Reference to an existing building label */
	private BuildingIcon nodeA;
	/** Reference to an existing building label */
	private BuildingIcon nodeB;
	/** Default length of connection */
	private static final double DEFAULT_LENGTH = 10.0;
	/** Default looses value of connection */
	private static final double DEFAULT_LOSSES = 10;
	/** Default transport capacity of connection */
	private static final double DEFAULT_TRANSPORT_CAPACITY = 999;
	/** Line between nodeA and nodeB */
	private Line2D ln;
	/** Length of connection [m] */
	@Expose
	private double length;
	/** Looses of connection [%] */
	@Expose
	private double losses;
	/** Maximum transport capacity [kW] */
	@Expose
	private double maxTransportCapacity;

	/**
	 * Constructor for class Connection.
	 * 
	 * @param nodeA a building label
	 * @param nodeB a building label
	 */
	public Connection(BuildingIcon nodeA, BuildingIcon nodeB) {
		setNodeA(nodeA);
		setNameNodeA(nodeA.getBuilding().getName());
		setFormattedNameNodeA(nodeA.getBuilding().getFormattedName());
		setNodeB(nodeB);
		setNameNodeB(nodeB.getBuilding().getName());
		setFormattedNameNodeB(nodeB.getBuilding().getFormattedName());
		setColor();
		setLn();
		setLength(DEFAULT_LENGTH);
		setLosses(DEFAULT_LOSSES);
		setMaxTransportCapacity(DEFAULT_TRANSPORT_CAPACITY);
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
		return losses * 100;
	}

	/**
	 * Sets the looses of the connection to the specified value.
	 * 
	 * @param losses looses value [units]
	 */
	public void setLosses(double losses) {
		this.losses = losses / 100;
	}

	public double getMaxTransportCapacity() {
		return maxTransportCapacity;
	}

	public void setMaxTransportCapacity(double maxTransportCapacity) {
		this.maxTransportCapacity = maxTransportCapacity;
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
		ln = new Line2D.Double(nodeA.getCentralPosition(), nodeB.getCentralPosition());
	}

	/**
	 * @return the name of node A
	 */
	public String getNameNodeA() {
		return nameNodeA;
	}

	/**
	 * Set the name of node A
	 * 
	 * @param nameNodeA
	 */
	public void setNameNodeA(String nameNodeA) {
		this.nameNodeA = nameNodeA;
	}

	/**
	 * @return the formatted name of node A
	 */
	public String getFormattedNameNodeA() {
		return formattedNameNodeA;
	}

	public void setFormattedNameNodeA(String formattedNameNodeA) {
		this.formattedNameNodeA = formattedNameNodeA;
	}

	/**
	 * @return the name of node B
	 */
	public String getNameNodeB() {
		return nameNodeB;
	}

	/**
	 * Set the name of node B
	 * 
	 * @param nameNodeB
	 */
	public void setNameNodeB(String nameNodeB) {
		this.nameNodeB = nameNodeB;
	}

	/**
	 * @return the formatted name of node B
	 */
	public String getFormattedNameNodeB() {
		return formattedNameNodeB;
	}

	public void setFormattedNameNodeB(String formattedNameNodeB) {
		this.formattedNameNodeB = formattedNameNodeB;
	}

	/**
	 * Set a random color to {@link #color}
	 */
	public void setColor() {
		Random rand = new Random();
		float r = rand.nextFloat() / 2f;
		float g = rand.nextFloat();
		float b = rand.nextFloat() / 2f;
		
		Color randomColor = new Color(r, g, b);
		color = randomColor;
	}

	/**
	 * @return the color used to draw a connection
	 */
	public Color getColor() {
		return color;
	}

	public void updateBuildingsName() {
		setNameNodeA(nodeA.getBuilding().getName());
		setFormattedNameNodeA(nodeA.getBuilding().getFormattedName());
		setNameNodeB(nodeB.getBuilding().getName());
		setFormattedNameNodeB(nodeB.getBuilding().getFormattedName());
	}

}
