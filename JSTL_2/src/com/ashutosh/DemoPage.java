package com.ashutosh;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoPage extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String name = "ashutosh";
		
		List<Student> studs = Arrays.asList(new Student(1,"Ashutosh"),new Student(2, "Navin"),new Student(3, "Pankaj"));
		
		//Student s = new Student(1,"Ashutosh");
		
		//request.setAttribute("label", "Ashutosh");
		
		request.setAttribute("student", studs);
		
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}

}
