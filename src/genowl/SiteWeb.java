package genowl;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SiteWeb {

	public class Region {

		public String nom;
		public String[] deps;

		public Region (String n, String[] d){
			nom=n; deps=d;
		}

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Map<String,List<String>> regions = new HashMap<String, List<String>>();

		String tmp = "www.barr.fr\n" + 
				"www.betschdorf.fr/tourisme/visiter_betschdrof/musee_poterie.php\n" + 
				"www.musee-pays-hanau.webmuseo.com\n" + 
				"www.ville-haguenau.fr/pages/culture/musee.htm\n" + 
				"www.ville-haguenau.fr/pages/culture/musee.htm ou www.museumspass.com/dn_musees-haguenau/\n" + 
				"www.chartreuse-molsheim.info\n" + 
				"www.musee-niederbronn.fr\n" + 
				"www.pfaffenhoffen.org ou http://webmuseo.com/ws/musee-image-populaire/app/report/index.html\n" + 
				"www.lacastine.com\n" + 
				"http://www.louise weiss.org\n" + 
				"www.musees-strasbourg.eu\n" + 
				"www.musees-strasbourg.eu\n" + 
				"www.musees-strasbourg.eu\n" + 
				"www.musees-strasbourg.eu\n" + 
				"www.musees-strasbourg.eu\n" + 
				"www.musees-strasbourg.eu\n" + 
				"www.musees-strasbourg.eu\n" + 
				"www.musees-strasbourg.eu\n" + 
				"www.musees-strasbourg.eu\n" + 
				"www.musees-strasbourg.eu\n" + 
				"www.musee-oberlin.com\n" + 
				"www.musee-lalique.com\n" + 
				"www.musee-wissembourg.webmuseo.com ou www.ville-wissembourg.eu\n" + 
				"www.musee-woerth.webmuseo.com\n" + 
				"\n" + 
				"www.ville-biesheim.fr/museegr.html\n" + 
				"http://histoire-cernay.perso.sfr.fr ou www.musees-alsace.org\n" + 
				"www.ac-strasbourg.fr/microsites/MHN_COLMAR\n" + 
				"www.musee-unterlinden.com\n" + 
				"www.musee-bartholdi.com\n" + 
				"site de la ville ou www.tourisme68.asso.fr/musees/fr/mus12.1.html\n" + 
				"\n" + 
				"www.ville-kaysersberg.fr\n" + 
				"www.musee-du-vignoble-alsace.fr\n" + 
				"http://www.musees-mulhouse.fr/musee-des-beaux-arts/collections.html\n" + 
				"www.musees-mulhouse.fr/musee-historique/collections.html\n" + 
				"http://musee.spmulhouse.free.fr\n" + 
				"www.culturespaces.com\n" + 
				"\n" + 
				"www.edf.electropolis.mulhouse.museum\n" + 
				"www.collection-schlumpf.com\n" + 
				"www.musee-impression.com\n" + 
				"www.neuf-brisach.fr\n" + 
				"\n" + 
				"Site des musées d'Alsace\n" + 
				"www.museepapierpeint.org\n" + 
				"www.ville-thann.fr - http://www.genealogiethaznn.org\n" + 
				"www.ecomusee-alsace.com\n" + 
				"http://www.bergerac.fr/EspCulture/sitetabac/index.htm\n" + 
				"Site des musées aquitains\n" + 
				"Site des musées aquitains ou http://www.perigord-dronne-belle.fr\n" + 
				"\n" + 
				"\n" + 
				"www.musee-prehistoire-eyzies.fr\n" + 
				"\n" + 
				"www.museevoulgre.cjb.net\n" + 
				"Site des musées aquitains\n" + 
				"\n" + 
				"http://www.perigueux-maap.fr/\n" + 
				"www.vesunna.fr ou http://www.perigueux-vesunna.fr/\n" + 
				"\n" + 
				"Site des musées aquitains\n" + 
				"Site des musées aquitains\n" + 
				"\n" + 
				"Site des musées aquitains\n" + 
				"Site de la ville\n" + 
				"Site de la ville : www.bordeaux.fr\n" + 
				"www.mairie-bordeaux.fr\n" + 
				"www.capc-bordeaux.fr ou www.bordeaux.fr\n" + 
				"Site de la ville\n" + 
				"Site de la ville : www.bordeaux.fr\n" + 
				"Site de la ville -  www.mairie-bordeaux.fr\n" + 
				"Site des musées d'aquitaine\n" + 
				"\n" + 
				"www.musees-libourne.org\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"www.hydravions-biscarrosse.com\n" + 
				"http://www.dax.fr/musee-de-borda - Site des musées aquitains\n" + 
				"www.culture-commune.fr - www.arthous.landes.org/\n" + 
				"Site du parc - www.parc-landes-de-gascogne.fr\n" + 
				"www.mont-de-marsan.org/decouvrir/decouv_muse.html ou Site des musées aquitains\n" + 
				"www.museedelachalosse.fr\n" + 
				"Site du parc - www.parc-landes-de-gascogne.fr\n" + 
				"www.parc-landes-de-gascogne.fr\n" + 
				"http://www.saint-sever.fr/culture_musee.htm\n" + 
				"www.museesamadet.landes.org\n" + 
				"www.ville-sanguinet.fr\n" + 
				"www.agen.fr/musee\n" + 
				"Site des musées aquitains et site de la ville\n" + 
				"www.cg47.fr\n" + 
				"Site des musées aquitains ou www.nerac.fr\n" + 
				"www.sauveterre-prehistoire.fr ou Site des musées aquitains\n" + 
				"Site de la ville\n" + 
				"www.museearudy.com ou www.ot-arudy.fr\n" + 
				"www.museebonnat.bayonne.fr\n" + 
				"www.museum.bayonne.fr ou www.ansot.bayonne.fr\n" + 
				"www.musee-basque.com\n" + 
				"www.arnaga.com\n" + 
				"http://www.musee-de-guethary.fr/ OU Site des musées aquitains\n" + 
				"site de la ville\n" + 
				"http://musee.ville-pau.fr\n" + 
				"\n" + 
				"www.musee-chateau-pau.fr\n" + 
				"http://site.voila.fr/Bourbonnais/charles/index.htm\n" + 
				"http://www.bassin-gannat.com/\n" + 
				"\n" + 
				"www.musees-montlucon.com\n" + 
				"www.cncs.fr\n" + 
				"www.mab.allier.fr\n" + 
				"site de la ville www.ville-neris-les-bains.fr\n" + 
				"site de la ville www.ville-souvigny.com\n" + 
				"www.musee-aaa.com\n" + 
				"www.aurillac.fr\n" + 
				"www.ville-aurillac.fr\n" + 
				"http://www.saint-flour.fr/culture/musees/ecomusee-margeride.php\n" + 
				"www.auvergne-centrefrance.com/geotouring/musees/detail/mus154.htm\n" + 
				"www.musee-douet.com\n" + 
				"http://www.museechilhac.fr\n" + 
				"Site des amis de Lavaudieu - www.abbayedelavaudieu.fr\n" + 
				"www.mairie-le-puy-en-velay.fr\n" + 
				"www.ville-retournac.fr/musee/francais/indexfr.htm\n" + 
				"\n" + 
				"www.arlanc.com/musee_dentelle.htm\n" + 
				"http://museedart.clermont-ferrand.fr\n" + 
				"www.clermont-ferrand.fr/-Musee-Bargoin-.html\n" + 
				"www.museelecoq.clermont-ferrand.fr ou www.clermont-ferrand.fr/-Museum-Henri-Lecoq-.html\n" + 
				"www.puydedome.fr rubrique découvrir le Puy-de-Dôme\n" + 
				"www.livradois.com/marsac/penitent/index.htm\n" + 
				"\n" + 
				"www.riom-communaute.fr\n" + 
				"www.musee-murol.net/Musee.htm\n" + 
				"www.riom-communaute.fr\n" + 
				"www.riom-communaute.fr\n" + 
				"www.ville-thiers.fr/Musee-de-la-Coutellerie\n" + 
				"www.volvic-tourisme.com/HTML/sites/site_musee.htm\n" + 
				"www.alesia.com\n" + 
				"Site des musées de la région ou site de la ville\n" + 
				"www.musees-bourgogne.org\n" + 
				"www.musees-bourgogne.org ou www.beaune.fr\n" + 
				"www.musees-bourgogne.org ou www.beaune.fr\n" + 
				"\n" + 
				"www.musee-vix.fr\n" + 
				"www.musees-bourgogne.org\n" + 
				"Site des musées de Bourgogne\n" + 
				"www.musee-magnin.fr\n" + 
				"\n" + 
				"www.dijon.fr\n" + 
				"http://mba.dijon.fr ou www.ville-dijon.fr\n" + 
				"Site des musées de Bourgogne - www.musees-bourgogne.org\n" + 
				"Site des musée de Bourgogne\n" + 
				"\n" + 
				"http://www.montbard.com/\n" + 
				"http://www.montbard.com/ ou Site des musées de Bourgogne\n" + 
				"Site des musées de Bourgogne\n" + 
				"Site des musées de Bourgogne ou www.saulieu.fr\n" + 
				"Site des musées de Bourgogne\n" + 
				"www.cg58.fr/patrimoi/costu.htm\n" + 
				"www.cg58.fr\n" + 
				"www.musees-bourgogne.org\n" + 
				"www.mairie-cosnessurloire.fr/Services/MUSEEE/ACCUEIL.htm\n" + 
				"Site de l'OTSI ou des musées de Bourgogne\n" + 
				"www.tourisme.cc-loire-foret.fr ou www.cg58.fr et Site des musées de Bourgogne\n" + 
				"Site\n" + 
				"Conseil général\n" + 
				"\n" + 
				"www.cg58.fr - Site musées de Bourgogne\n" + 
				"www.cg58.fr ou www.musees-bourgogne.org\n" + 
				"www.autun.com/tourisme/museum.php\n" + 
				"\n" + 
				"www.autun.com ou Site des musées de Bourgogne\n" + 
				"\n" + 
				"www.ecomusee-creusot-montceau.fr Site des musées de Bourgogne et de l'écomusée\n" + 
				"Site des musées de Bourgogne ou www.bourbon-lancy.com/musees_fr_02_07_02.html\n" + 
				"www.museeniepce.com\n" + 
				"site des musées de Bourgogne\n" + 
				"Site des musées de Bourgogne ou site de la ville - http://www.ville-charolles.fr/musee-du-prieure\n" + 
				"www.institut-charolais.com (site de l'office du tourisme)\n" + 
				"Site des musées de Bourgogne\n" + 
				"www.ecomusee-creusot-montceau.fr\n" + 
				"www.ecomusee-de-la-bresse.com ou site des musées de Bourgogne\n" + 
				"http://www.macon.fr/Culture-sports-et-loisirs/Les-Musees-de-Macon\n" + 
				"http://www.macon.fr/Culture-sports-et-loisirs/Les-Musees-de-Macon\n" + 
				"www.marcigny.fr/musee-de-la-tour-du-moulin - http://tourdumoulin.blogspot.com\n" + 
				"www.musee-hieron.fr\n" + 
				"\n" + 
				"www.ecomusee-de-la-bresse.com\n" + 
				"http://www.cg71.fr/musee_compagnonnage/ ou http://musee-compagnonnage.cg71.fr\n" + 
				"\n" + 
				"www.musees-bourgogne.org\n" + 
				"Site des musées de Bourgogne\n" + 
				"Site des musées de Bourgogne\n" + 
				"www.verdunsurledoubs.fr rubrique culture ou www.ecomusee-de-la-bresse.com\n" + 
				"Site des musées de Bourgogne\n" + 
				"Site des musées de Bourgogne\n" + 
				"Site des musées de Bourgogne\n" + 
				"www.museeavallonnais.fr- site des musées de Bourgogne - site ville\n" + 
				"Site des musées de Bourgogne ou www.noyers-sur-serein.com/artnaif.htm\n" + 
				"www.aventureduson.fr\n" + 
				"www.centre-colette.com - http://www.yonne-89.net/MuseeColette.htm\n" + 
				"Site des musées de Bourgogne\n" + 
				"\n" + 
				"www.musee-zervos.fr\n" + 
				"Site de la ville\n" + 
				"\n" + 
				"www.mairie-dinan.com\n" + 
				"www.musee-meheut.fr\n" + 
				"www.mairie-saint-brieuc.fr\n" + 
				"www.musee-brest.com\n" + 
				"www.mairie-brest.fr/musee_marine.htm ou www.musee-marine.fr\n" + 
				"www.ecomusee-monts-arree.fr\n" + 
				"www.concarneau-cornouaille.fr\n" + 
				"www.port-musee.org\n" + 
				"www.musee.ville.morlaix.fr\n" + 
				"www.parc-naturel-armorique.fr\n" + 
				"www.parc-naturel-armorique.fr\n" + 
				"www.pontaven.fr\n" + 
				"www.museebigouden.fr\n" + 
				"http//musee-beauxarts.quimper.fr\n" + 
				"www.cg29.fr/culture/mdb.htm - Site en cours\n" + 
				"www.ecomusee-monts-arree.fr\n" + 
				"www.musee-ecole.fr\n" + 
				"www.ecomusee-broceliande.com  - http://ecomuseepaysmontfort.free.fr/\n" + 
				"Site de l'office du tourisme\n" + 
				"www.mbar.org\n" + 
				"www.ecomusee-rennes-metropole.fr\n" + 
				"www.musee-bretagne.fr\n" + 
				"Site de la ville\n" + 
				"Site de la ville - www.ville-saint-malo.fr\n" + 
				"site de l'office du tourisme\n" + 
				"site de l'office du tourisme\n" + 
				"site de l'office du tourisme\n" + 
				"www.ecomusee-st-degan.fr\n" + 
				"www.museedecarnac.com\n" + 
				"http://ecomusee.groix.free.fr\n" + 
				"www.inzinzac-lochrist.fr/Ecomusee-des-Forges.6681.0.html\n" + 
				"www.museedufaouet.fr\n" + 
				"www.lorient.com/musee\n" + 
				"www.musee-marine.fr\n" + 
				"www.resistance-bretonne.com\n" + 
				"www.suscinio.info\n" + 
				"\n" + 
				"\n" + 
				"Site de la ville : www.ville-bourges.fr\n" + 
				"Site de la ville www.ville-bourges.fr\n" + 
				"www.museum-bourges.net\n" + 
				"site de la ville www.ville-bourges.fr\n" + 
				"Site de la ville www.ville-bourges.fr\n" + 
				"\n" + 
				"http://www.ville-mehun-sur-yevre.fr/Le-Château\n" + 
				"\n" + 
				"site de la ville\n" + 
				"\n" + 
				"www.ville-chartres.fr ou www.musees.regioncentre.fr/defaulttest.php\n" + 
				"site de la ville : www.ville-chartres.fr ou http://perso.wanadoo.fr/samnel.museum/\n" + 
				"www.lecompa.com\n" + 
				"www.ville-chateaudun.fr ou www.musees.regioncentre.fr\n" + 
				"www.musees.regioncentre.fr - site de la région\n" + 
				"http://perso.orange.fr/marcelproust/\n" + 
				"www.ville-nogent-le-rotrou.fr/html/art_cult/musee/collec.htm\n" + 
				"mairie.perso.fr/sainville/index.htm\n" + 
				"http://chemiserie.cc-argenton.fr\n" + 
				"www.château-azay-le-ferron.com\n" + 
				"www.ville-chateauroux.fr - Site de la ville\n" + 
				"www.issoudun.fr\n" + 
				"Site de la région ou www.pays-george-sand.com\n" + 
				"\n" + 
				"Site de la région centre\n" + 
				"www.argentomagus.com ou www.argentomagus.cc-argenton.fr\n" + 
				"\n" + 
				"Site de la ville www.ville-amboise.fr\n" + 
				"www.chinon-histoire.org\n" + 
				"www.ville-descartes.fr/pratique/f_pratique.htm\n" + 
				"www.prehistoiregrandpressigny.fr\n" + 
				"\n" + 
				"Site de la région centre ou http://www.lochesentouraine.com\n" + 
				"http://www.cc-pays-de-richelieu.fr\n" + 
				"www.musee-balzac.fr\n" + 
				"\n" + 
				"www.museedusavigneen.com\n" + 
				"www.cc-veron.fr/ecomusee\n" + 
				"www.musee-rabelais.fr ou site du conseil général\n" + 
				"www.museum.tours.fr\n" + 
				"www.museecompagnonnage.fr\n" + 
				"site de la ville\n" + 
				"www.tours.fr ou www.musees-regioncentre.fr ou www.framemuseums.org\n" + 
				"Site du conseil général\n" + 
				"\n" + 
				"www.chateaudeblois.fr\n" + 
				"www.ville-blois.fr\n" + 
				"www.maisondelamagie.fr\n" + 
				"\n" + 
				"\n" + 
				"www.museedesologne.com\n" + 
				"www.musees.regioncentre\n" + 
				"www.vendome.eu/intro/1p1e-421-musee-vendome.html-vendome.html ou www.musees.regioncentre.fr\n" + 
				"www.musee-theatre-forain.fr\n" + 
				"site de la région ou www.patrimoine-beaugency.fr\n" + 
				"www.chateauneuf-sur-loire.com ou www.musees-centre.com\n" + 
				"http://www.ifrance.com/chatillon-coligny\n" + 
				"www.château-gien.com\n" + 
				"www.meung-sur-loire.com\n" + 
				"www.montargis.fr/musee.htm\n" + 
				"\n" + 
				"\n" + 
				"Région : www.musees.regioncentre.fr ou  www.orleans.fr (rubrique culture/musee)\n" + 
				"Site de la ville\n" + 
				"\n" + 
				"www.maisondeladernierecartouche.com\n" + 
				"www.mairie-charlevillemezieres.fr/htm/culture/rimbaud.htm\n" + 
				"www.mairie-charlevillemezieres.fr/htm/culture/rimbaud.htm\n" + 
				"\n" + 
				"www.culture.gouv.fr/champagne-ardenne/2culture/musee_france/musee_mouzon.html\n" + 
				"\n" + 
				"www.chateau-fort-sedan.fr\n" + 
				"\n" + 
				"www.ville-brienne-le-château.fr\n" + 
				"Site de l'OT\n" + 
				"www.musee-nogent-sur-seine.fr\n" + 
				"\n" + 
				"Site de la ville\n" + 
				"\n" + 
				"Site de la ville\n" + 
				"www.ville-troyes.fr\n" + 
				"\n" + 
				"www.maison-de-l-outil.com\n" + 
				"www.culture.gouv.fr/champagne-ardenne/2culture/musee_france/musee_bourbonne.html\n" + 
				"\n" + 
				"http://www.ville-chaumont.fr\n" + 
				"\n" + 
				"En cours de réalisation\n" + 
				"http://www.ville-thiers.fr/Musee-de-la-Coutellerie\n" + 
				"Site de la mairie\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"www.parc-montagnedereims.fr\n" + 
				"www.museelevergeur.com\n" + 
				"\n" + 
				"site de la ville\n" + 
				"Site de la ville\n" + 
				"\n" + 
				"www.musee-maisonbonaparte.fr - www.musees-nationaux-napoleoniens.org\n" + 
				"www.musee-fesch.com\n" + 
				"http://www.napoleon.org ou http://www.ajaccio.fr/\n" + 
				"http://www.levie-altarocca.com\n" + 
				"\n" + 
				"www.cg2b.fr\n" + 
				"www.musee-bastia.com\n" + 
				"www.musee-corse.com\n" + 
				"\n" + 
				"www.cg2b.fr\n" + 
				"www.citadelle.com\n" + 
				"www.musee-arts-besancon.org\n" + 
				"Site de la ville\n" + 
				"site de la ville\n" + 
				"www.besancon.fr/museedutemps\n" + 
				"Site du pays de Montbeliard\n" + 
				"www.château-montbeliard.net ou site du pays de montbeliard\n" + 
				"www.maisons-comtoises.org\n" + 
				"http://www.musee-courbet.fr\n" + 
				"Site de la ville\n" + 
				"www.cg70.fr/decouvertes/musee\n" + 
				"www.musees-des-techniques.org\n" + 
				"site des musées de la région ou site de la ville\n" + 
				"www.musees-franchecomte.com\n" + 
				"www.luxeuil.fr\n" + 
				"Site des musées de la région\n" + 
				"Site des musées de la région\n" + 
				"http://www.juramusees.com/musee-vigne-vin/musee-vigne-vin.htm\n" + 
				"www.tourisme.champagnole.com\n" + 
				"Site de la ville ou site des musées de la région\n" + 
				"Site des musées de la région\n" + 
				"Site de la ville\n" + 
				"www.musee-du-jouet.fr et Site des musées de la région\n" + 
				"www.musee-lunette.fr ou www.musees-franchecomte.com\n" + 
				"\n" + 
				"Site des musées de la région\n" + 
				"http://www.juramusees.fr/1/musee/musees/beaux_arts/musee_max_claudet_salins_les_bains.html\n" + 
				"www.salinesdessalins.com ou www.musees-des-techniques.org\n" + 
				"\n" + 
				"www.musees-des-techniques.org\n" + 
				"www.musees-franchecomte.com\n" + 
				"www.musees-franchecomte.com\n" + 
				"www.musees-des-techniques.org ou www.cc-pays-sous-vosgien.fr\n" + 
				"\n" + 
				"\n" + 
				"www.cg971.fr/musees/clerc/index_edgar.htm\n" + 
				"www.sjperse.org/museesjp.htm\n" + 
				"\n" + 
				"www.cg971.fr/musees/schoelcher/index_schoecher.htm\n" + 
				"www.mcg973.org\n" + 
				"\n" + 
				"\n" + 
				"www.museedelaphoto.fr\n" + 
				"\n" + 
				"www.brunoy.fr\n" + 
				"Site de la ville - www.mairie-dourdan.fr\n" + 
				"site de la ville\n" + 
				"Site de l'association des amis -  www.annees30.com/\n" + 
				"\n" + 
				"http://www.boulognebillancourt.com\n" + 
				"www.albert-kahn.fr\n" + 
				"www.fondationarp.org\n" + 
				"Site de la ville - www.mairie-colombes.fr\n" + 
				"\n" + 
				"Site de la ville\n" + 
				"www.issy.com/musee\n" + 
				"www.musee-rodin.fr\n" + 
				"www.ville-meudon.fr/meudon/culture-et-patrimoine/copy5_of_structures-culturelles\n" + 
				"\n" + 
				"www.chateau-malmaison.fr\n" + 
				"Site de la mairie : /www.mairie-rueilmalmaison.fr\n" + 
				"Site de la mairie : /www.mairie-rueilmalmaison.fr\n" + 
				"www.ville-saint-cloud.fr/temps_libre/musee.htm\n" + 
				"www.chateau-sceaux.fr ou/www.domaine-de-sceaux.fr (site du conseil général) ou www.sceaux.fr\n" + 
				"www.sevresciteceramique.fr\n" + 
				"www.ville-suresnes.fr/indexfin.html\n" + 
				"www.musee-moyenage.fr\n" + 
				"www.chassenature.org/\n" + 
				"www.mahj.org\n" + 
				"www.musee-picasso.fr\n" + 
				"www.cognacq-jay.paris.fr\n" + 
				"www.paris.fr/musees/musee_carnavalet\n" + 
				"www.mnhn.fr\n" + 
				"www.aphp.fr\n" + 
				"www.mnhn.fr\n" + 
				"\n" + 
				"www.mnhn.fr\n" + 
				"www.musee-hugo.paris.fr\n" + 
				"http://crypte.paris.fr/\n" + 
				"www.lesartsdecoratifs.fr\n" + 
				"www.musee-delacroix.fr\n" + 
				"www.mnhn.fr\n" + 
				"www.invalides.org\n" + 
				"www.balzac.paris.fr\n" + 
				"www.louvre.fr\n" + 
				"www.musee-marine.fr\n" + 
				"www.ml-leclerc-moulin.paris.fr\n" + 
				"www.museedusport.fr\n" + 
				"www.musee-henner.fr ou www.henner-intime.fr\n" + 
				"www.museedemontmartre.fr\n" + 
				"www.musee-bouchard.com\n" + 
				"www.cernuschi.paris.fr\n" + 
				"www.catacombes-de-paris.fr\n" + 
				"www.zadkine.paris.fr\n" + 
				"www.galliera.paris.fr\n" + 
				"www.musee-orsay.fr\n" + 
				"www.musee-legiondhonneur.fr\n" + 
				"www.cite-musique.fr\n" + 
				"www.petitpalais.paris.fr\n" + 
				"http://www.paris.fr/portail/Culture/Portal.lut?page_id=5851\n" + 
				"www.museedelapub.org et www.lesartsdecoratifs.fr/\n" + 
				"www.aquarium-portedoree.fr\n" + 
				"www.histoire-immigration.fr\n" + 
				"\n" + 
				"www.lesartsdecoratifs.fr/\n" + 
				"\n" + 
				"www.citechaillot.fr\n" + 
				"www.imarabe.org\n" + 
				"www.lesartsdecoratifs.fr/\n" + 
				"www.musee-rodin.fr\n" + 
				"www.musee-moreau.fr\n" + 
				"www.museefm.org\n" + 
				"www.musee-orangerie.fr\n" + 
				"www.mam.paris.fr\n" + 
				"www.guimet.fr\n" + 
				"www.musee-europemediterranee.org\n" + 
				"www.bourdelle.paris.fr\n" + 
				"www.mnhn.fr\n" + 
				"www.museeguimet.fr\n" + 
				"www.arts-et-metiers.net\n" + 
				"www.centrepompidou.fr\n" + 
				"www.valdegrace.org\n" + 
				"www.monnaiedeparis.fr\n" + 
				"www.quaibranly.fr\n" + 
				"www.museedelaposte.fr ou www.laposte.fr/musee\n" + 
				"www.seine-et-marne.fr (rubrique loisirs/musées départementaux)\n" + 
				"www.chelles.fr/Culture/Musee-Alfred-Bonno\n" + 
				"www.amtuir.org\n" + 
				"www.tourisme77.fr ou www.coulommiers.fr\n" + 
				"www.braillenet.org/louis_braille/maisnat.htm\n" + 
				"dgs@crecylachapelle.eu\n" + 
				"\n" + 
				"www.châteaudefontainebleau.fr\n" + 
				"Site de la ville\n" + 
				"Site de la ville\n" + 
				"site de la ville - www.ville-meaux.fr\n" + 
				"www.museedelagrandeguerre.eu\n" + 
				"www.servicehistorique.sga.defense.gouv.fr\n" + 
				"Site de la ville : www.ville-melun.fr\n" + 
				"http://www.ville-moret-sur-loing.fr\n" + 
				"www.musee-prehistoire-idf.fr\n" + 
				"Site de la ville - www.ville-nemours.fr\n" + 
				"Site de la ville : www.mairie-provins.fr\n" + 
				"Site du conseil général - www.seine-et-marne.fr - rubrique loisirs\n" + 
				"Site de la ville www.savigny-le-temple.fr\n" + 
				"www.weine-et-marne.fr (rubrique loisirs/musées départementaux)\n" + 
				"www.museeairespace.fr\n" + 
				"www.mairie-livrygargan.fr/rubrique culture loisirs\n" + 
				"www.museehistoirevivante.com\n" + 
				"www.musee-saint-denis.fr\n" + 
				"\n" + 
				"Site de la ville - www.argenteuil.fr/article.php3?id_article=529\n" + 
				"www.musee-renaissance.fr ou www.musee-château-ecouen.fr\n" + 
				"www.valdoise.fr/content/content15651.html\n" + 
				"http://musee.ville-isle-adam.fr/index.html\n" + 
				"www.archea-roissyportedefrance.fr\n" + 
				"/www.ville-montmorency.fr\n" + 
				"Site de la ville - www.ville-Pontoise.fr\n" + 
				"www.ville-pontoise.fr\n" + 
				"http://www.bry94.fr/bry/71.htm\n" + 
				"www.musee-resistance.com\n" + 
				"www.ecomusee-valdebievre.fr\n" + 
				"www.saint-maur.com/musee/musee.htm\n" + 
				"http://musee.vet-alfort.fr/\n" + 
				"www.musee-nogentsurmarne.fr\n" + 
				"www.mairie-villiers94.com/francais/vie_quoti/vie_quot_culture7.php\n" + 
				"www.macval.fr\n" + 
				"www.mairie-conflans-sainte-honorine.fr\n" + 
				"www.museedelatoiledejouy.fr\n" + 
				"www.musee-promenade.fr\n" + 
				"http://www.port-royal-des-champs.eu\n" + 
				"http://musee.ville-mantes-la-jolie.com\n" + 
				"http://museeaubertmaule.free.fr\n" + 
				"www.maisonzola-museedreyfus.com\n" + 
				"www.ville-montfort-l-amaury.fr\n" + 
				"site de la ville\n" + 
				"Site de la ville\n" + 
				"www.rambolitrain.fr\n" + 
				"Site de la ville\n" + 
				"www.musee-mauricedenis.fr\n" + 
				"www.musee-antiquitesnationales.fr -www.musee-archeologienationale.fr\n" + 
				"www.museedelaville.agglo-sqy.fr\n" + 
				"www.coubertin.fr\n" + 
				"www.musee-lambinet.com\n" + 
				"www.chateauversailles.fr\n" + 
				"www.eburomagus.com\n" + 
				"Site de la ville\n" + 
				"http://www.ville-castelnaudary.fr\n" + 
				"\n" + 
				"www.limoux.fr/fr/tourisme/musee_petiet.html\n" + 
				"www.mairie-narbonne.fr\n" + 
				"www.mairie-narbonne.ff\n" + 
				"http://culture.legrandnarbonne.com/421-amphoralis.html - www.amphoralis.com\n" + 
				"www.sigean.fr - site de la ville\n" + 
				"site de la ville - www.ville-ales.fr\n" + 
				"site de la ville - www.ville-ales.fr\n" + 
				"Site dela ville ou Site du conseil général\n" + 
				"Site de la ville ou site du conseil général\n" + 
				"www.beaucaire.fr/spip.php?article65\n" + 
				"www.museecevenol.com\n" + 
				"www.nimes.fr/index.php?id=280\n" + 
				"www.nimes.fr/index.php?id=283\n" + 
				"http://www.nimes.fr/index.php?id=282\n" + 
				"www.carreartmusee.nimes.fr\n" + 
				"site de la ville - www.nimes.fr\n" + 
				"www.nimes.fr\n" + 
				"\n" + 
				"Site du conseil général\n" + 
				"Site de la ville - www.ville-saint-gilles.fr\n" + 
				"www.museedescevennes.com\n" + 
				"http://uzesmusee.blogspot.fr/ ou http://www.uzes-tourisme.com/sitefr/musees/borias.htm\n" + 
				"Site du conseil général\n" + 
				"\n" + 
				"Site de la ville\n" + 
				"Site de la ville\n" + 
				"www.ville-beziers.fr/culture/02.cfm\n" + 
				"www.bouzigues.fr/musee/francais/bouzigues-musee.html\n" + 
				"site de la ville - www.ville-frontignan.fr\n" + 
				"\n" + 
				"http://museearcheo.montpellier-agglo.com\n" + 
				"Site créé en décembre 2012\n" + 
				"www.cc-picsaintloup.fr\n" + 
				"www.museedelodeve.fr\n" + 
				"\n" + 
				"www.montpellier-agglo.com\n" + 
				"\n" + 
				"www.montpellier-agglo.com/museefabre\n" + 
				"www.musee-languedocien.com\n" + 
				"www.museum.agropolis.fr\n" + 
				"www.ville-murviel-les-montpellier.fr\n" + 
				"Site de la ville\n" + 
				"www.pays-saintponais.com\n" + 
				"www.museepaulvalery-sete.fr\n" + 
				"\n" + 
				"www.mescevennes.com/decouvertes/ecomusee_loz.htm\n" + 
				"www.musee-ceret.com\n" + 
				"www.collioure.net/musee.asp\n" + 
				"\n" + 
				"www.mairie-perpignan.fr\n" + 
				"Site de la mairie - www.mairie-perpignan.fr\n" + 
				"Site de la mairie : www.mairie-perpignan.fr\n" + 
				"Site de la mairie - www.mairie-perpignan.fr\n" + 
				"\n" + 
				"www.museedecerdagne.com\n" + 
				"www.450000ans.com ou www.cerptautavel.com\n" + 
				"www.musee-labenche.com ou www.brive.net\n" + 
				"www.museepresidentjchirac.fr\n" + 
				"www.museecloitre-tulle.com ou www.ville-tulle.fr\n" + 
				"Site de la ville\n" + 
				"http://www.ussel19.fr/culture-patrimoine/musee-du-pays-d-ussel.html\n" + 
				"www.cite-tapisserie.fr\n" + 
				"www.ville-gueret.fr/culture/musee.php\n" + 
				"www.museechateauponsac.com\n" + 
				"www.musee-adriendubouche.fr\n" + 
				"www.museebal.fr\n" + 
				"www.musee-rochechouart.com\n" + 
				"\n" + 
				"www.grand-nancy.org\n" + 
				"http://www.nancy.fr/transver/coord.htm#muslor - Site du Grand Nancy\n" + 
				"http://http//www.mairie-longwy.fr\n" + 
				"www.chateauluneville.cg54.fr - http://www.chateaudeslumieres.com\n" + 
				"www.man.uhp-nancy.fr\n" + 
				"http://www.nancy.fr/transver/coord.htm#muslor - Site du Grand Nancy\n" + 
				"www.ecole-de-nancy.com\n" + 
				"www.mairie-nancy.fr\n" + 
				"Site de la ville\n" + 
				"\n" + 
				"site de la ville - http://www.barleduc.fr\n" + 
				"\n" + 
				"www.tourisme-montmedy.fr\n" + 
				"http://otsisaintmihiel.e-monsite.com\n" + 
				"http://www.cg55.fr\n" + 
				"www.musee-de-la-biere.com\n" + 
				"site de la conservation : www.cg55.fr\n" + 
				"\n" + 
				"www.ville-verdun.fr\n" + 
				"\n" + 
				"Site du conseil général - www.cg57.fr\n" + 
				"http://www.musee-verre.webmuseo.com/\n" + 
				"musees.metzmetropole.fr\n" + 
				"www.centrepompidou-metz.fr\n" + 
				"www.musee.desminesdefer-lorraine.com\n" + 
				"www.la-mine.fr\n" + 
				"www.phalsbourg.fr/La_culture__les_loisirs/Le_Musee\n" + 
				"www.musee-du-pays-de-sarrebourg.com\n" + 
				"www.sarreguemines-museum.com\n" + 
				"www.sarreguemines-museum.com\n" + 
				"www.tourauxpuces.com\n" + 
				"www.cg57.fr/culture/1-8-delatour.asp\n" + 
				"www.museedelimage.fr\n" + 
				"Site du conseil général - www.vosges.fr\n" + 
				"www.musee-lutherie-mirecourt.fr\n" + 
				"site de la ville\n" + 
				"www.remiremont.fr/culture/musees.php\n" + 
				"www.remiremont.fr/culture/musees.php\n" + 
				"Site de la ville - www.ville-saintdie.fr\n" + 
				"www.cg972.fr/mdap\n" + 
				"http://www.cr-martinique.fr/francais/institution/serv-region/musees/histoire_ethno.htm\n" + 
				"\n" + 
				"http://www.zananas-martinique.com/martinique-patrimoine/maison-de-la-canne.html\n" + 
				"/www.cr-martinique.fr/francais/institution/serv-region/musees/ecomusee.htm\n" + 
				"http://www.saintpierre-martinique.fr\n" + 
				"www.sesta.fr ou www.ariege.com/chateaufoix/index.html\n" + 
				"www.paysdolmes.org - www.geocities.com/amtpc2000\n" + 
				"www.grotte-masdazil.com\n" + 
				"www.sesta.fr\n" + 
				"Site de la ville : www.citaenet.com/montsegur\n" + 
				"Site du Service d'exploitation des sites touristiques de l'Ariège - www.sesta.fr ou www.grands-sites-ariege.fr\n" + 
				"www.decazeville.fr ou www.musees-midi-pyrenees.fr\n" + 
				"www.tourisme-espalion.fr - http://www.museeduscaphandre.com\n" + 
				"www.aveyron-culture.com\n" + 
				"www.millauculture.fr ou www.ot-millau.fr\n" + 
				"www.musee-fenaille.com ou www.grandrodez.com\n" + 
				"Site de la mairie\n" + 
				"www.grand-rodez.com ou http://musee-soulages.grand-rodez.com/\n" + 
				"\n" + 
				"www.cg12.fr\n" + 
				"www.aveyron-culture.com\n" + 
				"www.villefranchederouergue.fr\n" + 
				"www.musee-jacobins.auch.fr www.auch-tourisme.com ou site de la mairie\n" + 
				"site du département : www.gers-gascogne.com\n" + 
				"site du département : www.gers-gascogne.com ou site de la mairie\n" + 
				"site du département : www.gers-gascogne.com\n" + 
				"site du département : www.gers-gascogne.com\n" + 
				"Site de la région : www.musees-midi-pyrenees.fr\n" + 
				"site du département : www.gers-gascogne.com\n" + 
				"www.aurignacien.com\n" + 
				"www.luchon.com ou www.mairies-luchon.fr -www.musees-midi-pyrenees.fr\n" + 
				"www.tourisme-martres-tolosane.fr\n" + 
				"http://www.musees-midi-pyrenees.fr/musees/musee-archeologique-departemental\n" + 
				"www.mairiestgaudens.fr\n" + 
				"\n" + 
				"\n" + 
				"En projet\n" + 
				"http://asptuit.free.fr\n" + 
				"www.museum.toulouse.fr\n" + 
				"www.SaintRaymond.toulouse.fr\n" + 
				"www.augustins.org\n" + 
				"www.lesabattoirs.org\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"www.chateaufort-lourdes.fr ou site de la ville - http://www.lourdes-visite.com/\n" + 
				"\n" + 
				"www.chateaudemauvezin.com\n" + 
				"http://www.tarbes.fr/gp/Le-musee-Massey/107/0\n" + 
				"www.pechmerle.com\n" + 
				"www.mairie-cahors.fr/musee\n" + 
				"www.musee-champollion.fr et site de la ville\n" + 
				"www.tourisme-figeac.com\n" + 
				"site de l'association des amis du musée\n" + 
				"http://www.ville-luzech.fr/musee-archeologique-armand-vire-luzech\n" + 
				"\n" + 
				"\n" + 
				"www.museeduquercy.com\n" + 
				"www.musee-automate.fr\n" + 
				"http://www.vayrac.fr/uxellodunum.php?lg=fr\n" + 
				"www.musee-toulouse-lautrec.com\n" + 
				"http://musee-cayla.tarn.fr ou www.littérature-lieux.com\n" + 
				"www.ville-castres.fr ou www.musees-midi-pyrenees.fr/musees/centre-national-et-musee-jean-jaures/\n" + 
				"www.ville-castres.fr\n" + 
				"http://savieuxcordes.canalblog.com ou http://musee-charles-portal.asso-web.com\n" + 
				"www.mpehl.org et www.musees-midi-pyrenees.fr\n" + 
				"Site de la ville www.ville-gaillac.fr\n" + 
				"site de la ville\n" + 
				"Site de la ville :  www.ville-gaillac.fr\n" + 
				"http://musee-textile.tarn.fr\n" + 
				"www.musees-midi-pyrenees.fr/musees/musee-du-pays-vaurais\n" + 
				"www.ville-lisle-sur-tarn.fr - http://musee.lislesurtarn.over-blog.fr/\n" + 
				"Site de la région : www.musees-midi-pyrenees.fr/musees/musee-du-pays-rabastinois\n" + 
				"www.auvillar.com\n" + 
				"www.museecalbet.com\n" + 
				"\n" + 
				"http://www.montauban.com/\n" + 
				"www.montauban.com\n" + 
				"Site de la ville : www.saint-antonin-noble-val.com\n" + 
				"site de la ville ou www.mediatheque-anzin.fr\n" + 
				"http://www.annuaire-mairie.fr/musee-de-la-societe-archeologique-d-avesnes-sur-helpe.html#musee\n" + 
				"\n" + 
				"Site du conseil général : www.cg59.fr\n" + 
				"www.musee-bergues.fr\n" + 
				"http://museedostrevant.canalblog.com/\n" + 
				"www.villedecambrai.com/culture/musee.html\n" + 
				"www.liturgiecatholique.fr/Musee-diocesain-d-Art-Sacre-du.html ou http://archives.cathocambrai.com/\n" + 
				"http://museedeflandre.lenord.fr/fr/Accueil.aspx\n" + 
				"Site de la ville - www.ville-denain.fr\n" + 
				"www.museedelachartreuse.fr/\n" + 
				"www.museeportuaire.fr\n" + 
				"http://www.muséesdunkerque.wb.st\n" + 
				"http://www.musenor.com/gm/dunker1.htm\n" + 
				"http//clec.free.fr\n" + 
				"www.ecomusee-avesnois.fr\n" + 
				"www.ville-gravelines.fr\n" + 
				"site de la ville\n" + 
				"www.cg59.fr ou www.tourisme-lecateau.fr/museematisse\n" + 
				"www.chm-lewarde.com\n" + 
				"www.mairie-lille.fr\n" + 
				"www.mairie-lille.fr\n" + 
				"www.pba-lille.fr ou site de la mairie http://www.mairie-lille.fr\n" + 
				"www.ot-marchiennes.fr\n" + 
				"www.musenor.com\n" + 
				"www.roubaix-lapiscine.com\n" + 
				"Site de la ville\n" + 
				"site du département - www.nordmag.com\n" + 
				"www.muba-tourcoing.fr/\n" + 
				"www.valenciennes.fr(culture/musee)\n" + 
				"www.musee-lam.fr\n" + 
				"www.musenor.org ou www.arras.fr/culture/musee-des-beaux-arts.html\n" + 
				"www.opale-sud.com\n" + 
				"Site de la ville\n" + 
				"\n" + 
				"www.ville-boulogne-sur-mer.fr/château-musee ou  musenor\n" + 
				"www.musee.calais.fr\n" + 
				"www.desvresmuseum.org\n" + 
				"www.musee-quentovic.fr/\n" + 
				"Site de la ville : www.ville-harnes.fr/Patrimoine\n" + 
				"www.letouquet.com ou http://www.letouquet-musee.com/\n" + 
				"\n" + 
				"www.2p2m.org\n" + 
				"www.musees-ville-saint-omer.com\n" + 
				"m3.dnsalias.com/sandelin - http://www.musenor.com/Les-Musees/Saint-Omer-Musee-Henri-Dupuis\n" + 
				"Site de la ville www.ville-saintpolsurternoise.fr/\n" + 
				"site de la ville - www.villesamer.fr\n" + 
				"www.musee-arromanches.fr\n" + 
				"Site de la mairie - www.mairie-bayeux.fr\n" + 
				"\n" + 
				"\n" + 
				"www.musee-de-normandie.eu\n" + 
				"www.mba.caen.fr\n" + 
				"www.caen.fr/museedelaposte/\n" + 
				"www.memorial.caen.fr\n" + 
				"http://cpievdo.fr/cpie-presentation-environnement/musee-d-initiation-a-la-nature - site de la région\n" + 
				"Site de la ville\n" + 
				"www.musees-honfleur.fr - www.ville-honfleur.fr\n" + 
				"www.ville-molay-littry.fr\n" + 
				"www.ville-molay-littry.fr\n" + 
				"www.lintercom.fr\n" + 
				"www.lintercom.fr\n" + 
				"site de la mairie - http://www.mairie-orbec.fr\n" + 
				"site du conseil général - www.cg14.fr\n" + 
				"\n" + 
				"museetilly.free.fr ou www.tilly1944.fr\n" + 
				"www.trouville.fr/pages/03maville/culture.html\n" + 
				"Site du conseil général\n" + 
				"www.paleospace-villers.fr\n" + 
				"http://www.cc-vire.fr/web/le_musee.html\n" + 
				"\n" + 
				"www.parc-naturel-normandie-maine.fr ou www.musees-basse-normandie.fr\n" + 
				"www.mairie-bricquebec.fr/\n" + 
				"\n" + 
				"Site de la ville - www.ville-cherbourg.fr\n" + 
				"www.ville-cherbourg.fr\n" + 
				"www.ville-cherbourg.fr\n" + 
				"www.ville-coutances.fr/musee.php\n" + 
				"www.equeurdreville.com\n" + 
				"www.ville-granville.fr\n" + 
				"www.ville-granville.fr (site de la ville)\n" + 
				"www.museechristiandior.com\n" + 
				"www.saint-lo.fr\n" + 
				"\n" + 
				"www.sitesetmusees.cg50.fr\n" + 
				"http://www.stlo.unicaen.fr/museebarbeydaurevilly\n" + 
				"www.tatihou.com\n" + 
				"\n" + 
				"Site de la Mairie : www.mairie-valognes.fr\n" + 
				"www.museesvilledieu.sitew.com\n" + 
				"www.paysdalencontourisme.com/musee-beaux-arts-dentelle-alencon_784_fr.html\n" + 
				"www.flers-agglomeration.fr/57-le-musee-du-chateau.htm\n" + 
				"www.ville-laigle.fr\n" + 
				"site de la ville\n" + 
				"\n" + 
				"www.ecomuseeduperche.free.fr\n" + 
				"www.cg61.fr/musee-art-religieux-sees.html\n" + 
				"Site de la ville - www.ville-bernay27.fr\n" + 
				"www.musees-haute-normandie.fr ou site de la ville\n" + 
				"www.evreux.fr (site de la ville) ou www.musees-haute-normandie.fr\n" + 
				"http://www.lacoutureboussey.com/default.asp?file=pg25-1_fr\n" + 
				"www.ville-andelys.fr/Mus%C3%A9e_Nicolas_Poussin_cms183.aspx\n" + 
				"Site des musées de Haute-Normandie ou site de la ville\n" + 
				"www.ville-pont-audemer.fr ou www.musee-haute-normandie.fr\n" + 
				"site de la ville www.ville-vernon27.fr/musee/\n" + 
				"Site de la ville : www.ville-barentin.fr\n" + 
				"www.litterature-lieux.com/fiche-site-80.htm - Site des musées de la région\n" + 
				"site des musées de la région\n" + 
				"www.pnr-seine-normande.com ou site de la région\n" + 
				"www.mairie-dieppe.fr ou www.musees-haute-normandie.fr\n" + 
				"www.la-crea.fr ou Site des musées de la région\n" + 
				"www.louis-philippe.eu - www.ville-eu.fr ou site des musées de la région\n" + 
				"Sites de la ville et des musées de Haute-Normandie\n" + 
				"http://www.fecamp.com\n" + 
				"site de la région\n" + 
				"Site de la ville -  www.ville-lehavre.fr\n" + 
				"www.musee-malraux.ville-lehavre.fr\n" + 
				"Site de la ville - www.ville-lehavre.fr\n" + 
				"Site de la ville : www.ville-lehavre.fr\n" + 
				"www.museum-lehavre.fr ou site de la ville\n" + 
				"www.museepierrecorneille.fr\n" + 
				"site des musées de la région\n" + 
				"www.chateaudemartainville.fr\n" + 
				"www.musee-sapeurs-pompiers.org - www.mairie-montville.fr\n" + 
				"site des musées de la région\n" + 
				"Site des musées de la région ou www.pnr-seine-normande.com/\n" + 
				"www.corderievallois.fr\n" + 
				"www.museedesantiquites.fr\n" + 
				"www.rouen-musees.com\n" + 
				"www.rouen-musees.com\n" + 
				"http://www.rouen.fr/medecine ou http://www3.chu-rouen.fr/Internet/connaitreCHU/culture/musee_flaubert\n" + 
				"www.rouen-musees.com\n" + 
				"Site des musées de la région ou www.cndp.fr/musee\n" + 
				"Site de la ville\n" + 
				"Site des musées de la région ou www.rouen.fr/corneille ou www.rouen-histoire.com/Corneille/\n" + 
				"www.musee-horlogerie-aliermont.fr\n" + 
				"www.museevictorhugo.fr\n" + 
				"Site de l'OT - www.tourisme-yvetot.fr\n" + 
				"www.cap-atlantique.fr/tourisme-loisirs/Musee/\n" + 
				"www.musee-de-blain.fr/accueil2.htm\n" + 
				"http://museepaysderetz.com/\n" + 
				"\n" + 
				"site de la ville - www.ville-guerande.fr\n" + 
				"www.vignoble-nantais.eu\n" + 
				"www.museum.nantes.fr\n" + 
				"www.museedesbeauxarts.nantes.fr\n" + 
				"www.château-nantes.fr\n" + 
				"www.loire-atlantique.fr ou www.cg44.fr ou www.culture.cg44.fr\n" + 
				"www.parc-naturel-briere.fr\n" + 
				"www.parc-naturel-briere.fr\n" + 
				"www.parc-naturel-briere.fr\n" + 
				"www.saint-nazaire-tourisme.com\n" + 
				"Site de la ville\n" + 
				"www.angers.fr/mba\n" + 
				"Site de la ville\n" + 
				"www.angers.fr/mba\n" + 
				"www.ville-angers.fr/museum\n" + 
				"www.damm49.fr\n" + 
				"www.damm49.fr\n" + 
				"www.museedutextile.com ou www.ville-cholet.fr/musee-textile.php\n" + 
				"Site de la ville : www.ville-cholet.fr/musee-art-histoire.php\n" + 
				"www.musee-julesdesbois.fr ou www.damm49.fr\n" + 
				"www.mvvanjou.com\n" + 
				"www.chateau-saumur.com\n" + 
				"www.lemuseedelardoise.fr\n" + 
				"Site de la ville\n" + 
				"http://patrimoine.chateaugontier.fr/\n" + 
				"www.musee-robert-tatin.fr\n" + 
				"\n" + 
				"site du conseil général - www.cg53.fr ou lamayenne.fr\n" + 
				"Site de la mairie - http://musees.laval.fr\n" + 
				"www.multimedia.com/ccstidelaval\n" + 
				"www.museeduchateaudemayenne.fr\n" + 
				"http://geocities.com/musardoise\n" + 
				"\n" + 
				"Site de la ville - www.ville-lemans.fr\n" + 
				"site de la ville\n" + 
				"site de la ville - www.ville-lemans.fr\n" + 
				"www.espacefaience.fr\n" + 
				"www.payscalaisien.com/65/fr/pays-calaisien/musee.html\n" + 
				"www.centre-minier-vendee.com\n" + 
				"\n" + 
				"www.ecomusee-ledaviaud.com\n" + 
				"www.ile-noirmoutier.com/html/activites\n" + 
				"site de la ville\n" + 
				"www.lachaizelevicomte.fr/fr/information/6403/musee-ornithologique-charles-payraudeau\n" + 
				"www.historial.vendee.fr\n" + 
				"www.lessablesdolonne.fr\n" + 
				"www.ville-montaigu.fr\n" + 
				"www.musee-deuxvictoires.fr\n" + 
				"Site Vendée-Tourisme\n" + 
				"Site de la ville - www.ville-noirmoutier.fr\n" + 
				"Site de la ville : www.sainthilairederiez.fr\n" + 
				"www.musee-milcendeau.fr\n" + 
				"www.museefrancoamericain.fr\n" + 
				"www.musee-jean-de-la-fontaine.fr ou www.la-fontaine-ch-thierry.net\n" + 
				"http://www.ville-chauny.fr/culture/musee_presentation.php\n" + 
				"www.familistere.com\n" + 
				"\n" + 
				"http://perso.wanadoo.fr/lafere/musee.htm\n" + 
				"www.ville-laon.fr\n" + 
				"\n" + 
				"www.abbaye-saintmichel.com\n" + 
				"Site de la ville\n" + 
				"www.museeantoinelecuyer.fr/ ou www.mquentindelatour.com/\n" + 
				"www.musee-soissons.org\n" + 
				"www.resistance-deportation-picardie.com\n" + 
				"http://museedelathierache.jimdo.com ou www.evasion-aisne.com\n" + 
				"Site de la mairie - www.mairie-villerscotterets.fr\n" + 
				"www.annuaire-mairie.fr/musee-de-la-ceramique-architecturale.html\n" + 
				"http://www.oise.fr/culture-et-vie-locale/le-musee-departemental/\n" + 
				"http://museeraymondpillon.overblog.com\n" + 
				"www.musee-vivenel.fr\n" + 
				"www.musee-chateau-compiegne.fr\n" + 
				"www.musee-chateau-compiegne.fr\n" + 
				"www.musee-figurine.fr\n" + 
				"site de la mairie - www.mairie-creil.fr\n" + 
				"www.musee-archerie-valois.fr\n" + 
				"www.musee-nacre.com\n" + 
				"www.ville-noyon.fr/Le-musee-Jean-Calvin.html\n" + 
				"www.ville-noyon.fr/Le-musee-du-Noyonnais.html\n" + 
				"www.musees-senlis.fr\n" + 
				"Site de la ville\n" + 
				"www.m-a-o.org\n" + 
				"Site de la ville\n" + 
				"www.somme.fr\n" + 
				"www.amiens.com\n" + 
				"\n" + 
				"www.amiens.fr/musees\n" + 
				"http://mairie-doullens.pagesperso-orange.fr/zone1/pageLibre00010098.html\n" + 
				"www.historial.org\n" + 
				"Site internet de la ville www.ville-peronne.fr ou http://www.haute-somme.com/danicourt/\n" + 
				"Site collectif du CMPC : www.Alienor.org\n" + 
				"site de société archéologique - www.archeologie-charente.com\n" + 
				"www.alienor.org\n" + 
				"www.cnbdi.fr ou www.alienor.org\n" + 
				"www.musees-cognac.fr\n" + 
				"www.musees-cognac.fr\n" + 
				"http://www.maisons.parc-marais-poitevin.fr/maison-de-la-mytiliculture/\n" + 
				"http://musee.fouras.assoc.pagespro-orange.fr/\n" + 
				"www.musees-nationaux-napoleoniens.org/index.htm\n" + 
				"www.protestantisme-museelarochelle.fr\n" + 
				"http://www.museum-larochelle.fr\n" + 
				" www.alienor.org\n" + 
				"www.alienor.org\n" + 
				"www.alienor.org\n" + 
				"www.alienor.org\n" + 
				"Site de la ville - www.ville-rochefort.fr\n" + 
				"Site de la ville\n" + 
				"www.musee-marine.fr\n" + 
				"www.alienor.org\n" + 
				"www. ou www.saint-martin-de-re.fr\n" + 
				"www.ville-saintes.fr ou www.alienor.org\n" + 
				"www.ville-saintes.fr ou www.alienor.org\n" + 
				"www.alienor.org\n" + 
				"www.alienor.org\n" + 
				"www.oleron-nature-culture.com ou www.alienor.org\n" + 
				"www.alienor.org ou www.deux-sevres.com/culture/musee-bougon/index.asp\n" + 
				"www.alienor.org\n" + 
				"\n" + 
				"\n" + 
				"www.alienor.org\n" + 
				"www.alienor.org ou www.cc-parthenay.fr/Patrimoine/Musee/presentation/present-2.htm\n" + 
				"http://museeruralies.free.fr\n" + 
				"www.ville-thouars.fr/vah/\n" + 
				"www.alienor.org\n" + 
				"www.alienor.org\n" + 
				"www.chauvigny-patrimoine.fr\n" + 
				"\n" + 
				"www.alienor.org\n" + 
				"www.lasabline.fr ou www.lussac-les-chateaux.fr\n" + 
				"\n" + 
				"www.musees-poitiers.org ou www.alienor.org\n" + 
				"www.musees-poitiers.org\n" + 
				"www.musees.poitiers.org ou www.alienor.org\n" + 
				"www.musees-poitiers.org ou www.alienor.org\n" + 
				"www.maison-des-sciences.org/\n" + 
				"site de la ville - www.barcelonnette.com\n" + 
				"www.musee-gassendi.org\n" + 
				"www.ville-forcalquier.fr/service-culturel.html\n" + 
				"www.musee-de-salagon.com\n" + 
				"http://www.moustiers.eu/?Le-musee#\n" + 
				"www.museeprehistoire.com\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"www.antibes-juanlespins.com\n" + 
				"www.antibes-juanslespins.com/fr/culture/musees\n" + 
				"www.musee-fernandleger.fr ou http://www.musees-nationaux-alpesmaritimes.fr\n" + 
				"http://musee-de-biot.fr/\n" + 
				"www.cagnes-tourisme.com/renoir ou www.chez.com/renoir/cagnes.htm\n" + 
				"Site de la ville\n" + 
				"Site de la ville\n" + 
				"Site de la ville\n" + 
				"www.museesdegrasse.com\n" + 
				"www.museesdegrasse.com\n" + 
				"www.museesdegrasse.com\n" + 
				"www.museebonnard.fr\n" + 
				"Site de la ville\n" + 
				"Site de la ville\n" + 
				"Site de la ville\n" + 
				"www.musees-nationaux-alpesmaritimes.fr\n" + 
				"www.musee-matisse-nice.org\n" + 
				"http://www.nice.fr/mairie_nice_1489.html\n" + 
				"www.arts-asiatiques.com\n" + 
				"www.musee-beaux-arts-nice.org\n" + 
				"Site de la ville : www.nice.fr/Culture/Musees-et-expositions/Musee-d-Art-Naif\n" + 
				"www.musee-archeologique-nice.org ou www.musee-archeologique-nice.org/ ou www.nice-coteazur.org\n" + 
				"www.mhnnice.org ou www.nice-coteazur.org\n" + 
				"http://www.nice.fr/mairie_nice_131.html\n" + 
				"www.mamac-nice.org\n" + 
				"Site de la ville de Nice\n" + 
				"www.musee-archeologique-nice.org\n" + 
				"www.ecomusee-roudoule.fr\n" + 
				"www.museedesmerveilles.com\n" + 
				"www.musees-nationaux-alpesmaritimes.fr ou www.musee-picasso-vallauris.fr\n" + 
				"www.vallauris-golfe-juan.fr/musee.php\n" + 
				"www.villefranche-sur-mer.org\n" + 
				"www.mairie-aixenprovence.fr/Musee-du-Vieil-Aix\n" + 
				"www.mairie-aixenprovence.fr/Pavillon-Vendome ou www.museum-aix-en-provence.org\n" + 
				"www.museegranet-aixenprovence.fr\n" + 
				"www.academiedaix.org\n" + 
				"\n" + 
				"www.atelier-cezanne.com\n" + 
				"www.museum-aix-en-provence.org\n" + 
				"www.parc-camargue.fr\n" + 
				"www.museonarlaten.fr\n" + 
				"www.museereattu.arles.fr\n" + 
				"www.arles-antiques.cg13.fr\n" + 
				"http://samle.legion-etrangere.com\n" + 
				"Site de la ville - www.cassis.fr\n" + 
				"Site de la ville - www.fontvieille.provence.com\n" + 
				"www.ouestprovence.fr\n" + 
				"www.museeciotaden.org\n" + 
				"www.museelambesc.free.fr\n" + 
				"\n" + 
				"http://fondationlouisjou.pagesperso-orange.fr/LouisJou.html\n" + 
				"www.maillane.fr/tourisme/musee.php\n" + 
				"www.mairie-marseille.fr/vivre/culture/musees.htm\n" + 
				"www.mairie-marseille.fr/vivre/culture/musees/cantini.htm\n" + 
				"Site de la ville\n" + 
				"www.mairie-marseille.fr\n" + 
				"www.musees-mediterranee.org/43/fiche-musee.html\n" + 
				"Site de la ville\n" + 
				"www.mairie-marseille.fr/vivre/culture/musees.htm\n" + 
				"\n" + 
				"\n" + 
				"www.marseille.fr\n" + 
				"www.mairie-marseille.fr\n" + 
				"www.mairie-marseille.fr/vivre/culture/musees.htm\n" + 
				"www.museum-marseille.org\n" + 
				"Site de la ville - www.mairie-marseille.fr\n" + 
				"http://www.mucem.org\n" + 
				"www-martigues.fr\n" + 
				"\n" + 
				"http://www.saint-cannat.fr/institutions-culturelles/espace-suffren.html\n" + 
				"www.paullafran.free.fr (site des Amis du musée)\n" + 
				"www.ateliermuseal.net\n" + 
				"www.musees.mediterannee.org\n" + 
				"http://www.saintesmaries.com/fr/accueil/village/le-musee.html\n" + 
				"http://www.visitsalondeprovence.com/fr/quatre_musees.php#guidemusees\n" + 
				"Site de la ville www.salon-de-provence.org - www.visitsalondeprovence.com/fr\n" + 
				"http://museum.cg05.fr/3939-musee-du-vieux-queyras.htm\n" + 
				"http://museum.cg05.fr ou site du conseil général\n" + 
				"\n" + 
				"\n" + 
				"www.museebrignolais.com\n" + 
				"Site de la ville - www.ville-draguignan.fr\n" + 
				"\n" + 
				"www.dracenie.com rubrique musées\n" + 
				"http://musee-artillerie.chez-alice.fr\n" + 
				"www.frejus.fr/Musee_Archeologique__155.html\n" + 
				"www.ville-frejus.fr/hermes/culture/musee.htm\n" + 
				"Site de la ville : http://www.ville-hyeres.fr/\n" + 
				"Site de la ville de Toulon\n" + 
				"www.musee-saintraphael.com\n" + 
				"www.saint-tropez.tv/html/annonciade.html\n" + 
				"www.solliesville.fr\n" + 
				"www.musee-marine.fr/site/fr/toulon_presentation\n" + 
				"Site de la ville\n" + 
				"www.museum-toulon.org\n" + 
				"Site OT de la ville\n" + 
				"www.petit-palais.org\n" + 
				"www.musee-calvet.org & www.musee-lapidaire.org\n" + 
				"www.museum-avignon.org\n" + 
				"Site de la ville\n" + 
				"Site de la ville\n" + 
				"\n" + 
				"www.cavaillon.org\n" + 
				"www.cavaillon.org\n" + 
				"www.cavaillon.org\n" + 
				"http://www.cucuron-luberon.com/musee-marc-deydier/\n" + 
				"www.vaucluse.fr\n" + 
				"www.vaucluse.fr/pages/page/num/519/lan/1\n" + 
				"\n" + 
				"Sie de la ville : http://www.mazan.fr\n" + 
				"www.theatre-antique.com\n" + 
				"Site de la ville - www.mairie-sault-84.fr\n" + 
				"Site de la ville - www.vaison-la-romaine.com\n" + 
				"www.vaucluse.fr/pages/page/num/1037/lan/1\n" + 
				"www.stellamatutina.fr\n" + 
				"www.cg974.fr\n" + 
				"http//www.cg974.fr/museum\n" + 
				"Site internet du Conseil général - http//www.cg974.fr\n" + 
				"http://www.madoi.re/\n" + 
				"www.musees.ain.fr\n" + 
				"http://brou.munuments-nationaux.fr\n" + 
				"\n" + 
				"www.archeologie-izernore.com\n" + 
				"www.musees.ain.fr\n" + 
				"www.musees.ain.fr\n" + 
				"Site de la ville : www.ville-oyonnax.fr/culture/museepeigneetplast.php\n" + 
				"www.ostelleriedeperouges.com\n" + 
				"www.musee-chintreuil.com\n" + 
				"www.musees.ain.fr\n" + 
				"\n" + 
				"\n" + 
				"www.treffort-cuisiat.com/musee.htm\n" + 
				"\n" + 
				"www.cc-bassin-annonay.fr/-Le-Musee-Cesar-Filhol-.html\n" + 
				"\n" + 
				"www.orgnac.com\n" + 
				"\n" + 
				"www.serrieres-ardeche.fr\n" + 
				"www.soyons.fr\n" + 
				"www.ville-tournon.com/chateau-musee\n" + 
				"www.museediois.wix.com/musee\n" + 
				"\n" + 
				"www.cg26.fr/fr/tourisme/chateaux/montelimar.html\n" + 
				"http://museeartsacre.free.fr\n" + 
				"www.ville-romans.com\n" + 
				"www.ville-saintpaultroischateaux.fr/-Musee-d-archeologie-tricastine-.html\n" + 
				"www.musee-valence.org\n" + 
				"www.prehistoire-vercors.fr\n" + 
				"http://musees.agglo-annecy.fr\n" + 
				"Site de la ville - www.chamonix.com\n" + 
				"www.chateaudemontrottier.com ou www.academie-florimontane.fr\n" + 
				"\n" + 
				"\n" + 
				"Site de la ville\n" + 
				"www.musee-hydrelec.fr\n" + 
				"www.museedallevard@wordpress.com\n" + 
				"www.musee.alpedhuez.com\n" + 
				"www.musee-archeologique-aoste.fr\n" + 
				"www.bourgoinjallieu.fr\n" + 
				"www.museelacdepaladru.com\n" + 
				"www.ville-echirolles.fr/sortir/geocharles/geocharles.html\n" + 
				"www.museedegrenoble.fr\n" + 
				"www.musee-archeologique-grenoble.com\n" + 
				"www.resistance-en-isere.fr\n" + 
				"Site du patrimoine de l'Isère - www.patrimoine-en-isere.fr\n" + 
				"www.museum-grenoble.fr\n" + 
				"www.musee-dauphinois.fr\n" + 
				"www.musee.larina-hieres.com ou Site du patrimoine en isère - www.patrimoine-en-isere.fr\n" + 
				"www.matheysine.com/musee-mathesin ou www.patrimoine-en-isere.fr\n" + 
				"www.musee-hebert.fr\n" + 
				"www.musee-hector-berlioz.com\n" + 
				"www.musee-grande-chartreuse.fr\n" + 
				"www.musees-vienne.fr - Site du patrimoine de l'Isère\n" + 
				"www.musees-vienne.fr  Site du patrimoine de l'Isère\n" + 
				"www.musees-vienne.fr  - Site du patrimoine de l'Isère\n" + 
				"www.musee-revolution-francaise.fr\n" + 
				"www.ville-voiron.fr\n" + 
				"http://alicetaverne-musee.pagesperso-orange.fr/accueil/accueil.html\n" + 
				"http://www.ville-charlieu.fr/avoir/musees/musee-de-la-soierie\n" + 
				"http://www.ville-charlieu.fr/avoir/musees/le-musee-hospitalier\n" + 
				"www.museeduchapeau.com\n" + 
				"\n" + 
				"Site de la ville : www.feurs.org\n" + 
				"\n" + 
				"Site de la ville\n" + 
				"www.ladiana.com\n" + 
				"\n" + 
				"L'Ecomusée du Roannais a récupéré les collections du musée\n" + 
				"Site de la mairie\n" + 
				"\n" + 
				"www.mam-st-etienne.fr/\n" + 
				"www.musee-mine.saint-etienne.fr OU site de la ville : www.saint-etienne.fr\n" + 
				"www.vieux-saint-etienne.com\n" + 
				"www.musee-art-industrie.saint-etienne.fr ou www.saint-etienne.fr rubrique vivre la culture\n" + 
				"Site du conseil général\n" + 
				"\n" + 
				"\n" + 
				"www.ecomusee-usson-en-forez.fr\n" + 
				"www.graha-museethimonnier.org site de la ville\n" + 
				"www.beaujeu.com/musee.html ou http://www.culture-beaujolais.fr/?Musee-des-Arts-et-des-Traditions\n" + 
				"www.moca-lyon.org\n" + 
				"www.imprimerie.lyon.fr\n" + 
				"www.musee-des-tissus.com\n" + 
				"www.chu-lyon.fr/internet/chu/musee/presentation_musee.htm\n" + 
				"www.musee-des-tissus.com\n" + 
				"www.mba-lyon.fr\n" + 
				"www.musees-gallo-romains.com\n" + 
				"www.museedesconfluences.fr\n" + 
				"www.museepompiers.com/\n" + 
				"www.chrd.lyon.fr\n" + 
				"www.museedesconfluences.fr\n" + 
				"www.gadagne.musees.lyon.fr\n" + 
				"www.musee-malartre.com\n" + 
				"www.musees-gallo-romains.com ou www.rhone.fr\n" + 
				"http://www.haut-beaujolais.org\n" + 
				"www.musee-paul-dini.com\n" + 
				"www.aimesavoie.com (site de l'OT)\n" + 
				"\n" + 
				"Site de la ville - www.aixlesbains.fr\n" + 
				"www.albertville.com\n" + 
				"\n" + 
				"Site du conseil général ou www.musee-savoisien.fr\n" + 
				"Site de la ville - www.chambery.fr\n" + 
				"Site de la mairie\n" + 
				"\n" + 
				"Site de l'Académie - http://academie.sup.fr\n" + 
				"www.arche-musee-et-archive.net\n" + 
				"";

		Map<String,Integer> map = new HashMap<String,Integer>();

		int j=1;
		for (String i : tmp.split("\n")){			
			if (i.length() > 0){
				map.put(i,j);
				j++;
			}
		}

		Writer writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("owl/split/sw.txt"), "utf-8"));

			for (String k : map.keySet()){
				String toAdd = "###  http://www.musee.com/ontologies/musee.owl#SW_"+map.get(k)+"\n\n";
				toAdd += ":SW_"+map.get(k)+" rdf:type owl:NamedIndividual ;\n\n";
				toAdd += "    :aURL \""+k+"\" .\n\n\n\n";
				writer.write(toAdd);
			}

		} catch (IOException ex) {
			// report
		} finally {
			try {writer.close();} catch (Exception ex) {}
		}

		/*for (String i : tmp.split("\n")){
			if (i.length() == 0)
				System.out.println("");
			else
				System.out.println("SW_"+map.get(i));
		}*/

	}

}
