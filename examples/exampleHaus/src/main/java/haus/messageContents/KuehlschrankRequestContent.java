package haus.messageContents;


/**
 * KuehlschrankRequestContent
 * 07.05.2014
 * @author Markus
 *
 */
public class KuehlschrankRequestContent extends _BasicRequestContent{
	
	@Override
	public String toString(){
		return ("Kühlschrank:{ acceptedConsumption:" + acceptedConsumption 
				+"  setEnergiesparmodus:" + istEnergieSparModusAN + " }");
	}
}
