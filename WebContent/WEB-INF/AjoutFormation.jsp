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
<input type="text" name="thème" placeholder="Entée le thème de laformation">
<select name="idLieu">
<c:forEach items="${Lieu}" var="Lieu">
<option value="${Lieu.idLieu}">${Lieu.villeLieu}</option>
</c:forEach>
</select>

<input type="submit" value="submit">

</form>


</body>
</html>