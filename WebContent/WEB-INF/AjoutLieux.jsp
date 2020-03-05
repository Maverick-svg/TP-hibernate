<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css" %></style>
<title>Ajout Formation</title>
</head>
<body>
<%@ include file="BarreMenu.jsp" %>

<h2>Ajout de la nouvelle formation</h2>
<form action="/FormationHibernate/AjoutServlet" method="post">
<input type="text" name="ville" placeholder="Entée le nom de la ville">
<
<input type="submit" value="submit">

</form>


</body>
</html>