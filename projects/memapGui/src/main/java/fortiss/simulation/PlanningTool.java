package fortiss.simulation;

import java.awt.Container;
import java.awt.EventQueue;

import fortiss.gui.DesignerPanel;
import fortiss.gui.PlanningToolWindow;
import fortiss.gui.TrackerPanel;
import fortiss.media.Icon;
import fortiss.results.Reporter;
import fortiss.results.ReporterOverviewPanel;
import fortiss.results.ReporterPanel;
import fortiss.simulation.listeners.helper.ProgressManager;
import memap.controller.GuiController;

/** Entry point for the application */
public class PlanningTool {

	// String constants: They are duplicated in other classes
	private static final String DESIGNER_PANEL = "Design tool";
	private static final String TRACKER_PANEL = "Simulation progress";
	private static final String OVERVIEW_RESULT_PANEL = "Results overview";
	private static final String DETAILED_RESULT_PANEL = "Detailed results";

	/** Main frame */
	private static PlanningToolWindow planningToolWindow;
	/** Designer panel */
	private static DesignerPanel designerPanel;
	/** Progress panel */
	private static TrackerPanel trackerPanel;
	/** Reporter */
	private static Reporter reporter;
	/** Reporter panel */
	private static ReporterPanel reporterPanel;
	/** Reporter overview panel */
	private static ReporterOverviewPanel overviewPanel;
	/** GUI controller */
	private static GuiController guiController;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				setPlanningToolWindow(new PlanningToolWindow());
				ProgressManager.getInstance().execute();
			}
		});
	}

	/**
	 * Initialize the application panels (and manager classes) and add them to the
	 * main frame's content pane.
	 */
	public static void init() {
		setReporter(new Reporter());
		setDesignerPanel(new DesignerPanel());
		setReporterOverviewPanel(new ReporterOverviewPanel());
		setReporterPanel(new ReporterPanel());
		setTrackerPanel(new TrackerPanel());
	}

	/** Add the designer panel as a tab */
	public static void addDesignerAsTab() {
		getPlanningToolWindow().addPanelAsTab(DESIGNER_PANEL, Icon.edit, getDesignerPanel());
	}

	/** Add the results overview panel as a tab */
	public static void addOverviewResutlsAsTab() {
		getPlanningToolWindow().addPanelAsTab(OVERVIEW_RESULT_PANEL, Icon.statistics, getReporterOverviewPanel());
	}

	/** Add the detailed results panel as a tab */
	public static void addDetailedResultsAsTab() {
		getPlanningToolWindow().addPanelAsTab(DETAILED_RESULT_PANEL, Icon.series, getReporterPanel());
	}

	/** Add the tracker panel as a tab */
	public static void addTrackerAsTab() {
		getPlanningToolWindow().addPanelAsTab(TRACKER_PANEL, Icon.exclamation, getTrackerPanel());
	}

	/** Show the designer panel using the information from last session */
	public static void showDesigner() {
		getDesignerPanel().initLastSession();
		addDesignerAsTab();
	}

	/** Show the tracker panel */
	public static void showTracker() {
		addTrackerAsTab();
		getPlanningToolWindow().showTab(getTrackerPanel());
		repaintAll();
	}

	/** Loads the results and show the reporter panel */
	public static void showReporter() {
		getReporter().showResults();

		getPlanningToolWindow().closeTab(getTrackerPanel());
		addOverviewResutlsAsTab();
		addDetailedResultsAsTab();
		getPlanningToolWindow().showTab(getReporterOverviewPanel());
		repaintAll();
	}

	/** Revalidates and repaints the main frame's content pane */
	public static void repaintAll() {
		getPlanningToolWindow().getContentPane().revalidate();
		getPlanningToolWindow().getContentPane().repaint();
	}

	/** @return designerPanel */
	public static DesignerPanel getDesignerPanel() {
		return designerPanel;
	}

	/**
	 * Set the designerPanel
	 * 
	 * @param designer an object of type {@link DesignerPanel}}
	 */
	public static void setDesignerPanel(DesignerPanel designerPanel) {
		PlanningTool.designerPanel = designerPanel;
	}

	/** @return trackerPanel */
	public static TrackerPanel getTrackerPanel() {
		return trackerPanel;
	}

	/**
	 * Set the trackerPanel
	 * 
	 * @param trackerPanel an object of type {@link TrackerPanel}}
	 */
	public static void setTrackerPanel(TrackerPanel trackerPanel) {
		PlanningTool.trackerPanel = trackerPanel;
	}

	/** @return reporterPanel */
	public static ReporterPanel getReporterPanel() {
		return reporterPanel;
	}

	/**
	 * Set the overviewPanel
	 * 
	 * @param overviewPanel an object of type {@link ReporterOverviewPanel}}
	 */
	public static void setReporterOverviewPanel(ReporterOverviewPanel overviewPanel) {
		PlanningTool.overviewPanel = overviewPanel;
	}

	/** @return overviewPanel */
	public static ReporterOverviewPanel getReporterOverviewPanel() {
		return overviewPanel;
	}

	/**
	 * Set the reporterPanel
	 * 
	 * @param reporterPanel an object of type {@link ReporterPanel}}
	 */
	public static void setReporterPanel(ReporterPanel reporter) {
		PlanningTool.reporterPanel = reporter;
	}

	/** @return guiController */
	public static GuiController getGuiController() {
		return guiController;
	}

	/**
	 * Set the guiController
	 * 
	 * @param guiController an object of type {@link GuiController}}
	 */
	public static void setGuiController(GuiController guiController) {
		PlanningTool.guiController = guiController;
	}

	/** @return planningToolWindow */
	public static PlanningToolWindow getPlanningToolWindow() {
		return planningToolWindow;
	}

	/**
	 * Set the planningToolWindow
	 * 
	 * @param planningToolWindow an object of type {@link PlanningToolWindow}}
	 */
	public static void setPlanningToolWindow(PlanningToolWindow planningToolWindow) {
		PlanningTool.planningToolWindow = planningToolWindow;
	}

	/** @return content pane in planningToolWindow */
	public static Container getMainContentPane() {
		return getPlanningToolWindow().getContentPane();
	}

	/**
	 * Set the reporter
	 * 
	 * @param reporter an object of type {@link Reporter}}
	 */
	public static void setReporter(Reporter reporter) {
		PlanningTool.reporter = reporter;
	}

	/** @return reporter */
	public static Reporter getReporter() {
		return reporter;
	}
}
