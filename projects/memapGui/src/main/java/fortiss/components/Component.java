package fortiss.components;

import com.google.gson.annotations.Expose;

import fortiss.gui.icons.ComponentIcon;

public abstract class Component {

	@Expose
	protected String name;
	protected ComponentIcon icon;
	protected Building building;

	public Component(String name, Building building) {
		// Do not use setName() in the constructor!
		this.name = name;
		setBuilding(building);
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * Set the name of a building and the text of its icon. Calls
	 * {@link Icon#setName()}
	 */
	public void setName(String name) {
		this.name = name;
		getIcon().setName(name);
	}
	
	/**
	 * @return the icon
	 */
	public ComponentIcon getIcon() {
		return icon;
	}
	
	public Building getBuilding() {
		return building;
	}
	
	public void setIcon(ComponentIcon icon) {
		this.icon = icon;
	}
	
	public void setBuilding(Building building) {
		this.building = building;
	}
	
	public void showComponent(boolean focus) {
		icon.showComponent(focus);
	}
}
