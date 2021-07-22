package fortiss.gui.listeners.textfield;

import java.awt.event.FocusEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import fortiss.components.Building;
import fortiss.components.Component;
import fortiss.components.Connection;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.InputVerifier;
import fortiss.simulation.PlanningTool;

public abstract class ComponentFieldListener extends TextFieldListener {

	public static Building building;
	public static Component component;
	public static Connection connection;

	public ComponentFieldListener(String errorMessage, InputVerifier inputVerifier) {
		super(errorMessage, inputVerifier);
	}

	public abstract String getAttribute();

	public abstract void update(String text);

	@Override
	public void focusGained(FocusEvent e) {
		source = (JTextField) e.getSource();
		setWord(source.getText());

		building = DesignerPanel.buildings.get(DesignerPanel.selectedBuilding.getName());

		// might be null if simulation parameters are modified, but no buildings exist
		if (DesignerPanel.selectedBuilding != null) {
			building.getIcon().highlight();
		}

		if (DesignerPanel.selectedComponent != null) {
			// A component is selected
			component = DesignerPanel.selectedComponent;
			component.getIcon().highlight();
		}

		if (DesignerPanel.selectedConnection != null) {
			connection = DesignerPanel.selectedConnection;
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (!inputVerifier.isValidField(getWord())) {
			JOptionPane.showMessageDialog(PlanningTool.getInstance().getMainContentPane(), errorMessage + ": " + getWord());
			if (building.equals(DesignerPanel.selectedBuilding)) {
				source.setText(getAttribute());
			}
		}

		if (building != null) {
			building.getIcon().playDown();
		}

		if (component != null) {
			component.getIcon().playDown();
		}
	}

}
