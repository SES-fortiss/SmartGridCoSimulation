package fortiss.components;

import com.google.gson.annotations.Expose;

import fortiss.gui.icons.ComponentIcon;
import fortiss.simulation.PlanningTool;

public abstract class Component {

	@Expose
	protected String name;
	@Expose
	protected String formattedName;
	protected ComponentIcon icon;
	protected Building building;

	public Component(String name, Building building) {
		// Do not use setName() in the constructor!
		this.name = name;
		setFormattedName(name);
		setBuilding(building);
	}

	public String getName() {
		return name;
	}
	
	public String getFormattedName() {
		if (formattedName == null) return name;
		return formattedName;
	}

	/**
	 * Set the name of a component and the text of its icon. Calls
	 * {@link Icon#setName()}
	 */
	public void setName(String name) {
		this.name = name;
		setFormattedName(name);
		getIcon().setName(name);
		setSaved(false);
	}

	/**
	 * Set the formatted name of a component, i.e. without Umlaut (diaeresis).
	 */
	public void setFormattedName(String name) {
		this.formattedName = name.replace("Ä", "Ae").replace("Ö", "Oe").replace("Ü", "Ue").replace("ä", "ae")
				.replace("ö", "oe").replace("ü", "ue").replace("ß", "ss");
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
	
	public void setSaved(boolean saved) {
		PlanningTool.getInstance().setSaved(saved);
	}
}
