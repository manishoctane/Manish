package com.alstom.servlet.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/two",loadOnStartup = 2)
public class TwoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public TwoServlet() {
		System.out.println("Two Object is Created");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(request);
		out.println("<br>");
		out.println(response);
	}

}
