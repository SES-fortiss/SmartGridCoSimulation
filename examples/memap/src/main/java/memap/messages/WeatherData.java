package memap.messages;

import akka.basicMessages.AnswerContent;

public class WeatherData implements AnswerContent {
	
	String url  = "http://www.meteo.physik.uni-muenchen.de/dokuwiki/doku.php?id=wetter:stadt:messung";
	String beschreibung = "Lufttemperatur";
	public double temperatur;

}
