package genowl;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class Theme {

	public static void main(String[] args) {

		String tmp = "Musée de la Folie Marco\n" + 
				"Musée de la Poterie\n" + 
				"Musée de Bouxwiller et du Pays de Hanau\n" + 
				"Musée Alsacien\n" + 
				"Musée Historique\n" + 
				"Musée de la Chartreuse\n" + 
				"Maison de l'Archéologie des Vosges du Nord\n" + 
				"Musée de l'Image Populaire de Pfaffenhoffen\n" + 
				"Musée du Fer\n" + 
				"Musée du Château des Rohan\n" + 
				"Musée Archéologique\n" + 
				"Musée des Arts Décoratifs\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Historique\n" + 
				"Musée Zoologique de l'Université Louis Pasteur et de la Ville de Strasbourg\n" + 
				"Musée Tomi Ungerer\n" + 
				"Musée Alsacien\n" + 
				"Musée de l'Œuvre Notre-Dame\n" + 
				"Cabinet des Estampes et des Dessins\n" + 
				"Musée d'Art Moderne et Contemporain de Strasbourg\n" + 
				"Musée J.F. Oberlin\n" + 
				"Musée Lalique\n" + 
				"Musée Westercamp\n" + 
				"Musée de la Bataille du 6 Août 1870\n" + 
				"Musée Sundgauvien d'Altkirch\n" + 
				"Musée Gallo-Romain\n" + 
				"Musée de la Porte de Thann\n" + 
				"Musée d'Histoire Naturelle et d'Ethnographie de Colmar\n" + 
				"Musée d'Unterlinden\n" + 
				"Musée Bartholdi\n" + 
				"Musée Théodore Deck et des Pays du Florival\n" + 
				"Musée Historique et Militaire de Huningue\n" + 
				"Musée d'Histoire Local\n" + 
				"Musée du Vignoble et des Vins d'Alsace\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Historique\n" + 
				"Musée du Sapeur Pompier\n" + 
				"Cité du Train\n" + 
				"Musée Minéralogique de la Société Industrielle de Mulhouse\n" + 
				"Musée EDF Electropolis\n" + 
				"Musée National de l'Automobile - Collection Schlumpf\n" + 
				"Musée de l'Impression sur Etoffes\n" + 
				"Musée Vauban\n" + 
				"Maison du Sundgau - Musée Paysan\n" + 
				"Musée du Dolder\n" + 
				"Musée du Papier Peint\n" + 
				"Musée des Amis de Thann\n" + 
				"Ecomusée d'Alsace\n" + 
				"Musée d'Anthropologie du Tabac d'Intérêt National\n" + 
				"Château de Bourdeilles\n" + 
				"Musée Fernand Desmoulin\n" + 
				"Musée-Aquarium\n" + 
				"Musée Paul Reclus\n" + 
				"Musée National de la Préhistoire\n" + 
				"Musée Eugène Le Roy et des Vieux Métiers\n" + 
				"Musée des Arts et Traditions Populaires du Périgord\n" + 
				"Musée Départemental de la Poupée et du Jouet\n" + 
				"Musée Militaire - Souvenir du Périgord\n" + 
				"Musée d'Art et d'Archéologie du Périgord (MAAP)\n" + 
				"Musée Gallo-Romain de Vesunna\n" + 
				"Musée du Site Médiéval\n" + 
				"Musée de Sarlat et du Périgord Noir\n" + 
				"Musée d'Art et Traditions Populaires\n" + 
				"Musée Municipal de Blasimon\n" + 
				"Musée d'Art et d'Histoire du Pays Blayais\n" + 
				"Musée Goupil\n" + 
				"Centre National Jean Moulin\n" + 
				"Muséum d'Histoire Naturelle de Bordeaux\n" + 
				"CAPC Musée d'Art Contemporain de Bordeaux\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée d'Aquitaine\n" + 
				"Musée des Arts Décoratifs\n" + 
				"Musée de la Voiture à Cheval\n" + 
				"Musée Municipal\n" + 
				"Musée des Beaux-Arts et d'Archéologie\n" + 
				"Musée Historique ou du Vieux Libourne (Robin)\n" + 
				"Musée d'Histoire et d'Archéologique\n" + 
				"Musée Municipal\n" + 
				"Musée Historique de l'Hydravion\n" + 
				"Musée de Borda\n" + 
				"Musée Départemental de Préhistoire\n" + 
				"Atelier-Musée  (Ecomusée de la Grande Landes)\n" + 
				"Musée Despiau-Wlérick\n" + 
				"Musée de la Chalosse\n" + 
				"Musée du Patrimoine Religieux et des Croyances Populaires\n" + 
				"Ecomusée de la Grande Lande\n" + 
				"Musée Municipal\n" + 
				"Musée Départemental de la Faïence et des Arts de la table\n" + 
				"Musée Municipal du Lac\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Municipal Albert Marzelles\n" + 
				"Musée du Liège et du Bouchon\n" + 
				"Musée du Château Henri IV\n" + 
				"Musée de Préhistoire Mésolithique Laurent Coulonges\n" + 
				"Musée Municipal (Moulin de Gajac)\n" + 
				"Musée Municipal\n" + 
				"Musée Bonnat-Helleu - Musée des Beaux-Arts de Bayonne\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée Basque et de l'Histoire de Bayonne\n" + 
				"Musée Edmond Rostand\n" + 
				"Musée Municipal de Guéthary\n" + 
				"Musée Bernadotte\n" + 
				"Musée Municipal des Beaux-Arts\n" + 
				"Musée Béarnais\n" + 
				"Musée National du Château\n" + 
				"Musée Charles-Louis Philippe\n" + 
				"Musée Municipal de Gannat\n" + 
				"Musée Rural de la Sologne Bourbonnaise\n" + 
				"Musée des Musiques Populaires\n" + 
				"Centre National du Costume de Scène et de la Scénographie\n" + 
				"Musée Anne de Beaujeu\n" + 
				"Musée Rieckotter\n" + 
				"Musée Municipal de Souvigny\n" + 
				"Musée des Arts D'Afrique et D'Asie\n" + 
				"Musée des Sciences\n" + 
				"Musée d'Art et d'Archéologie\n" + 
				"Ecomusée de Margeride-Haute-Auvergne\n" + 
				"Musée de la Haute Auvergne\n" + 
				"Musée d'art et d'histoire Alfred Douët\n" + 
				"Musée de Paléontologie\n" + 
				"Musée des Arts et Traditions Populaires de Haute Loire\n" + 
				"Musée Crozatier\n" + 
				"Musée des Manufactures de Dentelles\n" + 
				"Musée de la Ferblanterie\n" + 
				"Musée de la Dentelle\n" + 
				"Musée d'Art Roger-Quillot\n" + 
				"Musée d'Archéologie Bargoin\n" + 
				"Muséum d'Histoire Naturelle Henri-Lecoq\n" + 
				"Musée Départemental de la Céramique Gallo-Romaine\n" + 
				"Musée des Pénitents Blancs\n" + 
				"Musée Paléontologique\n" + 
				"Musée Lapidaire\n" + 
				"Musée Municipal\n" + 
				"Musée Francisque Mandet\n" + 
				"Musée Régional d'Auvergne\n" + 
				"Musée Municipal de la Coutellerie\n" + 
				"Musée Municipal Marcel Sahut\n" + 
				"Muséoparc - Alésia\n" + 
				"Musée Bonaparte\n" + 
				"Musée E.J Marey\n" + 
				"Musée du Vin de Bourgogne\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée de la Sidérurgie Grande Forge\n" + 
				"Musée du Châtillonnais - Trésor de Vix\n" + 
				"Musée de la Vie Bourguignonne, Perrin de Puycousin\n" + 
				"Musée d'Art Sacré\n" + 
				"Musée Magnin\n" + 
				"Musée François Rude\n" + 
				"Muséum - Jardin des Sciences\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Archéologique\n" + 
				"Musée Noisot\n" + 
				"Musée des Arts et Traditions des Hautes-Côtes\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Buffon\n" + 
				"Musée Municipal\n" + 
				"Musée Municipal François Pompon\n" + 
				"Musée Municipal\n" + 
				"Musée du Costume\n" + 
				"Musée du Septennat\n" + 
				"Musée d'Art et d'Histoire Romain Rolland\n" + 
				"Musée de la Loire de Cosne sur Loire\n" + 
				"Musée Municipal\n" + 
				"Musée de la Mine\n" + 
				"Musée de la Faïence Frédéric Blandin\n" + 
				"Musée Archéologique du Nivernais (Porte du Croux)\n" + 
				"Musée Ernest Guédon\n" + 
				"Musée du Grès de Puisaye\n" + 
				"Musée Auguste Grasset\n" + 
				"Museum d'Histoire Naturelle Jacques de La Comble\n" + 
				"Musée Verger Tarin\n" + 
				"Musée Rolin\n" + 
				"Musée Lapidaire Saint-Nicolas\n" + 
				"Musée de la Mine\n" + 
				"Musée Saint-Nazaire\n" + 
				"Musée Nicéphore Niepce\n" + 
				"Musée Denon\n" + 
				"Musée du Prieuré de Charolles\n" + 
				"Musée René Davoine\n" + 
				"Musée d'Art et d'Archéologie\n" + 
				"Musée de l'Homme et de l'Industrie - Ecomusée de la Communauté Le Creusot-Monceau-Les-Mines\n" + 
				"L'Atelier d'un Journal de Louhans - Musée Municipal\n" + 
				"Musée des Ursulines\n" + 
				"Musée Lamartine\n" + 
				"Musée de la Tour du Moulin\n" + 
				"Musée Eucharistique du Hiéron\n" + 
				"Musée Municipal\n" + 
				"Ecomusée de la Bresse Bourguignonne\n" + 
				"Musée Départemental du Compagnonnage\n" + 
				"Musée du Terroir\n" + 
				"Musée Départemental de Préhistoire de Solutré\n" + 
				"Musée Bourguignon -  Perrin de Puycousin\n" + 
				"Hôtel Dieu - Musée Greuze\n" + 
				"Maison du Blé et du Pain\n" + 
				"Musée Leblanc-Duvernois\n" + 
				"Musée d'Art et d'Histoire\n" + 
				"Muséum - Maison de l'Eau\n" + 
				"Musée de l'Avallonnais\n" + 
				"Musée des Arts Naïfs et Populaires de Noyers sur Serein\n" + 
				"Musée de l'Aventure du Son\n" + 
				"Musée Colette\n" + 
				"Musée Muncipal\n" + 
				"Musée Municipal de Tonnerre\n" + 
				"Musée Zervos\n" + 
				"Musée Villeneuvien\n" + 
				"Musée d'Art et d'Histoire du Puisaye\n" + 
				"Musée du Château de Dinan\n" + 
				"Musée Mathurin Meheut\n" + 
				"Musée d'Art et d'Histoire\n" + 
				"Musée des Beaux-Arts de Brest\n" + 
				"Musée National de la Marine\n" + 
				"Ecomusée des Monts d'Arrée - Moulins de Kerouat\n" + 
				"Musée de la Pêche\n" + 
				"Le Port-Musée\n" + 
				"Musée de Morlaix\n" + 
				"Musée des Phares et Balises\n" + 
				"Ecomusée de l'Île d'Ouessant - Maison du Niou Huella\n" + 
				"Musée de Pont-Aven\n" + 
				"Musée Bigouden\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Départemental Breton\n" + 
				"Ecomusée des Monts d'Arrée - Maison Cornec\n" + 
				"Musée de l'Ecole Rurale en Bretagne\n" + 
				"Ecomusée du Pays de Montfort\n" + 
				"Musée de la Faucillonnaie\n" + 
				"Musée des Beaux-Arts\n" + 
				"Ecomusée du Pays de Rennes\n" + 
				"Musée de Bretagne\n" + 
				"Musée d'Histoire de la Ville de Saint-Malo\n" + 
				"Musée International du Long-Cours Cap-Hornier\n" + 
				"Musée Saint-Nicolas\n" + 
				"Musée des Rochers-Sévigné\n" + 
				"Musée du Château\n" + 
				"Ecomusée de Saint-Dégan\n" + 
				"Musée de Préhistoire J. Miln- Z. Le-Rouzic\n" + 
				"Ecomusée de l'Île de Groix\n" + 
				"Ecomusée Industriel des Forges\n" + 
				"Musée du Faouët\n" + 
				"Musée de la Compagnie des Indes\n" + 
				"Musée National de la Marine\n" + 
				"Musée de la Résistance Bretonne\n" + 
				"Musée du Château de Suscinio\n" + 
				"Musée d'Histoire et d'Archéologie de Vannes\n" + 
				"La Cohue, Musée des Beaux-Arts de vannes\n" + 
				"Musée Estève\n" + 
				"Musée des Meilleurs Ouvriers de France\n" + 
				"Musée d'Histoire Naturelle Gabriel Foucher\n" + 
				"Musée du Berry\n" + 
				"Musée des Arts Décoratifs\n" + 
				"Musée Emile Chénon\n" + 
				"Musée du Château Charles VII\n" + 
				"Musée Saint-Vic\n" + 
				"Musée Municipal - Fours Banaux\n" + 
				"Musée Bonnevallais\n" + 
				"Musée des Beaux-Arts\n" + 
				"Muséum des Sciences Naturelles et de Préhistoire\n" + 
				"Conservatoire du Machinisme et des Pratiques Agricoles\n" + 
				"Musée des Beaux-Arts et d'Histoire Naturelle\n" + 
				"Musée d'Art et d'Histoire Marcel Dessal\n" + 
				"Musée Marcel Proust\n" + 
				"Musée du Château Saint-Jean\n" + 
				"Musée Farcot\n" + 
				"Musée de la Chemiserie et de l'Elégance Masculine\n" + 
				"Château Musée\n" + 
				"Musées de Châteauroux - Hôtel Bertrand\n" + 
				"Musée de l'Hospice Saint-Roch\n" + 
				"Musée George Sand et de la Vallée Noire\n" + 
				"Musée de Géologie Régionale\n" + 
				"Musée Ornithologique (Ecomusée de la Brenne)\n" + 
				"Musée Archéologique d'Argentomagus\n" + 
				"Musée de la poste\n" + 
				"Musée de l'Hôtel de Communes\n" + 
				"Musée du Vieux Chinon\n" + 
				"Maison Musée René Descartes\n" + 
				"Musée de Préhistoire du Grand Pressigny\n" + 
				"Musée du Terroir\n" + 
				"Musée Lansyer\n" + 
				"Musée de l'Hôtel de Ville\n" + 
				"Musée Balzac\n" + 
				"Musée Municipal\n" + 
				"Musée du Savignéen\n" + 
				"Ecomusée du Véron\n" + 
				"Musée Rabelais\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée du Compagnonnage\n" + 
				"Musée des Vins de Touraine\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée de l'Hôtel Goüin\n" + 
				"Musée de Minerve\n" + 
				"Château Musées de Blois\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Maison de la Magie\n" + 
				"Musée de la Corbillière\n" + 
				"Atelier Musée Louis Leygue\n" + 
				"Musée de Sologne\n" + 
				"Musée Archéologique\n" + 
				"Musée de Vendôme\n" + 
				"Musée Municipal Théâtre Forain et Archéologique\n" + 
				"Musée Daniel Vannier\n" + 
				"Musée de la Marine de Loire\n" + 
				"Musée d'Art et d'Archéologie\n" + 
				"Musée International de la Chasse\n" + 
				"Musée Gaston Couté\n" + 
				"Musée Girodet\n" + 
				"Musée du Gatinais\n" + 
				"Muséum des Sciences Naturelles\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Historique et Archéologique\n" + 
				"Musée Municipal\n" + 
				"Musée de la Maison de la Dernière Cartouche\n" + 
				"Musée de l'Ardenne\n" + 
				"Musée Arthur Rimbaud\n" + 
				"Musée de Givet\n" + 
				"Musée du Feutre\n" + 
				"Musée du Rethelois et du Porcien\n" + 
				"Musée du Château-Fort\n" + 
				"Musée Municipal\n" + 
				"Musée Napoléon Ier\n" + 
				"Musée de la Résistance\n" + 
				"Musée Paul Dubois - Alfred Boucher\n" + 
				"Musée Historique de Troyes et de la Champagne\n" + 
				"Musée d'Art Moderne\n" + 
				"Musée des Beaux-Arts\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée de la Bonneterie\n" + 
				"Pharmacie Musée de l'Hôtel-Dieu\n" + 
				"Maison de l'Outil  et de la Pensée Ouvrière\n" + 
				"Musée Municipal\n" + 
				"Musée de l'Affiche - médiathèque\n" + 
				"Musée des Beaux-Arts et d'Archéologie\n" + 
				"Musée du Breuil de Saint-Germain\n" + 
				"Musée d'Art et d'Histoire\n" + 
				"Musée de la Coutellerie\n" + 
				"Musée Municipal\n" + 
				"Musée Garinet\n" + 
				"Musée Municipal\n" + 
				"Musée du Cloître de Notre-Dame-en-Vaux\n" + 
				"Musée Municipal d'Epernay\n" + 
				"Ecomusée de la Montagne de Reims\n" + 
				"Musée Hôtel le Vergeur\n" + 
				"Musée de l'Ancien Collège des Jésuites\n" + 
				"Musée des Beaux-Arts de Saint-Denis\n" + 
				"Musée Saint-Rémi\n" + 
				"Musée de l'Argonne Viard-Morel\n" + 
				"Musée de la Maison Bonaparte\n" + 
				"Musée Fesch\n" + 
				"Musée Napoléonien\n" + 
				"Musée de l'Alta Rocca\n" + 
				"Musée de Préhistoire Corse\n" + 
				"Musée Départemental d'Archéologie d'Aléria\n" + 
				"Musée de Bastia\n" + 
				"Musée de la Corse\n" + 
				"Musée Archéologique de Mariana - Prince Rainier III de Monaco\n" + 
				"Musée Départemental Pascal Paoli\n" + 
				"Musée Comtois\n" + 
				"Musée des Beaux-Arts et d'Archéologie\n" + 
				"Muséum de Besançon\n" + 
				"Musée de la résistance et de la Déportation\n" + 
				"Musée du Temps\n" + 
				"Musée Beurnier-Rossel\n" + 
				"Musée du Château des Ducs de Wurtemberg\n" + 
				"Musée de Plein Air des Maisons Comtoises\n" + 
				"Musée-Maison Natale Gustave Courbet\n" + 
				"Musée de Pontarlier\n" + 
				"Musée Départemental Albert Demard\n" + 
				"Ecomusée du Pays de la Cerise\n" + 
				"Musée Baron Martin\n" + 
				"Musée Départemental de la Montagne Albert Demard\n" + 
				"Musée de la Tour des Echevins\n" + 
				"Musée Georges Garret\n" + 
				"Musée Sarret de Grozon\n" + 
				"Musée de la Vigne et du Vin\n" + 
				"Musée Municipal d'Archéologie\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée d'Archéologie\n" + 
				"Musée du Jouet\n" + 
				"Viséum-Musée de la Lunette\n" + 
				"Musée Municipal de Poligny\n" + 
				"Musée de l'Abbaye/Donations Guy Bardone - René Genis\n" + 
				"Musée Max Claudet\n" + 
				"Musée des Salines\n" + 
				"Musée de l'Artisanat Jurassien\n" + 
				"Musée Frédéric Japy\n" + 
				"Musée d'Art et d'Histoire\n" + 
				"Donation Maurice Jardot\n" + 
				"Forge-Musée\n" + 
				"Musée de l'histoire de la Guadeloupe\n" + 
				"Ecomusée de Marie-Galante\n" + 
				"Musée Précolombien Edgar Clerc\n" + 
				"Musée Municipal Saint-John Perse\n" + 
				"Musée l'Herminier\n" + 
				"Musée Schoelcher\n" + 
				"Musée des Cultures Guyanaises\n" + 
				"Musée Départemental Alexandre Franconie\n" + 
				"Ecomusée Municipal d'Approuague-Kaw\n" + 
				"Musée Français de la Photographie\n" + 
				"Musée Dunoyer de Segonzac\n" + 
				"Musée Municipal Robert Dubois-Corneau\n" + 
				"Musée du Château\n" + 
				"Musée Intercommunal d'Etampes\n" + 
				"Musée des Années Trente\n" + 
				"Musée-Jardin Paul Landowski\n" + 
				"Musée Belmondo et de la Sculpture Figurative du XXè siècle\n" + 
				"Musée Départemental Albert-Kahn\n" + 
				"Fondation Arp\n" + 
				"Musée Municipal d'Art et d'Histoire\n" + 
				"Musée Roybet Fould\n" + 
				"Musée des Travaux Publics\n" + 
				"Musée Français de la Carte à Jouer\n" + 
				"Musée - Atelier Rodin\n" + 
				"Musée d'Art et d'Histoire\n" + 
				"Musée des Automates\n" + 
				"Musée National des Châteaux de Malmaison et de Bois-Préau\n" + 
				"Musée Franco-Suisse\n" + 
				"Musée d'Histoire Locale - Mémoire de la Ville\n" + 
				"Musée Municipal de Saint-Cloud\n" + 
				"Musée de l'Île de France\n" + 
				"Sèvres - Cité de la Céramique\n" + 
				"Musée René Sordes\n" + 
				"Musée National du Moyen Age-Thermes de Cluny\n" + 
				"Musée de la Chasse et de la Nature\n" + 
				"Musée d'Art et d'Histoire du Judaïsme\n" + 
				"Musée National Picasso\n" + 
				"Musée Cognacq-Jay, Musée du XVIIIe siècle de la ville de Paris\n" + 
				"Musée Carnavalet-Histoire de Paris\n" + 
				"Galerie d’entomologie (Muséum national d'histoire naturelle)\n" + 
				"Musée de l'Assistance Publique - Hôpitaux de Paris\n" + 
				"Galerie d'Anatomie Comparée et de Paléontologie (Muséum d'Histoire Naturelle)\n" + 
				"Galerie de Botanique (Muséum National National d'Histoire Naturelle)\n" + 
				"Galerie de Minéralogie et de Géologie (Muséum d'Histoire Naturelle)\n" + 
				"Maison de Victor Hugo\n" + 
				"Crypte Archéologique du Parvis Notre-Dame\n" + 
				"Musées Arts Décoratifs  Mode et du Textile\n" + 
				"Musée National Eugène Delacroix\n" + 
				"Grande Galerie de l'Evolution (Muséum National d'Histoire Naturelle)\n" + 
				"Musée de l'Armée\n" + 
				"Maison de Balzac\n" + 
				"Musée du Louvre\n" + 
				"Musée National de la Marine\n" + 
				"Mémorial du Maréchal Leclerc de Hauteclocque et de la Libération de Paris - Musée Jean Moulin\n" + 
				"Musée National du Sport\n" + 
				"Musée Jean-Jacques Henner\n" + 
				"Musée de Montmartre\n" + 
				"Musée Bouchard\n" + 
				"Musée Cernuschi, Musée des Arts de l'Asie de la ville de Paris\n" + 
				"Les Catacombes\n" + 
				"Musée Zadkine\n" + 
				"Musée Galliéra - Musée de la Mode de la ville de Paris\n" + 
				"Etablissement Public du Musée d'Orsay\n" + 
				"Musée National de la Légion d'Honneur et des Ordres de Chevalerie\n" + 
				"Musée de la Musique\n" + 
				"Petit Palais, Musée des Beaux-Arts de la ville de Paris\n" + 
				"Musée de la Vie Romantique\n" + 
				"Musée de la Publicité (Les Arts Décoratifs)\n" + 
				"Etablissement public de la Porte Dorée - Aquarium Tropical\n" + 
				"Établissement Public de la Porte Dorée - Cité Nationale de l’Histoire de l’Immigration\n" + 
				"Musée Lénine\n" + 
				"Musée Nissim de Camondo (Les Arts Décoratifs)\n" + 
				"Musée Hébert\n" + 
				"Musée des Monuments Français\n" + 
				"Institut du Monde Arabe\n" + 
				"Musées des Arts Décoratifs\n" + 
				"Musée National Auguste Rodin\n" + 
				"Musée National Gustave Moreau\n" + 
				"Musée de la Franc-Maçonnerie\n" + 
				"Musée National de L'Orangerie des Tuileries\n" + 
				"Musée d'Art Moderne de la ville de Paris\n" + 
				"Musée d'Ennery\n" + 
				"M.U.C.E.M. - Musée des ATP\n" + 
				"Musée Bourdelle\n" + 
				"Musée de l'Homme (Muséum National d'Histoire Naturelle)\n" + 
				"Etablissement Public du Musée des Arts Asiatiques Guimet\n" + 
				"Musée National des Techniques (Conservatoire National des Arts et Métiers)\n" + 
				"Musée National d'Art Moderne (Centre National d'Art et de Culture Georges Pompidou)\n" + 
				"Musée du Service de Santé des Armées du Val-de-Grâce\n" + 
				"Musée des Monnaies et des Médailles\n" + 
				"Musée du Quai Branly\n" + 
				"L'Adresse Musée de la Poste\n" + 
				"Musée Départemental de l'Ecole de Barbizon - Auberge Ganne\n" + 
				"Musée Municipal de Chelles Alfred Bonno\n" + 
				"Musée des Transports Urbains, Interurbains et Ruraux\n" + 
				"Musée Municipal des Capucins\n" + 
				"Maison Natale de Louis Braille\n" + 
				"Musée Municipal\n" + 
				"Musée d'Art et d'Histoire Militaire\n" + 
				"Musée du Château de Fontainebleau\n" + 
				"Musée Gatien Bonnet\n" + 
				"Musée Henri Chapu\n" + 
				"Musée Bossuet\n" + 
				"Musée de la Grande Guerre du Pays de Meaux\n" + 
				"Musée de la Gendarmerie\n" + 
				"Musée de Melun\n" + 
				"Musée Municipal\n" + 
				"Musée Départemental de Préhistoire d'Île de France\n" + 
				"Château-musée de Nemours\n" + 
				"Musée de Provins et du Provinois\n" + 
				"Musée des Pays de Seine-et-Marne\n" + 
				"Ecomusée\n" + 
				"Musée départemental Stéphane Mallarmé\n" + 
				"Musée de l'Air et de l'Espace\n" + 
				"Musée Municipal\n" + 
				"Musée de l'Histoire Vivante\n" + 
				"Musée d'Art et d'Histoire\n" + 
				"Musée Municipal\n" + 
				"Musée du Vieil Argenteuil\n" + 
				"Musée de la Renaissance - Château d'Ecouen\n" + 
				"Musée Archéologique du Val d'Oise\n" + 
				"Musée d'Art et d'Histoire Louis Senlecq\n" + 
				"ARCHEA - Musée Intercommunal d'Histoire et d'Archéologie\n" + 
				"Musée jean-Jacques Rousseau\n" + 
				"Musée Tavet Delacour\n" + 
				"Musée Camille Pissarro\n" + 
				"Musée Adrien Mentienne\n" + 
				"Musée de la Résistance Nationale\n" + 
				"Ecomusée du Val de Bièvre\n" + 
				"Musée de Saint-Maur - Villa Médicis\n" + 
				"Musée Fragonard\n" + 
				"Musée de Nogent-Sur-Marne\n" + 
				"Musée Emile Jean\n" + 
				"Musée d'Art Contemporain du Val-de-Marne\n" + 
				"Musée de la Batellerie\n" + 
				"Musée de la Toile de Jouy\n" + 
				"Musée-Promenade de Marly-Le Roi /Louveciennes\n" + 
				"Musée National de Port Royal des Champs\n" + 
				"Musée de l'Hôtel-Dieu\n" + 
				"Musée Victor Aubert\n" + 
				"Musée Zola-Dreyfus\n" + 
				"Musée-Maison Maurice Ravel\n" + 
				"Musée du Jouet Pierre Pinel\n" + 
				"Musée d'Art et d'Histoire\n" + 
				"Musée Rambolitrain\n" + 
				"Musée Municipal - Collections Paul et André Véra\n" + 
				"Musée Départemental Maurice Denis\n" + 
				"Musée d'Archéologie Nationale (des origines à l'an mille) - Château de st-Germain-en-Laye\n" + 
				"Musée de la Ville\n" + 
				"Collections de la Fondation de Coubertin\n" + 
				"Musée Lambinet\n" + 
				"Etablissement Public du Musée et du Domaine National de Versailles\n" + 
				"Musée Municipal Eburomagus Musée Archéologique\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Archéologique du Lauragais\n" + 
				"Musée Municipal\n" + 
				"Musée Petiet\n" + 
				"Musée Archéologique\n" + 
				"Musée d'Art et d'Histoire\n" + 
				"Musée Archéologique\n" + 
				"Musée des Corbières\n" + 
				"Musée du Colombier\n" + 
				"Musée-Bibliothèque Pierre-André Benoît\n" + 
				"Musée Albert André\n" + 
				"Musée Léon Alègre\n" + 
				"Musée Municipal de la Vignasse\n" + 
				"Musée Cévenol\n" + 
				"Musée Archéologique\n" + 
				"Musée du Vieux Nîmes\n" + 
				"Musée des Cultures Taurines\n" + 
				"Carré d'Art Musée d'Art Contemporain de Nîmes\n" + 
				"Musée d'Histoire Naturelle et de Préhistoire\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Paul Raymond\n" + 
				"Musée Départemental d'Art Sacré\n" + 
				"Musée de la Maison Romane\n" + 
				"Musée des Vallées Cévenoles\n" + 
				"Musée Municipal Georges Borias\n" + 
				"Musée Pierre de Luxembourg\n" + 
				"Musée Agathois\n" + 
				"Musée du Biterrois\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée des Beaux-Arts de Béziers\n" + 
				"Musée de l'Etang de Thau\n" + 
				"Musée Municipal\n" + 
				"Musée de la Cloche et de la Sonnaille\n" + 
				"Site Archéologique Lattara - Musée Henri Prades de Montpellier Agglomération\n" + 
				"Musée de l'Ephèbe\n" + 
				"Musée Intercommunal du Pic Saint-Loup\n" + 
				"Musée Fleury\n" + 
				"Musée Archéologique\n" + 
				"Musée de l'Hôtel d'Espeyran\n" + 
				"Musée du Vieux Montpellier\n" + 
				"Musée Fabre\n" + 
				"Musée Languedocien\n" + 
				"Agropolis-Muséum\n" + 
				"Musée Municipal\n" + 
				"Musée de Vulliod Saint-Germain\n" + 
				"Musée de Préhistoire Régionale et du Mégalithisme\n" + 
				"Musée Paul Valéry\n" + 
				"Musée Ignon Fabre\n" + 
				"Ecomusée du Mont Lozère\n" + 
				"Musée départemental d'Art Moderne\n" + 
				"Musée d'Art Moderne - Fonds Peskè\n" + 
				"Musée Archéologique de Ruscino\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée Joseph Puig\n" + 
				"Musée Hyacinthe Rigaud\n" + 
				"Musée du Castillet Casa Pairal\n" + 
				"Musée d'Archéologie Sous-Marine\n" + 
				"Musée de Cerdagne\n" + 
				"Musée de Tautavel\n" + 
				"Musée Labenche d'Art et d'Histoire\n" + 
				"Musée du Président Jacques Chirac\n" + 
				"Musée du Cloître de Tulle André Mazeyrie\n" + 
				"Musée de la Mémoire et des Industries Tullistes\n" + 
				"Musée du Pays d'Ussel\n" + 
				"Musée Départemental de la Tapisserie\n" + 
				"Musée d'Art et d'Archéologie\n" + 
				"Musée René Baubérot\n" + 
				"Musée National Adrien Dubouché\n" + 
				"Musée Municipal des Beaux-Arts de Limoges - Palais de l'Evêché\n" + 
				"Musée Départemental d'Art Contemporain\n" + 
				"Les Sources d'Hercule\n" + 
				"Musée de l'Histoire du Fer\n" + 
				"Musée du Château de Montaigu\n" + 
				"Musée Municipal des Emaux et Faïences\n" + 
				"Musée du Château de Lunéville\n" + 
				"Musée de Zoologie - Aquarium Tropical\n" + 
				"Musée Historique Lorrain\n" + 
				"Musée de l'Ecole de Nancy\n" + 
				"Musée des Beaux-Arts de Nancy\n" + 
				"Musée au Fil du Papier\n" + 
				"Musée d'Art et d'Histoire de Toul\n" + 
				"Musée Barrois\n" + 
				"Musée de la Céramique et de l'Ivoire\n" + 
				"Musée Jules Bastien-Lepage - Musée de la Fortification\n" + 
				"Musée d'Art Sacré de la Meuse\n" + 
				"Musée Départemental Raymond Poincaré\n" + 
				"Musée de la Bière et du Pays de Stenay\n" + 
				"Musée d'Argonne\n" + 
				"Musée Jeanne d'Arc\n" + 
				"Musée de la Princerie\n" + 
				"Musée Départemental de la Guerre de 70\n" + 
				"Musée Départemental du Sel\n" + 
				"Maison du Verre et du Cristal\n" + 
				"Musées de la Cour d'Or\n" + 
				"Centre Pompidou de Metz\n" + 
				"Musée des Mines de fer de Lorraine\n" + 
				"Musée de la Mine - Carreau Wendel\n" + 
				"Musée Militaire et Erckmann-Chatrian\n" + 
				"Musée du Pays de Sarrebourg\n" + 
				"Jardin d'Hiver, Musée de La Faïence\n" + 
				"Moulin de la Blies - Musée des Techniques Faïencières\n" + 
				"La Tour aux Puces - Musée du Pays Thionvillois\n" + 
				"Musée Départemental Georges de la Tour\n" + 
				"Musée de l'Image\n" + 
				"Musée Départemental d'Art Ancien et Contemporain\n" + 
				"Musée de la Lutherie\n" + 
				"Musée Louis Français\n" + 
				"Musée Charles de Bruyères\n" + 
				"Musée Charles Friry\n" + 
				"Musée Pierre Noël - Musée de la Vie dans les Hautes-Vosges\n" + 
				"Musée Départemental d'Archéologie Précolombienne et de Préhistoire de la Martinique\n" + 
				"Musée Régional d'Histoire et d'Ethnologie\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée de La Canne\n" + 
				"Ecomusée de la Martinique\n" + 
				"Musée Volcanologique Franck Arnold Perret\n" + 
				"Musée Départemental de l'Ariège\n" + 
				"Musée du Textile et du Peigne en Corne\n" + 
				"Musée de la Préhistoire\n" + 
				"Musée de la Forge\n" + 
				"Musée d'Archéologie\n" + 
				"Musée du Palais des Evêques\n" + 
				"Musée Régional de Géologie Pierre Vetter\n" + 
				"Musée Joseph Vaylet\n" + 
				"Musée des Mœurs et Coutumes, Musée du Rouergue\n" + 
				"Musée Municipal de Millau\n" + 
				"Musée Fenaille\n" + 
				"Musée des Beaux-Arts Denys Puech\n" + 
				"Musée Soulages\n" + 
				"Musée Municipal d'archéologie\n" + 
				"Musée des Arts et Métiers\n" + 
				"Musée du Charroi Rural et de l'Artisanat Traditionnel\n" + 
				"Musée Municipal Urbain Cabrol\n" + 
				"Musée des Jacobins\n" + 
				"Musée de l'Armagnac\n" + 
				"Musée Archéologique\n" + 
				"Musée Campanaire\n" + 
				"Musée d'Archéologie\n" + 
				"Musée Joseph Abeilhe\n" + 
				"Musée des Beaux-Arts et des Arts Décoratifs\n" + 
				"Musée de Préhistoire\n" + 
				"Musée du Pays de Luchon\n" + 
				"Musée Municipal\n" + 
				"Musée Archéologique Départemental\n" + 
				"Musée Municipal d'Art et d'Histoire\n" + 
				"Musée Paul Dupuy\n" + 
				"Musée Georges Labit\n" + 
				"Musée du Vieux Toulouse\n" + 
				"Musée des Transports et des Communications\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée Saint-Raymond\n" + 
				"Musée des Augustins\n" + 
				"Les Abattoirs, Musée d'Art Moderne et Contemporain\n" + 
				"Musée Bigourdan du Vieux Moulin\n" + 
				"Musée Salies\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée Pyrénéen\n" + 
				"Musée Municipal\n" + 
				"Musée-château Gaston Phébus\n" + 
				"Musée Massey\n" + 
				"Musée de Préhistoire de Cabrerets\n" + 
				"Musée Henri Martin\n" + 
				"Musée Champollion - Les Ecriture du Monde\n" + 
				"Musée d'Histoire de Figeac\n" + 
				"Musée Murat\n" + 
				"Musée Archéologique Armand-Viré\n" + 
				"Musée Gallo-Romain d'Uxellodunum\n" + 
				"Musée d'Art Sacré\n" + 
				"Musée Départemental de Cuzals\n" + 
				"Musée de l'Automate\n" + 
				"Musée Municipal\n" + 
				"Musée Toulouse Lautrec\n" + 
				"Musée Eugénie et Maurice Guérin\n" + 
				"Musée Jean Jaurès\n" + 
				"Musée Goya\n" + 
				"Musée Charles Portal - Histoire et Patrimoine\n" + 
				"Musée du protestantisme en Haut-Languedoc\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée de l'Abbaye Saint-Michel\n" + 
				"Muséum d'histoire naturelle Philadelphe Thomas\n" + 
				"Musée Départemental du Textile\n" + 
				"Musée du Pays Vaurais\n" + 
				"Musée Raymond Lafage\n" + 
				"Musée du Pays Rabastinois\n" + 
				"Musée du Vieil Auvillar\n" + 
				"Musée Théodore Calbet\n" + 
				"Musée des arts et traditions populaires\n" + 
				"Musée d'Histoire Naturelle Victor Brun\n" + 
				"Musée Ingres\n" + 
				"Musée de Préhistoire\n" + 
				"Musée Théophile Jouglet\n" + 
				"Musée d'Histoire et d'Archéologie\n" + 
				"Musée Benoît de Puydt\n" + 
				"Forum Antique de Bavay, Musée Archéologique du Département du Nord\n" + 
				"Musée du Mont-de-Piété\n" + 
				"Musée de l'Ostrevant\n" + 
				"Musée Municipal de Cambrai\n" + 
				"Musée Diocésain d'Art Sacré\n" + 
				"Musée Départemental de Flandre\n" + 
				"Musée d'Archéologie et d'Histoire Locale\n" + 
				"Musée de la Chartreuse\n" + 
				"Musée Portuaire\n" + 
				"Lieu d'Art et Action Contemporaine de Dunkerque - LAAC\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Municipal d'Escaudain\n" + 
				"Ecomusée de la Région\n" + 
				"Musée du Dessin et de l'Estampe Originale\n" + 
				"Musée Municipal\n" + 
				"Musée Départemental Matisse\n" + 
				"Musée de la Mine - Centre Historique Minier\n" + 
				"Musée de l'Hospice Comtesse\n" + 
				"Musée d'Histoire Naturelle et de Géologie\n" + 
				"Palais des Beaux-Arts de Lille\n" + 
				"Musée d'Histoire Locale de Marchiennes\n" + 
				"Musée Henri Boez\n" + 
				"La Piscine - Musée d'Art et d'Industrie André Diligent\n" + 
				"Musée Municipal\n" + 
				"Musée-Atelier du Verre\n" + 
				"MUba Eugène Leroy/Tourcoing\n" + 
				"Musée des Beaux-Arts\n" + 
				"LAM - Lille Métropole Musée d'Art Moderne d'Art Contemporain et d'Art Brut\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Communautaire Opale-Sud\n" + 
				"Musée Régional d'Ethnologie\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Château-Musée de Boulogne-Sur-Mer\n" + 
				"Musée des Beaux-Arts et de la Dentelle\n" + 
				"Musée de la Céramique\n" + 
				"Musée Quentovic\n" + 
				"Musée d'Histoire et d'Archéologie\n" + 
				"Musée Municipal\n" + 
				"Louvre-Lens\n" + 
				"Musée d'Art et d'Histoire Roger Rodière\n" + 
				"Musée de l'Hôtel Sandelin\n" + 
				"Musée Henri Dupuis\n" + 
				"Musée Municipal Bruno Danvin\n" + 
				"Musée Jean-Charles Cazin\n" + 
				"Musée du Débarquement\n" + 
				"T_940\n" + 
				"Musée Langlois\n" + 
				"Musée de la Société des Antiquaires\n" + 
				"Musée de Normandie\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée de la Poste et des Techniques de communication\n" + 
				"Mémorial de Caen\n" + 
				"Musée d'Initiation à la Nature\n" + 
				"Musée d'Ethnographie et d'Arts Populaires et Musée de la Marine\n" + 
				"Musée Eugène Boudin\n" + 
				"Musée de la Meunerie - Moulin de Marcy\n" + 
				"Musée de la Mine\n" + 
				"Musée d'Art et d'Histoire de Lisieux\n" + 
				"Château de Saint-Germain de Livet\n" + 
				"Musée Municipal\n" + 
				"Musée du Château\n" + 
				"Musée des Techniques Fromagères\n" + 
				"Musée de la Bataille de Tilly-Sur-Seulles 1944\n" + 
				"Musée de Trouville - Villa Montebello\n" + 
				"Musée et Sites archéologiques de Vieux-la-Romaine\n" + 
				"Paléospace\n" + 
				"Musée Municipal\n" + 
				"Musée Municipal d'Avranches\n" + 
				"Maison de la Pomme et de la Poire\n" + 
				"Musée du Vieux Château\n" + 
				"Musée de l'Abbaye\n" + 
				"Muséum Emmanuel Liais\n" + 
				"Musée de la Guerre et de la Libération\n" + 
				"Musée Thomas Henry\n" + 
				"Musée Quesnel-Morinière\n" + 
				"Musée Municipal\n" + 
				"Musée Richard Anacréon\n" + 
				"Musée du Vieux Granville\n" + 
				"Musée Christian Dior\n" + 
				"Musée du Bocage Normand, ferme du bois Jugan\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée du Granit\n" + 
				"Musée Barbey d'Aurevilly\n" + 
				"Musée Maritime de l'Ile de Tatihou\n" + 
				"Musée du Château\n" + 
				"Musée Régional du Cidre et du Calvados\n" + 
				"Musée de la Poêlerie\n" + 
				"Musée des Beaux-Arts et de la Dentelle\n" + 
				"Musée du Château de Flers\n" + 
				"Musée Municipal d'Archéologie\n" + 
				"Musée Municipal - Musée du Jouet\n" + 
				"Musée du Percheron\n" + 
				"Musée Départemental des Arts et Traditions Populaires du Perche\n" + 
				"Musée Départemental d'Art Sacré\n" + 
				"Musée Municipal\n" + 
				"Musée du Verre et de la Pierre\n" + 
				"Musée de l'Ancien Evêché\n" + 
				"Musée Artisanal et Industriel d'Instruments à Vent\n" + 
				"Musée Municipal Nicolas Poussin\n" + 
				"Musée Municipal\n" + 
				"Musée Alfred Canel\n" + 
				"Musée Alphonse-Georges Poulain\n" + 
				"Musée Municipal\n" + 
				"Pavillon Flaubert\n" + 
				"Maison des Templiers\n" + 
				"Musée de la Marine de Seine\n" + 
				"Château-Musée de Dieppe\n" + 
				"Musée d'Elbeuf\n" + 
				"Musée Louis-Philippe du Château d'Eu\n" + 
				"Musée des Terre-Neuvas & de la Pêche\n" + 
				"Musée des Arts & de l'Enfance\n" + 
				"Musée du Prieuré\n" + 
				"Musée du Prieuré de Graville\n" + 
				"Musée Malraux\n" + 
				"La Maison de l'Armateur\n" + 
				"Musée de l'Hôtel Dubocage de Bléville\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée Départemental Pierre Corneille\n" + 
				"Musée Municipal\n" + 
				"Musée des Traditions et Arts Normands\n" + 
				"Musée des Sapeurs-Pompiers de France\n" + 
				"Musée Mathon-Durand\n" + 
				"Ecomusée de la Basse-Seine\n" + 
				"Musée Industriel de la Corderie Vallois\n" + 
				"Musée des Antiquités de la Seine-Maritime\n" + 
				"Musée de la Céramique\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Flaubert et d'Histoire de la Médecine\n" + 
				"Musée Le Secq des Tournelles\n" + 
				"Musée National de l'Education\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée-Maison Natale Pierre Corneille\n" + 
				"Association de l'Horlogerie Aliermontaise\n" + 
				"Musée Victor Hugo\n" + 
				"Musée Municipal des Ivoires\n" + 
				"Musée des Marais Salant\n" + 
				"Musée de la Fève, Crèches et Traditions Populaires\n" + 
				"Musée du Pays de Retz\n" + 
				"Musée Municipal\n" + 
				"Musée du Pays de Guérande\n" + 
				"Musée du Vignoble Nantais\n" + 
				"Muséum d'Histoire Naturelle de Nantes\n" + 
				"Musée des Beaux-Arts de Nantes\n" + 
				"Musée du Château des Ducs de Bretagne\n" + 
				"Musée  Départemental Dobrée\n" + 
				"Musées du Parc Naturel Régional de Brière\n" + 
				"Musée du Chaume/Kerhinet - PNR Brière\n" + 
				"Maison de l'Eclusion /Parc Naturel Régional de Brière\n" + 
				"Ecomusée de Saint-Nazaire\n" + 
				"Musée Pincé\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Jean Lurcat et de la Tapisserie Contemporaine\n" + 
				"Galerie David d'Angers\n" + 
				"Muséum des Sciences Naturelles\n" + 
				"Musée d'Art et d'Histoire\n" + 
				"Musée Joseph Denais\n" + 
				"Musée du Textile\n" + 
				"Musée d'Art et d'Histoire\n" + 
				"Musée Jules-Desbois\n" + 
				"Musée de la Vigne et du Vin d'Anjou\n" + 
				"Château-Musée\n" + 
				"Musée de l'Ardoise\n" + 
				"Musée des Tisserands Mayennais\n" + 
				"Musée d'Art et d'Archéologie Hôtel Fouquet\n" + 
				"Musée Communal Robert Tatin\n" + 
				"Musée Municipal\n" + 
				"Musée Archéologique Départemental de Jublains\n" + 
				"Musée du Vieux Château\n" + 
				"Musée des Sciences - CCSTI\n" + 
				"Musée du Château\n" + 
				"Musée de l'Ardoise et de la Géologie\n" + 
				"Musée Heurteloup-Chevalier\n" + 
				"Musée de la Reine Bérengère\n" + 
				"Musée Vert Véron-de-Forbonnais\n" + 
				"Musée de Tessé\n" + 
				"Musée Espace Faïence de Malicorne\n" + 
				"Bibliothèque-musée\n" + 
				"Centre Minier de Faymoreau\n" + 
				"Musée de Fontenay-le-Comte\n" + 
				"Ecomusée du Marais Breton Vendéen\n" + 
				"Musée des Traditions\n" + 
				"Musée Municipal\n" + 
				"Musée ornithologique Charles-Payraudeau\n" + 
				"Historial et Mémorial de la Vendée\n" + 
				"Musée de l'Abbaye de Sainte-Croix\n" + 
				"Musée du Nord de la Vendée\n" + 
				"Musée Clemenceau et de Lattre-de-Tassigny\n" + 
				"Musée de la Construction Navale Artisanale\n" + 
				"Musée du Château\n" + 
				"Musée La Bourrine du Bois-Juquaud\n" + 
				"Musée Milcendeau Jean-Yole\n" + 
				"Musée Franco-Américain du Château de Blérancourt\n" + 
				"Musée Jean de la Fontaine\n" + 
				"Musée municipal de Chauny\n" + 
				"Familistère de Guise\n" + 
				"Musée - Centre de Documentation Alfred Desmasures\n" + 
				"Musée Jeanne d'Aboville\n" + 
				"Musée Archéologique Municipal\n" + 
				"Musée Monseigneur Pigneau de Behaine\n" + 
				"Musée de la Vie Rurale et Forestière\n" + 
				"Musée Entomologique\n" + 
				"Musée Antoine Lecuyer\n" + 
				"Musée Municipal de Soissons\n" + 
				"Musée de la Résistance et de la Déportation\n" + 
				"Musée de La Thiérache\n" + 
				"Musée Alexandre Dumas\n" + 
				"Musée de la Céramique Architecturale\n" + 
				"Musée Départemental de l'Oise\n" + 
				"Musée Pillon\n" + 
				"Musée Antoine Vivenel\n" + 
				"Musée national de la Voiture et du Tourisme (Annexe du musée National du Château de Compiègne)\n" + 
				"Musée du Château de Compiègne\n" + 
				"Musée de la Figurine Historique\n" + 
				"Musée Gallé-Juillet\n" + 
				"Musée de l'Archerie et de l'Art Sacré\n" + 
				"Musée de la Nacre et de la Tabletterie\n" + 
				"Musée Calvin\n" + 
				"Musée du Noyonnais\n" + 
				"Musée d'Art et d'Archéologie\n" + 
				"Musée de la Vénerie\n" + 
				"Musée Archéologique de l'Oise\n" + 
				"Musée Boucher-de-Perthes\n" + 
				"Musée Départemental de l'Abbaye de Saint-Riquier\n" + 
				"Musée de l'Hôtel de Berny\n" + 
				"Muséum d'histoire naturelle\n" + 
				"Musée de Picardie\n" + 
				"Musée Lombart\n" + 
				"Musée-Historial de la Grande Guerre\n" + 
				"Musée Alfred Danicourt\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée Archéologique et Historique\n" + 
				"Atelier - Musée du Papier\n" + 
				"Musée de la Bande Dessinée - Centre National de la Bande Dessinée et de l'Image\n" + 
				"Musée des Arts du Cognac\n" + 
				"Musée Municipal de Cognac\n" + 
				"Musée de la Mytiliculture\n" + 
				"Musée Régional de Fouras\n" + 
				"Musée Napoléonien et Africain\n" + 
				"Musée Protestant\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée d'Orbigny-Bernon\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée du Nouveau Monde\n" + 
				"Musée Cappon\n" + 
				"Musée de la Maison de Pierre Loti\n" + 
				"Hôtel Hèbre de Saint-Clément - Musée d'Art et d'Histoire\n" + 
				"Musée National de la Marine\n" + 
				"Musée Municipal des Cordeliers\n" + 
				"Musée Ernest Cognacq\n" + 
				"Musée de l'Echevinage\n" + 
				"Musée du Présidial\n" + 
				"Musée Archéologique\n" + 
				"Musée Dupuy-Mestreau\n" + 
				"Musée de l'Ile d'Oléron\n" + 
				"Musée des Tumulus de Bougon\n" + 
				"Musée Municipal\n" + 
				"Musée Bernard d’Agesci\n" + 
				"Musée d'Histoire Naturelle\n" + 
				"Musée ethnographique et archéologique du Donjon\n" + 
				"Musée d'Art et d'Histoire Georges Turpin\n" + 
				"Musée - Conservatoire du Machinisme et des Pratiques Agricoles\n" + 
				"Musée Henri Barré\n" + 
				"Musée Municipal de l'Hôtel de Sully\n" + 
				"Musée de la Moto, de l'Automobile et du Vélo\n" + 
				"Musée des Traditions Populaires et d'Archéologie\n" + 
				"Musée Municipal de Civray\n" + 
				"Musée Charbonneau-Lassay\n" + 
				"Musée de Préhistoire Raymond Touchard\n" + 
				"Musée Municipal de la Maison-Dieu\n" + 
				"Musée Sainte-Croix\n" + 
				"Musée de l'hypogée des Dunes\n" + 
				"Musée Rupert de Chièvres\n" + 
				"Musée du baptistère Saint-Jean\n" + 
				"Collection d'Histoire Naturelle\n" + 
				"Musée de la vallée\n" + 
				"Musée Gassendi\n" + 
				"Musée Municipal\n" + 
				"Musée de Salagon\n" + 
				"Musée de la Faïence\n" + 
				"Musée départemental de préhistoire\n" + 
				"Musée Archéologique\n" + 
				"Musée du vieux Sisteron\n" + 
				"Musée archéologique\n" + 
				"Musée Picasso\n" + 
				"Musée d'Histoire et d'Archéologie\n" + 
				"Musée Fernand Léger\n" + 
				"Musée d'Histoire Locale\n" + 
				"Musée Renoir\n" + 
				"Musée-Château de Cagnes\n" + 
				"Musée de la Mer\n" + 
				"Musée de la Castre\n" + 
				"Musée International de la Parfumerie\n" + 
				"Musée d'Art et d'Histoire de Provence\n" + 
				"Villa-Musée Jean-Honoré Fragonard\n" + 
				"Musée Bonnard\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée de Préhistoire Régionale\n" + 
				"Musée Jean Cocteau\n" + 
				"Musée National Message Biblique Marc Chagall\n" + 
				"Musée Matisse\n" + 
				"Musée d'Art et d'Histoire\n" + 
				"Musée Départemental des Arts Asiatiques\n" + 
				"Musée des Beaux-Arts Jules Chéret\n" + 
				"Musée d'Art Naïf Anatole Jakovsky\n" + 
				"Musée Archéologique - Site de  Cimiez\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée du Palais Lascaris\n" + 
				"Musée d'Art Moderne et d'Art Contemporain\n" + 
				"Musée du Vieux-Logis de Nice\n" + 
				"Musée Archéologique - Site de Terra Amata\n" + 
				"Ecomusée du Pays de la Roudoule\n" + 
				"Musée Départemental des Merveilles\n" + 
				"Musée Picasso la guerre et la paix à Vallauris\n" + 
				"Musée Magnelli, Musée de la Céramique\n" + 
				"Musées de la Citadelle\n" + 
				"Musée du Parlement de Provence et du Vieil Aix\n" + 
				"Musée du Pavillon de Vendôme\n" + 
				"Musée Granet\n" + 
				"Musée Paul Arbaud\n" + 
				"Musée des Tapisseries\n" + 
				"Musée-Atelier de Paul Cézanne\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée Camarguais\n" + 
				"Muséon Arlaten\n" + 
				"Musée Réattu\n" + 
				"Musée Départemental de l'Arles Antique\n" + 
				"Musée de la Légion Etrangère\n" + 
				"Musée Municipal Méditerranéen de Cassis A.T.P.\n" + 
				"Musée Alphonse Daudet\n" + 
				"Musée Archéologique d'Istres René Beaucaire\n" + 
				"Musée Ciotaden\n" + 
				"Musée Folklorique du Vieux Lambesc\n" + 
				"Musée d'Histoire et d'Archéologie des Baux-de-Provence\n" + 
				"Fondation Louis Jou\n" + 
				"Musée Frédéric Mistral\n" + 
				"Musée d'Arts Africains, Océaniens, Amérindiens\n" + 
				"Musée Cantini\n" + 
				"Musée des Docks Romains\n" + 
				"Musée d'Histoire de Marseille\n" + 
				"Cabinet des Monnaies et Médailles de Marseille\n" + 
				"Musée d'Archéologie Méditerranéenne\n" + 
				"Musée du Vieux Marseille\n" + 
				"Musée Borély\n" + 
				"Musée de la Faïence\n" + 
				"Musée Grobet-Labadié\n" + 
				"Musée des Beaux-Arts de Marseille\n" + 
				"Musée d'Art Contemporain - Galeries Contemporaines\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée de la Mode\n" + 
				"MUCEM - Musée des Civilisations de l'Europe et de la Méditerranée\n" + 
				"Musée Ziem\n" + 
				"Musée de l'Uniforme - Musée de la Légion Etrangère\n" + 
				"Musée Suffren et du Vieux Saint-Cannat\n" + 
				"Musée Municipal Paul Lafran\n" + 
				"Musée Estrine\n" + 
				"Musée des Alpilles\n" + 
				"Musée Baroncelli\n" + 
				"Musée de Salon et de la Crau\n" + 
				"Musée de l'Empéri de Salon et de la Crau\n" + 
				"Musée du Vieux Queyras\n" + 
				"Musée Départemental des Hautes-Alpes\n" + 
				"Musée des tourneurs\n" + 
				"Musée des Arts et d’Histoire\n" + 
				"Musée du Pays Brignolais\n" + 
				"Musée Municipal de Draguignan\n" + 
				"Musée de la Société d’Etudes Scientifiques et Achéologiques\n" + 
				"Musée des A.T.P. de Moyenne Provence\n" + 
				"Musée de l'Artillerie\n" + 
				"Musée Archéologique Municipal\n" + 
				"Musée des Troupes de Marine\n" + 
				"Musée du site d'Olbia\n" + 
				"Musée Jean Aicard\n" + 
				"Musée Archéologique\n" + 
				"Musée de l'Annonciade\n" + 
				"Musée du Vêtement Provençal (Jean Aicard)\n" + 
				"Musée National de la Marine de Toulon\n" + 
				"Musée d'Art\n" + 
				"Muséum d'Histoire Naturelle de Toulon et du Var\n" + 
				"Musée Municipal d'Archéologie\n" + 
				"Musée du Petit Palais\n" + 
				"Musée Calvet (et musée Lapidaire)\n" + 
				"Muséum d'Histoire Naturelle Esprit Requien\n" + 
				"Musée Sobirats\n" + 
				"Musée Comtadin-Duplessis\n" + 
				"Musée Lapidaire et Archéologie\n" + 
				"Musée Jouve\n" + 
				"Musée de l'Hôtel Dieu\n" + 
				"Synagogue Musée Juif Comtadin\n" + 
				"Musée Marc Deydier\n" + 
				"Musée Jean Garcin 39-45 : L'appel de la Liberté\n" + 
				"Musée-Bibliothèque François Pétrarque\n" + 
				"Musée Philippe de Girard\n" + 
				"Musée Municipal Camille Pautet\n" + 
				"Musée Municipal\n" + 
				"Musée Municipal\n" + 
				"Musée Archéologique Théo Desplans\n" + 
				"Musée du Cartonnage et de l'Imprimerie\n" + 
				"Muséum Agricole et Industriel Stella Matutina\n" + 
				"Musée Départemental de la Réunion - Musée Léon Dierx\n" + 
				"Muséum d'Histoire Naturelle\n" + 
				"Musée Historique de Villèle\n" + 
				"Musée des Arts Décoratifs de l’Océan indien (MADOI)\n" + 
				"Musée Départemental des Pays De l'Ain\n" + 
				"Musée du Brou\n" + 
				"Musée de la Société d'Histoire et d'Archéologie\n" + 
				"Musée Archéologique\n" + 
				"Musée Départemental du Bugey-Valmorey\n" + 
				"Musée d'Histoire de la Résistance et de la Déportation de L'Ain et du Haut Jura\n" + 
				"Musée du Peigne et de la Plasturgie\n" + 
				"Musée du Vieux Pérouges\n" + 
				"Musée Chintreuil\n" + 
				"Musée de la Bresse - Domaine les Planons\n" + 
				"Musée Louis Jourdan\n" + 
				"Musée du Bois\n" + 
				"Musée Départemental du Revermont\n" + 
				"Musée de la Dombe\n" + 
				"Musée Vivarois César Filhol\n" + 
				"Musée Régional\n" + 
				"Musée Régional de Préhistoire\n" + 
				"Musée de la terre ardéchoise\n" + 
				"Musée de la Batellerie du Rhône\n" + 
				"Musée et Site Archéologiques\n" + 
				"Musée du Rhône\n" + 
				"Musée d'Histoire et d'Archéologie\n" + 
				"Château de Grignan\n" + 
				"Musée du Château des Adhémars\n" + 
				"Musée d'Art Sacré\n" + 
				"Musée International de la Chaussure\n" + 
				"Musée d'Archéologie Tricastine\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée du site Préhistorique\n" + 
				"Musée-château d'Annecy\n" + 
				"Musée Alpin\n" + 
				"Musée Léon Marès\n" + 
				"Musée de Rumilly et de l'Albanais\n" + 
				"Musée des Vallées de Thônes\n" + 
				"Musée du Chablais\n" + 
				"Conservatoire - Musée des Industries Hydroélectriques\n" + 
				"Musée Jadis Allevard\n" + 
				"Musée d'Huez et de l'Oisans\n" + 
				"Musée Gallo-Romain\n" + 
				"Musée de Bourgoin-Jallieu\n" + 
				"Musée - Parc Archéologique du Lac de Paladru\n" + 
				"Musée Géo-Charles\n" + 
				"Musée de Grenoble\n" + 
				"Musée Archéologique Grenoble Saint-Laurent\n" + 
				"Musée de la Résistance de la Déportation de l'Isère\n" + 
				"Musée Stendhal\n" + 
				"Muséum d'Histoire Naturelle de Grenoble\n" + 
				"Musée Dauphinois\n" + 
				"Maison du Patrimoine de Hières-sur-Amby\n" + 
				"Musée Matheysin\n" + 
				"Musée Hébert\n" + 
				"Musée Hector Berlioz\n" + 
				"Musée de la Grande Chartreuse\n" + 
				"Musée des Beaux-Arts et d'Archéologie\n" + 
				"Musée-Cloître Saint-André-Le-Bas\n" + 
				"Musée Lapidaire Saint-Pierre\n" + 
				"Musée Départemental de la Révolution Française\n" + 
				"Musée Lucien Mainssieux\n" + 
				"Musée Alice Taverne\n" + 
				"Musée de la Soierie\n" + 
				"Musée Hospitalier\n" + 
				"Atelier - Musée du Chapeau\n" + 
				"Musée d'Histoire du  20ème Siècle - Résistance et Déportation\n" + 
				"Musée d'Archéologie\n" + 
				"Musée Historial\n" + 
				"Musée d'Allard\n" + 
				"Musée de la Diana\n" + 
				"Musée du Vieux Pommiers\n" + 
				"Musée de la Maille\n" + 
				"Musée des Beaux-Arts et d'Archéologie J. Dechelette\n" + 
				"Ecomusée du Roannais\n" + 
				"Musée d'Art Moderne de St-Etienne Métropole\n" + 
				"Musée de la Mine / Site Couriot\n" + 
				"Musée Folklorique du Vieux Saint-Etienne\n" + 
				"Musée d'Art et d'Industrie\n" + 
				"Château de la Bastie d'Urfé\n" + 
				"Musée Municipal\n" + 
				"Musée des Civilisations\n" + 
				"Musée Rural\n" + 
				"Musée Barthélemy-Thimonnier\n" + 
				"Musée Folklorique et Traditions Populaires Marius Audin\n" + 
				"Musée d'Art Contemporain de Lyon\n" + 
				"Musée de l'Imprimerie\n" + 
				"Musée des Arts Décoratifs\n" + 
				"Musée des Hospices Civils de Lyon\n" + 
				"Musée Historique des Tissus\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée de la Civilisation Gallo-Romaine\n" + 
				"Muséum - Musée des Confluences\n" + 
				"Musée des Sapeurs-Pompiers de Lyon\n" + 
				"Centre d'Histoire de la Résistance et de la Déportation\n" + 
				"Musée des Confluences\n" + 
				"Musées Gadagne\n" + 
				"Musée Henri Malartre\n" + 
				"Musée Archéologique\n" + 
				"Ecomusée du Haut Beaujolais\n" + 
				"Musée Paul Dini\n" + 
				"Musée archéologique et minéralogique Pierre Borrione\n" + 
				"Musée Lapidaire\n" + 
				"Musée du docteur Faure\n" + 
				"Musée Municipal d'Albertville-Conflans\n" + 
				"Musée du Costume\n" + 
				"Musée Savoisien\n" + 
				"Musée des Beaux-Arts\n" + 
				"Musée des Charmettes\n" + 
				"Muséum d'histoire naturelle\n" + 
				"Musée de l'Académie de La Val d'Isère\n" + 
				"Musée Municipal";

		Map<String,Integer> map = new HashMap<String,Integer>();

		int j=1;
		for (String i : tmp.split("\n")){			
			String r = getKey(i);
			if (r != null)
				map.put(getKey(i),j);
			j++;
		}

		Writer writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("owl/split/theme.txt"), "utf-8"));

			for (String k : map.keySet()){
				String toAdd = "###  http://www.musee.com/ontologies/musee.owl#T_"+map.get(k)+"\n\n";
				toAdd += ":T_"+map.get(k)+" rdf:type owl:NamedIndividual ;\n\n";
				toAdd += "    :aNomThème \""+k+"\" .\n\n\n\n";
				writer.write(toAdd);
			}

		} catch (IOException ex) {
			// report
		} finally {
			try {writer.close();} catch (Exception ex) {}
		}

		/*or (String i : tmp.split("\n")){
			if (getKey(i) == null)
				System.out.println("");
			else
				System.out.println("T_"+map.get(getKey(i)));
		}*/

		/*		
		for (String k : map.keySet())
			System.out.println(k + " / " + map.get(k));
		System.out.println(j + " / " + map.size());
		 */
	}

	public static String getKey (String i){
		if (i.startsWith("Musée National "))
			i="Musée " + i.split("Musée National ")[1];
		else if (i.startsWith("Musée Régional "))
			i="Musée " + i.split("Musée Régional ")[1];
		else if (i.startsWith("Musée Départemental "))
			i="Musée " + i.split("Musée Départemental ")[1];
		else if (i.startsWith("Musée Historique "))
			i="Musée " + i.split("Musée Historique ")[1];
		else if (i.startsWith("Musée Municipal "))
			i="Musée " + i.split("Musée Municipal ")[1];
		else if (i.startsWith("Musée Communal "))
			i="Musée " + i.split("Musée Communal ")[1];
		else if (i.startsWith("Musée International "))
			i="Musée " + i.split("Musée International ")[1];

		if (i.startsWith("Maison ") || i.startsWith("Musées ")
				|| i.startsWith("Galerie ") || i.startsWith("Ecomusée ")
				|| i.startsWith("Institut ") || i.startsWith("Musée-Château ") || i.startsWith("Musée-château ")
				|| i.startsWith("Mémorial ") || i.startsWith("Forum ") || i.startsWith("Château-Musée ")
				|| i.startsWith("Muséum ") || i.startsWith("Musée-Jardin ") || i.startsWith("Musée-Historial ")
				|| i.startsWith("Musée-Maison ") || i.startsWith("Musée-Atelier ")
				|| i.startsWith("Château ") || i.startsWith("Bibliothèque-musée ")
				|| i.startsWith("Muséon ") || i.startsWith("Pharmacie Musée ")
				|| i.startsWith("Musée-Cloître ") || i.startsWith("Villa-Musée ")
				|| i.startsWith("Cité ") || i.startsWith("Collection ")
				|| i.startsWith("Centre National ") || i.startsWith("Conservatoire ")
				|| i.startsWith("Établissement Public ") || i.startsWith("Familistère ")
				|| i.startsWith("Association ") || i.startsWith("Grande Galerie ")
				|| i.startsWith("Pavillon ") || i.startsWith("Viséum-Musée ")
				|| i.startsWith("Musée-Promenade ") || i.startsWith("Lieu ") || i.startsWith("Fondation  ")
				|| i.startsWith("Palais ") || i.startsWith("Cabinet ") || i.startsWith("Musée-Bibliothèque "))
			i="Musée "+i.split(" ",2)[1];
		else if (i.startsWith("Muséoparc - "))
			i="Musée Alésia";
		else if (i.equals("Musée-Aquarium"))
			i="Musée Aquarium";
		else if (i.equals("Hôtel Dieu - Musée Greuze"))
			i="Musée Greuze";
		else if (i.equals("Le Port-Musée"))
			i="Musée Port";
		else if (i.equals("Maison Musée René Descartes"))
			i="Musée René Descartes";
		else if (i.equals("Château Musées de Blois"))
			i="Musée de Blois";
		else if (i.equals("Atelier Musée Louis Leygue"))
			i="Musée Louis Leygue";
		else if (i.equals("Forge-Musée"))
			i="Musée Forge";
		else if (i.equals("Sèvres - Cité de la Céramique"))
			i="Musée de la Céramique";
		else if (i.equals("Les Catacombes"))
			i="Musée Catacombes";
		else if (i.equals("Musée au Fil du Papier") || i.equals("Atelier - Musée du Papier"))
			i="Musée Papier";
		else if (i.equals("Centre Pompidou de Metz"))
			i="Musée Pompidou";
		else if (i.equals("Jardin d'Hiver, Musée de La Faïence"))
			i="Musée Faïence";
		else if (i.equals("Moulin de la Blies - Musée des Techniques Faïencières"))
			i="Musée Faïence";
		else if (i.equals("La Tour aux Puces - Musée du Pays Thionvillois"))
			i="Musée du Pays Thionvillois";
		else if (i.equals("La Maison de l'Armateur"))
			i="Musée de l'Armateur";
		else if (i.equals("Historial et Mémorial de la Vendée"))
			i="Musée de la Vendée";
		else if (i.equals("Centre Minier de Faymoreau"))
			i="Musée de la Mine";
		else if (i.equals("Atelier - Musée du Chapeau"))
			i="Musée Chapeau";
		else if (i.equals("Centre d'Histoire de la Résistance et de la Déportation"))
			i="Musée de la Résistance et de la Déportation";
		else if (i.equals("Musée-Aquarium"))
			i="Musée Aquarium";
		else if (i.startsWith("Musée Archéologique "))
			i="Musée Archéologie";

		//|| i.startsWith("Maison Musée" ) || i.startsWith("Atelier Musée" ) || i.startsWith("Sèvres - Cité " )


		if (i.equals("Musée-Aquarium"))
			i="Musée Aquarium";

		String key = null;
		if (i.startsWith("Musée de la "))
			key=i.split("Musée de la ")[1];
		else if (i.startsWith("Musée de l'"))
			key=i.split("Musée de l'")[1];
		else if (i.startsWith("Musée de "))
			key=i.split("Musée de ")[1];
		else if (i.startsWith("Musée des "))
			key=i.split("Musée des ")[1];
		else if (i.startsWith("Musée d'"))
			key=i.split("Musée d'")[1];
		else if (i.startsWith("Musée du "))
			key=i.split("Musée du ")[1];
		else if (i.startsWith("Musée ") && !i.equals("Musée") && !i.startsWith("Musée Musée") &&
				!i.endsWith("National") && !i.endsWith("Régional") && !i.endsWith("Départemental") &&
				!i.endsWith("International") && !i.endsWith("Municipal") && !i.endsWith("Communal"))
			key=i.split("Musée ")[1];

		if (key == null)
			return null;

		key=key.replaceAll("et du", "/");
		key=key.replaceAll("et d'", "/ ");
		key=key.replaceAll("et de la", "/");
		key=key.replaceAll("et des", "/");
		key=key.replaceAll("et de", "/");
		key=key.replaceAll("-", "/");

		if (key.length() >= 2)
			key=key.substring(0, 1).toUpperCase() + key.substring(1);

		return key;
	}

}
