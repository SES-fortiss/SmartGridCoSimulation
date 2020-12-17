package memap.messages.planning;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import memap.helper.configurationOptions.OptHierarchy;


public class ConnectionDB {
	private static String memap;
	//private static String tablename;
	public static Connection connectToDB() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String user = "postgres";
		String password = "MEMAP_DB";
		Connection con = DriverManager.getConnection(url, user, password);
		//System.out.println("Connection to database: Successfull");
		return con;
    }
	
	public static void addResults(OptHierarchy Hierarchy, String[] namesResult, double[] currentStep, double[] currentDemand, double[] currentOptVector, double[] currentSOC,
			double[] currentEnergyPrice, double[] totalCostsEUR, double[] totalCO2emissions, int nrOfBuildings)
	{
		int num =  nrOfBuildings;
		System.out.println("Nr Of Buildings: " + num);
		List<String> names = new ArrayList<String>(namesResult.length);
		Collections.addAll(names, namesResult);
		ListIterator<String> itr = names.listIterator();
		while (itr.hasNext()) {
			itr.set(itr.next().replaceAll("\\s", ""));
		}
		long step;
		double heatdemand;
		double elecdemand;
		double priceEl;
		double priceHt;
		double cost;
		double CO2;
//		step = currentStep[0];
		step = System.currentTimeMillis() / 1000L;
		heatdemand = currentDemand[0];
		//System.out.println("Number of Buildings:" + num);
		//System.out.println("Heat demand:" + heatdemand);
		elecdemand = currentDemand[1];
		//System.out.println("Elec demand:" + elecdemand);
		priceEl = currentEnergyPrice[0];
		priceHt = currentEnergyPrice[1];
		cost = totalCostsEUR[0];
		CO2 = totalCO2emissions[0];
		
		
		for(int b = num; b > 0; b--)
		{
			if (Hierarchy ==  OptHierarchy.MEMAP) {
				memap = "MemapON";
			} else {
				// which building?
				memap = "MemapOFF";
			}
			String createtable = "CREATE TABLE IF NOT EXISTS " + "Building" + b + memap + "(";
			String columns = "";
			String list = "";
			
			for(int i=0 ; i < names.size()-4 ; i++)
			{
				columns += "B"+ b +"_" + names.get(i) + " DOUBLE PRECISION NULL" + ", ";
				list += "B"+ b +"_" + names.get(i) + ", ";
			}
			String sql1 = createtable + columns;
			sql1 = sql1 + "ElectricityPrice_EUR DOUBLE PRECISION NULL, GasPrice_EUR DOUBLE PRECISION NULL, TotalCostsEUR DOUBLE PRECISION NULL, TotalCO2emissions DOUBLE PRECISION NULL, timestamp TIMESTAMPTZ NULL);";
			list = "INSERT INTO " + "Building" + b + memap + "(" + list + "ElectricityPrice_EUR, GasPrice_EUR, TotalCostsEUR, TotalCO2emissions, timestamp) VALUES('" + step + "','" + heatdemand + "','" + elecdemand;
			for(double i : currentOptVector) {
				list += "','" + i;
			}	
			for(double j : currentSOC) {
				list += "','" + j;
			}
			list += "','" + priceEl + "','" + priceHt + "','" + cost + "','" + CO2 + "', NOW());";
			sql1 += list;
			
			try (PrintWriter out = new PrintWriter("DB_SQL.txt")) {
			    out.println(sql1);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try (Connection conn = connectToDB();
					PreparedStatement pst = conn.prepareStatement(sql1);
					ResultSet rs = pst.executeQuery()){}
			catch (SQLException ex) {
	            System.out.println("DB-Message: " + ex.getMessage());
	        }
		}
	}
}

