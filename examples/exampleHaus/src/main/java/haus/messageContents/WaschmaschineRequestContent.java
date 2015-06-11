package haus.messageContents;

import akka.basicMessages.RequestContent;

/**
 * WaschmaschineRequestContent
 * 04.05.2014
 * @author Markus
 *
 */
public class WaschmaschineRequestContent implements RequestContent {
	
	public boolean istAenderung; 	//Gibt an ob der EMS der Waschmaschine einen Befehl gibt oder ob folgende Variablen ignoriert werden.
	public boolean ausschalten; 	//Befehl Waschmaschine ausschalten
	public boolean sparModus;		//Aktiviert den Stromsparmodus
	
	public WaschmaschineRequestContent(){
		istAenderung = false;
	}
	
	@Override
	public String toString(){
		return ("Request an Waschmaschine: { istAenderung:" + istAenderung + 
			  "  ausschalten:" + ausschalten +
			  "  sparModus:" + sparModus + " }");
	}

}
