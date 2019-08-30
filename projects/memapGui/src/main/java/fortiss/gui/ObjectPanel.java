package fortiss.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragSource;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import fortiss.gui.listeners.label.DragListener;
import fortiss.gui.listeners.label.DropListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.media.Icon;;

/**
 * Contains objects that can added to a topology.
 */
public class ObjectPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblInstructions = new JLabel();
	private JLabel lbInstructions2 = new JLabel();
	public JLabel lb_new_ems = new JLabel("EMS");
	public ComponentBox comp_box = new ComponentBox();
	private final JPanel panel = new JPanel();

	/** Necessary for dark mode on/off implementation */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		setForeground(Colors.normal);
		setBackground(Colors.background);
		panel.setForeground(Colors.normal);
		panel.setBackground(Colors.background);
		lblInstructions.setForeground(Colors.title);
		lbInstructions2.setForeground(Colors.defaultCol);
		repaint();
	}

	public ObjectPanel() {

		setSize(new Dimension(150, 655));
		setPreferredSize(new Dimension(150, 655));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));

		panel.setPreferredSize(new Dimension(150, 250));
		panel.setLayout(new FormLayout(
				new ColumnSpec[] { ColumnSpec.decode("5dlu"), ColumnSpec.decode("132px:grow"),
						ColumnSpec.decode("5dlu"), },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("max(20dlu;default)"),
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20dlu"), FormSpecs.UNRELATED_GAP_ROWSPEC,
						RowSpec.decode("80px"), RowSpec.decode("max(4dlu;default)"), }));

		panel.setFont(Fonts.getOpenSans());
		add(panel);

		lblInstructions.setText("<html><center> Energy Management <br/> System (EMS) </center></html>");
		lblInstructions.setFont(Fonts.getOswald());
		panel.add(lblInstructions, "2, 2, center, default");

		lbInstructions2.setText("<html><center> Drag the icon to add <br/> a new EMS </center></html>");
		lbInstructions2.setFont(Fonts.getOpenSans());
		panel.add(lbInstructions2, "2, 4, center, center");

		// Add "Add New EMS" icon
		lb_new_ems.setVerticalTextPosition(JLabel.BOTTOM);
		lb_new_ems.setHorizontalTextPosition(JLabel.CENTER);
		lb_new_ems.setIcon(Icon.uBuilding);
		lb_new_ems.setToolTipText("Drag to create a new EMS");
		panel.add(lb_new_ems, "2, 6, center, center");

		add(comp_box);
		comp_box.setVisible(false);

		// Enable dragging label
		DragSource ds = new DragSource();
		ds.createDefaultDragGestureRecognizer(lb_new_ems, DnDConstants.ACTION_COPY, new DragListener());
		new DropListener(Designer.pl_ems);
	}

	public void showComponentBox() {
		comp_box.setVisible(true);
	}

	public void hideComponentBox() {
		comp_box.setVisible(false);
	}
}