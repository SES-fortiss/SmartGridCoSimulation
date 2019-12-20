package fortiss.media;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * Stores Icons
 */
abstract public class Icon {

	private static String fortissLogoPath = "/resources/fortissLogo.png";
	private static String memapLogoPath = "/resources/memap.png";
	private static String openPath = "/resources/open.png";
	private static String resetPath = "/resources/reset.png";
	private static String saveAsPath = "/resources/saveAs.png";
	private static String runPath = "/resources/run.png";
	private static String onDarkModePath = "/resources/onDarkMode.png";
	private static String offDarkModePath = "/resources/offDarkMode.png";
	private static String uBuildingPath = "/resources/unselectedBuilding.png";
	private static String uDemandPath = "/resources/unselectedDemand.png";
	private static String uStoragePath = "/resources/unselectedStorage.png";
	private static String uVolatilePath = "/resources/unselectedVolatile.png";
	private static String uControllablePath = "/resources/unselectedControllable.png";
	private static String uCouplerPath = "/resources/unselectedCoupler.png";
	private static String sBuildingPath = "/resources/selectedBuilding.png";
	private static String sDemandPath = "/resources/selectedDemand.png";
	private static String sStoragePath = "/resources/selectedStorage.png";
	private static String sVolatilePath = "/resources/selectedVolatile.png";
	private static String sControllablePath = "/resources/selectedControllable.png";
	private static String sCouplerPath = "/resources/selectedCoupler.png";
	private static String onMemapPath = "/resources/onMemap.png";
	private static String offMemapPath = "/resources/offMemap.png";
	private static String optCostPath = "/resources/optCost.png";
	private static String optCO2Path = "/resources/optCO2.png";
	private static String lpPath = "/resources/lp.png";
	private static String milpPath = "/resources/milp.png";
	private static String allLogsPath = "/resources/allLogs.png";
	private static String fileLogsPath = "/resources/fileLogs.png";
	private static String resultLogsPath = "/resources/resultLogs.png";
	private static String variableMarketPath = "/resources/variableMarket.png";
	private static String fixedMarketPath = "/resources/fixedMarket.png";
	private static String visualizePath = "/resources/visualize.png";
	private static String vsvFormatPath = "/resources/csvFormat.png";

