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

<h2> liste complète Des formations</h2>
<select>

<c:forEach items="${formation}" var="formation">
<h3>${formation.IdFormation }</h3>
<h3>${formation.theme }</h3>
<h3>${formation.lieu }</h3>
</c:forEach>
</select>
</body>
</html>