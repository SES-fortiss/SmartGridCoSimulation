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
import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.BuildingIcons;
import fortiss.gui.listeners.helper.ComponentIcons;
import fortiss.gui.listeners.helper.DataUpdater;

public class DropListener extends DropTargetAdapter implements DropTargetListener {

	@SuppressWarnings("unused")
	private DropTarget dropTarget;
	private JPanel panel;
	private DataFlavor dataFlavor = Designer.dataFlavor;

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
			
			/** Clean transfer 
			 * Transferable tr = event.getTransferable();
			 * JLabel icon = (JLabel) tr.getTransferData(dataFlavor); 
			 * this.panel.add(new JLabel(lb.getText(), lb.getIcon(),
			 * lb.getHorizontalAlignment()));
			 * */

			if (event.isDataFlavorSupported(dataFlavor)) {
				Point p = event.getLocation();
				event.acceptDrop(DnDConstants.ACTION_COPY);
				
				// Create building
				Designer.buildings.add(new Building("building" + Designer.buildingCount, 0, false, 0));
				Designer.currentBuilding = Designer.buildingCount;

				// Create building icon
				BuildingIcons bi = new BuildingIcons();
				bi.createBuildingIcon(Designer.buildingCount, p);
				
				// Create list of component icons for current building and add it to the general icon
				// lists
				ComponentIcons components = new ComponentIcons();
				components.createComponentLists(Designer.currentBuilding);

				// Show information in pl_ems_details
				DataUpdater du = new DataUpdater();
				du.updateEmsData(Designer.buildings.get(Designer.currentBuilding).getName(),
						Integer.toString(Designer.buildings.get(Designer.currentBuilding).getPort()));
				Designer.buildingCount = Designer.buildingCount + 1;
				
				event.dropComplete(true);
				this.panel.validate();
				
				if (Designer.buildingCount > 0 && !Designer.pl_object.comp_box.isVisible()) {
					Designer.pl_object.showComponentBox();
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
