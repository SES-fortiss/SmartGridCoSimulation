package fortiss.gui;

import java.awt.BasicStroke;
import java.awt.ComponentOrientation;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.Line2D;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import fortiss.components.Building;
import fortiss.components.Connection;
import fortiss.gui.listeners.helper.DragLayout;
import fortiss.gui.listeners.label.ConnectorListener;
import fortiss.gui.listeners.line.LineListener;
import fortiss.gui.style.Colors;
import fortiss.simulation.helper.ConnectionManager;
import fortiss.simulation.helper.PositionManager;

/**
 * Possible actions in this panel: add, drag and remove building icons, draw
 * connection between building icons.
 */
public class BuildingPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private ConnectionManager cm = ConnectionManager.getInstance();
	
	/**
	 * <code>true</code> while the mouse is dragged with the mouse right button, and
	 * <code>false</code> otherwise.
	 */
	private boolean drawing = false;

	public BuildingPanel() {
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Layout area", TitledBorder.LEADING,
				TitledBorder.TOP, null, Colors.accent2));
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				PositionManager pm = PositionManager.getInstance();
				pm.fixPositions();
			}
		});
		setAutoscrolls(true);
		setLayout(new DragLayout());
		addMouseListener(new LineListener());
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		/** Necessary for dark mode on/off implementation */
		setBackground(Colors.background);

		for (Building building : DesignerPanel.buildings.values()) {
			building.getIcon().setForeground(Colors.defaultCol);
		}

		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(2, // Width
				BasicStroke.CAP_ROUND, // End-cap style
				BasicStroke.JOIN_ROUND // Vertex join style
		));

		if (isDrawing()) {
			g2.draw(new Line2D.Float(ConnectorListener.p1, ConnectorListener.p2));
		}
		
		for (Connection c : cm.getConnectionList()) {
			g2.setColor(c.getColor());
			g2.draw(c.getLn());
		}
	}

	/**
	 * Returns the value of {@link BuildingPanel#drawing}
	 */
	public boolean isDrawing() {
		return drawing;
	}

	/**
	 * Sets the value of {@link BuildingPanel#drawing}
	 * 
	 * @param drawing boolean value
	 */
	public void setDrawing(boolean drawing) {
		this.drawing = drawing;
	}
	
	public void reset() {
		removeAll();
		revalidate();
		repaint();
	}

}
