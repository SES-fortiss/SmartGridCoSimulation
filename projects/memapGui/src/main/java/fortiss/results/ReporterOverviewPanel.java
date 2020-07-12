package fortiss.results;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.simulation.PlanningTool;

public class ReporterOverviewPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/** Panel that is currently visible */
	String visiblePanel = null;
	/** Labels used to select a panel */
	HashMap<String, JLabel> panelLabels = new HashMap<String, JLabel>();
	/** JPanel that holds all the labels of the metrics panels */
	private JPanel selectionPanel;
	/** JPanel that holds all metrics panels */
	private JPanel presentationPanel;

	public ReporterOverviewPanel() {
		StyleGenerator.setupStyle();
		// Sets panel properties
		setLayout(new BorderLayout(0, 0));
		selectionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
		presentationPanel = new JPanel(new CardLayout(0, 0));
		initialize();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// TODO: Dark mode implementation
		setBackground(Colors.background);
	}

	public void initialize() {

		// Important: size configuration
		int selectionPanelHeight = 40;

		Rectangle bounds = PlanningTool.getPlanningToolWindow().getBounds();
		Insets insets = PlanningTool.getPlanningToolWindow().getInsets();
		
		selectionPanel.setPreferredSize(new Dimension(bounds.width  - insets.left - insets.right, selectionPanelHeight));
		selectionPanel.setMaximumSize(new Dimension(bounds.width  - insets.left - insets.right, selectionPanelHeight));
		
		JScrollPane selectionScrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		selectionScrollPane.setViewportView(selectionPanel);
		selectionScrollPane.setAlignmentY(CENTER_ALIGNMENT);
		selectionScrollPane.setPreferredSize(new Dimension(bounds.width  - insets.left - insets.right, selectionPanelHeight + 20));
		
		add(selectionScrollPane, BorderLayout.SOUTH);
		add(presentationPanel, BorderLayout.CENTER);
	}

	/**
	 * Add a sub-panel
	 * 
	 * @param panel the panel to be added
	 * @param name  the name of the panel
	 */
	public void addSubpanel(JPanel panel, String name) {
		JScrollPane metricsScrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		metricsScrollPane.setViewportView(panel);
		presentationPanel.add(metricsScrollPane, name.toLowerCase());
		addMetricsPanelIcon(name);
	}

	/**
	 * Add a label to the selection panel
	 * 
	 * @param name name of the panel that will be shown when the user clicks on the
	 *             label
	 */
	private void addMetricsPanelIcon(String name) {
		JLabel label = new JLabel(name.toUpperCase(), JLabel.CENTER);
		label.setMaximumSize(new Dimension(200, 50));
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setFont(Fonts.getOswald(16));
		label.setForeground(Colors.accent2);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		label.setAlignmentY(Component.CENTER_ALIGNMENT);

		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// Change focus
				JLabel activeLabel = panelLabels.get(visiblePanel);
				if (activeLabel != null) {
					activeLabel.setForeground(Colors.accent2);
					activeLabel.setBorder(null);
				}
				label.setForeground(Colors.accent1);
				label.setBorder(BorderFactory.createLineBorder(Colors.accent1, 1, true));
				
				// Show panel
				showPanel(label.getText());
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				label.setBorder(BorderFactory.createLineBorder(Colors.accent2, 1, true));
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				label.setBorder(null);
			}
		});

		panelLabels.put(label.getText().toLowerCase(), label);
		selectionPanel.add(label);
		selectionPanel.add(Box.createHorizontalGlue());
	}

	public void showPanel(String panelName) {
		panelName = panelName.toLowerCase();
		CardLayout cl = (CardLayout) presentationPanel.getLayout();
		cl.show(presentationPanel, panelName);
		visiblePanel = panelName;
	}
	
	/**
	 * Remove all sub-panels. Must be called before every simulation in order to
	 * avoid panel duplicates
	 */
	public void reset() {
		presentationPanel.removeAll();
		selectionPanel.removeAll();
	}
}
