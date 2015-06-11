package haus.behaviorModels;

import haus.messageContents.WaschmaschineAnswerContent;
import haus.messageContents.WaschmaschineRequestContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * Basic
 * 29.04.2014
 * @author Markus
 *
 */
public class WaschmaschineBehaviorModel extends BehaviorModel{
	//Variablen:
	public int Zustand = 1;
	public boolean istAuftrag = false;	//Gibt an ob jemand die Waschmaschine befüllt hat und automatischs Starten aktiviert hat
	public boolean istAutomatik = true;//Gibt an, ob die Waschmaschine von EMS gesteuert werden darf
	public boolean istAN = false;		//Gibt an, ob ein Waschvorgang gerade läuft
	public double  currentConsumption = 3;
	public double  futureConsumption = 3;
	
	public int DauerSchritteFertig;		//Schritte bis der Waschvorgang abgeschlossen ist.
	
	public int timeRequiredForReady;//Zähler, bei 0 schaltet sich die Maschine ab.
	//Antwort, die nach makeDecision automatisch an das Elternobjekt gesendet wird
	public WaschmaschineAnswerContent answerContentToSend = new WaschmaschineAnswerContent();
	//Request, die nach makeDecision automatisch an die Kindobjekte gesendet wird???? <-----------
	public WaschmaschineRequestContent requestContentToSend = null;
	
	/**
	 * Die Entscheidung wird mit einem FSM geregelt
	 * Ablauf:
	 * 1. Antwort von Kindobjekt auslesen bzw. Request von Elternobjekt
	 * 2. Logik entscheiden lassen, was zu tun ist...
	 * 3. answerContentToSend und requestContentToSend initialisieren (updateAnswer, updateRequest)
	 * 4. Ausgaben in der Konsole
	 */
	@Override
	public void makeDecision(){
		//1. simuliere Ereignisse: z.B. Mensch befüllt die Waschmachine und gibt den Auftrag starten
		//2. erstelle Antwort
		//2. Aktualisiere Zustand
		//3. erstelle Answer/Request
		
		//1.
		simuliereMenschen();
		
		updateAnswer();
		
		//2.
		switch(Zustand){
		case 1:{
			if(istAuftrag){
				if(istAutomatik){
					Zustandaendern(2);
				}else{
					Zustandaendern(4);
				}
			}
			break;
		}
		case 2:{
			//1.Request abfragen ob gestartet werden darf.
				try{	
					WaschmaschineRequestContent befehl = (WaschmaschineRequestContent) requestContentReceived;
					befehl.toString();
					if(befehl.istAenderung){
						debug("Waschmaschine.makeDecision(): Befehl von EMS erhalten!");
						if(!befehl.ausschalten){
							Zustandaendern(3);
							DauerSchritteFertig = 5;
						}
					}
				}catch(Exception e){
					
				}
			break;
		}
		case 3:{
			if(waschenFertig()){
				Zustandaendern(1);
			}
			break;
		}
		case 4:{
			if(waschenFertig()){
				Zustandaendern(1);
			}
			break;
		}
		}
		
		//3.
		updateVariables();
	}
	


	/**
	 * Aktualisiert die Membervariablen für den nächsten Simulationsschritt.
	 */
	private void updateVariables() {
		//Vorinitialisierung
		istAutomatik = true;
		currentConsumption = 3;
		futureConsumption = 3;
		istAN = false;
		istAuftrag = false;
		
		switch(Zustand){
		case 1: {
			//siehe Vorinitialisierung
			break;
		}
		case 2: {
			//-> Auftrag erhalten
			istAuftrag = true;
			break;
		}
		case 3: {
			//-> läuft
			currentConsumption = 2000;
			futureConsumption = 2000;
			istAN = true;
			istAuftrag = true;
			break;
		}
		case 4: {
			//-> manuell
			currentConsumption = 2000;
			futureConsumption = 2000;
			istAN = true;
			istAuftrag = true;
			istAutomatik = false;
			break;
		}
		}
		
	}



	/**
	 * Prüft, ob der Waschvorgang fertig ist.
	 * @return
	 */
	private boolean waschenFertig() {
		DauerSchritteFertig--;
		if(DauerSchritteFertig > 0){
			return false;
		}
		return true;
	}



	@Override
	public AnswerContent returnAnswerContentToSend() {
		System.out.println(answerContentToSend.toString());
		return answerContentToSend;
	}
	
	@Override
	public RequestContent returnRequestContentToSend() {
		System.out.println(requestContentToSend.toString());
		return null;
	}
	
	/**
	 * Überträgt die internen Variablen in die Antwort für den EMS
	 */
	public void updateAnswer(){
		debug("Waschmaschine.updateAnswer() aufgerufen!!");
		answerContentToSend.istAuftrag 			= this.istAuftrag;
		answerContentToSend.istAN				= this.istAN;
		answerContentToSend.currentConsumtion	= this.currentConsumption;
		answerContentToSend.futureConsumption	= this.futureConsumption;
	}
	
	/**
	 * Erstellt Befehl für Kinder
	 */
	public void updateRequest(){
		debug("Waschmnaschine.updateRequest() aufgerufen!!");
	}
	
	/**
	 * 
	 */
	private void simuliereMenschen() {
		//Ereignis: Jemand befüllt die Maschine und erstellt einen Auftrag
		if(Math.random()>0.9){
			debug("Es soll gewaschen werden!");
			if(!istAuftrag){
				istAuftrag = true;
			}
		}
		
	}
	
	
	public void Zustandaendern(int zustand){
		Zustand = zustand;
		debug("Waschmaschine.Zustand = "+Zustand + " geändert!");
	}
	
	
	/**
	 * gibt Debuginfos aus
	 * @param a
	 */
	public void debug(String a){
		//System.out.println("INFO: "+a);
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

