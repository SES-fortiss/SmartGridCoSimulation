package fortiss.results; 

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.results.widgets.ComponentUsageWidged;
import fortiss.results.widgets.ParameterWidget;
import fortiss.results.widgets.TextBoxWidget;
import net.miginfocom.swing.MigLayout;

public class SummaryPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public static final String GLOBAL_OPTIMIZATION = "Global optimization";
	public static final String PER_BUILDING_OPTIMIZATION = "Per building optimization";
	public static final String PERFORMANCE = "Performance";
	private JPanel performancePanel;
	private JPanel globalOptimizationPanel;
	private JPanel perBuildingOptimizationPanel;

	public SummaryPanel() {
		
		// TODO change that to MigLayout?
		//setLayout(new BorderLayout(0, 0));
		//setBackground(Colors.memapGreen);
		
		setLayout(new MigLayout());
		
		globalOptimizationPanel = new JPanel();		
		globalOptimizationPanel.setAlignmentX(CENTER_ALIGNMENT);
		globalOptimizationPanel.setAlignmentY(CENTER_ALIGNMENT);
		globalOptimizationPanel.setLayout(new BoxLayout(globalOptimizationPanel, BoxLayout.Y_AXIS));
		//globalOptimizationPanel.add(Box.createVerticalStrut(50));
		globalOptimizationPanel.setBorder(new TitledBorder(new EtchedBorder(), "Results with MEMAP", TitledBorder.RIGHT,
				TitledBorder.TOP, Fonts.getOswald(26), Colors.accent2));

		perBuildingOptimizationPanel = new JPanel();
		perBuildingOptimizationPanel.setAlignmentX(CENTER_ALIGNMENT);
		perBuildingOptimizationPanel.setAlignmentY(CENTER_ALIGNMENT);
		perBuildingOptimizationPanel.setLayout(new BoxLayout(perBuildingOptimizationPanel, BoxLayout.Y_AXIS));
		//perBuildingOptimizationPanel.add(Box.createVerticalStrut(50));
		perBuildingOptimizationPanel.setBorder(new TitledBorder(new EtchedBorder(), "Results without MEMAP",
				TitledBorder.RIGHT, TitledBorder.TOP, Fonts.getOswald(26), Colors.accent2));

		performancePanel = new JPanel();
		
		ParameterWidget parameterWidget = new ParameterWidget();
		
		//add(comparisonPane, BorderLayout.CENTER); //Comparison is with and without MEMAP
		//add(performancePanel, BorderLayout.NORTH); // performance shows the numbers of MEMAPs improvement
		//add(parameterWidget, BorderLayout.SOUTH); // parameter represents Simulation parameters
		
		add(parameterWidget, "wrap, growx");
		add(globalOptimizationPanel, "split 2");
		add(perBuildingOptimizationPanel, "wrap");
		add(performancePanel, "growx");
		
		//globalOptimizationPanel.add(parameterWidget);
		//perBuildingOptimizationPanel.add(parameterWidget);
		//performancePanel.add(parameterWidget);
		
		globalOptimizationPanel.setBackground(Colors.memapGreen);
		perBuildingOptimizationPanel.setBackground(Colors.memapGreen);
		performancePanel.setBackground(Colors.memapGreen);
		parameterWidget.setBackground(Colors.memapGreen);
		
		
	}

	/**
	 * @param context {@link #GLOBAL_OPTIMIZATION},
	 *                {@link #PER_BUILDING_OPTIMIZATION} or
	 *                {@link #performancePanel}
	 * @param title
	 * @param value
	 * @param unit
	 * @param toolTip
	 */
	public void addTextWidget(String context, String title, String value, String unit, String toolTip) {
		TextBoxWidget textBoxWidget = new TextBoxWidget(title, value, unit);
		if (toolTip != null)
			textBoxWidget.setToolTipText(toolTip);

		switch (context) {
		case GLOBAL_OPTIMIZATION:
			globalOptimizationPanel.add(textBoxWidget);
			break;
		case PER_BUILDING_OPTIMIZATION:
			perBuildingOptimizationPanel.add(textBoxWidget);
			break;
		case PERFORMANCE:
			performancePanel.add(textBoxWidget);
			break;
		default:
			throw new IllegalArgumentException("Summary panel: " + context + " is not a valid context");
		}
	}

	public void addImageWidget(String context, ImageIcon icon) {
		JLabel iconLabel = new JLabel(icon);
		iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		switch (context) {
		case GLOBAL_OPTIMIZATION:
			globalOptimizationPanel.add(iconLabel); 
			break;
		case PER_BUILDING_OPTIMIZATION:
			perBuildingOptimizationPanel.add(iconLabel);
			break;
		case PERFORMANCE:
			performancePanel.add(iconLabel);
			break;
		default:
			throw new IllegalArgumentException("Summary panel: " + context + " is not a valid context");
		}
	}

	public void addComponentUsageWidget(String context, String title, HashMap<String, Number> energyProductionBySource,
			int places) {
		ComponentUsageWidged componentUsageWidget = new ComponentUsageWidged(title, energyProductionBySource, places);

		switch (context) {
		case GLOBAL_OPTIMIZATION:
			globalOptimizationPanel.add(componentUsageWidget);
			break;
		case PER_BUILDING_OPTIMIZATION:
			perBuildingOptimizationPanel.add(componentUsageWidget);
			break;
		default:
			throw new IllegalArgumentException("Summary panel: " + context + " is not a valid context");
		}
	}
}
