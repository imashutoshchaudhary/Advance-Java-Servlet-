package com.ashutosh.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ashutosh.web.dao.DataDao;

/**
 * Servlet implementation class GetDataController
 */
public class GetDataController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int gid = Integer.parseInt(request.getParameter("gid"));
		DataDao dao = new DataDao();
		Data a1 = dao.getData(gid);
		
		request.setAttribute("data", a1);
		
		RequestDispatcher rd = request.getRequestDispatcher("ShowData.jsp");
		rd.forward(request, response);
	}

}
