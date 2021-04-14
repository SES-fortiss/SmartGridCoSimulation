package fortiss.results.widgets;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fortiss.gui.listeners.helper.Price;
import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import fortiss.media.IconStore;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;
import memap.helper.DirectoryConfiguration;
import net.miginfocom.swing.MigLayout;

public class ParameterWidget extends JPanel {

	private static final long serialVersionUID = 1L;

	public ParameterWidget() {
		setPreferredSize(new Dimension(1000, 500));
		setBorder(BorderFactory.createLineBorder(Colors.green));
		setBackground(Color.white);
		setLayout( new MigLayout("insets 30 30 30 30, fillx, gap 5px 10px, wrap 3, width 99%", "[left]10[left][right]", ""));

		String location = System.getProperty("user.dir") + File.separator + DirectoryConfiguration.mainDir
				+ File.separator + "topology.jpg";

		ImageIcon topology;
		try {
			topology = new ImageIcon(ImageIO.read(new File(location)));
			topology = new ImageIcon(topology.getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH));
		} catch (IOException e) {
			topology = IconStore.memapLogo;
		}

		Parameters pars = PlanningTool.getInstance().getParameters();

		JLabel lblImage = new JLabel(topology);
		add(lblImage, "span y");

		JLabel lblParameter1 = new JLabel("Simulated period:");
		lblParameter1.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblParameter1.setForeground(Colors.green);
		add(lblParameter1);

		String period = (pars.getDays() == 1) ? " day" : " days";
		JLabel lblValue1 = new JLabel(pars.getDays() + period);
		lblValue1.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblValue1.setForeground(Colors.darkGray);
		add(lblValue1);

		JLabel lblParameter2 = new JLabel("Time steps:");
		lblParameter2.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblParameter2.setForeground(Colors.green);
		add(lblParameter2);

		JLabel lblValue2 = new JLabel(pars.getStepsPerDay() + " steps");
		lblValue2.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblValue2.setForeground(Colors.darkGray);
		add(lblValue2);

		JLabel lblParameter3 = new JLabel("MPC horizon:");
		lblParameter3.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblParameter3.setForeground(Colors.green);
		add(lblParameter3);

		JLabel lblValue3 = new JLabel(pars.getMPCHorizon() + " look ahead steps");
		lblValue3.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblValue3.setForeground(Colors.darkGray);
		add(lblValue3);

		JLabel lblParameter6 = new JLabel("Optimization criteria:");
		lblParameter6.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblParameter6.setForeground(Colors.green);
		add(lblParameter6);

		JLabel lblValue6 = new JLabel(pars.getOptCriteria().toUpperCase());
		lblValue6.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblValue6.setForeground(Colors.darkGray);
		add(lblValue6);

		JLabel lblParameter7 = new JLabel("Optimizer:");
		lblParameter7.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblParameter7.setForeground(Colors.green);
		add(lblParameter7);

		JLabel lblValue7 = new JLabel(pars.getOptimizer().toUpperCase());
		lblValue7.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblValue7.setForeground(Colors.darkGray);
		add(lblValue7);

		// Prices
		// Electricity Prices
		Price elecBuyingPrice = pars.getElecBuyingPrice();
		JLabel lblElecBuyingPrice = new JLabel("Electricity buying price:" + elecBuyingPrice.getUnits());
		lblElecBuyingPrice.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblElecBuyingPrice.setForeground(Colors.green);
		add(lblElecBuyingPrice);

		String elecBullingPriceString = elecBuyingPrice.isFixed() ? "Fixed: " : "Variable: ";
		elecBullingPriceString += elecBuyingPrice.getPriceString();
		JLabel lblElecBuyingPriceValue = new JLabel(elecBullingPriceString);
		lblElecBuyingPriceValue.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblElecBuyingPriceValue.setForeground(Colors.darkGray);
		add(lblElecBuyingPriceValue);

		Price elecSellingPrice = pars.getElecSellingPrice();
		JLabel lblElecSellingPrice = new JLabel("Electricity selling price:" + elecSellingPrice.getUnits());
		lblElecSellingPrice.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblElecSellingPrice.setForeground(Colors.green);
		add(lblElecSellingPrice);

		String elecSellingPriceString = elecSellingPrice.isFixed() ? "Fixed: " : "Variable: ";
		elecSellingPriceString += elecSellingPrice.getPriceString();
		JLabel lblElecSellingPriceValue = new JLabel(elecSellingPriceString);
		lblElecSellingPriceValue.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblElecSellingPriceValue.setForeground(Colors.darkGray);
		add(lblElecSellingPriceValue);

		// Electricity Prices
		Price heatBuyingPrice = pars.getHeatBuyingPrice();
		JLabel lblHeatBuyingPrice = new JLabel("Heat buying price:" + heatBuyingPrice.getUnits());
		lblHeatBuyingPrice.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblHeatBuyingPrice.setForeground(Colors.green);
		add(lblHeatBuyingPrice, "aligny top");

		String heatBuyingPriceString = heatBuyingPrice.isFixed() ? "Fixed: " : "Variable: ";
		heatBuyingPriceString += heatBuyingPrice.getPriceString();
		JLabel lblHeatBuyingPriceValue = new JLabel(heatBuyingPriceString);
		lblHeatBuyingPriceValue.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblHeatBuyingPriceValue.setForeground(Colors.darkGray);
		add(lblHeatBuyingPriceValue, "aligny top");

	}
}
