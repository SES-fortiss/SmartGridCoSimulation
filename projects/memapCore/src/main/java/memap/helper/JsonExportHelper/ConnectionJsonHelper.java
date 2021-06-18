package memap.helper.JsonExportHelper;

import com.google.gson.annotations.Expose;
import memap.messages.planning.ConnectionMessage;

/**
 * Represents the connection between two labels and its characteristics.
 */
public class ConnectionJsonHelper {

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

//	/** A color to draw the line (ln) */
//	private Color color;
//	/** Reference to an existing building label */
//	private BuildingIcon nodeA;
//	/** Reference to an existing building label */
//	private BuildingIcon nodeB;
//	/** Default length of connection */
//	private static final double DEFAULT_LENGTH = 10.0;
//	/** Default looses value of connection */
//	private static final double DEFAULT_LOSSES = 10;
//	/** Default transport capacity of connection */
//	private static final double DEFAULT_TRANSPORT_CAPACITY = 999;
//	/** Line between nodeA and nodeB */
//	private Line2D ln;
//	/** Length of connection [m] */
	@Expose
	private double length;
	/** Looses of connection [%] */
	@Expose
	private double losses;
	/** Maximum transport capacity [kW] */
	@Expose
	private double maxTransportCapacity;


	public ConnectionJsonHelper(ConnectionMessage connectionMessage) {
		setNameNodeA(connectionMessage.connectedBuildingFrom);
		setFormattedNameNodeA(nameNodeA);
		setNameNodeB(connectionMessage.connectedBuildingTo);
		setFormattedNameNodeB(nameNodeB);
//		setColor();
//		setLn();
		setLength(connectionMessage.pipeLengthInMeter);
		setLosses(connectionMessage.losses);
		setMaxTransportCapacity(connectionMessage.maxPower);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLosses() {
		return losses * 100;
	}

	public void setLosses(double losses) {
		this.losses = losses / 100;
	}

	public double getMaxTransportCapacity() {
		return maxTransportCapacity;
	}

	public void setMaxTransportCapacity(double maxTransportCapacity) {
		this.maxTransportCapacity = maxTransportCapacity;
	}

//	/**
//	 * Updates the line between nodeA and nodeB.
//	 */
//	public void updateLine() {
//		setLn();
//	}
//
//	/**
//	 * Creates a line between the position of nodeA and the position of nodeB and
//	 * sets {@link Connection#ln} to it. The instance of {@link PositionManager}
//	 * must be retrieved within the method in order to allow for correct
//	 * deserialization
//	 */
//	public void setLn() {
//		ln = new Line2D.Float(nodeA.getPosition(), nodeB.getPosition());
//	}

	public String getNameNodeA() {
		return nameNodeA;
	}

	public void setNameNodeA(String nameNodeA) {
		this.nameNodeA = nameNodeA;
	}

	public String getFormattedNameNodeA() {
		return formattedNameNodeA;
	}

	public void setFormattedNameNodeA(String NameNodeA) {
		this.formattedNameNodeA = formatName(NameNodeA);
	}

	public String getNameNodeB() {
		return nameNodeB;
	}

	public void setNameNodeB(String nameNodeB) {
		this.nameNodeB = nameNodeB;
	}

	public String getFormattedNameNodeB() {
		return formattedNameNodeB;
	}

	public void setFormattedNameNodeB(String NameNodeB) {
		this.formattedNameNodeB = formatName(NameNodeB);
	}

	public String formatName(String name) {
		String formattedName = name.replace("Ä", "Ae").replace("Ö", "Oe").replace("Ü", "Ue").replace("ä", "ae")
				.replace("ö", "oe").replace("ü", "ue").replace("ß", "ss");
		return formattedName;
	}
}
