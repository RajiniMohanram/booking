<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add-customer.do" method="post">
		<div>
			<label>
				Enter the Customer Id: <input type="number" name="custId" />
			</label>
		</div>
		<div>
			<label>
				Enter the Customer Name: <input type="text" name="custName" />
			</label>
		</div>
		<div>
			<label>
				Enter the City: <input type="text" name="custCity" />
			</label>
		</div>
		<div>
			<input type="submit" value="Add Customer" />
			<input type="reset" value="Clear" />
		</div>
	</form>
</body>
</html>