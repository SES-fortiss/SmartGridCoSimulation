package fortiss.gui.listeners.label;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import fortiss.gui.DesignerPanel;
import fortiss.simulation.helper.PositionManager;

public class PositionListener extends MouseAdapter {

	private PositionManager pm = PositionManager.getInstance();

	/**
	 * Sets cursor to <code> Cursor.HAND_CURSOR</code> if the left mouse button is
	 * pressed.
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		if (SwingUtilities.isLeftMouseButton(e)) {
			DesignerPanel.pl_ems.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
	}

	/**
	 * Moves a building icon when the mouse is dragged using the left mouse button.
	 * Calls {@link PositionManager#updateBuildingPosition(JLabel)}
	 */
	@Override
	public void mouseDragged(MouseEvent e) {
		if (SwingUtilities.isLeftMouseButton(e)) {
			JLabel icon = (JLabel) e.getComponent();
			icon.setLocation(icon.getX() + e.getX() - icon.getWidth() / 2,
					icon.getY() + e.getY() - icon.getHeight() / 2);
			pm.updateBuildingPosition(icon.getText(), icon);
		}
	}

	/**
	 * Verifies if the new building position is inside the visible area of the
	 * panel. Otherwise, Calls {@link PositionManager#fixPosition(JLabel)}. Sets
	 * cursor to <code> Cursor.DEFAULT_CURSOR</code>
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		if (SwingUtilities.isLeftMouseButton(e)) {
			DesignerPanel.pl_ems.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			JLabel icon = (JLabel) e.getComponent();
			if (!pm.getVisibleArea().contains(icon.getX(), icon.getY())) {
				pm.fixPosition(icon.getText(), icon);
			}
		}
	}

}
