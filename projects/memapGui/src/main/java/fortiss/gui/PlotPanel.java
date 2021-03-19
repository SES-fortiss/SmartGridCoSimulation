package fortiss.gui;

import java.util.ArrayList;
import java.util.Locale;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.CategorySeries;
import org.knowm.xchart.CategorySeries.CategorySeriesRenderStyle;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.style.CategoryStyler;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.style.Styler.LegendPosition;
import org.knowm.xchart.style.Styler.YAxisPosition;
import org.knowm.xchart.style.markers.SeriesMarkers;

/**
 * Plots series of data
 */
public class PlotPanel extends XChartPanel<CategoryChart> {

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
		super(new CategoryChartBuilder()
	            .theme(ChartTheme.Matlab)
	            .build());
	        
		//super(new XYChartBuilder().theme(Styler.ChartTheme.Matlab).build());
		setFocusable(false);
		
		CategoryStyler styler = getChart().getStyler();

		styler.setPlotContentSize(0.98);
		styler.setYAxisDecimalPattern("#0.00");
		styler.setLocale(Locale.GERMAN);
		styler.setYAxisTitleVisible(false);
		styler.setLegendPosition(LegendPosition.InsideNE);
		styler.setDefaultSeriesRenderStyle(CategorySeriesRenderStyle.Line);
		styler.setXAxisMaxLabelCount(4);
		styler.setXAxisLabelRotation(270);
		styler.setYAxisGroupPosition(0, YAxisPosition.Left);	
		
	}

	/**
	 * Add a series to the list of data series to be plotted (series).
	 * 
	 * @param series     a data series.
	 * @param seriesName a name for the data series.
	 */
	public void addSeries(String seriesName, ArrayList<String> xData, ArrayList<Double> yData) {
		if (!getChart().getSeriesMap().containsKey(seriesName)) {
			
			/** OLD code
			//XYSeries seriesx = getChart().addSeries(seriesName, series);
			//seriesx.setLabel(seriesName);
			//seriesx.setMarker(SeriesMarkers.NONE);
			//seriesx.setYAxisGroup(0);
			*/
			
			CategorySeries chartSeries = getChart().addSeries(seriesName, xData, yData);
									
			chartSeries.setLabel(seriesName);
			chartSeries.setMarker(SeriesMarkers.NONE);
			chartSeries.setYAxisGroup(0);			
		
		}
		
		double minValuePrice =  yData.stream().min(Double::compare).get();
		
		if (minValuePrice > 0) {
			getChart().getStyler().setYAxisMin(0.0);
		} else {
			getChart().getStyler().setYAxisMin(minValuePrice);
		}
		
		double maxValuePrice =  yData.stream().max(Double::compare).get();
		getChart().getStyler().setYAxisMax(maxValuePrice);
		
		if (minValuePrice == maxValuePrice) {
			getChart().getStyler().setYAxisMax(maxValuePrice+0.01);
			getChart().getStyler().setYAxisMin(minValuePrice-0.01);			
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
	
	public void addEmptySeries() {
		if (getChart().getSeriesMap() != null && getChart().getSeriesMap().isEmpty() ) {
			
			String seriesName = "no data";
			ArrayList<String> xData = new ArrayList<>();
			xData.add("0"); 
			ArrayList<Double> yData = new ArrayList<>();
			yData.add(0.0);
			
			addSeries(seriesName, xData, yData);
		}
	}
}
