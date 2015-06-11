package haus.komponente._behaviorModel;

import haus.komponente._messageContents._iVerbraucherAnswerContent;
import haus.komponente._messageContents._iVerbraucherRequestContent;
import haus.komponente.kuehlschrank.KuehlschrankRequestContent;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

/**
 * _iVerbraucherBehaviorModel
 * Stellt Methoden/Attribute zur Verfügung, die für jedes Verhalten eines intelligenten Verbrauchers benötigt werden.
 * Intelligenten Verbraucher haben in irgendeiner Art und Weise einen Energiepuffer. 
 * Dieser liegt oft in einer anderen Energieform als Elektrische Energie vor.
 * Beispiele sind: Kühlschrank, Elektrische Heizung, Aquarienheizung
 * Implementiertes Verhalten:
 * calculateFairFutureConsumption FERTIG
 * 06.10.2014
 * @author Markus
 * @version 1.0
 */
public abstract class _iVerbraucherBehaviorModel extends __BasicBehaviorModel{
//Abstrakte Methoden aus BehaviourModel <---------------------------------------------------------
	public abstract void handleRequest();
    public abstract void makeDecision();
    public abstract void handleError(LinkedList<ErrorAnswerContent> errors);
    public abstract AnswerContent returnAnswerContentToSend();
    public abstract RequestContent returnRequestContentToSend();
//Abstrakte Methoden zum Aufteilen in kleinere Schritte (__BasicBehaviourModel) <-------------------
	public abstract boolean step1updateRequest();
	//public abstract boolean step2simulateStep();
	public abstract boolean step3simulateInflueces();
	//public abstract boolean step4calculateFutureConsumption();
	//public abstract boolean step5updateAnswer();
//Hilfsmethoden! <--------------------------------------------------------------------------------
	//Diese Methoden sollten in Unterklassen überschrieben werden!!!!
	public _iVerbraucherAnswerContent getAnswer(){		return ((_iVerbraucherAnswerContent)answer);}
	public _iVerbraucherRequestContent getRequest(){	return ((_iVerbraucherRequestContent)request);}
	public void error(String text){	System.out.println("ERROR: (_iVerbraucherBehaviorModel)Name:"+getAnswer().name+text);	}
	public void debug(String text){	if(isDebug){System.out.println("DEBUG: (_iVerbraucherBehaviorModel)Name:"+getAnswer().name+ text);}}

//Abstrakte Methoden in _iVerbraucherBehaviourModel <-----------------------------------------------
	/**
	 * Simuliert/berechnet den Mindestbedarf an Energie, den der Verbraucher in length Zeitschritten ab 
	 * Timestep actTimestep mindestens aufnimmt
	 * @param length Anzahl Simulationsschritte
	 * @param actTimestep Zeitschritt ab dem simuliert wird
	 * @return Mindestbedarf [Wh]
	 */
	public abstract double getMindestbedarf(int length, int actTimestep);
//Implementierte Methoden <--------------------------------------------------------------------------
	/**
	 * Standardkontruktor für Intelligente Verbraucher mit Puffer
	 * @param answer Antwort speichert spezifische Information zum Verbraucher
	 * @param request Standardrequest des Verbrauchers
	 */
	public _iVerbraucherBehaviorModel(_iVerbraucherAnswerContent answer,
			_iVerbraucherRequestContent request) {
		super(answer, request);
	}
//Geerbte Methoden (hier implementiert)<-------------------------------------------------------------
	public boolean step2simulateStep() {
		//Hinweiß: der Wert von isBuffer entspricht dem Ende des simulierten Zeitschrittes, 
		//in dieser Zeit war die Leistungsaufnahme currentConsumption
		//->Erst futureConsumption ändern dann isBuffer...
		//currentConsumption ändern
		getAnswer().setCurrentConsumption(getAnswer().getFutureConsumption(0));
		//futureConsumption ändern
		for(int i = 0; i < 7 ; i++){
			getAnswer().setFutureConsumption(getAnswer().getFutureConsumption(i+1), i);
		}
		getAnswer().setFutureConsumption(0, 7);
		
		//currentCapacity ändern:
		//debug("step2:");
		//debug("oldBuffer:" + getAnswer().getBuffer());
		@SuppressWarnings("unused")
		//!Stimmet da der Puffer als Wh*4 angegeben...                              ->!*4 Falsch
		double temp =getAnswer().changeBuffer(-getMindestbedarf(1, getActualTimeStep()));
		//debug("nach Mindestbedarf-Abzug:"+temp);
		temp = getAnswer().changeBuffer(getAnswer().getCurrentConsumption());
		//debug("newBuffer:"+temp);
		
		return true;
	}
	public boolean step4calculateFutureConsumption() {
		if(getRequest().istModusAutomatik){
			//Fall 1.
			if(getRequest().istModusPufferEntladen==false&&getRequest().istModusPufferLaden==false){
				//Fall 1.1
				debug(" bestimmt futureConsumption nach calculateFairFutureConsumption!");
				getAnswer().setFutureConsumption(this.calculateFairFutureConsumption(getAnswer(), getRequest(), getActualTimeStep()));
			}
			if(getRequest().istModusPufferEntladen){
				//Fall 1.2	(getestet)
				double[] exp = new double[96];
				double[] expMIN = new double[96];
				double[] expMAX = new double[96];
				for(int i = 0 ; i < 96 ; i++){
					exp[i] = getAnswer().getConsumptionMIN();
					expMIN[i] = getAnswer().getConsumptionMIN();
					expMAX[i] = getAnswer().getConsumptionMAX();
				}
				KuehlschrankRequestContent ladenRequest = new KuehlschrankRequestContent("Kuehlschrank1", exp, expMIN, expMAX, true, false, false);
				getAnswer().setFutureConsumption(this.calculateFairFutureConsumption(getAnswer(), ladenRequest, getActualTimeStep()));
			}
			if(getRequest().istModusPufferLaden){
				//Fall 1.3 (getestet)
				debug(getAnswer()+" bestimmt futureConsumption im Modus LADEN!");
				double Buffer = getAnswer().getBuffer();
				for(int i = 0 ; i < 8 ; i++){
					Buffer -= getMindestbedarf(1, getActualTimeStep()+1+i);
					if(Buffer+getAnswer().getConsumptionMAX()<getAnswer().bufferMAX){
						getAnswer().setFutureConsumption(getAnswer().getConsumptionMAX(), i);
						Buffer += getAnswer().getConsumptionMAX();
					}else{
						getAnswer().setFutureConsumption(getAnswer().bufferMAX-Buffer, i);
						Buffer = getAnswer().bufferMAX;
					}
				}
			}
		}else{
			//Fall 2. (getestet)
			debug("Manueller Modus aktiviert.");
			//Verhalten: Puffer wird entladen -> wenn leer -> Puffer laden -> wenn voll -> beginne von vorne
			//beachte nur die Variable getRequest().istModusPufferLaden
			if(getAnswer().getBuffer()-getMindestbedarf(1, getActualTimeStep()+1)<0){ getRequest().istModusPufferLaden = true;}
			if(getAnswer().getBuffer()-getMindestbedarf(1, getActualTimeStep()+1)+getAnswer().getConsumptionMAX()>getAnswer().bufferMAX){ getRequest().istModusPufferLaden = false;}
			boolean laden = getRequest().istModusPufferLaden;
			double Buffer = getAnswer().getBuffer();
			for(int i = 0 ; i < 8 ; i++){
				Buffer -= getMindestbedarf(1, getActualTimeStep()+1+i);
				if(Buffer<0){laden = true;}
				if(Buffer+getAnswer().getConsumptionMAX()>getAnswer().bufferMAX){laden = false;}
				if(laden){
					Buffer += getAnswer().getConsumptionMAX();
					getAnswer().setFutureConsumption(getAnswer().getConsumptionMAX(), i);
				}
			}
		}
		
		//getAnswer().setFutureConsumption(this.calculateFairFutureConsumption(getAnswer(), getRequest(), this.getActualTimeStep()));
		/*debug("Überprüfung auf korrekte Berechnung von futureConsumption:");
		int t = this.getgetActualTimeStep()()+1;
		System.out.println("I|expCon|expConMIN|expConMAX|futureConsumption");
		showTable(getRequest().getExpectedConsumption(), 
				getRequest().getExpectedConsumptionMINArray(), 
				getRequest().getExpectedConsumptionMAXArray(), 
				getAnswer().getFutureConsumption(),
				t,t,t,0,8);*/
		return true;
	}
	public boolean step5updateAnswer() {
		getAnswer().setNeedFutureConsumption(this.calculateNeedFutureConsumption(getAnswer(), this.getActualTimeStep()));
		getAnswer().setWishFutureConsumption(this.calculateWishFutureConsumption(getAnswer(), this.getActualTimeStep()));
		String need ="";
		String wish ="";
		for(int i = 0 ; i < 8 ; i++){
			need += " "+getAnswer().getNeedFutureConsumption(i);
			wish += " "+getAnswer().getWishFutureConsumption(i);
		}
		debug(" NeedConsumption: "+need);
		debug(" WishConsumption: "+wish);
		return true;
	}	
//Hilfsmethoden <----------------------------------------------------------------------------------------------------
	/**
	 * Berechnet NeedFutureConsumption
	 * @param answer 
	 * @param actTimestep akteller Timestep
	 * @return calculated NeedFutureConsumption[8]
	 */
	public double[] calculateNeedFutureConsumption(_iVerbraucherAnswerContent answer, int actTimestep){
		//TODO Für alle Zeitschritte erweitern
		double[] need = {0,0,0,0,0,0,0,0};
		double buf = answer.getBuffer();
		for(int i = 0 ; i < 8 ; i++){
			if(i>0){ need[i]=need[i-1];}
			buf -= getMindestbedarf(1, actTimestep+1+i);
			if(buf<0){
				need[i] -= buf;
				buf = 0;
			}
		}
		return need;
	}
	/**
	 * Berechnet WishFutureConsumption
	 * @param answer 
	 * @param actTimestep aktueller Timestep
	 * @return calculated WishFutureConsumption[8]
	 */
	public double[] calculateWishFutureConsumption(_iVerbraucherAnswerContent answer, int actTimestep){
		double[] wish = {0,0,0,0,0,0,0,0};
		wish[0] = answer.bufferMAX-answer.getBuffer();
		for(int i = 0 ; i < 8 ; i++){
			if(i>0){ wish[i] = wish[i-1];}
			wish[i] += getMindestbedarf(1,actTimestep+1+i);
		}
		return wish;
	}
	/**
	 * Diese Methode stellt eine Prognose für die nächsten 8 Timesteps auf (2Stunden). Dabei werden die im Request gespeicherten 
	 * Anweisungen möglichst eingehalten. Verhalten: Oberste Priorität hat die Funktionsfähigkeit der Komponente, d.h der
	 * Mindestumsatz muss entweder direkt oder indirekt durch den kleinen Puffer erbracht werden. Ist das gewährleistet 
	 * errechnet die Methode einen möglchst ausgeglichenen Plan und versucht die expectedConsumption-Werte einzuhalten. Können 
	 * diese nicht eingehalten werden, versucht die Methode zwischen expectedConsumptionMIN/expectedConsumptionMAX zu bleiben.
	 * @param answer Speichert spezifische Werte des Verbrauchers
	 * @param request Anweisung zum Verbrauch
	 * @param actTimestep [Standard: this.getActualTimeStep()] kann auch zum simulieren benutzt werden.
	 * @return futureConsumption[8]
	 * Fehler behoben, getestet
	 */
	public double[] calculateFairFutureConsumption(_iVerbraucherAnswerContent answer, _iVerbraucherRequestContent request, int actTimestep){
		//1. Berechne Mindestbedarf
		//2. verteile Mindestbedarf auf expectedConsumptionMIN
		//		wenn neuer Mindestbedarf<0: Prüfe, ob Puffer voll, wenn ja reduziere Verbrauch und beende die Methode
		//3. verteile Rest von Mindestbedarf auf expectedConsumption
		//		wenn neuer Mindestbedarf<0: Prüfe, ob Puffer voll, wenn ja reduziere Verbrauch anteilig und beende die Methode
		//4. verteile Rest von Mindestbedarf auf expectedConsumptionMAX (getestet)
		//		wenn neuer Mindestbedarf<0: Prüfe, ob Puffer voll, wenn ja reduziere Verbrauch anteilig und beende die Methode
		//5. verteile Rest von Mindestbedarf auf alle.
		
		//1.
		double buf = answer.getBuffer();
		double[] futureConsumption = {0,0,0,0,0,0,0,0};
		double[] futureBuffer={buf,buf,buf,buf,buf,buf,buf,buf};
		//2./1. funktioniert
		for(int i = 0 ; i < 8 ; i++){
			//Simuliere Mindestbedarf
			if(i!=0){ futureBuffer[i] = futureBuffer[i-1];}
			futureBuffer[i] = futureBuffer[i]-getMindestbedarf(1,actTimestep+1+i);
			futureBuffer[i] += request.getExpectedConsumptionMIN(actTimestep+1+i);
			futureConsumption[i] += request.getExpectedConsumptionMIN(actTimestep+1+i);
			if(futureBuffer[i]>answer.bufferMAX){
				futureConsumption[i] -= (futureBuffer[i]-answer.bufferMAX);
				futureBuffer[i] -= (futureBuffer[i]-answer.bufferMAX);
			}
		}
		//3.
		double[] exp = {0,0,0,0,0,0,0,0};
		for(int i = 0 ; i < 8 ; i++){
			exp[i] = request.getExpectedConsumption(actTimestep+1+i)-request.getExpectedConsumptionMIN(actTimestep+1+i);
			double pruefung = 0;
			for(int j = 0 ; j <=i ; j++){ pruefung +=exp[j];}
			if(futureBuffer[i]+pruefung>answer.bufferMAX){
				//Prozentuelle Reduktion
				//startindex bestimmen (letzte Position an der futureBuffer<20%
				int startindex = i;
				boolean weiter = true;
				while(weiter){
					if(futureBuffer[startindex]+sumOfArray(exp, 0, startindex+1)>answer.bufferMAX*0.4&&startindex>0){
						startindex--;
					}else{
						weiter=false;
					}
				}
				/*while(futureBuffer[startindex]>answer.bufferMAX*0.2&&startindex>0){
					startindex--;
				}*/
				double absolutReduzierung 	= futureBuffer[i]+sumOfArray(exp, 0, i+1)-answer.bufferMAX;
				double moeglicheReduzierung = sumOfArray(exp, startindex, i+1);
				double factor = absolutReduzierung/moeglicheReduzierung;
				for(int j = startindex ; j <= i ; j++){
					exp[j] = (int)(exp[j] * (1-factor));
				}
			}
		}
		//Werte übernehmmen
		for(int i = 0 ; i < 8 ; i++){
			futureConsumption[i] +=(int)exp[i];
			for(int j = i ; j < 8 ; j++){
				futureBuffer[j] +=exp[i];
			}
		}
		//4.
		//Vorerst: Einfach - getestet
		//TODO Logik erweitern
		//1. Suche manimalen Index
		//		a) beginne bei aktuellem index
		//		b) wiederhole solange index>0 && (pufferbisVoll(i)>maximalesPotential(<i) || pufferbisVoll>Zwangsaufladung/anzahlTimesteps)
		//2. Berechne maximales Potential
		//3. berechne Faktor
		//4. Aktualisiere futureConsumption, futureBuffer
		for(int i = 0 ; i < 8 ; i++){
			if(futureBuffer[i]<0){
				double RestErhoehung = -futureBuffer[i];
				//Puffer ist negativ -> vorher muss mehr Leistung aufgenommen werden.
				for(int j = i ; j >=0 ; j--){
					//getMaxpotential für Erhöhung an stelle j
					double maxPotential = answer.bufferMAX-futureBuffer[j];
					for(int t1 = i ; t1>=j ; t1--){
						if(maxPotential>(answer.bufferMAX-futureBuffer[t1])){
							maxPotential = (answer.bufferMAX-futureBuffer[t1]);
						}
					}
					//Leistungserhöhung
					if((request.getExpectedConsumptionMAX(actTimestep+1+j)-request.getExpectedConsumption(actTimestep+1+j))<=maxPotential){
						//Erhöhen auf expectedConsumptionMAX erlaubt
						if(RestErhoehung>=request.getExpectedConsumptionMAX(actTimestep+1+j)-request.getExpectedConsumption(actTimestep+1+j)){
							//Erhöhe auf expectedConsumptionMAX
							futureConsumption[j] += request.getExpectedConsumptionMAX(actTimestep+1+j)-
									request.getExpectedConsumption(actTimestep+1+j);
							for(int k = j ; k < 8 ; k++){
								futureBuffer[k] += request.getExpectedConsumptionMAX(actTimestep+1+j)
										-request.getExpectedConsumption(actTimestep+1+j);
							}
							RestErhoehung -=request.getExpectedConsumptionMAX(actTimestep+1+j)
									-request.getExpectedConsumption(actTimestep+1+j);
						}else{
							//erhöhe um RestErhöhung falls möglich
							if(futureConsumption[j]+RestErhoehung<=answer.getConsumptionMAX()){
								futureConsumption[j] += RestErhoehung;
								for(int k = j ; k < 8 ; k++){
									futureBuffer[k] += RestErhoehung;
								}
								RestErhoehung =0;
								j=-1; //Schleife abbrechen...
							}else{
								double restbisConsMAX = answer.getConsumptionMAX()-futureConsumption[j];
								futureConsumption[j] += restbisConsMAX;
								for(int k = j ; k < 8 ; k++){
									futureBuffer[k] += restbisConsMAX;
								}
								RestErhoehung -= restbisConsMAX;
							}
						}
					}else{
						//nur um maxPotential erhöhen erlaubt
						if(maxPotential<RestErhoehung){
							//Erhöhe um maxPotential
							futureConsumption[j] += maxPotential;
							for(int k = j ; k < 8 ; k++){
								futureBuffer[k] += maxPotential;
							}
							RestErhoehung -= maxPotential;
						}else{
							//erhöhe um Resterhöhung
							futureConsumption[j] += RestErhoehung;
							for(int k = j ; k < 8 ; k++){
								futureBuffer[k] += RestErhoehung;
							}
							RestErhoehung = 0;
						}
					}				
				}
			}
			//5.
			if(futureBuffer[i]<0){
				double erhoehung = -futureBuffer[i];
				if(futureConsumption[i]+erhoehung>getAnswer().getConsumptionMAX()){
					erhoehung -= futureConsumption[i]+erhoehung - getAnswer().getConsumptionMAX();
				}
				futureConsumption[i] += erhoehung;
				for(int k = i ; k < 8 ; k++){
					futureBuffer[k] += erhoehung;
				}
			}
		}
		return futureConsumption;
	}
	/**
	 * Berechnet die Summe aus einem Array
	 * @param exp Array
	 * @param startindex Startiterator
	 * @param enditerator Enditerator, erste Position, die nicht mehr gezählt wird.
	 * @return Summe des Arrays in dem vergegebenen Bereich
	 */
	public double sumOfArray(double[] exp, int startindex, int enditerator) {
		if(exp==null){return 0;}
		if(startindex<0){ startindex=0;}
		double sum = 0;
		for(int i = startindex ; i < enditerator ; i++){
			if(exp.length>i){
				sum += exp[i];
			}
		}
		return sum;
	}
}
