package fortiss.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import fortiss.gui.icons.ComponentIcon;
import fortiss.gui.style.Colors;
import fortiss.media.IconStore;

/**
 * Holds the icons of the components that can be added to a building.
 */
public class ComponentBox extends Box {

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Component component : getComponents()) {
			component.setForeground(Colors.normal);
		}
		
		setForeground(Colors.normal);
		setBackground(Colors.background);
		
	}

	public ComponentBox() {
		super(BoxLayout.Y_AXIS);
		initialize();
	}
	
	/**
	 * Initializes the contents of the component box.
	 */
	public void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "EMS COMPONENTS", TitledBorder.CENTER,
				TitledBorder.TOP, null, Colors.accent1));
		
		String toolTip = "Click on a component to add it to the building devices.";

		Component verticalStrut = Box.createVerticalStrut(2);
		verticalStrut.setPreferredSize(new Dimension(0, 10));
		add(verticalStrut);

		ComponentIcon demandIcon = new ComponentIcon("Demand", IconStore.uDemandMenu, toolTip);
		add(demandIcon);
		
		Component verticalStrut_1 = Box.createVerticalStrut(2);
		verticalStrut_1.setPreferredSize(new Dimension(0, 10));
		add(verticalStrut_1);
		
		ComponentIcon storageIcon = new ComponentIcon("Storage", IconStore.uStorageMenu, toolTip);
		add(storageIcon);

		Component verticalStrut_2 = Box.createVerticalStrut(2);
		verticalStrut_2.setPreferredSize(new Dimension(0, 10));
		add(verticalStrut_2);

		ComponentIcon volatileIcon = new ComponentIcon("Volatile", IconStore.uVolatileMenu, toolTip);
		add(volatileIcon);

		Component verticalStrut_3 = Box.createVerticalStrut(2);
		verticalStrut_3.setPreferredSize(new Dimension(0, 10));
		add(verticalStrut_3);

		ComponentIcon controllableIcon = new ComponentIcon("Controllable", IconStore.uControllableMenu, toolTip);
		add(controllableIcon);

		Component verticalStrut_4 = Box.createVerticalStrut(2);
		verticalStrut_4.setPreferredSize(new Dimension(0, 10));
		add(verticalStrut_4);

		ComponentIcon couplerIcon = new ComponentIcon("Coupler", IconStore.uCouplerMenu, toolTip);
		add(couplerIcon);
	}

	private static final long serialVersionUID = 1L;

}
