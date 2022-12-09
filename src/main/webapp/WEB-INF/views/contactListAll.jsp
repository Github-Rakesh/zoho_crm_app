<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact List</title>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Source</th>
				<th>Delete</th>
				<th>billing</th>
			</tr>
			<c:forEach var="leads" items="${list}">
				<tr>
					<td><a href="contactInfo?id=${leads.id}">${leads.firstName}</a></td>
					<td>${leads.lastName}</td>
					<td>${leads.email}</td>
					<td>${leads.mobile}</td>
					<td>${leads.source}</td>
					<td><a href="deleteContactLead?id=${leads.id}">delete</a></td>
					<td><a href="billingContact?id=${leads.id}">billing</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>