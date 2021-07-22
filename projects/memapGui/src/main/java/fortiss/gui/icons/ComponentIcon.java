package fortiss.gui.icons;

import javax.swing.ImageIcon;

import fortiss.components.Component;
import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.action.AddComponentListener;
import fortiss.gui.listeners.action.ComponentListener;

public class ComponentIcon extends Icon {

	private static final long serialVersionUID = 1L;
	private Component component;

	public ComponentIcon (Component component, String componentType, ImageIcon selectedIcon, ImageIcon unselectedIcon) {
		super(component.getName(), componentType, selectedIcon, unselectedIcon);
		setComponent(component);
		addMouseListener(new ComponentListener());
	}
	
	public ComponentIcon (String componentType, ImageIcon icon, String toolTip) {
		super(componentType, icon, toolTip);
		addMouseListener(new AddComponentListener());
	}

	@Override
	public void showComponent(boolean focus) {
		DesignerPanel.pl_comp.add(this);
		DesignerPanel.pl_comp.doLayout();
		if (focus)
			requestFocus();
	}

	/**
	 * @return the component
	 */
	public Component getComponent() {
		return component;
	}

	/**
	 * @param component the component to set
	 */
	private void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void highlight() {
		setSelectedIcon();
		repaint();
		
		getComponent().getBuilding().getIcon().highlight();
	}

	@Override
	public void playDown() {
		setUnselectedIcon();
		repaint();
		
		getComponent().getBuilding().getIcon().playDown();
	}
}
