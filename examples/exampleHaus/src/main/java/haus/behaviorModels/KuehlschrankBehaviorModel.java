package haus.behaviorModels;

import haus.messageContents.KuehlschrankAnswerContent;
import haus.messageContents.KuehlschrankRequestContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * KuehlschrankBehaviorModel
 * 04.05.2014
 * @author Markus
 *
 */
public class KuehlschrankBehaviorModel extends BehaviorModel{
	//StandardVariablen:
	public double 	maxConsumption = 1000;	//Konstante: Maximale Leistungsaufnahme
	public double 	sollVerbrauchMAX = 500;		//von EMS mitgeteilt. Maximaler Verbrauch den EMS genehmigt.
	public boolean 	istEnergiesparModusAN = false;	//true: kühlt nur wenn unbedingt nötig
	
	//Variablen
	public double 	letzteTemperatur= 20.0;
	public double 	istTemperatur 	= 20.0;			//aktuelle Temperatur
	public double 	sollTemperatur 	= 2.0;			//angestrebte Temperatur
	public double   deltaTemperatur	= 2.0;			//Temperatur MUSS im "deltaBereich liegen
	public double 	sollLeistungMAX = 50.0;		//sollLeistungMAX = sollVerbrauchMAX/maxConsumption;
	public double 	istLeistung;					//%-Satz des max. Verbrauchs
	public double 	istPrioritaet;
		
	//Antwort für den EMS
	KuehlschrankAnswerContent answerContentToSend = new KuehlschrankAnswerContent(maxConsumption);
	
	
	
	/* 
	 * 
	 */
	@Override
	public void makeDecision() {
		//1. Temperaturänderung simulieren
		//2. evtl. emfangenes Request von EMS auswerten
		//3. Kühlleistung bestimmen
		//4. Answer aktualisieren
		
		//1.
		simuliereEinfluesse();
		//2.
		
	
		
		try{
			KuehlschrankRequestContent befehl = (KuehlschrankRequestContent) requestContentReceived;
			sollVerbrauchMAX = befehl.acceptedConsumption;
			sollLeistungMAX = sollVerbrauchMAX/maxConsumption;
			istEnergiesparModusAN = befehl.istEnergieSparModusAN;
		}catch(Exception e){
			
		}
		//3.
		istLeistung = updateistLeistung();
		//System.out.println("------------------------------------------------------> istLeistung:"+ istLeistung);
		//4.
		updateAnswer();
	}

	/**
	 * Aktualisiert die Antwort für den EMS
	 */
	private void updateAnswer() {
		answerContentToSend.sollVerbrauchMAX = sollVerbrauchMAX;
		answerContentToSend.currentConsumtion = maxConsumption*istLeistung/100;
		answerContentToSend.futureConsumption = maxConsumption*istLeistung/100;
		answerContentToSend.istEnergieSparModusAN = istEnergiesparModusAN;
		answerContentToSend.istPrioritaet = istPrioritaet;	
	}

	/**
	 * Logik die die Leistung steuert.
	 * @return gibt den neuen Wert "istLeistung" zurück. Er berechnet sich aus Temperatur, sollVerbrauchMAX, istEnergiesparModusAN,...
	 */
	private double updateistLeistung() {
		//Roter Bereich
		if(istTemperatur>(sollTemperatur+deltaTemperatur)){ istPrioritaet = 100.0; return 100.0;}
		
		//Kritischer Bereich
		if(istTemperatur > (sollTemperatur+deltaTemperatur/8*5)){
			if(istEnergiesparModusAN){
				istPrioritaet = 100.0;
				return setistLeistung(getReductionFactor()*1.4);
			}
			istPrioritaet = setistLeistung(getReductionFactor());
			return 100.0;
		}
		
		//gelber Bereich
		if(istTemperatur > (sollTemperatur+deltaTemperatur/4)){
			if(istEnergiesparModusAN){
				if(setistLeistung(getReductionFactor())<sollLeistungMAX){
					istPrioritaet = 75.0;
					return setistLeistung(getReductionFactor());
				}
				istPrioritaet = 75.0;
				return sollLeistungMAX;
			}
			istPrioritaet = 60.0;
			return 100.0;
		}
		
		//grüner Bereich
		if(istEnergiesparModusAN){
			if(setistLeistung(getReductionFactor())<sollLeistungMAX){
				istPrioritaet = 0.0;
				return setistLeistung(getReductionFactor());
			}
			istPrioritaet = 0.0;
			return sollLeistungMAX;
		}
		istPrioritaet = 0.0;
		return setistLeistung(getReductionFactor());
	}

	/**
	 * Simuliert die Änderung der Temperatur
	 */
	private void simuliereEinfluesse() {
		letzteTemperatur = istTemperatur;
		istTemperatur = istTemperatur + (20-istTemperatur)*0.1 - (3+istTemperatur/8)*istLeistung/100;
		
		//simuliere öffnen der Tür
		if(Math.random()>0.7){
			istTemperatur += Math.random()/2;
		}
		
		//System.out.println("Kuehlschrank.simuliereEinfluesse: neue istTemperatur: " + istTemperatur);
	}

	/*
	 * @see behavior.BehaviorModel#returnAnswerContentToSend()
	 */
	@Override
	public AnswerContent returnAnswerContentToSend() {
		System.out.println(answerContentToSend.toString());
		return answerContentToSend;
	}

	/*
	 * @see behavior.BehaviorModel#returnRequestContentToSend()
	 */
	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}
	
	public double setistLeistung(double delta){
		double temp = istLeistung + delta;
		if(temp > 100.0)	{ temp = 100.0;}
		if(temp < 0.0)		{ temp = 0.0;}
		return temp;
	}

	public double getReductionFactor(){
		if(istTemperatur<sollTemperatur){
			if((istTemperatur-letzteTemperatur)<0.1){
				return (istTemperatur-letzteTemperatur)*40-4;
			}
			if((istTemperatur-letzteTemperatur)>0.4){
				return (istTemperatur-letzteTemperatur)*40-16;
			}
		}
		if(istTemperatur>sollTemperatur){
			if((istTemperatur-letzteTemperatur)<-0.4){
				return (istTemperatur-letzteTemperatur)*40+16;
			}
			if((istTemperatur-letzteTemperatur)>-0.1){
				return (istTemperatur-letzteTemperatur)*40-4;
			}
		}
		return 0.0;
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
