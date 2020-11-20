package fortiss.gui.listeners.action;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import fortiss.gui.commands.SaveCommand;

public class ExitWindowListener extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		new SaveCommand().execute();
	}
}