<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page import="com.iiht.evaluation.eloan.dto.ProcessDto" %>
 <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Additional Details</title>
</head>
<body>

<jsp:include page="header.jsp"/>
 <!--
     Read the values from the admin servlet and cal emi and other details and send to
     to the same admin servlet to update the values in the database 
     
  -->  
  
  <%
			ProcessDto data = (ProcessDto) request.getAttribute("data");
  

  
 		

		
		%>
		<table border="1" width="303">
 
			<tr>
				<td>Application Number</td>
				<%-- <td><input type="Application Number" name="Application Number" value="<%=data.getAppNum()%>" /></td> --%>
				<td> <p> <%=data.getApplicationNumber()%></p></td>
			</tr>
				<tr>
				<td>Loan Name</td>
				<!-- <td><input type="Loan Name" name="Loan Name" /></td> -->
				<td> <p> <%=data.getLoanType()%></p>
			</tr>
			
				<tr>
				<td>Amount Requested</td>
				<!-- <td><input type="Amount Requested" name="Amount Requested" /></td> -->
				<td> <p> <%=data.getLoanAmount()%></p>
			</tr>
			
							
				<tr>
				<td>Application Date</td>
				<!-- <td><input type="Application Date" name="Application Date" /></td> -->
				<td> <p> <%=data.getApplicationDate()%></p>
			</tr>
			
				<tr>
				<td>Business Structure</td>
				<!-- <td><input type="Business Structure" name="Business Structure" /></td> -->
				<td> <p> <%if(data.getBusinessStructure().equals(0)) out.print("Individual");
                    else out.print("Organisation");%></p></td>
			</tr>
			
				<tr>
				<td>Billing Indicator</td>
				<!-- <td><input type="Billing Indicator" name="password" /></td> -->
				<td> <p> <%=data.getBillingIndicator()%></p>
			</tr>
			
				<tr>
				<td>Tax Indicator</td>
				<!-- <td><input type="Tax Indicator" name="password" /></td> -->
				<td> <p> <%=data.getTaxIndicator()%></p>
			</tr>
			
				<tr>
				<td>Address</td>
				<!-- <td><input type="Address" name="Address" /></td> -->
				<td> <p> <%=data.getAddress()%></p>
			</tr>
			
				<tr>
				<td>Email</td>
				<!-- <td><input type="Email" name="Email" /></td> -->
				<td> <p> <%=data.getEmail()%></p>
			</tr>
			
				<tr>
				<td>Mobile</td>
				<!-- <td><input type="Mobile" name="Mobile" /></td> -->
				<td> <p> <%=data.getMobile()%></p>
			</tr>
			
			<tr>
				<td>Status</td>
				<%-- <td><input type="Status" name="Status" 	value="<%=if(data.getStatus()==0){"Un-approved"}else {"approved"}%>"/> --%>
				
				
				<td><%-- <input type="status" name="status"
value="<%if(data.getStatus().equals(0)) out.print("Approved");
                    else out.print("Not Approved");%>" />
                    <td> --%>
                     <p> <%=data.getLoanStatus()%></p>
				  </td>
				
			</tr>
			
						
				<tr>
				</table>
				<form action="/eloan/admin?action=updatestatus" method="post">
				<p><b>Fulfill the application</b> </p>
				<p>Furnish below information if the loan is Sanctioned</p>
				<table border="1" width="303">
					<tr>
				<td>Application Number</td>
				<td><input type="number" name="applicationNumber" value="<%=data.getApplicationNumber()%>" readonly="readonly"/></td> 
				
			</tr>
				<td>Amount Sanctioned</td>
				<td><input type="number" name="amountSanctioned" min=0 /></td>
			</tr>
			
			</tr>
				<td>Interest Rate</td>
				<td><input type="number" name="interest" min=0 step="any"/></td>
			</tr>
			<tr>
				<td>Status</td>
				<td><select name="status">
    <option value="Approved">Approved</option>
    <option value="Rejected">Rejected</option>
  
  </select></td>
				
  

			</tr>
			<tr>
			<tr>
				<td>Term</td>
				<td><input type="number" name="term" min=0/></td>
			</tr>
			<tr>
				<td>Payment Start Date</td>
				<td><input type="date" name="paymentStartDate" /></td>
			</tr>
			<tr>
				<td>Loan Closure Date</td>
				<td><input type="date" name="loanClosureDate" /></td>
			</tr>
			<tr>
				<td>EMI</td>
				<td><input type="number" name="emi" min=0 /></td>
			</tr>
			
		</table>
		<input type="submit" value="Update" />
		
		<a href="admin?action=process">Cancel</a>

	</form>
	
	<jsp:include page="footer.jsp"/>

</body>
</html>