<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
	<!-- write html code to read the application number and send to usercontrollers'
             displaystatus method for displaying the information
	-->
	
	<div align=center>
	<h2>Track Your Loan Application</h2>
	<hr/>
	<form action="user?action=displaystatus" method="post">
		<div>
		<br/>
			<div><label for="Loan_App_Number">Enter Your Loan Application Number</label> </div>
			<br/>
			<div><input type="text" id="LoanAppNum" name="LoanAppNum"> </div>
		</div>
		<div>
		<br/>
			<div><input type="submit" value="Submit"> </div>
		</div>
	</form>
	</div>
<jsp:include page="footer.jsp"/>
</body>
</html>