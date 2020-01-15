package fortiss.gui;

import java.awt.Cursor;
import java.awt.Graphics;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.JButton;
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

import fortiss.datastructures.Data;
import fortiss.gui.listeners.button.DBrowseListener;
import fortiss.gui.listeners.button.DPlotListener;
import fortiss.gui.listeners.textfield.DConsumptionListener;
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
	/** Demand area title label */
	private JLabel lblDemand;
	/** Demand name label */
	private JLabel lbDName;
	/** Demand consumption file path label */
	private JLabel lbDConsumption;
	/** Example of consumption file format */
	private JLabel lblCsvformat;
	/** CSV format instructions */
	private JLabel lblCsvInstructions;
	/** consumption file (CSV) warning */
	private JLabel lblCsvWarning;
	/** Plot panel */
	public PlotPanel plotPanel = new PlotPanel();
	/** Auxiliary panel */
	private JPanel panel;
	/** Data read from consumption profiles file */
	private Data data;

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
		lbDConsumption.setForeground(Colors.normal);
		lblCsvInstructions.setForeground(Colors.normal);
		lblCsvWarning.setForeground(Colors.normal);
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
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("15dlu"), FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, }));

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

		lbDConsumption = new JLabel("Consumption profile");
		panel.add(lbDConsumption, "2, 9");

		txtDConsumption = new JTextField();
		panel.add(txtDConsumption, "4, 9, fill, default");
		txtDConsumption.addKeyListener(new DConsumptionListener());
		txtDConsumption.addFocusListener(new DConsumptionListener());
		txtDConsumption.setColumns(10);

		JButton btDBrowse = new JButton("");
		panel.add(btDBrowse, "6, 9, right, center");
		btDBrowse.addMouseListener(new DBrowseListener());
		btDBrowse.setIcon(Icon.open);
		btDBrowse.setBorder(new EmptyBorder(3, 3, 3, 3));
		btDBrowse.setContentAreaFilled(false);

		JButton btDPlot = new JButton("");
		panel.add(btDPlot, "8, 9");
		btDPlot.setIcon(Icon.visualize);
		btDPlot.setBorder(new EmptyBorder(3, 3, 3, 3));
		btDPlot.setContentAreaFilled(false);

		lblCsvInstructions = new JLabel(
				"<html> <b> Consumption file format </b> <br/> <br/> CSV file with no headers <br/> Column 1: Heat &emsp; Column 2: Electricity <br/> Decimal separator: , <br/> Column separator: ;</html>");
		panel.add(lblCsvInstructions, "2, 13, 2, 1, left, default");

		lblCsvformat = new JLabel("");
		lblCsvformat.setIcon(Icon.csvFormat);
		panel.add(lblCsvformat, "4, 13, 6, 1, right, center");

		lblCsvWarning = new JLabel(
				"<html><font face=\"verdana\" color=\"red\">&#9888;</font> Note: If no consumption file is selected the default is zero</html>");
		panel.add(lblCsvWarning, "2, 15, 8, 1");
		btDPlot.addMouseListener(new DPlotListener());

		plotPanel = new PlotPanel();
		plotPanel.setFocusable(false);
		plotPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(plotPanel, "1, 4, fill, fill");
		plotPanel.setVisible(true);
	}

	/**
	 * Set data to new data object. Add the series in the new data set to the chart
	 * and set plotter to <code>false</code>
	 */
	public void setData(String location) {
		try {
			this.data = new Data(location, false);
		} catch (IOException | ParseException e) {
			this.data = null;
			System.err.println("Data for demand at " + location + " could not be read. Using zeros only.");
			txtDConsumption.setText("");
			Designer.buildings.get(Designer.currentBuilding).getDemand().get(Designer.currentComponent).setConsumptionProfile("");
		}

		if (!data.equals(null)) {
			plotPanel.clearSeries();
			plotPanel.addSeries("Heat", data.getSeries(0));
			plotPanel.addSeries("Electricity", data.getSeries(1));
			plotPanel.setPlotted(false);
		}
	}
}
