package haus.komponente._behaviorModel;

import haus.komponente._messageContents.__BasicAnswerContent;
import haus.komponente._messageContents.__BasicRequestContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * __BasicBehaviorModel
 * Stellt Methoden/Attribute zur Verfügung, die für jedes Verhalten einer Komponente benötigt werden.
 * 06.10.2014
 * @author Markus
 * @version 1.0
 */
public abstract class __BasicBehaviorModel extends BehaviorModel{
	//Variablen <-------------------------------------------------------------------------------------
	/**
	 * answer speichert wichtige Eigenschaften der Komponente.
	 * Wird gesendet, um dem Vaterknoten Informationen über den aktuellen Status dieser Komponente zu geben.
	 * Zugriff auf Variablen/Kommunikation...
	 */
	public __BasicAnswerContent answer;
	/**
	 * Beschreibt den aktuellen Auftrag für die Komponente
	 * Wird von Vaterknoten gesended. Eindeutige Identifikation über den Namen
	 */
	public __BasicRequestContent request;
	public boolean isDebug = false;
	//Abstrakte Methoden aus BehaviourModel <------------------------------------------------------
	public abstract void handleRequest();
    public abstract void makeDecision();
    public abstract void handleError(LinkedList<ErrorAnswerContent> errors);
    public abstract AnswerContent returnAnswerContentToSend();
    public abstract RequestContent returnRequestContentToSend();
//Abstrakte Methoden zum Aufteilen in kleinere Schritte <-------------------------------------------
	/**
	 * Prüft ob ein Request vorhanden ist.
	 * Ist ein Request vorhanden wird die Membervariable request aktualisiert.
	 * HINWEIS: Diese Methode dient als Orientierungshilfe zum Aufteilen von makeDecision() in sinnvolle Teilschritte.
	 * HINWEIS: Wenn nicht benötigt, leer lassen!!
	 * @return true: Request empfangen
	 */
	public abstract boolean step1updateRequest();
	/**
	 * Wird von makeDecision aufgerufen.
	 * Führt den aktuellen Zeitschritt der Komponente aus.
	 * WICHTIG: Das Verhalten wurde im letzen Schritt bereits berechnet.
	 * Bsp: Kühlschrank - Änderung der Zustandsvariablen
	 * HINWEIS: Diese Methode dient als Orientierungshilfe zum Aufteilen von makeDecision() in sinnvolle Teilschritte.
	 * HINWEIS: Wenn nicht benötigt, leer lassen!!
	 * @return Erfolg
	 */
	public abstract boolean step2simulateStep();
	/**
	 * Simuliert die äußeren Einflüsse durch z.B. den Menschen, das Klima, ...
	 * Hier werden NUR die NICHT berrechenbaren Anteile simuliert!
	 * WICHTIG: Beeinflusst den Verbrauch ggf. beim nächsten Zeitschritt, der aktuelle Verbrauch wird NICHT beeinflusst
	 * HINWEIS: Diese Methode dient als Orientierungshilfe zum Aufteilen von makeDecision() in sinnvolle Teilschritte.
	 * HINWEIS: Wenn nicht benötigt, leer lassen!!
	 * @return true: unvorhersehbares Ereignis
	 */
	public abstract boolean step3simulateInflueces();
	/**
	 * Logik, die den zukünftigen Verbrauch berechnet.
	 * HINWEIS: Beachte evtl. vorhandenes Request
	 * Dabei wird der nächste Verbrauch exakt berechnet.
	 * HINWEIS: Diese Methode dient als Orientierungshilfe zum Aufteilen von makeDecision() in sinnvolle Teilschritte.
	 * HINWEIS: Wenn nicht benötigt, leer lassen!!
	 * @return true: vollständiger Plan konnte erstellt werden.
	 */
	public abstract boolean step4calculateFutureConsumption();
	/**
	 * Aktualisiert die spezifische Antwort der Komponente.
	 * HINWEIS: die Attribute currentConsumption, futureConsumption[] müssen NICHT aktualisiert werden.
	 * 		Diese wurden bereits in Schritt 1 und 3 aktualisiert.
	 * HINWEIS: Diese Methode dient als Orientierungshilfe zum Aufteilen von makeDecision() in sinnvolle Teilschritte.
	 * HINWEIS: Wenn nicht benötigt, leer lassen!!
	 */
	public abstract boolean step5updateAnswer();
//Konstruktor------------------------------------------------------------------------------------------
    /**
	 * Standardkonstruktor
	 * @param answer Startantwort, beeinhaltet wichtige Parameter der Komponente.
	 * @param request Startauftrag.
	 */
	public __BasicBehaviorModel(__BasicAnswerContent answer, __BasicRequestContent request){
		this.answer = answer;
		this.request= request;
	}
//Hilfsmethoden! <-------------------------------------------------------------------------------------
//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
	public __BasicAnswerContent getAnswer(){return (answer);}
	public __BasicRequestContent getRequest(){return (request);}
	public void error(String text){	System.out.println("ERROR: (__BasicBehaviorModel)"+text);	}
	public void debug(String text){	if(isDebug){System.out.println("DEBUG: (__BasicBehaviorModel)"+ text);}}
//Hilfsmethoden <--------------------------------------------------------------------------------------
	public void showTable(double[] a, double[] b , double[] c , double[] d, int begina, int beginb, int beginc, int begind, int length){
		int widthindex=0,widtha=0,widthb=0,widthc=0,widthd=0;
		for(int i = 0 ; i < length ; i++){
			if(widthindex<(""+i).length())	{ widthindex 	= (""+i).length();}
			if(widtha<(""+a[begina+i]).length())	{ widtha		= (""+a[begina+i]).length();}
			if(widthb<(""+b[beginb+i]).length())	{ widthb		= (""+b[beginb+i]).length();}
			if(widthc<(""+c[beginc+i]).length())	{ widthc		= (""+c[beginc+i]).length();}
			if(widthd<(""+d[begind+i]).length())	{ widthd		= (""+d[begind+i]).length();}
		}
		for(int i = 0 ; i < length ; i++){
			for(int j = (""+i).length() ; j<=widthindex ; j++){
				System.out.print(" ");
			}
			System.out.print(i+" | ");
			for(int j = (""+a[begina+i]).length() ; j<=widtha ; j++){
				System.out.print(" ");
			}
			System.out.print(a[begina+i]+" | ");
			for(int j = (""+b[beginb+i]).length() ; j<=widthb ; j++){
				System.out.print(" ");
			}
			System.out.print(b[beginb+i]+" | ");
			for(int j = (""+c[beginc+i]).length() ; j<=widthc ; j++){
				System.out.print(" ");
			}
			System.out.print(c[beginc+i]+" | ");
			for(int j = (""+d[begind+i]).length() ; j<=widthd ; j++){
				System.out.print(" ");
			}
			System.out.println(d[begind+i]+" | ");
		}
	}
}
