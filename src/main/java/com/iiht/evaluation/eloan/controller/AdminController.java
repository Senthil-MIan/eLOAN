package com.iiht.evaluation.eloan.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iiht.evaluation.eloan.dao.ConnectionDao;
import com.iiht.evaluation.eloan.dao.ProcessDao;
import com.iiht.evaluation.eloan.dao.UserDao;
import com.iiht.evaluation.eloan.dto.LoanDto;
import com.iiht.evaluation.eloan.dto.ProcessDto;
import com.iiht.evaluation.eloan.dto.UserDto;
import com.iiht.evaluation.eloan.model.ApprovedLoan;

import com.iiht.evaluation.eloan.model.User;
import com.iiht.evaluation.eloan.model.Process;

@WebServlet("/admin")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ConnectionDao connDao;

	public void setConnDao(ConnectionDao connDao) {
		this.connDao = connDao;
	}

	public void init(ServletConfig config) {
		String jdbcURL = config.getServletContext().getInitParameter("jdbcUrl");
		String jdbcUsername = config.getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = config.getServletContext().getInitParameter("jdbcPassword");
		System.out.println(jdbcURL + jdbcUsername + jdbcPassword);
		this.connDao = new ConnectionDao(jdbcURL, jdbcUsername, jdbcPassword);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(action);
		String viewName = "";
		try {
			switch (action) {
			case "listall":
				viewName = listall(request, response);
				break;
			case "process":
				viewName = process(request, response);
				break;
			case "callemi":
				viewName = callemi(request, response);
				break;
			case "updatestatus":
				viewName = updatestatus(request, response);
				break;
			case "logout":
				viewName = adminLogout(request, response);
				break;
			default:
				viewName = "notfound.jsp";
				break;
			}
		} catch (Exception ex) {
			throw new ServletException(ex.getMessage());
		}
		RequestDispatcher dispatch = request.getRequestDispatcher(viewName);
		dispatch.forward(request, response);

	}

	private String updatestatus(HttpServletRequest request, HttpServletResponse response) throws SQLException, ParseException {
		// TODO Auto-generated method stub
		/* write the code for updatestatus of loan and return to admin home page */
		
		Process process = new Process();
		/* process.setLoanStatus(request.getParameter("status")); */
		process.setApplicationNumber(request.getParameter("applicationNumber"));
		process.setAmountSanctioned(Float.parseFloat(request.getParameter("amountSanctioned")));
		process.setInterestRate(Float.parseFloat(request.getParameter("interest")));
		process.setLoanStatus(request.getParameter("status"));
		process.setTerm(Integer.parseInt(request.getParameter("term")));
		//process.setTermPaymentAmount(Float.parseFloat(request.getParameter("term")));
		process.setPayStartDate(request.getParameter("paymentStartDate"));
		process.setClosureDate(request.getParameter("loanClosureDate"));		
		process.setEmi(Float.parseFloat(request.getParameter("emi")));
		
		
		boolean status = new  ProcessDao().updateLoan(connDao,process);
		if(status == true) {
			return "adminhome1.jsp";
	} else {			
		return "errorPage.jsp";
	}

		
	}

	private String callemi(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code to calculate emi for given applno and display the details */

		
		int ApplicationNumber=Integer.parseInt(request.getParameter("applicationNum"));
		ProcessDto pDto=new ProcessDao().getLoan(connDao, ApplicationNumber);
		request.setAttribute("data", pDto);
		
		return "calemi.jsp";

	}

	private String process(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* return to process page */
		return "process.jsp";
	}

	private String adminLogout(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* write code to return index page */
		return "index.jsp";
	}

	private String listall(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		List<ProcessDto> loanData=new ProcessDao().getAllLoan(connDao);
		
		/*
		 * LoanDto dto1 = new LoanDto(); dto1.setLoan_name("Home"); dto1.setApp_num(1);
		 * dto1.setAddress("Address 1"); LoanDto dto2 = new LoanDto();
		 * dto2.setLoan_name("Car"); dto2.setApp_num(2); dto2.setAddress("Address 2");
		 * loanData.add(dto1); loanData.add(dto2);
		 */
		/* write the code to display all the loans */
		request.setAttribute("data", loanData);

		return "listall.jsp";
	}

}