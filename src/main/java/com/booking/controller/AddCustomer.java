package com.booking.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prodapt.proj.travel.customer.Customer;
import com.prodapt.proj.travel.customer.CustomerDAOImpl;

/**
 * Servlet implementation class AddBooking
 */
@WebServlet("/add-customer.do")
public class AddCustomer extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("custId");
		
		String custName = request.getParameter("custName");
		String custCity = request.getParameter("custCity");
		int custId = Integer.parseInt(id);
		
		Customer cust = new Customer(custId, custName, custCity);
		CustomerDAOImpl dao = new CustomerDAOImpl();
		
		boolean result = dao.addCustomer(cust);
		
		if(result) {
			List<Customer> custList = dao.getAllCustomer();
			request.setAttribute("customers", custList);
			
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("add-customer.jsp");
			rd.forward(request, response);
		}
		
	}

}
