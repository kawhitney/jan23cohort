<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<header>
		<h1>Hello</h1>
	</header>
	<main>
		<h1>Fruit of the Day</h1>
		<h2><c:out value="${fruit}"/></h2>
		
		<% for(int i=0; i<4; i++){ %>
			<h2><%= i %></h2>
		<% } %>
	</main>
</body>
</html>