package fortiss.simulation.helper;

import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import fortiss.gui.LogPanel;
import fortiss.gui.style.Colors;


public class Logger {
	
	private static Logger logger = new Logger();
	private LogPanel logPanel;
	
	public static Logger getInstance() {
		return logger;
	}
	
	
	public void writeInfo (String message) {
		String header = "INFO: ";
		SimpleAttributeSet attributeSet = new SimpleAttributeSet();  
		StyleConstants.setForeground(attributeSet, Colors.green);
		logPanel.publish(header, attributeSet);
		
		StyleConstants.setForeground(attributeSet, Colors.defaultCol);
		logPanel.publish(message + "\n", attributeSet);

		// Log into the console
		System.out.println(header + message);
	}
	
	public void writeError(String error) {
		String header = "ERROR: ";
		SimpleAttributeSet attributeSet = new SimpleAttributeSet();  
		StyleConstants.setForeground(attributeSet, Colors.red);
		logPanel.publish(header, attributeSet);
		StyleConstants.setForeground(attributeSet, Colors.defaultCol);
		logPanel.publish(error + "\n", attributeSet);
	
		// Log into the console
		System.err.println(header + error);
	}

	public void writeWarning(String warning) {
		String header = "WARNING: ";
		SimpleAttributeSet attributeSet = new SimpleAttributeSet();  
		StyleConstants.setForeground(attributeSet, Colors.accent2);
		logPanel.publish(header, attributeSet);
		StyleConstants.setForeground(attributeSet, Colors.defaultCol);
		logPanel.publish(warning + "\n", attributeSet);
		
		// Log into the console
		System.out.println(header + warning);
	}

	public void setLogPanel(LogPanel logPanel) {
		this.logPanel = logPanel;
	}

}
