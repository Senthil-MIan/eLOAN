<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Application Form</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
</head>
<body onload="myFunction()">
<jsp:include page="header.jsp"/>
<div align="right">
<% String user=request.getParameter("username");
out.print("Welcome, "+ user);%></div>

<!--
	write the html code to accept laon info from user and send to placeloan servlet
-->


<!--
	write the html code to accept laon info from user and send to placeloan servlet
	
-->

		<h2 align="center"> Your Loan Application</h2>
		<form action="user?action=placeloan" method="post">
		<table style="with: 50%">

 
			<tr>
				<td>Loan Type:</td>
				<td><select name="LoanType">
					  <option value="Mortgage">Home Loan</option>
					  <option value="Vehicle">Car Loan</option>
					</select></td>
			</tr>
			
			<tr>
				<td>Customer Name</td>
				<td><input type="text" id="customerName" name="customerName"></td>				
			</tr>
			
			<tr>
				<td>Loan Amount:</td>
				<td><input type="number" id="LoanAmount" name="LoanAmount" min=0 oninput="validity.valid||(value='');"></td>				
			</tr>
			
			
			<tr>
				<td>Application Date:</td>
				<td><input type="date" name="AppDate" id="AppDate"></td>				
			</tr>
			
			<tr>
				<td>Business Structure:</td>
				<td><select name="BusinessStructure">
					  <option value="Individual">Individual</option>
					  <option value="Organisation">Organisation</option>
					</select></td>
			</tr>
			
			<tr>
				<td>Billing Indicator:</td>
				<td><select name="BillingIndicator">
					  <option value="Salaried">Salaried</option>
					  <option value="NotSalaried">Not Salaried</option>
					</select></td>
			</tr>
			
			<tr>
				<td>Tax Indicator:</td>
				<td><select name="TaxIndicator">
					  <option value="Taxpayer">Taxpayer</option>
					  <option value="NonTaxPayer">Non Tax Payer</option>
					</select></td>
			</tr>
			
			<tr>
				<td>Address:</td>
				<td><input type="text" id="Address" name="Address"></td>				
			</tr>
			
			<tr>
				<td>Mobile Number:</td>
				<!-- <td><input type="tel" id="Mobile" name="Mobile"
				pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required>
				<small>Format: 123-456-7890</small>	</td>	 -->
				<td><input type="tel" id="Mobile" name="Mobile" maxlength="10"></td>
						
			</tr>
			
			
			<tr>
				<td>Email Id:</td>
				<td><input type="text" id="EmailId" name="EmailId"></td>				
			</tr>
			</table>
			<input type="submit" value="Submit">
			</form>	
			<jsp:include page="footer.jsp"/>
			</body>
</html>		
			
			
			
			
			
			
			
			
				
				
					
				
			
		
		





