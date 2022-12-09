<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose</title>
</head>
<body>
	<form action="emailSender" method="post">
		<pre>
			To <input type="text" name="email" value="${email}"/>
			Subject <input type="text" name="subject"/>
			<textarea name="content" rows="10" cols="60">
				
			</textarea>
			<input type="submit" value="send"/>
		</pre>
	</form>
	${msg}
</body>
</html>