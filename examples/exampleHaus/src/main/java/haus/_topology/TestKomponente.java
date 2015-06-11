package haus._topology;

import haus.komponente._schedule.HausSchedule;
import haus.komponente.batteriespeicher.BatterieAnswerContent;
import haus.komponente.batteriespeicher.BatterieBehaviourModel;
import haus.komponente.batteriespeicher.BatterieRequestContent;
import haus.komponente.elektroheizung.ElektroheizungAnswerContent;
import haus.komponente.elektroheizung.ElektroheizungBehaviourModel;
import haus.komponente.elektroheizung.ElektroheizungRequestContent;
import haus.komponente.fixeVerbraucher.fixeVerbraucherAnswerContent;
import haus.komponente.fixeVerbraucher.fixeVerbraucherBehaviourModel;
import haus.komponente.fixeVerbraucher.fixeVerbraucherRequestContent;
import haus.komponente.homematik.HomematikAnswerContent;
import haus.komponente.homematik.HomematikRequestContent;
import haus.komponente.kuehlschrank.KuehlschrankAnswerContent;
import haus.komponente.kuehlschrank.KuehlschrankBehaviorModel;
import haus.komponente.kuehlschrank.KuehlschrankRequestContent;
import haus.komponente.solaranlage.SolaranlageAnswerContent;
import haus.komponente.solaranlage.SolaranlageBehaviourModel;
import haus.komponente.solaranlage.SolaranlageRequestContent;
import haus.komponente.testBehaviour.TestEMSBatterieBehaviourModel;
import haus.komponente.testBehaviour.TestEMSElektroheizungBehaviourModel;
import haus.komponente.testBehaviour.TestEMSFixeVerbraucher;
import haus.komponente.testBehaviour.TestEMSKuehlschrankBehaviourModel;
import haus.komponente.testBehaviour.TestEMSSolaranlageBehaviourModel;
import haus.komponente.testBehaviour.TestEMSWaschmaschineBehaviourModel;
import haus.komponente.waschmaschine.WaschmaschineAnswerContent;
import haus.komponente.waschmaschine.WaschmaschineBehaviourModel;
import haus.komponente.waschmaschine.WaschmaschineRequestContent;

import java.util.HashSet;

import resultSaving.NoSave;
import topology.ActorTopology;
import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;

/**
 * Test Batterie
 * 14.04.2014
 * @author Markus
 * Komponenten wurden angefügt
 */
public class TestKomponente {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	private static String simulationName = "TestKomponente-Simulation";
	
	public static ActorTopology createTopologyTestBatterie(){
		ActorTopology top = new ActorTopology(simulationName);
		String path = "TestBatterie";
		/*
		 *  EMS einfügen
		 */
		HomematikAnswerContent homematikanswer = new HomematikAnswerContent("Test",-20000,20000);
		HomematikRequestContent homematikrequest = new HomematikRequestContent("Test");
		TestEMSBatterieBehaviourModel HomematikBehaviour = new TestEMSBatterieBehaviourModel(homematikanswer, homematikrequest);
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				HomematikBehaviour,new NoSave());	
		top.addActor(path, result); 
		
