<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page
	import="com.model.Student, com.doa.DOAStudent, java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Students</title>
</head>
<body>
<%@ include file="header.html"%><br>

	<br>
	<h1>Users List</h1>

	<%
	List<Student> list = DOAStudent.fetchAllRecords();
	request.setAttribute("list", list);
	%>
	<table border="1" width="90%">
		<tr>
			<th>Roll</th>
			<th>Name</th>
			<th>City</th>
		</tr>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getRoll()}</td>
				<td>${u.getName()}</td>
				<td>${u.getCity()}</td>
				<td><a href="updateForm.jsp?id=${u.getRoll()}">Edit</a></td>
				<td><a href="DeleteUser.jsp?id=${u.getRoll()}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="addUserForm.jsp">Add New User</a>

</body>
</html>