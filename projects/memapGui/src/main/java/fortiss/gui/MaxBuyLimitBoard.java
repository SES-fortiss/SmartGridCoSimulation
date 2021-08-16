package fortiss.gui;

import java.awt.ComponentOrientation;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import fortiss.gui.OptionLabel.Option;
import fortiss.gui.listeners.action.HoverMouseListener;
import fortiss.gui.listeners.button.PBrowseListener;
import fortiss.gui.listeners.button.PPlotListener;
import fortiss.gui.listeners.button.PReloadListener;
import fortiss.gui.listeners.helper.MaxBuyLimit;
import fortiss.gui.listeners.helper.OptionObserver;
import fortiss.gui.listeners.label.PriceTypeListener;
import fortiss.gui.listeners.textfield.PriceFileListener;
import fortiss.gui.listeners.textfield.TextFieldListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.IconStore;
import memap.helper.DataInterface;
import net.miginfocom.swing.MigLayout;

public class MaxBuyLimitBoard extends JPanel implements OptionObserver{
	
	private static final long serialVersionUID = 1L;

	protected OptionLabel lbPriceType2;
	
	protected JTextField txtLimitFile;
	protected JTextField txtLimit;
	
	protected JLabel lbLimit;
	protected JLabel lbLimitFileInstruction;
	
	protected JLabel buttonDataPlot;
	protected JLabel buttonDataBrowse;
	protected JLabel buttonReload;
	
	protected PlotPanel plotPanel;

	private MaxBuyLimit limit;
	
	public MaxBuyLimitBoard(String title) {		
		StyleGenerator.setupStyle();
		initialize(title);				
	}
	
	

	private void initialize(String title) {
		
		setBorder(new LineBorder(Colors.green));
		setLayout(new MigLayout("insets 0 0 0 0, fillx, wrap 5, hidemode 2, width 99%",
				"[left, growprio 70]30[right]10[right, grow 0]5[right, grow 0]", "[][][][][]"));

		JLabel lblTitle = new JLabel(title);
		lblTitle.setFont(Fonts.getOswald(FontSize.SMALL));
		add(lblTitle, "spanx 1");
		
		lbPriceType2 = new OptionLabel(new String[] { "Fixed", "Variable" },
				new ImageIcon[] { IconStore.fixedMarket, IconStore.variableMarket }, this);
		lbPriceType2.addMouseListener(new PriceTypeListener());
		add(lbPriceType2, "spanx 4");
		
		lbLimit = new JLabel("Max Limit to buy electricity");
		add(lbLimit, "hidemode 3");
		
		txtLimit = new JTextField("");
		txtLimit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtLimit.setText("");
		TextFieldListener limitListener = new LimitListener();
		txtLimit.addKeyListener(limitListener);
		txtLimit.addFocusListener(limitListener);
		txtLimit.setColumns(15);
		add(txtLimit, "spanx 4, hidemode 3");
		
		lbLimitFileInstruction = new JLabel("Additional Profile: Active=1 | Inactive=0");
		add(lbLimitFileInstruction, "newline, hidemode 3");

		txtLimitFile = new JTextField("");
		TextFieldListener priceFileListener = new PriceFileListener();
		txtLimitFile.addKeyListener(priceFileListener);
		txtLimitFile.addFocusListener(priceFileListener);
		txtLimitFile.setColumns(30);
		add(txtLimitFile, "hidemode 3");
		
		buttonDataBrowse = new JLabel("");
		buttonDataBrowse.addMouseListener(new PBrowseListener());
		buttonDataBrowse.addMouseListener(new HoverMouseListener());
		buttonDataBrowse.setIcon(IconStore.open);
		buttonDataBrowse.setBorder(new EmptyBorder(3, 3, 0, 3));
		add(buttonDataBrowse, "hidemode 3, wmax 40");
		
		buttonDataPlot = new JLabel("");
		buttonDataPlot.setIcon(IconStore.visualize);
		buttonDataPlot.setBorder(new EmptyBorder(3, 3, 0, 3));
		buttonDataPlot.addMouseListener(new PPlotListener());
		buttonDataPlot.addMouseListener(new HoverMouseListener());
		add(buttonDataPlot, "hidemode 3, wmax 40");
		
		buttonReload = new JLabel("");
		buttonReload.setIcon(IconStore.reset);
		buttonReload.setToolTipText("Reload file");
		buttonReload.setBorder(new EmptyBorder(3, 3, 0, 3));
		buttonReload.addMouseListener(new HoverMouseListener());
		buttonReload.addMouseListener(new PReloadListener());
		add(buttonReload, "hidemode 3, wmax 40");

		plotPanel = new PlotPanel();
		add(plotPanel, "newline, spanx 5, growx, hmax 300, hidemode 3");
	}

	public MaxBuyLimit getLimit() {
		return limit;
	}

	public void setLimit(MaxBuyLimit limit) {
		this.limit = limit;
		lbLimit.setText(limit.getLabels()[0]);
		update();
	}
	
	/** Triggered when l*/
	public void changeLimitOptionsVisibility(boolean fixed) {

		if (fixed) {
			lbLimitFileInstruction.setVisible(false);
			txtLimitFile.setVisible(false);
			
			buttonDataBrowse.setVisible(false);
			buttonDataPlot.setVisible(false);
			buttonReload.setVisible(false);
		} else {
			lbLimitFileInstruction.setVisible(true);
			txtLimitFile.setVisible(true);
			
			buttonDataBrowse.setVisible(true);
			buttonDataPlot.setVisible(true);
			buttonReload.setVisible(true);
		}
		resetPlotPanel();
	}
	
	public void plot() {
		DataInterface data = getLimit().getLimit();
		if (plotPanel.isPlotted()) {
			plotPanel.setVisible(false);
			plotPanel.setPlotted(false);
		} else {
			if (data != null) {
				for (String seriesName : data.getSeriesList()) {
					if (data.getXValues(seriesName).size() < 200) {
						ArrayList<String> onlyTimes = new ArrayList<>();
						data.getXValues(seriesName).forEach( s -> onlyTimes.add(s.split("T")[1]));	
						plotPanel.addSeries(seriesName, onlyTimes, data.getYValues(seriesName));
					} else {
						plotPanel.addSeries(seriesName, data.getXValues(seriesName), data.getYValues(seriesName));
					}
				}
			}
			plotPanel.setPlotted(true);
			plotPanel.setVisible(true);
		}
	}
	
	protected void resetPlotPanel() {
		plotPanel.setVisible(false);
		plotPanel.setPlotted(false);
		plotPanel.clearSeries();
	}
	
	public void update() {
		if (getLimit().isFixed()) {
			lbPriceType2.setOption("Fixed");
			txtLimit.setText(getLimit().getLimitString());
		} else {
			lbPriceType2.setOption("Variable");
			txtLimitFile.setText(getLimit().getLimitString());
		}
		changeLimitOptionsVisibility(getLimit().isFixed());
	}
	
	public void setMaxLimit(MaxBuyLimit maxBuyLimit) {		
		this.limit = maxBuyLimit;
		lbLimit.setText(getLimit().getLabels()[0]);
		update();
	}
	
	/** This class is subscribe to OptionLabel changes **/
	@Override
	public void update(Option option) {
		boolean fixed = option.getName().contentEquals("Fixed");
		getLimit().setFixed(fixed);
		update();
	}
	


}
