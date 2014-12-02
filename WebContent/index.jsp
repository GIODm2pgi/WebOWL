<%@page import="jena.StaticRDV"%>
<%@page import="jena.RequêteMusée"%>
<%@page import="jena.MuséeOwl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="fr">
<head>
<meta charset="utf-8">
<title>TrouverUnMusée.fr - Trouver un musée en France par thème,
	par région, par date, etc ...</title>
<link rel="stylesheet" href="style.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">

<script>
<%MuséeOwl.setModel(getServletContext().getResourceAsStream(
					"/data/musee.owl"));%>
	$(function() {
		var availableTagsRegions = [];
		<%for (int i = 0; i < StaticRDV.getRégions().size(); i++) {%>
		availableTagsRegions[<%=i%>] = "<%=StaticRDV.getRégions().get(i)%>"; 
		<%}%>
		var availableTagsDeps = [];
		<%for (int i = 0; i < StaticRDV.getDépartements().size(); i++) {%>
		availableTagsDeps[<%=i%>] = "<%=StaticRDV.getDépartements().get(i)%>"; 
		<%}%>
		var availableTagsVilles = [];
		<%for (int i = 0; i < StaticRDV.getVilles().size(); i++) {%>
		availableTagsVilles[<%=i%>] = "<%=StaticRDV.getVilles().get(i)%>
	";
<%}%>
	$("#region").autocomplete(
				{
					source : function(request, response) {
						var results = $.ui.autocomplete.filter(
								availableTagsRegions, request.term);
						response(results.slice(0, 10));
					}
				});
		$("#dep").autocomplete(
				{
					source : function(request, response) {
						var results = $.ui.autocomplete.filter(
								availableTagsDeps, request.term);
						response(results.slice(0, 10));
					}
				});
		$("#ville").autocomplete(
				{
					source : function(request, response) {
						var results = $.ui.autocomplete.filter(
								availableTagsVilles, request.term);
						response(results.slice(0, 10));
					}
				});
	});
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
					class="titre">Bienvenue sur TrouverUnMusée.fr</span>
			</h2>
			<p class="description">Cette application vous permet de trouver
				des musées en France Métropolitaine et dans les DOM-TOM en
				fournissant divers critères de recherches comme une région, un
				département, une ville, ou encore un thème.</p>

			<h2>
				<a href="index.jsp" title="Retour recherche"><img
					src="img/museum.png" title="icône musée" width="22px" /></a> <span
					class="titre">Recherche de musées</span>
			</h2>

			<form action="Recherche">
				<p class="note">Note : si vous renseignez plusieurs champs de
					localisation (region, département et ville), le résultat sera
					l'ensemble des musées respectants au moins un des critères.</p>
				<p>
				<p>
					<img class="img-search opacity-8" width="32px" src="img/label.png"
						title="Nom" /> <label for="nom">Nom : </label><input type="text"
						id="nom" autocomplete="off" name="nom" placeholder="Nom" />
				</p>
				<p>
					<img class="img-search" width="32px" src="img/region.png"
						title="Région" /> <label for="region">Région : </label><input
						type="text" id="region" autocomplete="off" name="region"
						placeholder="Région" />
				</p>
				<p>
					<img class="img-search" width="32px" src="img/departement.png"
						title="Département" /> <label for="dep">Département : </label><input
						type="text" id="dep" name="dep" autocomplete="off"
						placeholder="Département" />
				</p>
				<p>
					<img class="img-search img-opacity" width="32px"
						src="img/ville.png" title="Ville" /> <label for="ville">Ville
						: </label><input type="text" id="ville" autocomplete="off" name="ville"
						placeholder="Ville" />
				</p>
				<p>
					<img class="img-search img-opacity" width="32px"
						src="img/theme.png" title="Thème" /> <label for="theme">Thème
						: </label><input type="text" id="theme" autocomplete="off" name="theme"
						placeholder="Thème" />
				</p>
				<p>
					<input class="button-submit" type="submit" value="Recherche" />
				</p>
			</form>

		</div>

		<div id="corps-bot"></div>
	</div>
</body>
</html>