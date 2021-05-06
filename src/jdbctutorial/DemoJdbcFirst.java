package jdbctutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbcFirst {

	public static void main(String[] args) {
		// JDBC driver name and database URL
//		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//		final String DB_URL = "jdbc:mysql://localhost/javaclass";

		// Database credentials
		final String USER = "root";
		final String PASS = "root";

		Connection conn = null;
		Statement stmt = null;

		try {
			System.out.println("Registering Driver...");

			Class.forName("com.mysql.jdbc.Driver"); // register driver
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/javaclass", USER, PASS);
			
			System.out.println("connected to database...");
			
			stmt = conn.createStatement();
			
//			String query = "select * from student";
			String query = "CREATE TABLE DEPT(DEPTID INT PRIMARY KEY, DEPTNAME VARCHAR(20))";
			
//			ResultSet rs = stmt.executeQuery(query);
			if(!stmt.execute(query))
				System.out.println("DEPT table cretaed successfully..");
			else
				System.out.println("Unable to crreate table..");
			
//			while(rs.next()) {
//				System.out.print("roll :"+ rs.getInt("roll"));
//				System.out.print(" name :"+ rs.getString("name"));
//				System.out.println(" city :"+ rs.getString("city"));
//			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("closing conection...");
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}

}
