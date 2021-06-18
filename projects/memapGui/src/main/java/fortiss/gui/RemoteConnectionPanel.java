package fortiss.gui;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import fortiss.biminterface.UserCredential;
import fortiss.biminterface.listeners.PasswordListener;
import fortiss.biminterface.listeners.UserNameListener;
import fortiss.gui.listeners.textfield.TextFieldListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.Fonts;
import net.miginfocom.swing.MigLayout;

public class RemoteConnectionPanel extends InformationPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblTitle;
	private JLabel lblUserName;
	private JLabel lblPassword;
	private JTextField txtUserName;
	private JPasswordField txtPassword;
	private UserCredential userCredential= new UserCredential();

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
		lblUserName.setFont(Fonts.getOswald());
		add(lblUserName);

		txtUserName = new JTextField();
		TextFieldListener userNameListener = new UserNameListener();
		txtUserName.addKeyListener(userNameListener);
		txtUserName.addFocusListener(userNameListener);
		txtUserName.setColumns(10);
		add(txtUserName, "growx");

		lblPassword = new JLabel("Password");
		lblPassword.setFont(Fonts.getOswald());
		add(lblPassword);

		txtPassword = new JPasswordField();
		TextFieldListener passwordListener = new PasswordListener();
		txtPassword.addKeyListener(passwordListener);
		txtPassword.addFocusListener(passwordListener);
		txtPassword.setColumns(10);
		add(txtPassword, "growx");
		
	}

	@Override
	public void update() {

	}

}
