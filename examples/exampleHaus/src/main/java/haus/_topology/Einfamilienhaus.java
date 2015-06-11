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
import haus.komponente.homematik.HomematikBehaviourModel;
import haus.komponente.homematik.HomematikRequestContent;
import haus.komponente.kuehlschrank.KuehlschrankAnswerContent;
import haus.komponente.kuehlschrank.KuehlschrankBehaviorModel;
import haus.komponente.kuehlschrank.KuehlschrankRequestContent;
import haus.komponente.solaranlage.SolaranlageAnswerContent;
import haus.komponente.solaranlage.SolaranlageBehaviourModel;
import haus.komponente.solaranlage.SolaranlageRequestContent;
import haus.komponente.waschmaschine.WaschmaschineAnswerContent;
import haus.komponente.waschmaschine.WaschmaschineBehaviourModel;
import haus.komponente.waschmaschine.WaschmaschineRequestContent;

import java.util.HashSet;

import resultSaving.NoSave;
import topology.ActorTopology;
import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;


/**
 * Einfamilienhaus
 * 14.04.2014
 * @author Markus
 * Komponenten wurden angefügt
 */
@SuppressWarnings("unused")
public class Einfamilienhaus {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	private static String simulationName = "Einfamilienhaus-Simulation";
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		String path = "EMSFamilienhaus1";
		
		HausSchedule schedule = new HausSchedule();
		
		/*
		 *  EMS einfügen
		 */
		HomematikAnswerContent homematikanswer = new HomematikAnswerContent("EMSFamilienhaus1",-20000,20000);
		HomematikRequestContent homematikrequest = new HomematikRequestContent("EMSFamilienhaus1");
		HomematikBehaviourModel HomematikBehaviour = new HomematikBehaviourModel(homematikanswer, homematikrequest);
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				HomematikBehaviour,new NoSave());	
		top.addActor(path, result); 
		
		//Kühlschrank einfügen
		path = "EMSFamilienhaus1/Kuehlschrank1";
		KuehlschrankAnswerContent kuehlschrankAnswer = new KuehlschrankAnswerContent("Kuehlschrank1",25,1.3);
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
		KuehlschrankRequestContent kuehlschrankRequest = new KuehlschrankRequestContent("Kuehlschrank1", exp, expMIN, expMAX, true, false, false);
		KuehlschrankBehaviorModel kuehlschrankBehaviour = new KuehlschrankBehaviorModel(kuehlschrankAnswer, kuehlschrankRequest);
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				kuehlschrankBehaviour,new NoSave());	
		top.addActorAsChild(path, result); 
		
		//Elektroheizung
		path = "EMSFamilienhaus1/Elektroheizung1";
		ElektroheizungAnswerContent ehAnswer = new ElektroheizungAnswerContent("Elektroheizung1", 28000, 50.0);
		//exp, expMIN sinnvoll aktualisieren
		ElektroheizungRequestContent ehRequest = new ElektroheizungRequestContent("Elektroheizung1", null, expMIN, null, true, false, false);
		ehRequest.istModusAutomatik =true;
		ehRequest.istModusPufferLaden=true;
		ElektroheizungBehaviourModel ehBehavior = new ElektroheizungBehaviourModel(ehAnswer, ehRequest, schedule);
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				ehBehavior,new NoSave());	
		top.addActorAsChild(path, result); 
		/*
		//Waschmaschine
		path = "EMSFamilienhaus1/Waschmaschine1";
		WaschmaschineAnswerContent wmAnswer 		= new WaschmaschineAnswerContent("Waschmaschine1");
		WaschmaschineRequestContent wmRequest 	= new WaschmaschineRequestContent("Waschmaschine1");
		wmRequest.initNeuerWaschAuftrag(0);
		wmRequest.initNeuerWaschAuftragStart(36);
		wmRequest.initNeuerWaschAuftragEnde(60);
		double[] expectedConsumption = 		{0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		double[] expectedConsumptionMAX=	{0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		wmRequest.initSetupModusAutomatik(expectedConsumption, expectedConsumptionMAX, 0.9);
		WaschmaschineBehaviourModel wmBehavior = new WaschmaschineBehaviourModel(wmAnswer, wmRequest);
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),
				wmBehavior,new NoSave());	
		top.addActorAsChild(path, result); 
		
		//Solaranlage
		path = "EMSFamilienhaus1/Solaranlage1";
		SolaranlageAnswerContent sa1Answer = new SolaranlageAnswerContent("Solaranlage1",-4000);
		SolaranlageRequestContent sa1Request = new SolaranlageRequestContent("Solaranlage1", -4000, 1000);
		SolaranlageBehaviourModel sa1Behavior = new SolaranlageBehaviourModel(sa1Answer, sa1Request, schedule);
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),
				sa1Behavior,new NoSave());	
		top.addActorAsChild(path, result); 
		
		//Speicher
		path = "EMSFamilienhaus1/Hausspeicher1";
		BatterieAnswerContent bAnswer = new BatterieAnswerContent("Hausspeicher1", -4000, 4000, 20000, 1.0, 10000);
		BatterieRequestContent bRequest = new BatterieRequestContent("Hausspeicher1", -3000.0);
		BatterieBehaviourModel bBehaviour = new BatterieBehaviourModel(bAnswer, bRequest);
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),
				bBehaviour,new NoSave());	
		top.addActorAsChild(path, result);
		
		//fixe Verbraucher
		path = "EMSFamilienhaus1/sonstige";
		fixeVerbraucherAnswerContent fvAnswer = new fixeVerbraucherAnswerContent("sonstige");
		fixeVerbraucherRequestContent fvRequest = new fixeVerbraucherRequestContent("sonstige");
		fixeVerbraucherBehaviourModel fvBehaviour = new fixeVerbraucherBehaviourModel(fvAnswer, fvRequest, schedule);
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),
				fvBehaviour,new NoSave());	
		top.addActorAsChild(path, result);
		*/
		//weitere Komponenten hinzufügen <----
		
		
		return top;
	}
}
