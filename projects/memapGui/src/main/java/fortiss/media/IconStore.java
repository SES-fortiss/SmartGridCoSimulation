package fortiss.media;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * Stores Icons
 */
abstract public class IconStore {

	private static String fortissLogoPath = "/fortissLogo.png";
	private static String tumLogoPath = "/tumLogo.png";
	private static String memapLogoPath = "/memap.png";

	private static String costReductionPath = "/costReduction.png";
	private static String emissionsReductionPath = "/emissionsReduction.png";
	private static String loadingPath = "/loading.gif";
	private static String openPath = "/open.png";
	private static String openBimPath = "/openBim.png";
	private static String resetPath = "/reset.png";
	private static String savePath = "/save.png";
	private static String saveAsPath = "/saveAs.png";
	private static String runPath = "/run.png";
	private static String onDarkModePath = "/onDarkMode.png";
	private static String offDarkModePath = "/offDarkMode.png";
	private static String uBuildingPath = "/unselectedBuilding.png";
	private static String uDemandPath = "/unselectedDemand.png";
	private static String uStoragePath = "/unselectedStorage.png";
	private static String uVolatilePath = "/unselectedVolatile.png";
	private static String uControllablePath = "/unselectedControllable.png";
	private static String uCouplerPath = "/unselectedCoupler.png";
	private static String sBuildingPath = "/selectedBuilding.png";
	private static String sDemandPath = "/selectedDemand.png";
	private static String sStoragePath = "/selectedStorage.png";
	private static String sVolatilePath = "/selectedVolatile.png";
	private static String sControllablePath = "/selectedControllable.png";
	private static String sCouplerPath = "/selectedCoupler.png";
	private static String onMemapPath = "/onMemap.png";
	private static String offMemapPath = "/offMemap.png";
	private static String optCostPath = "/optCost.png";
	private static String optCO2Path = "/optCO2.png";
	private static String lpPath = "/lp.png";
	private static String milpPath = "/milp.png";
	private static String allLogsPath = "/allLogs.png";
	private static String fileLogsPath = "/fileLogs.png";
	private static String resultLogsPath = "/resultLogs.png";
	private static String variableMarketPath = "/variableMarket.png";
	private static String fixedMarketPath = "/fixedMarket.png";
	private static String visualizePath = "/visualize.png";
	private static String csvFormatDEMANDPath = "/csvFormatDEMAND.png";
	private static String csvFormatVALUESPath = "/csvFormatVALUES.png";
	private static String seriesPath = "/series.png";
	private static String logPath = "/log.png";
	private static String statisticsPath = "/statistics.png";
	private static String exclamationPath = "/exclamation.png";
	private static String editPath = "/edit.png";
	private static String closedNodePath = "/closedNode.png";
	private static String openNodePath = "/openNode.png";
	private static String itemNodePath = "/itemNode.png";

	public static ImageIcon fortissLogo = new ImageIcon(new ImageIcon(IconStore.class.getResource(fortissLogoPath))
			.getImage().getScaledInstance(180, 60, Image.SCALE_SMOOTH));

	public static ImageIcon tumLogo = new ImageIcon(new ImageIcon(IconStore.class.getResource(tumLogoPath)).getImage()
			.getScaledInstance(180, 70, Image.SCALE_SMOOTH));

	public static ImageIcon smallFortissLogo = new ImageIcon(new ImageIcon(IconStore.class.getResource(fortissLogoPath))
			.getImage().getScaledInstance(60, 20, Image.SCALE_SMOOTH));

	public static ImageIcon smallTumLogo = new ImageIcon(new ImageIcon(IconStore.class.getResource(tumLogoPath))
			.getImage().getScaledInstance(60, 30, Image.SCALE_SMOOTH));
	
