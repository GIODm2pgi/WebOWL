<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
					class="titre">Liste des musées correspondants à votre
					recherche</span>
			</h2>
			<table>
				<c:choose>
					<c:when test="${ result.isEmpty() }">
						<tr>
							<td>Aucun résultat</td>
						</tr>
					</c:when>
					<c:otherwise>

						<c:forEach items="${result}" var="res">
							<tr>
								<td class="td-nom"><a title="Voir la fiche du musée" href="Fiche?id=${res.idm}">${res.nm}</a></td>
								<td><a title="Voir la fiche de la région" href="FicheRegion?name=${res.idr}">${res.nr}</a></td>
								<td>${res.nd}</td>
								<td>${res.nv}</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</table>

			<p class="btn-retour"><a href=javascript:history.go(-1)>RETOUR</a></p>

		</div>

		<div id="corps-bot"></div>
	</div>
</body>
</html>