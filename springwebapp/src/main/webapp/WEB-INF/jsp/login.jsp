<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login here</h1>
<form:form action="details" modelAttribute="user">
Enter Id:<form:input path="id"/><br>
Enter Name:<form:input path="name"/><br>
Enter city:<form:input path="city"/><br>
<input type="submit" value="send">





</form:form>
</body>
</html>