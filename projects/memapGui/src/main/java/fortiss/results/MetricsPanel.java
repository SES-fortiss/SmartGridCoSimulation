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
 * building
 */
public class MetricsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private boolean isSecondElement;
	public MetricsPanel() {
		isSecondElement = false;
		initialize();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// TODO: Dark mode implementation
	}

	public void initialize() {
		setBackground(Colors.gray);
		setLayout(new MigLayout("insets 4 4 4 4, center, width 99%", 
				"[center, 45%]30[center,45%]", 
				""));
	}
	
	public void addTitleWidget(String title) {
		TitleWidget sectionTitle = new TitleWidget(title);
		add(sectionTitle, "width 99%, align left, span 2, wrap");
	}
	
	public void addTextWidget(String title, double value, String unit, String toolTip) {
		JPanel textBoxWidget = new TextBoxWidget(title, value, unit);
		if (toolTip != null)
			textBoxWidget.setToolTipText(toolTip);
		addRow(textBoxWidget);
	}

	public void addBarPlotWidget(String title, String xAxisTitle, String yAxisTitle, int width, int height,
			List<CategorySeries> series, String toolTip) {
		JPanel barPlotWidget = new CategoryPlotWidget(title, xAxisTitle, yAxisTitle, width, height, series,
				CategorySeriesRenderStyle.Bar);
		if (toolTip != null) {
			barPlotWidget.setToolTipText(toolTip);
		}
		if (!((CategoryPlotWidget) barPlotWidget).isEmpty()) {
			addRow(barPlotWidget);
		}
	}

	public void addLinePlotWidget(String title, String xAxisTitle, String yAxisTitle, int width, int height,
			List<CategorySeries> series, String toolTip) {
		JPanel linePlotWidget = new CategoryPlotWidget(title, xAxisTitle, yAxisTitle, width, height, series,
				CategorySeriesRenderStyle.Line);
		if (toolTip != null) {
			linePlotWidget.setToolTipText(toolTip);
		}
		if (!((CategoryPlotWidget) linePlotWidget).isEmpty()) {
			addRow(linePlotWidget);
		}
	}

	public void addPiePlotWidget(String title, int width, int height, HashMap<String, Number> series, String toolTip) {
		JPanel piePlotWidget = new PieChartWidget(title, width, height, series, PieSeriesRenderStyle.Pie);
		if (toolTip != null) {
			piePlotWidget.setToolTipText(toolTip);
		}
		if (!((PieChartWidget) piePlotWidget).isEmpty()) {
			addRow(piePlotWidget);
		}
	}

	public void addDonutPlotWidget(String title, int width, int height, HashMap<String, Number> series,
			String toolTip) {
		JPanel donutPlotWidget = new PieChartWidget(title, width, height, series, PieSeriesRenderStyle.Donut);
		if (toolTip != null) {
			donutPlotWidget.setToolTipText(toolTip);
		}
		if (!((PieChartWidget) donutPlotWidget).isEmpty()) {
			addRow(donutPlotWidget);
		}
		
	}
	
	public ListWidget addListWidget(String context, String title, String toolTip) {
		JPanel listWidget = new ListWidget(title);
		if (toolTip != null)
			listWidget.setToolTipText(toolTip);
		addRow(listWidget);
		return (ListWidget) listWidget;
	}
	
	public void addComponentUsageWidget(String context, String title, HashMap<String, Number> energyProductionBySource,
			int places) {
		JPanel componentUsageWidget = new ComponentUsageWidget(title, energyProductionBySource, places);
		addRow(componentUsageWidget);
	}

	public void addRow(JPanel widget) {
		String constrain = "gapleft10, align center, growx, sizegroupx 1";
		if(isSecondElement) {
			constrain = "gapright10, align center, growx, sizegroupx 1, wrap";
			isSecondElement = false;
		} else {
			isSecondElement = true;
		}
		add(widget, constrain);
	}
}
