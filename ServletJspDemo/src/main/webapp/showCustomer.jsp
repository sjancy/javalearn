<%@page import="com.jancy.web.model.Customer1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<%

  Customer1 c1=(Customer1)session.getAttribute("customer");
  out.println(c1);

%>
</body>
</html>