<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="str" value="Jancy is learning Java"/>

Length: ${fn:length(str)}

<br>
<c:forEach items="${fn:split(str, ' ')}" var="s">

<br>
${s}

</c:forEach>

index : ${fn:indexOf(str,"is")}
<br>
is there : ${fn:contains(str,"Java")}
</body>
</html>