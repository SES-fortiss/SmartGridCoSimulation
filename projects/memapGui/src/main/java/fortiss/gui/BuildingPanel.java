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

import fortiss.gui.listeners.helper.ConnectionManager;
import fortiss.gui.listeners.helper.DragLayout;
import fortiss.gui.listeners.helper.PositionManager;
import fortiss.gui.listeners.label.ConnectorListener;
import fortiss.gui.style.Colors;

/**
 * Possible actions in this panel: add, drag and remove building icons, draw
 * connection between building icons.
 */
public class BuildingPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	/**
	 * <code>true</code> while the mouse is dragged with the mouse right button, and
	 * <code>false</code> otherwise.
	 */
	private boolean drawing = false;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		setBackground(Colors.background);
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Layout area", TitledBorder.LEADING,
				TitledBorder.TOP, null, Colors.accent2));

		for (int i = 0; i < Designer.buildingCount; i++) {
			Designer.buildingIcons.get(i).setForeground(Colors.defaultCol);
		}
		repaint();
	}

	public BuildingPanel() {
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				PositionManager.fixPositions();
			}
		});
		setAutoscrolls(true);
		setLayout(new DragLayout());
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(2, // Width
				BasicStroke.CAP_ROUND, // End-cap style
				BasicStroke.JOIN_ROUND // Vertex join style
		));

		if (isDrawing()) {
			g2.draw(new Line2D.Float(ConnectorListener.p1, ConnectorListener.p2));
		}
		for (int i = 0; i < ConnectionManager.connectionNumber; i++) {
			g2.setColor(ConnectionManager.lineColors.get(i));
			g2.draw(ConnectionManager.lines.get(i));
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

}
