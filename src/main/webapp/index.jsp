<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>eLoan system</title>
</head>
<body>
<jsp:include page="header.jsp"/>
	<form action="/eloan/user?action=validate" method="post">
		<table style="with: 50%">
 
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" /></td>
			</tr>
				<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>

		</table>
		<input type="submit" value="Login" />
	</form>
	<a href="/eloan/register.jsp">Click to Register</a>
	<jsp:include page="footer.jsp"/>
</body>

</html>