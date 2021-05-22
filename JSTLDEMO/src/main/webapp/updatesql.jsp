<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*, java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String roll = request.getParameter("roll");
	String name =  request.getParameter("name");
	String city =  request.getParameter("city");
	try {
		out.print("connecting to db"+"<br>");
		Class.forName("com.mysql.jdbc.Driver");
		out.print("driver loaded"+"<br>");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/forclass", "root", "root");
		out.print("connection created"+"<br>");
		Statement st = conn.createStatement();
		out.print("statement created"+"<br>");
		
		if(name.length()!=0){
			out.print("updating data<br>");
			out.print("user name "+name+" city "+city);
			int n = st.executeUpdate("update student set name = '"+name+"',city = '"+city+"' where rollno = "+roll);
			if (n>0)
				out.print("data inserted <br>");
			else
				response.sendError(400);
		}
		else
			response.sendError(400);
		
		
		ResultSet rs = st.executeQuery("select * from student");
		out.print("<table border='1'> <tr> <th>Roll</th> <th>Name</th> <th>City</th> </tr>");
		while (rs.next()) {
			out.print("<tr>");
			out.print("<td>"+rs.getString(1)+"</td>");
			out.print("<td>"+rs.getString(2)+"</td>");
			out.print("<td>"+rs.getString(3)+"</td>");
			out.print("</tr>");
		} 
		out.print("</table>");
	}

	catch (Exception e) {
		System.out.print(e);
		e.printStackTrace();
	}
	%>

</body>
</html>