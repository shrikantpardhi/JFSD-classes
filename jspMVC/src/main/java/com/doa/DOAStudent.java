package com.doa;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class DOAStudent {
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/forclass?useSSL=false", "root", "");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch (SQLException e) {
			System.out.println(e);
		}
		return con;
	}
	
	public static int save(Student s) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("insert into student (name, city) values (?,?)");
			ps.setString(1, s.getName());
			ps.setString(2, s.getCity());
			status = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return status;
	}
	
	public static List<Student> fetchAllRecords(){
		List<Student> list = new ArrayList<Student>();
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				s.setRoll(rs.getInt("roll"));
				s.setName(rs.getString("name"));
				s.setCity(rs.getString("city"));
				list.add(s);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return list;
	}

	public static Student getByRoll(int id) {
		Student s = new Student();
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student where roll=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				s.setRoll(rs.getInt("roll"));
				s.setName(rs.getString("name"));
				s.setCity(rs.getString("city"));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return s;
	}
	
	public static int update(Student s) {
        int status = 0 ;
        System.out.println(s.getRoll());
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE student SET name = ?, city = ? WHERE roll = ?");
            ps.setString(1, s.getName());
            ps.setString(2, s.getCity());
            ps.setInt(3, s.getRoll());
            status = ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        } 
        return status;
    }
	
	public static int delete(int id) {
		int status = 0 ;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("delete from student where roll = ? ");
            ps.setInt(1, id);
            status = ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        } 
        return status;
	}
}
