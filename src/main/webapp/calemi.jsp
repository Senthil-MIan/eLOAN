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
  <form action="/eloan/admin?action=validate" method="post">
  <%
			ProcessDto data = (ProcessDto) request.getAttribute("data");
 		

		
		%>
		<table border="1" width="303">
 
			<tr>
				<td>Application Number</td>
				<%-- <td><input type="Application Number" name="Application Number" value="<%=data.getAppNum()%>" /></td> --%>
				<td> <p> <%=data.getAppNum()%></p>
			</tr>
				<tr>
				<td>Loan Name</td>
				<td><input type="Loan Name" name="Loan Name" /></td>
			</tr>
			
				<tr>
				<td>Amount Requested</td>
				<td><input type="Amount Requested" name="Amount Requested" /></td>
			</tr>
			
				<tr>
				<td>Loan Name</td>
				<td><input type="Loan Name" name="Loan Name" /></td>
			</tr>
			
				<tr>
				<td>Application Date</td>
				<td><input type="Application Date" name="Application Date" /></td>
			</tr>
			
				<tr>
				<td>Business Structure</td>
				<td><input type="Business Structure" name="Business Structure" /></td>
			</tr>
			
				<tr>
				<td>Billing Indicator</td>
				<td><input type="Billing Indicator" name="password" /></td>
			</tr>
			
				<tr>
				<td>Tax Indicator</td>
				<td><input type="Tax Indicator" name="password" /></td>
			</tr>
			
				<tr>
				<td>Address</td>
				<td><input type="Address" name="Address" /></td>
			</tr>
			
				<tr>
				<td>Email</td>
				<td><input type="Email" name="Email" /></td>
			</tr>
			
				<tr>
				<td>Mobile</td>
				<td><input type="Mobile" name="Mobile" /></td>
			</tr>
			
				<tr>
				<td>Status</td>
				<td><input type="Status" name="Status" /></td>
			</tr>
			
				<tr>
				<td>Amount Sanctioned</td>
				<td><input type="Amount Sanctioned" name="Amount Sanctioned" /></td>
			</tr>
			<tr>
				<td>Term</td>
				<td><input type="Term" name="Term" /></td>
			</tr>
			<tr>
				<td>Payment Start Date</td>
				<td><input type="Payment Start Date" name="Payment Start Date" /></td>
			</tr>
			<tr>
				<td>Loan Closure Date</td>
				<td><input type="Loan Closure Date" name="Loan Closure Date" /></td>
			</tr>
			<tr>
				<td>EMI</td>
				<td><input type="EMI" name="EMI" /></td>
			</tr>
			
		</table>
		<input type="submit" value="Update" />
		
	</form>
	<jsp:include page="footer.jsp"/>

</body>
</html>