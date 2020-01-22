package fortiss.results;

import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.Designer;
import fortiss.gui.PlotPanel;
import fortiss.gui.listeners.window.ExitWindowListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.Icon;
import fortiss.results.listeners.label.MenuListener;

/**
 * Report panel: shows results list and plots
 */
@SuppressWarnings("serial")
public class Reporter extends JFrame {

	public static Reporter results;
	public static JPanel plPlot;
	public static PlotPanel plotPanel;
	public static Output output;
	private JPanel plSelection;
	private JLabel lbInstructions;
	private JLabel lbInstructions2;

	/**
	 * Repaints the content of the frame when it is resized.
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		plotPanel.paintSeries();
		plSelection.setBackground(Colors.background);
		plSelection.setForeground(Colors.normal);
		lbInstructions.setForeground(Colors.title);
		lbInstructions2.setForeground(Colors.normal);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	
					results = new Reporter();
					results.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public Reporter() {
		
		// Read results
		output = new Output();
		StyleGenerator.setupStyle();
		initialize();
		
		addWindowListener(new ExitWindowListener());
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
		setSize(new Dimension(1120, 810));
		setBackground(Colors.background);
		setLocationRelativeTo(null);
		setTitle("MEMAP - "+ Designer.parameterPanel.pars.getLastSavedFile() +" - Results");
		setIconImage(Icon.smallMemapLogo.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		// Adds panel for result selection
		plSelection = new JPanel();
		plSelection.setForeground(Colors.normal);
		plSelection.setBackground(Colors.background);
		plSelection.setMaximumSize(new Dimension(400, 32767));
		plSelection.setBorder(UIManager.getBorder("DesktopIcon.border"));
		plSelection.setPreferredSize(new Dimension(300, 810));
		getContentPane().add(plSelection);
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
		Menu treeResults = new Menu();
		treeResults.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		treeResults.setBorder(null);
		scrollPane.setViewportView(treeResults);
		treeResults.addTreeSelectionListener(new MenuListener());
		treeResults.setRowHeight(30);
		treeResults.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		// Adds panel for plots
		plotPanel = new PlotPanel();
		getContentPane().add(plotPanel);
	}
}
