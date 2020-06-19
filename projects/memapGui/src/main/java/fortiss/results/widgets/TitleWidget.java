package fortiss.results.widgets;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import fortiss.gui.style.Fonts;

public class TitleWidget extends JLabel {

	private static final long serialVersionUID = 1L;

	public TitleWidget(String title, Color color, int fontSize) {
		setText(title.toUpperCase());
		setHorizontalTextPosition(SwingConstants.CENTER);
		setAlignmentX(Component.CENTER_ALIGNMENT);
		setFont(Fonts.getOswald(fontSize));
		setForeground(color);
	}
	
	public TitleWidget(String title) {
		setText(title.toUpperCase());
		setHorizontalTextPosition(SwingConstants.CENTER);
		setAlignmentX(Component.CENTER_ALIGNMENT);
		setFont(Fonts.getOswald(22));
		setForeground(Color.BLACK);
	}
}
