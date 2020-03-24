package fortiss.simulation;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.EventQueue;

import fortiss.gui.DesignerPanel;
import fortiss.gui.PlanningToolWindow;
import fortiss.gui.TrackerPanel;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.Icon;
import fortiss.results.Reporter;
import fortiss.results.ReporterOverviewPanel;
import fortiss.results.ReporterPanel;
import fortiss.simulation.listeners.helper.ProgressManager;
import memap.controller.GuiController;

/** Entry point for the application */
public class PlanningTool {

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
				StyleGenerator.setupStyle();
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

		getPlanningToolWindow().addPanelAsCard("trackerPanel", getTrackerPanel());
	}

	/** Show the designer panel using the information from last session */
	public static void showDesigner() {
		getDesignerPanel().initLastSession();
		getPlanningToolWindow().addPanelAsTab("Design tool", Icon.edit, getDesignerPanel());
	}

	/** Show the tracker panel */
	public static void showTracker() {
		trackerPanel.restart();
		showScreen("trackerPanel");
	}

	/** Loads the results and show the reporter panel */
	public static void showReporter() {
		getReporter().showResults();

		showScreen("tabbedPane");
		getPlanningToolWindow().addPanelAsTab("Results overview", Icon.statistics, getReporterOverviewPanel());
		getPlanningToolWindow().addPanelAsTab("Detailed results", Icon.series, getReporterPanel());
	}

	/** Revalidates and repaints the main frame's content pane */
	public static void repaintAll() {
		getPlanningToolWindow().getContentPane().revalidate();
		getPlanningToolWindow().getContentPane().repaint();
	}

	/** Shows a panel that has been added as a card */
	private static void showScreen(String screenName) {
		CardLayout cl = (CardLayout) getPlanningToolWindow().getContentPane().getLayout();
		cl.show(getPlanningToolWindow().getContentPane(), screenName);
		repaintAll();
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
