package fortiss.results.widgets;

import java.awt.Dimension;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import net.miginfocom.swing.MigLayout;

public class ListWidget extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public ListWidget(String title) {
		setLayout(new MigLayout("insets 0 0 0 0, width 99%, gapy 0", "[45%]30[45%]", ""));
		setBorder(BorderFactory.createLineBorder(Colors.green));
		setBackground(Colors.white);
		
		JLabel titleLabel = new JLabel ("    " + title.toUpperCase());
		titleLabel.setFont(Fonts.getOswald(FontSize.SMALL));
		titleLabel.setBackground(Colors.gray);
		titleLabel.setOpaque(true);
		titleLabel.setForeground(Colors.normal);
		
		JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
		separator.setForeground(Colors.green);
		separator.setPreferredSize(new Dimension(400, 1));
		
		add(titleLabel, "width 100%, span 2, wrap");
		add(separator, "width 100%, span 2, wrap");
		
	}
	
	public void addRow(String name, double value, String unit) {
		JLabel nameLabel = new JLabel (name);
		nameLabel.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		nameLabel.setForeground(Colors.green);
		
		JLabel valueLabel = new JLabel (new DecimalFormat("#.0##").format(value) + " " + unit);
		valueLabel.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		valueLabel.setForeground(Colors.darkGray);
		
		add(nameLabel, "gapleft10");
		add(valueLabel, "gapright10, wrap");
	}
	
}
