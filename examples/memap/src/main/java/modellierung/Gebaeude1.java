package modellierung;

import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import memap.external.M2MDisplay;
import modellierung.helper.Reader;
import modellierung.nachrichten.EMSmsg;
import modellierung.nachrichten.MEMAPmsg;

public class Gebaeude1 extends BehaviorModel {
	
	public EMSmsg ans = new EMSmsg();
	public M2MDisplay display;
	Gson gson = new Gson();

	// alles in kW
	double verbrauchWaerme;
	double verbrauchStrom;	// nächster Schritt
	double erzeugungWaerme;
	double erzeugungStrom;
	double erzeugungsKapazitatWaerme = 120; // ist ein Gaskessel
	double erzeugungsKapazitatStrom = 0; // nächster Schritt
	
	// in cent pro kWh
	double kostenErzeugung = 2;		
	Reader reader = new Reader("Waerme1.csv");
	
	// die wirtschaftliche Bilanz
	double kostenProduktion = 0;
	double einnahmeProduktion = 0;
	double gewinnProduktion = 0;
	double kostenVerbrauch = 0;
	double bilanzInsgesamt = 0;
	
	public Gebaeude1() {
		display = new M2MDisplay(8081);
		display.run();
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

}
