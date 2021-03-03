package fortiss.biminterface;

public class BimModelDataPostRequest {
	
	public String modelId;
	public Filters filters;
	
	public BimModelDataPostRequest() {
		this.filters = new Filters();
		
		this.filters.properties = new Properties();
		this.filters.simultaneously = false;
		
		this.filters.properties.aPIKomponententyp = "Controllable produktion";
	}
	
	class Filters {
		public Properties properties;
		public Boolean simultaneously;
	}

	class Properties {
		public String aPIKomponententyp;
	}


}

