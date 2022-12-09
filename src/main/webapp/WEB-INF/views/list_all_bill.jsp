<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing List</title>
</head>
<body>
	<h2>Billing List</h2>
	<form action="">
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Product</th>
				<th>Amount</th>	
				<th>Delete</th>
			</tr>
			<c:forEach var="bills" items="${bill}">
				<tr>
					<td>${bills.firstName}</td>
					<td>${bills.lastName}</td>
					<td>${bills.email}</td>
					<td>${bills.mobile}</td>
					<td>${bills.product}</td>
					<td>${bills.amount}</td>
					<td><a href="deleteBill?id=${bills.id}">delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>