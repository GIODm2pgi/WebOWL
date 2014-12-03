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
			<div id="gmap-container">
			<h3>Localisation du musée</h3>
				<div id="gmap"></div>
			</div>
			<h2>
				<a href="index.jsp" title="Retour recherche"><img
					src="img/museum.png" title="icône musée" width="22px" /></a> <span
					class="titre">Fiche du musée</span>
			</h2>

			<c:choose>
				<c:when test="${fiche.nm != null}">
					<p class="description">
						<img class="info-icon" src="img/museum.png" />Nom : ${fiche.nm}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.nr != null}">
					<p class="description">
						<img class="info-icon full-opacity" src="img/region.png" />Région
						: ${fiche.nr}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.nd != null}">
					<p class="description">
						<img class="info-icon full-opacity" src="img/departement.png" />Département
						: ${fiche.nd}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.nv != null}">
					<p class="description">
						<img class="info-icon" src="img/ville.png" />Ville : <span
							id="city">${fiche.nv}</span>
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.nru != null}">
					<p class="description">
						<img class="info-icon" src="img/ville.png" />Rue : <span
							id="address">${fiche.nru}</span>
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.nth != null}">
					<p class="description">
						<img class="info-icon" src="img/theme.png" />Thème : ${fiche.nth}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.hov != null}">
					<p class="description">
						<img class="info-icon" src="img/date.png" />Horaire d'ouverture :
						${fiche.hov}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.rov != null}">
					<p class="description">
						<img class="info-icon" src="img/date.png" />Date de réouverture :
						${fiche.rov}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.fan != null}">
					<p class="description">
						<img class="info-icon" src="img/date.png" />Date de fermeture
						annuelle : ${fiche.fan}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.pno != null}">
					<p class="description">
						<img class="info-icon" src="img/date.png" />Période nocturne :
						${fiche.pno}
					</p>
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${fiche.swe != null}">
					<p class="description">
						<img class="info-icon" src="img/website.png" />Site Web :
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
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
	<script>
		$(function() {
			var geocoder = new google.maps.Geocoder();
			var request = {
				address : $("#address").text() + ", " + $("#city").text()
			}
			geocoder.geocode(request, function(results, status) {
				if (status == google.maps.GeocoderStatus.OK) {
					var center = results[0].geometry.location

					var mapOptions = {
						zoom : 15,
						center : center
					};
					var carte = new google.maps.Map(document
							.getElementById('gmap'), mapOptions);
					var marker = new google.maps.Marker({
						position : center,
						map : carte
					});
				}
			});
		});
	</script>
</body>
</html>