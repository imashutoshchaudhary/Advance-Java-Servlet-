<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="str" value="Ashutosh is a Java Trainer"></c:set>
	
	Length : ${fn:length(str)}
	
	<c:forEach items="${fn:split(str,' ') }" var="s">
		
		<br>
		${s }
		
	</c:forEach>
	
	<br>index: ${fn:indexOf(str,"is") }
	
	<br>isThere: ${fn:contains(str,"Java") }
	<br>isThere: ${fn:contains(str,"JSP") }.
	
	<c:if test="${fn:contains(str,'Java') }">
		
		<br>Java is There
	
	</c:if>
	
	<c:if test="${fn:contains(str,'JSP') }">
		
		<br>JSP is There
	
	</c:if>
	
	<c:if test="${fn:endsWith(str,'Trainer') }">
		
		<br>Yes it ends with Trainer
	
	</c:if>
	
	<c:if test="${fn:endsWith(str,'Java') }">
		
		<br>Yes it ends with Java
	
	</c:if>
	
	<br>In Upper Case : ${fn:toUpperCase(str)}

</body>
</html>