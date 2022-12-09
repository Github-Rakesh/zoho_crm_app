<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead Page</title>
</head>
<body>
	<h2>Create New Lead Here</h2>
	<form action="saveNewLead" method="post">
		<pre>
			First Name <input type="text" name="firstName"/>
			Last Name <input type="text" name="lastName"/>
			Email <input type="email" name="email"/>
			Mobile <input type="number" name="mobile"/>
			Source : 
			<select name="source">
			  <option value="radio">Radio</option>
			  <option value="news paper">News Paper</option>
			  <option value="trade show">Trade Show</option>
			  <option value="website">Website</option>
			</select>
			<input type="submit" value="save"/>
		</pre>
	</form>
</body>
</html>