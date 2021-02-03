package memap.main;

import java.sql.SQLException;
import memap.controller.TopologyController;
import memap.examples.ExampleLoader;
import memap.messages.planning.ConnectionDB;
import memap.websocket.JettyWebsocket;
import opcMEMAP.ConfigInterface;

/**
 * 
 * Simulation class: main method expects argument. If no argument or help is the
 * input, help method is executed which shows the available options and also the
 * OPC-UA address of the MEMAP server.
 * 
 * Optional input arguments are:
 * <ul>
 * <li>help: displays help menu
 * <li>start: initializes connection to the two fortiss servers and starts
 * simulation with these two example "buildings".
 * <li>loop: starts simulation in loop jetty: starts the jetty server, available
 * on port 8080.
 * <li>csv: start a simulation with csv files.
 * </ul>
 * There, one can input connection data and start the simulation.
 * 
 * @author freiesleben & adrian.krueger
 * 
 */

public class Simulation {

	/* TODO: Global Input Parameters
	 * temporary solution
	 * Add TimeStepsPerDay or Stepsize as Input
	 */
	public static int N_STEPS_MPC = 5;
	public static int PauseInSec = 90;
	// ...
	
	public static void main(String[] args) throws SQLException {
		// Show help screen by default
		String arg = "help";


		if (args.length != 0) {
			arg = args[0];
			if (args.length > 2 ) {
				try {
					N_STEPS_MPC = Integer.parseInt(args[1]);
					PauseInSec = Integer.parseInt(args[2]);
				} catch(NumberFormatException e) {
				} 
			} else if (args.length > 1) {
				try {
					N_STEPS_MPC = Integer.parseInt(args[1]);
				} catch(NumberFormatException e) {
				} 
			}
		}

		argParser(arg);

	}

	private static void run(TopologyController topologyController) throws SQLException {
		ConnectionDB.connectToDB();
		topologyController.startSimulation();
	}

	
	private static void argParser(String arg) throws SQLException {
		switch (arg) {
		case "help":
		case "h":
			System.out.println(showHelp());
			break;

		// run the simulation
		case "start":
		case "s":
			System.out.println("========= START OPCUA SIMULATION =========");
			run(ExampleLoader.OpcUaExample(N_STEPS_MPC));
			break;

		// run the simulation in a loop
		case "loop":
		case "l":
			while (true) {
				System.out.println("========= START OPCUA SIMULATION =========");
				run(ExampleLoader.OpcUaExample(N_STEPS_MPC));
			}

			// run csv example in a loop
		case "csv":
			while (true) {
				System.out.println("========= START CSV SIMULATION =========");
				run(ExampleLoader.CsvExample());
			}

			// starts jetty Server
		case "jetty":
		case "j":
			String[] arbitraryValue = null;
			JettyWebsocket.main(arbitraryValue);
			break;

		default:
			System.out.println(showHelp());
			break;
		}
	}

	private static String showHelp() {
		ConfigInterface jsonInterface = new ConfigInterface();
		String server = jsonInterface.getHost();
		// int port = jsonInterface.getPort();
		String help = "Hi there, this is MEMAP.\n" + "\n"
				+ "To reach the OPC-UA result server on this machine, please use opc.tcp://" + server + ":" + "7070"
				+ "/sessim\n" + "\n"
				+ "To reach the OPC-UA building server of Building1 on this machine, please use opc.tcp://" + server
				+ ":" + 4880 + "/sessim\n" + "\n"
				+ "All other building servers can be found by ascending port number, i.e. 4881, 4882..." + "\n"
				+ "Use these commands to run the simulation (i.e. use MemapServer.jar [command]: \n"
				+ "    start : runs the simulation once \n" + "    loop  : runs the simulation in an indefinite loop \n"
				+ "    jetty  : start jetty webserver. (Available under 8080) \n"
				+ "    csv  : start a simulation loop reading csv files instead of ems servers \n"
				+ "    help  : show the help screen \n";
		return help;
	}

}
