package fortiss.media;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * Stores Icons
 */
abstract public class IconStore {

	private static String fortissLogoPath = "/resources/fortissLogo.png";
	private static String memapLogoPath = "/resources/memap.png";
	
	private static String costReductionPath = "/resources/costReduction.png";
	private static String emissionsReductionPath = "/resources/emissionsReduction.png";
	private static String loadingPath = "/resources/loading.gif";
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
	private static String seriesPath = "/resources/series.png";
	private static String statisticsPath = "/resources/statistics.png";
	private static String exclamationPath = "/resources/exclamation.png";
	private static String editPath = "/resources/edit.png";
	private static String closedNodePath = "/resources/closedNode.png";
	private static String openNodePath = "/resources/openNode.png";
	private static String itemNodePath = "/resources/itemNode.png";
	
	public static ImageIcon fortissLogo = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(fortissLogoPath)).getImage().getScaledInstance(180, 60, Image.SCALE_SMOOTH));
	
	public static ImageIcon memapLogo = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(memapLogoPath)).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
	
	public static ImageIcon smallMemapLogo = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(memapLogoPath)).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
	
	public static ImageIcon costReduction = new ImageIcon(new ImageIcon(IconStore.class.getResource(costReductionPath)).getImage()
			.getScaledInstance(150, 100, Image.SCALE_SMOOTH));
	public static ImageIcon emissionsReduction = new ImageIcon(new ImageIcon(IconStore.class.getResource(emissionsReductionPath)).getImage()
			.getScaledInstance(150, 100, Image.SCALE_SMOOTH));
	
	public static ImageIcon loading = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(loadingPath)).getImage().getScaledInstance(1150, 450, Image.SCALE_DEFAULT));
	
	public static ImageIcon open = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(openPath)).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon reset = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(resetPath)).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon saveAs = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(saveAsPath)).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon run = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(runPath)).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon onDarkMode = new ImageIcon(new ImageIcon(IconStore.class.getResource(onDarkModePath)).getImage()
			.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon offDarkMode = new ImageIcon(new ImageIcon(IconStore.class.getResource(offDarkModePath))
			.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon visualize = new ImageIcon(new ImageIcon(IconStore.class.getResource(visualizePath)).getImage()
			.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon csvFormat = new ImageIcon(new ImageIcon(IconStore.class.getResource(vsvFormatPath)).getImage()
			.getScaledInstance(100, 100, Image.SCALE_SMOOTH));

	public static ImageIcon uDemandMenu = new ImageIcon(new ImageIcon(IconStore.class.getResource(uDemandPath)).getImage()
			.getScaledInstance(25, 35, Image.SCALE_SMOOTH));
	public static ImageIcon uStorageMenu = new ImageIcon(new ImageIcon(IconStore.class.getResource(uStoragePath)).getImage()
			.getScaledInstance(25, 35, Image.SCALE_SMOOTH));
	public static ImageIcon uVolatileMenu = new ImageIcon(new ImageIcon(IconStore.class.getResource(uVolatilePath))
			.getImage().getScaledInstance(25, 35, Image.SCALE_SMOOTH));
	public static ImageIcon uControllableMenu = new ImageIcon(new ImageIcon(IconStore.class.getResource(uControllablePath))
			.getImage().getScaledInstance(25, 35, Image.SCALE_SMOOTH));
	public static ImageIcon uCouplerMenu = new ImageIcon(new ImageIcon(IconStore.class.getResource(uCouplerPath)).getImage()
			.getScaledInstance(25, 35, Image.SCALE_SMOOTH));

	public static ImageIcon uBuilding = new ImageIcon(new ImageIcon(IconStore.class.getResource(uBuildingPath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uDemand = new ImageIcon(new ImageIcon(IconStore.class.getResource(uDemandPath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uStorage = new ImageIcon(new ImageIcon(IconStore.class.getResource(uStoragePath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uVolatile = new ImageIcon(new ImageIcon(IconStore.class.getResource(uVolatilePath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uControllable = new ImageIcon(new ImageIcon(IconStore.class.getResource(uControllablePath))
			.getImage().getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uCoupler = new ImageIcon(new ImageIcon(IconStore.class.getResource(uCouplerPath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon sBuilding = new ImageIcon(new ImageIcon(IconStore.class.getResource(sBuildingPath)).getImage()
			.getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sDemand = new ImageIcon(new ImageIcon(IconStore.class.getResource(sDemandPath)).getImage()
			.getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sStorage = new ImageIcon(new ImageIcon(IconStore.class.getResource(sStoragePath)).getImage()
			.getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sVolatile = new ImageIcon(new ImageIcon(IconStore.class.getResource(sVolatilePath)).getImage()
			.getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sControllable = new ImageIcon(new ImageIcon(IconStore.class.getResource(sControllablePath))
			.getImage().getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sCoupler = new ImageIcon(new ImageIcon(IconStore.class.getResource(sCouplerPath)).getImage()
			.getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon onMemap = new ImageIcon(new ImageIcon(IconStore.class.getResource(onMemapPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon offMemap = new ImageIcon(new ImageIcon(IconStore.class.getResource(offMemapPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon optCost = new ImageIcon(new ImageIcon(IconStore.class.getResource(optCostPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon optCO2 = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(optCO2Path)).getImage().getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon variableMarket = new ImageIcon(new ImageIcon(IconStore.class.getResource(variableMarketPath))
			.getImage().getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon fixedMarket = new ImageIcon(new ImageIcon(IconStore.class.getResource(fixedMarketPath))
			.getImage().getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon lp = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(lpPath)).getImage().getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon milp = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(milpPath)).getImage().getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon resultLogs = new ImageIcon(new ImageIcon(IconStore.class.getResource(resultLogsPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon fileLogs = new ImageIcon(new ImageIcon(IconStore.class.getResource(fileLogsPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon allLogs = new ImageIcon(new ImageIcon(IconStore.class.getResource(allLogsPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));

	public static ImageIcon series = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(seriesPath)).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon statistics = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(statisticsPath)).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon exclamation = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(exclamationPath)).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon edit = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(editPath)).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	
	public static ImageIcon closedNode = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(closedNodePath)).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
	public static ImageIcon openNode = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(openNodePath)).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
	public static ImageIcon itemNode = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(itemNodePath)).getImage().getScaledInstance(5, 5, Image.SCALE_SMOOTH));
	
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
