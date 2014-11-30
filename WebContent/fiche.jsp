<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="fr">
<head>
<meta charset="utf-8">
<title>TrouverUnMusée.fr - Trouver un musée en France par thème,
	par région, par date, etc ...</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div id="header" onclick="window.location.href = 'index.jsp';">
		<h1 class="display-none">TrouverUnMusée.fr - Trouver un musée en
			France par thème, par région, par date, etc ...</h1>
	</div>
	<div id="corps">
		<div id="corps-top"></div>
		<div id="corps-center">
			<h2>
				<a href="index.jsp" title="Retour recherche"><img
					src="img/museum.png" title="icône musée" width="22px" /></a> <span
					class="titre">Fiche du musée</span>
			</h2>

			<%=request.getAttribute("table")%>

			<p class="btn-retour">
				<a href=javascript:history.go(-1)>RETOUR</a>
			</p>

		</div>

		<div id="corps-bot"></div>
	</div>
</body>
</html>