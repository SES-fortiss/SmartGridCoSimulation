package fortiss.gui.style;

import java.awt.Color;

/**
 * Stores color schemes
 */
abstract public class Colors {

	/** Color for titles */
	public static Color title = new Color(63, 62, 57); // dark gray
	/** Color for copyright notice and component box area name */
	public static Color accent1 = new Color(1, 49, 131); // blue
	/** Color for area names, except component box area */
	public static Color accent2 = new Color(190, 145, 18); // dark yellow
	/** Color for user input fields name and component box icon names */
	public static Color normal = new Color(0, 0, 0); // black
	
	public static Color red = Color.decode("#bb0a1e");
	public static Color darkGray = Color.decode("#6B6B6B");
	public static Color gray = Color.decode("#eeeeee");
	public static Color green = Color.decode("#006666");
	/** MEMAP Style Color */
	public static Color white = new Color(255, 255, 255); // the dark green of memap
	
	/**
	 * Color for icons in the layout and added-components area, and for instructions
	 */
	public static Color defaultCol = new Color(63, 62, 57); // dark gray
	/** Background colors */
	public static Color background = new Color(235, 235, 235); // light gray

	public static void setDarkModeOff() {
		title = new Color(63, 62, 57); // dark gray
		accent1 = new Color(1, 49, 131); // blue
		accent2 = new Color(190, 145, 18); // dark yellow
		normal = new Color(0, 0, 0); // black
		defaultCol = new Color(63, 62, 57); // dark gray
		background = new Color(235, 235, 235); // light gray
	}

	public static void setDarkModeOn() {
		title = new Color(114, 156, 194); // blue
		accent1 = new Color(114, 156, 194); // blue
		accent2 = new Color(242, 251, 122); // yellow
		normal = new Color(194, 212, 229); // light blue
		defaultCol = new Color(225, 225, 225); // light gray
		background = new Color(64, 64, 64); // dark gray
	}

}
