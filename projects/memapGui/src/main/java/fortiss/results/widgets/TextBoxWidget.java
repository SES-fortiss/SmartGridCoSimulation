package fortiss.results.widgets;

import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;

public class TextBoxWidget extends JPanel {

	private static final long serialVersionUID = 1L;

	public TextBoxWidget(String title, String value, String unit){
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setAlignmentX(CENTER_ALIGNMENT);
		setAlignmentY(CENTER_ALIGNMENT);
		JLabel titleLabel = new JLabel(title.toUpperCase(), SwingConstants.CENTER);
		titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		titleLabel.setFont(Fonts.getOswald());
		titleLabel.setForeground(Colors.accent1);
		JLabel metricLabel = new JLabel(value.toUpperCase(), SwingConstants.CENTER);
		metricLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		metricLabel.setFont(Fonts.getOswald(20));
		metricLabel.setForeground(Colors.accent2);
		JLabel unitLabel = new JLabel(unit.toUpperCase(), SwingConstants.CENTER);
		unitLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		unitLabel.setFont(Fonts.getOswald(17));

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createVerticalStrut(10));
		add(titleLabel);
		add(Box.createVerticalStrut(10));
		add(metricLabel);
		add(Box.createVerticalStrut(10));
		add(unitLabel);
		add(Box.createVerticalStrut(10));
	}
}
