package fortiss.gui.listeners.line;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.SwingUtilities;

import fortiss.components.Connection;
import fortiss.gui.ConnectionPropertiesPanel;
import fortiss.gui.DesignerPanel;
import fortiss.simulation.helper.ConnectionManager;

public class LineListener extends MouseAdapter {

	private ConnectionPropertiesPanel connectionPropertiesPanel;
	private Popup popup;

	@Override
	public void mouseClicked(MouseEvent e) {
		Point clickLocation = e.getPoint();
		Point screenLocation = e.getLocationOnScreen();

		// requires double click
		if (SwingUtilities.isLeftMouseButton(e) && e.getClickCount() == 2) {
			
			Line2D clickedLine = getClickedLine(clickLocation);
			
			if (clickedLine != null) {				
				createPopUp(screenLocation, clickedLine);
				popup.show();
			}			
		}
		else {
			if (popup != null) {
				popup.hide();
			}
		}
	}

	/**
	 * @param clickLocation location clicked in the coordinates of the source object
	 *                      (panel)
	 * @return the line that was clicked by the user or null
	 */
	private Line2D getClickedLine(Point clickLocation) {
		Line2D clickedLine = null;
		
		ConnectionManager cm = ConnectionManager.getInstance();
		for (Line2D line : cm.getLines()) {
			
			if (line.intersects(clickLocation.getX() - 2, clickLocation.getY() - 2, 4, 4)) {
				clickedLine = line;
				break;
			}
		}
		

		
		
		return clickedLine;
	}

	/**
	 * @param screenLocation location clicked in the coordinates of the screen
	 * @param clickedLine
	 */
	private void createPopUp(Point screenLocation, Line2D clickedLine) {
		// Hide other opened pop-ups
		if (popup != null)
			popup.hide();

		Connection clickedConnection = getClickedConnection(clickedLine);

		PopupFactory pf = PopupFactory.getSharedInstance();
		connectionPropertiesPanel = new ConnectionPropertiesPanel(clickedConnection);
		popup = pf.getPopup(DesignerPanel.pl_ems, connectionPropertiesPanel, screenLocation.x, screenLocation.y);
		// Important! to close pop-up when connection is eliminated
		connectionPropertiesPanel.setPopup(popup);
	}

	/**
	 * @param clickedLine a line
	 * @return the corresponding connection to clickedLine
	 */
	private Connection getClickedConnection(Line2D clickedLine) {
		ConnectionManager cm = ConnectionManager.getInstance();
		Connection clickedConnection = null;
		for (Connection connection : cm.getConnectionList()) {
			if (connection.getLn().equals(clickedLine)) {
				clickedConnection = connection;
				break;
			}
		}
		return clickedConnection;
	}
}
