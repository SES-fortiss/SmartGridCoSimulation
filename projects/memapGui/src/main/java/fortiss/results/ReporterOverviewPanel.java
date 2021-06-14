package fortiss.results;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
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
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import net.miginfocom.swing.MigLayout;

/**
 * ReporterOverviewPanel consists of a selectionPanel and a presentationPanel.
 * Currently the layout manager is MigLayout() The presentationPanel
 * (CardLayout) includes panels like comparison({@link SummaryPanel}) and all
 * the {@link MetricsPanel}s
 */
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

		setLayout(new MigLayout());
		selectionPanel = new JPanel(new GridLayout(0, 1, 4, 4));
		presentationPanel = new JPanel(new CardLayout());

		initialize();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		setBackground(Colors.background);
	}

	public void initialize() {
		add(selectionPanel, "top");
		add(presentationPanel, "pushx, growx");
	}

	/**
	 * Add a sub-panel to the overview panel and changes the navigation.
	 * 
	 * @param panel the panel to be added
	 * @param name  the name of the panel
	 */
	public void addSubpanel(JPanel panel, String name) {
		addSubpanel(panel, name, false);
	}

	/**
	 * Add a sub-panel to the overview panel and changes the navigation.
	 * 
	 * @param panel     the panel to be added
	 * @param name      the name of the panel
	 * @param highlight select true, to highlight the entry
	 */
	public void addSubpanel(JPanel panel, String name, boolean highlight) {

		JScrollPane metricsScrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		metricsScrollPane.setViewportView(panel);

		presentationPanel.add(metricsScrollPane, name.toLowerCase());
		addMetricsPanelIcon(name, highlight);
	}

	/**
	 * Add a label to the selection panel
	 * 
	 * @param name      name of the panel that will be shown when the user clicks on
	 *                  the label
	 * @param highlight
	 */
	private void addMetricsPanelIcon(String name, boolean highlight) {

		JLabel label = setLabelStyle(name);

		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// Change focus
				JLabel activeLabel = panelLabels.get(visiblePanel);
				if (activeLabel != null) {
					activeLabel.setForeground(Colors.accent2);
					activeLabel.setBorder(null);
				}

				label.setForeground(Colors.green);
				label.setBorder(BorderFactory.createLineBorder(Colors.green, 1, true));

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

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				label.setForeground(Colors.green);
				label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				JLabel activeLabel = panelLabels.get(visiblePanel);
				label.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

				if (activeLabel != label) {
					label.setForeground(Colors.accent2);
				}
			}

		});

		if (highlight) {
			label.setForeground(Colors.green);
			label.setBorder(BorderFactory.createLineBorder(Colors.green, 1, true));
			visiblePanel = label.getText().toLowerCase();

		}

		panelLabels.put(label.getText().toLowerCase(), label);
		selectionPanel.add(label);
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

	public void addTitleToSelectionPanel(String string) {

		JLabel label = setLabelStyle(string.toUpperCase());
		label.setOpaque(true);
		label.setBackground(Colors.green);
		label.setForeground(Colors.white);
		label.setBorder(BorderFactory.createEmptyBorder(2, 10, 2, 10));

		selectionPanel.add(label);

	}

	private JLabel setLabelStyle(String string) {
		JLabel label = new JLabel(string, JLabel.CENTER);
		label.setMaximumSize(new Dimension(200, 50));
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setFont(Fonts.getOpenSans(FontSize.SMALL));
		label.setForeground(Colors.accent2);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		label.setAlignmentY(Component.CENTER_ALIGNMENT);
		return label;
	}

	public void addEmptyCell() {
		selectionPanel.add(Box.createVerticalStrut(1));
	}
}
