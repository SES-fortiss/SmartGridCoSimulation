package memap.messages.planning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

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
	
	public static void addResults(OptHierarchy Hierarchy, int currentTimeStep, String[] namesResult, double[] vectorResult_this_TimeStep , int nrOfBuildings)
	{
		int num =  JettyStart.numofBuildings;
		
		List<String> names = new ArrayList<String>(namesResult.length);
		Collections.addAll(names, namesResult);
		ListIterator<String> itr = names.listIterator();
		while (itr.hasNext()) {
			itr.set(itr.next().replaceAll("\\s", ""));
		}
		
//		System.out.println("LENGTH NAMES = " + namesResult.length );
//		System.out.println("LENGTH VALUES = " + vectorResult_this_TimeStep.length );
//		
		switch(Hierarchy) {
			
		case MEMAP:
			tablename = "MEMAP_CoSES";
			
			String columns = "";
			String list = "";
			for(int i=0 ; i < names.size() ; i++)
			{
				columns += "\"MEMAP_" + names.get(i) + "\" DOUBLE PRECISION NULL" + ", ";
				list += "\"MEMAP_" + names.get(i) + "\", ";
			}
			
			writeResultsToDB(tablename, columns, list, currentTimeStep, vectorResult_this_TimeStep );
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
				writeResultsToDB(tablename, bColumns, bList, currentTimeStep, vectorResult_this_TimeStep );			
			}
			break;
		}	
	}

	
	private static void writeResultsToDB(String tablename, String columns, String list, int currentTimeStep, double[] vectorResult_this_TimeStep ) {
		String createtable = "CREATE TABLE IF NOT EXISTS " + tablename + "(";
		
		long step = System.currentTimeMillis() / 1000L;
		
		String sql1 = createtable + columns;
		sql1 = sql1 + "timestamp TIMESTAMPTZ NULL);";
		list = "INSERT INTO " + tablename + "(" + list + "timestamp) VALUES('" + step ;
		
		double[] valueArray = Arrays.copyOfRange(vectorResult_this_TimeStep, 1, vectorResult_this_TimeStep.length);
		for(double i : valueArray ) {
			list += "','" + i;
		}	
		list += "', NOW());";
		sql1 += list;

		try {
			Connection conn = connectToDB();
			PreparedStatement pst = conn.prepareStatement(sql1);
			pst.executeUpdate();
			System.out.println("Results written to DB.");
			conn.close();
		}
		catch (SQLException ex) {
//            System.out.println("DB-Message: " + ex.getMessage());
        }


	}
}

