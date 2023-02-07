<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">Home</a><br/><br/>
<form action="addAccount">
		<table border="1">
			<tr>
				<td>Account ID:</td>
				<td><input type="text" name="account_Id"></td>
			</tr>

			<tr>
				<td>Customer Id:</td>
				<td><input type="text" name="customer_Id"></td>
			</tr>
			
			<tr>
			<td>Account Balance:</td>
			<td><input type="text" name="account_balance"></td>
			</tr>
		</table>
<br>
<input type="submit">
</form>




</body>
</html>