package haus.behaviorModels;

import haus.messageContents.HeizungAnswerContent;
import haus.messageContents.HeizungRequestContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * HeizungBehaviourModel
 * 14.05.2014 
 * Simuliert vorerst eine elektrische Heizung
 * @author Markus 
 */
public class HeizungBehaviourModel extends BehaviorModel{
	//StandardVariablen:
	public double 	ConsumptionMAX;	//Konstante: Maximale Leistungsaufnahme/Heizleistung

	public boolean 	istEnergieSparModusAN = false;	//true: kühlt nur wenn unbedingt nötig
	public double 	acceptedConsumption ;
	
	public double 	currentConsumtion;		//=Heizleistung, use setConsumption(double)
	public double 	futureConsumption;
	public double 	istPrioritaet;
	
	public HeizungAnswerContent answer = new HeizungAnswerContent();
	public HeizungRequestContent request = new HeizungRequestContent();
	
	//Heizungsspezifisch
	public double 	KapMAX; 				//Maximale Kapazität der Wärmepuffer
	public double	istGespeichert;			//Aktuell gespeicherte Nutzbare Energie in kWH
	public double	istVerbrauch;			//Aktuelle Heizungsleistung
	public double 	mittelVerbrauch = 5000;	//Mittlerer Wärmeverbrauch
	
	
	@Override
	public String toString(){
		return ("HeizungBehaviorModel:{ ConsumptionMAX:" + ConsumptionMAX 
				+"  istEnergieSparModusAN:" + istEnergieSparModusAN
				+"	acceptedConsumption:" + acceptedConsumption
				+"  currentConsumption:" + currentConsumtion
				+"  futureConsumption:" + futureConsumption
				+"  istPrioritaet:" + istPrioritaet 
				+"  KapMAX:" + KapMAX
				+"  istGespeichert:" + istGespeichert
				+"  istVerbrauch:" + istVerbrauch+" }");
	}
	
	
	/**
	 * Standardkonstruktor
	 */
	public HeizungBehaviourModel(){
		ConsumptionMAX = 10000.0;
		istEnergieSparModusAN = false;
		currentConsumtion = 3;
		futureConsumption = 3;
		istPrioritaet = 100;
		acceptedConsumption = 4000;
		
		KapMAX = 50000.0;
		istGespeichert = 0.0;
		istVerbrauch = 1000.0;
		updateAnswer();
	}
	

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#makeDecision()
	 */
	@Override
	public void makeDecision() {
		simuliereEinfluesse();
		readRequest();
		//System.out.println(toString());
		//Logik bitte einfügen:	<----------------
		double neu = istGespeichert - istVerbrauch;
		double prozent = neu/KapMAX;
		//unkritischer Fall:
		if(istEnergieSparModusAN){
			setConsumption(0.0);
		}else{
			istPrioritaet = 0.0;
			if((neu+acceptedConsumption)<(KapMAX-4000)){
				setConsumption(acceptedConsumption);
				futureConsumption = acceptedConsumption;
			}else{
				setConsumption(KapMAX-neu-4000);
				futureConsumption = mittelVerbrauch;
			}
		}
		//Halbkritischer Fall
		if(prozent<0.5){
			istPrioritaet = 50;
			futureConsumption = acceptedConsumption;
			if(istEnergieSparModusAN){
				setConsumption(acceptedConsumption);
			}else{
				setConsumption(acceptedConsumption);
			}
		}
		//Kritischer Fall
		if(neu<ConsumptionMAX){
			istPrioritaet = 100.0;
			if(istEnergieSparModusAN){
				setConsumption(istVerbrauch+ConsumptionMAX-istGespeichert);
				futureConsumption = currentConsumtion;
			}else{
				setConsumption(ConsumptionMAX);
				futureConsumption = currentConsumtion;
			}
		}
		
		
		
		
		
		/*Alter Code
		setConsumption(0.0);
		//Fall 1: Kritischer Fall, kein Puffer mehr vorhanden
		if(istGespeichert<5){
			System.out.println("Fall1");
			setConsumption(istVerbrauch+5-istGespeichert);
		}
		
		//Fall 2: istEnergieSparModusAN=true und relativ kritisch(<50)
		if((istEnergieSparModusAN)&&((istGespeichert-istVerbrauch)>5.0)&&(((istGespeichert-istVerbrauch)/KapMAX)<0.5)){ 
			System.out.println("Fall2");
			setConsumption(acceptedConsumption);
		}
		//Fall 3: istEnergieSparModusAN=false und relativ kritisch(<50)
		if((istEnergieSparModusAN==false)&&((istGespeichert-istVerbrauch)>5.0)&&(((istGespeichert-istVerbrauch)/KapMAX)<0.5)){ 
			System.out.println("Fall3");
			setConsumption(acceptedConsumption);
		}
		//Fall 4: istEnergieSparModusAN=false und nicht kritisch(>50)
		if((istEnergieSparModusAN==false)&&((istGespeichert-istVerbrauch)>5.0)&&(((istGespeichert-istVerbrauch)/KapMAX)>0.5)){ 
			if((KapMAX-istGespeichert+istVerbrauch)< acceptedConsumption){
				System.out.println("Fall4.1");
				setConsumption(KapMAX-istGespeichert+istVerbrauch);
			}else{
				System.out.println("Fall4.2");
				setConsumption(acceptedConsumption);
			}
		}*/
		//ENDE Logik
		updateAnswer();
		System.out.println(toString());
	}

	

