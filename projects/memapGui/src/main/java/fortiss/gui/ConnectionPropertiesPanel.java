package fortiss.gui;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Popup;
import javax.swing.border.EtchedBorder;

import fortiss.components.Connection;
import fortiss.gui.listeners.textfield.ConnectionLengthListener;
import fortiss.gui.listeners.textfield.ConnectionLossesListener;
import fortiss.gui.listeners.textfield.ConnectionMaxCapacityListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import fortiss.simulation.helper.ConnectionManager;

public class ConnectionPropertiesPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField lengthTextField;
	private JTextField lossesTextField;
	private JTextField maxTransportCapacityTextField;
	private Popup popup;

	public ConnectionPropertiesPanel(Connection connection) {
		setLayout(new WrapLayout());
		setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));

		setPreferredSize(new Dimension(170, 100));
		setMaximumSize(new Dimension(300, 60));

		lengthTextField = new JTextField(String.valueOf(connection.getLength()));
		lengthTextField.setColumns(4);
		lengthTextField.setName(String.valueOf(connection.hashCode()));
		lengthTextField.addFocusListener(new ConnectionLengthListener());
		lengthTextField.addKeyListener(new ConnectionLengthListener());
		add(lengthTextField);
		
		JLabel lblLength = new JLabel("Thermal-Line [m]");
		add(lblLength);

		lossesTextField = new JTextField(String.valueOf(connection.getLosses()));
		lossesTextField.setColumns(4);
		lossesTextField.setName(String.valueOf(connection.hashCode()));
		lossesTextField.addFocusListener(new ConnectionLossesListener());
		lossesTextField.addKeyListener(new ConnectionLossesListener());
		add(lossesTextField);

		JLabel lblLosses = new JLabel("Losses [% /100m]");
		add(lblLosses);
		
		maxTransportCapacityTextField = new JTextField(String.valueOf(connection.getMaxTransportCapacity()));
		maxTransportCapacityTextField.setColumns(4);
		maxTransportCapacityTextField.setName(String.valueOf(connection.hashCode()));
		maxTransportCapacityTextField.addFocusListener(new ConnectionMaxCapacityListener());
		maxTransportCapacityTextField.addKeyListener(new ConnectionMaxCapacityListener());
		add(maxTransportCapacityTextField);
		
		JLabel lblMaxTransportCapacity = new JLabel("Max. Capacity [kW]");
		add(lblMaxTransportCapacity);

		JLabel lblEliminate = new JLabel("Eliminate [x]");
		lblEliminate.setForeground(Colors.accent1);
		lblEliminate.setFont(Fonts.getOswald(10));
		lblEliminate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ConnectionManager cm = ConnectionManager.getInstance();
				cm.removeConnection(connection);
				if (popup != null)
					popup.hide();
			}
		});
		add(lblEliminate);
	}

	/**
	 * Sets a reference to the pop-up window where the panel is drawn. Necessary to
	 * close it when a connection is eliminated
	 * 
	 * @param popup
	 */
	public void setPopup(Popup popup) {
		this.popup = popup;
	}
}
