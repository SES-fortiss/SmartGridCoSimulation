package fortiss.biminterface.listeners;

import javax.swing.JTextField;

import fortiss.biminterface.BimSession;
import fortiss.biminterface.UserCredential;
import fortiss.gui.listeners.helper.EmailVerifier;
import fortiss.gui.listeners.textfield.TextFieldListener;

public class UserNameListener extends TextFieldListener {

	protected JTextField source;

	public UserNameListener() {
		super("Invalid e-mail", new EmailVerifier());
	}

	@Override
	public String getAttribute() {
		UserCredential userCredential = BimSession.getInstance().getUserCredential();
		return userCredential.getUserName();
	}

	@Override
	public void update(String text) {
		UserCredential userCredential = BimSession.getInstance().getUserCredential();
		userCredential.setUserName(text);
	}

}