<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- write the code to read application number, and send it to admincontrollers
	     callemi method to calculate the emi and other details also provide links
	     to logout and admin home page
	-->
	<jsp:include page="header.jsp"/>
	<form action="/eloan/admin?action=callemi" method="post">
	<div>
	<div align="right"><a href="index.jsp">Logout</a></div>
	<div align="right"><a href="adminhome1.jsp">Admin Home</a></div>
			<div><label for="AppNum">Enter loan application number</label> </div>
			<div><input type="text" id="applicationNum" name="applicationNum"> </div>
			<input type="submit" value="Load" />
		</div>
	</form>

</body>
</html>