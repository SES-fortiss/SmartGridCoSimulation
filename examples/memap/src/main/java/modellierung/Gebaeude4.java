package modellierung;

import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import akka.timeManagement.CurrentTimeStepSubscriber;
import akka.timeManagement.GlobalTime;
import behavior.BehaviorModel;
import helper.SolarProfile;
import memap.external.M2MDisplay;
import modellierung.helper.Reader;
import modellierung.nachrichten.EMSmsg;
import modellierung.nachrichten.MEMAPmsg;

public class Gebaeude4 extends BehaviorModel implements CurrentTimeStepSubscriber {
	
	public M2MDisplay display;
	Gson gson = new Gson();
	
	

	public EMSmsg ans = new EMSmsg();
	// alles in kW
	double verbrauchWaerme; 
	double verbrauchStrom;	// nächster Schritt
	double erzeugungWaerme;
	double erzeugungStrom;
	double erzeugungsKapazitatWaerme; 
	double installiertePV = 150; // solar
	double erzeugungsKapazitatStrom = 0; // nächster Schritt
	
	// in cent pro kWh
	double kostenErzeugung = 1;	
	
	// die wirtschaftliche Bilanz
	double kostenProduktion = 0;
	double einnahmeProduktion = 0;
	double gewinnProduktion = 0;
	double kostenVerbrauch = 0;
	double bilanzInsgesamt = 0;
	
	Reader reader = new Reader("Waerme4.csv");
	
	GlobalTime globalTime = null;
	int currentTimeStep = 0;
	
	public Gebaeude4() {
		display = new M2MDisplay(8084);
		display.run();
		Topology.getGlobalTime().subscribeToCurrentTimeStep(this);
	}
	
	
	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}

	@Override
	public void handleRequest() {
		double pricereceived = ((MEMAPmsg) requestContentReceived).preis;
		if (pricereceived > kostenErzeugung) { // Achtung nummerische unsicherheit! Führt evtl zu problemen.
			erzeugungWaerme = erzeugungsKapazitatWaerme;
		}
		if (pricereceived < kostenErzeugung) {
			erzeugungWaerme = 0;
		}
		if (pricereceived == kostenErzeugung) {
			erzeugungWaerme = erzeugungsKapazitatWaerme*((MEMAPmsg) requestContentReceived).grenzwertprozent; 
		}
	}

	@Override
	public void makeDecision() {
		erzeugungsKapazitatWaerme = installiertePV * SolarProfile.getSolarProfileSummer(currentTimeStep);

		double pricereceived = ((MEMAPmsg) requestContentReceived).preis;
		
		verbrauchWaerme = reader.getLoad(actualTimeValue);
		
		kostenProduktion = kostenErzeugung*erzeugungWaerme;
		einnahmeProduktion = pricereceived*erzeugungWaerme;
		gewinnProduktion = einnahmeProduktion - kostenProduktion;
		kostenVerbrauch = pricereceived*verbrauchWaerme;
		bilanzInsgesamt += gewinnProduktion - kostenVerbrauch;
		
		ans.erzeugungsKapazitat = erzeugungsKapazitatWaerme;
		ans.aktuellerVerbrauch = verbrauchWaerme;
		ans.aktuelleProduktion = erzeugungWaerme;
		ans.kosten = kostenErzeugung;
		ans.receivedMsg = (MEMAPmsg) requestContentReceived;
		ans.wirtschaflicheBilanz = bilanzInsgesamt;
		display.update(gson.toJson(ans));
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return ans;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}


	@Override
	public void update(int currentTimeStep) {
		this.currentTimeStep = currentTimeStep;		
	}

}
