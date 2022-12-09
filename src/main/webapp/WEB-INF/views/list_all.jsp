<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All</title>
</head>
<body>
	<a href="createLeadPage">Create New Leads</a>
	<h2>All Customers Details</h2>
	<form action="">
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Source</th>
				<th>Delete</th>
			</tr>
			
			<c:forEach var="leads" items="${list}">
				<tr>
					<td><a href="leadInfo?id=${leads.id}">${leads.firstName}</a></td>
					<td>${leads.lastName}</td>
					<td>${leads.email}</td>
					<td>${leads.mobile}</td>
					<td>${leads.source}</td>
					<td><a href="deleteLead?id=${leads.id}">delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>