package fortiss.gui;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.JLabel;

/**
 * Confers the draggable property to a JLabel.
 */
public class DraggableLabel implements Transferable {

	private JLabel lb;
	private DataFlavor dataFlavor = DesignerPanel.dataFlavor;

	public DraggableLabel(JLabel lb) {
		this.lb = lb;
	}

	@Override
	public DataFlavor[] getTransferDataFlavors() {
		return new DataFlavor[] { dataFlavor };
	}

	@Override
	public boolean isDataFlavorSupported(DataFlavor flavor) {
		return flavor.equals(dataFlavor);
	}

	@Override
	public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {

		if (flavor.equals(dataFlavor))
			return lb;
		else
			throw new UnsupportedFlavorException(flavor);
	}
}
