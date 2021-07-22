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
		String todoStart = "{\"resultMap\":{\"CoSESEMS01OBJ01_COUPL01\":[7.053941908713694,0.0,7.053941908713693,7.053941908713694,7.053941908713692],\"CoSESEMS01OBJ01_COUPL01OFF\":[0.0,1.0,0.0,0.0,0.0],\"CoSESEMS01OBJ01_COUPL01_T2_withEffieciency_ELECTRICITY\":[1.9609958506224068,5.1000000000000009,1.960995850622407,5.099999999999999,1.9609958506224066],\"CoSESEMS01OBJ01_COUPL01_withEffieciency_HEAT\":[5.1000000000000009,1.960995850622407,0.0,0.0,5.1],\"CoSESEMS01OBJ01_STRGE01Charge\":[0.0,0.0,0.0,0.0,0.0],\"CoSESEMS01OBJ01_STRGE01Discharge\":[7.712576890152806,0.0,1.2952071362035183,7.895656994498956,0.0],\"CoSESEMS02OBJ01_CPROD01\":[0.0,0.0,0.0,0.0,0.0],\"CoSESEMS02OBJ01_CPROD01_OFF\":[1.0,1.0,1.0,1.0,1.0],\"CoSESEMS02OBJ01_CPROD01_withEfficiency\":[0.0,0.0,0.0,0.0,0.0],\"CoSESEMS02OBJ01_STRGE01Charge\":[0.0,0.0,0.0,0.0,0.0],\"CoSESEMS02OBJ01_STRGE01Discharge\":[10.0,3.288329578296905,10.0,10.0,2.6190879074473605],\"ElecBuy\":[1.124779767377594,1.2749404280000004,1.9225816493775943,3.941392825377594,2.1083882593775939],\"ElecSell\":[0.0,0.0,0.0,0.0,0.0],\"connection_FromCoSES_H1_ToCoSES_H2Back\":[1.1999999999999974,1.0883295782969056,0.0,0.0,0.0],\"connection_FromCoSES_H1_ToCoSES_H2Back_withEfficiency\":[1.1874231098474546,1.0769230770002363,0.0,0.0,0.0],\"connection_FromCoSES_H1_ToCoSES_H2Frwd\":[0.0,0.0,1.0105917512035146,5.457195456498953,4.0230769230000009],\"connection_FromCoSES_H1_ToCoSES_H2Frwd_withEfficiency\":[0.0,0.0,1.000000000000221,5.400000000001167,3.9809120925535006]}}";
		MemapOpcServerStarter sng = new MemapOpcServerStarter(false, todoStart, 9999);
		try {
			sng.start();
	        String todo = null;
	        for (int i = 0; i < 100; i++) {
//				todo = "{\"resultMap\":{\"name\":\"Building" + (-i) + "\",\"LDHeating\":false,\"heatTransportLength\":"+i+",\"ack\":true,\"currentSetPointList\":[],\"currentMeterValueList\":[],\"availableFlexibilitiesList\":[],\"demandList\":[{\"demandForecast\":[-0.7000000741666668,-0.500000053,-0.20000002120000002,-0.9000000953000001],\"optimizationCriteria\":\"Price\",\"forecastType\":\"Profile\",\"networkType\":\"HEAT\",\"id\":\"/user/ActorSupervisor/2MEMAP/Building1/ConsumptionHEAT\",\"name\":\"HEAT_Consumption\"},{\"demandForecast\":[-0.09833337256666665,-0.14066673583333333,-0.14600000546666667,-0.15766674379999998],\"optimizationCriteria\":\"Price\",\"forecastType\":\"Profile\",\"networkType\":\"ELECTRICITY\",\"id\":\"/user/ActorSupervisor/2MEMAP/Building1/ConsumptionELECTRICITY\",\"name\":\"ELECTRICITY_Consumption\"}],\"storageList\":[],\"couplerList\":[],\"volatileProducerList\":[],\"controllableProducerList\":[{\"name\":\"GasBoiler1\",\"installedPower\":20.0,\"operationalPriceEURO\":0.0685,\"operationalPriceCO2\":0.0,\"efficiency\":0.95,\"networkType\":\"HEAT\"}]}}";
				todo = "{\"resultMap\":{\"CoSESEMS01OBJ01_COUPL01\":[7.053941908713694,0.0,7.053941908713693,7.053941908713694,7.053941908713692],\"CoSESEMS01OBJ01_COUPL01OFF\":[0.0,1.0,0.0,0.0,0.0],\"CoSESEMS01OBJ01_COUPL01_T2_withEffieciency_ELECTRICITY\":[1.9609958506224068,5.1000000000000009,1.960995850622407,5.099999999999999,1.9609958506224066],\"CoSESEMS01OBJ01_COUPL01_withEffieciency_HEAT\":[5.1000000000000009,1.960995850622407,0.0,0.0,5.1],\"CoSESEMS01OBJ01_STRGE01Charge\":[0.0,0.0,0.0,0.0,0.0],\"CoSESEMS01OBJ01_STRGE01Discharge\":[7.712576890152806,0.0,1.2952071362035183,7.895656994498956,0.0],\"CoSESEMS02OBJ01_CPROD01\":[0.0,0.0,0.0,0.0,0.0],\"CoSESEMS02OBJ01_CPROD01_OFF\":[1.0,1.0,1.0,1.0,1.0],\"CoSESEMS02OBJ01_CPROD01_withEfficiency\":[0.0,0.0,0.0,0.0,0.0],\"CoSESEMS02OBJ01_STRGE01Charge\":[0.0,0.0,0.0,0.0,0.0],\"CoSESEMS02OBJ01_STRGE01Discharge\":[10.0,3.288329578296905,10.0,10.0,2.6190879074473605],\"ElecBuy\":[1.124779767377594,1.2749404280000004,1.9225816493775943,3.941392825377594,2.1083882593775939],\"ElecSell\":[0.0,0.0,0.0,0.0,0.0],\"connection_FromCoSES_H1_ToCoSES_H2Back\":[1.1999999999999974,1.0883295782969056,0.0,0.0,0.0],\"connection_FromCoSES_H1_ToCoSES_H2Back_withEfficiency\":[1.1874231098474546,1.0769230770002363,0.0,0.0,0.0],\"connection_FromCoSES_H1_ToCoSES_H2Frwd\":[0.0,0.0,1.0105917512035146,5.457195456498953,4.0230769230000009],\"connection_FromCoSES_H1_ToCoSES_H2Frwd_withEfficiency\":[0.0,0.0,1.000000000000221,5.400000000001167,3.9809120925535006]}}";
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