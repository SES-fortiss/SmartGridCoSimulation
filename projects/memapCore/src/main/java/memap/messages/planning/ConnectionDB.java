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
		String r1 = Arrays.toString(currentStep);
		String r2 = Arrays.toString(currentDemand);
		String r3 = Arrays.toString(currentOptVector);
		String r4 = Arrays.toString(currentSOC);
		String r5 = Arrays.toString(currentEnergyPrice);
		String r6 = Arrays.toString(totalCostsEUR);
		String r7 = Arrays.toString(totalCO2emissions);
		String sql = "CREATE TABLE IF NOT EXISTS milp(currentStep VARCHAR(100) NULL, currentDemand VARCHAR(100) NULL, currentOptVector VARCHAR(100) NULL, currentSOC VARCHAR(100) NULL, currentEnergyPrice VARCHAR(100) NULL, totalCostsEUR VARCHAR(100) NULL, totalCO2emissions VARCHAR(100) NULL, timestamp TIMESTAMPTZ NULL); "
				+ "INSERT INTO milp(currentStep, currentDemand, currentOptVector, currentSOC,\r\n" + 
				"				currentEnergyPrice, totalCostsEUR, totalCO2emissions,timestamp) VALUES ('" + r1 + "','" + r2 + "','" + r3 + "','" + r4 + "','" + r5 + "','" + r6 + "','" + r7 + "',NOW());";
		try (Connection conn = connectToDB();
				PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery()){}
		catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
	}
}