	public static ImageIcon fortissLogo = new ImageIcon(new ImageIcon(Icon.class.getResource(fortissLogoPath))
			.getImage().getScaledInstance(180, 60, Image.SCALE_SMOOTH));
	public static ImageIcon memapLogo = new ImageIcon(new ImageIcon(Icon.class.getResource(memapLogoPath)).getImage()
			.getScaledInstance(250, 250, Image.SCALE_SMOOTH));
	public static ImageIcon smallMemapLogo = new ImageIcon(new ImageIcon(Icon.class.getResource(memapLogoPath))
			.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));

	public static ImageIcon open = new ImageIcon(
			new ImageIcon(Icon.class.getResource(openPath)).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon reset = new ImageIcon(
			new ImageIcon(Icon.class.getResource(resetPath)).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon saveAs = new ImageIcon(
			new ImageIcon(Icon.class.getResource(saveAsPath)).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon run = new ImageIcon(
			new ImageIcon(Icon.class.getResource(runPath)).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon onDarkMode = new ImageIcon(new ImageIcon(Icon.class.getResource(onDarkModePath)).getImage()
			.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon offDarkMode = new ImageIcon(new ImageIcon(Icon.class.getResource(offDarkModePath))
			.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon visualize = new ImageIcon(new ImageIcon(Icon.class.getResource(visualizePath)).getImage()
			.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon csvFormat = new ImageIcon(new ImageIcon(Icon.class.getResource(vsvFormatPath)).getImage()
			.getScaledInstance(100, 100, Image.SCALE_SMOOTH));

	public static ImageIcon uDemandMenu = new ImageIcon(new ImageIcon(Icon.class.getResource(uDemandPath)).getImage()
			.getScaledInstance(25, 35, Image.SCALE_SMOOTH));
	public static ImageIcon uStorageMenu = new ImageIcon(new ImageIcon(Icon.class.getResource(uStoragePath)).getImage()
			.getScaledInstance(25, 35, Image.SCALE_SMOOTH));
	public static ImageIcon uVolatileMenu = new ImageIcon(new ImageIcon(Icon.class.getResource(uVolatilePath))
			.getImage().getScaledInstance(25, 35, Image.SCALE_SMOOTH));
	public static ImageIcon uControllableMenu = new ImageIcon(new ImageIcon(Icon.class.getResource(uControllablePath))
			.getImage().getScaledInstance(25, 35, Image.SCALE_SMOOTH));
	public static ImageIcon uCouplerMenu = new ImageIcon(new ImageIcon(Icon.class.getResource(uCouplerPath)).getImage()
			.getScaledInstance(25, 35, Image.SCALE_SMOOTH));

	public static ImageIcon uBuilding = new ImageIcon(new ImageIcon(Icon.class.getResource(uBuildingPath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uDemand = new ImageIcon(new ImageIcon(Icon.class.getResource(uDemandPath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uStorage = new ImageIcon(new ImageIcon(Icon.class.getResource(uStoragePath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uVolatile = new ImageIcon(new ImageIcon(Icon.class.getResource(uVolatilePath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uControllable = new ImageIcon(new ImageIcon(Icon.class.getResource(uControllablePath))
			.getImage().getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uCoupler = new ImageIcon(new ImageIcon(Icon.class.getResource(uCouplerPath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon sBuilding = new ImageIcon(new ImageIcon(Icon.class.getResource(sBuildingPath)).getImage()
			.getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sDemand = new ImageIcon(new ImageIcon(Icon.class.getResource(sDemandPath)).getImage()
			.getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sStorage = new ImageIcon(new ImageIcon(Icon.class.getResource(sStoragePath)).getImage()
			.getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sVolatile = new ImageIcon(new ImageIcon(Icon.class.getResource(sVolatilePath)).getImage()
			.getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sControllable = new ImageIcon(new ImageIcon(Icon.class.getResource(sControllablePath))
			.getImage().getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sCoupler = new ImageIcon(new ImageIcon(Icon.class.getResource(sCouplerPath)).getImage()
			.getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon onMemap = new ImageIcon(new ImageIcon(Icon.class.getResource(onMemapPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon offMemap = new ImageIcon(new ImageIcon(Icon.class.getResource(offMemapPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon optCost = new ImageIcon(new ImageIcon(Icon.class.getResource(optCostPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon optCO2 = new ImageIcon(
			new ImageIcon(Icon.class.getResource(optCO2Path)).getImage().getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon variableMarket = new ImageIcon(new ImageIcon(Icon.class.getResource(variableMarketPath))
			.getImage().getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon fixedMarket = new ImageIcon(new ImageIcon(Icon.class.getResource(fixedMarketPath))
			.getImage().getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon lp = new ImageIcon(
			new ImageIcon(Icon.class.getResource(lpPath)).getImage().getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon milp = new ImageIcon(
			new ImageIcon(Icon.class.getResource(milpPath)).getImage().getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon resultLogs = new ImageIcon(new ImageIcon(Icon.class.getResource(resultLogsPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon fileLogs = new ImageIcon(new ImageIcon(Icon.class.getResource(fileLogsPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon allLogs = new ImageIcon(new ImageIcon(Icon.class.getResource(allLogsPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));

	@SuppressWarnings("serial")
	public static ArrayList<ImageIcon> optCriteria = new ArrayList<ImageIcon>() {
		{
			add(optCost);
			add(optCO2);
		}
	};

	@SuppressWarnings("serial")
	public static ArrayList<ImageIcon> optimizer = new ArrayList<ImageIcon>() {
		{
			add(lp);
			add(milp);
		}
	};

	@SuppressWarnings("serial")
	public static ArrayList<ImageIcon> loggingMode = new ArrayList<ImageIcon>() {
		{
			add(resultLogs);
			add(fileLogs);
			add(allLogs);
		}
	};
}
