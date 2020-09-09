package fortiss.gui;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.commands.ConfigureParameters;
import fortiss.gui.commands.LoadCommand;
import fortiss.gui.commands.ResetCommand;
import fortiss.gui.commands.SaveCommand;
import fortiss.gui.listeners.action.ButtonListener;
import fortiss.gui.listeners.action.DarkModeListener;
import fortiss.gui.listeners.action.HoverMouseListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.IconStore;

/**
 * Panel for action buttons
 */
public class ActionPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setForeground(Colors.normal);
		setBackground(Colors.background);
	}

	public ActionPanel() {
		StyleGenerator.setupStyle();
		initialize();
	}
	
	/**
	 * Initializes the contents of the panel.
	 */
	private void initialize() {
		setPreferredSize(new Dimension(PlanningToolWindow.WIDTH, 60));

		// Add load button
		JLabel lblLoad = new JLabel("");
		lblLoad.setBorder(new EmptyBorder(3, 3, 3, 3));
		lblLoad.setIcon(IconStore.open);
		lblLoad.setToolTipText("Load from Json File");
		lblLoad.addMouseListener(new ButtonListener(new LoadCommand()));
		lblLoad.addMouseListener(new HoverMouseListener());

		setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("350px:grow"),
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("26px"),
				ColumnSpec.decode("20px"),
				ColumnSpec.decode("26px"),
				ColumnSpec.decode("20px"),
				ColumnSpec.decode("26px"),
				ColumnSpec.decode("20px"),
				ColumnSpec.decode("26px"),
				ColumnSpec.decode("20px"),
				ColumnSpec.decode("center:600px:grow"),
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.PARAGRAPH_GAP_ROWSPEC,
				RowSpec.decode("26px"),}));
		add(lblLoad, "3, 2, left, top");

		// Add run button
		JLabel lblRun = new JLabel("");
		lblRun.setBorder(new EmptyBorder(3, 3, 3, 3));
		lblRun.setIcon(IconStore.run);
		lblRun.setToolTipText("Start simulation");
		lblRun.addMouseListener(new ButtonListener(new ConfigureParameters()));
		lblRun.addMouseListener(new HoverMouseListener());
		add(lblRun, "5, 2, left, top");

		// Add save button
		JLabel lblSave = new JLabel("");
		lblSave.setBorder(new EmptyBorder(3, 3, 3, 3));
		lblSave.setIcon(IconStore.saveAs);
		lblSave.setToolTipText("Save as");
		lblSave.addMouseListener(new ButtonListener(new SaveCommand()));
		lblSave.addMouseListener(new HoverMouseListener());
		add(lblSave, "7, 2, left, top");

		// Add reset button
		JLabel lblReset = new JLabel("");
		lblReset.setBorder(new EmptyBorder(3, 3, 3, 3));
		lblReset.setIcon(IconStore.reset);
		lblReset.setToolTipText("Reset");
		lblReset.addMouseListener(new ButtonListener(new ResetCommand()));
		lblReset.addMouseListener(new HoverMouseListener());
		add(lblReset, "9, 2, left, top");

		JLabel lblDarkmode = new JLabel("");
		lblDarkmode.setToolTipText("Select to turn dark mode on/off");
		lblDarkmode.setIcon(IconStore.offDarkMode);
		lblDarkmode.addMouseListener(new DarkModeListener());
		lblDarkmode.addMouseListener(new HoverMouseListener());
		add(lblDarkmode, "11, 2, right, center");
	}

}
