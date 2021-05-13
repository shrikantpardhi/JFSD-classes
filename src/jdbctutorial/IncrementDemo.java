package jdbctutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IncrementDemo {
	static Connection conn;
	static Statement stmt;

	static void forConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/forclass?useSSL=false", "root", "root");
		System.out.println("connected to database");
//		conn.setAutoCommit(false);
	}

	static void statements(String name) throws SQLException {
		stmt = conn.createStatement();
		String query = "insert into student (name, city) values ('shri','sone')";

		long result = stmt.executeUpdate(query);
		if (result != 0)
			System.out.println(result + " records inserted");
		else
			System.out.println("Records not inserted");
		ResultSet rs = stmt.executeQuery("select * from student");
		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print(" " + rs.getString(2));
			System.out.println(" " + rs.getString(3));
		}

		conn.close();
	}

	public static void main(String[] args) {
		try {
			forConnection();
			statements("shri");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
