package fortiss.components;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import com.google.gson.annotations.Expose;

import fortiss.gui.DesignerPanel;
import fortiss.gui.icons.BuildingIcon;

/**
 * Building is the class for representing Energy Management Systems (EMS).
 */
public class Building {
	@Expose
	private String name;
	@Expose
	protected String formattedName;
	@Expose
	private int port;

	@Expose
	private ArrayList<Demand> demand_list;
	@Expose
	private ArrayList<Coupler> coupler_list;
	@Expose
	private ArrayList<Controllable> controllable_list;
	@Expose
	private ArrayList<Volatile> volatile_list;
	@Expose
	private ArrayList<Storage> storage_list;

	@Expose
	private BuildingIcon icon;

	/**
	 * Constructor for class Building
	 * 
	 * @param name an alphanumeric string
	 * @param port an integer between 1024 and 49151, or 0
	 * 
	 */
	public Building(String name, int port, Point2D position) {
		// Do not use setName() in the constructor!
		this.name = name;
		setFormattedName(name);
		this.setPort(port);

		demand_list = new ArrayList<Demand>();
		coupler_list = new ArrayList<Coupler>();
		controllable_list = new ArrayList<Controllable>();
		volatile_list = new ArrayList<Volatile>();
		storage_list = new ArrayList<Storage>();

		setIcon(new BuildingIcon(this, name, position));
	}

	public String getName() {
		return name;
	}
	
	public String getFormattedName() {
		return formattedName;
	}

	/**
	 * Set the name of a building and the text of its icon. Calls
	 * {@link Icon#setName()}
	 */
	public void setName(String name) {
		this.name = name;
		setFormattedName(name);
		getIcon().setName(name);
	}
	
	/**
	 * Set the formatted name of a component, i.e. without Umlaut (diaeresis).
	 */
	public void setFormattedName(String name) {
		this.formattedName = name.replace("Ä", "Ae").replace("Ö", "Oe").replace("Ü", "Ue").replace("ä", "ae")
				.replace("ö", "oe").replace("ü", "ue").replace("ß", "ss");
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getDemandCount() {
		return demand_list.size();
	}
	
	public int getStorageCount() {
		return storage_list.size();
	}
	
	public int getVolatileCount() {
		return volatile_list.size();
	}
	
	public int getControllableCount() {
		return controllable_list.size();
	}
	
	public int getCouplerCount() {
		return coupler_list.size();
	}

	public ArrayList<Demand> getDemand() {
		return demand_list;
	}

	public ArrayList<Storage> getStorage() {
		return storage_list;
	}

	public ArrayList<Volatile> getVolatile() {
		return volatile_list;
	}

	public ArrayList<Controllable> getControllable() {
		return controllable_list;
	}

	public ArrayList<Coupler> getCoupler() {
		return coupler_list;
	}
	
	public ArrayList<Component> getComponents(){
		ArrayList<Component> components = new ArrayList<Component>();
		components.addAll(demand_list);
		components.addAll(storage_list);
		components.addAll(volatile_list);
		components.addAll(controllable_list);
		components.addAll(coupler_list);
		return components;
	}

	public void addCoupler(Coupler coupler) {
		coupler_list.add(coupler);
	}

	public void addContProduction(Controllable cont_production) {
		controllable_list.add(cont_production);
	}

	public void addVolProduction(Volatile vol_production) {
		volatile_list.add(vol_production);
	}

	public void addStorage(Storage storage) {
		storage_list.add(storage);
	}
	
	public void addDemand(Demand demand) {
		demand_list.add(demand);
	}

	/**
	 * @return the icon
	 */
	public BuildingIcon getIcon() {
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(BuildingIcon icon) {
		this.icon = icon;
	}

	public void showComponents() {

		ArrayList<Component> components = new ArrayList<Component>();
		components.addAll(demand_list);
		components.addAll(storage_list);
		components.addAll(volatile_list);
		components.addAll(controllable_list);
		components.addAll(coupler_list);

		DesignerPanel.pl_comp.reset();

		for (Component component : components) {
			component.icon.showComponent(false);
		}
	}

}
