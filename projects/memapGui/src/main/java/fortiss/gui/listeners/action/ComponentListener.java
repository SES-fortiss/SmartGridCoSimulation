package fortiss.gui.listeners.action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import fortiss.components.Component;
import fortiss.gui.DesignerPanel;
import fortiss.gui.icons.ComponentIcon;
import fortiss.gui.listeners.helper.DataUpdater;

public class ComponentListener extends MouseAdapter {

	public void mouseClicked(MouseEvent e) {
		ComponentIcon componentIcon = (ComponentIcon) e.getSource();
		Component component = componentIcon.getComponent();

		DesignerPanel.selectedComponent = component;

		DataUpdater up = new DataUpdater();
		up.showComponentInformation(component);
	}
}
