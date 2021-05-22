<!DOCTYPE html>
<html>
<head>
<title>JSTlDEMo</title>
</head>
<body>
	<%
	Integer hitsCount = (Integer) application.getAttribute("hitCounter");
	if (hitsCount == null || hitsCount == 0) {
		/* First visit */
		out.println("Welcome to my website!");
		hitsCount = 1;
	} else {
		/* return visit */
		out.println("Welcome back to my website!");
		hitsCount += 1;
	}
	application.setAttribute("hitCounter", hitsCount);
	%>

	<center>
		<p>
			Total number of visits:
			<%=hitsCount%></p>
	</center>


	<%
	out.println("Hello World <br>");
	%>
	<%
	for (int i = 0; i < 5; i++) {
		out.println(i + "<br>");
	}
	%>

	<%=5 + 5%>

	<%
	out.print(session.getAttribute("userid"));
	%>

	<h3>Insert</h3>
	<form action="fetchsql.jsp">
		<input type="text" placeholder="roll No" name="roll" disabled>
		<br> <br> <input type="text" placeholder="name" name="name">
		<br> <br> <input type="text" placeholder="city" name="city">
		<br> <br> <input type="submit" value="submit"><br>
	</form>

	<h3>update</h3>
	<form action="updatesql.jsp">
		<input type="text" placeholder="roll No" name="roll"> <br>
		<br> <input type="text" placeholder="name" name="name"> <br>
		<br> <input type="text" placeholder="city" name="city"> <br>
		<br> <input type="submit" value="submit"><br>
	</form>

	<%!int n = 0;%>
</body>
</html>