package fortiss.gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

import fortiss.biminterface.BimSession;
import fortiss.biminterface.UserCredential;
import fortiss.gui.commands.CloseBIMSession;
import fortiss.gui.commands.LoadFromServerCommand;
import fortiss.gui.listeners.action.ButtonListener;
import fortiss.gui.style.Colors;
import fortiss.gui.style.FontSize;
import fortiss.gui.style.Fonts;
import net.miginfocom.swing.MigLayout;

/**
 * This panel shows the user information and options once a session has been
 * open
 */
public class RemoteConnectionPanel2 extends InformationPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblTitle;
	private JLabel lblConnectionNotification;
	private JButton btnOption;
	private JButton btnLoadFromServer;

	public RemoteConnectionPanel2() {
		initialize();
	}

	private void initialize() {
		setBorder(new TitledBorder(null, "Remote connection - BIM", TitledBorder.RIGHT, TitledBorder.TOP, null,
				Colors.accent2));
		setLayout(new MigLayout("insets 30 20 20 20, fillx, wrap 1, hidemode 2, width 99%",
				"", ""));

		lblTitle = new JLabel("REMOTE CONNECTION TO BIM");
		lblTitle.setFont(Fonts.getOswald());
		add(lblTitle, "center, gapbottom 30");

		lblConnectionNotification = new JLabel("Connection not updated");
		lblConnectionNotification.setFont(Fonts.getOpenSans(FontSize.SMALL));
		add(lblConnectionNotification, "left, gaptop 10");

		btnLoadFromServer = new JButton("Load topology from server");
		btnLoadFromServer.addMouseListener(new ButtonListener(new LoadFromServerCommand()));
		add(btnLoadFromServer, "center, gaptop 10");
		
		btnOption = new JButton("Close connection");
		btnOption.addMouseListener(new ButtonListener(new CloseBIMSession()));
		add(btnOption, "center, gaptop 10");
	}

	@Override
	public void update() {
		UserCredential userCredential = BimSession.getInstance().getUserCredential();
		lblConnectionNotification.setText("Connection stablish for: " + userCredential.getUserName());
	}

}
