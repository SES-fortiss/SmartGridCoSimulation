package memap.messages.planning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import memap.helper.EnergyPrices;
import memap.helper.configurationOptions.OptHierarchy;
import memap.main.JettyStart;


public class ConnectionDB {

	private static String tablename;
	public static Connection connectToDB() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/memap";
		String user = "postgres";
		String password = "MEMAP_DB";
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
    }
	
	public static void addResults(OptHierarchy Hierarchy, int currentTimeStep, String[] namesResult, double[] currentStep, double[] currentDemand, double[] currentOptVector, double[] currentSOC,
			double[] currentEnergyPrice, double[] totalCostsEUR, double[] totalCO2emissions, int nrOfBuildings)
	{
		int num =  JettyStart.numofBuildings;
		
		List<String> names = new ArrayList<String>(namesResult.length);
		Collections.addAll(names, namesResult);
		ListIterator<String> itr = names.listIterator();
		while (itr.hasNext()) {
			itr.set(itr.next().replaceAll("\\s", ""));
		}
		
//		System.out.println("LÄNGE = " + namesResult.length + ", 4. Name: " + names.get(3)+ ", 5. Name: " + names.get(4));
		
		switch(Hierarchy) {
		
		case MEMAP:
			tablename = "MEMAP";
			
			String columns = "";
			String list = "";
			for(int i=0 ; i < names.size()-3 ; i++)
			{
				columns += "MEMAP_" + names.get(i) + " DOUBLE PRECISION NULL" + ", ";
				list += "MEMAP_" + names.get(i) + ", ";
			}
			
			writeResultsToDB(tablename, columns, list, currentTimeStep, currentDemand, currentOptVector, currentSOC, totalCostsEUR, totalCO2emissions);
			break;
			
		case BUILDING:	
			for(int b = num; b > 0; b--)
			{
				tablename = "Building" + b ;

				String bColumns = "";
				String bList = "";
				for(int i=0 ; i < names.size()-3 ; i++)
				{
					bColumns += "B" + b + "_" + names.get(i).substring(names.get(i).indexOf("_")+1).trim() + " DOUBLE PRECISION NULL" + ", ";
					bList += "B" + b + "_" + names.get(i).substring(names.get(i).indexOf("_")+1).trim() + ", ";
				}
				writeResultsToDB(tablename, bColumns, bList, currentTimeStep, currentDemand, currentOptVector, currentSOC, totalCostsEUR, totalCO2emissions);			
			}
			break;
		}	
	}

	
	private static void writeResultsToDB(String tablename, String columns, String list, int currentTimeStep, double[] currentDemand, 
			double[] currentOptVector, double[] currentSOC, double[] totalCostsEUR, double[] totalCO2emissions) {
		String createtable = "CREATE TABLE IF NOT EXISTS " + tablename + "(";
		
		long step = System.currentTimeMillis() / 1000L;
		double heatdemand = currentDemand[0];
		double elecdemand = currentDemand[1];
		double priceEl = EnergyPrices.getInstance().getElectricityPriceInEuro(currentTimeStep);
		double priceHt = EnergyPrices.getInstance().getHeatPriceInEuro(currentTimeStep);
		double cost = totalCostsEUR[0];
		double CO2 = totalCO2emissions[0];
		
		String sql1 = createtable + columns;
		sql1 = sql1 + "ElectricityPrice_EUR DOUBLE PRECISION NULL, HeatPrice_EUR DOUBLE PRECISION NULL, TotalCostsEUR DOUBLE PRECISION NULL, TotalCO2emissions DOUBLE PRECISION NULL, timestamp TIMESTAMPTZ NULL);";
		list = "INSERT INTO " + tablename + "(" + list + "ElectricityPrice_EUR, HeatPrice_EUR, TotalCostsEUR, TotalCO2emissions, timestamp) VALUES('" + step + "','" + heatdemand + "','" + elecdemand;
		for(double i : currentOptVector) {
			list += "','" + i;
		}	
		for(double j : currentSOC) {
			list += "','" + j;
		}
		list += "','" + priceEl + "','" + priceHt + "','" + cost + "','" + CO2 + "', NOW());";
		sql1 += list;
		
		try {
			Connection conn = connectToDB();
			PreparedStatement pst = conn.prepareStatement(sql1);
			pst.executeUpdate();
			System.out.println("Results written to DB.");
		}
		catch (SQLException ex) {
            System.out.println("DB-Message: " + ex.getMessage());
        }

	}
}

