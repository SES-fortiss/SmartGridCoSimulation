package fortiss.results; 

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
		globalOptimizationPanel.setLayout(new BoxLayout(globalOptimizationPanel, BoxLayout.Y_AXIS));
		globalOptimizationPanel.setBorder(new TitledBorder(new EtchedBorder(), "Results with MEMAP", TitledBorder.RIGHT,
				TitledBorder.TOP, Fonts.getOswald(26), Colors.accent2));

		perBuildingOptimizationPanel = new JPanel();
		perBuildingOptimizationPanel.setLayout(new BoxLayout(perBuildingOptimizationPanel, BoxLayout.Y_AXIS));
		perBuildingOptimizationPanel.setBorder(new TitledBorder(new EtchedBorder(), "Results without MEMAP",
				TitledBorder.RIGHT, TitledBorder.TOP, Fonts.getOswald(26), Colors.accent2));
		
		ParameterWidget parameterWidget = new ParameterWidget();
		performancePanel = new JPanel();
		
		JLabel titleLabel = new JLabel("Comparison results: MEMAP vs. Single Buildings");
		titleLabel.setFont(  new Font("Verdana", Font.PLAIN, 24)  );
		titleLabel.setBackground(Colors.memapGreen);
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setAlignmentX(CENTER_ALIGNMENT);
		titleLabel.setOpaque(true);
		titleLabel.setBorder(BorderFactory.createEmptyBorder(2, 10, 2, 10));
		
		add(titleLabel, "width 99%, align center, wrap");
		add(parameterWidget, "grow, wrap");
		add(performancePanel, "grow, wrap");
		add(globalOptimizationPanel, "grow, split 2");
		add(perBuildingOptimizationPanel, "grow");
		
		
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
