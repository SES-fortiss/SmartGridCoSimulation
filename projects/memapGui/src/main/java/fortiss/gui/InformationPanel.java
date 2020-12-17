package fortiss.gui;

import javax.swing.JPanel;

public abstract class InformationPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public InformationPanel() {
		super();
	}
	
	public abstract void update();
}
