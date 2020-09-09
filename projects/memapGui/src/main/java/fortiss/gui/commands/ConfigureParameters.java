package fortiss.gui.commands;

import fortiss.gui.DesignerPanel;

public class ConfigureParameters implements Command {

	@Override
	public void execute() {
		DesignerPanel.cl.show(DesignerPanel.pl_comp_detail, "parameter");
	}

}
