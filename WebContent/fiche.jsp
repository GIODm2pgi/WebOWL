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
					class="titre">Fiche du musée</span>
			</h2>

			<c:choose>
				<c:when test="${fiche.nm != null}">
					<p class="description">
						<img class="paragraph-icon" src="img/museum.png" />Musée :
						${fiche.nm}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.nr != null}">
					<p class="description">
						<img class="paragraph-icon" src="img/region.png" />Région :
						${fiche.nr}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.nd != null}">
					<p class="description">
						<img class="paragraph-icon" src="img/departement.png" />Département :
						${fiche.nd}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.nv != null}">
					<p class="description">
						<img class="paragraph-icon" src="img/ville.png" />Ville :
						${fiche.nv}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.nru != null}">
					<p class="description">
						<img class="paragraph-icon" src="img/ville.png" />Rue :
						${fiche.nru}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.nth != null}">
					<p class="description">
						<img class="paragraph-icon" src="img/theme.png" />Thème :
						${fiche.nth}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.hov != null}">
					<p class="description">
						<img class="paragraph-icon" src="img/date.png" />Horaire
						d'ouverture :
						${fiche.hov}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.rov != null}">
					<p class="description">
						<img class="paragraph-icon" src="img/date.png" />Date de réouverture :
						${fiche.rov}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.fan != null}">
					<p class="description">
						<img class="paragraph-icon" src="img/date.png" />Date de fermeture annuelle :
						${fiche.fan}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.pno != null}">
					<p class="description">
						<img class="paragraph-icon" src="img/date.png" />Période nocturne :
						${fiche.pno}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.swe != null}">
					<p class="description">
						<img class="paragraph-icon" src="img/website.png" />Site Web :
						${fiche.swe}
					</p>
				</c:when>
			</c:choose>

			<p class="btn-retour">
				<a href=javascript:history.go(-1)>RETOUR</a>
			</p>

		</div>

		<div id="corps-bot"></div>
	</div>
</body>
</html>