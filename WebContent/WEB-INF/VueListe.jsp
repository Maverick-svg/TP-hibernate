<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css" %></style>
<title>Insert title here</title>
</head>
<body>
<%@ include file="BarreMenu.jsp" %>
<h2>ici la liste</h2>
<c:forEach items="${formation}" var="formation"></c:forEach>
<h3>ID Formation : ${formation.id}</h3>
<h3>Thème Formation : ${formation.theme}</h3>


</body>
</html>