package com.jda.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bk.spring.core.Employee;
import com.bk.spring.core.EmployeeService;
import com.bk.spring.core.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// resonse will be shown in browser
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// These will be on console
		System.out.println("We are in the Get!");
		
		Employee emp = new Employee(request.getParameter("fname"), request.getParameter("lname"));
		EmployeeService service = new EmployeeServiceImpl();
		response.getWriter().append("Employee " + request.getParameter("fname") + " " + request.getParameter("lname") + " added to the system!");

		service.generateMail(emp);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("Post!");
	}

}
