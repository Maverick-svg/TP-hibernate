<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css" %></style>
<title>Formation</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Home</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="/FormationHibernate/AjoutServlet">Ajouter Formation</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/FormationHibernate/ListeServlet">Liste formation</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/FormationHibernate/AjoutLieuServlet">Ajouter Lieu</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/FormationHibernate/LissLieuxServlet">lister Lieu</a>
      </li>
    </ul>
  </div>
</nav>
</body>
</html>