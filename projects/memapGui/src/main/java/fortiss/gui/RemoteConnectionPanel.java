package fortiss.gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import fortiss.biminterface.BimSession;
import fortiss.biminterface.UserCredential;
import fortiss.biminterface.listeners.PasswordListener;
import fortiss.biminterface.listeners.UserNameListener;
import fortiss.gui.commands.LoadFromServerCommand;
import fortiss.gui.commands.OpenBIMSession;
import fortiss.gui.listeners.action.ButtonListener;
import fortiss.gui.listeners.textfield.TextFieldListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import net.miginfocom.swing.MigLayout;

/**
 * This panel shows fields to input a user name and password for the BIM server
 */
public class RemoteConnectionPanel extends InformationPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblTitle;
	private JLabel lblUserName;
	private JLabel lblPassword;
	private JTextField txtUserName;
	private JPasswordField txtPassword;
	private JButton btnOption;
	private JButton btnLoadFromServer;

	public RemoteConnectionPanel() {
		initialize();
	}

	private void initialize() {
		setBorder(new TitledBorder(null, "Remote connection - BIM", TitledBorder.RIGHT, TitledBorder.TOP, null,
				Colors.accent2));
		setLayout(new MigLayout("insets 30 20 20 20, fillx, wrap 2, hidemode 2, width 99%",
				"[left, growprio 50]30[right]", ""));

		lblTitle = new JLabel("REMOTE CONNECTION TO BIM");
		lblTitle.setFont(Fonts.getOswald());
		add(lblTitle, "spanx, center, gapbottom 30");

		lblUserName = new JLabel("User name");
		add(lblUserName);

		txtUserName = new JTextField();
		TextFieldListener userNameListener = new UserNameListener();
		txtUserName.addKeyListener(userNameListener);
		txtUserName.addFocusListener(userNameListener);
		txtUserName.setColumns(10);
		add(txtUserName, "growx");

		lblPassword = new JLabel("Password");
		add(lblPassword);

		txtPassword = new JPasswordField();
		TextFieldListener passwordListener = new PasswordListener();
		txtPassword.addKeyListener(passwordListener);
		txtPassword.addFocusListener(passwordListener);
		txtPassword.setColumns(10);
		add(txtPassword, "growx");
		
		btnOption = new JButton("Connect");
		btnOption.addMouseListener(new ButtonListener(new OpenBIMSession()));
		add(btnOption, "center, span, gaptop 10");
		
		btnLoadFromServer = new JButton("Load topology from server");
		btnLoadFromServer.addMouseListener(new ButtonListener(new LoadFromServerCommand()));
		add(btnLoadFromServer, "center, span, gaptop 10");
		btnLoadFromServer.setVisible(false);
		
		JLabel description = new JLabel("<html>Note, the BIM feature requires an account for the BIMplus system of allplan.<br>"
				+ "This feature has been added to show the possibility of integration in MEMAP.<br>"
				+ "You can contact the developers for further information.</html>");
		add(description, "newline, spanx 2, gaptop 30");

	}

	@Override
	public void update() {
		UserCredential userCredential = BimSession.getInstance().getUserCredential();
		txtUserName.setText(userCredential.getUserName());
		txtPassword.setText(userCredential.getPassword());
	}

}
