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
	<div id="header">
		<h1 class="display-none">TrouverUnMusée.fr - Trouver un musée en
			France par thème, par région, par date, etc ...</h1>
	</div>
	<div id="corps">
		<div id="corps-top"></div>
		<div id="corps-center">
			<h2>
				<a href="index.html" title="Retour recherche"><img src="img/museum.png" title="icône musée" width="22px" /></a>
				<span class="titre">Liste des musées correspondants à votre recherche</span>
			</h2>
			
			<%= request.getAttribute("table") %>

		</div>

		<div id="corps-bot"></div>
	</div>
</body>
</html>