package fortiss.results;

import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
 * Report panel: shows results list and plots
 */
@SuppressWarnings("serial")
public class ReporterPanel extends JPanel {

	public static ReporterPanel results;
	public static JPanel plPlot;
	public static PlotPanel plotPanel;
	public static Output output;
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
		if (plotPanel.isPlotted()) {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					plotPanel.paintSeries();
				}
			});
		}
		plSelection.setBackground(Colors.background);
		plSelection.setForeground(Colors.normal);
		lbInstructions.setForeground(Colors.title);
		lbInstructions2.setForeground(Colors.normal);
	}

	/**
	 * Create the application.
	 */
	public ReporterPanel() {
		output = new Output();
		StyleGenerator.setupStyle();
		initialize();
	}

	/**
	 * Initializes the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		// Sets frame properties
		setSize(new Dimension(1920, 1080));
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
		treeResults = new Menu(output);
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
	
	public void loadResults() {
		output.loadResults();
		treeResults.populateMenu(output);
	}
}
