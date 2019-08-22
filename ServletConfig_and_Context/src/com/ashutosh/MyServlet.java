package com.ashutosh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		out.println("Hi "); 
		
		ServletConfig ctx = getServletConfig();
		String str = ctx.getInitParameter("name");
		out.println(str);
		
//		ServletContext context = getServletContext();
//		String string = context.getInitParameter("name");
//		out.println(string);
	}

}
