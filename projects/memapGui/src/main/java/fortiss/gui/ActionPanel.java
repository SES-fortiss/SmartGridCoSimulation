package fortiss.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import fortiss.gui.commands.ConfigureBIMSession;
import fortiss.gui.commands.ConfigureParameters;
import fortiss.gui.commands.LoadCommand;
import fortiss.gui.commands.ResetCommand;
import fortiss.gui.commands.SaveAsCommand;
import fortiss.gui.commands.SaveCommand;
import fortiss.gui.listeners.action.ButtonListener;
import fortiss.gui.listeners.action.HoverMouseListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.IconStore;
import net.miginfocom.swing.MigLayout;

/**
 * Panel for action buttons
 */
public class ActionPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblFileStatus;

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
		setPreferredSize(new Dimension(1047, 60));

		setLayout(new MigLayout("insets 4 4 4 4, center, width 99%, hidemode 0", "[]40[]", ""));

		// Add load button
		JLabel lblLoad = new JLabel("");
		lblLoad.setBorder(new EmptyBorder(3, 3, 3, 3));
		lblLoad.setIcon(IconStore.open);
		lblLoad.setToolTipText("Load from Json File");
		lblLoad.addMouseListener(new ButtonListener(new LoadCommand()));
		lblLoad.addMouseListener(new HoverMouseListener());
		add(lblLoad);

		// Add load button
		JLabel lblConfigureBIMSession = new JLabel("");
		lblConfigureBIMSession.setBorder(new EmptyBorder(3, 3, 3, 3));
		lblConfigureBIMSession.setIcon(IconStore.openBim);
		lblConfigureBIMSession.setToolTipText("Load from BIM Server");
		lblConfigureBIMSession.addMouseListener(new ButtonListener(new ConfigureBIMSession()));
		lblConfigureBIMSession.addMouseListener(new HoverMouseListener());
		add(lblConfigureBIMSession);

		// Add run button
		JLabel lblRun = new JLabel("");
		lblRun.setBorder(new EmptyBorder(3, 3, 3, 3));
		lblRun.setIcon(IconStore.run);
		lblRun.setToolTipText("Start simulation");
		lblRun.addMouseListener(new ButtonListener(new ConfigureParameters()));
		lblRun.addMouseListener(new HoverMouseListener());
		add(lblRun);

		// Add save button
		JLabel lblSave = new JLabel("");
		lblSave.setBorder(new EmptyBorder(3, 3, 3, 3));
		lblSave.setIcon(IconStore.save);
		lblSave.setToolTipText("Save");
		lblSave.addMouseListener(new ButtonListener(new SaveCommand()));
		lblSave.addMouseListener(new HoverMouseListener());
		add(lblSave);

		// Add save button
		JLabel lblSaveAs = new JLabel("");
		lblSaveAs.setBorder(new EmptyBorder(3, 3, 3, 3));
		lblSaveAs.setIcon(IconStore.saveAs);
		lblSaveAs.setToolTipText("Save as");
		lblSaveAs.addMouseListener(new ButtonListener(new SaveAsCommand()));
		lblSaveAs.addMouseListener(new HoverMouseListener());
		add(lblSaveAs);

		// Add reset button
		JLabel lblReset = new JLabel("");
		lblReset.setBorder(new EmptyBorder(3, 3, 3, 3));
		lblReset.setIcon(IconStore.reset);
		lblReset.setToolTipText("Reset");
		lblReset.addMouseListener(new ButtonListener(new ResetCommand()));
		lblReset.addMouseListener(new HoverMouseListener());
		add(lblReset);

		lblFileStatus = new JLabel("Topology saved!");
		lblFileStatus.setFont(Fonts.getOpenSans(FontSize.SMALL));
		lblFileStatus.setBorder(new EmptyBorder(3, 3, 3, 3));
		lblFileStatus.setPreferredSize(new Dimension(200, 50));
		add(lblFileStatus);

		// TODO: Fix or remove dark mode
		/*
		 * JLabel lblDarkmode = new JLabel("");
		 * lblDarkmode.setToolTipText("Select to turn dark mode on/off");
		 * lblDarkmode.setIcon(IconStore.offDarkMode); lblDarkmode.addMouseListener(new
		 * DarkModeListener()); lblDarkmode.addMouseListener(new HoverMouseListener());
		 * add(lblDarkmode, "12, 2, right, center"); lblDarkmode.setVisible(false);
		 */
	}

	public void setUnsaved() {
		lblFileStatus.setText("** Unsaved changes");
		lblFileStatus.setVisible(true);
	}

	public void setSaved() {
		Timer timer = new Timer(1000, new AbstractAction() {
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent ae) {
				lblFileStatus.setVisible(false);
			}
		});
		timer.setRepeats(false);

		timer.start();
		lblFileStatus.setText("Topology saved!");
		lblFileStatus.setVisible(true);
	}

}
