package fortiss.results.widgets;

import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.PieSeries.PieSeriesRenderStyle;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.style.PieStyler.AnnotationType;
import org.knowm.xchart.style.Styler.LegendPosition;

import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import net.miginfocom.swing.MigLayout;

public class PieChartWidget extends JPanel {

	private static final long serialVersionUID = 1L;
	private HashMap<String, Number> series;

	public PieChartWidget(String title, int width, int height, HashMap<String, Number> series,
			PieSeriesRenderStyle style) {
		setLayout(new MigLayout("insets 0 0 0 0, width 100%, gapy 0", "", ""));
		setBorder(BorderFactory.createLineBorder(Colors.green));

		JLabel titleLabel = new JLabel("    " + title.toUpperCase(), SwingConstants.LEFT);
		titleLabel.setAlignmentX(LEFT_ALIGNMENT);
		titleLabel.setFont(Fonts.getOswald(FontSize.SMALL));
		titleLabel.setOpaque(true);
		titleLabel.setBackground(Colors.gray);
		titleLabel.setForeground(Colors.normal);

		JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
		separator.setForeground(Colors.green);
		separator.setPreferredSize(new Dimension(400, 1));

		XChartPanel<PieChart> chart = new XChartPanel<PieChart>(
				new PieChartBuilder().width(width).height(height).build());

		this.series = series;
		chart.getChart().getStyler().setDefaultSeriesRenderStyle(style);
		chart.getChart().getStyler().setChartBackgroundColor(Colors.white);
		chart.getChart().getStyler().setChartFontColor(Colors.accent1);
		chart.getChart().getStyler().setChartPadding(10);
		chart.getChart().getStyler().setChartTitleFont(Fonts.getOswald(FontSize.NORMAL));
		chart.getChart().getStyler().setChartTitlePadding(15);
		chart.getChart().getStyler().setLegendFont(Fonts.getOpenSans(FontSize.TINY));
		chart.getChart().getStyler().setLegendPosition(LegendPosition.OutsideE);
		chart.getChart().getStyler().setLegendSeriesLineLength(20);
		chart.getChart().getStyler().setAnnotationType(AnnotationType.Percentage);
		chart.getChart().getStyler().setAnnotationDistance(1.15);
		chart.getChart().getStyler().setPlotContentSize(.7);
		chart.getChart().getStyler().setStartAngleInDegrees(90);

		series.entrySet().forEach((serie) -> chart.getChart().addSeries(serie.getKey(), serie.getValue()));
		
		add(titleLabel, "width 100%, align left, wrap");
		add(separator, "width 100%, wrap");
		add(chart, "width 100%, wrap");
	}

	public boolean isEmpty() {
		double sum = 0;
		for (Number item : series.values()) {
			sum = sum + item.doubleValue();
		}
		return sum == 0.0;
	}
}
