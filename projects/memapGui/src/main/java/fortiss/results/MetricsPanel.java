package fortiss.results;

import java.awt.ComponentOrientation;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.List;

import javax.swing.JPanel;

import org.knowm.xchart.CategorySeries;
import org.knowm.xchart.CategorySeries.CategorySeriesRenderStyle;
import org.knowm.xchart.PieSeries.PieSeriesRenderStyle;

import fortiss.gui.WrapLayout;
import fortiss.gui.style.Colors;
import fortiss.results.widgets.CategoryPlotWidget;
import fortiss.results.widgets.PieChartWidget;
import fortiss.results.widgets.TextBoxWidget;

/**
 * A panel that holds the metrics related to an entity: Global optimization or a
 * building
 */
public class MetricsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public MetricsPanel() {
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		initialize();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// TODO: Dark mode implementation
	}

	public void initialize() {
		
		setBackground(Colors.background);
		setLayout(new WrapLayout());
	}
	
	public void addTextWidget(String title, String value, String unit, String toolTip) {
		TextBoxWidget textBoxWidget = new TextBoxWidget(title, value, unit);
		if (toolTip != null)
			textBoxWidget.setToolTipText(toolTip);
		add(textBoxWidget);
	}

	public void addBarPlotWidget(String title, String xAxisTitle, String yAxisTitle, int width, int height,
			List<CategorySeries> series, String toolTip) {
		CategoryPlotWidget barPlotWidget = new CategoryPlotWidget(title, xAxisTitle, yAxisTitle, width, height, series,
				CategorySeriesRenderStyle.Bar);
		if (toolTip != null)
			barPlotWidget.setToolTipText(toolTip);
		add(barPlotWidget);
	}

	public void addLinePlotWidget(String title, String xAxisTitle, String yAxisTitle, int width, int height,
			List<CategorySeries> series, String toolTip) {
		CategoryPlotWidget linePlotWidget = new CategoryPlotWidget(title, xAxisTitle, yAxisTitle, width, height, series,
				CategorySeriesRenderStyle.Line);
		if (toolTip != null)
			linePlotWidget.setToolTipText(toolTip);
		add(linePlotWidget);
	}

	public void addPiePlotWidget(String title, int width, int height, HashMap<String, Number> series, String toolTip) {
		PieChartWidget piePlotWidget = new PieChartWidget(title, width, height, series, PieSeriesRenderStyle.Pie);
		if (toolTip != null)
			piePlotWidget.setToolTipText(toolTip);
		add(piePlotWidget);
	}

	public void addDonutPlotWidget(String title, int width, int height, HashMap<String, Number> series,
			String toolTip) {
		PieChartWidget donutPlotWidget = new PieChartWidget(title, width, height, series, PieSeriesRenderStyle.Donut);
		if (toolTip != null)
			donutPlotWidget.setToolTipText(toolTip);
		add(donutPlotWidget);
	}

}
