<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="com.prodapt.proj.travel.customer.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="add-customer.jsp">Add More Customers</a>
	<h1>All Customers</h1>

	<c:forEach var="cust" items="${customers}">
		<div>
			${cust.id } - ${cust.username } - ${cust.city}
		</div>
	</c:forEach>
</body>
</html>