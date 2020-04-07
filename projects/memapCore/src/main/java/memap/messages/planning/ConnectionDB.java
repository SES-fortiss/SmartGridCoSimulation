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
	
	public static void addResults(double[] results)
	{
		String r = Arrays.toString(results);
		String sql = "CREATE TABLE IF NOT EXISTS tb(result VARCHAR(2000) NULL, timestamp TIMESTAMPTZ NULL); "
				+ "INSERT INTO tb(result,timestamp) VALUES ('" + r + "',NOW())";
		try (Connection conn = connectToDB();
				PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery()){}
		catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
	}
}

