package com.jwolfe.rex.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Initializing servlet...");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Destroying servlet...");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servicing get...");
		var writer = response.getWriter();
		writer.println("Tsar coded this servlet...");
		writer.append("Served at: ").append(request.getContextPath());
		writer.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servicing post...");
		var width = Integer.parseInt(request.getParameter("width"));
		var height = Integer.parseInt(request.getParameter("height"));
		
		var area = width * height;
		
        var writer = response.getWriter();
        writer.println("<html>Area of the rectangle is: " + area + "</html>");
        writer.flush();
	}
}
