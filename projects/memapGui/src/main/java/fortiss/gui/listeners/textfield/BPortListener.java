package fortiss.gui.listeners.textfield;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.NumberVerifier;
import fortiss.simulation.helper.Logger;

public class BPortListener extends ComponentFieldListener {

	public BPortListener() {
		super("Error. Invalid port number. Only numbers between 1024 and 49151, and 0 are valid.",
				new NumberVerifier().withMin(1024).withMax(49151).withAwaysValid(0).withMaxLength(6));
	}

	@Override
	public void update(String text) {
		try {
			building.setPort(Integer.parseUnsignedInt(text));
		} catch (NumberFormatException e) {
			Logger.getInstance().writeError("Number format exception. Expected an integer and received " + text);
			DesignerPanel.pl_ems_detail.update();
		}
	}

	@Override
	public String getAttribute() {
		return String.valueOf(building.getPort());
	}
}
