package fortiss.results; 

import java.awt.Component;
import java.awt.FlowLayout;
import java.util.HashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fortiss.gui.style.Colors;
import fortiss.results.widgets.ComparisonWidget;
import fortiss.results.widgets.ComponentUsageWidget;
import fortiss.results.widgets.ListWidget;
import fortiss.results.widgets.ParameterWidget;
import fortiss.results.widgets.TextBoxWidget;
import fortiss.results.widgets.TitleWidget;
import memap.media.Strings;
import net.miginfocom.swing.MigLayout;

public class SummaryPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel performancePanel;
	private JPanel globalOptimizationPanel;
	private JPanel perBuildingOptimizationPanel;

	public SummaryPanel() {
		setLayout(new MigLayout("insets 4 4 4 4, center, width 99%", 
				"[center, 45%]30[center,45%]", 
				"[top]30[top]30[top]30[top]30[top]"));
		
		globalOptimizationPanel = new JPanel();
		globalOptimizationPanel.setLayout(new BoxLayout(globalOptimizationPanel, BoxLayout.Y_AXIS));
		perBuildingOptimizationPanel = new JPanel();
		perBuildingOptimizationPanel.setLayout(new BoxLayout(perBuildingOptimizationPanel, BoxLayout.Y_AXIS));
		
		ParameterWidget parameterWidget = new ParameterWidget();
		performancePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		TitleWidget sectionTitle = new TitleWidget("Comparison results: MEMAP vs. Single Buildings");
		TitleWidget subSectionTitle1 = new TitleWidget("Results with MEMAP");
		TitleWidget subSectionTitle2 = new TitleWidget("Results without MEMAP");
		
		add(sectionTitle, "width 99%, align left, span 2, wrap");
		add(performancePanel, "align center, span 2, growx, wrap");
		add(subSectionTitle1, "growx");
		add(subSectionTitle2, "growx, wrap");
		add(globalOptimizationPanel, "align center, growx, sizegroupx 1");
		add(perBuildingOptimizationPanel, "align center, growx, sizegroupx 1, wrap");
		add(parameterWidget, "align center, growx, span");
		
		globalOptimizationPanel.setBackground(Colors.gray);
		perBuildingOptimizationPanel.setBackground(Colors.gray);
		performancePanel.setBackground(Colors.gray);
		parameterWidget.setBackground(Colors.gray);		
	}
	
	public void addComparisonWidget(String context, String title, double valueMemapOn, double valueMemapOff, String unit, String toolTip) {
		ComparisonWidget comparisonWidget = new ComparisonWidget(title, valueMemapOn, valueMemapOff, unit);
		if (toolTip != null)
			comparisonWidget.setToolTipText(toolTip);
		addToContext(context, comparisonWidget);
	}
	
	public ListWidget addListWidget(String context, String title, String toolTip) {
		ListWidget listWidget = new ListWidget(title);
		if (toolTip != null)
			listWidget.setToolTipText(toolTip);
		addToContext(context, listWidget);
		return listWidget;
	}
	
	public void addTextWidget(String context, String title, double value, String unit, String toolTip) {
		TextBoxWidget textBoxWidget = new TextBoxWidget(title, value, unit);
		if (toolTip != null)
			textBoxWidget.setToolTipText(toolTip);
		addToContext(context, textBoxWidget);
	}

	public void addImageWidget(String context, ImageIcon icon) {
		JLabel iconLabel = new JLabel(icon);
		iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		addToContext(context, iconLabel);
	}

	public void addComponentUsageWidget(String context, String title, HashMap<String, Number> energyProductionBySource,
			int places) {
		ComponentUsageWidget componentUsageWidget = new ComponentUsageWidget(title, energyProductionBySource, places);
		addToContext(context, componentUsageWidget);
	}
	
	private void addToContext(String context, Component object) {
		if(context.contentEquals(Strings.memapOnModeName)) {
			globalOptimizationPanel.add(object);
			globalOptimizationPanel.add(Box.createVerticalStrut(10));
		} else if(context.contentEquals(Strings.memapOffModeName)) {
			perBuildingOptimizationPanel.add(object);
			perBuildingOptimizationPanel.add(Box.createVerticalStrut(10));
		} else if (context.contentEquals(Strings.performancePanelName)) {
			// Performance panel
			performancePanel.add(object);
			performancePanel.add(Box.createHorizontalStrut(10));
		} else {
			throw new IllegalArgumentException("Summary panel: " + context + " is not a valid context");
		}
	}
}
