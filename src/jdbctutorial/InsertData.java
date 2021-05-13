package jdbctutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		System.out.println("Registering Driver...");

		try {
			Class.forName("com.mysql.jdbc.Driver"); //register driver
			conn = DriverManager.getConnection("jdbc:mysql://localhost/javaclass", "root", "root");
			System.out.println("connected to database...");
			stmt = conn.createStatement();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // register driver
		catch (SQLException e) {
			e.printStackTrace();
		}
		String n = "shri";
		String query = "insert into student values (22,'shri', 'sone'),(23,'shri','sone')";
		try { 
			if(stmt.executeUpdate(query)>0)
				System.out.println("succesfully insert data");
			else
				System.out.println("failed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
