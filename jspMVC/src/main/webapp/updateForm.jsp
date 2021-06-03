<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page
	import="com.model.Student, com.doa.DOAStudent, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Record</title>
</head>
<body>
<%@ include file="header.html"%><br>

<br>
	<%
	String id = request.getParameter("id");
	Student s = DOAStudent.getByRoll(Integer.parseInt(id));
	%>
	
	<h1>Edit Form</h1>
        <form action="UpdateUser.jsp" method="post">
            <input type="hidden" name="id" value="<%=s.getRoll()%>"/>
            <table>
                <tr><td>Name:</td><td><input type="text" name="name" value="<%= s.getName()%>"/></td></tr>
                <tr><td>City:</td><td><input type="text" name="city" value="<%= s.getCity()%>"/></td></tr>
                <tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>
            </table>
        </form>
</body>
</html>