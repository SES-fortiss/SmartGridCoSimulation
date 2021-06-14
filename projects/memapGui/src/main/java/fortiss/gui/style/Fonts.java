package fortiss.gui.style;
import java.awt.Font;
import java.io.InputStream;

/**
 * Stores font configuration
 */
public class Fonts {

	private static String oswaldPath = "/fonts/Oswald/Oswald-Light.ttf";
	private static String openSansPath = "/fonts/Open_Sans/OpenSans-Light.ttf";
	
	public static Font getOswald() {
		Font font;
		try {
			InputStream file = Fonts.class.getResourceAsStream(oswaldPath);
	        font = Font.createFont(Font.TRUETYPE_FONT, file);
			font  = font.deriveFont(Font.LAYOUT_LEFT_TO_RIGHT, 18);
		} catch (Exception e) {
			System.err.println(e);
			font = new Font("Tahoma", Font.BOLD, 15);
		}
		return font;
	}
	
	public static Font getOswald(int fontSize) {
		Font font;
		try {
			InputStream file = Fonts.class.getResourceAsStream(oswaldPath);
	        font = Font.createFont(Font.TRUETYPE_FONT, file);
			font  = font.deriveFont(Font.LAYOUT_LEFT_TO_RIGHT, fontSize);
		} catch (Exception e) {
			System.err.println(e);
			font = new Font("Tahoma", Font.BOLD, fontSize);
		}
		return font;
	}

	public static Font getOpenSans() {
		Font font;
		try {	 
			InputStream file = Fonts.class.getResourceAsStream(openSansPath);
	        font = Font.createFont(Font.TRUETYPE_FONT, file);
			font  = font.deriveFont(Font.LAYOUT_LEFT_TO_RIGHT, 12);
		} catch (Exception e) {
			System.err.println(e);
			font = new Font("Tahoma", Font.PLAIN, 12);
		}
		return font;
	}
	
	public static Font getOpenSans(int fontSize) {
		Font font;
		try {	 
			InputStream file = Fonts.class.getResourceAsStream(openSansPath);
	        font = Font.createFont(Font.TRUETYPE_FONT, file);
			font  = font.deriveFont(Font.LAYOUT_LEFT_TO_RIGHT, fontSize);
		} catch (Exception e) {
			System.err.println(e);
			font = new Font("Tahoma", Font.PLAIN, fontSize);
		}
		return font;
	}
}
