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

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import fortiss.media.IconStore;
import fortiss.simulation.Parameters;
import fortiss.simulation.PlanningTool;
import memap.helper.DirectoryConfiguration;
import memap.media.Strings;

public class ParameterWidget extends JPanel {

	private static final long serialVersionUID = 1L;

	public ParameterWidget(){
		setPreferredSize(new Dimension(1000, 500));
		setBorder(BorderFactory.createLineBorder(Colors.green));
		setBackground(Color.white);
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(100dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(67dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.UNRELATED_GAP_ROWSPEC,}));
		
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
		add(lblImage, "2, 3, 1, 15");
		
		JLabel lblParameter1 = new JLabel("Simulated period:");
		lblParameter1.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblParameter1.setForeground(Colors.green);
		add(lblParameter1, "4, 5");
		
		String period = (pars.getDays() == 1) ? " day" : " days";
		JLabel lblValue1 = new JLabel(pars.getDays() + period);
		lblValue1.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblValue1.setForeground(Colors.darkGray);
		add(lblValue1, "6, 5");
		
		JLabel lblParameter2 = new JLabel("Time steps:");
		lblParameter2.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblParameter2.setForeground(Colors.green);
		add(lblParameter2, "4, 7");
		
		JLabel lblValue2 = new JLabel(pars.getStepsPerDay() + " steps");
		lblValue2.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblValue2.setForeground(Colors.darkGray);
		add(lblValue2, "6, 7");
		
		JLabel lblParameter3 = new JLabel("MPC horizon:");
		lblParameter3.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblParameter2.setForeground(Colors.green);
		add(lblParameter3, "4, 9");
		
		JLabel lblValue3 = new JLabel(pars.getMPCHorizon() + " look ahead steps");
		lblValue3.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblValue3.setForeground(Colors.darkGray);
		add(lblValue3, "6, 9");
		
		JLabel lblParameter4 = new JLabel("Market price:");
		lblParameter4.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblParameter2.setForeground(Colors.green);
		add(lblParameter4, "4, 11");
		
		String price;
		if(pars.isFixedPrice()) {
			price = "Fixed: " + pars.getFixedMarketPrice() + Strings.costsUnit;
		} else {
			price = "Variable: User defined";
		}
		
		JLabel lblValue4 = new JLabel(price);
		lblValue4.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblValue4.setForeground(Colors.darkGray);
		add(lblValue4, "6, 11");
		
		JLabel lblParameter5 = new JLabel("Optimization criteria:");
		lblParameter5.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblParameter2.setForeground(Colors.green);
		add(lblParameter5, "4, 13");
		
		JLabel lblValue5 = new JLabel(pars.getOptCriteria().toUpperCase());
		lblValue5.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblValue5.setForeground(Colors.darkGray);
		add(lblValue5, "6, 13");
		
		JLabel lblParameter6 = new JLabel("Optimizer:");
		lblParameter6.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblParameter2.setForeground(Colors.green);
		add(lblParameter6, "4, 15");
		
		JLabel lblValue6 = new JLabel(pars.getOptimizer().toUpperCase());
		lblValue6.setFont(Fonts.getOpenSans(FontSize.NORMAL));
		lblValue6.setForeground(Colors.darkGray);
		add(lblValue6, "6, 15");
		
	}
}
