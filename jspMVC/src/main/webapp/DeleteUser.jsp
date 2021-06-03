<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.doa.DOAStudent"%>
<%
String id = request.getParameter("id");
int i=DOAStudent.delete(Integer.parseInt(id));
response.sendRedirect("viewUsers.jsp");
%>

