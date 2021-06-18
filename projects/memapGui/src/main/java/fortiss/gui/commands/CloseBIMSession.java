package fortiss.gui.commands;

import fortiss.biminterface.BimSession;
import fortiss.gui.DesignerPanel;

public class CloseBIMSession implements Command {

	@Override
	public void execute() {
		BimSession.reset();
		DesignerPanel.showInformationPanel("remoteConnection");
	}

}
