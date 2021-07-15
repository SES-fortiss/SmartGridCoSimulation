package fortiss.gui.commands;

import fortiss.biminterface.BimSession;

public class OpenBIMSession implements Command {

	@Override
	public void execute() {
		BimSession.getInstance().openSession();
	}

}
