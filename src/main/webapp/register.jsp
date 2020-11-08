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
<hr/>
<div align=center>
	<h2>eLoan Login</h2>
	<form action="/eloan/user?action=registernewuser" method="post">
		<div>
			<div><label for="loginid">Enter user name</label> </div>
			<div><input type="text" id="loginid" name="username"> </div>
		</div>
		<div>
			<div><label for="password">Enter password</label> </div>
			<div><input type="text" id="password" name="password"> </div>
		</div>
		<div>
			<div><label for="username">Enter Full Name</label> </div>
			<div><input type="text" id="username" name="fullname"> </div>
		</div>
		<div>
			<div><input type="submit" value="Register"> </div>
		</div>
		<!-- <a action="user?action=registerNewUser">New User? register here</a> -->
	</form>
	</div>
	</div>
<hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>