		//Speicher
		path = "TestBatterie/Hausspeicher1";
		BatterieAnswerContent bAnswer = new BatterieAnswerContent("Hausspeicher1", -4000, 4000, 20000, 1.0, 10000);
		//bAnswer.isDebug=true;
		BatterieRequestContent bRequest = new BatterieRequestContent("Hausspeicher1", -3000.0);
		//bRequest.isDebug=true;
		BatterieBehaviourModel bBehaviour = new BatterieBehaviourModel(bAnswer, bRequest);
		//bBehaviour.isDebug=true;
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				bBehaviour,new NoSave());	
		top.addActorAsChild(path, result);

		
		return top;
	}
	
	public static ActorTopology createTopologyTestElektroheizung(){
		ActorTopology top = new ActorTopology(simulationName);
		String path = "EMSFamilienhaus1";
		
		HausSchedule schedule = new HausSchedule();
		/*
		 *  EMS einfügen
		 */
		HomematikAnswerContent homematikanswer = new HomematikAnswerContent("EMSFamilienhaus1",-20000,20000);
		HomematikRequestContent homematikrequest = new HomematikRequestContent("EMSFamilienhaus1");
		TestEMSElektroheizungBehaviourModel HomematikBehaviour = new TestEMSElektroheizungBehaviourModel(homematikanswer, homematikrequest);
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				HomematikBehaviour,new NoSave());	
		top.addActor(path, result); 
	
		//Elektroheizung
		path = "EMSFamilienhaus1/Elektroheizung1";
		ElektroheizungAnswerContent ehAnswer = new ElektroheizungAnswerContent("Elektroheizung1");
		//ehAnswer.isDebug=true;
		ElektroheizungRequestContent ehRequest = new ElektroheizungRequestContent("Elektroheizung1");
		//ehRequest.isDebug=true;
		ElektroheizungBehaviourModel ehBehavior = new ElektroheizungBehaviourModel(ehAnswer, ehRequest, schedule);
		ehBehavior.isDebug=true;
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				ehBehavior,new NoSave());	
		top.addActorAsChild(path, result); 
	
		return top;
	}
	
	public static ActorTopology createTopologyTestFixeVerbraucher(){
		ActorTopology top = new ActorTopology(simulationName);
		String path = "EMSFamilienhaus1";
		
		HausSchedule schedule = new HausSchedule();
		schedule.initConsumptionBeleuchtung();
		schedule.initConsumptionFernseher();
		schedule.initConsumptionIT();
		schedule.initConsumptionKueche();
		/*
		 *  EMS einfügen
		 */
		HomematikAnswerContent homematikanswer = new HomematikAnswerContent("EMSFamilienhaus1",-20000,20000);
		HomematikRequestContent homematikrequest = new HomematikRequestContent("EMSFamilienhaus1");
		TestEMSFixeVerbraucher HomematikBehaviour = new TestEMSFixeVerbraucher(homematikanswer, homematikrequest);
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				HomematikBehaviour,new NoSave());	
		top.addActor(path, result); 
		
		//fixe Verbraucher
		path = "EMSFamilienhaus1/fixeVerbraucher";
		fixeVerbraucherAnswerContent fvAnswer = new fixeVerbraucherAnswerContent("fixeVerbraucher");
		fixeVerbraucherRequestContent fvRequest = new fixeVerbraucherRequestContent("fixeVerbraucher");
		fixeVerbraucherBehaviourModel fvBehaviour = new fixeVerbraucherBehaviourModel(fvAnswer, fvRequest, schedule);
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				fvBehaviour,new NoSave());	
		top.addActorAsChild(path, result);
		
		return top;
	}
	
	public static ActorTopology createTopologyTestKuehlschrank(){
		ActorTopology top = new ActorTopology(simulationName);
		String path = "EMSFamilienhaus1";
		
		@SuppressWarnings("unused")
		HausSchedule schedule = new HausSchedule();
		
		/*
		 *  EMS einfügen
		 */
		HomematikAnswerContent homematikanswer = new HomematikAnswerContent("EMSFamilienhaus1",-20000,20000);
		HomematikRequestContent homematikrequest = new HomematikRequestContent("EMSFamilienhaus1");
		TestEMSKuehlschrankBehaviourModel HomematikBehaviour = new TestEMSKuehlschrankBehaviourModel(homematikanswer, homematikrequest);
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				HomematikBehaviour,new NoSave());	
		top.addActor(path, result); 
		
		//Kühlschrank einfügen
		path = "EMSFamilienhaus1/Kuehlschrank1";
		KuehlschrankAnswerContent kuehlschrankAnswer = new KuehlschrankAnswerContent("Kuehlschrank1",90,1.2);
		double[] exp = 		{   0,0,0,0   ,0,0,0,0, 0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0, 0,0,0,0,  0,0,0,0,	//0-8Uhr kein Verbrauch 
				50,50,50,50,  90,90,90,90, 90,90,0,0,  0,0,0,0, 0,0,0,0, //bis 9: 50Watt, 10:00 bis 10:30 volle leistung danach bis 13:00 null
				90,90,90,90, 90,90,90,90, 50,50,50,50, 50,50,50,50, 0,0,0,0,//14:00-16:00 volle Leistung, 16:00-18:00 50Watt, ab dann 0
				0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0};
		double[] expMIN = 	{0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0, //00:00-8:00
				0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0, //8:00-16:00
				0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0}; //16:00-24:00
		double[] expMAX =	{0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0,  20,20,20,20,  10,10,10,10,  10,10,10,10, //00:00-8:00
				30,50,70,70,  90,90,90,90,  90,90,90,90,  90,90,90,90,  90,90,90,90,  90,90,90,90,  90,90,90,90,  90,90,90,90, //8:00-16:00
				90,90,90,90,  90,90,90,90,  80,70,60,50,  40,30,20,10,  0,0,0,0,  0,0,0,0,  0,0,0,0,  0,0,0,0}; //16:00-24:00
		KuehlschrankRequestContent kuehlschrankRequest = new KuehlschrankRequestContent("Kuehlschrank1", exp, expMIN, expMAX, true, false, true);
		KuehlschrankBehaviorModel kuehlschrankBehaviour = new KuehlschrankBehaviorModel(kuehlschrankAnswer, kuehlschrankRequest);
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				kuehlschrankBehaviour,new NoSave());	
		top.addActorAsChild(path, result); 
		
		return top;
	}

	public static ActorTopology createTopologyTestSolaranlage() {
		ActorTopology top = new ActorTopology(simulationName);
		String path = "EMSFamilienhaus1";
		
		HausSchedule schedule = new HausSchedule(null, null);
		
		/*
		 *  EMS einfügen
		 */
		HomematikAnswerContent homematikanswer = new HomematikAnswerContent("EMSFamilienhaus1",-20000,20000);
		HomematikRequestContent homematikrequest = new HomematikRequestContent("EMSFamilienhaus1");
		TestEMSSolaranlageBehaviourModel HomematikBehaviour = new TestEMSSolaranlageBehaviourModel(homematikanswer, homematikrequest);
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				HomematikBehaviour,new NoSave());	
		top.addActor(path, result); 
		
		
		//Solaranlage
		path = "EMSFamilienhaus1/Solaranlage1";
		SolaranlageAnswerContent sa1Answer = new SolaranlageAnswerContent("Solaranlage1",-4000);
		SolaranlageRequestContent sa1Request = new SolaranlageRequestContent("Solaranlage1", -4000, 100);
		SolaranlageBehaviourModel sa1Behavior = new SolaranlageBehaviourModel(sa1Answer, sa1Request, schedule);
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				sa1Behavior,new NoSave());	
		top.addActorAsChild(path, result); 
		
		
		return top;
	}

	@SuppressWarnings("unused")
	public static ActorTopology createTopologyTestWaschmaschine() {
		ActorTopology top = new ActorTopology(simulationName);
		String path = "EMSFamilienhaus1";
		
		HausSchedule schedule = new HausSchedule();
		
		/*
		 *  EMS einfügen
		 */
		HomematikAnswerContent homematikanswer = new HomematikAnswerContent("EMSFamilienhaus1",-20000,20000);
		HomematikRequestContent homematikrequest = new HomematikRequestContent("EMSFamilienhaus1");
		TestEMSWaschmaschineBehaviourModel HomematikBehaviour = new TestEMSWaschmaschineBehaviourModel(homematikanswer, homematikrequest);
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				HomematikBehaviour,new NoSave());	
		top.addActor(path, result); 
		
		//Waschmaschine
		path = "EMSFamilienhaus1/Waschmaschine1";
		WaschmaschineAnswerContent wmAnswer 		= new WaschmaschineAnswerContent("Waschmaschine1");
		//wmAnswer.isDebug=true;
		WaschmaschineRequestContent wmRequest 	= new WaschmaschineRequestContent("Waschmaschine1");
		//wmRequest.isDebug=true;
		double[] expectedConsumption = 		{0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		double[] expectedConsumptionMAX=	{0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		WaschmaschineBehaviourModel wmBehavior = new WaschmaschineBehaviourModel(wmAnswer, wmRequest);
		//wmBehavior.isDebug=true;
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				wmBehavior,new NoSave());	
		top.addActorAsChild(path, result); 
		
		return top;
	}
	
	
	
	
	
	
	
	
}