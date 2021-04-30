package fortiss.results.widgets;

import java.awt.Dimension;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.CategorySeries;
import org.knowm.xchart.CategorySeries.CategorySeriesRenderStyle;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.style.Styler.LegendPosition;

import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import net.miginfocom.swing.MigLayout;

public class CategoryPlotWidget extends JPanel {

	private static final long serialVersionUID = 1L;
	private List<CategorySeries> series;
	/**
	 * @param title plot title
	 * @param xAxisTitle title of the x axis
	 * @param yAxisTitle title of the y axis
	 * @param width widget width
	 * @param height widget height
	 * @param series list of CategorySeries
	 * @param style Options: Area, Bar, Line, Scatter, SteppedBar, Stick
	 */
	public CategoryPlotWidget(String title, String xAxisTitle, String yAxisTitle, int width, int height,
			List<CategorySeries> series, CategorySeriesRenderStyle style) {

		setLayout(new MigLayout("insets 0 0 0 0, width 100%, fillx, gapy 0", "", ""));
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
		
		XChartPanel<CategoryChart> chart = new XChartPanel<CategoryChart>(new CategoryChartBuilder().width(width).height(height).xAxisTitle(xAxisTitle)
				.yAxisTitle(yAxisTitle).build());

		this.series = series;
		chart.getChart().getStyler().setDefaultSeriesRenderStyle(style);
		chart.getChart().getStyler().setChartBackgroundColor(Colors.white);
		//chart.getChart().getStyler().setStacked(true);
		chart.getChart().getStyler().setChartFontColor(Colors.accent1);
		chart.getChart().getStyler().setChartPadding(10);
		chart.getChart().getStyler().setChartTitleFont(Fonts.getOswald(FontSize.NORMAL));
		chart.getChart().getStyler().setChartTitlePadding(0);
		chart.getChart().getStyler().setLegendFont(Fonts.getOpenSans(FontSize.TINY));
		chart.getChart().getStyler().setLegendPosition(LegendPosition.OutsideE);
		chart.getChart().getStyler().setLegendSeriesLineLength(20);
		chart.getChart().getStyler().setAxisTitleFont(Fonts.getOpenSans(FontSize.TINY));
		chart.getChart().getStyler().setAxisTickLabelsFont(Fonts.getOpenSans(FontSize.TINY));
		chart.getChart().getStyler().setXAxisMaxLabelCount(10);
		
		series.forEach((serie) -> chart.getChart().addSeries(serie.getName(), (List<?>) serie.getXData(),
				(List<? extends Number>) serie.getYData()));

		add(titleLabel, "width 100%, align left, wrap");
		add(separator, "width 100%, wrap");
		add(chart, "width 100%, wrap");
	}
	
	public boolean isEmpty() {
		// If at least one series has non-zero values, the plot is not empty
		for (CategorySeries item : series) {
			if(item.getYMax() != 0 && item.getYMin() != 0 ) {
				return false;
			}
		}
		return true;
	}
}
