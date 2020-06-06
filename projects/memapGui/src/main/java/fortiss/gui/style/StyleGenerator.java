package fortiss.gui.style;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.FontUIResource;

import fortiss.media.Icon;

/**
 * Manages the style configuration for the application
 */
abstract public class StyleGenerator {
	
	public static void setupStyle() {
		
		Font defaultFont = new FontUIResource(Fonts.getOpenSans());
		GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(defaultFont);
		GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(Fonts.getOswald());
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		UIManager.put("Label.foreground", Colors.defaultCol);
		UIManager.put("ToolTip.font", defaultFont);
		UIManager.put("Label.font", defaultFont);
		UIManager.put("Button.font", defaultFont);
		UIManager.put("ToggleButton.font", defaultFont);
		UIManager.put("RadioButton.font", defaultFont);
		UIManager.put("CheckBox.font", defaultFont);
		UIManager.put("ColorChooser.font", defaultFont);
		UIManager.put("ComboBox.font", defaultFont);
		UIManager.put("Label.font", defaultFont);
		UIManager.put("List.font", defaultFont);
		UIManager.put("MenuBar.font", defaultFont);
		UIManager.put("Menu.font", defaultFont);	
		UIManager.put("MenuItem.font", defaultFont);	
		UIManager.put("RadioButtonMenuItem.font", defaultFont);
		UIManager.put("CheckBoxMenuItem.font", defaultFont);
		UIManager.put("PopupMenu.font", defaultFont);
		UIManager.put("OptionPane.font", defaultFont);
		UIManager.put("Panel.font", defaultFont);
		UIManager.put("ProgressBar.font", defaultFont);
		UIManager.put("ScrollPane.font", defaultFont);
		UIManager.put("Viewport.font", defaultFont);
		UIManager.put("TabbedPane.font", defaultFont);		
		UIManager.put("Table.font", defaultFont);
		UIManager.put("TableHeader.font", defaultFont);
		UIManager.put("TextField.font", defaultFont);
		UIManager.put("PasswordField.font", defaultFont);
		UIManager.put("TextArea.font", defaultFont);
		UIManager.put("TextPane.font", defaultFont);
		UIManager.put("EditorPane.font", defaultFont);
		UIManager.put("TitledBorder.font", defaultFont);
		UIManager.put("ToolBar.font", defaultFont);
		UIManager.put("ToolTip.font", defaultFont);
		UIManager.put("Tree.font", defaultFont);
		UIManager.put("Tree.closedIcon", Icon.closedNode);
		UIManager.put("Tree.openIcon", Icon.openNode);
		UIManager.put("Tree.leafIcon", Icon.itemNode);
		
	}

}
