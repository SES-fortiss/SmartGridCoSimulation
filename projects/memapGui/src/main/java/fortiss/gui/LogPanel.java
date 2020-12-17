package fortiss.gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;

import fortiss.gui.style.Colors;
import fortiss.results.widgets.TitleWidget;
import net.miginfocom.swing.MigLayout;

public class LogPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JTextPane logArea;
	
	public LogPanel() {
		setLayout(new MigLayout("insets 4 4 4 4, center, width 99%, gapy 4", "[center,90%]", ""));
		
		TitleWidget sectionTitle = new TitleWidget("Simulation Log");
		JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
		separator.setForeground(Colors.green);
		separator.setPreferredSize(new Dimension(400, 1));
		
		logArea = new JTextPane();
		logArea.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setViewportView(logArea);
		
		add(sectionTitle, "width 99%, align left, wrap");
		add(separator, "width 100%, wrap");
		add(scrollPane, "width 100%, height 90%, wrap");
		
		logArea.setText("");
	}

	public void publish(String message, SimpleAttributeSet attributeSet) {
		Document doc = logArea.getStyledDocument();
		try {
			doc.insertString(doc.getLength(), message, attributeSet);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
}
