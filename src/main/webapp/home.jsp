<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, com.prodapt.proj.travel.customer.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="add-customer.jsp">Add More Customers</a>
	<h1>All Customers</h1>
	<% 
		List<Customer> customers = (List<Customer>) request.getAttribute("customers");
		for(Customer c : customers) {
	%>
		<%= c.getId() %> - <%= c.getUsername() %> - <%= c.getCity() %> <br/>
	<% } %>
</body>
</html>