	public static ImageIcon memapLogo = new ImageIcon(new ImageIcon(IconStore.class.getResource(memapLogoPath))
			.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));

	public static ImageIcon smallMemapLogo = new ImageIcon(new ImageIcon(IconStore.class.getResource(memapLogoPath))
			.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));

	public static ImageIcon costReduction = new ImageIcon(new ImageIcon(IconStore.class.getResource(costReductionPath))
			.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH));
	public static ImageIcon emissionsReduction = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(emissionsReductionPath)).getImage().getScaledInstance(150, 100,
					Image.SCALE_SMOOTH));

	public static ImageIcon loading = new ImageIcon(new ImageIcon(IconStore.class.getResource(loadingPath)).getImage()
			.getScaledInstance(1150, 450, Image.SCALE_DEFAULT));

	public static ImageIcon open = new ImageIcon(new ImageIcon(IconStore.class.getResource(openPath)).getImage()
			.getScaledInstance(43, 40, Image.SCALE_SMOOTH));
	public static ImageIcon openBim = new ImageIcon(new ImageIcon(IconStore.class.getResource(openBimPath)).getImage()
			.getScaledInstance(42, 40, Image.SCALE_SMOOTH));
	public static ImageIcon reset = new ImageIcon(new ImageIcon(IconStore.class.getResource(resetPath)).getImage()
			.getScaledInstance(35, 35, Image.SCALE_SMOOTH));
	public static ImageIcon save = new ImageIcon(new ImageIcon(IconStore.class.getResource(savePath)).getImage()
			.getScaledInstance(35, 35, Image.SCALE_SMOOTH));
	public static ImageIcon saveAs = new ImageIcon(new ImageIcon(IconStore.class.getResource(saveAsPath)).getImage()
			.getScaledInstance(35, 35, Image.SCALE_SMOOTH));
	public static ImageIcon run = new ImageIcon(new ImageIcon(IconStore.class.getResource(runPath)).getImage()
			.getScaledInstance(35, 35, Image.SCALE_SMOOTH));
	public static ImageIcon onDarkMode = new ImageIcon(new ImageIcon(IconStore.class.getResource(onDarkModePath))
			.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon offDarkMode = new ImageIcon(new ImageIcon(IconStore.class.getResource(offDarkModePath))
			.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon visualize = new ImageIcon(new ImageIcon(IconStore.class.getResource(visualizePath))
			.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH));
	public static ImageIcon csvFormatDEMAND = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(csvFormatDEMANDPath)).getImage());
	public static ImageIcon csvFormatVALUES = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(csvFormatVALUESPath)).getImage());

	public static ImageIcon uDemandMenu = new ImageIcon(new ImageIcon(IconStore.class.getResource(uDemandPath))
			.getImage().getScaledInstance(25, 35, Image.SCALE_SMOOTH));
	public static ImageIcon uStorageMenu = new ImageIcon(new ImageIcon(IconStore.class.getResource(uStoragePath))
			.getImage().getScaledInstance(25, 35, Image.SCALE_SMOOTH));
	public static ImageIcon uVolatileMenu = new ImageIcon(new ImageIcon(IconStore.class.getResource(uVolatilePath))
			.getImage().getScaledInstance(25, 35, Image.SCALE_SMOOTH));
	public static ImageIcon uControllableMenu = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(uControllablePath)).getImage().getScaledInstance(25, 35,
					Image.SCALE_SMOOTH));
	public static ImageIcon uCouplerMenu = new ImageIcon(new ImageIcon(IconStore.class.getResource(uCouplerPath))
			.getImage().getScaledInstance(25, 35, Image.SCALE_SMOOTH));

	public static ImageIcon uBuilding = new ImageIcon(new ImageIcon(IconStore.class.getResource(uBuildingPath))
			.getImage().getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uDemand = new ImageIcon(new ImageIcon(IconStore.class.getResource(uDemandPath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uStorage = new ImageIcon(new ImageIcon(IconStore.class.getResource(uStoragePath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uVolatile = new ImageIcon(new ImageIcon(IconStore.class.getResource(uVolatilePath))
			.getImage().getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uControllable = new ImageIcon(new ImageIcon(IconStore.class.getResource(uControllablePath))
			.getImage().getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon uCoupler = new ImageIcon(new ImageIcon(IconStore.class.getResource(uCouplerPath)).getImage()
			.getScaledInstance(40, 60, Image.SCALE_SMOOTH));
	public static ImageIcon sBuilding = new ImageIcon(new ImageIcon(IconStore.class.getResource(sBuildingPath))
			.getImage().getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sDemand = new ImageIcon(new ImageIcon(IconStore.class.getResource(sDemandPath)).getImage()
			.getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sStorage = new ImageIcon(new ImageIcon(IconStore.class.getResource(sStoragePath)).getImage()
			.getScaledInstance(50, 70, Image.SCALE_SMOOTH));
	public static ImageIcon sVolatile = new ImageIcon(new ImageIcon(IconStore.class.getResource(sVolatilePath))
			.getImage().getScaledInstance(50, 70, Image.SCALE_SMOOTH));
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
	public static ImageIcon optCO2 = new ImageIcon(new ImageIcon(IconStore.class.getResource(optCO2Path)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon variableMarket = new ImageIcon(
			new ImageIcon(IconStore.class.getResource(variableMarketPath)).getImage().getScaledInstance(85, 35,
					Image.SCALE_SMOOTH));
	public static ImageIcon fixedMarket = new ImageIcon(new ImageIcon(IconStore.class.getResource(fixedMarketPath))
			.getImage().getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon lp = new ImageIcon(new ImageIcon(IconStore.class.getResource(lpPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon milp = new ImageIcon(new ImageIcon(IconStore.class.getResource(milpPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon resultLogs = new ImageIcon(new ImageIcon(IconStore.class.getResource(resultLogsPath))
			.getImage().getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon fileLogs = new ImageIcon(new ImageIcon(IconStore.class.getResource(fileLogsPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));
	public static ImageIcon allLogs = new ImageIcon(new ImageIcon(IconStore.class.getResource(allLogsPath)).getImage()
			.getScaledInstance(85, 35, Image.SCALE_SMOOTH));

	public static ImageIcon series = new ImageIcon(new ImageIcon(IconStore.class.getResource(seriesPath)).getImage()
			.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon statistics = new ImageIcon(new ImageIcon(IconStore.class.getResource(statisticsPath))
			.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon log = new ImageIcon(new ImageIcon(IconStore.class.getResource(logPath)).getImage()
			.getScaledInstance(18, 18, Image.SCALE_SMOOTH));
	public static ImageIcon exclamation = new ImageIcon(new ImageIcon(IconStore.class.getResource(exclamationPath))
			.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
	public static ImageIcon edit = new ImageIcon(new ImageIcon(IconStore.class.getResource(editPath)).getImage()
			.getScaledInstance(20, 20, Image.SCALE_SMOOTH));

	public static ImageIcon closedNode = new ImageIcon(new ImageIcon(IconStore.class.getResource(closedNodePath))
			.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
	public static ImageIcon openNode = new ImageIcon(new ImageIcon(IconStore.class.getResource(openNodePath)).getImage()
			.getScaledInstance(15, 15, Image.SCALE_SMOOTH));
	public static ImageIcon itemNode = new ImageIcon(new ImageIcon(IconStore.class.getResource(itemNodePath)).getImage()
			.getScaledInstance(5, 5, Image.SCALE_SMOOTH));

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
