<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.iiht.evaluation.eloan.dto.ProcessDto" %>
<%@page language="java" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display All Loans</title>
</head>
<body>

<jsp:include page="header.jsp"/>
<div align="right"><a href="index.jsp">Logout</a></div>
<div align="right"><a href="adminhome1.jsp">Admin Home</a></div>
	<table border="1" width="303">
		<tr>
			<td width="130"><b>APPLICATION NUMBER</b></td>
			<td width="130"><b>LOAN NAME</b></td>
			<td width="130"><b>LOAN AMOUNT</b></td>
			<td width="130"><b>AMOUNT SANCTIONED</b></td>
			<td width="130"><b>BUSINESS STRUCTURE</b></td>
			<td width="130"><b>TERM</b></td>
			<td width="130"><b>LOAN STATUS</b></td>
			<td width="130"><b>EMI</b></td>
			<td width="130"><b>TAX INDICATOR</b></td>
			<td width="130"><b>INTEREST RATE</b></td>
			<td width="130"><b>BILLING INDICATOR</b></td>
			<td width="130"><b>ADDRESS</b></td>
			<td width="130"><b>MOBILE</b></td>
			<td width="130"><b>PAYMENT START DATE</b></td>
			<td width="130"><b>CLOSURE DATE</b></td>
		</tr>
 		<%
			List<ProcessDto> data = (List<ProcessDto>) request.getAttribute("data");
 		//String address ="";

		for (int a = 0; a < data.size(); a++) {
		%>
		<tr>
			<td width="119"><%=data.get(a).getApplicationNumber()%></td>			
			<td width="119"><%=data.get(a).getLoanType()%></td>
			<td width="119"><%=data.get(a).getLoanAmount() %></td>
			<td width="119"><%=data.get(a).getAmountSanctioned()%></td>
			<td width="119"><%=data.get(a).getBusinessStructure()%></td>	
			<td width="119"><%=data.get(a).getTerm() %></td>
			<td width="119"><%=data.get(a).getLoanStatus() %></td>
			<td width="119"><%=data.get(a).getEmi()%></td>
			<td width="119"><%=data.get(a).getTaxIndicator() %></td>
			<td width="119"><%=data.get(a).getBillingIndicator()%></td>
			<td width="119"><%=data.get(a).getAddress() %></td>
			<td width="119"><%=data.get(a).getMobile() %></td>
			<td width="119"><%=data.get(a).getEmail() %></td>
			<td width="119"><%=data.get(a).getPayStartDate() %></td>			
			<td width="119"><%=data.get(a).getClosureDate() %></td>			
			
			
			<%-- <%= address = data.get(a).getAddress()%> --%>
		</tr>
		
		<%
			}
		%> 
	
	</table>
	<jsp:include page="header.jsp"/>
	<%-- <input type="text" name="address" value="<%= address%>"> --%>
</body>
</html>