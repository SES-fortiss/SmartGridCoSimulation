package fortiss.components;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;

/**
 * Building is the class for representing Energy Management Systems (EMS).
 */
public class Building {
	@Expose
	private String name;
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

	/**
	 * Constructor for class Building
	 * 
	 * @param name                an alphanumeric string
	 * @param port                an integer between 1024 and 49151, or 0
	 * 
	 */
	public Building(String name, int port) {
		this.setName(name);
		this.setPort(port);
		
		demand_list = new ArrayList<Demand>();
		coupler_list = new ArrayList<Coupler>();
		controllable_list = new ArrayList<Controllable>();
		volatile_list = new ArrayList<Volatile>();
		storage_list = new ArrayList<Storage>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void addDemand(Demand demand) {
		demand_list.add(demand);
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

}
