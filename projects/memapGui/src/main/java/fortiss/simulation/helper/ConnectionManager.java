package fortiss.simulation.helper;

import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.JLabel;

import com.google.gson.annotations.Expose;

import fortiss.components.Connection;
import fortiss.gui.DesignerPanel;
import fortiss.gui.icons.BuildingIcon;
import fortiss.simulation.PlanningTool;

/**
 * Manager of connections between building icons/labels
 */
public class ConnectionManager {

	private final static transient ConnectionManager cm = new ConnectionManager();

	/** Total number of connections in the topology */
	private int connectionNumber = 0;
	/** List of connections in the topology */
	@Expose
	private ArrayList<Connection> connectionList = new ArrayList<Connection>();

	/**
	 * @return ConnectionManager instance
	 */
	public static ConnectionManager getInstance() {
		return cm;
	}

	/**
	 * Add a non-existing connection between two buildings to
	 * {@value ConnectionManager#connectionList}. Increases the value of
	 * {@value ConnectionManager#connectionNumber}. Call
	 * {@link ConnectionManager#isConnection(BuildingIcon, BuildingIcon)}.
	 */
	public void addConnection(BuildingIcon nodeA, BuildingIcon nodeB) {
		if (!isConnection(nodeA, nodeB)) {
			Connection c = new Connection(nodeA, nodeB);
			getConnectionList().add(c);
			setConnectionNumber(getConnectionNumber() + 1);
		}
	}

	/**
	 * Check if a connection already exist
	 * 
	 * @param nodeA
	 * @param nodeB
	 * @return <code>true</code> if a connection between nodeA and nodeB exist, and
	 *         <code>false</code> otherwise
	 */
	private boolean isConnection(JLabel nodeA, JLabel nodeB) {
		boolean connectionExist = false;
		for (Connection c : getConnectionList()) {
			if (c.getNodeA().equals(nodeA) && c.getNodeB().equals(nodeB)
					|| c.getNodeA().equals(nodeB) && c.getNodeB().equals(nodeA)) {
				connectionExist = true;
			}
		}
		return connectionExist;
	}

	/**
	 * Removes all the connections between node and other nodes in the connections
	 * list. Calls {@link ConnectionManager#updateLines()}
	 * 
	 * @param buildingName the name of a building
	 */
	public void removeConnectionsOf(String buildingName) {
		ArrayList<Connection> rm = new ArrayList<Connection>();
		ArrayList<Line2D> rm2 = new ArrayList<Line2D>();
		for (Connection c : getConnectionList()) {
			if (c.getNameNodeA().contentEquals(buildingName) || c.getNameNodeB().contentEquals(buildingName)) {
				rm2.add(c.getLn());
				rm.add(c);
				setConnectionNumber(getConnectionNumber() - 1);
			}
		}
		getConnectionList().removeAll(rm);
	}

	/**
	 * Removes the connection between two buildings from the structure. Decreases
	 * the value of {@value #connectionNumber}.
	 * 
	 * @param nodeA a building label
	 * @param nodeB a building label (different from nodeA)
	 */
	public void removeConnection(Connection connection) {
		if (getConnectionList().contains(connection)) {
			getConnectionList().remove(connection);
			setConnectionNumber(getConnectionNumber() - 1);
			DesignerPanel.pl_ems.repaint();
			PlanningTool.getInstance().setSaved(false);
		}
	}

	/**
	 * Clears {@value ConnectionManager#connectionList},
	 * {@value ConnectionManager#lines} and the
	 * {@value ConnectionManager#lineColors}. Sets
	 * {@value ConnectionManager#connectionNumber} to zero.
	 */
	public void resetConnections() {
		getConnectionList().clear();
		setConnectionNumber(0);
	}

	/**
	 * Updates the line of every connection in
	 * {@link ConnectionManager#connectionList}
	 */
	public void updateLines() {
		for (Connection c : getConnectionList()) {
			c.updateLine();
		}
		DesignerPanel.pl_ems.repaint();
	}

	/**
	 * @param hashCode the hashCode of a connection
	 * @return c the connection that corresponds to the hashCode, or null.
	 */
	public Connection getConnection(int hashCode) {
		for (Connection c : getConnectionList()) {
			if (c.hashCode() == hashCode) {
				return c;
			}
		}
		return null;
	}

	/**
	 * @return the number of connections
	 */
	public int getConnectionNumber() {
		return connectionNumber;
	}

	/**
	 * {@link #connectionNumber} is not to be modified from outside the class. This
	 * parameter is automatically updated when a new connection is added and when
	 * the list of connections is set
	 */
	private void setConnectionNumber(int connectionNumber) {
		this.connectionNumber = connectionNumber;
	}

	/**
	 * @return the list of connections between buildings
	 */
	public ArrayList<Connection> getConnectionList() {
		return connectionList;
	}

	/**
	 * Set the connection list, updates the number of connections, and set the node
	 * icons. Intended for deserialization, only.
	 */
	public void setConnectionList(ArrayList<Connection> connectionList) {
		this.connectionList = connectionList;
		this.connectionNumber = connectionList.size();
	}

	public ArrayList<Connection> getConnectionsOf(String buildingName) {
		ArrayList<Connection> connections = new ArrayList<Connection>();
		for (Connection c : getConnectionList()) {
			if (c.getNameNodeA().equals(buildingName) || c.getNameNodeB().equals(buildingName)) {
				connections.add(c);
			}
		}
		return connections;
	}

	/**
	 * Update the name of a building
	 * 
	 * @param oldName
	 */
	public void updateBuildingsName(String oldName) {
		for (Connection c : getConnectionsOf(oldName)) {
			c.updateBuildingsName();
		}
	}

}
