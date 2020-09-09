package fortiss.simulation;

import java.awt.Container;
import java.awt.EventQueue;
import java.io.BufferedReader;

import com.google.gson.Gson;

import fortiss.gui.DesignerPanel;
import fortiss.gui.PlanningToolWindow;
import fortiss.gui.TrackerPanel;
import fortiss.gui.listeners.helper.FileManager;
import fortiss.gui.listeners.helper.ModelInitHelper;
import fortiss.media.IconStore;
import fortiss.results.Reporter;
import fortiss.results.ReporterDetailedResultPanel;
import fortiss.results.ReporterOverviewPanel;
import fortiss.simulation.helper.ProgressManager;
import memap.controller.GuiController;

/** Entry point for the application */
public class PlanningTool {

	private static final String DESIGNER_PANEL = "Design tool";
	private static final String TRACKER_PANEL = "Simulation progress";
	private static final String OVERVIEW_RESULT_PANEL = "Results overview";
	private static final String DETAILED_RESULT_PANEL = "Detailed results";

	private static PlanningTool planningTool = new PlanningTool();

	/** Parameters of the simulation */
	private Parameters parameters;

	/** Main frame */
	private PlanningToolWindow planningToolWindow;
	/** Designer panel */
	private DesignerPanel designerPanel;
	/** Progress panel */
	private TrackerPanel trackerPanel;
	/** Reporter */
	private Reporter reporter;
	/** Reporter panel */
	private ReporterDetailedResultPanel reporterDetailedResultPanel;
	/** Reporter overview panel */
	private ReporterOverviewPanel overviewPanel;
	/** GUI controller */
	private GuiController guiController;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ProgressManager.getInstance().execute();
			}
		});
	}

	public static PlanningTool getInstance() {
		return planningTool;
	}

	/**
	 * Initialize the application panels (and manager classes) and add them to the
	 * main frame's content pane.
	 */
	public void init() {
		setPlanningToolWindow(new PlanningToolWindow());
		setParameters(new Parameters());

		setDesignerPanel(new DesignerPanel());
		setTrackerPanel(new TrackerPanel());

		initLastSession();

		setReporter(new Reporter());
		setReporterOverviewPanel(new ReporterOverviewPanel());
		setReporterPanel(new ReporterDetailedResultPanel());
	}

	public void initLastSession() {
		Gson gson = new Gson();
		FileManager fm = new FileManager();
		BufferedReader br = fm.readParameterConfigFile();

		String workingFile = "";
		Parameters par = null;

		if (br != null) {
			par = gson.fromJson(br, Parameters.class);
			// TODO Why clearing it here?
			par.clearDescriptorFiles();
			workingFile = par.getLastSavedFile();

			System.out.println("<INFO> - Parameters: " + gson.toJson(par));
		}

		if (!workingFile.isEmpty()) {
			ModelInitHelper.loadFromFile(workingFile);
			ModelInitHelper.initParameters(par);
		} else {
			System.out.println("lastWorkingFile: " + workingFile);
		}
	}

	/** Add the designer panel as a tab */
	public void addDesignerAsTab() {
		getPlanningToolWindow().addPanelAsTab(DESIGNER_PANEL, IconStore.edit, getDesignerPanel());
	}

	/** Add the results overview panel as a tab */
	public void addOverviewResutlsAsTab() {
		getPlanningToolWindow().addPanelAsTab(OVERVIEW_RESULT_PANEL, IconStore.statistics, getReporterOverviewPanel());
	}

	/** Add the detailed results panel as a tab */
	public void addDetailedResultsAsTab() {
		getPlanningToolWindow().addPanelAsTab(DETAILED_RESULT_PANEL, IconStore.series, getReporterPanel());
	}

	/** Add the tracker panel as a tab */
	public void addTrackerAsTab() {
		getPlanningToolWindow().addPanelAsTab(TRACKER_PANEL, IconStore.exclamation, getTrackerPanel());
	}

	/** Show the designer panel using the information from last session */
	public void showDesigner() {
		addDesignerAsTab();
	}

	/** Show the tracker panel */
	public void showTracker() {
		addTrackerAsTab();
		getPlanningToolWindow().showTab(getTrackerPanel());
		repaintAll();
	}

	/** Loads the results and show the reporter panel */
	public void showReporter() {
		getReporter().showResults();

		getPlanningToolWindow().closeTab(getTrackerPanel());
		addOverviewResutlsAsTab();
		addDetailedResultsAsTab();
		getPlanningToolWindow().showTab(getReporterOverviewPanel());
		repaintAll();
	}

	/** Revalidates and repaints the main frame's content pane */
	public void repaintAll() {
		getPlanningToolWindow().getContentPane().revalidate();
		getPlanningToolWindow().getContentPane().repaint();
	}

	/** @return designerPanel */
	public DesignerPanel getDesignerPanel() {
		return designerPanel;
	}

	/**
	 * Set the designerPanel
	 * 
	 * @param designer an object of type {@link DesignerPanel}}
	 */
	public void setDesignerPanel(DesignerPanel designerPanel) {
		this.designerPanel = designerPanel;
	}

	/** @return trackerPanel */
	public TrackerPanel getTrackerPanel() {
		return trackerPanel;
	}

	/**
	 * Set the trackerPanel
	 * 
	 * @param trackerPanel an object of type {@link TrackerPanel}}
	 */
	public void setTrackerPanel(TrackerPanel trackerPanel) {
		this.trackerPanel = trackerPanel;
	}

	/** @return reporterPanel */
	public ReporterDetailedResultPanel getReporterPanel() {
		return reporterDetailedResultPanel;
	}

	/**
	 * Set the overviewPanel
	 * 
	 * @param overviewPanel an object of type {@link ReporterOverviewPanel}}
	 */
	public void setReporterOverviewPanel(ReporterOverviewPanel overviewPanel) {
		this.overviewPanel = overviewPanel;
	}

	/** @return overviewPanel */
	public ReporterOverviewPanel getReporterOverviewPanel() {
		return overviewPanel;
	}

	/**
	 * Set the reporterPanel
	 * 
	 * @param reporterDetailedResultPanel an object of type
	 *                                    {@link ReporterDetailedResultPanel}}
	 */
	public void setReporterPanel(ReporterDetailedResultPanel reporter) {
		this.reporterDetailedResultPanel = reporter;
	}

	/** @return guiController */
	public GuiController getGuiController() {
		return guiController;
	}

	/**
	 * Set the guiController
	 * 
	 * @param guiController an object of type {@link GuiController}}
	 */
	public void setGuiController(GuiController guiController) {
		this.guiController = guiController;
	}

	/** @return planningToolWindow */
	public PlanningToolWindow getPlanningToolWindow() {
		return planningToolWindow;
	}

	/**
	 * Set the planningToolWindow
	 * 
	 * @param planningToolWindow an object of type {@link PlanningToolWindow}}
	 */
	public void setPlanningToolWindow(PlanningToolWindow planningToolWindow) {
		this.planningToolWindow = planningToolWindow;
	}

	/** @return content pane in planningToolWindow */
	public Container getMainContentPane() {
		return getPlanningToolWindow().getContentPane();
	}

	/**
	 * Set the reporter
	 * 
	 * @param reporter an object of type {@link Reporter}}
	 */
	public void setReporter(Reporter reporter) {
		this.reporter = reporter;
	}

	/** @return reporter */
	public Reporter getReporter() {
		return reporter;
	}

	public Parameters getParameters() {
		return parameters;
	}

	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(Parameters parameters) {
		this.parameters = parameters;
	}
}
