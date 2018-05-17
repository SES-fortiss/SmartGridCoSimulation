package ethereum;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

import org.apache.commons.lang3.ArrayUtils;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.JsonRpc2_0Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.utils.Async;

import akka.actor.ActorSystem;
import ethereum.contracts.IntegratedEnergyMarket;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import simulation.SimulationStarter;
import topology.ActorTopology;

public class Simulation {

	private ActorTopology topology;

	public static String contractAddress = "";
	public static String heatMarketAddress = "";
	public static String electricityMarketAddress = "";
	public static final double ELECTRICITY_MAX_PRICE = 25; //ct per kWh
	public static final double ELECTRICITY_MIN_PRICE = 12; //ct per kWh
	
	public static final int N_STEPS = 70;
	public static final int N_DAYS = 7;
	
	public static final int TIMESTEPS_PER_ITERATION = N_STEPS;
	public static final BigInteger TIMESTEP_DURATION_IN_SECONDS = 
			BigInteger.valueOf(15*60);
	
	private static final int NR_OF_ITERATIONS = 96;
	
	//For the moment, the following 3 parameters need to stay as defined to match data input
//	public static LocalDateTime startTime = LocalDateTime.of(2014,7,1,11,0);
//	public static LocalDateTime endTime = LocalDateTime.of(2014,7,1,12,0);
//	public static Duration timeInterval = Duration.ofMinutes(15);
	
	public Simulation() {
		OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
		HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
		logging.setLevel(HttpLoggingInterceptor.Level.NONE);
		builder.addInterceptor(logging);
		HttpService httpService = new HttpService("http://localhost:" + Integer.toString(8081), builder.build(), false);
		ScheduledExecutorService executorService = Async.defaultExecutorService();
		Web3j web3j = Web3j.build(httpService, JsonRpc2_0Web3j.DEFAULT_BLOCK_TIME, executorService);
		Credentials credentials = Credentials.create("0xc87509a1c067bbde78beb793e6fa76530b6382a4c0241e5e4a9ec0a0f44dc0d3");
		try {
			IntegratedEnergyMarket contract = 
					IntegratedEnergyMarket.deploy(
							web3j,
							credentials,
							BigInteger.ONE,
							BigInteger.valueOf(8000000),
							"0x627306090abaB3A6e1400e9345bC60c78a8BEf57",
							Arrays.asList(
									"0xf17f52151EbEF6C7334FAD080c5704D77216b732",
									"0xC5fdf4076b8F3A5357c5E395ab970B5B54098Fef",
									"0x821aEa9a577a9b44299B9c15c88cf3087F3b5544",
									"0x0d1d4e623D10F9FBA5Db95830F7d3839406C6AF2",
									"0x2932b7A2355D6fecc4b5c0B6BD44cC31df247a2e"
									)
						).send();
			contractAddress = contract.getContractAddress();
			System.out.println("Contract deployed at address: " + contractAddress);
			contract.setGasPrice(BigInteger.ZERO);			
			heatMarketAddress = contract.heatMarket().send();
			System.out.println("Heat market address: " + heatMarketAddress);
			electricityMarketAddress = contract.electricityMarket().send();
			System.out.println("Electricity market address: " + electricityMarketAddress);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executorService.shutdown();
	}
	
	private void run() {
		topology = Topology.createTopology();
		//SimulationStarter.saveGridTopologyPlot(topology);   
		ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
        SimulationStarter.startSimulation(actorSystem, 0, NR_OF_ITERATIONS);
		
	}
	
	public static void main(String[] args){
		new Simulation().run();
	}

}
