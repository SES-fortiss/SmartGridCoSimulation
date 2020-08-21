package fortiss.results.widgets;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.CategorySeries.CategorySeriesRenderStyle;
import org.knowm.xchart.XChartPanel;

import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import net.miginfocom.swing.MigLayout;

public class ComponentUsageWidget extends JPanel {

	private static final long serialVersionUID = 1L;

	public ComponentUsageWidget(String title, HashMap<String, Number> energyProductionBySource, int nrComponents) {

		nrComponents = Math.min(nrComponents, energyProductionBySource.size());
		int width = 400;
		int height = 400;
		
		setLayout(new MigLayout("insets 0 0 0 0, width 100%, gapy 0", "", ""));
				//"[center]", 
				//""));
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
		
		
		Comparator<Entry<String, Number>> comparator = new Comparator<Entry<String, Number>>() {
			@Override
			public int compare(Entry<String, Number> e1, Entry<String, Number> e2) {
				Double v1 = (Double) e1.getValue();
				Double v2 = (Double) e2.getValue();
				return v2.compareTo(v1);
			}
		};

		Set<Entry<String, Number>> entries = energyProductionBySource.entrySet();
		List<Entry<String, Number>> listOfEntries = new ArrayList<Entry<String, Number>>(entries);
		LinkedHashMap<String, Number> sortedMap = new LinkedHashMap<String, Number>();
		Collections.sort(listOfEntries, comparator);

		for (int i = 0; i < nrComponents; i++) {
			sortedMap.put(listOfEntries.get(i).getKey(), listOfEntries.get(i).getValue());
		}
		
		List <String> keys = new ArrayList<String>(sortedMap.keySet());
		List <Number> values = new ArrayList<Number>(sortedMap.values());
		
		CategoryChart ch = new CategoryChartBuilder().width(width).height(height).xAxisTitle("Component")
				.yAxisTitle("Energy Produced [kWH]").build();
		
		XChartPanel<CategoryChart> chart = new XChartPanel<CategoryChart>(ch); 
		
		chart.getChart().getStyler().setDefaultSeriesRenderStyle(CategorySeriesRenderStyle.Bar);
		chart.getChart().getStyler().setChartBackgroundColor(Colors.white);
		chart.getChart().getStyler().setChartFontColor(Colors.accent1);
		chart.getChart().getStyler().setChartPadding(10);
		chart.getChart().getStyler().setChartTitlePadding(0);
		chart.getChart().getStyler().setLegendVisible(false);
		chart.getChart().getStyler().setAxisTitleFont(Fonts.getOpenSans(FontSize.TINY));
		chart.getChart().getStyler().setAxisTickLabelsFont(Fonts.getOpenSans(FontSize.TINY));
		
		ch.addSeries("Energy [kWh]", keys, values);

		add(titleLabel, "width 100%, align left, wrap");
		add(separator, "width 100%, wrap");
		add(chart, "width 100%, wrap");
		
	}

}
