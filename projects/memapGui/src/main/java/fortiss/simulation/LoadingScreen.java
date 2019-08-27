package fortiss.simulation;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.media.Icon;

/**
 * Shows progress of simulation and an animated image
 */
@SuppressWarnings("serial")
public class LoadingScreen extends JFrame {

	private JPanel contentPane;
	public JLabel lbMessage;
	public JProgressBar progressBar;

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		contentPane.setBackground(Colors.background);
		lbMessage.setForeground(Colors.title);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoadingScreen frame = new LoadingScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoadingScreen() {
		setIconImage(Icon.smallMemapLogo.getImage());
		setTitle("MEMAP - Interactive Simulator");
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(new Dimension(800, 440));
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Colors.background);
		contentPane.setFont(Fonts.getOpenSans());
		setContentPane(contentPane);
		
		ImageIcon loading_raw = new ImageIcon(LoadingScreen.class.getResource("/resources/loading.gif"));
		int w = (int) (loading_raw.getIconWidth() * 0.4);
		int h = (int) (loading_raw.getIconHeight() * 0.4);
		ImageIcon loading = new ImageIcon(loading_raw.getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
		contentPane.setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.LABEL_COMPONENT_GAP_COLSPEC, ColumnSpec.decode("641px:grow"),
						FormSpecs.LABEL_COMPONENT_GAP_COLSPEC, },
				new RowSpec[] { FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC, RowSpec.decode("311px"),
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, }));

		JLabel lbLoading = new JLabel();
		contentPane.add(lbLoading, "2, 2, left, center");
		lbLoading.setIcon(loading);

		lbMessage = new JLabel("message");
		contentPane.add(lbMessage, "2, 4, center, center");
		lbMessage.setForeground(Colors.title);
		lbMessage.setFont(Fonts.getOswald());

		// Add progress bar for simulation status
		progressBar = new JProgressBar(0, 100);
		contentPane.add(progressBar, "2, 6, center, center");
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
	}

}
