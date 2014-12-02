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

<script>
	function updateQueryStringParameter(uri, key, value) {
		var re = new RegExp("([?&])" + key + "=.*?(&|$)", "i");
		var separator = uri.indexOf('?') !== -1 ? "&" : "?";
		if (uri.match(re)) {
			return uri.replace(re, '$1' + key + "=" + value + '$2');
		} else {
			return uri + separator + key + "=" + value;
		}
	}
	function sort(id, sens) {
		var url = updateQueryStringParameter(window.location.href, 'sort', id);
		url = updateQueryStringParameter(url, 'sort_sens', sens);
		window.location.href = url;
	}
</script>
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
				<tr class="entete">
					<c:choose>
						<c:when test="${sort.equals('nm') and sort_sens.equals('ASC')}">
							<td class="td-nom">Nom du musée <img
								onclick="sort('nm','DESC')" class="sort" src="img/sort.png" /></td>
						</c:when>
						<c:when test="${sort.equals('nm') and sort_sens.equals('DESC')}">
							<td class="td-nom">Nom du musée <img
								onclick="sort('nm','ASC')" class="sort-reverse"
								src="img/sort.png" /></td>
						</c:when>
						<c:otherwise>
							<td class="td-nom">Nom du musée <img
								onclick="sort('nm','ASC')" class="sort-no" src="img/sort.png" /></td>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${sort.equals('nr') and sort_sens.equals('ASC')}">
							<td>Région <img onclick="sort('nr','DESC')" class="sort"
								src="img/sort.png" /></td>
						</c:when>
						<c:when test="${sort.equals('nr') and sort_sens.equals('DESC')}">
							<td>Région <img onclick="sort('nr','ASC')"
								class="sort-reverse" src="img/sort.png" /></td>
						</c:when>
						<c:otherwise>
							<td>Région <img onclick="sort('nr','ASC')" class="sort-no"
								src="img/sort.png" /></td>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${sort.equals('nd') and sort_sens.equals('ASC')}">
							<td>Département <img onclick="sort('nd','DESC')"
								class="sort" src="img/sort.png" /></td>
						</c:when>
						<c:when test="${sort.equals('nd') and sort_sens.equals('DESC')}">
							<td>Département <img
								onclick="sort('nd','ASC')" class="sort-reverse"
								src="img/sort.png" /></td>
						</c:when>
						<c:otherwise>
							<td>Département <img onclick="sort('nd','ASC')"
								class="sort-no" src="img/sort.png" /></td>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${sort.equals('nv') and sort_sens.equals('ASC')}">
							<td>Ville <img onclick="sort('nv','DESC')" class="sort"
								src="img/sort.png" /></td>
						</c:when>
						<c:when test="${sort.equals('nv') and sort_sens.equals('DESC')}">
							<td>Ville <img onclick="sort('nv','ASC')"
								class="sort-reverse" src="img/sort.png" /></td>
						</c:when>
						<c:otherwise>
							<td>Ville <img onclick="sort('nv','ASC')" class="sort-no"
								src="img/sort.png" /></td>
						</c:otherwise>
					</c:choose>
				</tr>
				<c:choose>
					<c:when test="${result.isEmpty()}">
						<tr>
							<td>Aucun résultat</td>
						</tr>
					</c:when>
					<c:otherwise>

						<c:forEach items="${result}" var="res">
							<tr>
								<td class="td-nom"><a title="Voir la fiche du musée"
									href="Fiche?id=${res.idm}">${res.nm}</a></td>
								<td><a title="Voir la fiche de la région"
									href="FicheRegion?name=${res.idr}">${res.nr}</a></td>
								<td>${res.nd}</td>
								<td>${res.nv}</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</table>

			<p class="btn-retour">
				<a href=javascript:history.go(-1)>RETOUR</a>
			</p>

		</div>

		<div id="corps-bot"></div>
	</div>
</body>
</html>