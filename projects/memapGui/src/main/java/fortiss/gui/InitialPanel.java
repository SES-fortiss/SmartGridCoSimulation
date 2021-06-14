package fortiss.gui;

import java.awt.Graphics;

import javax.swing.JLabel;

import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import fortiss.media.IconStore;
import net.miginfocom.swing.MigLayout;

/**
 * Shows project name and company logo
 */

public class InitialPanel extends InformationPanel {
	/** Initial screen area title label */
	private JLabel lblMemap_1;

	private static final long serialVersionUID = 1L;

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Colors.background);
		setForeground(Colors.normal);
		lblMemap_1.setForeground(Colors.title);
	}
	
	/**
	 * Initialize the contents of the panel.
	 */
	public InitialPanel() {
		setLayout(new MigLayout("insets 0 0 0 0, filly, center, width 99%", 
				"[center]", 
				"[center]5[center]100[bottom]5[bottom]"));

		JLabel lblMemap = new JLabel("");
		lblMemap.setIcon(IconStore.memapLogo);
		add(lblMemap, "wrap");

		lblMemap_1 = new JLabel("<html><center>Multi-energy Management <br/> and Aggregation Platform <br/>(MEMAP) </center></html>");
		lblMemap_1.setFont(Fonts.getOswald(FontSize.HUGE));
		add(lblMemap_1, "wrap");

		JLabel lblFortissLogo = new JLabel("");
		lblFortissLogo.setIcon(IconStore.fortissLogo);
		add(lblFortissLogo, "wrap");
		
		JLabel lblTumLogo = new JLabel("");
		lblTumLogo.setIcon(IconStore.tumLogo);
		add(lblTumLogo, "wrap");
	}

	@Override
	public void update() {
		// Nothing to update
	}

}
