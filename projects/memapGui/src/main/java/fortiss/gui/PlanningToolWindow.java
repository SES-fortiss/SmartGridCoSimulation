package fortiss.gui;

import java.awt.Dimension;

import javax.swing.JFrame;

import fortiss.gui.listeners.window.ExitWindowListener;
import fortiss.media.Icon;
import java.awt.CardLayout;

public class PlanningToolWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	public PlanningToolWindow() {
		setSize(new Dimension(1920, 1080));
		addWindowListener(new ExitWindowListener());
		setLocationRelativeTo(null);
		setIconImage(Icon.smallMemapLogo.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new CardLayout(0, 0));
		setVisible(true);
	}
	
	

}
