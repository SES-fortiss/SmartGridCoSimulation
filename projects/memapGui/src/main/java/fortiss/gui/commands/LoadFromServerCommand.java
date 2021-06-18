package fortiss.gui.commands;

import fortiss.biminterface.BimSession;

public class LoadFromServerCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Loading from BIM Server");
		BimSession.getInstance().loadTopology();
	}

}
