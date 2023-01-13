package com.mobilecare.servlet;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NewComplaintServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mobileNo = req.getParameter("mobileNo");
		String emailAddress = req.getParameter("emailAddress");
		String problem = req.getParameter("problem");
		String altNo = req.getParameter("altContactNo");
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("Email Address: " + emailAddress);

		String refNo = UUID.randomUUID().toString().substring(0, 7);
		req.setAttribute("refNo", refNo);
		req.getRequestDispatcher("/complaint-details.jsp").forward(req, resp);
	}

}
