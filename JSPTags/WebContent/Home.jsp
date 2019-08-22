<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Tags</title>
</head>
<body>

	<%!     //These are called as Decleration or Not Scriptlets
		int coef = 3;
	%>
		
	<h1>Hello Ashutosh</h1>

	<%		//These are called as scriptlets
		out.print(7+5);
	
		pageContext.setAttribute("name", "ashutosh",PageContext.SESSION_SCOPE);
		pageContext.setAttribute("ashu", "ashutosh",PageContext.SESSION_SCOPE);
		
		int k = 9/0;
		
		/* try {
			int j = 8/0;
		}
		catch(Exception e){
			out.println("Error "+e.getMessage());
		} */
	%>
	
	My Favourite number is : <% out.println(coef); %>
	My Favourite number is : <%= coef %>

</body>
</html>