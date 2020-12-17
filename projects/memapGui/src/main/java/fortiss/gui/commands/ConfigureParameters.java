package fortiss.gui.commands;

import fortiss.gui.DesignerPanel;

public class ConfigureParameters implements Command {

	@Override
	public void execute() {
		DesignerPanel.showInformationPanel("parameter");
	}

}
