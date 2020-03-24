package fortiss.results.widgets;

import java.util.HashMap;

import javax.swing.UIManager;

import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.PieSeries.PieSeriesRenderStyle;
import org.knowm.xchart.style.PieStyler.AnnotationType;
import org.knowm.xchart.style.Styler.LegendPosition;

import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;

import org.knowm.xchart.XChartPanel;

public class PieChartWidget extends XChartPanel<PieChart> {

	private static final long serialVersionUID = 1L;

	public PieChartWidget(String title, int width, int height, HashMap<String, Number> series,
			PieSeriesRenderStyle style) {
		super(new PieChartBuilder().width(width).height(height).title(title.toUpperCase()).build());

		getChart().getStyler().setDefaultSeriesRenderStyle(style);
		getChart().getStyler().setChartBackgroundColor(UIManager.getColor("Panel.background"));
		getChart().getStyler().setChartFontColor(Colors.accent1);
		getChart().getStyler().setChartPadding(10);
		getChart().getStyler().setChartTitleFont(Fonts.getOswald(18));
		getChart().getStyler().setChartTitlePadding(15);
		getChart().getStyler().setLegendFont(Fonts.getOpenSans(12));
		getChart().getStyler().setLegendPosition(LegendPosition.OutsideS);
		getChart().getStyler().setLegendSeriesLineLength(20);
		getChart().getStyler().setAnnotationType(AnnotationType.Percentage);
		getChart().getStyler().setAnnotationDistance(1.15);
		getChart().getStyler().setPlotContentSize(.7);
		getChart().getStyler().setStartAngleInDegrees(90);
		
		series.entrySet().forEach((serie) -> getChart().addSeries(serie.getKey(), serie.getValue()));
	}
}