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
		return ("K�hlschrank:{ acceptedConsumption:" + acceptedConsumption 
				+"  setEnergiesparmodus:" + istEnergieSparModusAN + " }");
	}
}
