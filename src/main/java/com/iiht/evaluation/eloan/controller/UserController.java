package com.iiht.evaluation.eloan.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

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
import com.iiht.evaluation.eloan.dto.ProcessDto;
import com.iiht.evaluation.eloan.dto.UserDto;
import com.iiht.evaluation.eloan.model.ApprovedLoan;

import com.iiht.evaluation.eloan.model.User;
import com.mysql.cj.xdevapi.Statement;

import com.iiht.evaluation.eloan.model.Process;

//import jdk.internal.misc.FileSystemOption;




@WebServlet("/user")
public class UserController extends HttpServlet {
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

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
//		try {
//			this.connDao.connect();
//		}catch(Exception e) {
//			System.out.println("ERR"+e);
//		}
		String viewName = "";
		try {
			switch (action) {
			case "registernewuser":
				viewName=registernewuser(request,response);
				break;
			case "validate":
				viewName=validate(request,response);
				break;
			case "placeloan":
				viewName=placeloan(request,response);
				break;
			case "application1":
				viewName=application(request,response);
				break;
			case "editLoanProcess"  :
				viewName=editLoanProcess(request,response);
				break;
			case "registeruser":
				viewName=registerUser(request,response);
				break;
			case "register":
				viewName = register(request, response);
				break;
			case "application":
				viewName = application(request, response);
				break;
			case "trackloan":
				viewName = trackloan(request, response);
				break;
			case "editloan":
				viewName = editloan(request, response);
				break;	
			case "loanUpdate":
				viewName = loanUpdate(request, response);
				break;	
			case  "displaystatus" :
				viewName=displaystatus(request,response);
				break;
			default : viewName = "notfound.jsp"; break;	
			}
		} catch (Exception ex) {
			
			throw new ServletException(ex.getMessage());
		}
			RequestDispatcher dispatch = 
					request.getRequestDispatcher(viewName);
			dispatch.forward(request, response);
	}
	private String validate(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		/* write the code to validate the user */
//		String userName = request.getB
//		Enumeration params = request.getParameterNames();
//		System.out.println(params);
//		while(params.hasMoreElements()){
//	        String paramName = (String)params.nextElement();
//	        System.out.println(paramName + " = " + request.getParameter(paramName));
//	    }
		User user = new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		UserDto currentUser = new  UserDao().getUser(connDao,user);
		
		System.out.println(currentUser);
		
		if(currentUser != null) {
			if(currentUser.getRole().equals("admin")) 	{				
				return "adminhome1.jsp";
			}else {				
				return "userhome.jsp";
			}
		} else {			
			return "errorPage.jsp";
		}
	}
	private String placeloan(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
	/* write the code to place the loan information */
		
	  Process application = new Process();
	  application.setLoanName(request.getParameter("LoanType"));
	  application.setApplicationDate(request.getParameter("AppDate"));
	  application.setLoanAmount(Float.parseFloat(request.getParameter("LoanAmount")));
	  application.setApplicationDate(request.getParameter("AppDate"));
	  application.setCustomerName(request.getParameter("customerName"));
	  //application.setUserid(request.getParameter("username"));
	  
	  
	   
	  application.setBusinessStructure(request.getParameter("BusinessStructure"));
	  application.setBillingIndicator(request.getParameter("BillingIndicator"));
	  application.setTaxIndicator(request.getParameter("TaxIndicator"));
	  application.setAddress(request.getParameter("Address"));
	  application.setMobile(request.getParameter("Mobile"));
	  application.setEmail(request.getParameter("EmailId"));
	 
	  boolean applyLoan = new  ProcessDao().applyLoan(connDao, application);
	  
	   if(applyLoan == true)
	  { return "userhome.jsp"; } else
	  { return "errorPage.jsp"; }
	 
		
		
		
	}
	private String application(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	/* write the code to display the loan application page */
		
		return "application.jsp";
	}
	private String editLoanProcess(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code to edit the loan info */
		
		return null;
	}
	private String registerUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code to redirect page to read the user details */
		return "newuserui.jsp";
	}
	private String registernewuser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code to create the new user account read from user 
		   and return to index page */
		User user = new User();
		
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		user.setFullName(request.getParameter("fullname"));
		boolean registerStatus = new  UserDao().registerUser(connDao, user);
		System.out.println(registerStatus);
		if(registerStatus == true) {
				return "index.jsp";
		} else {			
			return "errorPage.jsp";
		}
	}
		
	private String register(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* write the code to redirect to register page */
		
		return null;
	}
	private String displaystatus(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code the display the loan status based on the given application
		   number 
		*/
		
		int ApplicationNumber=Integer.parseInt(request.getParameter("LoanAppNum"));
		ProcessDto pDto=new ProcessDao().getLoan(connDao, ApplicationNumber);
		request.setAttribute("data", pDto);
		
		return "displayStatus.jsp";
		
		
	}

	private String editloan(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
	/* write a code to return to editloan page */
		int ApplicationNumber=Integer.parseInt(request.getParameter("applicationNum"));
		/* ProcessDto pDto=new ProcessDao().getLoan(connDao, ApplicationNumber); */
		ProcessDto pDto=new ProcessDao().getLoan(connDao, ApplicationNumber);
		
		if(pDto.getLoanStatus().equals("Approved"))
		{
			request.setAttribute("validate", "Loan is already approved. Hence, can't edit");
			return "editloan.jsp";
		}
		else
		{
			request.setAttribute("data", pDto);
			return "editloanui.jsp";
			
		}		
		
	}

	private String trackloan(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	/* write a code to return to trackloan page */
		
		return null;
	}

	private String loanUpdate(HttpServletRequest request, HttpServletResponse response) throws SQLException
	{
	Process process = new Process();
	/* process.setLoanStatus(request.getParameter("status")); */
	process.setApplicationNumber(request.getParameter("applicationNumber"));
	process.setLoanName(request.getParameter("loanType"));
	process.setCustomerName(request.getParameter("customerName"));
	process.setLoanAmount(Float.parseFloat(request.getParameter("amountRequested")));
	process.setApplicationDate(request.getParameter("applicationDate"));
	//process.setTermPaymentAmount(Float.parseFloat(request.getParameter("term")));
	process.setBusinessStructure(request.getParameter("businessStructure"));
	process.setBillingIndicator(request.getParameter("billingIndicator"));		
	process.setTaxIndicator(request.getParameter("taxIndicator"));
	process.setAddress(request.getParameter("address"));
	process.setEmail(request.getParameter("email"));
	process.setMobile(request.getParameter("mobile"));
	
	
	
	
	boolean status = new  ProcessDao().loanUpdate(connDao,process);
	if(status == true) {
		return "adminhome1.jsp";
} else {			
	return "errorPage.jsp";
}}

	
	static String extractPostRequestBody(HttpServletRequest request) {
	    if ("POST".equalsIgnoreCase(request.getMethod())) {
	        Scanner s = null;
	        try {
	            s = new Scanner(request.getInputStream(), "UTF-8").useDelimiter("\\A");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return s.hasNext() ? s.next() : "";
	    }
	    return "";
	}
}