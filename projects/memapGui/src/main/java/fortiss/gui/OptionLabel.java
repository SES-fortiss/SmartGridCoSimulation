package fortiss.gui;

import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import fortiss.gui.listeners.helper.OptionObserver;

public class OptionLabel extends JLabel {

	private static final long serialVersionUID = 1L;
	
	public class Option {
		private String name;
		private ImageIcon icon;

		public Option(String name, ImageIcon icon) {
			this.setName(name);
			this.setIcon(icon);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ImageIcon getIcon() {
			return icon;
		}

		public void setIcon(ImageIcon icon) {
			this.icon = icon;
		}
	}
	
	private int currentOption;
	private LinkedList<Option> options;
	private OptionObserver observer;

	public OptionLabel(String[] names, ImageIcon[] icons, OptionObserver observer) {
		super("");
		setIcon(icons[0]);
		options = new LinkedList<Option>();
		for (int i = 0; i < names.length; i++) {
			options.add(new Option(names[i], icons[i]));
		}
		this.observer = observer;
		
		currentOption = 0;
	}
	
	public void setOption(String optionName) {
		// Find option and set it as current
		for(Option option: options) {
			if(option.getName().equals(optionName)) {
				currentOption = options.indexOf(option);
				setIcon(option.icon);
			}
		}
	}

	public String getOptionName() {
		return getText();
	}

	public void nextOption() {
		currentOption = (currentOption + 1) % options.size();
		Option nextOption = options.get(currentOption);
		setIcon(nextOption.getIcon());
		observer.update(nextOption);
	}

}
