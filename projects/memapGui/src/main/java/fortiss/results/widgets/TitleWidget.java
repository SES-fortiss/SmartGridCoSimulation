package fortiss.results.widgets;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;

public class TitleWidget extends JLabel {

	private static final long serialVersionUID = 1L;

	public TitleWidget(String title, Color fontColor, Color backgroundColor, int fontSize) {
		setText(title.toUpperCase());
		setHorizontalTextPosition(SwingConstants.CENTER);
		setAlignmentX(Component.CENTER_ALIGNMENT);
		setFont(Fonts.getOpenSans(fontSize));
		setBackground(backgroundColor);
		setForeground(fontColor);
		setBorder(BorderFactory.createEmptyBorder(2, 10, 2, 10));
	}
	
	public TitleWidget(String title) {
		setText(title.toUpperCase());
		setHorizontalTextPosition(SwingConstants.CENTER);
		setAlignmentX(Component.CENTER_ALIGNMENT);
		setFont(Fonts.getOpenSans(FontSize.LARGE));
		setBackground(Colors.green);
		setOpaque(true);
		setForeground(Colors.white);
		setBorder(BorderFactory.createEmptyBorder(2, 10, 2, 10));
	}
}
