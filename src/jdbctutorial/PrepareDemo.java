package jdbctutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareDemo {
	static Connection conn;
	static PreparedStatement ps;
	static Statement stmt;

	static void forConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/forclass", "root", "root");
		System.out.println("connected to database");
		stmt = conn.createStatement();
//		conn.setAutoCommit(false);
	}

	static void statements(String name) throws SQLException {
		ps = conn.prepareStatement("insert into student (name, city) "
				+ "values (?, ?)");
		ps.setString(1, "hud");
		ps.setString(2, "hundred");
		
		int x = ps.executeUpdate();
		if(x>0)
			System.out.println("inserted");
		else
			System.out.println("insertion failed");

		ResultSet rs = stmt.executeQuery("select * from student");
		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print(" "+rs.getString(2));
			System.out.println(" "+rs.getString(3));
		}
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
