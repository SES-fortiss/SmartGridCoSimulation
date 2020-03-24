package fortiss.gui.listeners.helper;

import java.util.ArrayList;

import javax.swing.JLabel;

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
	public void createComponentLists(String buildingName) {
		DesignerPanel.demandIcons.put(buildingName, new ArrayList<JLabel>());
		DesignerPanel.storageIcons.put(buildingName, new ArrayList<JLabel>());
		DesignerPanel.volatileIcons.put(buildingName, new ArrayList<JLabel>());
		DesignerPanel.controllableIcons.put(buildingName, new ArrayList<JLabel>());
		DesignerPanel.couplerIcons.put(buildingName, new ArrayList<JLabel>());
	}

	/**
	 * Create icons for the components of a building
	 * @param buildingName the name of a building
	 */
	public void createIcons(String buildingName) {
		createComponentLists(buildingName);
		int elements = DesignerPanel.buildings.get(buildingName).getDemand().size();
		for (int i = 0; i < elements; i++) {
			createDemandIcon(buildingName, i, false);
		}
		elements = DesignerPanel.buildings.get(buildingName).getStorage().size();
		for (int i = 0; i < elements; i++) {
			createStorageIcon(buildingName, i, false);
		}
		elements = DesignerPanel.buildings.get(buildingName).getVolatile().size();
		for (int i = 0; i < elements; i++) {
			createVolProductionIcon(buildingName, i, false);
		}
		elements = DesignerPanel.buildings.get(buildingName).getControllable().size();
		for (int i = 0; i < elements; i++) {
			createContProductionIcon(buildingName, i, false);
		}
		elements = DesignerPanel.buildings.get(buildingName).getCoupler().size();
		for (int i = 0; i < elements; i++) {
			createCouplerIcon(buildingName, i, false);
		}
	}

	public void showComponent(JLabel icon) {
		// Add icon to the panel
		DesignerPanel.pl_comp.add(icon);
		DesignerPanel.pl_comp.doLayout();
		icon.requestFocus();
	}

	public void createDemandIcon(String buildingName, int index, boolean visible) {
		Demand d = DesignerPanel.buildings.get(buildingName).getDemand().get(index);
		JLabel icon = new JLabel(d.getName());
		icon.setName("demand");
		icon.setIcon(Icon.uDemand);
		configureIcon(icon);
		icon.addMouseListener(new DemandListener());
		icon.addFocusListener(new DemandListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		DesignerPanel.demandIcons.get(buildingName).add(icon);
		if (visible)
			showComponent(icon);
	}

	public void createStorageIcon(String buildingName, int index, boolean visible) {
		Storage s = DesignerPanel.buildings.get(buildingName).getStorage().get(index);
		JLabel icon = new JLabel(s.getName());
		icon.setName("storage");
		icon.setIcon(Icon.uStorage);
		configureIcon(icon);
		icon.addMouseListener(new StorageListener());
		icon.addFocusListener(new StorageListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		DesignerPanel.storageIcons.get(buildingName).add(icon);
		if (visible)
			showComponent(icon);
	}

	public void createVolProductionIcon(String buildingName, int index, boolean visible) {
		Volatile v = DesignerPanel.buildings.get(buildingName).getVolatile().get(index);
		JLabel icon = new JLabel(v.getName());
		icon.setName("volatile");
		icon.setIcon(Icon.uVolatile);
		configureIcon(icon);
		icon.addMouseListener(new VolatileListener());
		icon.addFocusListener(new VolatileListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		DesignerPanel.volatileIcons.get(buildingName).add(icon);
		if (visible)
			showComponent(icon);
	}

	public void createContProductionIcon(String buildingName, int index, boolean visible) {
		Controllable cp = DesignerPanel.buildings.get(buildingName).getControllable().get(index);
		JLabel icon = new JLabel(cp.getName());
		icon.setName("controllable");
		icon.setIcon(Icon.uControllable);
		configureIcon(icon);
		icon.addMouseListener(new ControllableListener());
		icon.addFocusListener(new ControllableListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		DesignerPanel.controllableIcons.get(buildingName).add(icon);
		if (visible)
			showComponent(icon);
	}

	public void createCouplerIcon(String buildingName, int index, boolean visible) {
		Coupler c = DesignerPanel.buildings.get(buildingName).getCoupler().get(index);
		JLabel icon = new JLabel(c.getName());
		icon.setName("coupler");
		icon.setIcon(Icon.uCoupler);
		configureIcon(icon);
		icon.addMouseListener(new CouplerListener());
		icon.addFocusListener(new CouplerListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		DesignerPanel.couplerIcons.get(buildingName).add(icon);
		if (visible)
			showComponent(icon);
	}

	private void configureIcon(JLabel icon) {
		icon.setFont(Fonts.getOpenSans());
		icon.setVerticalTextPosition(JLabel.BOTTOM);
		icon.setHorizontalTextPosition(JLabel.CENTER);
	}
}