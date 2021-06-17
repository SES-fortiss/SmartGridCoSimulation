package memap.helper.JsonExportHelper;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;

import memap.messages.BuildingMessage;

/**
 * Building is the class for representing Energy Management Systems (EMS).
 */
public class BuildingJsonHelper {
	
	@Expose
	private String name;
	@Expose
	protected String formattedName;
	@Expose
	private int port;

	@Expose
	private ArrayList<DemandJsonHelper> demand_list = new ArrayList<DemandJsonHelper>();
	@Expose
	private ArrayList<CouplerJsonHelper> coupler_list = new ArrayList<CouplerJsonHelper>();
	@Expose
	private ArrayList<ProducerJsonHelper> controllable_list = new ArrayList<ProducerJsonHelper>();
	@Expose
	private ArrayList<VolatileJsonHelper> volatile_list = new ArrayList<VolatileJsonHelper>();
	@Expose
	private ArrayList<StorageJsonHelper> storage_list = new ArrayList<StorageJsonHelper>();

	@Expose
	private BuildingIconJsonHelper icon = new BuildingIconJsonHelper(0);

//	/**
//	 * Constructor for class Building
//	 * 
//	 * @param name an alphanumeric string
//	 * @param port an integer between 1024 and 49151, or 0
//	 * 
//	 */
	public BuildingJsonHelper(BuildingMessage buildingMessage) {
		// Do not use setName() in the constructor!

		this.name = buildingMessage.name;
		setFormattedName(name);
		this.setPort(port);

	}

	public String getName() {
		return name;
	}
	
	public String getFormattedName() {		
		if (formattedName == null) return name;		
		return formattedName;
	}

	public void setName(String name) {
		this.name = name;
		setFormattedName(name);
	}
	
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

	
	
//	public ArrayList<Device> getComponents(){
//		ArrayList<Device> components = new ArrayList<Device>();
//		components.addAll(demand_list);
//		components.addAll(storage_list);
//		components.addAll(volatile_list);
//		components.addAll(controllable_list);
//		components.addAll(coupler_list);
//		return components;
//	}

	public void addCoupler(CouplerJsonHelper coupler) {
		coupler_list.add(coupler);
	}

	public void addContProduction(ProducerJsonHelper cont_production) {
		controllable_list.add(cont_production);
	}

	public void addVolProduction(VolatileJsonHelper vol_production) {
		volatile_list.add(vol_production);
	}

	public void addStorage(StorageJsonHelper storage) {
		storage_list.add(storage);
	}
	
	public void addDemand(DemandJsonHelper demand) {
		demand_list.add(demand);
	}


}
