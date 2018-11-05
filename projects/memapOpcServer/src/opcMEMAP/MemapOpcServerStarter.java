package opcMEMAP;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class MemapOpcServerStarter {

	public MyOpcUaServer myServer;
	public ServerUpdater myUpdater;
	
	private String interfaceSpecification = "src/Building1.json";
	private boolean generateFromFile = true;
	
	
	private int port = 9999;
	private boolean serverStarted = false;
	
	/**
	 * Create the starter with the following settings:
	 * 
	 * @param port
	 */
	public MemapOpcServerStarter(boolean generateFromFile, String interfaceSpecification, int port) {
		this.generateFromFile = generateFromFile;
		this.interfaceSpecification = interfaceSpecification;
		this.port = port;
	}

	// default Constructor for testing
	public MemapOpcServerStarter() {}

	public static void main(String[] args) {
		MemapOpcServerStarter sng = new MemapOpcServerStarter();
		try {
			sng.start();
	        String todo = null;
	        for (int i = 0; i < 100; i++) {
				todo = "{\"name\":\"Building" + (-i) + "\",\"LDHeating\":false,\"heatTransportLength\":"+i+",\"ack\":true,\"currentSetPointList\":[],\"currentMeterValueList\":[],\"availableFlexibilitiesList\":[],\"demandList\":[{\"demandForecast\":[-0.7000000741666668,-0.500000053,-0.20000002120000002,-0.9000000953000001],\"optimizationCriteria\":\"Price\",\"forecastType\":\"Profile\",\"networkType\":\"HEAT\",\"id\":\"/user/ActorSupervisor/2MEMAP/Building1/ConsumptionHEAT\",\"name\":\"HEAT_Consumption\"},{\"demandForecast\":[-0.09833337256666665,-0.14066673583333333,-0.14600000546666667,-0.15766674379999998],\"optimizationCriteria\":\"Price\",\"forecastType\":\"Profile\",\"networkType\":\"ELECTRICITY\",\"id\":\"/user/ActorSupervisor/2MEMAP/Building1/ConsumptionELECTRICITY\",\"name\":\"ELECTRICITY_Consumption\"}],\"storageList\":[],\"couplerList\":[],\"volatileProducerList\":[],\"controllableProducerList\":[{\"name\":\"GasBoiler1\",\"installedPower\":20.0,\"operationalPriceEURO\":0.0685,\"operationalPriceCO2\":0.0,\"efficiency\":0.95,\"networkType\":\"HEAT\"}]}";
				sng.update(todo);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public void start() throws Exception {
		myServer = new MyOpcUaServer(generateFromFile, interfaceSpecification, port);
				
		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.execute(myServer);
        
        while(!myServer.isServerRunning()) {
        	Thread.sleep(200);
        }
        
        setServerStarted(true);
	}
	
	public void update(String json) throws Exception {
		myServer.updateServer(json);
	}

	public boolean isServerStarted() {
		return serverStarted;
	}

	public void setServerStarted(boolean serverStarted) {
		this.serverStarted = serverStarted;
	}
	
	public void stop() {
		this.myServer.shutdown();
	}
}