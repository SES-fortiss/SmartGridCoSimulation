package fortiss.gui.listeners.helper;

import java.util.ArrayList;

import javax.swing.JLabel;

import fortiss.components.Building;
import fortiss.components.Controllable;
import fortiss.components.Coupler;
import fortiss.components.Demand;
import fortiss.components.Storage;
import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.action.RemoveListener;
import fortiss.gui.listeners.label.ControllableListener;
import fortiss.gui.listeners.label.CouplerListener;
import fortiss.gui.listeners.label.DemandListener;
import fortiss.gui.listeners.label.HooverMouseListner;
import fortiss.gui.listeners.label.StorageListener;
import fortiss.gui.listeners.label.VolatileListener;
import fortiss.gui.style.Fonts;
import fortiss.media.Icon;

/**
 * Contains methods to create component icons
 */
public class ComponentIcons {

	/**
	 * Create list of icons for current building and add it to the general icon
	 * lists
	 * @param buildingName the name of a building
	 */
	public void createComponentLists(Building building) {
		DesignerPanel.demandIcons.put(building, new ArrayList<JLabel>());
		DesignerPanel.storageIcons.put(building, new ArrayList<JLabel>());
		DesignerPanel.volatileIcons.put(building, new ArrayList<JLabel>());
		DesignerPanel.controllableIcons.put(building, new ArrayList<JLabel>());
		DesignerPanel.couplerIcons.put(building, new ArrayList<JLabel>());
	}

	/**
	 * Create icons for the components of a building
	 * @param buildingName the name of a building
	 */
	public void createIcons(Building building) {
		createComponentLists(building);
		int elements = building.getDemand().size();
		for (int i = 0; i < elements; i++) {
			createDemandIcon(building, i, false);
		}
		elements = building.getStorage().size();
		for (int i = 0; i < elements; i++) {
			createStorageIcon(building, i, false);
		}
		elements = building.getVolatile().size();
		for (int i = 0; i < elements; i++) {
			createVolProductionIcon(building, i, false);
		}
		elements = building.getControllable().size();
		for (int i = 0; i < elements; i++) {
			createContProductionIcon(building, i, false);
		}
		elements = building.getCoupler().size();
		for (int i = 0; i < elements; i++) {
			createCouplerIcon(building, i, false);
		}
	}

	public void showComponent(JLabel icon) {
		// Add icon to the panel
		DesignerPanel.pl_comp.add(icon);
		DesignerPanel.pl_comp.doLayout();
		icon.requestFocus();
	}

	public void createDemandIcon(Building building, int index, boolean visible) {
		Demand d = building.getDemand().get(index);
		JLabel icon = new JLabel(d.getName());
		icon.setName("demand");
		icon.setIcon(Icon.uDemand);
		configureIcon(icon);
		icon.addMouseListener(new DemandListener());
		icon.addFocusListener(new DemandListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		DesignerPanel.demandIcons.get(building).add(icon);
		if (visible)
			showComponent(icon);
	}

	public void createStorageIcon(Building building, int index, boolean visible) {
		Storage s = building.getStorage().get(index);
		JLabel icon = new JLabel(s.getName());
		icon.setName("storage");
		icon.setIcon(Icon.uStorage);
		configureIcon(icon);
		icon.addMouseListener(new StorageListener());
		icon.addFocusListener(new StorageListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		DesignerPanel.storageIcons.get(building).add(icon);
		if (visible)
			showComponent(icon);
	}

	public void createVolProductionIcon(Building building, int index, boolean visible) {
		Volatile v = building.getVolatile().get(index);
		JLabel icon = new JLabel(v.getName());
		icon.setName("volatile");
		icon.setIcon(Icon.uVolatile);
		configureIcon(icon);
		icon.addMouseListener(new VolatileListener());
		icon.addFocusListener(new VolatileListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		DesignerPanel.volatileIcons.get(building).add(icon);
		if (visible)
			showComponent(icon);
	}

	public void createContProductionIcon(Building building, int index, boolean visible) {
		Controllable cp = building.getControllable().get(index);
		JLabel icon = new JLabel(cp.getName());
		icon.setName("controllable");
		icon.setIcon(Icon.uControllable);
		configureIcon(icon);
		icon.addMouseListener(new ControllableListener());
		icon.addFocusListener(new ControllableListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		DesignerPanel.controllableIcons.get(building).add(icon);
		if (visible)
			showComponent(icon);
	}

	public void createCouplerIcon(Building building, int index, boolean visible) {
		Coupler c = building.getCoupler().get(index);
		JLabel icon = new JLabel(c.getName());
		icon.setName("coupler");
		icon.setIcon(Icon.uCoupler);
		configureIcon(icon);
		icon.addMouseListener(new CouplerListener());
		icon.addFocusListener(new CouplerListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		DesignerPanel.couplerIcons.get(building).add(icon);
		if (visible)
			showComponent(icon);
	}

	private void configureIcon(JLabel icon) {
		icon.setFont(Fonts.getOpenSans());
		icon.setVerticalTextPosition(JLabel.BOTTOM);
		icon.setHorizontalTextPosition(JLabel.CENTER);
	}
}