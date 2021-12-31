<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#FBFCFC">
<h1 > Login here</h1>
<form:form action="details" modelAttribute="user">
Enter UserName:<form:input path="username"/><br>
Enter Password:<form:password path="password"/>
<input type="submit" value="login">




</form:form>

</body>
</html>