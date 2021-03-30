<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Secret Code</title>
</head>
<body>
<h1>What is the code?</h1>
<form method="POST" action="/code">
	<span><c:out value="${ error }" /></span>
    <label><input type="text" name="code"></label>
    <button>Try Code</button>
</form>
</body>
</html>