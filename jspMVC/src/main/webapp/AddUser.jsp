<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.doa.DOAStudent"  %>
<jsp:useBean id="s" class="com.model.Student"></jsp:useBean>
<jsp:setProperty property="*" name="s"/>

<% 
	int i  = DOAStudent.save(s);
	if(i>0){
		response.sendRedirect("success.jsp");
	}else{
		response.sendRedirect("error.jsp");
	}
%>