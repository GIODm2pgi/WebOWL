<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
					class="titre">Fiche de la région (DBpedia)</span>
			</h2>

			<c:choose>
				<c:when test="${fiche.resume == null}">
					<table>
						<tr>
							<td class="td-nom">Informations non disponibles pour cette
								région.</td>
						</tr>
					</table>
				</c:when>
				<c:otherwise>
					<p class="description">
						<img class="info-icon" src="img/label.png" />Nom : ${fiche.nom}
					</p>
					<p class="description">
						<img class="paragraph-icon" src="img/resume.png" />Description : ${fiche.resume}</p>
					<p class="description">
						<img class="info-icon" src="img/website.png" />Site web : <a
							href="${fiche.website}">${fiche.website}</a>
					</p>
					<p class="description">
						<img class="info-icon" src="img/capital.png" />Préfecture :
						${fiche.capital}
					</p>
					<p class="description">
						<img class="info-icon" src="img/population.png" />Population :
						${fiche.population} hab.
					</p>
					<p class="description">
						<img class="info-icon" src="img/area.png" />Superficie :
						${fiche.area} km²
					</p>
				</c:otherwise>
			</c:choose>

			<p class="btn-retour">
				<a href=javascript:history.go(-1)>RETOUR</a>
			</p>

		</div>

		<div id="corps-bot"></div>
	</div>
</body>
</html>