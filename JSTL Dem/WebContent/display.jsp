<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--   <c:forEach items="${students}" var="s">
  ${s.name} <br/>
  
   </c:forEach>
 --%>
 
 <sql:setDataSource var="db" driver="com.mysql.jdbc.driver" url="jdbc:mysql://localhost:3306/jancy3" user="root" password="jerin"/>
 
 <sql:query var="rs" dataSource="${db}"> select *from student</sql:query>
 
 <c:forEach items="${rs}" var="stud">
    <br> <c:out value="${stud.studentID}"></c:out> : <c:out value="${stud.name}"></c:out> : <c:out value="${stud.age}"></c:out> : <c:out value="${stud.address}"></c:out>
    
 
 </c:forEach>
 
</body>
</html>