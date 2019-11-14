package fortiss.gui.listeners.helper;

import java.util.ArrayList;

import javax.swing.JLabel;

import fortiss.components.Controllable;
import fortiss.components.Coupler;
import fortiss.components.Demand;
import fortiss.components.Storage;
import fortiss.components.Volatile;
import fortiss.gui.Designer;
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

	public void createComponentLists(int building) {
		// Create list of icons for current building and add it to the general icon
		// lists
		Designer.demandIcons.add(building, new ArrayList<JLabel>());
		Designer.storageIcons.add(building, new ArrayList<JLabel>());
		Designer.volatileIcons.add(building, new ArrayList<JLabel>());
		Designer.controllableIcons.add(building, new ArrayList<JLabel>());
		Designer.couplerIcons.add(building, new ArrayList<JLabel>());
	}

	public void createIcons(int building) {
		createComponentLists(building);
		int elements = Designer.buildings.get(building).getDemand().size();
		for (int i = 0; i < elements; i++) {
			createDemandIcon(building, i, false);
		}
		elements = Designer.buildings.get(building).getStorage().size();
		for (int i = 0; i < elements; i++) {
			createStorageIcon(building, i, false);
		}
		elements = Designer.buildings.get(building).getVolatile().size();
		for (int i = 0; i < elements; i++) {
			createVolProductionIcon(building, i, false);
		}
		elements = Designer.buildings.get(building).getControllable().size();
		for (int i = 0; i < elements; i++) {
			createContProductionIcon(building, i, false);
		}
		elements = Designer.buildings.get(building).getCoupler().size();
		for (int i = 0; i < elements; i++) {
			createCouplerIcon(building, i, false);
		}
	}

	public void showComponent(JLabel icon) {
		// Add icon to the panel
		Designer.pl_comp.add(icon);
		Designer.pl_comp.doLayout();
		icon.requestFocus();
	}

	public void createDemandIcon(int building, int index, boolean visible) {
		Demand d = Designer.buildings.get(building).getDemand().get(index);
		JLabel icon = new JLabel(d.getName());
		icon.setName("demand");
		icon.setIcon(Icon.uDemand);
		configureIcon(icon);
		icon.addMouseListener(new DemandListener());
		icon.addFocusListener(new DemandListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		Designer.demandIcons.get(building).add(icon);
		if (visible)
			showComponent(icon);
	}

	public void createStorageIcon(int building, int index, boolean visible) {
		Storage s = Designer.buildings.get(building).getStorage().get(index);
		JLabel icon = new JLabel(s.getName());
		icon.setName("storage");
		icon.setIcon(Icon.uStorage);
		configureIcon(icon);
		icon.addMouseListener(new StorageListener());
		icon.addFocusListener(new StorageListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		Designer.storageIcons.get(building).add(icon);
		if (visible)
			showComponent(icon);
	}

	public void createVolProductionIcon(int building, int index, boolean visible) {
		Volatile v = Designer.buildings.get(building).getVolatile().get(index);
		JLabel icon = new JLabel(v.getName());
		icon.setName("volatile");
		icon.setIcon(Icon.uVolatile);
		configureIcon(icon);
		icon.addMouseListener(new VolatileListener());
		icon.addFocusListener(new VolatileListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		Designer.volatileIcons.get(building).add(icon);
		if (visible)
			showComponent(icon);
	}

	public void createContProductionIcon(int building, int index, boolean visible) {
		Controllable cp = Designer.buildings.get(building).getControllable().get(index);
		JLabel icon = new JLabel(cp.getName());
		icon.setName("controllable");
		icon.setIcon(Icon.uControllable);
		configureIcon(icon);
		icon.addMouseListener(new ControllableListener());
		icon.addFocusListener(new ControllableListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		Designer.controllableIcons.get(building).add(icon);
		if (visible)
			showComponent(icon);
	}

	public void createCouplerIcon(int building, int index, boolean visible) {
		Coupler c = Designer.buildings.get(building).getCoupler().get(index);
		JLabel icon = new JLabel(c.getName());
		icon.setName("coupler");
		icon.setIcon(Icon.uCoupler);
		configureIcon(icon);
		icon.addMouseListener(new CouplerListener());
		icon.addFocusListener(new CouplerListener());
		icon.addKeyListener(new RemoveListener());

		// Add new icon to the currentBuilding icon list
		Designer.couplerIcons.get(building).add(icon);
		if (visible)
			showComponent(icon);
	}

	private void configureIcon(JLabel icon) {
		icon.setFont(Fonts.getOpenSans());
		icon.setVerticalTextPosition(JLabel.BOTTOM);
		icon.setHorizontalTextPosition(JLabel.CENTER);
	}
}