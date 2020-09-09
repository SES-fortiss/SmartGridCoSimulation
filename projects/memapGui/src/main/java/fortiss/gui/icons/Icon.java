package fortiss.gui.icons;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import fortiss.gui.listeners.action.RemoveListener;
import fortiss.gui.listeners.action.HighlightListener;
import fortiss.gui.listeners.action.HoverMouseListener;
import fortiss.gui.style.Fonts;

public abstract class Icon extends JLabel  {

	private static final long serialVersionUID = 1L;
	
	protected String type;
	protected ImageIcon selectedIcon;
	protected ImageIcon unselectedIcon;
	
	public Icon(String name, String type, ImageIcon selectedIcon, ImageIcon unselectedIcon) {
		super(name);

		this.type = type;
		this.selectedIcon = selectedIcon;
		this.unselectedIcon = unselectedIcon;
		
		setType(type);
		setIcon(unselectedIcon);
		setFont(Fonts.getOpenSans());
		setVerticalTextPosition(JLabel.BOTTOM);
		setHorizontalTextPosition(JLabel.CENTER);
		
		// Listeners
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				e.getComponent().requestFocus();
			}
		});
		addMouseListener(new HoverMouseListener());
		addKeyListener(new RemoveListener());
		addFocusListener(new HighlightListener());
	}
	
	public Icon(String name, ImageIcon icon, String toolTip) {
		super(name);
		
		setType(name.toLowerCase());
		this.unselectedIcon = icon;
		this.selectedIcon = unselectedIcon;
		
		setIcon(unselectedIcon);
		setFont(Fonts.getOpenSans());
		setVerticalTextPosition(JLabel.BOTTOM);
		setHorizontalTextPosition(JLabel.CENTER);
		
		// Listeners
		addMouseListener(new HoverMouseListener());
	}
	
	@Override
	public String getName() {
		return getText();	
	}
	
	@Override
	public void setName(String name) {
		setText(name);	
	}
	
	public String getType() {
		return type;	
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public abstract void showComponent(boolean focus);
	
	public abstract void highlight();
	
	public abstract void playDown();
	
	public void setSelectedIcon() {
		setIcon(selectedIcon);
	}

	public void setUnselectedIcon() {
		setIcon(unselectedIcon);
	}
}
