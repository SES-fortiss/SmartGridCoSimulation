# MEMAP

The Multi-Energy Management and Aggregations-Platform (MEMAP) connects local building EMS through 
OPC-UA and optimizes building control on the grid.

## Getting Started

Clone this repo and run

```
src/main/java/linprogMPC/Simulation.java csv
```

to run a 5 building example without the need to establish OPC-UA connections to EMS 
servers.

Look at help to see more options for running the program.

```
src/main/java/linprogMPC/Simulation.java help
```

**Alternatively** If you're not interested in working on the code, download the latest MemapServer.jar from the [releases page](https://github.com/SES-fortiss/SmartGridCoSimulation/releases) and run:

```
java -jar MemapServer.jar csv
```

This should also give you the address of 
the MEMAP OPC-UA result and building servers that will be created on you machine.


When you got the csv example running, you should be able to connect to these servers and read the 
simulations live results. A convenient Client GUI you may want to check out: [UA Expert](https://www.unified-automation.com/products/development-tools/uaexpert.html).


### Prerequisites

[Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html), 
v7 and above will work. You can also use [OpenJDK](https://openjdk.java.net) for Linux machines.

[Maven](https://maven.apache.org/download.cgi) for deployment.

### Dependencies

In your IDE, you will need to import the following projects from the repo:

* `gridarchitect`
* `powerflow`
* `cim15`
* `memapOpcServer`
* `memapServer`

Note: At one point the memapServer project will be renamed to memapCore.

### Deployment

First all dependent projects have to be built with `mvn install -DskipTests`, then
`mvn package` will create a Memap.jar in `target/`.

## Live Optimization

**Note:** MEMAP can be used as either a **planning** or **live optimization** tool. Here we explain how 
to use MEMAP for live optimization. Checkout the memapGui project on how to use Memap for planning.

### Quick Start ###

If your are connected to the Fortiss network and want to run an example with OPC-UA servers managed 
by @Jan in a loop, you can simply do:

```
java -jar MemapServer.jar loop
```

If this fails, most likely the connection to the Fortiss servers can't be established 
(see Error messages). If you think the servers are down, drop @Jan a message.

### Connecting buildings

To connect OPC-UA servers of local EMS to Memap, the simplest option is to 
use the webinterface.

Run:

```
java -jar MemapServer.jar jetty 
```

Then, open a web browser and reach `ipAdress:8080`. When you running Memap on your local 
machine, you can use `localhost:8080`. **TIP:** If you're unsure about the ip adress, 
you can always run `java -jar MemapServer.jar help`

The web-interface is self-explanatory. You can add buildings by providing their opc-tcp 
address together with a config file. Once you click `Submit data`, the simulation starts. 
By clicking `disconnect` the current simulation aborts and you can ad new buildings.

### Configuration Files

The local EMS OPC-UA Servers will have different naming and node structure conventions. Therefore, 
MEMAP needs to map the local EMS to its internal building representation. This mapping 
is reached through JSON config files. Here is an example file:
```
{
  "battery": [
    { 
      "capacityId" : "ns=2;i=43",
      "maxChargingId": "ns=2;i=45",
      "maxDischargingId": "ns=2;i=46",
      "effInId": "ns=2;i=42",
      "effOutId": "ns=2;i=42"
    }
  ],
  "chp": [],
  "consumer": [
    {
      "heatConsumptionId": "ns=2;i=10",
      "powerConsumptionId": "ns=2;i=14"
    }
  ],
  "gasboiler": [],
  "heatpump": [
    { 
      "installedPowerId": "ns=2;i=35",
      "effHeatId": "ns=2;i=32",
      "effElecId": "ns=2;i=33"
    }
  ],
  "pv": [
    { 
      "installedPowerId" : "ns=2;i=25",
      "effId": "ns=2;i=23",
      "productionId": "ns=2;i=27"
    }
  ],
  "solarthermic": [],
  "thermalstorage": []
}
```

You can use this as template. All device types map to list, for instance `solarthermic:[]`. If the 
building has this kind of device, you will need to point to the respective nodeIDs within 
the curly brackets. You can add any number of devices to a list (well, hopefully). 

**Important:** To see the current device types and required mapping keys, have a look 
at the `linprogMPC.controller.OpcUaBuildingController` class!


### Reaching the MEMAP building and result servers

The **result server** is reachable at port **7070**. General results and building results map 
are most interesting at the moment, perhaps.
The result can be a bit confusing and will need further adjustments. For now, note 
the following:
* Device result names end with two numbers. The first number simply counts devices of this 
  type, the second number incidacte the MPC time step, i.e. the prediction for i-th 
  time step
* ...

The **building servers** are reachable at port **4880 and ascending**, i.e. every building 
has its own port number. MEMAP is configured in a way that the first building attached 
to the Topology will be at port number 4880 and all subsequent buildings at port 4881, 
4882, ... 

### Known Bugs and conflicts ###
* There is no 'real' live mode at the moment. If you're using the loop option, for instance, 
  MEMAP will simply restart after a certain number of (simulated) days, which are in 
  fact about 10 minutes. This can lead to all sorts of unwanted behavior, like crashes 
  or server issues (i.e. multiple servers are created on the same port). This is because 
  Memap started as a planning tool and we still need to work on live mode.
* Sometimes the result server only works in the first loop, i.e. for the first 10 minutes.
* Memap can't run two different simulations simultaneously.
* The GUI integration is still incomplete. This does not affect live mode though


## Software Architecture
This provides a brief introduction into the soiftware architecture of MEMAP and important 
classes. Someone could insert UML diagrams here at some point.

### TopologyController
The central class of MEMAP is the `TopologyController`. A single TopologyController 
is instantiated every time MEMAP starts. It serves the following purposes:
* Setting the optimizer configuration in `TopologyConfig`. The settings in TopologyConfig 
  are global and therefore only a single instance of TopologyController should be created. 
  We didn't enforce this in code, put perhaps we should.
* Attaching `BuildingController` to the topology.
* Creating an `LinprogBehaviour` instance and attach it to the topology.

All things that should be managed on topology level should be managed with `TopologyController`. 
This, for instance, includes how to handle `BuildingControllers`, optimization crashes 
etc.

### BuildingController
`BuildingController` is an interface which defines a set of function `TopologyController` 
need to be able to call to run the simulation. There are two main implementation of 
`BuildingController` :

* `OpcUaBuildingController`: Connects to the local EMS of a building via OPC-UA
* `CSVBuildingController`: Gets device parameters and values from CSV files

Just like one can attach `BuildingController` to `TropologyController`, one can attach 
`Device` to the `BuildingControllers`

### Device
The `Device` class is an abstract representation of all types of devices that can be 
attached to buildings. It is extended by concrete device classes. Just like like for 
building controllers, devices can retrieve values from either a client (usually from 
a `OpcUaBuildingController`) or from CSV files. Some CSVDevice actually do not read 
any values at all (because all of them are constant), but they are still called CSVDevicename.

### Client
Connection to local EMS is established through `BasicClient`. It provides basic functionality 
to read final values from nodeIDs or create subscriptions on these nodes. Often, ClientDevices 
will make use of the these functions to read values from the corresponding devices of 
the EMS

### Server
The memapOpcServer project and its classes are used to start the buildings and results server. 
Internally, `BuldingMessage` and `OptimizationResultMessage` are sent from buildings 
and `LinProgBehavior` respectively. The messages contain TreeMaps, which resemble the 
folder structure on the server. The buildingmessages are used for the building
servers and the optimization messages are used for the result servers

Changing the folder structure of a server can be done by creating a different message 
in the respective class, i.e. `Building` or `LinProgBehaviour`.

**Important:** At the moment, `LinprogBehavior` and `BuildingController` are attached 
to `TopologyController`, but BuildingController don't know anything about the optimization 
results. It is difficult, therefore, to pass the optimization results directly to the 
building servers. Similar, on the result Server, creating the buildings result folder needed 
quite a loot of hacking, since much of the building information is lost after the optimization. 
All of this this will require a much better solution in the future, possibly with a slight change 
in architecture.

## License

[Read licence](https://github.com/SES-fortiss/SmartGridCoSimulation/blob/master/LICENSE)
