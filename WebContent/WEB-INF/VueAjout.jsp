<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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

<h2>Ici l'ajout</h2>
<form action="/FormationHibernate/AjoutServlet" method="post">
<input type="text" name="Theme" placeholder="chosir thème de la formation">

<input type="button" value="submit">

</form>


</body>
</html>