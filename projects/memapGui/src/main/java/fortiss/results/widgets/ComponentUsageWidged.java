package fortiss.results.widgets;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;

public class ComponentUsageWidged extends JPanel {

	private static final long serialVersionUID = 1L;

	public ComponentUsageWidged(String title, HashMap<String, Number> energyProductionBySource, int nrComponents) {

		String title2 = (nrComponents > 1) ? "Most active components" : "Most active component";
		nrComponents = Math.min(nrComponents, energyProductionBySource.size());
 
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(new TitledBorder(new EtchedBorder(), title2 + " - " + title, TitledBorder.RIGHT,
				TitledBorder.TOP, Fonts.getOswald(20), Colors.accent2));
		
		add(Box.createVerticalStrut(20));

		// Sort HashMap values

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

		for (Entry<String, Number> entry : listOfEntries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		Iterator<Entry<String, Number>> iterator = sortedMap.entrySet().iterator();
		
		// Add labels for nrComponents
		for (int i = 0; i < nrComponents; i++) {
			Entry<String, Number> entry = iterator.next();
			if (entry.getValue().doubleValue() > 0) {
				add(new TextBoxWidget(entry.getKey(), new DecimalFormat("#.0##").format(entry.getValue()), "KWH"));
				add(Box.createVerticalStrut(10));
			}
		}
	}

}
