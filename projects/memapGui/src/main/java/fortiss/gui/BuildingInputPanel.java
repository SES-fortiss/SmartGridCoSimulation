package fortiss.gui;

import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.listeners.textfield.BNameListener;
import fortiss.gui.listeners.textfield.BPortListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;

/**
 * Input panel for building parameters.
 */
public class BuildingInputPanel extends JPanel {

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

	private static final long serialVersionUID = 1L;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Colors.background);
		setForeground(Colors.normal);
		lb_id.setForeground(Colors.normal);
		lb_port.setForeground(Colors.normal);
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
		setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("15dlu"),
				ColumnSpec.decode("left:85dlu"),
				ColumnSpec.decode("15dlu"),
				ColumnSpec.decode("left:100dlu"),
				ColumnSpec.decode("15dlu"),
				FormSpecs.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));

		lblBuilding = new JLabel("BUILDING");
		lblBuilding.setFont(Fonts.getOswald());
		add(lblBuilding, "2, 4, 3, 1, center, center");

		// Add fields to show EMS details
		lb_id = new JLabel("Building name");
		add(lb_id, "2, 8, left, default");

		txtBName = new JTextField();
		txtBName.addKeyListener(new BNameListener());
		txtBName.addFocusListener(new BNameListener());
		add(txtBName, "4, 8, fill, default");
		txtBName.setColumns(10);

		lb_port = new JLabel("Port number");
		add(lb_port, "2, 10, left, default");
		txtBPort = new JTextField();// integerFormat);
		txtBPort.setColumns(10);
		txtBPort.addKeyListener(new BPortListener());
		txtBPort.addFocusListener(new BPortListener());
		add(txtBPort, "4, 10, fill, default");
	}
}
