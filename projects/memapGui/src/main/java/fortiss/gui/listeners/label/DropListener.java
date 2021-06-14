package fortiss.gui.listeners.label;

import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.geom.Point2D;

import javax.swing.JPanel;

import fortiss.components.Building;
import fortiss.gui.DesignerPanel;

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

				// Create building an icon
				String buildingName = "building" + DesignerPanel.buildingCount;
				Building building = new Building(buildingName, 0, new Point2D.Float(p.x, p.y));
				building.showComponents();
				
				DesignerPanel.selectedBuilding = building;
				DesignerPanel.buildings.put(buildingName, building);

				// Show information in pl_ems_details
				DesignerPanel.showInformationPanel("building");
				DesignerPanel.buildingCount = DesignerPanel.buildingCount + 1;

				event.dropComplete(true);
				panel.validate();

				if (DesignerPanel.buildingCount > 0) {
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
