<%@page import="com.jancy.web.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>Customer Details</h2>
<body>
<% 
  Customer c1=(Customer)request.getAttribute("customer");
 // out.println(c1);


  %>
  

<table border="1">
	<tr>
		<td>Customer ID:</td>
		<td><%out.print(c1.getCustomerId()); %></td>
	</tr>

	<tr>
		<td>Customer Name:</td>
		<td><%= c1.getCustomerName() %></td>
	</tr>
	<tr>
		<td>Customer Address:</td>
		<td><%= c1.getCustomerAddress() %></td>
	</tr>
		<tr>
		<td>Customer City:</td>
		<td><%= c1.getCity() %></td>
	</tr>
		<tr>
		<td>Customer PhoneNo:</td>
		<td><%= c1.getPhone_no() %></td>
	</tr>
		<tr>
		<td>Customer CreatedDate:</td>
		<td><%= c1.getCreatedDate() %></td>
	</tr>
		<tr>
		<td>Customer CreatedBy:</td>
		<td><%= c1.getCreatedBy() %></td>
	</tr>
		<tr>
		<td>Customer UpdatedDate:</td>
		<td><%= c1.getUpdatedDate() %></td>
	</tr>
		<tr>
		<td>Customer UpdatedBy:</td>
		<td><%= c1.getUpdatedBy()  %></td>
	</tr>
	
	
	
	
	

</table>
</body>
</html>