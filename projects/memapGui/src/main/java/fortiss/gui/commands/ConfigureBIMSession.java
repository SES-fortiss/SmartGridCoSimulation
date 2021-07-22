package fortiss.gui.commands;

import fortiss.biminterface.BimSession;
import fortiss.biminterface.ConnectionStatus;
import fortiss.gui.DesignerPanel;

public class ConfigureBIMSession implements Command {

	@Override
	public void execute() {
		if (BimSession.getInstance().getStatus().equals(ConnectionStatus.CLOSE)) {
			DesignerPanel.showInformationPanel("remoteConnection");
		} else {
			DesignerPanel.showInformationPanel("remoteConnection2");
		}
	}

}
