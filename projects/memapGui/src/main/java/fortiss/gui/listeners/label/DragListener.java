package fortiss.gui.listeners.label;

import java.awt.Cursor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;

import javax.swing.JLabel;

import fortiss.gui.DraggableLabel;

public class DragListener implements DragGestureListener {

	/**
	 * Starts a dragging event and changes the cursor accordingly. Creates a new
	 * {@link DraggableLabel}
	 */
	@Override
	public void dragGestureRecognized(DragGestureEvent event) {
		Cursor cursor = null;
		JLabel lb = (JLabel) event.getComponent();

		if (event.getDragAction() == DnDConstants.ACTION_COPY) {
			cursor = DragSource.DefaultCopyDrop;
		}

		event.startDrag(cursor, new DraggableLabel(lb));
	}
}