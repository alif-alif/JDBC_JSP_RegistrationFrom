<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Register" method="post">
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="uname" /></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>

			<tr>
				<td>Phone</td>
				<td><input type="text" name="phone" /></td>
			</tr>

		</table>
		<input type="submit" value="Submit" />
	</form>

</body>
</html>