<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="viewCustomer">

<input type="text" name="customerId">


		<table border="1">

			<tr>
				<td>Customer Name:</td>
				<td><input type="text" name="customerName"></td>
			</tr>

			<tr>
				<td>Customer Address:</td>
				<td><input type="text" name="customerAddress"></td>
			</tr>
			
			
			<tr>
				<td>Customer City:</td>
				<td><input type="text" name="customerCity"></td>
			</tr>


			<tr>
				<td>Customer PhoneNo:</td>
				<td><input type="text" name="customerPhoneNo"></td>
			</tr>
			
		</table>
<br>



<input type="submit">
</form>
</body>
</html>