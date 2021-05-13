package jdbctutorial;
import java.sql.*;

public class NewDemo {

	public static void main(String[] args) {
		Connection conn = null ;
		Statement stmt = null;
		//register driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/forclass?useSSL=false", "root", "root");
			stmt = conn.createStatement();
			String name = "haha";
			String sql = "insert into student (name, city) values ('"+name+"','sone')";
			stmt.executeUpdate(sql);
			
			sql = "select * from student";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString(1));
				System.out.print(" " + rs.getString(2));
				System.out.println(" " + rs.getString(3));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null || stmt != null)
				try {
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		}
		
		
		
		
	}

}
