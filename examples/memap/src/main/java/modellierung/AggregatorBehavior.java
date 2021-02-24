package modellierung;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import memap.external.M2MDisplay;
import modellierung.nachrichten.EMSmsg;
import modellierung.nachrichten.MEMAPmsg;

public class AggregatorBehavior extends BehaviorModel {

	List<EMSmsg> answers = new ArrayList<EMSmsg>();
	MEMAPmsg msg = new MEMAPmsg();
	Gson gson = new Gson();
	public M2MDisplay display;
	
	public AggregatorBehavior() {
		display = new M2MDisplay(8080);
		display.run();
	}

	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {
		
		double verbrauchTotal = 0;
		double verbrauchCheck = 0;
		double production = 0;
		double preis = 6;
		answers.clear();
		
		
		for (BasicAnswer basicAnswer : answerListReceived) {			
			answers.add( (EMSmsg) basicAnswer.answerContent);
		}
		
		for (EMSmsg ans : answers) {
			verbrauchTotal += ans.aktuellerVerbrauch;
		}
		
		answers.sort((EMSmsg a, EMSmsg b ) -> (int) (a.kosten - b.kosten));
		verbrauchCheck = verbrauchTotal;
		
		for (EMSmsg emsg : answers) {
			verbrauchCheck -= emsg.erzeugungsKapazitat;
			production += emsg.erzeugungsKapazitat;
			
			if (verbrauchCheck <= 0) {
				double percentage = (verbrauchCheck + emsg.erzeugungsKapazitat)/emsg.erzeugungsKapazitat;
				preis = emsg.kosten;
				msg.grenzwertprozent = percentage;
				msg.preis = preis;				
				msg.verbrauch = verbrauchTotal;
				msg.production = production - (emsg.erzeugungsKapazitat* (1-percentage));				
				break;
			}
		}
		System.out.println(gson.toJson(msg));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		display.update(gson.toJson(msg));
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return null;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return msg;
	}

}
