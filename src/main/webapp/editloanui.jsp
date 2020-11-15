<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.iiht.evaluation.eloan.dto.ProcessDto" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div align="right"><a href="index.jsp">Logout</a></div>
<div align="right"><a href="userhome.jsp">User Home</a></div>

<h2 align="center"> Edit Your Loan Application</h2>
		<form action="user?action=loanUpdate" method="post">
		
<%
			ProcessDto data = (ProcessDto) request.getAttribute("data");	

		
%>	
		<table border="1" width="303">
 
			<tr>
				<td>Application Number</td>
				 <td><input type="Application Number" name="applicationNumber" value="<%=data.getApplicationNumber()%>" readonly="readonly"/></td> 
				<%-- <td> <p> <%=data.getAppNum()%></p></td> --%>
			</tr>
			
			<tr>
				<td>Loan Type:</td>
				<td><select name="loanType">
					  <%-- <option value="old"><%=data.getLoanName()%></option> --%>
					  <!-- <option value="Mortgage">Home Loan</option> -->
					  
					  <option value="Mortgage" <%if(data.getLoanType().equals("Home Loan")) out.print("selected"); %>>Home Loan</option>
					  
					  <option value="Vehicle" <%if(data.getLoanType().equals("Car Loan")) out.print("selected"); %>>Car Loan</option>
					  
					</select></td>
			</tr>
				<tr>
				<td>Customer Name</td>
				 <td><input type="text" name="customerName" value="<%=data.getCustomerName()%>" /></td> 
				<%-- <td> <p> <%=data.getLoanName()%></p> --%>
			</tr>
			
				<tr>
				<td>Amount Requested</td>
				<td><input type="number" name="amountRequested" value="<%=data.getLoanAmount()%>" min=0/></td>
				<%-- <td> <p> <%=data.getAmountRequested()%></p> --%>
			</tr>
			
							
				<tr>
				<td>Application Date</td>
				<td><input type="date" name="applicationDate" value="<%=data.getApplicationDate()%>" /></td> 
				<%-- <td> <p> <%=data.getApplicationDate()%></p> --%>
			</tr>
			
			<tr>
			<td>Business Structure</td>
				<td><select name="businessStructure">
					  <%-- <option value="old"><%=data.getLoanName()%></option> --%>
					  <!-- <option value="Mortgage">Home Loan</option> -->
					  
					  <option value="Individual" <%if(data.getLoanType().equals("Individual")) out.print("selected"); %>>Individual</option>
					  
					  <option value="Organisation" <%if(data.getLoanType().equals("Organisation")) out.print("selected"); %>>Organisation</option>
					  
					</select></td></tr>
					
					<tr>
			<td>Billing Indicator</td>
				<td><select name="billingIndicator">
					  <%-- <option value="old"><%=data.getLoanName()%></option> --%>
					  <!-- <option value="Mortgage">Home Loan</option> -->
					  
					  <option value="Salaried" <%if(data.getLoanType().equals("Salaried")) out.print("selected"); %>>Salaried</option>
					  
					  <option value="NotSalaried" <%if(data.getLoanType().equals("NotSalaried")) out.print("selected"); %>>NotSalaried</option>
					  
					</select></td></tr>
			
			<tr>
			<td>Tax Indicator</td>
				<td><select name="taxIndicator">
					  <%-- <option value="old"><%=data.getLoanName()%></option> --%>
					  <!-- <option value="Mortgage">Home Loan</option> -->
					  
					  <option value="TaxPayer" <%if(data.getLoanType().equals("TaxPayer")) out.print("selected"); %>>TaxPayer</option>
					  
					  <option value="NonTaxPayer" <%if(data.getLoanType().equals("NonTaxPayer")) out.print("selected"); %>>NonTaxPayer</option>
					  
					</select></td></tr>
			
				
			
				
				<tr>
				<td>Address</td>
				 <td><input type="text" name="address" value="<%=data.getAddress()%>"/></td> 
				<%-- <td> <p> <%=data.getAddress()%></p> --%>
			</tr>
			
				<tr>
				<td>Email</td>
				<td><input type="text" name="email" value=" <%=data.getEmail()%>"/></td> 
				<%-- <td> <p> <%=data.getEmail()%></p> --%>
			</tr>
			
				<tr>
				<td>Mobile</td>
				 <td><input type="number" name="mobile" value="<%=data.getMobile()%>" /></td> 
				<%-- <td> <p> <%=data.getMobile()%></p> --%>
			</tr>
			</table>
			<input type="submit" value="Submit">
			</form>
<jsp:include page="footer.jsp"/>
</body>
</html>