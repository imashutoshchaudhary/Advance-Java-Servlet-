package com.ashutosh;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/addalien")
public class IdFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		System.out.print("In Filter");
		
		HttpServletRequest req = (HttpServletRequest) request;
		int aid = Integer.parseInt(request.getParameter("aid"));
		
		if (aid>1) 
			chain.doFilter(request, response);
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
