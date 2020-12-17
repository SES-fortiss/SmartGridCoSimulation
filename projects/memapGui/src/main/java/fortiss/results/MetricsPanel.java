package fortiss.results;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.List;

import javax.swing.JPanel;

import org.knowm.xchart.CategorySeries;
import org.knowm.xchart.CategorySeries.CategorySeriesRenderStyle;
import org.knowm.xchart.PieSeries.PieSeriesRenderStyle;

import fortiss.gui.style.Colors;
import fortiss.results.widgets.CategoryPlotWidget;
import fortiss.results.widgets.ComponentUsageWidget;
import fortiss.results.widgets.ListWidget;
import fortiss.results.widgets.PieChartWidget;
import fortiss.results.widgets.TextBoxWidget;
import fortiss.results.widgets.TitleWidget;
import net.miginfocom.swing.MigLayout;

/**
 * A panel that holds the metrics related to an entity: Global optimization or a
 * building.
 */
public class MetricsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public MetricsPanel() {
		initialize();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// TODO: Dark mode implementation
	}

	public void initialize() {
		setBackground(Colors.gray);
		setLayout(new MigLayout("insets 4 4 4 4, center, wrap 2, width 99%, fillx", "[center, 45%]30[center,45%]", ""));
	}

	public void addTitleWidget(String title) {
		TitleWidget sectionTitle = new TitleWidget(title);
		add(sectionTitle, "width 99%, align left, span 2, wrap");
	}

	public void addTextWidget(String title, double value, String unit, String toolTip) {
		JPanel textBoxWidget = new TextBoxWidget(title, value, unit);
		if (toolTip != null)
			textBoxWidget.setToolTipText(toolTip);
		add(textBoxWidget, "sizegroupx 1, growx");
	}

	/**
	 * Add a bar plot to the panel. If a plot is located in the first column and has
	 * a width larger than 800px, it will automatically span 2 columns. A plot added
	 * to the panel in an odd position (1, 3, 5, etc) is located in the first
	 * column.
	 */
	public void addBarPlotWidget(String title, String xAxisTitle, String yAxisTitle, int width, int height,
			List<CategorySeries> series, String toolTip) {
		CategoryPlotWidget barPlotWidget = new CategoryPlotWidget(title, xAxisTitle, yAxisTitle, width, height, series,
				CategorySeriesRenderStyle.Bar);
		if (toolTip != null) {
			barPlotWidget.setToolTipText(toolTip);
		}

		if (!(barPlotWidget).isEmpty()) {
			if (width > 800) {
				add(barPlotWidget, "span 2, growx");
			} else {
				add(barPlotWidget, "sizegroupx 1, growx");
			}
		}
	}

	public void addLinePlotWidget(String title, String xAxisTitle, String yAxisTitle, int width, int height,
			List<CategorySeries> series, String toolTip) {
		CategoryPlotWidget linePlotWidget = new CategoryPlotWidget(title, xAxisTitle, yAxisTitle, width, height, series,
				CategorySeriesRenderStyle.Line);
		if (toolTip != null) {
			linePlotWidget.setToolTipText(toolTip);
		}
		if (!linePlotWidget.isEmpty()) {
			add(linePlotWidget, "sizegroupx 1, growx");
		}
	}

	public void addPiePlotWidget(String title, int width, int height, HashMap<String, Number> series, String toolTip) {
		PieChartWidget piePlotWidget = new PieChartWidget(title, width, height, series, PieSeriesRenderStyle.Pie);
		if (toolTip != null) {
			piePlotWidget.setToolTipText(toolTip);
		}
		if (!piePlotWidget.isEmpty()) {
			add(piePlotWidget, "sizegroupx 1, growx");
		}
	}

	public void addDonutPlotWidget(String title, int width, int height, HashMap<String, Number> series,
			String toolTip) {
		PieChartWidget donutPlotWidget = new PieChartWidget(title, width, height, series, PieSeriesRenderStyle.Donut);
		if (toolTip != null) {
			donutPlotWidget.setToolTipText(toolTip);
		}
		if (!donutPlotWidget.isEmpty()) {
			add(donutPlotWidget, "sizegroupx 1, growx");
		}
	}

	public ListWidget addListWidget(String context, String title, String toolTip) {
		ListWidget listWidget = new ListWidget(title);
		if (toolTip != null) {
			listWidget.setToolTipText(toolTip);
		}
		add(listWidget, "sizegroupx 1, growx");
		return listWidget;
	}

	public void addComponentUsageWidget(String context, String title, HashMap<String, Number> energyProductionBySource,
			int places) {
		JPanel componentUsageWidget = new ComponentUsageWidget(title, energyProductionBySource, places);
		add(componentUsageWidget, "sizegroupx 1, growx");
	}

}