	/**
	 * Prüft, ob ein Request vorliegt, wenn ja: ändert die Membervariablen
	 */
	private void readRequest() {
		try{	
			HeizungRequestContent befehl = (HeizungRequestContent) requestContentReceived;
			befehl.toString();
			istEnergieSparModusAN = befehl.istEnergieSparModusAN;
			acceptedConsumption = befehl.acceptedConsumption;
		}catch(Exception e){
			
		}
	}






	/**
	 * Simuliert die Änderungen der Zustände
	 */
	private void simuliereEinfluesse() {
		//1. Berechne Verbrauch:
		istVerbrauch = 3000.0 + Math.random()*7000;
		
		//2. Ändere Systemwerte
		istGespeichert = currentConsumtion - istVerbrauch + istGespeichert;
		if(istGespeichert<0){
			System.out.println("ACHTUNG: Heizung heizt zu wenig!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			istGespeichert=0.0;
		}
		if(istGespeichert>KapMAX){
			System.out.println("ACHTUNG: Heizung heizt zu viel"+istGespeichert + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			istGespeichert=KapMAX;			
		}
	}

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#returnAnswerContentToSend()
	 */
	@Override
	public AnswerContent returnAnswerContentToSend() {
		System.out.println(answer.toString());
		return answer;
	}

	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#returnRequestContentToSend()
	 */
	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}
	
	
	/**
	 * Ändert den aktuellen Stromverbrauch
	 * @param d neue Leistungsaufnahme
	 */
	private void setConsumption(double d) {
		currentConsumtion = d;
		if(d>ConsumptionMAX){ currentConsumtion = ConsumptionMAX;}
		if(d<0){ currentConsumtion = 0;}
	}

	
	
	/**
	 * Aktualisiert die Antwort
	 */
	private void updateAnswer() {
		answer.ConsumptionMAX =ConsumptionMAX;
		answer.currentConsumtion = currentConsumtion;
		answer.futureConsumption = futureConsumption;
		answer.istEnergieSparModusAN = istEnergieSparModusAN;
		answer.istPrioritaet = istPrioritaet;
		answer.sollVerbrauchMAX = acceptedConsumption;
	}


	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#handleRequest()
	 */
	@Override
	public void handleRequest() {
	
		
	}


	/* (non-Javadoc)
	 * @see behavior.BehaviorModel#handleError()
	 */
	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		
		
	}


}
