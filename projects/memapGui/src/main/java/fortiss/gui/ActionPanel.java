package fortiss.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.listeners.action.DarkModeListener;
import fortiss.gui.listeners.action.LoadListener;
import fortiss.gui.listeners.action.ResetListener;
import fortiss.gui.listeners.action.RunListener;
import fortiss.gui.listeners.action.SaveListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.Icon;

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
		setPreferredSize(new Dimension(1200, 60));

		// Add load button
		JButton bt_load = new JButton("");
		bt_load.setContentAreaFilled(false);
		bt_load.setBorder(new EmptyBorder(3, 3, 3, 3));
		bt_load.setFocusPainted(false);
		bt_load.setIcon(Icon.open);
		bt_load.setToolTipText("Load from Json File");
		bt_load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bt_load.addMouseListener(new LoadListener());

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
		add(bt_load, "3, 2, left, top");

		// Add run button
		JButton bt_run = new JButton("");
		bt_run.setContentAreaFilled(false);
		bt_run.setBorder(new EmptyBorder(3, 3, 3, 3));
		bt_run.setFocusPainted(false);
		bt_run.setIcon(Icon.run);
		bt_run.setToolTipText("Start simulation");
		bt_run.addMouseListener(new RunListener());
		add(bt_run, "5, 2, left, top");

		// Add save button
		JButton bt_save = new JButton("");
		bt_save.setContentAreaFilled(false);
		bt_save.setBorder(new EmptyBorder(3, 3, 3, 3));
		bt_save.setFocusPainted(false);
		bt_save.setIcon(Icon.saveAs);
		bt_save.setToolTipText("Save as");
		bt_save.addMouseListener(new SaveListener());
		add(bt_save, "7, 2, left, top");

		// Add reset button
		JButton bt_Reset = new JButton("");
		bt_Reset.setContentAreaFilled(false);
		bt_Reset.setBorder(new EmptyBorder(3, 3, 3, 3));
		bt_Reset.setFocusPainted(false);
		bt_Reset.setIcon(Icon.reset);
		bt_Reset.setToolTipText("Reset");
		bt_Reset.addMouseListener(new ResetListener());
		add(bt_Reset, "9, 2, left, top");

		JLabel lblDarkmode = new JLabel("");
		lblDarkmode.setToolTipText("Select to turn dark mode on/off");
		lblDarkmode.setIcon(Icon.offDarkMode);
		lblDarkmode.addMouseListener(new DarkModeListener());
		add(lblDarkmode, "11, 2, right, center");
	}

}
