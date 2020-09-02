package fortiss.gui.listeners.label;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import fortiss.gui.BuildingIcon;
import fortiss.gui.DesignerPanel;
import fortiss.simulation.helper.ConnectionManager;
import fortiss.simulation.helper.PositionManager;

public class ConnectorListener extends MouseAdapter implements MouseMotionListener {

	private PositionManager pm = PositionManager.getInstance();
	private ConnectionManager cm = ConnectionManager.getInstance();
	private static Rectangle area1 = new Rectangle();
	public static Point2D p1 = new Point(0, 0);
	public static Point2D p2 = new Point(0, 0);

	/**
	 * When the right mouse button is pressed, initialize {@value #area1} to the
	 * source icon bounds and {@value #p1} its position and sets cursor to
	 * <code> Cursor.HAND_CURSOR</code>.
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON3) {
			JLabel icon = (JLabel) e.getSource();
			area1 = icon.getBounds();
			p1 = pm.getCentralPoint(icon);
			DesignerPanel.pl_ems.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		}
	}

	/**
	 * Verifies if the user has made a valid connection. If so, calls
	 * {@link fortiss.simulation.helper.ConnectionManager#addConnection(JLabel, JLabel)}
	 * and sets {@value fortiss.gui.BuildingPanel#drawing} to <code>false</code>.
	 * Sets cursor to <code> Cursor.DEFAULT_CURSOR</code>
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON3) {
			DesignerPanel.pl_ems.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			// Final drag point relative to source label location
			Point2D p = e.getPoint();

			// Final drag point relative to panel
			p2.setLocation(p.getX() + area1.x, p.getY() + area1.y);

			if (!area1.contains(p2)) {
				// The mouse was dragged out of the label
				Component iconf = (Component) DesignerPanel.pl_ems
						.getComponentAt(new Point((int) p2.getX(), (int) p2.getY()));

				if (iconf instanceof JLabel) {
					p2 = pm.getCentralPoint((JLabel) iconf);

					// Add connection to structure
					BuildingIcon icon = (BuildingIcon) e.getSource();
					cm.addConnection(icon, (BuildingIcon) iconf);
				}
			}
			DesignerPanel.pl_ems.repaint();
			DesignerPanel.pl_ems.setDrawing(false);
		}
	}

	/**
	 * If the mouse is dragged using the right button, gets the position of the
	 * mouse and sets {@value fortiss.gui.BuildingPanel#drawing} to
	 * <code>true</code>.
	 */
	@Override
	public void mouseDragged(MouseEvent e) {
		if (SwingUtilities.isRightMouseButton(e)) {
			// Drag point relative to source label location
			Point p = e.getPoint();
			// Drag point relative to panel
			p2.setLocation(p.x + area1.x, p.y + area1.y);

			DesignerPanel.pl_ems.setDrawing(true);
			DesignerPanel.pl_ems.repaint();
		}
	}
}
