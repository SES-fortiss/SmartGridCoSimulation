package memap.messages.planning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionDB {
	public static Connection connectToDB() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String user = "postgres";
		String password = "abc1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection to database: Successfull");
		return con;
    }
	
	public static void addResults(double[] currentStep, double[] currentDemand, double[] currentOptVector, double[] currentSOC,
			double[] currentEnergyPrice, double[] totalCostsEUR, double[] totalCO2emissions)
	{
		double step;
		double currentDemand1;double currentDemand2;
		double currentOptVector1;double currentOptVector2;double currentOptVector3;
		double currentOptVector4;double currentOptVector5;double currentOptVector6;
		double currentSOC1;
		double price;
		double cost;
		double CO2;
		step = currentStep[0];
		currentDemand1 = currentDemand[0];currentDemand2 = currentDemand[1];
		currentOptVector1 = currentOptVector[0];
		currentOptVector2 = currentOptVector[1];
		currentOptVector3 = currentOptVector[2];
		currentOptVector4 = currentOptVector[3];
		currentOptVector5 = currentOptVector[4];
		currentOptVector6 = currentOptVector[5];
		currentSOC1 = currentSOC[0];
		price = currentEnergyPrice[0];
		cost = totalCostsEUR[0];
		CO2 = totalCO2emissions[0];
		String sql = "CREATE TABLE IF NOT EXISTS milp(currentStep DOUBLE PRECISION NULL, currentDemand1 DOUBLE PRECISION  NULL, currentDemand2 DOUBLE PRECISION NULL,\r\n" + 
				"currentOptVector1 DOUBLE PRECISION NULL, currentOptVector2 DOUBLE PRECISION NULL, currentOptVector3 DOUBLE PRECISION NULL, currentOptVector4 DOUBLE PRECISION NULL, currentOptVector5 DOUBLE PRECISION NULL, currentOptVector6 DOUBLE PRECISION,\r\n" +
				"currentSOC DOUBLE PRECISION NULL, currentEnergyPrice DOUBLE PRECISION NULL, totalCostsEUR DOUBLE PRECISION NULL, totalCO2emissions DOUBLE PRECISION NULL, timestamp TIMESTAMPTZ NULL);" +
				" INSERT INTO milp(currentStep, currentDemand1, currentDemand2, currentOptVector1, currentOptVector2, currentOptVector3, currentOptVector4, currentOptVector5, currentOptVector6,\r\n"+
				"currentSOC, currentEnergyPrice, totalCostsEUR, totalCO2emissions, timestamp) VALUES('" + step + "','" + currentDemand1 + "','" + currentDemand2 + "','" + currentOptVector1 + "','" + currentOptVector2 + "','" + currentOptVector3 + "','" + currentOptVector4 + "','" + currentOptVector5 + "','" + currentOptVector6 + "','" +
				currentSOC1 + "','" + price + "','" + cost + "','" + CO2 + "', NOW());";
				
		try (Connection conn = connectToDB();
				PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery()){}
		catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
	}
}

