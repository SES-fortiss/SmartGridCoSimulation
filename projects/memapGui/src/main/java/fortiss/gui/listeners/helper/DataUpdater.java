package fortiss.gui.listeners.helper;

import fortiss.components.Component;
import fortiss.components.Controllable;
import fortiss.components.Coupler;
import fortiss.components.Demand;
import fortiss.components.Storage;
import fortiss.components.Volatile;
import fortiss.gui.DesignerPanel;

/**
 * Updates the displayed data according to user selection.
 */
public class DataUpdater {
	
	public void showComponentInformation(Component component) {
		if(component instanceof Demand) {
			DesignerPanel.showInformationPanel("demand");
		}
		if(component instanceof Storage) {
			DesignerPanel.showInformationPanel("storage");
		}
		if(component instanceof Volatile) {
			DesignerPanel.showInformationPanel("volProduction");
		}
		if(component instanceof Controllable) {
			DesignerPanel.showInformationPanel("contProduction");
		}
		if(component instanceof Coupler) {
			DesignerPanel.showInformationPanel("coupler");
		}
	}

}
