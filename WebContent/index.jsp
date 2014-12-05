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
		availableTagsVilles[<%=i%>] = "<%=StaticRDV.getVilles().get(i)%>";
		<%}%>
		$("#region1").autocomplete(
				{
					source : function(request, response) {
						var results = $.ui.autocomplete.filter(
								availableTagsRegions, request.term);
						response(results.slice(0, 10));
					}
				});
		$("#dep1").autocomplete(
				{
					source : function(request, response) {
						var results = $.ui.autocomplete.filter(
								availableTagsDeps, request.term);
						response(results.slice(0, 10));
					}
				});
		$("#ville1").autocomplete(
				{
					source : function(request, response) {
						var results = $.ui.autocomplete.filter(
								availableTagsVilles, request.term);
						response(results.slice(0, 10));
					}
				});
		// Région
		$(document).ready(function() {
		    var max_fields_region = 10;
		    var wrapper_region = $(".input_fields_wrap_region");
		    var add_button_region = $(".add_field_button_region");	   
		    var r = 1;
		    $(add_button_region).click(function(e){
		        e.preventDefault();
		        if(r < max_fields_region){
		            r++;
		            $(wrapper_region).append('<div><input type="text" id="region'+ r +'" placeholder="Région" name="region' + r +'"/><a href="#" class="remove_field_region">X</a></div>');
		            $("#compteurRegion").val(r) ;
		    		$("#region" + r).autocomplete(
		    				{
		    					source : function(request, response) {
		    						var results = $.ui.autocomplete.filter(
		    								availableTagsRegions, request.term);
		    						response(results.slice(0, 10));
		    					}
		    				});
		        }
		    });
		   
		    $(wrapper_region).on("click",".remove_field_region", function(e){
		        e.preventDefault(); $(this).parent('div').remove(); r--;
		    })
		});
		// Département
		$(document).ready(function() {
		    var max_fields_dep = 10;
		    var wrapper_dep = $(".input_fields_wrap_dep");
		    var add_button_dep = $(".add_field_button_dep");	   
		    var d = 1;
		    $(add_button_dep).click(function(e){
		        e.preventDefault();
		        if(d < max_fields_dep){
		            d++;
		            $(wrapper_dep).append('<div><input type="text" id="dep'+ d +'" placeholder="Département" name="dep' + d +'"/><a href="#" class="remove_field_dep">X</a></div>');
		            $("#compteurDep").val(d) ;
		            $("#dep" + d).autocomplete(
		    				{
		    					source : function(request, response) {
		    						var results = $.ui.autocomplete.filter(
		    								availableTagsDeps, request.term);
		    						response(results.slice(0, 10));
		    					}
		    				});
		        }
		    });
		   
		    $(wrapper_dep).on("click",".remove_field_dep", function(e){
		        e.preventDefault(); $(this).parent('div').remove(); d--;
		    })
		});
		// Ville
		$(document).ready(function() {
		    var max_fields_ville = 10;
		    var wrapper_ville = $(".input_fields_wrap_ville");
		    var add_button_ville = $(".add_field_button_ville");	   
		    var v = 1;
		    $(add_button_ville).click(function(e){
		        e.preventDefault();
		        if(v < max_fields_ville){
		            v++;
		            $(wrapper_ville).append('<div><input type="text" id="ville'+ v +'" placeholder="Ville" name="ville' + v +'"/><a href="#" class="remove_field_ville">X</a></div>');
		            $("#compteurVille").val(v) ;
		    		$("#ville" + v).autocomplete(
		    				{
		    					source : function(request, response) {
		    						var results = $.ui.autocomplete.filter(
		    								availableTagsVilles, request.term);
		    						response(results.slice(0, 10));
		    					}
		    				});
		        }
		    });
		   
		    $(wrapper_ville).on("click",".remove_field_ville", function(e){
		        e.preventDefault(); $(this).parent('div').remove(); v--;
		    })
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
					<img class="img-search opacity-75" width="32px" src="img/label.png"
						title="Nom" /><label for="nom">Nom : </label><input type="text"
						id="nom" autocomplete="off" name="nom" placeholder="Nom" />
				</p>
				<p>
					<img class="img-search" width="32px" src="img/region.png"
						title="Région" /><label for="region1">Région : </label> <span
						class="input_fields_wrap_region">
						<button class="add_field_button_region">+</button> <span> <input
							type="text" id="region1" name="region1" placeholder="Région" />
					</span>
					</span>
				</p>
				<p>
					<img class="img-search" width="32px" src="img/departement.png"
						title="Département" /> <label for="dep1">Département : </label> <span
						class="input_fields_wrap_dep">
						<button class="add_field_button_dep">+</button> <span> <input
							type="text" id="dep1" name="dep1" placeholder="Département" />
					</span>
					</span>
				</p>
				<p>
					<img class="img-search img-opacity" width="32px"
						src="img/ville.png" title="Ville" /> <label for="ville1">Ville
						: </label> <span class="input_fields_wrap_ville">
						<button class="add_field_button_ville">+</button> <span> <input
							type="text" id="ville1" name="ville1" placeholder="Ville" />
					</span>
					</span>
				</p>
				<p>
					<img class="img-search img-opacity" width="32px"
						src="img/theme.png" title="Thème" /> <label for="theme">Thème
						: </label><input type="text" id="theme" autocomplete="off" name="theme"
						placeholder="Thème" />
				</p>
				<p>
					<input type="hidden" id="compteurRegion" name="compteurRegion"
						value="1" /> <input type="hidden" id="compteurDep"
						name="compteurDep" value="1" /> <input type="hidden"
						id="compteurVille" name="compteurVille" value="1" /> <input
						class="button-submit" type="submit" value="Recherche" />
				</p>
			</form>

		</div>

		<div id="corps-bot"></div>
	</div>
</body>
</html>