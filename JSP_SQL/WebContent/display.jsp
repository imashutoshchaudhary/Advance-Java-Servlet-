<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/mario" user="root" password="ashu"/>
	
	<sql:query var="rs" dataSource="${db }" >select * from gadgets</sql:query>
	
	<c:forEach items="${rs.rows }" var="gadgets">
	
	<br><c:out value="${gadgets.gid }"></c:out> : <c:out value="${gadgets.gname }"></c:out> : <c:out value="${gadgets.price}"></c:out>

	</c:forEach>

</body>
</html>