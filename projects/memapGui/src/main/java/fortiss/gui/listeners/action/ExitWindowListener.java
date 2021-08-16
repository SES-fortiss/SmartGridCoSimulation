package fortiss.gui.listeners.action;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExitWindowListener extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		/*
		if(!PlanningTool.getInstance().isSaved()) {
			new SaveAsCommand().execute();
		}
		*/
	}
}
