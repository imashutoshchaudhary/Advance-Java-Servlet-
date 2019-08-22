<%@page import="com.ashutosh.web.Data"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

	<%
		
		Data a1 = (Data)request.getAttribute("data");
		out.println(a1);
	
	%>

</body>
</html>