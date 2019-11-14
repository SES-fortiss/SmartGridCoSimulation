package fortiss.gui;

import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.media.Icon;

/**
 * Shows project name and company logo
 */

public class InitialPanel extends JPanel {
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
		setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("center:449px"), },
				new RowSpec[] { RowSpec.decode("250px"), FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("120px"), }));

		JLabel lblMemap = new JLabel("");
		lblMemap.setIcon(Icon.memapLogo);
		add(lblMemap, "1, 1, center, center");

		lblMemap_1 = new JLabel("Multi-energy Management and Aggregation Platform (MEMAP)");
		lblMemap_1.setFont(Fonts.getOswald());
		add(lblMemap_1, "1, 4");

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(Icon.fortissLogo);
		add(lblLogo, "1, 6, center, center");
	}

}
