package fortiss.gui.listeners.window;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.FileManager;

public class ExitWindowListner extends WindowAdapter {
	
	@Override
    public void windowClosing(WindowEvent e) {				
    	if(!Designer.getWorkingFile().equals("")) {
    		System.out.println("Saving for: " + Designer.getWorkingFile());
        	Designer.parameterPanel.pars.setLastSavedFile(Designer.getWorkingFile());
        	FileManager.writeParameterConfigFile();
    	}            	
    }

}
