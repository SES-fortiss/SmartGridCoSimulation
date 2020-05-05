package memap.messages.planning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import memap.helper.configurationOptions.OptHierarchy;


public class ConnectionDB {
	private static String tableName;

	public static Connection connectToDB() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String user = "postgres";
		String password = "MEMAP_DB";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection to database: Successfull");
		return con;
    }
	
	public static void addResults(OptHierarchy Hierarchy, String[] namesResult, double[] currentStep, double[] currentDemand, double[] currentOptVector, double[] currentSOC,
			double[] currentEnergyPrice, double[] totalCostsEUR, double[] totalCO2emissions)
	{
		List<String> names = new ArrayList<String>(namesResult.length);
		Collections.addAll(names, namesResult);
		ListIterator<String> itr = names.listIterator();
		while (itr.hasNext()) {
		  itr.set(itr.next().replaceAll("\\s", ""));
		}
		long step;
		double heatdemand;
		double elecdemand;
		double price;
		double cost;
		double CO2;
//		step = currentStep[0];
		step = System.currentTimeMillis() / 1000L;
		heatdemand = currentDemand[0];
		elecdemand = currentDemand[1];
		price = currentEnergyPrice[0];
		cost = totalCostsEUR[0];
		CO2 = totalCO2emissions[0];
		
		if (Hierarchy ==  OptHierarchy.MEMAP) {
			tableName = "MemapON";
		} else {
			// which building?
			tableName = "MemapOFF";
		}
		
		String createtable = "CREATE TABLE IF NOT EXISTS " + tableName + "(";
		String columns = "";
		String list = "";
		
		for(int i=0 ; i < names.size()-3 ; i++)
		{
			columns += names.get(i) + " DOUBLE PRECISION NULL" + ", ";
			list += names.get(i) + ", ";
		}
		String sql1 = createtable + columns;
		sql1 = sql1 + "EnergyPrice_EUR DOUBLE PRECISION NULL, TotalCostsEUR DOUBLE PRECISION NULL, TotalCO2emissions DOUBLE PRECISION NULL, timestamp TIMESTAMPTZ NULL);";
		list = "INSERT INTO " + tableName + "(" + list + "EnergyPrice_EUR, TotalCostsEUR, TotalCO2emissions, timestamp) VALUES('" + step + "','" + heatdemand + "','" + elecdemand;
		for(double i : currentOptVector) 
			list += "','" + i;
		for(double j : currentSOC)
			list += "','" + j;
		list += "','" + price + "','" + cost + "','" + CO2 + "', NOW());";
		sql1 += list;
		try (Connection conn = connectToDB();
				PreparedStatement pst = conn.prepareStatement(sql1);
				ResultSet rs = pst.executeQuery()){}
		catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
	}
}

