package genowl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Adresse {

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

		String tmp = "30, Rue du Dr Sultzer\n" + 
				"2, rue de Kuhlendorf\n" + 
				"2, Place du Château Halle aux Blés\n" + 
				"1, place Joseph Thierry\n" + 
				"9, Rue du Maréchal Foch B.P. 40261\n" + 
				"4, Cour des Chartreux\n" + 
				"44, Avenue Foch\n" + 
				"24, rue du Docteur Albert Schweitzer\n" + 
				"9, rue Jeanne d'Arc\n" + 
				"Château des Rohans Place du Général de Gaulle\n" + 
				"Palais Rohan 2, Place du Château\n" + 
				"Palais Rohan 2, Place du Château\n" + 
				"Palais Rohan 2, Place du Château\n" + 
				"3, Place de la Grande-Boucherie\n" + 
				"29, Boulevard de la Victoire\n" + 
				"Villa Greiner 2, avenue de la Marseillaise\n" + 
				"23-25, Quai Saint-Nicolas\n" + 
				"3, Place du Château\n" + 
				"5, Place du Château\n" + 
				"1 place Hans Jean Arp\n" + 
				"25, Montée Oberlin\n" + 
				"40 rue du Hochberg\n" + 
				"3, rue du Musée\n" + 
				"2, Rue du Moulin\n" + 
				"1, Rue de l'Hôtel de Ville\n" + 
				"Place de la Mairie\n" + 
				"1, Rue de Thann\n" + 
				"11, Rue Turenne\n" + 
				"1, rue Unterlinden\n" + 
				"30, Rue des Marchands\n" + 
				"1, Rue du Quatre Février\n" + 
				"6, rue des Boulangers\n" + 
				"64, avenue du Général de Gaulle\n" + 
				"Château de la Confrérie St-Etienne\n" + 
				"4, Place Guillaume-Tell\n" + 
				"4, Rue des Archives\n" + 
				"Association des Amis du Musée 4, Boulevard de la Marseillaise\n" + 
				"2, rue Alfred de Glehn\n" + 
				"3, Avenue Alfred-Werner\n" + 
				"55, rue du Pâturage B.P. 52463\n" + 
				"192, Avenue de Colmar CS 91096\n" + 
				"14, rue Jean-Jacques Henner B.P. 1468\n" + 
				"7, Place de la Porte de Belfort\n" + 
				"10, rue Principale\n" + 
				"Rue du Général de Gaulle\n" + 
				"La Commanderie  28, rue Zuber B.P. 41\n" + 
				"24, Rue Saint Thiébaut\n" + 
				"B.P. 71\n" + 
				"Maison Peyrarède Place du Feu\n" + 
				"Bourdeilles\n" + 
				"Boulevard Charlemagne\n" + 
				"Site Bella-Riva\n" + 
				"Place de la Halle\n" + 
				"B.P. 7\n" + 
				"Place Bertran de Borne\n" + 
				"2, Rue Raoul Grassin\n" + 
				"Avenue du Général Leclerc\n" + 
				"32, Rue des Farges\n" + 
				"22, Cours Tourny\n" + 
				"Parc de Vésone 20, Rue du 26ème Régiment d'Infanterie\n" + 
				"3 rue Jean Gabin\n" + 
				"B.P. 163\n" + 
				"Hôtel de ville Place de la liberté\n" + 
				"Mairie de Blasimon\n" + 
				"Citadelle de Blaye\n" + 
				"Conservatoire de l'Image Industrielle 20 Cours Pasteur\n" + 
				"Direction des établissements culturels 48, rue Vital Carles\n" + 
				"5, Place Bardineau\n" + 
				"Entrepôt 7, Rue Ferrère\n" + 
				"20, Cours D'Albret\n" + 
				"20, Cours Pasteur\n" + 
				"Hôtel de Lalande 39, Rue Bouffard\n" + 
				"3, Place de la Citadelle\n" + 
				"Esplanade Charles de Gaulle\n" + 
				"42, Place  Abel Surchamp\n" + 
				"14 Avenue Colonel Fabien\n" + 
				"Logis Mallet\n" + 
				"Maison Braneyre Impasse Dupeyron\n" + 
				"332, Avenue Louis Breguet\n" + 
				"Mairie de Dax Service du musée Borda 14, Rue Saint Pierre B.P. 50344\n" + 
				"Abbaye d'Arthous\n" + 
				"101, Rue Jacques Desert\n" + 
				"6, Place Marguerite de Navarre\n" + 
				"Domaine de Carcher 480, Chemin du Sala b;p; 24 B.P. 24\n" + 
				"Eglise Notre-Dame\n" + 
				"Route de Soférino\n" + 
				"Rue du Général Lamarque\n" + 
				"2378, Route d'Hagetmau\n" + 
				"112, Place de la Mairie\n" + 
				"Place du Dr Pierre Esquirol\n" + 
				"15, Rue Abel Boyé\n" + 
				"Rue du Puits Saint Côme\n" + 
				"Rue Henri IV\n" + 
				"Le Bourg\n" + 
				"2, Rue du Jardins\n" + 
				"Rue de l'Eglise\n" + 
				"5, Rue Jacques-Laffitte\n" + 
				"Mairie de Bayonne Plaine d'Ansot\n" + 
				"37, Quai des Corsaires\n" + 
				"Villa Arnaga Route du Docteur Camino\n" + 
				"Parc municipal André Narbaits  117, Avenue du Général de Gaulle\n" + 
				"8, Rue Tran\n" + 
				"Rue Mathieu Lalanne\n" + 
				"Association Régionaliste de Pyrénées 7 avenue Henri Faisans\n" + 
				"Rue de l’Église\n" + 
				"5, Rue Charles-Louis Philippe\n" + 
				"Place Rantian\n" + 
				"Michel LABONNE Secrétaire des Amis du Muséee 149, Route de Bourgogne\n" + 
				"BP 3249 (Château des Ducs de Bourbons)\n" + 
				"Quartier Villars Route de montilly\n" + 
				"1, Avenue Victor Hugo B.P. 1669\n" + 
				"Hôtel de Ville Boulevard des Arène - B.P. 10\n" + 
				"Place Aristide Briand\n" + 
				"11, Rue Mounin\n" + 
				"Château Saint Etienne\n" + 
				"Centre Culturel Pierre Mendès France 37, rue des Carmes\n" + 
				"La Tour Jardin de Saint-Martin\n" + 
				"Palais épiscopal 1, Place d'Armes\n" + 
				"Maison consulaire 17, Place d'Armes\n" + 
				"Place de l'église\n" + 
				"15 place Picard\n" + 
				"Jardin Henri Vinay\n" + 
				"14, avenue de la Gare\n" + 
				"Quartien Villeneuve\n" + 
				"53, Route Nationale\n" + 
				"Quartier historique de Montferrand Place Louis Deteix\n" + 
				"45, rue Ballainvilliers\n" + 
				"15, rue Bardoux\n" + 
				"39, Rue de la République B.P. 30\n" + 
				"Place de l'Eglise\n" + 
				"Le Bourg\n" + 
				"Place de l'Abbaye\n" + 
				"Parc du Prélong\n" + 
				"14, Rue de l'Hôtel de Ville\n" + 
				"10 bis, Rue Delile\n" + 
				"58, Rue de la Coutellerie\n" + 
				"2, rue des Ecoles\n" + 
				"1, Route des Trois Ormeaux\n" + 
				"Bibliothèque Municipale Passage Xavier Girault\n" + 
				"Hôtel de Ville\n" + 
				"Hôtel des Ducs Rue d'Enfer\n" + 
				"Porte Marie de Bourgogne 6, boulevard Perpreuil\n" + 
				"La Grande Forge\n" + 
				"14, Rue de la Libération\n" + 
				"Monastère des Bernardines 15-17, rue Sainte-Anne\n" + 
				"Monastère des Bernardines 15-17, rue Sainte-Anne\n" + 
				"4, rue des Bons Enfants\n" + 
				"8, Rue Vaillant\n" + 
				"Parc de l'Arquebuse 14, Rue Jehan de Marville\n" + 
				"Palais des Ducs et des Etats de Bourgogne B.P. 1510\n" + 
				"5, Rue du Docteur Maret B.P. 1510\n" + 
				"Clos Napoléon\n" + 
				"1 PLACE DE LA FONTAINE\n" + 
				"Chapelle des Ursulines Rue Piron\n" + 
				"Anciennes Ecuries de Buffon B.P. 90\n" + 
				"12, Rue Camille Rodier\n" + 
				"3, Place du Docteur Roclore\n" + 
				"3, Rue Jean-Jacques Collenot\n" + 
				"16-18, rue Saint Christophe\n" + 
				"6, rue du Château\n" + 
				"Avenue de la République\n" + 
				"Place de la Résistance\n" + 
				"33, Rue des Chapelains\n" + 
				"1, Avenue de la République\n" + 
				"16, rue Saint-Genest\n" + 
				"Société Nivernaise des Lettres et Sciences et Arts Rue de la Porte du Croux\n" + 
				"17, quai Jules-Pabiot\n" + 
				"Château de Saint-Amand\n" + 
				"Place de la Mairie\n" + 
				"14, Rue Saint-Antoine\n" + 
				"Rue des Sous-Chantres\n" + 
				"5, rue des Bancs\n" + 
				"Rue Saint Nicolas\n" + 
				"34, rue du Bois Clair\n" + 
				"Rue St Nazaire\n" + 
				"28, Quai des Messageries\n" + 
				"Place de l'hotel de ville\n" + 
				"Rue du Prieuré\n" + 
				"32, rue René Davoine\n" + 
				"Palais Jean de Bourbon Parc abbatial\n" + 
				"Château de la Verrerie B.P. 53\n" + 
				"29, Rue des Dodânes\n" + 
				"5, rue des Ursulines\n" + 
				"41, Rue Sigorgne\n" + 
				"7-9, rue de la Tour\n" + 
				"13, Rue de la Paix\n" + 
				"Avenue Jean-Paul II\n" + 
				"Château départemental\n" + 
				"Le Bourg\n" + 
				"Le Champ Bressan\n" + 
				"1 rue Fontaine\n" + 
				"8, Place de l'Abbaye\n" + 
				"21, rue de l'hôpital\n" + 
				"2, Rue de l'Egalité\n" + 
				"9 bis, Rue d'Egleny\n" + 
				"Abbaye St-Germain 2 bis, Place Saint-Germain\n" + 
				"5, Boulevard Vauban\n" + 
				"5, Rue du Collège B.P. 67\n" + 
				"25, Rue de l'Eglise\n" + 
				"Place de l'hôtel de ville\n" + 
				"Château\n" + 
				"Place de la Cathédrale\n" + 
				"22, Rue Rougemont\n" + 
				"Rue Saint-Etienne Maison Romain-Rolland\n" + 
				"Porte de Joigny et 2, Rue Carnot\n" + 
				"Rue Paul-Huillard\n" + 
				"Rue du Château\n" + 
				"Place du Martray B.P. 70418\n" + 
				"Cour Francis Renaud Rue des Lycéens Martyrs\n" + 
				"24, Rue Traverse\n" + 
				"Château de Brest\n" + 
				"Moulins de Kerouat\n" + 
				"3, Rue Vauban B.P. 118\n" + 
				"Place de l'Enfer\n" + 
				"Place des Jacobins\n" + 
				"Le Créac'h\n" + 
				"Le Niou Huella\n" + 
				"Place de l'Hôtel de Ville\n" + 
				"Square de l'Europe\n" + 
				"40, Place Saint-Corentin\n" + 
				"Palais des Evêques 1, Rue du Roi Gradlon\n" + 
				"Maison Cornec\n" + 
				"Kergroas\n" + 
				"2, Rue du Château\n" + 
				"Manoir de la Faucillonnaie\n" + 
				"20, Quai Emile Zola\n" + 
				"Ferme de la Bintinais Route de Noyal-Châtillon-sur-Seiche\n" + 
				"46, boulevard Magenta CS 51138\n" + 
				"Château Esplanade Félicité Lamennais - B.P. 147\n" + 
				"Tour Solidor Esplanade du Commandant Menguy - B.P. 147\n" + 
				"15, Rue Pasteur\n" + 
				"Route d'Argentré du Plessis\n" + 
				"Place du Château\n" + 
				"Rue de la Mairie\n" + 
				"10, Place de la chapelle\n" + 
				"Port-Tudy\n" + 
				"Mail François Giovannelli\n" + 
				"1, Rue de Quimper\n" + 
				"Citadelle de Port-Louis\n" + 
				"Citadelle de Port-Louis\n" + 
				"Les Hardys-Behelec\n" + 
				"Cours Martin Luther King\n" + 
				"Château Gaillard 2, Rue Noé\n" + 
				"9 et 15 Place Saint-Pierre\n" + 
				"Hôtel des Echevins 13, Rue Edouard Branly\n" + 
				"Place Etienne Dolet\n" + 
				"Parc Saint-Paul\n" + 
				"Hôtel Cujas 4, Rue des Arènes\n" + 
				"Hôtel Lallemant 5, Rue de l'Hôtel Lallemant\n" + 
				"10-12, Rue de la Victoire\n" + 
				"Place du Général Leclerc\n" + 
				"Cours Manuel\n" + 
				"Service patrimoine Place Aristide Briand\n" + 
				"Rue des Ecoles\n" + 
				"Direction des Arts et du Patrimoine Culturel et Historique 29, Cloître Notre-Dame\n" + 
				"5 bis, Bd de la Courtille\n" + 
				"1, rue de la République\n" + 
				"3, rue Toufaire\n" + 
				"5-7, Place du musée\n" + 
				"4, rue du Docteur Proust B.P. 20025\n" + 
				"Rue du Château\n" + 
				"Place Farcot\n" + 
				"Rue Charles Brillaud BP 154\n" + 
				"35 Rue Hersent Luzarche\n" + 
				"2, Rue Descente-des-Cordeliers\n" + 
				"23, Rue de l'Hospice Saint-Roch B.P. 150\n" + 
				"71, Rue Venôse\n" + 
				"Palai du Roi\n" + 
				"Château Naillac\n" + 
				"Les Mersans B.P. 6\n" + 
				"6, Rue Joyeuse\n" + 
				"60, Rue Concorde B.P. 247\n" + 
				"44, Rue Haute-Saint-Maurice\n" + 
				"29, Rue Descartes\n" + 
				"Château du Grand-Pressigny\n" + 
				"1 impasse Harry\n" + 
				"1, rue Lansyer\n" + 
				"1, Place du Marché\n" + 
				"Château de Saché\n" + 
				"Place du Château\n" + 
				"10, Faubourg Rue\n" + 
				"80, Route de Candes\n" + 
				"Maison de la Devinière\n" + 
				"3, Rue du Président Merville\n" + 
				"Cloître Saint-Julien 8, Rue Nationale\n" + 
				"Cellier Saint-Julien 16, Rue Nationale\n" + 
				"18, Place François Sicard\n" + 
				"25, Rue du Commerce B.P. 1105\n" + 
				"Place du Musée\n" + 
				"Château de Blois\n" + 
				"Les Jacobins  Rue Anne de Bretagne\n" + 
				"1, Place du Château\n" + 
				"Château de la Corbillière\n" + 
				"106, Rue des Venages\n" + 
				"Moulin du Chapitre B.P. 147\n" + 
				"Hôtel de Ville\n" + 
				"Cloître de la Trinité\n" + 
				"Quartier du Paradis\n" + 
				"Hôtel de Ville - Service patrimoine 20, Rue du Change\n" + 
				"Ecuries du Château 1, Place Aristide Briand\n" + 
				"2, Faubourg Puyrault\n" + 
				"Château de Gien B.P. 99\n" + 
				"Espace culturel La Monnaye 22 Rue des Remparts\n" + 
				"2, rue de la Chaussée\n" + 
				"7, Rue du Château\n" + 
				"6, Rue Marcel Proust\n" + 
				"1, rue Fernand Rabier\n" + 
				"Square Abbé Desnoyers Hôtel Cabu\n" + 
				"Direction de l'action culturelle 5, Place Denis Poisson - B.P. 706\n" + 
				"12 Avenue de la Dernière Cartouche\n" + 
				"31, Place Ducale\n" + 
				"Quai Arthur Rimbaud\n" + 
				"Mairie 11, Place Carnot\n" + 
				"Mairie\n" + 
				"Place Noiret-Chaigneau\n" + 
				"BP 10322\n" + 
				"Hôtel de ville Place Carnot - B.P. 110\n" + 
				"34, Rue de l'Ecole Militaire\n" + 
				"Rue Boursault\n" + 
				"Rue Gué de la Loge B.P. 40\n" + 
				"4, Rue Vauluisant\n" + 
				"14, Place Saint-Pierre\n" + 
				"1, Rue Chrestien-de-Troyes\n" + 
				"4, Rue Chrestiens de Troyes\n" + 
				"Conservation des Musées  2, rue Chrestien de Troyes\n" + 
				"Quai des Comtes-de-Champagne\n" + 
				"7, Rue de La Trinité\n" + 
				"Pôle Culturel - Médiathèque-musée de France Parc du Château\n" + 
				"7/9, Avenue Foch\n" + 
				"Place du Palais\n" + 
				"164 rue Auguste Petit\n" + 
				"Place du Centenaire B.P. 183\n" + 
				"Place Charles de Gaulle B.P. 1\n" + 
				"17, Rue de la Victoire\n" + 
				"13, rue Pasteur\n" + 
				"Place Alexandre Godart\n" + 
				"Rue Nicolas Durant\n" + 
				"13, Avenue de Champagne\n" + 
				"Maison du Parc Chemin de Nanteuil\n" + 
				"36, Place du Forum\n" + 
				"Direction de la Culture de la ville de Reims 1, place Museux\n" + 
				"8, Rue Chanzy\n" + 
				"53, rue Simon\n" + 
				"Place Général Leclerc\n" + 
				"Rue Saint-Charles\n" + 
				"50-52, rue du Cardinal Fesch\n" + 
				"Hotel de Ville Avenue Antoine Serafini\n" + 
				"Avenue Lieutenant Aviateur de Peretti Quartier Pratu\n" + 
				"Boulevard Jacques Nicolai\n" + 
				"Fort de Matra\n" + 
				"Mairie de Bastia Avenue Pierre Giudicelli\n" + 
				"La Citadelle B.P. 73\n" + 
				"Mairie de Lucciana\n" + 
				"Hameau de la Stretta 20261\n" + 
				"LA CITADELLE Rue des Fusillés\n" + 
				"1, Place de la Révolution\n" + 
				"La Citadelle Rue des Fusillés de la Résistance\n" + 
				"La Citadelle Rue des Fusillés\n" + 
				"96, Grande rue\n" + 
				"8, Place Saint-Martin B.P. 95287\n" + 
				"B.P. 95287\n" + 
				"Rue du Musée\n" + 
				"Place Robert Fernier\n" + 
				"2, Place d'Arçon\n" + 
				"Château de Champlitte\n" + 
				"206, Le Petit Fahyr\n" + 
				"6, rue Pigalle B.P. 89\n" + 
				"Château-Lambert\n" + 
				"36, Rue Victor Genoux\n" + 
				"1, Rue des Ursulines\n" + 
				"Grande Rue\n" + 
				"Château Pécauld B.P. 41\n" + 
				"26, rue Baronne Delort\n" + 
				"85, rue des Arènes\n" + 
				"Place Philibert de Châlon\n" + 
				"7, Rue des Cordeliers\n" + 
				"5, Rue du Murgin\n" + 
				"Place Jean Jaurès\n" + 
				"Hôtel de Ville 49, Grande Rue\n" + 
				"3, Place de l'Abbaye\n" + 
				"Place des Salines\n" + 
				"Place des Salines\n" + 
				"Abbaye de Baume-Les-Messieurs\n" + 
				"16, Rue Frédéric Japy\n" + 
				"Château de Belfort B.P. 733\n" + 
				"Musée(s) de Belfort B.P. 20223\n" + 
				"2, Rue de Lamadeleine\n" + 
				"Fort Louis Delgrès\n" + 
				"Habitation Murat\n" + 
				"440 Route de la Rosette\n" + 
				"9, rue de Nozière\n" + 
				"Office du Tourisme 1 Centre Commercial Marina\n" + 
				"24, Rue Peynier\n" + 
				"78, Rue Mme Payé\n" + 
				"1, Avenue du Général-de-Gaulle\n" + 
				"Rue Gaston Monnerville Le Bourg\n" + 
				"78, Rue de Paris\n" + 
				"5, Place des Droits de l'Homme\n" + 
				"16, Rue du Réveillon\n" + 
				"Place du Général de Gaulle\n" + 
				"Mairie d'Etampes B.P. 109\n" + 
				"Espace Landowski 28, avenue André Morizet\n" + 
				"14, Rue Max Blondat\n" + 
				"Château Buchillot 14, Rue de l'Abreuvoir\n" + 
				"10-14, Rue du Port\n" + 
				"21, Rue des Châtaigniers\n" + 
				"2, Rue Gabriel Péri\n" + 
				"Parc de Bécon 178, Boulevard Saint Denis\n" + 
				"Mairie de Courbevoie\n" + 
				"16, Rue Auguste Gervais\n" + 
				"19, Avenue Auguste Rodin\n" + 
				"11, Rue des Pierres\n" + 
				"Hôtel Arturo Lopez 12, Rue du Centre\n" + 
				"Avenue du Château de Malmaison\n" + 
				"13, Boulevard Foch\n" + 
				"13, Boulevard Foch\n" + 
				"Jardin des Avelines 60, Rue Gounod\n" + 
				"14 avenue Du Petit Homme\n" + 
				"2, Place de la Manufacture\n" + 
				"Avenue Charles de Gaulle Passerelle des Arts\n" + 
				"6, Place Paul Painlevé\n" + 
				"60, rue des Archives\n" + 
				"Hôtel de Saint-Aignan 71, Rue du Temple\n" + 
				"Hôtel Salé 5, Rue de Thorigny\n" + 
				"8, Rue Elzévir\n" + 
				"23, Rue de Sévigné\n" + 
				"57, Rue Cuvier\n" + 
				"10, Rue des Fossés Saint-Marcel\n" + 
				"Jardin des Plantes 2, rue Buffon\n" + 
				"Rocade Sud\n" + 
				"Jardin des Plantes 36, Rue Geoffroy Saint-Hilaire\n" + 
				"6, Place des Vosges\n" + 
				"7, Parvis Notre-Dame Place Jean Paul II\n" + 
				"107, Rue de Rivoli\n" + 
				"6, Rue Furstenberg\n" + 
				"Jardin des Plantes 36, rue Geoffroy Saint-Hilaire\n" + 
				"Hôtel National des Invalides 129, rue de Grenelle\n" + 
				"47, rue Raynouard\n" + 
				"34, Quai du Louvre\n" + 
				"17, Place du Trocadéro\n" + 
				"23, Allée de la 2ème DB\n" + 
				"93, avenue de France\n" + 
				"43, Avenue de Villiers\n" + 
				"12, Rue Cortot\n" + 
				"25, Rue de l'Yvette\n" + 
				"7, Avenue Velasquez\n" + 
				"1, avenue du Colonel Henri Rol-Tanguy (Place Denfert-Rochereau)\n" + 
				"100 bis, rue d'Assas\n" + 
				"10, Avenue Pierre 1er de Serbie\n" + 
				"62, Rue de Lille\n" + 
				"2, Rue de la Légion d'Honneur\n" + 
				"221, Avenue Jean-Jaurès\n" + 
				"Avenue Winston-Churchill\n" + 
				"16, Rue Chaptal\n" + 
				"107, Rue de Rivoli\n" + 
				"293, avenue Daumesnil\n" + 
				"Palais de la Porte Dorée 293, avenue Daumesnil\n" + 
				"4 rue Marie-Rose\n" + 
				"63, Rue de Monceau\n" + 
				"Hôtel de Montmorency-Bours 85, Rue du Cherche Midi\n" + 
				"Palais de Chaillot 1, Place du Trocadéro et du 11 Novembre\n" + 
				"1, Rue des Fossés Saint-Bernard Place Mohammed V\n" + 
				"107, Rue de Rivoli\n" + 
				"Hôtel Biron 77, rue de Varenne\n" + 
				"14, Rue de la Rochefoucauld\n" + 
				"16, Rue Cadet\n" + 
				"Jardin des Tuileries\n" + 
				"11, Avenue du Pdt Wilson\n" + 
				"59, Avenue Foch\n" + 
				"6, Avenue du Mahatma Gandhi\n" + 
				"16, Rue Antoine Bourdelle\n" + 
				"Place du Trocadéro\n" + 
				"6, Place d'Iéna\n" + 
				"292, rue Saint-Martin\n" + 
				"Place Georges Pompidou\n" + 
				"1, Place Alphonse Laveran\n" + 
				"11, Quai de Conti\n" + 
				"222, rue de l'Université\n" + 
				"34, Boulevard de Vaugirard\n" + 
				"92, Grande Rue\n" + 
				"Place de la République\n" + 
				"1, Rue Gabriel de Mortillet\n" + 
				"Hôtel de Ville B.P. 171\n" + 
				"13, Rue Louis-Braille\n" + 
				"Rue de La Cité\n" + 
				"88, Rue St-Honoré\n" + 
				"Château de Fontainebleau\n" + 
				"8, Cour Pierre Herbin\n" + 
				"937, Rue Chapu\n" + 
				"5, Place Charles de Gaulle\n" + 
				"Rue Lazare Ponticelli\n" + 
				"Ecole des Officiers de la Gendarmerie Nationale 8, rue Emile Leclerc\n" + 
				"5, Rue du Franc Mûrier\n" + 
				"Place de Samois\n" + 
				"48, Avenue Etienne Dailly\n" + 
				"Rue Gautier 1er\n" + 
				"7, rue du Palais\n" + 
				"17, Avenue de la Ferté-Sous-Jouarre\n" + 
				"Ferme de CouleOUIn Place Georges Henri Rivière\n" + 
				"Pont de Valvins 4, Promenade Stéphane Mallarmé\n" + 
				"Aéroport de Paris - Le Bourget BP 173\n" + 
				"Avenue du Consul Général Nordling\n" + 
				"31, Boulevard Théophile Sueur\n" + 
				"22 bis, rue Gabriel Péri\n" + 
				"12, Rue Albert Dhalenne\n" + 
				"5, rue Pierre-Guienne\n" + 
				"Château\n" + 
				"Place du Château\n" + 
				"46, Grande Rue\n" + 
				"56, Rue de Paris\n" + 
				"5, Rue Jean-Jacques Rousseau\n" + 
				"4, Rue Lemercier\n" + 
				"17, Rue du Château\n" + 
				"1, Grande Rue Charles de Gaulle\n" + 
				"Parc Vercors 88, Avenue Marx Dormoy - B.P. 135 B.P. 135\n" + 
				"Ferme de Cottinville 41, rue Maurice Ténine\n" + 
				"5, Rue Saint-Hilaire\n" + 
				"Ecole Nationale Vétérinaire d'Alfort 7, Avenue du Gal de Gaulle\n" + 
				"36, Boulevard Gallieni\n" + 
				"31, rue Louis-Lenoir\n" + 
				"Place de la Libération B.P. 147\n" + 
				"Château du Prieuré 3, Place Gévelot\n" + 
				"Château de l'Eglantine 54, rue Charles de Gaulle\n" + 
				"La Grille Royale Parc de Marly\n" + 
				"Route des Granges\n" + 
				"1, Rue Thiers\n" + 
				"24, rue Quincampoix\n" + 
				"26, Rue Pasteur\n" + 
				"5, Rue Maurice Ravel\n" + 
				"1, Enclos de l'Abbaye\n" + 
				"12, Rue Saint-Louis\n" + 
				"4, Place Jeanne d'Arc\n" + 
				"Espace Véra 2, Rue Henri IV\n" + 
				"2 bis, Rue Maurice Denis B.P. 60222\n" + 
				"Château Place Charles de Gaulle\n" + 
				"B.P. 46\n" + 
				"Domaine de Coubertin\n" + 
				"54, Boulevard de la Reine\n" + 
				"R.P. 834\n" + 
				"2, Avenue du Razès\n" + 
				"1, Rue de Verdun\n" + 
				"Rampe du Presidial B.P. 1100\n" + 
				"Mairie\n" + 
				"Promenade du Tivoli B.P. 88\n" + 
				"B.P. 823\n" + 
				"B.P. 823\n" + 
				"Allée des Potiers\n" + 
				"Place de la Libération\n" + 
				"Rue Jean Mayodon\n" + 
				"Rue de Brouzen Pôle culturel de Rochebelle\n" + 
				"Hôtel de ville place Mallet\n" + 
				"24, avenue Paul Langevin\n" + 
				"Mairie Rue de l'Hôtel de ville\n" + 
				"1, Rue des Calquières\n" + 
				"13, Boulevard Amiral Courbet\n" + 
				"Place aux Herbes\n" + 
				"6, Rue Alexandre Ducros\n" + 
				"Place de la Maison Carrée\n" + 
				"13 Bis, Bd Amiral Courbet\n" + 
				"Rue Cité Foulc\n" + 
				"Place de l'Ancienne Mairie\n" + 
				"Maison des Chevaliers 2, Rue Saint-Jacques\n" + 
				"Place de la Maison Romane B.P. 77\n" + 
				"B.P. 08\n" + 
				"Ancien Evêché BP 103\n" + 
				"3, Rue de la République\n" + 
				"5 rue de la Fraternité\n" + 
				"Rampe du 96ème caserne Saint Jacques\n" + 
				"15 Place Pierre Semard\n" + 
				"Place de la Révolution\n" + 
				"Quai du Port de Pêche\n" + 
				"4 bis, Rue Lucien Salette\n" + 
				"Espace Campanaire André-Malraux\n" + 
				"390, Avenue de Pérols\n" + 
				"Mas de La Clape\n" + 
				"1, Rue du Musée\n" + 
				"Hôtel du Cardinal de Fleury Square Georges Auric\n" + 
				"Place du Monument aux Morts\n" + 
				"6, bis rue Montpelliéret\n" + 
				"Hôtel de Varennes 2, Place Pétrarque\n" + 
				"13, rue Montpellieret\n" + 
				"Hôtel des Trésoriers de France 7, Rue Jacques-Cœur\n" + 
				"951, Avenue Agropolis\n" + 
				"Hôtel de ville Rue des Lavoirs\n" + 
				"3, Rue Albert-Paul Allies\n" + 
				"8, Grand'Rue\n" + 
				"148, Rue François Desnoyer\n" + 
				"3, Rue de l'Epine\n" + 
				"Route de Finiels\n" + 
				"8, Bd Maréchal Joffre B.P. 60413\n" + 
				"Villa Pams Route de Port-Vendres\n" + 
				"Château Roussillon\n" + 
				"12, Place Fontaine Neuve\n" + 
				"42, Avenue de Grande-Bretagne B.P. 931\n" + 
				"16, rue de l'Ange B.P. 931\n" + 
				"Mairie de Perpignan B.P. 931\n" + 
				"Mairie\n" + 
				"Cal Mateu\n" + 
				"Avenue Léon-Jean Grégory\n" + 
				"26 bis, boulevard Jules Ferry\n" + 
				"Château\n" + 
				"Place Monseigneur Berteaud\n" + 
				"1, Rue du 9 juin 1944\n" + 
				"B.P. 63\n" + 
				"Avenue des Lissiers B.P. 89\n" + 
				"Hôtel de la Sénatorerie 22, avenue de la Sénatorerie\n" + 
				"1, place Saint-Thyrse\n" + 
				"8 bis, Place Winston Churchill\n" + 
				"1, Place de l'Evêché\n" + 
				"Place du Château\n" + 
				"1, place Jean-Marie Keyser\n" + 
				"1, Avenue du Général de Gaulle B.P. 15\n" + 
				"167, Rue Lucien Galtier\n" + 
				"Port de France Rue de la Manutention\n" + 
				"Place de la Deuxième Division de Cavalerie\n" + 
				"34, Rue Sainte-Catherine\n" + 
				"Palais Ducal 64, Grande Rue\n" + 
				"36-38, rue du Sergent Blandan\n" + 
				"3, Place Stanislas B.P. 218\n" + 
				"Hôtel de la Monnaie 13, Rue Magot de Rogéville\n" + 
				"25, Rue Gouvion Saint-Cyr\n" + 
				"Esplanade du Château\n" + 
				"7, Avenue Carcano\n" + 
				"La Citadelle B.P. 28\n" + 
				"Rue du Palais de Justice\n" + 
				"Clos Raymond Poincaré\n" + 
				"Rue de la Citadelle\n" + 
				"2, Rue Louis XVI\n" + 
				"Hôtel de Ville\n" + 
				"16, Rue de la Belle Vierge\n" + 
				"Rue de Metz\n" + 
				"Porte de France\n" + 
				"Place Robert Schumann\n" + 
				"2, Rue du Haut Poirier\n" + 
				"1, Parvis des Droits-de-l'Homme CS 90490\n" + 
				"Lieu dit Haméviller\n" + 
				"Parc Explor Wendel\n" + 
				"Hôtel de Ville Place d’Armes\n" + 
				"Rue de la Paix\n" + 
				"15-17, Rue Poincaré\n" + 
				"125, Avenue de la Blies\n" + 
				"Cour du Château B.P. 30352\n" + 
				"Hôtel de la Monnaie Rue Vignon\n" + 
				"42 quai de Dogneville\n" + 
				"1, Place Lagarde B.P. 436\n" + 
				"B.P. 189\n" + 
				"30, Avenue Louis Français\n" + 
				"70, Rue Charles de Gaulle\n" + 
				"12, Rue du Général Humbert\n" + 
				"11, rue Saint-Charles\n" + 
				"9, rue de la Liberté\n" + 
				"10, Boulevard du Général de Gaulle\n" + 
				"B.P. 4030\n" + 
				"Quartier Vatable\n" + 
				"Anse Figuier\n" + 
				"Rue Victor Hugo\n" + 
				"Rue du Rocher\n" + 
				"65, Rue Jean Jaurès\n" + 
				"Place de l'Eglise\n" + 
				"Route de Paris\n" + 
				"32, Village\n" + 
				"Route de Montjoie\n" + 
				"Avenue Paul Ramadier\n" + 
				"Ancienne église St. Jean Baptiste 35, rue Droite\n" + 
				"Place Frontin\n" + 
				"Hôtel de Pégayolles Place du Maréchal Foch\n" + 
				"14, Place Eugène Raynaldy\n" + 
				"Place Georges Clemenceau\n" + 
				"Communauté d'agglomération du Grand Rodez 1, Place Adrien-Rozier - B.P. 531\n" + 
				"Rue Saint-Pierre\n" + 
				"789 rue Jean Val\n" + 
				"Ancienne Eglise Saint-Firmin\n" + 
				"Place de la Fontaine\n" + 
				"4, Place Louis Blanc\n" + 
				"2, Rue Jules Ferry\n" + 
				"Place de la République\n" + 
				"Place de l'Hôtel de ville\n" + 
				"Place du Général de Gaulle Hôtel de Ville\n" + 
				"Mairie de Marciac 19, Place de l'Hôtel de Ville\n" + 
				"13, rue de l'Evêché\n" + 
				"3 place de la Bastille\n" + 
				"18, Allée d'Etigny\n" + 
				"Place Henri Dulion\n" + 
				"Bâtiment de l'Ancienne Gendarmerie\n" + 
				"6, place de Mas Saint Pierre\n" + 
				"13, Rue de la Pléau\n" + 
				"17, rue du Japon\n" + 
				"Hôtel Dumay 7, Rue du May\n" + 
				"93, avenue Jules Julien\n" + 
				"35, allées Jules Guesde\n" + 
				"Place Saint Sernin\n" + 
				"21, rue de Metz\n" + 
				"76, allées Charles-de-Fitte\n" + 
				"Rue Hount-Blanque\n" + 
				"Place des Thermes\n" + 
				"7, Place des Thermes de Salut\n" + 
				"Château fort\n" + 
				"Presbytère\n" + 
				"Château-Fort de Mauvezin\n" + 
				"Jardin Massey\n" + 
				"Centre de Préhistoire du Pech Merle Mairie\n" + 
				"792, Rue Emile Zola\n" + 
				"4, Rue des Frères Champollion\n" + 
				"Hôtel de la Monnaie Place Vival - BP. 10060\n" + 
				"Place de Tolentino\n" + 
				"Rue de la Ville\n" + 
				"Palais de la Raymondie Place des Consuls\n" + 
				"Parvis des Sanctuaires\n" + 
				"Ancienne école\n" + 
				"Place de l'Abbaye\n" + 
				"Mairie\n" + 
				"Palais de la Berbie B.P. 100\n" + 
				"Château de Cayla\n" + 
				"2, Place Pélisson\n" + 
				"Hôtel de Ville B.P. 10406\n" + 
				"Porte des Ormeaux 1, Rue Saint-Michel\n" + 
				"La Ramade\n" + 
				"Avenue Dom-Vayssette\n" + 
				"Place Saint-Michel\n" + 
				"Place Philadelphe Thomas\n" + 
				"Rue de la Rive\n" + 
				"1, rue Jouxaygues\n" + 
				"10, Rue Victor Mazies\n" + 
				"Mairie de Rabastens 2, Rue Amédée Clausade\n" + 
				"Mairie Place de la Halle\n" + 
				"15, Rue Jean de Comère\n" + 
				"4, Rue de l'Abbaye\n" + 
				"2, Place Antoine Bourdelle\n" + 
				"BP 752\n" + 
				"Hôtel de Ville Place de la Mairie\n" + 
				"215, Avenue Anatole-France\n" + 
				"BP 90\n" + 
				"24, Rue du Musée\n" + 
				"Allée Chanoine Henri Biévelet\n" + 
				"1, Rue du Mont-de-Piété\n" + 
				"192, rue Edouard Lalo\n" + 
				"15, Rue de l'Epée\n" + 
				"Service de la conservation du patrimoine culturel 11, Rue du Grand Séminaire - B.P. 149\n" + 
				"26 Grand Place  B.P. 38\n" + 
				"9, Place Wilson\n" + 
				"130, Rue des Chartreux\n" + 
				"Entrepôt des Tabacs 9, Quai de la Citadelle\n" + 
				"Jardin des Sculptures Avenue de Bains\n" + 
				"Place du Général de Gaulle B.P. 4212\n" + 
				"Rue Paul Bert\n" + 
				"Place Maria Blondeau B.P. 65\n" + 
				"Château Arsenal Place Charles Valentin\n" + 
				"Ancien Couvent des Augustins Place Georges Degroote\n" + 
				"Palais Fénelon\n" + 
				"Fosse Delloye B.P. 39\n" + 
				"32, Rue de la Monnaie\n" + 
				"19, rue de Bruxelles\n" + 
				"18, bis rue de Valmy\n" + 
				"Rue Corbineau\n" + 
				"Hôtel de ville BP 269\n" + 
				"24, rue des Champs\n" + 
				"Tour Abbatiale Grand- Place\n" + 
				"1, Rue du général de Gaulle B.P. 2\n" + 
				"2, Rue Paul Doumer\n" + 
				"Boulevard Watteau\n" + 
				"1, Allée du Musée\n" + 
				"Ancienne Abbaye Saint-Vaast 22, Rue Paul Doumer\n" + 
				"60, Rue de l'Impératrice\n" + 
				"211, avenue Kennedy\n" + 
				"115, Boulevard Eurvin\n" + 
				"Rue de Bernet\n" + 
				"25, rue Richelieu\n" + 
				"Rue Jean Macé B.P. 107\n" + 
				"8, Place du Général de Gaulle\n" + 
				"50, rue André Deprez\n" + 
				"Avenue du Golf\n" + 
				"Rue Paul Bert B.P. 11\n" + 
				"Hôtel Saint-Walloy\n" + 
				"14, Rue Carnot\n" + 
				"9, Rue Henri Dupuis\n" + 
				"Hôtel de Ville B.P. 40109\n" + 
				"84, Grand' Place Foch\n" + 
				"Place du 6 Juin\n" + 
				"Hôtel du Doyen, rue Lambert Leforestier  BP 21215\n" + 
				"Mairie 13, rue du Paradis\n" + 
				"8 rue Petit Jean\n" + 
				"Le Château\n" + 
				"Le Château\n" + 
				"52, Rue Saint-Pierre\n" + 
				"Esplanade Dwight Eisenhower B.P. 6261\n" + 
				"Enceinte de l'Hôtel de ville\n" + 
				"Musée du Vieux Honfleur B.P. 60082\n" + 
				"Place Erik-Satie B.P. 80049\n" + 
				"Moulin de Marcy\n" + 
				"Rue de la Fosse Frandemiche\n" + 
				"38, Boulevard Pasteur B.P. 26020\n" + 
				"Pôle Muséal Lisieux Pays d'Auge 38, Boulevard Louis Pasteur - B.P. 26020\n" + 
				"107, rue Grande\n" + 
				"Château de Pontécoulant\n" + 
				"Rue Saint Benoît\n" + 
				"Chapelle Notre Dame du Val\n" + 
				"64, Rue du Général Leclerc\n" + 
				"13, Chemin Haussé\n" + 
				"Avenue Jean Moulin B.P. 6\n" + 
				"2, Place Sainte-Anne B.P. 62\n" + 
				"Place Jean de Saint Avit\n" + 
				"La Logeraie\n" + 
				"Place de la Mairie\n" + 
				"Parvis de l'Abbatiale Rue des Sangles\n" + 
				"Parc Emmanuel Liais 19, ter rue Bonhomme\n" + 
				"Fort du Roule Montée des Résistants\n" + 
				"4, Rue Vastel\n" + 
				"2, Rue Quesnel-Morinière\n" + 
				"Hôtel de ville Place Hippolyte Mars B.P. 29\n" + 
				"Place de l'Ithsme - La Haute Ville\n" + 
				"2, Rue Lecarpentier\n" + 
				"Villa les Rhumbs Route d'Estouteville\n" + 
				"Ferme de Boisjugan Boulevard de la Commune\n" + 
				"Centre Culturel Jean Lurçat Place du Champ de Mars\n" + 
				"Le Bourg\n" + 
				"66, Rue Bottin Desylles\n" + 
				"Ile Tatihou B.P. 3\n" + 
				"Place Charles de Gaulle\n" + 
				"Rue du Petit Versailles\n" + 
				"Cour du Foyer 25, Rue Général Huard\n" + 
				"Cour Carrée de la Dentelle\n" + 
				"Avenue du Château B.P. 229\n" + 
				"Service Patrimoine 44, Place Fulbert de Beina\n" + 
				"32, Rue de la Victoire\n" + 
				"3, Rue du Portail Saint-Denis\n" + 
				"Prieuré de Sainte-Gaubruge\n" + 
				"Place du Général de Gaulle\n" + 
				"Ancien logis Abbatial Place Guillaume de Volpiano\n" + 
				"Route de Sainte-Marguerite B.P. 73\n" + 
				"Direction des affaires culturelles B.P. 186\n" + 
				"2, Rue d'Ivry\n" + 
				"Rue Sainte-Clotilde\n" + 
				"19, Rue Pierre Mendes France B.P. 621\n" + 
				"84, Rue de la République\n" + 
				"12, Rue du Pont\n" + 
				"Hôtel de Ville Place de la Libération\n" + 
				"18, Quai Gustave Flaubert Dieppedalle-Croisset\n" + 
				"1, Rue Thomas-Bazin\n" + 
				"Avenue Winston Churchill B.P. 3\n" + 
				"Rue de Chastes\n" + 
				"La Fabrique des Savoirs - LA CREA 7 cours Gambetta\n" + 
				"Place d'Orléans\n" + 
				"27, Boulevard Albert 1er\n" + 
				"21, Rue Alexandre Legros\n" + 
				"Mairie d'Harfleur 50, Rue de la République  B.P. 97\n" + 
				"1, Rue Elisée Reclus\n" + 
				"2, boulevard Clemenceau\n" + 
				"3, Quai de l'Ile (Quartier Saint-François)\n" + 
				"1, Rue Jérôme Bellarmarto\n" + 
				"Place du Vieux Marché\n" + 
				"502, Rue Pierre Corneille\n" + 
				"Place Félix Faure\n" + 
				"Château de Martainville\n" + 
				"Rue Baron Bigot\n" + 
				"Grande rue St-Pierre\n" + 
				"Maison du Parc Naturel Régional des Boucles de la Seine Normande - Hameau de l'Eglise B.P. 13\n" + 
				"185, Route de Dieppe\n" + 
				"198, Rue Beauvoisine\n" + 
				"1, rue Faucon\n" + 
				"1, Place restout\n" + 
				"Ancien Hôtel-Dieu 51, rue de Lecat\n" + 
				"2, rue Jacques Villon\n" + 
				"SCEREN - CNDP 6, Rue de Bihorel\n" + 
				"198, Rue Beauvoisine\n" + 
				"Bibliothèques de Rouen 3, rue Jacques Villon\n" + 
				"B.P. 13 Mairie de Saint-Nicolas d'Aliermont\n" + 
				"Quai Victor Hugo\n" + 
				"Office de Tourisme d'Yvetot et sa Région 8, Place Maréchal Joffre\n" + 
				"29 bis, Rue Pasteur\n" + 
				"2,  Place Jean Guihard\n" + 
				"6, Rue des Moines B.P. 14\n" + 
				"Hôtel de ville B.P. 189\n" + 
				"Porte Saint-Michel CS 85139\n" + 
				"82, Rue Pierre Abélard\n" + 
				"12, Rue Voltaire\n" + 
				"10, Rue Georges Clémenceau\n" + 
				"4, Place Marc Elder\n" + 
				"18, Rue Voltaire B.P. 40 415\n" + 
				"177, Île de Fedrun B.P. 3\n" + 
				"Village de Kerhinet\n" + 
				"Rozé Place des Eclusiers\n" + 
				"Avenue de Saint-Hubert B.P. 173\n" + 
				"32 bis rue Lenepveu\n" + 
				"Direction des musées d'Angers 14, Rue du Musée\n" + 
				"Direction des musées d'Angers 14, Rue du Musée\n" + 
				"Direction des musées d'Angers 14, Rue du Musée\n" + 
				"43, Rue Jules Guitton\n" + 
				"Château du Roi René d'Anjou place de l'Europe\n" + 
				"5, Place Notre-Dame\n" + 
				"Rue du Docteur Roux\n" + 
				"27, Avenue de l'Abreuvoir\n" + 
				"1, Place Jules-Desbois\n" + 
				"Les Celliers de la Coudraye Place des Vignerons\n" + 
				"Hôtel de Ville B.P. 300\n" + 
				"32, Chemin de la Maraîchère\n" + 
				"Place Billard de Veaux\n" + 
				"2, Rue Jean Bourré\n" + 
				"La Maison des Champs La Frénouse\n" + 
				"Place de l'Hôtel de Ville\n" + 
				"13, Rue de la Libération B.P. 1\n" + 
				"Place de la Trémoille\n" + 
				"21, Rue du Douanier Rousseau\n" + 
				"Place Juhel\n" + 
				"Longchamp\n" + 
				"Place des Grands Hommes\n" + 
				"Rue de la Reine Bérengère\n" + 
				"204, Avenue Jean-jaurès\n" + 
				"2, Avenue de Paderborn\n" + 
				"24, Rue Victor Hugo B.P. 10\n" + 
				"Rue Charles-Garnier\n" + 
				"La Cour\n" + 
				"Place du 137ème Régiment d'Infanterie\n" + 
				"Le Daviaud\n" + 
				"Place de l'Eglise\n" + 
				"Rue Jean Jaurès\n" + 
				"4, Rue des Noyers\n" + 
				"Domaine Poyeton\n" + 
				"Rue de Verdun\n" + 
				"Place de l'Hôtel de ville B.P. 227\n" + 
				"1, rue Plante-Choux\n" + 
				"Rue de l'Ecluse Le Port\n" + 
				"Place d'Armes\n" + 
				"4, Chemin du Bois Juquaud\n" + 
				"Le Bois Durand\n" + 
				"Château\n" + 
				"12, Rue Jean de la Fontaine\n" + 
				"28, Rue de la Paix\n" + 
				"265, Familistère Aile Droite\n" + 
				"Impasse du Château\n" + 
				"5, Rue du Général de Gaulle\n" + 
				"32, Rue Georges Ermant\n" + 
				"Rue du Musée\n" + 
				"Site Abbatial Rue du Chamiteau\n" + 
				"Espace Saint Jacques 14, Rue de la Sellerie\n" + 
				"28, Rue Antoine Lecuyer\n" + 
				"Conservation Abbaye Saint-Jean-des-Vignes 2, rue de la Congrégation Logis de l'Abbé\n" + 
				"Place Carnegie Fargniers\n" + 
				"3, 5 Rue du Traité de Paix (Place du général de Gaulle)\n" + 
				"24, Rue Demoustiers\n" + 
				"432, Avenue du Maréchal Foch\n" + 
				"1, Rue Cambry B.P. 941\n" + 
				"Salle du Patrimoine Hôtel de Ville\n" + 
				"Hôtel de Songeons-Bicquilley 2, Rue d'Austerlitz\n" + 
				"Palais national B.P. 549\n" + 
				"Place du Général de Gaulle\n" + 
				"28, Place de l'Hôtel de Ville\n" + 
				"Place François Miterrand\n" + 
				"Rue Gustave Chopinet\n" + 
				"51, rue Roger Salengro\n" + 
				"6, Place Aristide Briand\n" + 
				"7, Rue de l'Evêché\n" + 
				"Place Notre Dame\n" + 
				"Place du Parvis Notre Dame\n" + 
				"Les Marmousets\n" + 
				"24, Rue Gontier-Patin\n" + 
				"B.P. 40003 Saint-Riquier\n" + 
				"36, Rue Victor Hugo\n" + 
				"15 rue de Valmy\n" + 
				"48, Rue de la République\n" + 
				"7, Rue du Musée\n" + 
				"Château de Péronne B.P. 20063\n" + 
				"Hôtel de Ville B.P. 20045\n" + 
				"1, rue de Friedland\n" + 
				"44, Rue de Montmoreau\n" + 
				"134, Rue de Bordeaux\n" + 
				"121, Rue de Bordeaux B.P. 72308\n" + 
				"Les Remparts Place de la Salle Verte\n" + 
				"48, Bd Denfert Rochereau\n" + 
				"Parvis de l'Eglise\n" + 
				"B.P. 75 Place du Sémaphore\n" + 
				"Rue Napoléon\n" + 
				"2, Rue Saint-Michel\n" + 
				"28, Rue Albert 1er\n" + 
				"2, Rue Saint-Côme\n" + 
				"28, Rue Gargoulleau\n" + 
				"10, Rue Fleuriau\n" + 
				"62, Rue d'Aligre BP 16\n" + 
				"141, Rue Pierre Loti\n" + 
				"63-65 avenue de Gaulle\n" + 
				"Hôtel de Cheusses 1, Place de La Galissonnière\n" + 
				"9, Rue Régnaud\n" + 
				"Hôtel de Clerjotte 13, avenue Victor Bouthillier\n" + 
				"29 ter, Rue Alsace-Lorraine\n" + 
				"28, Rue Victor Hugo\n" + 
				"Esplanade André Malraux\n" + 
				"4 rue Monconseil\n" + 
				"9, Place Gambetta\n" + 
				"Lieu dit La Chapelle\n" + 
				"Place de l'Hôtel de Ville\n" + 
				"28, avenue de Limoges\n" + 
				"28, avenue de Limoges\n" + 
				"Rue Duguesclin\n" + 
				"1, Rue de la Vau Saint-Jacques\n" + 
				"Aire Poitou-Charentes de Vouillé Aiffres\n" + 
				"Mairie de Thouars B.P. 183\n" + 
				"14, Rue Sully\n" + 
				"La Manu 3, Rue Clément Krebs\n" + 
				"3, Rue St-Pierre B.P. 64\n" + 
				"Office du tourisme Place du Général Leclerc\n" + 
				"Rue du Martray\n" + 
				"La Sabline 21, Route de Montmorillon B.P. 23\n" + 
				"6, Rue des Augustins\n" + 
				"3 bis, Rue Jean Jaurès\n" + 
				"101 Rue du Père-de-la-Croix\n" + 
				"9, Rue Victor Hugo\n" + 
				"Société des Antiquaires de l'Ouest B.P. 179\n" + 
				"1, Place de la Cathédrale CS 80964\n" + 
				"Villa La Sapinière 10, Avenue de la Libération\n" + 
				"64, Bd Gassendi\n" + 
				"1, Place du Bourguet\n" + 
				"Prieuré de Salagon\n" + 
				"Espace Christiane Vivier\n" + 
				"Route de Montmeyan\n" + 
				"Mairie de Riez\n" + 
				"Place de la République B.P. 100\n" + 
				"Mairie de Vachères\n" + 
				"Direction des musées 4, rue des Cordiers\n" + 
				"Direction des musées 4, rue des Cordiers\n" + 
				"Chemin Val de Pome\n" + 
				"9, Rue Saint-Sébastien\n" + 
				"Chemin des Collettes\n" + 
				"7, Place Grimaldi Haut de Cagnes\n" + 
				"Ile-Sainte-Marguerite\n" + 
				"Le Suquet\n" + 
				"2, Boulevard du Jeu de Ballon\n" + 
				"2, Rue Mirabeau\n" + 
				"23, Boulevard Fragonard\n" + 
				"16 bd Sadi Carnot\n" + 
				"3, Avenue de la Madone\n" + 
				"Rue Lorédan Larchey\n" + 
				"Quai Napoleon III\n" + 
				"Avenue du Docteur Menard\n" + 
				"164, Avenue des Arènes de Cimiez\n" + 
				"65, Rue de France\n" + 
				"405, Promenade des Anglais - Arénas\n" + 
				"33, Avenue des Baumettes\n" + 
				"Château Ste Hélène Avenue de Fabron\n" + 
				"Site de Cimiez 160, Avenue des Arènes\n" + 
				"60  Boulevard Risso\n" + 
				"15, Rue Droite\n" + 
				"Promenade des Arts\n" + 
				"59, Avenue Saint Barthélémy\n" + 
				"25, Boulevard Carnot\n" + 
				"Place des Tilleuls\n" + 
				"Avenue du 16 Septembre 1947\n" + 
				"Place de la Libération\n" + 
				"Place de la Libération\n" + 
				"Citadelle de Villefranche sur Mer\n" + 
				"Hôtel Estienne-de-Saint-Jean 17, Rue Gaston de Saporta\n" + 
				"13, Rue de la Molle\n" + 
				"Place Saint-Jean de Malte\n" + 
				"2 bis rue du Quatre-Septembre\n" + 
				"Ancien Palais de l'Archevêché Place des Martyrs-de-la-Résistance\n" + 
				"9, Avenue Paul Cézanne\n" + 
				"6, Rue Espariat\n" + 
				"Mas du Pont de Rousty\n" + 
				"29, Rue de la République\n" + 
				"10, Rue du Grand Prieuré\n" + 
				"Presqu'île du Cirque Romain B.P. 205\n" + 
				"Quartier Vienot - DHPLE B.P. 21355\n" + 
				"Rue Xavier-D'Authier\n" + 
				"Avenue des Moulins\n" + 
				"Pôle Intercommunal du Patrimoine Culturel B.P. 10647\n" + 
				"1, Quai Ganteaume\n" + 
				"2, rue du Jas\n" + 
				"Ilot Post Tenebra Lux\n" + 
				"Grand-Rue Frédéric Mistral Le Village\n" + 
				"11, avenue Lamartine\n" + 
				"Centre de la Vieille Charité 2, rue de la Charité\n" + 
				"19, Rue Grignan\n" + 
				"Place Vivaux\n" + 
				"Centre Bourse Square Belsunce\n" + 
				"10, Rue Clovis Hugues Archives Municipales Palais des Beaux-Arts\n" + 
				"Centre de la Charité 2, rue de la Charité\n" + 
				"2, Rue de la Prison\n" + 
				"134, Avenue Clot-Bey\n" + 
				"Château Pastré  157, Avenue de Montredon\n" + 
				"140, Boulevard Longchamp\n" + 
				"Palais Longchamp\n" + 
				"69, avenue d'Haïfa\n" + 
				"Palais Longchamp\n" + 
				"11 , Rue La Canebière\n" + 
				"1 esplanade du J4\n" + 
				"Boulevard du 14 Juillet\n" + 
				"Domaine Capitaine-Danjou Chemin Pallière\n" + 
				"Hôtel de Ville Place de la République\n" + 
				"Montée des Pénitents\n" + 
				"Hôtel Estrine 8, rue Estrine\n" + 
				"1, Place Favier\n" + 
				"Rue Victor-Hugo\n" + 
				"Château de l'Empéri 1, Montée du Puech\n" + 
				"Montée du Puech\n" + 
				"Ancienne église catholique\n" + 
				"6, Avenue Maréchal Foch\n" + 
				"Rue Haute\n" + 
				"103, Rue Carnot\n" + 
				"Place du Palais des Comtes de Provence\n" + 
				"9, Rue de la République\n" + 
				"21, allées d'Azémar\n" + 
				"Communauté d'Agglomération Dracenoise 15, Rue Roumanille\n" + 
				"Quartier Bonaparte D. 59 B.P. 400 Avenue de la Grande Armée - D 59\n" + 
				"Salle du Vieux Fréjus Place Calvini\n" + 
				"B.P. 94\n" + 
				"3204 Route de l'Almanarre\n" + 
				"Villa les Lauriers Roses 705, Avenue du 8 Mai 1945\n" + 
				"Parvis de la Vieille Eglise\n" + 
				"Quai Saint-Raphaël Place Georges Grammont\n" + 
				"Rue Jules Ferry\n" + 
				"Place Monsenergue Quai de Norfolk\n" + 
				"113, Boulevard du Maréchal Leclerc\n" + 
				"737 Chemin du Jonquet\n" + 
				"14, Place du Postel\n" + 
				"Place du Palais des Papes\n" + 
				"65, Rue Joseph Vernet\n" + 
				"67, Rue Joseph Vernet\n" + 
				"112, Rue du Collège\n" + 
				"234, Boulevard Albin-Durand\n" + 
				"Rue des Saintes Maries\n" + 
				"52, Place Castil-Blaze\n" + 
				"Porte d'Avignon\n" + 
				"Rue Hébraïque\n" + 
				"Rue de l'Eglise\n" + 
				"Chemin du Gouffre\n" + 
				"Rive gauche de la Sorgue\n" + 
				"Hötel de ville\n" + 
				"27, Rue St-Nazaire\n" + 
				"Société Culture Espace Rue Madeleine Roch\n" + 
				"Hôtel de Ville\n" + 
				"Hôtel de Ville Cours Taulignan\n" + 
				"3, Avenue du Maréchal Foch\n" + 
				"6,Allée des Flamboyants\n" + 
				"28, rue de Paris\n" + 
				"1, rue Poivre\n" + 
				"Domaine Panon-Desbassayns-Villèle B.P. N° 2\n" + 
				"17 A, Chemin Rouge\n" + 
				"34, rue du Général Delestraint\n" + 
				"Monastère Royal de Brou 63, Boulevard de Brou\n" + 
				"Mairie\n" + 
				"Place de l'Eglise\n" + 
				"Maison Renaissance\n" + 
				"3, Montée de l'Abbaye\n" + 
				"Centre Culturel Aragon Place Georges Pompidou\n" + 
				"Place du Tilleul\n" + 
				"Hôtel de Ville 66, Rue Maréchal de Lattre de Tassigny\n" + 
				"Domaine des Planons Hameau de la Mulatière\n" + 
				"Mairie Place Louis Jourdan\n" + 
				"Place de la République\n" + 
				"Cuisiat\n" + 
				"Maison de la Dombes\n" + 
				"15, Rue Jean-Baptiste Béchetoille\n" + 
				"Centre d'accueil Espace Fernand Aubert\n" + 
				"Orgnac Grand Site de France\n" + 
				"2, Place des Récollets\n" + 
				"154, rue Auguste Vincent\n" + 
				"Place de la Déesse Soïo\n" + 
				"14, Place Auguste Faure\n" + 
				"11, Rue Camille-Buffardel\n" + 
				"Le Château\n" + 
				"Mairie Place Emile Loubet\n" + 
				"Le Village\n" + 
				"Portail Roger-Vivier Rue Bistour\n" + 
				"B.P. 44\n" + 
				"Mairie, Place de la Liberté B.P. 2119\n" + 
				"La Hâle\n" + 
				"Place du château\n" + 
				"89, Avenue Michel Croz\n" + 
				"Château de Montrottier 60, Allée du Château\n" + 
				"Les Tabacs 23, Avenue Gantin\n" + 
				"2, Rue Blanche\n" + 
				"Château de Sonnaz 2, Rue Michaud\n" + 
				"Le Verney de Vaujany B.P. 9\n" + 
				"Parc des Forges\n" + 
				"Route de la Poste\n" + 
				"B.P. 17\n" + 
				"17, Rue Victor Hugo\n" + 
				"15, Place de l'Eglise\n" + 
				"1, Rue Géo-Charles\n" + 
				"5 Place de Lavalette\n" + 
				"Place Saint-Laurent\n" + 
				"14, rue Hébert\n" + 
				"1, Rue Hector Berlioz\n" + 
				"1, Rue Dolomieu B.P. 3022\n" + 
				"30, Rue Maurice Gignoux\n" + 
				"Montée de la Cure\n" + 
				"Maison Caral Rue du Colonel Escallon\n" + 
				"Chemin Hébert\n" + 
				"69, Rue de la République B.P. 63\n" + 
				"La Correrie\n" + 
				"Place de Miremont\n" + 
				"Cours Saint-André-le-Bas\n" + 
				"Place Saint-Pierre\n" + 
				"Domaine départemental de la Vizille B.P. 1753\n" + 
				"B.P. 268 7, Place Léon Chaloin\n" + 
				"Rue de la Grye\n" + 
				"9, Boulevard Général Leclerc B.P. 14\n" + 
				"9, Boulevard du Général Leclerc B.P. 14\n" + 
				"31, Rue Martouret\n" + 
				"Rue du Couvent\n" + 
				"3, Rue Victor de Laprade\n" + 
				"Mairie Le Bourg\n" + 
				"13, Boulevard de la Préfecture\n" + 
				"7, Rue Florimont-Robertet\n" + 
				"Mairie Le Bourg\n" + 
				"RUE DE SAINT-ANDRE\n" + 
				"22, Rue Anatole France\n" + 
				"Passage Général Giraud\n" + 
				"La Terrasse\n" + 
				"3, Boulevard Franchet d'Esperey\n" + 
				"Chomat de Villeneuve 13 bis, Rue Gambetta\n" + 
				"2, Place Louis Comte\n" + 
				"458 rue de France\n" + 
				"Place de l'hôtel de Ville\n" + 
				"Place Madeleine Rousseau\n" + 
				"Quartier Saint-Joseph\n" + 
				"Place de l'Hôtel de Ville\n" + 
				"Place de l'Hôtel de Ville\n" + 
				"Cité Internationale 81, Quai Charles de Gaulle\n" + 
				"13, Rue de la Poulaillerie\n" + 
				"34, Rue de la Charité\n" + 
				"Hôtel Dieu 1, Place de l'Hôpital\n" + 
				"34, Rue de la Charité\n" + 
				"20, Place des Terreaux\n" + 
				"17, Rue Cléberg\n" + 
				"10, Rue Boileau\n" + 
				"CASC Musée 17, Rue Rabelais\n" + 
				"14, Avenue Berthelot\n" + 
				"10, Rue Boileau\n" + 
				"1, Place du Petit Collège\n" + 
				"Automobiles - Cycles - Motos B.P. n° 7\n" + 
				"Route Départementale 502 2, Chemin de la Plaine\n" + 
				"La Manufacture-Marnand\n" + 
				"2, Place Faubert\n" + 
				"Maison du Tourisme Vallée 1139 Avenue de Tarentaise - B.P. 55\n" + 
				"Place Maurice Mollard\n" + 
				"Villa Les Chimères 10, Boulevard des Côtes\n" + 
				"Maison Rouge Grande Place de Conflans\n" + 
				"Hauteville-Gondon\n" + 
				"Square de Lannoy de Bissy\n" + 
				"Place du Palais de Justice\n" + 
				"890, Chemin des Charmettes\n" + 
				"208, Avenue de Lyon B.P. 844\n" + 
				"23, Place Saint-Pierre\n" + 
				"Rue du 11 novembre B.P. 4300\n" + 
				"";

		Map<String,Integer> map = new HashMap<String,Integer>();

		int j=1;
		for (String i : tmp.split("\n")){			
			if (i.length() > 0){
				map.put(i,j);
				j++;
			}
		}

		/*Writer writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("owl/split/adresse.txt"), "utf-8"));

			for (String k : map.keySet()){
				String toAdd = "###  http://www.musee.com/ontologies/musee.owl#A_"+map.get(k)+"\n\n";
				toAdd += ":A_"+map.get(k)+" rdf:type owl:NamedIndividual ;\n\n";
				toAdd += "    :aRue \""+k+"\" .\n\n\n\n";
				writer.write(toAdd);
			}

		} catch (IOException ex) {
			// report
		} finally {
			try {writer.close();} catch (Exception ex) {}
		}*/

		for (String i : tmp.split("\n")){
			if (i.length() == 0)
				System.out.println("");
			else
				System.out.println("A_"+map.get(i));
		}

	}

}
