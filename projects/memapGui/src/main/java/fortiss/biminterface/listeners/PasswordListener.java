package fortiss.biminterface.listeners;

import fortiss.biminterface.BimSession;
import fortiss.biminterface.UserCredential;
import fortiss.gui.listeners.helper.PasswordVerifier;
import fortiss.gui.listeners.textfield.TextFieldListener;

public class PasswordListener extends TextFieldListener {

	public PasswordListener() {
		super("Invalid password", new PasswordVerifier());
	}

	@Override
	public String getAttribute() {
		UserCredential userCredential = BimSession.getInstance().getUserCredential();
		return userCredential.getPassword();
	}

	@Override
	public void update(String text) {
		UserCredential userCredential = BimSession.getInstance().getUserCredential();
		userCredential.setPassword(text);
	}

}
