package fortiss.gui.listeners.label;

import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetListener;

import javax.swing.JPanel;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.BuildingIcons;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class DropListener extends DropTargetAdapter implements DropTargetListener {

	@SuppressWarnings("unused")
	private DropTarget dropTarget;
	private JPanel panel;
	private DataFlavor dataFlavor = DesignerPanel.dataFlavor;

	public DropListener(JPanel panel) {

		this.panel = panel;
		dropTarget = new DropTarget(panel, DnDConstants.ACTION_COPY, this, true, null);
	}

	/**
	 * Creates a building object and a building icon. Calls
	 * {@link fortiss.gui.listeners.helper.BuildingIcons#createBuildingIcon(int, Point)}
	 * {@link fortiss.gui.listeners.helper.ComponentIcons#createComponentLists(int)},
	 * {@link fortiss.gui.listeners.helper.DataUpdater#updateEmsData(String, String)}.
	 */
	public void drop(DropTargetDropEvent event) {

		try {

			if (event.isDataFlavorSupported(dataFlavor)) {
				Point p = event.getLocation();
				event.acceptDrop(DnDConstants.ACTION_COPY);

				// Create building
				DesignerPanel.buildings.add(new Building("building" + DesignerPanel.buildingCount, 0, false, 0));
				DesignerPanel.currentBuilding = DesignerPanel.buildingCount;

				// Create building icon
				BuildingIcons bi = new BuildingIcons();
				bi.createBuildingIcon(DesignerPanel.buildingCount, p);

				// Create list of component icons for current building and add it to the general
				// icon
				// lists
				ComponentIcons components = new ComponentIcons();
				components.createComponentLists(DesignerPanel.currentBuilding);

				// Show information in pl_ems_details
				DataUpdater du = new DataUpdater();
				du.updateEmsData(DesignerPanel.buildings.get(DesignerPanel.currentBuilding).getName(),
						Integer.toString(DesignerPanel.buildings.get(DesignerPanel.currentBuilding).getPort()));
				DesignerPanel.buildingCount = DesignerPanel.buildingCount + 1;

				event.dropComplete(true);
				this.panel.validate();

				if (DesignerPanel.buildingCount > 0 && !DesignerPanel.pl_object.comp_box.isVisible()) {
					DesignerPanel.pl_object.showComponentBox();
				}
				return;
			}
			event.rejectDrop();
		} catch (Exception e) {
			e.printStackTrace();
			event.rejectDrop();
		}
	}
}
