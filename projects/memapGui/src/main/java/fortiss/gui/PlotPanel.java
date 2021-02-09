package fortiss.gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.style.Styler;
import org.knowm.xchart.style.Styler.LegendPosition;
import org.knowm.xchart.style.Styler.YAxisPosition;
import org.knowm.xchart.style.markers.SeriesMarkers;

import fortiss.gui.style.Colors;

/**
 * Plots series of data
 */
public class PlotPanel extends XChartPanel<XYChart> {

	private static final long serialVersionUID = 1L;
	/**
	 * Boolean. It is <code>true</code> if some series are plotted,
	 * <code>false</code> otherwise
	 */
	private boolean plotted = false;

	/**
	 * Constructor for the class PlotPanel. Creates Data objects and initializes the
	 * series list.
	 */
	public PlotPanel() {
		super(new XYChartBuilder().theme(Styler.ChartTheme.XChart).build());
		setFocusable(false);
		getChart().getStyler().setChartBackgroundColor(Colors.background);
		getChart().getStyler().setYAxisDecimalPattern("#0.00");
		getChart().getStyler().setLocale(Locale.GERMAN);
		getChart().getStyler().setYAxisGroupPosition(0, YAxisPosition.Left);
		getChart().getStyler().setYAxisGroupPosition(1, YAxisPosition.Right);
		getChart().getStyler().setYAxisTitleVisible(false);
		getChart().getStyler().setLegendPosition(LegendPosition.OutsideS);
	}

	/**
	 * Add a series to the list of data series to be plotted (series).
	 * 
	 * @param series     a data series.
	 * @param seriesName a name for the data series.
	 */
	public void addSeries(String seriesName, ArrayList<Double> series) {
		if (!getChart().getSeriesMap().containsKey(seriesName)) {

			Comparator<Double> comparator = new Comparator<Double>() {
				@Override
				public int compare(Double v1, Double v2) {
					return v1.compareTo(v2);
				}
			};

			// Series with maximum value smaller than 0.5 in absolute value are plotted in a
			// separate axis
			if (Collections.max(series, comparator) < 0.5 && Collections.min(series, comparator) > -0.5
					&& getChart().getSeriesMap().size() > 0) {
				XYSeries seriesx = getChart().addSeries(seriesName, series);
				seriesx.setLabel(seriesName + "(right)");
				seriesx.setMarker(SeriesMarkers.NONE);
				seriesx.setYAxisGroup(1);
				getChart().getStyler().setYAxisMax(1, 0.5);
				getChart().getStyler().setYAxisMin(1, -0.5);
			} else {
				XYSeries seriesx = getChart().addSeries(seriesName, series);
				seriesx.setLabel(seriesName + "(left)");
				seriesx.setMarker(SeriesMarkers.NONE);
				seriesx.setYAxisGroup(0);
				if (Collections.max(series, comparator) < 0.5 && Collections.min(series, comparator) > -0.5) {
					getChart().getStyler().setYAxisMax(0, 0.5);
					getChart().getStyler().setYAxisMin(0, -0.5);
				} else {
					getChart().getStyler().setYAxisMax(0, null);
					getChart().getStyler().setYAxisMin(0, null);
				}
			}
		}
		repaint();
	}

	/**
	 * Remove a series from the list of data series to be plotted (series).
	 * 
	 * @param series     a data series.
	 * @param seriesName the name of the data series {@code series}
	 */
	public void removeSeries(String seriesName) {
		if (getChart().getSeriesMap().containsKey(seriesName)) {
			getChart().removeSeries(seriesName);
		}
	}

	/**
	 * Remove all series from the chart and from the list of data series. Call
	 * {@link #clearPlot()}
	 */
	public void clearSeries() {
		getChart().getSeriesMap().clear();
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
