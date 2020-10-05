package fortiss.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import fortiss.gui.commands.CloseCommand;
import fortiss.gui.commands.LoadCommand;
import fortiss.gui.commands.ResetCommand;
import fortiss.gui.commands.RunCommand;
import fortiss.gui.commands.SaveAsCommand;
import fortiss.gui.commands.SaveCommand;
import fortiss.simulation.PlanningTool;

public class MenuBar extends JMenuBar implements ActionListener {

	// Menu bar options
	private static final String FILE = "File";
	private static final String LOAD = "Load";
	private static final String SAVE = "Save";
	private static final String SAVE_AS = "Save as...";
	private static final String CLOSE_WINDOW = "Save and close";

	private static final String VIEW = "View";
	private static final String DESIGNER_PANEL = "Design tool";
	private static final String OVERVIEW_RESULT_PANEL = "Results overview";
	private static final String DETAILED_RESULT_PANEL = "Detailed results";
	private static final String LOG_PANEL = "Log panel";

	private static final String SIMULATION = "Simulation";
	private static final String START_SIMULATION = "Start simulation";
	private static final String RESET = "Reset";

	private static final long serialVersionUID = 1L;

	public MenuBar() {
		add(createMenu(FILE, new String[] { LOAD, SAVE, SAVE_AS, CLOSE_WINDOW }));
		add(createMenu(VIEW, new String[] { DESIGNER_PANEL, OVERVIEW_RESULT_PANEL, DETAILED_RESULT_PANEL, LOG_PANEL }));
		add(createMenu(SIMULATION, new String[] { START_SIMULATION, RESET }));
	}

	private JMenu createMenu(String menuName, String[] menuItemNames) {
		JMenu menu = new JMenu(menuName);
		for (int i = 0; i < menuItemNames.length; i++) {
			JMenuItem item = new JMenuItem(menuItemNames[i]);
			item.addActionListener(this);
			menu.add(item);
		}
		return menu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String selection = e.getActionCommand();
		PlanningTool planningTool = PlanningTool.getInstance();
		
		switch (selection) {
		case LOAD:
			new LoadCommand().execute();
			break;
		case SAVE:
			new SaveCommand().execute();
			break;
		case SAVE_AS:
			new SaveAsCommand().execute();
			break;
		case CLOSE_WINDOW:
			new CloseCommand().execute();
			break;
		case DESIGNER_PANEL:
			planningTool.addDesignerAsTab();
			planningTool.getPlanningToolWindow().showTab(planningTool.getDesignerPanel());
			break;
		case OVERVIEW_RESULT_PANEL:
			planningTool.addOverviewResutlsAsTab();
			planningTool.getPlanningToolWindow().showTab(planningTool.getReporterOverviewPanel());
			break;
		case DETAILED_RESULT_PANEL:
			planningTool.addDetailedResultsAsTab();
			planningTool.getPlanningToolWindow().showTab(planningTool.getReporterPanel());
			break;
		case LOG_PANEL:
			planningTool.addLogAsATab();
			planningTool.getPlanningToolWindow().showTab(planningTool.getLogPanel());
			break;
		case START_SIMULATION:
			new RunCommand().execute();
			break;
		case RESET:
			new ResetCommand().execute();
		}
	}
}