package fortiss.gui.listeners.window;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import fortiss.gui.DesignerPanel;
import fortiss.gui.listeners.helper.FileManager;

public class ExitWindowListener extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {

		String lastFile = DesignerPanel.parameterPanel.pars.getLastSavedFile();
		if (!lastFile.equals("")) {
			FileManager fm = new FileManager();
			fm.writeMemapModel();
			fm.writeParameterConfigFile();

		}
	}
}
