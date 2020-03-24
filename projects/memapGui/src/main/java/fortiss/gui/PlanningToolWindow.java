package fortiss.gui;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import fortiss.gui.listeners.window.ExitWindowListener;
import fortiss.media.Icon;
import fortiss.simulation.PlanningTool;

public class PlanningToolWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTabbedPane tabbedPane;
	private Rectangle innerBounds;

	public PlanningToolWindow() {
		setDefaultLookAndFeelDecorated(true);

		addWindowListener(new ExitWindowListener());
		setLocationRelativeTo(null);
		setIconImage(Icon.smallMemapLogo.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new CardLayout(0, 0));

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		addPanelAsCard("tabbedPane", tabbedPane);

		addComponentListener(new ComponentAdapter() {
		    public void componentResized(ComponentEvent componentEvent) {
		    	PlanningTool.getReporterOverviewPanel().setPresentationSize(getPreferredSize());
		    }
		});
		
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		setMaximizedBounds(env.getMaximumWindowBounds());
		setSize(env.getMaximumWindowBounds().width, env.getMaximumWindowBounds().height);
		setVisible(true);
	}

	/**
	 * Add a panel as a tab. Note: the order of addition of the panels reflect the
	 * order of the tabs in the window
	 */
	public void addPanelAsTab(String title, ImageIcon icon, JPanel panel) {
		tabbedPane.addTab(null, panel);
		tabbedPane.setTabComponentAt(tabbedPane.indexOfComponent(panel), buildTab(tabbedPane, icon, panel, title));
	}

	/** Add a panel as a card. */
	public void addPanelAsCard(String title, Component panel) {
		getContentPane().add(panel, title);
	}

	/** Return a tab */
	private static JPanel buildTab(final JTabbedPane tabbedPane, ImageIcon icon, final JPanel panel, String title) {
		JPanel tabPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		tabPanel.setOpaque(false);

		// Add title
		JLabel tabLabel = new JLabel(title, icon, SwingConstants.LEFT);
		tabLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
		tabPanel.add(tabLabel);

		// Add close button
		JButton closeButton = new JButton("x");
		closeButton.setContentAreaFilled(false);
		closeButton.setBorder(new EmptyBorder(3, 3, 3, 3));
		closeButton.setFocusPainted(false);
		closeButton.setToolTipText("close");

		// Add listener
		closeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.remove(panel);
			}
		});
		tabPanel.add(closeButton);

		return tabPanel;
	}

	public Rectangle getInnerBounds() {
		return innerBounds;
	}

	public void setInnerBounds(Rectangle innerBounds) {
		this.innerBounds = innerBounds;
	}

}
