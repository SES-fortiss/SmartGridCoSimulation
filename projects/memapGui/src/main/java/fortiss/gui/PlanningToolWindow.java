package fortiss.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
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

import fortiss.gui.listeners.action.ExitWindowListener;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.IconStore;

public class PlanningToolWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private MenuBar menuBar;
	private JTabbedPane tabbedPane;

	public PlanningToolWindow() {
		StyleGenerator.setupStyle();
		setDefaultLookAndFeelDecorated(true);

		addWindowListener(new ExitWindowListener());
		setLocationRelativeTo(null);
		setIconImage(IconStore.smallMemapLogo.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());

		menuBar = new MenuBar();
		getContentPane().add(menuBar, BorderLayout.NORTH);

		tabbedPane = new JTabbedPane(SwingConstants.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		setMaximizedBounds(env.getMaximumWindowBounds());
		setSize(env.getMaximumWindowBounds().width, env.getMaximumWindowBounds().height);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * Add a panel as a tab. Note: the order of addition of the panels reflect the
	 * order of the tabs in the window
	 */
	public void addPanelAsTab(String title, ImageIcon icon, JPanel panel) {
		if (tabbedPane.indexOfTab(title) == -1) {
			tabbedPane.addTab(title, panel);
			tabbedPane.setTabComponentAt(tabbedPane.indexOfComponent(panel), buildTab(tabbedPane, icon, panel, title));
		}
	}

	public void addMainPanel(String title, Component panel) {
		getContentPane().add(panel, title);
	}

	public void showTab(Component c) {
		tabbedPane.setSelectedComponent(c);
	}

	public void closeTab(Component c) {
		tabbedPane.remove(c);
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

}
