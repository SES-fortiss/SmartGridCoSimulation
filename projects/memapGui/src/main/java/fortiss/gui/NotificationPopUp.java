package fortiss.gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * Example: NotificationPopUp popup = new
 * NotificationPopUp(JOptionPane.INFORMATION_MESSAGE, "This is a message!",
 * IconStore.save, 1);
 */
public class NotificationPopUp extends JDialog {

	private static final long serialVersionUID = 1L;

	private final JOptionPane messagePane;
	private Timer timer;

	/**
	 * 
	 * @param messageType JOptionPane.<INFORMATION_MESSAGE, ERROR_MESSAGE,
	 *                    WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE>
	 * @param message     A String
	 * @param icon        A ImageIcon
	 * @param duration    An Integer [seconds] or null
	 */
	public NotificationPopUp(int messageType, String message, ImageIcon icon, Integer duration) {
		messagePane = new JOptionPane(message, messageType, JOptionPane.DEFAULT_OPTION, icon, new Object[] {}, null);

		setTitle("MEMAP Notification");
		setContentPane(messagePane);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);

		if (duration != null) {
			timer = new Timer(duration * 1000, new AbstractAction() {
				private static final long serialVersionUID = 1L;

				@Override
				public void actionPerformed(ActionEvent ae) {
					dispose();
				}
			});
			timer.setRepeats(false);

			timer.start();
		}
		setVisible(true);
	}

}
