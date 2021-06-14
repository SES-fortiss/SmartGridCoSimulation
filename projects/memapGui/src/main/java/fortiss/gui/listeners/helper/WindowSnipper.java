package fortiss.gui.listeners.helper;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import fortiss.gui.DesignerPanel;
import memap.helper.DirectoryConfiguration;

public class WindowSnipper {

	public WindowSnipper() {
	}

	public void createTopologySnip() {
		Dimension d = DesignerPanel.pl_ems.getSize();
		BufferedImage image = new BufferedImage(d.width, d.height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		DesignerPanel.pl_ems.print(g2d);
		g2d.dispose();
		try {
			String location = System.getProperty("user.dir") + File.separator + DirectoryConfiguration.mainDir
					+ File.separator + "topology.jpg";
			File file = new File(location);
			
			if (!file.exists()) {
				try {
					file.getParentFile().mkdirs();
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			ImageIO.write(image, "jpg", file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
