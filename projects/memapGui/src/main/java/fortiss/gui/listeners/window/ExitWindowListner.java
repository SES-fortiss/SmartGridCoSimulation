package fortiss.gui.listeners.window;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import fortiss.gui.Designer;
import fortiss.gui.listeners.helper.FileManager;

public class ExitWindowListner extends WindowAdapter {
	
	@Override
    public void windowClosing(WindowEvent e) {		
				
    	if(!Designer.parameterPanel.pars.getLastSavedFile().equals("")) {
    		System.out.println("Update last working file to " + Designer.parameterPanel.pars.getLastSavedFile());        	
        	FileManager.writeParameterConfigFile();
    	}            	
    }

}
