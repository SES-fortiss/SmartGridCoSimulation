package haus.komponente.waschmaschine;

import haus.komponente._messageContents._eVerbraucherAnswerContent;

/**
 * WaschmaschineAnswerContent
 * 27.08.2014
 * @author Markus
 * TODO Prüfen
 */
public class WaschmaschineAnswerContent extends _eVerbraucherAnswerContent{

	/**
	 * Standardkonstruktor
	 * @param name
	 * @param consumptionMAX
	 * @param auftrag
	 */
	public WaschmaschineAnswerContent(String name) {
		super(name, 2500, null);
	}

	
	public String INFOausgeben() {
		String intro = name + ":(consMIN="+this.getConsumptionMIN()+
				" consMAX="+this.getConsumptionMAX() +") {\n";
		String currCons = 		"                currentConsumption:" + getCurrentConsumption()+"\n";
		String futCons = 		"                futureConsumption: ";
		String wishFutCons = 	"                wishFutureConsumption: ";
		String needFutCons = 	"                needFutConsumption: ";
		String infoAuftrag = "";
		if(this.getAuftrag()==null){
			infoAuftrag  = "                Auftag: KEIN Auftrag vorhanden!";
		}else{
			infoAuftrag = "                Auftag: " + this.getAuftrag().INFOausgeben();
		}
		for(int i = 0 ; i < 8 ; i++){
			futCons = futCons + getFutureConsumption(i) + " ";
			wishFutCons = wishFutCons + getWishFutureConsumption(i) + " ";
			needFutCons = needFutCons + getNeedFutureConsumption(i) + " ";
		}
		futCons = futCons +"\n";
		wishFutCons = wishFutCons + "\n";
		needFutCons = needFutCons + "\n";
		
		return intro + currCons +futCons + needFutCons + wishFutCons + infoAuftrag +" }";
	}
}
