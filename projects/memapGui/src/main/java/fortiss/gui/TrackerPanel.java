package fortiss.gui;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;

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
import fortiss.media.IconStore;
import javax.swing.SwingConstants;

/**
 * Shows progress of simulation and an animated image
 */
@SuppressWarnings("serial")
public class TrackerPanel extends JPanel {

	private JLabel lbMessage;
	private JProgressBar progressBar;

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		setBackground(Colors.background);
		lbMessage.setForeground(Colors.title);
	}

	/**
	 * Create the frame.
	 */
	public TrackerPanel() {
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setSize(new Dimension(1920, 1080));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setBackground(Colors.background);
		setFont(Fonts.getOpenSans());
		
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("50dlu"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:641px:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("50dlu"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,},
			new RowSpec[] {
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("50dlu"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("311px:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("50dlu"),}));

		JLabel lbLoading = new JLabel();
		lbLoading.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbLoading, "4, 4, fill, fill");
		lbLoading.setIcon(IconStore.loading);

		lbMessage = new JLabel("message");
		add(lbMessage, "4, 6, center, center");
		lbMessage.setForeground(Colors.title);
		lbMessage.setFont(Fonts.getOswald());

		// Add progress bar for simulation status
		progressBar = new JProgressBar(0, 100);
		add(progressBar, "4, 8, center, center");
		progressBar.setValue(0);
		progressBar.setStringPainted(true);

	}
	
	public void setMessage(String message) {
		lbMessage.setText(message);
	}
	
	public void setIndeterminate(boolean indeterminate) {
		progressBar.setIndeterminate(indeterminate);
	}

	public boolean isDone() {
		return progressBar.getValue() >= progressBar.getMaximum();
	}
	
	public void setProgress(int progress) {
		progressBar.setValue(progress);
	}
	
	public void restart() {
		progressBar.setValue(0);
	}

}
