<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Loan Application</title>
</head>
<body>
<jsp:include page="header.jsp"/>
	<!-- read the application number to edit from user and send to 
	     user controller to edit info
	-->
	 <%
			String msg = (String)request.getAttribute("validate");	

		
%>
	<form action="/eloan/user?action=editloan" method="post">
	<div>
	<div align="right"><a href="index.jsp">Logout</a></div>
	<div align="right"><a href="userhome.jsp">User Home</a></div>
			<div><label for="AppNum">Enter Your Loan Application Number</label> </div>
			<div><input type="text" id="applicationNum" name="applicationNum"> </div>
			<input type="submit" value="View" />
		</div>
	</form>
 	<p><%=msg%></p> 
<jsp:include page="footer.jsp"/>
</body>
</html>