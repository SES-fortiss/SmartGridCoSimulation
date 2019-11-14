package fortiss.gui;

import java.awt.Cursor;
import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.listeners.button.DBrowseListener;
import fortiss.gui.listeners.button.DPlotListener;
import fortiss.gui.listeners.selectionitem.DNetworkTypeListener;
import fortiss.gui.listeners.textfield.DConsumptionListener;
import fortiss.gui.listeners.textfield.DIndexListener;
import fortiss.gui.listeners.textfield.DNameListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.Icon;

/**
 * Input panel for demand parameters.
 */
public class DemandInputPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/** Demand name */
	public JTextField txtDName;
	/** Demand consumption file path */
	public JTextField txtDConsumption;
	/** In consumption file column index */
	public JTextField txtDIndex;
	/** Demand network type */
	public JComboBox<String> sDNetworkType;
	/** Demand area title label */
	private JLabel lblDemand;
	/** Demand name label */
	private JLabel lbDName;
	/** Demand network type label */
	private JLabel lbDNetworkType;
	/** Demand consumption file path label */
	private JLabel lbDConsumption;
	/** Demand index label */
	private JLabel lbDIndex;
	/** Plot panel */
	public PlotPanel plotPanel = new PlotPanel();
	private JPanel panel;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setForeground(Colors.normal);
		setBackground(Colors.background);
		panel.setForeground(Colors.normal);
		panel.setBackground(Colors.background);
		plotPanel.setForeground(Colors.normal);
		plotPanel.setBackground(Colors.background);
		lblDemand.setForeground(Colors.title);
		lbDName.setForeground(Colors.normal);
		lbDIndex.setForeground(Colors.normal);
		lbDNetworkType.setForeground(Colors.normal);
		lbDConsumption.setForeground(Colors.normal);
		if (plotPanel.isPlotted()) {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					plotPanel.paintSeries();
				}
			});
		}
	}

	public DemandInputPanel() {
		StyleGenerator.setupStyle();
		initialize();
	}

	/**
	 * Initializes the contents of the panel.
	 */
	private void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Component information",
				TitledBorder.RIGHT, TitledBorder.TOP, null, Colors.accent2));
		setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("85dlu:grow"), },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("fill:200dlu"), }));

		panel = new JPanel();
		add(panel, "1, 2, fill, fill");
		panel.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("15dlu"), ColumnSpec.decode("85dlu:grow"),
				ColumnSpec.decode("15dlu"), ColumnSpec.decode("93dlu:grow"), FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("15dlu"), FormSpecs.RELATED_GAP_COLSPEC, },
				new RowSpec[] { FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, }));

		lblDemand = new JLabel("DEMAND");
		panel.add(lblDemand, "2, 3, 7, 1, center, center");
		lblDemand.setFont(Fonts.getOswald());

		lbDName = new JLabel("Name");
		panel.add(lbDName, "2, 7");

		txtDName = new JTextField();
		panel.add(txtDName, "4, 7, 5, 1, fill, default");
		txtDName.setName("txtDName");
		txtDName.addKeyListener(new DNameListener());
		txtDName.addFocusListener(new DNameListener());
		txtDName.setColumns(10);

		lbDNetworkType = new JLabel("Network type");
		panel.add(lbDNetworkType, "2, 9");

		sDNetworkType = new JComboBox<>();
		panel.add(sDNetworkType, "4, 9, 5, 1, fill, default");
		sDNetworkType.setFocusTraversalKeysEnabled(false);
		sDNetworkType.setFocusable(false);
		sDNetworkType.setModel(new DefaultComboBoxModel<String>(new String[] { "Heat", "Electricity" }));

		lbDIndex = new JLabel("Index");
		panel.add(lbDIndex, "2, 11");

		txtDIndex = new JTextField();
		panel.add(txtDIndex, "4, 11, 5, 1, fill, default");
		txtDIndex.addKeyListener(new DIndexListener());
		txtDIndex.addFocusListener(new DIndexListener());
		txtDIndex.setColumns(10);

		lbDConsumption = new JLabel("Consumption profile");
		panel.add(lbDConsumption, "2, 13");

		txtDConsumption = new JTextField();
		panel.add(txtDConsumption, "4, 13, fill, default");
		txtDConsumption.addKeyListener(new DConsumptionListener());
		txtDConsumption.addFocusListener(new DConsumptionListener());
		txtDConsumption.setColumns(10);

		JButton btDBrowse = new JButton("");
		panel.add(btDBrowse, "6, 13, right, center");
		btDBrowse.addMouseListener(new DBrowseListener());
		btDBrowse.setIcon(Icon.open);
		btDBrowse.setBorder(new EmptyBorder(3, 3, 3, 3));
		btDBrowse.setContentAreaFilled(false);

		JButton btDPlot = new JButton("");
		panel.add(btDPlot, "8, 13");
		btDPlot.setIcon(Icon.visualize);
		btDPlot.setBorder(new EmptyBorder(3, 3, 3, 3));
		btDPlot.setContentAreaFilled(false);
		btDPlot.addMouseListener(new DPlotListener());
		sDNetworkType.addItemListener(new DNetworkTypeListener());
		sDNetworkType.addMouseListener(new DNetworkTypeListener());

		plotPanel = new PlotPanel();
		plotPanel.setFocusable(false);
		plotPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(plotPanel, "1, 4, fill, fill");
		plotPanel.setVisible(true);
	}
}
