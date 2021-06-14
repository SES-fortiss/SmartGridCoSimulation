package fortiss.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragSource;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import fortiss.gui.icons.BuildingIcon;
import fortiss.gui.icons.ComponentIcon;
import fortiss.gui.listeners.label.DragListener;
import fortiss.gui.listeners.label.DropListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.IconStore;
import net.miginfocom.swing.MigLayout;;

/**
 * Contains objects that can added to a topology.
 */
public class ObjectPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private Box componentBox = Box.createVerticalBox();
	private JLabel lblInstructions = new JLabel();
	private JLabel lbInstructions2 = new JLabel();
	private final JPanel panel = new JPanel();

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setForeground(Colors.normal);
		setBackground(Colors.background);
		panel.setForeground(Colors.normal);
		panel.setBackground(Colors.background);
		lblInstructions.setForeground(Colors.title);
		lbInstructions2.setForeground(Colors.defaultCol);
	}

	public ObjectPanel() {
		StyleGenerator.setupStyle();
		initialize();
	}
	
	/**
	 * Initializes the contents of the panel.
	 */
	private void initialize() {
		setSize(new Dimension(150, 655));
		setPreferredSize(new Dimension(150, 655));
		setLayout(new MigLayout("insets 0 0 0 0, filly, center, width 99%", 
				"[center]", 
				"[center]10[center]10[center]30[center]80[bottom]5[bottom]"));

		lblInstructions.setText("<html><center> Energy Management <br/> System (EMS) </center></html>");
		lblInstructions.setFont(Fonts.getOswald(FontSize.SMALL));
		add(lblInstructions, "wrap");

		lbInstructions2.setText("<html><center> Drag the icon to <br/> add a new EMS </center></html>");
		lbInstructions2.setFont(Fonts.getOpenSans(FontSize.TINY));
		add(lbInstructions2, "wrap");

		// Add "Add New EMS" icon
		BuildingIcon buildingIcon = new BuildingIcon("EMS", IconStore.uBuilding, "Drag to create a new EMS");
		add(buildingIcon, "wrap");

		// Component box
		componentBox.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "EMS COMPONENTS", TitledBorder.CENTER,
				TitledBorder.TOP, null, Colors.accent1));
		
		String toolTip = "Click on a component to add it to the building devices.";

		Component verticalStrut = Box.createVerticalStrut(2);
		verticalStrut.setPreferredSize(new Dimension(0, 10));
		componentBox.add(verticalStrut);

		ComponentIcon demandIcon = new ComponentIcon("Demand", IconStore.uDemandMenu, toolTip);
		demandIcon.setAlignmentX(Box.CENTER_ALIGNMENT);
		componentBox.add(demandIcon);
		
		Component verticalStrut_1 = Box.createVerticalStrut(2);
		verticalStrut_1.setPreferredSize(new Dimension(0, 10));
		componentBox.add(verticalStrut_1);
		
		ComponentIcon storageIcon = new ComponentIcon("Storage", IconStore.uStorageMenu, toolTip);
		storageIcon.setAlignmentX(Box.CENTER_ALIGNMENT);
		componentBox.add(storageIcon);

		Component verticalStrut_2 = Box.createVerticalStrut(2);
		verticalStrut_2.setPreferredSize(new Dimension(0, 10));
		componentBox.add(verticalStrut_2);

		ComponentIcon volatileIcon = new ComponentIcon("Volatile", IconStore.uVolatileMenu, toolTip);
		volatileIcon.setAlignmentX(Box.CENTER_ALIGNMENT);
		componentBox.add(volatileIcon);

		Component verticalStrut_3 = Box.createVerticalStrut(2);
		verticalStrut_3.setPreferredSize(new Dimension(0, 10));
		componentBox.add(verticalStrut_3);

		ComponentIcon controllableIcon = new ComponentIcon("Controllable", IconStore.uControllableMenu, toolTip);
		controllableIcon.setAlignmentX(Box.CENTER_ALIGNMENT);
		componentBox.add(controllableIcon);

		Component verticalStrut_4 = Box.createVerticalStrut(2);
		verticalStrut_4.setPreferredSize(new Dimension(0, 10));
		componentBox.add(verticalStrut_4);

		ComponentIcon couplerIcon = new ComponentIcon("Coupler", IconStore.uCouplerMenu, toolTip);
		couplerIcon.setAlignmentX(Box.CENTER_ALIGNMENT);
		componentBox.add(couplerIcon);
		
		add(componentBox, "growx, wrap");
		componentBox.setVisible(false);
		
		JLabel lblFortissLogo = new JLabel(IconStore.smallFortissLogo);
		JLabel lblTumLogo = new JLabel(IconStore.smallTumLogo);
		
		add(lblFortissLogo, "wrap");
		add(lblTumLogo, "wrap");
		
		// Enable dragging label
		DragSource ds = new DragSource();
		ds.createDefaultDragGestureRecognizer(buildingIcon, DnDConstants.ACTION_COPY, new DragListener());
		new DropListener(DesignerPanel.pl_ems);
	}

	public void showComponentBox() {
		if(!componentBox.isVisible())
			componentBox.setVisible(true);
	}

	public void hideComponentBox() {
		if(componentBox.isVisible())
			componentBox.setVisible(false);
	}
}
