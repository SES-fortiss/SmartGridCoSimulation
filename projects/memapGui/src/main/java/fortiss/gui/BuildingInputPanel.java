package fortiss.gui;

import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import fortiss.components.Building;
import fortiss.gui.listeners.textfield.BMaxLimitListener;
import fortiss.gui.listeners.textfield.BNameListener;
import fortiss.gui.listeners.textfield.BPortListener;
import fortiss.gui.listeners.textfield.ComponentFieldListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import net.miginfocom.swing.MigLayout;

/**
 * Input panel for building parameters.
 */
public class BuildingInputPanel extends InformationPanel {

	/** Building name */
	public JTextField txtBName;
	/** Building port number */
	public JTextField txtBPort;
	/** Building area title label */
	private JLabel lblBuilding;
	/** Building name label */
	private JLabel lb_id;
	/** Building port label */
	private JLabel lb_port;
	
	/** Building max buy level */
	private JLabel lb_b_max_limit;
	public JTextField txt_b_max_limit;

	private static final long serialVersionUID = 1L;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Colors.background);
		setForeground(Colors.normal);
		lb_id.setForeground(Colors.normal);
		lb_port.setForeground(Colors.normal);
		lb_b_max_limit.setForeground(Colors.normal);
		lblBuilding.setForeground(Colors.title);
	}

	public BuildingInputPanel() {
		StyleGenerator.setupStyle();
		initialize();
	}
	
	/**
	 * Initialize the contents of the panel.
	 */
	public void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Building information",
				TitledBorder.RIGHT, TitledBorder.TOP, null, Colors.accent2));
		
		setLayout(new MigLayout("insets 30 20 20 20, fillx, wrap 2, hidemode 2, width 99%", 
				"[left, growprio 50]30[right]", 
				""));

		lblBuilding = new JLabel("BUILDING");
		lblBuilding.setFont(Fonts.getOswald());
		add(lblBuilding, "spanx, center, gapbottom 30");

		// Add fields to show EMS details
		lb_id = new JLabel("Building name");
		add(lb_id);

		txtBName = new JTextField();
		ComponentFieldListener bnameListener = new BNameListener();
		txtBName.addKeyListener(bnameListener);
		txtBName.addFocusListener(bnameListener);
		txtBName.setColumns(10);
		add(txtBName, "growx");

		lb_port = new JLabel("Port number");
		add(lb_port);
		txtBPort = new JTextField();// integerFormat);
		txtBPort.setColumns(10);
		ComponentFieldListener bPortListener = new BPortListener();
		txtBPort.addKeyListener(bPortListener);
		txtBPort.addFocusListener(bPortListener);
		add(txtBPort, "growx");
		
		lb_b_max_limit = new JLabel("Elecricity Buy Limit");
		ComponentFieldListener bMaxListener = new BMaxLimitListener();
		add(lb_b_max_limit);
		txt_b_max_limit = new JTextField();// integerFormat);
		txt_b_max_limit.setColumns(10);
		txt_b_max_limit.addKeyListener(bMaxListener);
		txt_b_max_limit.addFocusListener(bMaxListener);		
		String tool_tip_max_limit = "Limits are of type INT and in range [1..9999]";
		lb_b_max_limit.setToolTipText(tool_tip_max_limit);
		txt_b_max_limit.setToolTipText(tool_tip_max_limit);		
		
		add(txt_b_max_limit, "growx");
	}

	@Override
	public void update() {
		Building building = DesignerPanel.selectedBuilding;
		txtBName.setText(building.getName());
		txtBPort.setText(String.valueOf(building.getPort()));
		txt_b_max_limit.setText(String.valueOf(building.getMax_buy_limit()));
	}

}
