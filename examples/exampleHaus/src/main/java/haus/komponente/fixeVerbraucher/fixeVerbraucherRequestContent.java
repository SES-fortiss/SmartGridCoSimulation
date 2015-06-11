package haus.komponente.fixeVerbraucher;

import haus.komponente._messageContents.__BasicRequestContent;

/**
 * fixeVerbraucherRequestContent
 * An einen nicht steuerbaren Verbraucher können keine Requests gesendet werden.
 * 12.09.2014
 * @author Markus
 *
 */
public class fixeVerbraucherRequestContent extends __BasicRequestContent{

	/**
	 * @param name
	 */
	public fixeVerbraucherRequestContent(String name) {
		super(name, 0);
		System.out.println("fixeVerbraucherRequestContent Konstruktor aufgerufen! (Nutzlos)");
	}

}
