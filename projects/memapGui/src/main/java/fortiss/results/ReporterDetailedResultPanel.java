package fortiss.results;

import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.PlotPanel;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.results.listeners.label.MenuListener;

/**
 * Report panel: shows results list and plots for the detailed view.
 */
@SuppressWarnings("serial")
public class ReporterDetailedResultPanel extends JPanel {

	public static ReporterDetailedResultPanel results;
	public static JPanel plPlot;
	public PlotPanel plotPanel;
	private Menu treeResults;
	private JPanel plSelection;
	private JLabel lbInstructions;
	private JLabel lbInstructions2;

	/**
	 * Repaints the content of the frame when it is resized.
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		plSelection.setBackground(Colors.background);
		plSelection.setForeground(Colors.normal);
		lbInstructions.setForeground(Colors.title);
		lbInstructions2.setForeground(Colors.normal);
	}

	/**
	 * Creates the panel for detailed results - at least the left hand side
	 */
	public ReporterDetailedResultPanel() {
		StyleGenerator.setupStyle();
		initialize();
	}

	/**
	 * Initializes the contents of the frame.
	 */
	private void initialize() {
		
		// Sets panel properties
		setBackground(Colors.background);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		// Adds panel for result selection
		plSelection = new JPanel();
		plSelection.setForeground(Colors.normal);
		plSelection.setBackground(Colors.background);
		plSelection.setMaximumSize(new Dimension(400, 32767));
		plSelection.setBorder(UIManager.getBorder("DesktopIcon.border"));
		plSelection.setPreferredSize(new Dimension(300, 810));
		add(plSelection);
		plSelection.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("264px:grow"), },
				new RowSpec[] { FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("max(32dlu;default)"), RowSpec.decode("default:grow"), }));

		lbInstructions = new JLabel("SIMULATION RESULTS");
		lbInstructions.setFont(Fonts.getOswald());
		lbInstructions.setForeground(Colors.title);
		plSelection.add(lbInstructions, "1, 1, center, center");

		// Sets tree background color to none
		UIManager.put("Tree.rendererFillBackground", false);

		lbInstructions2 = new JLabel(
				"<html><center>Use Ctrl + click to select the<br/> data series to be plotted.</center></html>");
		plSelection.add(lbInstructions2, "1, 3, center, center");

		JScrollPane scrollPane = new JScrollPane();
		plSelection.add(scrollPane, "1, 4, fill, fill");

		// Adds tree for result list
		treeResults = new Menu();
		treeResults.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		treeResults.setBorder(null);
		scrollPane.setViewportView(treeResults);
		treeResults.addTreeSelectionListener(new MenuListener());
		treeResults.setRowHeight(30);
		treeResults.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		// Adds panel for plots
		plotPanel = new PlotPanel();
		add(plotPanel);
	}
	
	public void populateMenu(ResultsLibrary detailedResult) {
		treeResults.populateMenu(detailedResult);
	}
}
