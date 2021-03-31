<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Index</title>
</head>
<body>
<h1>Dojo Survey Results</h1>
<c:set var="result" value="${ result }"/>
<p><strong>Name:</strong> <c:out value="${ result.getName() }"/></p>
<p><strong>Location</strong> <c:out value="${ result.getLocation() }"/></p>
<p><strong>Language</strong> <c:out value="${ result.getLanguage() }"/></p>
<p><strong>Comment</strong> <c:out value="${ result.getComment() }"/></p>
</body>
</html>