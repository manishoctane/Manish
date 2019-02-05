package com.alstom.servlet.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/three",loadOnStartup = 2)
public class ThreeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public ThreeServlet() {
		System.out.println("Three Object is Created");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(request);
		out.println("<br>");
		out.println(response);
	}

}
