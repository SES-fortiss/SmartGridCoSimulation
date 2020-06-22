package fortiss.results;

import java.awt.BorderLayout;
import java.util.HashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.results.widgets.ComponentUsageWidged;
import fortiss.results.widgets.ParameterWidget;
import fortiss.results.widgets.TextBoxWidget;
import fortiss.results.widgets.TitleWidget;

public class SummaryPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public static final String GLOBAL_OPTIMIZATION = "Global optimization";
	public static final String PER_BUILDING_OPTIMIZATION = "Per building optimization";
	public static final String PERFORMANCE = "Performance";
	private JPanel performancePanel;
	private JPanel globalOptimizationPanel;
	private JPanel perBuildingOptimizationPanel;
	
	public SummaryPanel() {
		setLayout(new BorderLayout(0, 0));
		
		ParameterWidget parameterWidget = new ParameterWidget();
		add(parameterWidget, BorderLayout.WEST);
		
		globalOptimizationPanel = new JPanel();
		globalOptimizationPanel.setAlignmentX(CENTER_ALIGNMENT);
		globalOptimizationPanel.setAlignmentY(CENTER_ALIGNMENT);
		globalOptimizationPanel.setLayout(new BoxLayout(globalOptimizationPanel, BoxLayout.Y_AXIS));
		globalOptimizationPanel.add(Box.createVerticalStrut(50));
		globalOptimizationPanel.setBorder(new TitledBorder(new EtchedBorder(), "Results with MEMAP", TitledBorder.RIGHT,
		TitledBorder.TOP, Fonts.getOswald(26), Colors.accent2));
		
		perBuildingOptimizationPanel = new JPanel();
		perBuildingOptimizationPanel.setAlignmentX(CENTER_ALIGNMENT);
		perBuildingOptimizationPanel.setAlignmentY(CENTER_ALIGNMENT);
		perBuildingOptimizationPanel.setLayout(new BoxLayout(perBuildingOptimizationPanel, BoxLayout.Y_AXIS));
		perBuildingOptimizationPanel.add(Box.createVerticalStrut(50));
		perBuildingOptimizationPanel.setBorder(new TitledBorder(new EtchedBorder(), "Results without MEMAP", TitledBorder.RIGHT,
				TitledBorder.TOP, Fonts.getOswald(26), Colors.accent2));
		
		JSplitPane comparisonPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, globalOptimizationPanel, perBuildingOptimizationPanel);
		comparisonPane.setDividerSize(0);
		comparisonPane.setResizeWeight(0.5);
		add(comparisonPane, BorderLayout.CENTER);
		
		performancePanel = new JPanel();
		performancePanel.setAlignmentX(CENTER_ALIGNMENT);
		performancePanel.setAlignmentY(CENTER_ALIGNMENT);
		performancePanel.setLayout(new BoxLayout(performancePanel, BoxLayout.Y_AXIS));
		performancePanel.add(Box.createVerticalStrut(100));
		performancePanel.add(new TitleWidget("COMPARISON"));
		add(performancePanel, BorderLayout.EAST);
	}

	/**
	 * @param context {@link #GLOBAL_OPTIMIZATION}, {@link #PER_BUILDING_OPTIMIZATION} or {@link #performancePanel}
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
	
	public void addComponentUsageWidget(String context, String title, HashMap<String, Number> energyProductionBySource, int places) {
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
