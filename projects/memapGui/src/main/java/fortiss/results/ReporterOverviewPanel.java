package fortiss.results;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

	/** JPanel that holds all the labels of the metrics panels */
	private JPanel selectionPanel;
	/** JPanel that holds all metrics panels */
	private JPanel presentationPanel;

	public ReporterOverviewPanel() {
		StyleGenerator.setupStyle();
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

		// Sets panel properties
		setLayout(new BorderLayout(0, 0));

		// Important: size configuration
		int selectionPanelHeight = 40;

		presentationPanel.setPreferredSize(new Dimension(PlanningTool.getPlanningToolWindow().getWidth(),
				PlanningTool.getPlanningToolWindow().getHeight()));
		selectionPanel.setPreferredSize(new Dimension(0, selectionPanelHeight));
		selectionPanel.setMaximumSize(new Dimension(0, selectionPanelHeight));

		selectionPanel.setOpaque(true);
		selectionPanel.setAlignmentY(CENTER_ALIGNMENT);

		JScrollPane selectionScrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		selectionScrollPane.setViewportView(selectionPanel);

		JScrollPane metricsScrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		metricsScrollPane.setViewportView(presentationPanel);

		add(metricsScrollPane, BorderLayout.CENTER);
		add(selectionScrollPane, BorderLayout.SOUTH);

	}

	/**
	 * Modifies presentation panel size when window is resized
	 * 
	 * @param windowDimension preferred size of window
	 */
	public void setPresentationSize(Dimension windowDimension) {
		Dimension ps = presentationPanel.getPreferredSize();
		presentationPanel
				.setPreferredSize(new Dimension(windowDimension.width, ps.width * ps.height / windowDimension.width));
		revalidate();
	}

	/**
	 * Add a metrics panel
	 * 
	 * @param panel the panel to be added
	 * @param name  the name of the panel
	 */
	public void addMetricsPanel(JPanel panel, String name) {
		presentationPanel.add(panel, name.toLowerCase());
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
				CardLayout cl = (CardLayout) presentationPanel.getLayout();
				cl.show(presentationPanel, label.getText().toLowerCase());
				revalidate();
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

		selectionPanel.add(label);
		selectionPanel.add(Box.createHorizontalGlue());
	}

}
