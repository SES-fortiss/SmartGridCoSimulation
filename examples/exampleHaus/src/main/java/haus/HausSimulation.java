//in Bearbeitung
package haus;

import haus._topology.Einfamilienhaus;
import haus._topology.TestKomponente;
import haus.komponente.testBehaviour.TestEMSElektroheizungBehaviourModel;
import haus.komponente.testBehaviour.TestEMSFixeVerbraucher;
import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;

/**
 * HausSimulation
 * 14.04.2014
 * @author Markus
 *
 */
@SuppressWarnings("unused")
public class HausSimulation {
	private ActorTopology hausgrid;
	private int maxTimeStep = 96;
	
	public void run(){
		hausgrid = TestKomponente.createTopologyTestWaschmaschine();
		//TODO hausgrid = TestKomponente.createTopologyTestTrockner();
		hausgrid = TestKomponente.createTopologyTestSolaranlage();
		hausgrid = TestKomponente.createTopologyTestKuehlschrank();
		hausgrid = TestKomponente.createTopologyTestBatterie();
		hausgrid = TestKomponente.createTopologyTestElektroheizung();
		hausgrid = TestKomponente.createTopologyTestFixeVerbraucher();
		
		hausgrid = Einfamilienhaus.createTopology();
		//hausgrid = HausTopology.createTopology();
		//hausgrid = VppTopologyForTest.createTopology();
		//vppgrid = VppTopology.createTopology();
		
		SimulationStarter.saveGridTopologyPlot(hausgrid);
		
        ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(hausgrid);
        
        SimulationStarter.startSimulation(actorSystem, 0, maxTimeStep);
	}
	
	public static void main(String[] args){
		new HausSimulation().run();
	}
}
