package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.gui.commands.Command;

public class ButtonListener extends MouseAdapter {
	
	private Command command;
	
	public ButtonListener(Command command) {
		this.command = command;
	}
	
	public void mouseClicked(MouseEvent e) {
		command.execute();
	}
}
