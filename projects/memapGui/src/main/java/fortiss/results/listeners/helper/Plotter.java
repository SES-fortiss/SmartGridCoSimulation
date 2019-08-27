package fortiss.results.listeners.helper;

import java.awt.Graphics2D;
import java.util.ArrayList;

import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.style.markers.SeriesMarkers;

import fortiss.results.Reporter;

/**
 * Plots series of data
 */
public class Plotter {
	public ArrayList<ArrayList<Double>> series;
	public ArrayList<String> seriesNames;
	public XYChart chart;

	/**
	 * Constructor for the class Plotter. Creates Data objects and initializes the
	 * series list.
	 */
	public Plotter() {
		series = new ArrayList<>();
		seriesNames = new ArrayList<>();
	}

	/**
	 * Add a data series to the list of data series to be plotted (series).
	 * 
	 * @param series     a data series.
	 * @param seriesName a name for the data series.
	 */
	public void addSeries(String seriesName, ArrayList<Double> series) {
		if (!this.seriesNames.contains(seriesName)) {
			this.seriesNames.add(seriesName);
			this.series.add(series);
		}
	}

	/**
	 * Remove a data series from the list of data series to be plotted (series).
	 * 
	 * @param series     a data series.
	 * @param seriesName the name of the data series {@code series}
	 */
	public void removeSeries(String seriesName, ArrayList<Double> series) {
		if (this.series.contains(series)) {
			this.seriesNames.remove(seriesName);
			this.series.remove(series);
		}
	}

	/**
	 * Plots all the data this.series in the {@code series} list. Note: all data
	 * series are plotted against the time series of the first building.
	 */
	public void paintSeries() {
		chart = new XYChart(Reporter.plPlot.getWidth(), Reporter.plPlot.getHeight());
		for (int i = 0; i < series.size(); i++) {
			XYSeries seriesx = chart.addSeries(seriesNames.get(i), Reporter.output.getData(0).values.get(0),
					series.get(i));
			seriesx.setMarker(SeriesMarkers.NONE);
		}
		chart.paint((Graphics2D) Reporter.plPlot.getGraphics(), Reporter.plPlot.getWidth(),
				Reporter.plPlot.getHeight());
	}

}
