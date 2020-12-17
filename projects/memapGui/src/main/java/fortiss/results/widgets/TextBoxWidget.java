package fortiss.results.widgets;

import java.awt.Dimension;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;

public class TextBoxWidget extends JPanel {

	private static final long serialVersionUID = 1L;

	public TextBoxWidget(String title, double value, String unit) {
		setPreferredSize(new Dimension(250, 100));
		setBackground(Colors.white);
		setBorder(new LineBorder(Colors.green));
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.UNRELATED_GAP_ROWSPEC,}));

		DecimalFormat df = new DecimalFormat("0.0#");
		
		JLabel titleLabel = new JLabel("    " + title.toUpperCase(), SwingConstants.LEFT);
		titleLabel.setFont(Fonts.getOswald(FontSize.SMALL));
		titleLabel.setOpaque(true);
		titleLabel.setBackground(Colors.gray);
		titleLabel.setForeground(Colors.normal);
		
		JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
		separator.setForeground(Colors.green);
		separator.setPreferredSize(new Dimension(400, 1));

		JLabel metricLabel = new JLabel(df.format(value).toUpperCase() + " " + unit.toUpperCase(), SwingConstants.CENTER);
		metricLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		metricLabel.setFont(Fonts.getOpenSans(FontSize.LARGE));
		metricLabel.setForeground(Colors.normal);

		add(titleLabel, "1, 1, 3, 1, fill, default");
		add(separator, "1, 2, 3, 1, fill, top");
		add(metricLabel, "2, 4, center, center");

	}
}
