package fortiss.gui;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

import javax.swing.JPanel;

import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.style.Styler.YAxisPosition;
import org.knowm.xchart.style.markers.SeriesMarkers;

import fortiss.gui.style.Colors;

/**
 * Plots series of data
 */
public class PlotPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	/**
	 * Boolean. It is <code>true</code> if some series are plotted,
	 * <code>false</code> otherwise
	 */
	private boolean plotted = false;

	/** Chart containing data series */
	private XYChart chart;

	/**
	 * Constructor for the class PlotPanel. Creates Data objects and initializes the
	 * series list.
	 */
	public PlotPanel() {
		setFocusable(false);
		chart = new XYChart(getWidth(), getHeight());
		chart.getStyler().setChartBackgroundColor(Colors.background);
		chart.getStyler().setYAxisDecimalPattern("#0.00");
		chart.getStyler().setLocale(Locale.GERMAN);
		chart.getStyler().setYAxisGroupPosition(0, YAxisPosition.Left);
		chart.getStyler().setYAxisGroupPosition(1, YAxisPosition.Right);
		chart.getStyler().setYAxisTitleVisible(false);
	}

	/**
	 * Add a series to the list of data series to be plotted (series).
	 * 
	 * @param series     a data series.
	 * @param seriesName a name for the data series.
	 */
	public void addSeries(String seriesName, ArrayList<Double> series) {

		if (!chart.getSeriesMap().containsKey(seriesName)) {

			double[] xvalues = new double[series.size()];
			double[] yvalues = new double[series.size()];
			for (int i = 0; i < xvalues.length; i++) {
				xvalues[i] = i;
				yvalues[i] = series.get(i);
			}

			// Series with maximum value smaller than 0.5 in absolute value are plotted in a
			// separate axis
			if (Collections.max(series) < 0.5 && Collections.min(series) > -0.5 && chart.getSeriesMap().size() > 0) {
				XYSeries seriesx = chart.addSeries(seriesName, xvalues, yvalues);
				seriesx.setLabel(seriesName + "(right)");
				seriesx.setMarker(SeriesMarkers.NONE);
				seriesx.setYAxisGroup(1);
				chart.getStyler().setYAxisMax(1, 0.5);
				chart.getStyler().setYAxisMin(1, -0.5);
			} else {
				XYSeries seriesx = chart.addSeries(seriesName, xvalues, yvalues);
				seriesx.setLabel(seriesName + "(left)");
				seriesx.setMarker(SeriesMarkers.NONE);
				seriesx.setYAxisGroup(0);
				if (Collections.max(series) < 0.5 && Collections.min(series) > -0.5) {
					chart.getStyler().setYAxisMax(0, 0.5);
					chart.getStyler().setYAxisMin(0, -0.5);
				} else {
					chart.getStyler().setYAxisMax(0, null);
					chart.getStyler().setYAxisMin(0, null);
				}
			}
		}
	}

	/**
	 * Remove a series from the list of data series to be plotted (series).
	 * 
	 * @param series     a data series.
	 * @param seriesName the name of the data series {@code series}
	 */
	public void removeSeries(String seriesName) {
		if (chart.getSeriesMap().containsKey(seriesName)) {
			chart.removeSeries(seriesName);
		}
	}

	/**
	 * Remove all series from the chart and from the list of data series. Call
	 * {@link #clearPlot()}
	 */
	public void clearSeries() {
		chart.getSeriesMap().clear();
		clearPlot();
	}

	/**
	 * Remove all plotted series from plot panel. Ensure that an off-screen image is
	 * cleared to the background color
	 */
	public void clearPlot() {
		Graphics2D gf = (Graphics2D) getGraphics();
		gf.setColor(Colors.background);
		gf.fillRect(0, 0, getWidth(), getHeight());
	}

	/**
	 * Plots all the data series in the {@code series} list.
	 */
	public void paintSeries() {
		Graphics2D gf = (Graphics2D) this.getGraphics();
		chart.paint(gf, getWidth(), getHeight());
		setPlotted(true);
	}

	/**
	 * @return plotter
	 */
	public boolean isPlotted() {
		return plotted;
	}

	/**
	 * Set a value for plotter.
	 */
	public void setPlotted(boolean plotted) {
		this.plotted = plotted;
	}
}
