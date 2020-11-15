<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ page import="com.iiht.evaluation.eloan.dto.ProcessDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Status</title>
</head>
<body>
	<!-- write the code to display the loan status information 
	     received from usercontrollers' displaystatus method
	-->
	<h2>Your Loan Status</h2>
		<div align="left"><a href="userhome.jsp">Back</a></div>
		<div align="right"><a href="index.jsp">Logout</a></div>
	<!-- write the code to display the loan status information 
	     received from usercontrollers' displaystatus method
	-->
	
	 <%
			ProcessDto data = (ProcessDto) request.getAttribute("data");
  	
		%>
	<table border="1" width="303">
 
			<tr>
				<td>Status</td>
				<%-- <td><input type="Application Number" name="Application Number" value="<%=data.getAppNum()%>" /></td> --%>
				<td> <p> <%=data.getLoanStatus()%></p></td>
			</tr>
</body>
</html>