package fortiss.results.widgets;

import java.util.List;

import javax.swing.UIManager;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.CategorySeries;
import org.knowm.xchart.CategorySeries.CategorySeriesRenderStyle;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.style.Styler.LegendPosition;

import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;

public class CategoryPlotWidget extends XChartPanel<CategoryChart> {

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

		super(new CategoryChartBuilder().width(width).height(height).title(title.toUpperCase()).xAxisTitle(xAxisTitle)
				.yAxisTitle(yAxisTitle).build());

		this.series = series;
		getChart().getStyler().setDefaultSeriesRenderStyle(style);
		// getChart().getStyler().setChartBackgroundColor(Colors.background);
		getChart().getStyler().setChartBackgroundColor(UIManager.getColor("Panel.background"));
		getChart().getStyler().setChartFontColor(Colors.accent1);
		getChart().getStyler().setChartPadding(10);
		getChart().getStyler().setChartTitleFont(Fonts.getOswald(18));
		getChart().getStyler().setChartTitlePadding(15);
		getChart().getStyler().setLegendFont(Fonts.getOpenSans(12));
		getChart().getStyler().setLegendPosition(LegendPosition.InsideNE);
		getChart().getStyler().setLegendSeriesLineLength(20);
		getChart().getStyler().setAxisTitleFont(Fonts.getOpenSans(12));
		getChart().getStyler().setAxisTickLabelsFont(Fonts.getOpenSans(12));

		series.forEach((serie) -> getChart().addSeries(serie.getName(), (List<?>) serie.getXData(),
				(List<? extends Number>) serie.getYData()));
	}
	
	public boolean isEmpty() {
		double sum = 0;
		for (CategorySeries item : series) {
			sum = item.getYMax() + item.getYMin();
		}
		return sum == 0;
	}
}
