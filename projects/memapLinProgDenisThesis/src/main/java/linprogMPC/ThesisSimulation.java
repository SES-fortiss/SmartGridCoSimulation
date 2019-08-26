package linprogMPC;

import linprogMPC.controller.TopologyController;
import linprogMPC.examples.ExampleLoader;
import linprogMPC.websocket.JettyWebsocket;
import opcMEMAP.ConfigInterface;

/**
 * 
 * ThesisSimulation class: main method expects argument. If no argument or help
 * is the input, help method is executed which shows the available options and
 * also the OPC-UA address of the MEMAP server. Optional input arguments are:
 * help: displays help menu start: initializes connection to the two fortiss
 * servers and starts simulation with these two example "buildings". loop:
 * starts simulation in loop jetty: starts the jetty server, available on port
 * 8080. csv: start a simulation with csv files. There, one can input Connection
 * data by her or himself and also start the simulation.
 * 
 * @author freiesleben & adrian.krueger
 * 
 */

public class ThesisSimulation {

    public static void main(String[] args) {
	// Show help screen by default
	String arg = "help";

	if (args.length != 0) {
	    arg = args[0];
	}

	argParser(arg);

    }

    private static void run(TopologyController topologyController) {
	topologyController.startSimulation();
    }

    private static void argParser(String arg) {
	switch (arg) {
	case "help":
	case "h":
	    System.out.println(showHelp());
	    break;

	// run the simulation
	case "start":
	case "s":
	    run(ExampleLoader.OpcUaExample);
	    break;

	// run the simulation in a loop
	case "loop":
	case "l":
	    while (true) {
		run(ExampleLoader.OpcUaExample);
	    }

	    // run csv example once
	case "csv":
	    run(ExampleLoader.CsvExample);
	    break;

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
	int port = jsonInterface.getPort();
	String help = "Hi there, this is MEMAP.\n" + "To reach the OPC-UA server on this machine, please use opc.tcp://"
		+ server + ":" + port + "/sessim\n" + "\n"
		+ "Use these commands to run the simulation (i.e. use MemapServer.jar [command]: \n"
		+ "    start : runs the simulation once \n" + "    loop  : runs the simulation in an indefinite loop \n"
		+ "    jetty  : start jetty webserver. (Available under 8080) \n"
		+ "    csv  : start a simulation reading csv files instead of ems servers \n"
		+ "    help  : show the help screen \n";
	return help;
    }

}
