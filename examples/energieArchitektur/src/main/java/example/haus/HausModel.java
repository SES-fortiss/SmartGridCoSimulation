package example.haus;

import helper.lastProfil.LastProfilTennet;
import helper.lastProfil.SolarProduction;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;
import example.aggregator.HouseToAggregator;
import example.batterie.BatterieModelAnswer;
import example.helper.TypKlasse;
import example.solar.SolarModelAnswer;

public class HausModel extends BehaviorModel {
	
	boolean rec = false;
	
	/**
	 * Interne Variablen
	 */
	public TypKlasse typ = TypKlasse.HAUS;
	double jahresVerbrauch;
	double jahresProduktion;
	public HausRecorder recorder;
	
	public double last = 0;
	public double prognose = 0;
	
	/**
	 * Antwort und Requests
	 */
	public HouseToAggregator answerContentToSend = new HouseToAggregator();
	public HausRequest request = new HausRequest();
	
	public HausModel(double jahresVerbrauch){
		this.jahresVerbrauch = jahresVerbrauch;
		answerContentToSend.typ = this.typ;
	}
	
	public HausModel(double jahresVerbrauch, boolean recorderNecessary){
		this.rec = recorderNecessary;
		this.jahresVerbrauch = jahresVerbrauch;
		answerContentToSend.typ = this.typ;
	}

	@Override
	public void handleRequest() {
		initRecorder();
		request.prognose = prognose;
	}

	private void initRecorder() {
		if ((this.recorder == null) && rec) {
			this.recorder = new HausRecorder(this);
		}
	}

	@Override
	public void makeDecision() {
		
		double prod = 0;
		double verbrauchBattery = 0;
		double prodBattery = 0;
		double batterySOC = 0;
		
		for (BasicAnswer answer : super.answerListReceived) {
			
			if (answer.answerContent instanceof SolarModelAnswer) {
				SolarModelAnswer ans = (SolarModelAnswer) answer.answerContent;
				prod += ans.erzeugung;
				this.jahresProduktion = ans.jahresProduktion;
			}
			
			if (answer.answerContent instanceof BatterieModelAnswer) {
				BatterieModelAnswer ans = (BatterieModelAnswer) answer.answerContent;
				prodBattery += ans.erzeugung;
				verbrauchBattery += ans.verbrauch;
				batterySOC += ans.soc;
			}
		}
		
		double verbrauch = LastProfilTennet.getLoadDomestic(jahresVerbrauch, actualTimeValue);
		
		answerContentToSend.verbrauch = verbrauch;
		answerContentToSend.erzeugung = prod;
		answerContentToSend.batterie = prodBattery - verbrauchBattery;
		answerContentToSend.soc = batterySOC;
		
		this.last = answerContentToSend.erzeugung - answerContentToSend.verbrauch + answerContentToSend.batterie;
		
		answerContentToSend.last = this.last;
		
		double Umrechnungsfaktor = 1.0 * GlobalTime.period.getSeconds() / 3600 / 1000;		
		
		if (this.last > 0){
			answerContentToSend.einspeisung += this.last * Umrechnungsfaktor;
		} else {
			answerContentToSend.bezug -= this.last * Umrechnungsfaktor;
		}
		
		double eigenverbrauch = 0;
		
		if (prod > 0) {
			if (prod > verbrauch){
				eigenverbrauch = verbrauch + verbrauchBattery;
			} else {
				eigenverbrauch = prod;
			}
			answerContentToSend.eigenverbrauch += eigenverbrauch * Umrechnungsfaktor;
		}
		
		if (this.last >= 0){
			answerContentToSend.autarkie = 1;
		} else answerContentToSend.autarkie = 0;
		
		answerContentToSend.selbstversorgung = answerContentToSend.eigenverbrauch / (answerContentToSend.eigenverbrauch + answerContentToSend.bezug);
		
		//if (this.actorName.equals("HausProfil1_2")) {
			//System.out.println("Haus: " + this.actorName + answerContentToSend);
		//}
		
		if (recorder != null){
			recorder.saveAnswer(answerContentToSend);
		}
		
		this.prognose = SolarProduction.getSolarProductionPower(jahresProduktion, GlobalTime.nextTime) - LastProfilTennet.getLoadDomestic(jahresVerbrauch, GlobalTime.nextTime);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {		
		return answerContentToSend;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return request;
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
	
	@Override
	public void endSimulation() {
		if (recorder != null){
			recorder.close();
		}
	}
}
