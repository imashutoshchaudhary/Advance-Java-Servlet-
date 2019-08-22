package com.ashutosh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addalien")
public class MyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		System.out.println("In Servlet Class");
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		String aname = request.getParameter("aname");
		
		out.println("Welcome "+aname);
		
	}

}
