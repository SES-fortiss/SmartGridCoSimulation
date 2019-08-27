package fortiss.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import fortiss.gui.listeners.action.AddControllableListener;
import fortiss.gui.listeners.action.AddCouplerListener;
import fortiss.gui.listeners.action.AddDemandListener;
import fortiss.gui.listeners.action.AddStorageListener;
import fortiss.gui.listeners.action.AddVolatileListener;
import fortiss.gui.style.Colors;
import fortiss.media.Icon;

/**
 * Holds the icons of the components that can be added to a building.
 */
public class ComponentBox extends Box {

	private JLabel lb_add_demand;
	private JLabel lb_add_storage;
	private JLabel lb_add_volatile;
	private JLabel lb_add_controllable;
	private JLabel lb_add_coupler;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		lb_add_demand.setForeground(Colors.normal);
		;
		lb_add_storage.setForeground(Colors.normal);
		;
		lb_add_volatile.setForeground(Colors.normal);
		;
		lb_add_controllable.setForeground(Colors.normal);
		;
		lb_add_coupler.setForeground(Colors.normal);
		;
		setForeground(Colors.normal);
		setBackground(Colors.background);
		repaint();
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "COMPONENTS", TitledBorder.CENTER,
				TitledBorder.TOP, null, Colors.accent1));
	}

	public ComponentBox() {
		super(BoxLayout.Y_AXIS);
		setToolTipText("Clic on a component to add it to the building devices.");

		Component verticalStrut = Box.createVerticalStrut(2);
		verticalStrut.setPreferredSize(new Dimension(0, 10));
		add(verticalStrut);

		// Add "Add New Demand" icon
		lb_add_demand = new JLabel("Demand");
		lb_add_demand.setVerticalAlignment(SwingConstants.TOP);
		lb_add_demand.setHorizontalAlignment(SwingConstants.CENTER);
		lb_add_demand.setMinimumSize(new Dimension(156, 80));
		lb_add_demand.setMaximumSize(new Dimension(156, 100));
		lb_add_demand.setVerticalTextPosition(JLabel.BOTTOM);
		lb_add_demand.setHorizontalTextPosition(JLabel.CENTER);
		lb_add_demand.setIcon(Icon.uDemandMenu);
		lb_add_demand.addMouseListener(new AddDemandListener());
		add(lb_add_demand);

		Component verticalStrut_1 = Box.createVerticalStrut(2);
		verticalStrut_1.setPreferredSize(new Dimension(0, 10));
		add(verticalStrut_1);

		// Add "Add New Storage" icon
		lb_add_storage = new JLabel("Storage");
		lb_add_storage.setVerticalAlignment(SwingConstants.TOP);
		lb_add_storage.setMinimumSize(new Dimension(156, 80));
		lb_add_storage.setMaximumSize(new Dimension(156, 100));
		lb_add_storage.setHorizontalAlignment(SwingConstants.CENTER);
		lb_add_storage.setVerticalTextPosition(JLabel.BOTTOM);
		lb_add_storage.setHorizontalTextPosition(JLabel.CENTER);
		lb_add_storage.setIcon(Icon.uStorageMenu);
		lb_add_storage.addMouseListener(new AddStorageListener());
		add(lb_add_storage);

		Component verticalStrut_2 = Box.createVerticalStrut(2);
		verticalStrut_2.setPreferredSize(new Dimension(0, 10));
		add(verticalStrut_2);

		// Add "Add New Volatile" icon
		lb_add_volatile = new JLabel("Volatile production");
		lb_add_volatile.setVerticalAlignment(SwingConstants.TOP);
		lb_add_volatile.setHorizontalAlignment(SwingConstants.CENTER);
		lb_add_volatile.setMinimumSize(new Dimension(156, 80));
		lb_add_volatile.setMaximumSize(new Dimension(156, 100));
		lb_add_volatile.setVerticalTextPosition(JLabel.BOTTOM);
		lb_add_volatile.setHorizontalTextPosition(JLabel.CENTER);
		lb_add_volatile.setIcon(Icon.uVolatileMenu);
		lb_add_volatile.addMouseListener(new AddVolatileListener());
		add(lb_add_volatile);

		Component verticalStrut_3 = Box.createVerticalStrut(2);
		verticalStrut_3.setPreferredSize(new Dimension(0, 10));
		add(verticalStrut_3);

		// Add "Add New Controllable" icon
		lb_add_controllable = new JLabel("Controllable production");
		lb_add_controllable.setHorizontalAlignment(SwingConstants.CENTER);
		lb_add_controllable.setMaximumSize(new Dimension(156, 80));
		lb_add_controllable.setMinimumSize(new Dimension(156, 80));
		lb_add_controllable.setVerticalAlignment(SwingConstants.TOP);
		lb_add_controllable.setVerticalTextPosition(JLabel.BOTTOM);
		lb_add_controllable.setHorizontalTextPosition(JLabel.CENTER);
		lb_add_controllable.setIcon(Icon.uControllableMenu);
		lb_add_controllable.addMouseListener(new AddControllableListener());
		add(lb_add_controllable);

		Component verticalStrut_4 = Box.createVerticalStrut(2);
		verticalStrut_4.setPreferredSize(new Dimension(0, 10));
		add(verticalStrut_4);

		// Add "Add New Coupler" icon
		lb_add_coupler = new JLabel("Coupler");
		lb_add_coupler.setMaximumSize(new Dimension(156, 80));
		lb_add_coupler.setMinimumSize(new Dimension(156, 80));
		lb_add_coupler.setHorizontalAlignment(SwingConstants.CENTER);
		lb_add_coupler.setVerticalTextPosition(JLabel.BOTTOM);
		lb_add_coupler.setHorizontalTextPosition(JLabel.CENTER);
		lb_add_coupler.setIcon(Icon.uCouplerMenu);
		lb_add_coupler.addMouseListener(new AddCouplerListener());
		add(lb_add_coupler);
	}

	private static final long serialVersionUID = 1L;

}
