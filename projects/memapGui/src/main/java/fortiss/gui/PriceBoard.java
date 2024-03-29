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
import fortiss.gui.listeners.helper.OptionObserver;
import fortiss.gui.listeners.helper.Price;
import fortiss.gui.listeners.label.PriceTypeListener;
import fortiss.gui.listeners.textfield.PriceFileListener;
import fortiss.gui.listeners.textfield.PriceListener;
import fortiss.gui.listeners.textfield.TextFieldListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import fortiss.gui.style.StyleGenerator;
import fortiss.media.IconStore;
import memap.helper.DataInterface;
import net.miginfocom.swing.MigLayout;

public class PriceBoard extends JPanel implements OptionObserver {

	private static final long serialVersionUID = 1L;
	
	private Price price;
	protected JTextField txtPriceFile;
	protected JTextField txtPrice;
	protected JLabel lbPrice;
	protected JLabel lbPriceFileInstruction;
	
	protected OptionLabel lbPriceType2;
	
	protected JLabel btDataPlot;
	protected JLabel btDataBrowse;
	protected JLabel btReload;

	
	protected PlotPanel plotPanel;
	
	public PriceBoard(String title) {
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
		
		lbPrice = new JLabel("Price");
		add(lbPrice, "hidemode 3");
		
		txtPrice = new JTextField("");
		txtPrice.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtPrice.setText("");
		TextFieldListener priceListener = new PriceListener();
		txtPrice.addKeyListener(priceListener);
		txtPrice.addFocusListener(priceListener);
		txtPrice.setColumns(10);
		add(txtPrice, "hidemode 3");
		
		lbPriceFileInstruction = new JLabel("Select a file");
		add(lbPriceFileInstruction, "hidemode 3");

		txtPriceFile = new JTextField("");
		TextFieldListener priceFileListener = new PriceFileListener();
		txtPriceFile.addKeyListener(priceFileListener);
		txtPriceFile.addFocusListener(priceFileListener);
		txtPriceFile.setColumns(30);
		add(txtPriceFile, "hidemode 3");
		
		btDataBrowse = new JLabel("");
		btDataBrowse.addMouseListener(new PBrowseListener());
		btDataBrowse.addMouseListener(new HoverMouseListener());
		btDataBrowse.setIcon(IconStore.open);
		btDataBrowse.setBorder(new EmptyBorder(3, 3, 0, 3));
		add(btDataBrowse, "hidemode 3, wmax 40");
		
		btDataPlot = new JLabel("");
		btDataPlot.setIcon(IconStore.visualize);
		btDataPlot.setBorder(new EmptyBorder(3, 3, 0, 3));
		btDataPlot.addMouseListener(new PPlotListener());
		btDataPlot.addMouseListener(new HoverMouseListener());
		add(btDataPlot, "hidemode 3, wmax 40");
		
		btReload = new JLabel("");
		btReload.setIcon(IconStore.reset);
		btReload.setToolTipText("Reload file");
		btReload.setBorder(new EmptyBorder(3, 3, 0, 3));
		btReload.addMouseListener(new HoverMouseListener());
		btReload.addMouseListener(new PReloadListener());
		add(btReload, "hidemode 3, wmax 40");

		plotPanel = new PlotPanel();
		add(plotPanel, "newline, spanx 5, growx, hmax 300, hidemode 3");
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
		lbPrice.setText(price.getLabels()[0]);
		update();
	}
	
	/** Triggered when l*/
	public void changePriceOptionsVisibility(boolean fixed) {

		if (fixed) {
			lbPrice.setVisible(true);
			txtPrice.setVisible(true);

			txtPriceFile.setVisible(false);
			btDataBrowse.setVisible(false);
			lbPriceFileInstruction.setVisible(false);
		} else {
			lbPrice.setVisible(false);
			txtPrice.setVisible(false);

			txtPriceFile.setVisible(true);
			btDataBrowse.setVisible(true);
			lbPriceFileInstruction.setVisible(true);
		}
		resetPlotPanel();
	}
	
	public void plot() {
		DataInterface data = getPrice().getPrices();
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
		if (getPrice().isFixed()) {
			lbPriceType2.setOption("Fixed");
			txtPrice.setText(getPrice().getPriceString());
		} else {
			lbPriceType2.setOption("Variable");
			txtPriceFile.setText(getPrice().getPriceString());
		}
		changePriceOptionsVisibility(getPrice().isFixed());
	}

	/** This class is subscribe to OptionLabel changes **/
	@Override
	public void update(Option option) {
		boolean fixed = option.getName().contentEquals("Fixed");
		getPrice().setFixed(fixed);
		update();
	}

}
