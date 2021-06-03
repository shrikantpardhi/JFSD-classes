<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fname=request.getParameter("id");
if(true){
	
	session.setAttribute("userid", fname);
	
	response.sendRedirect("index.jsp");
}
	
else
	response.sendRedirect("error.html");
%>

</body>
</html>