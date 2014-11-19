package genowl;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class VIlle {

	public class Region {

		public String nom;
		public String[] deps;

		public Region (String n, String[] d){
			nom=n; deps=d;
		}

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Map<String,String> villes = new HashMap<String, String>();

		String tmp = "D_32$BARR\n" + 
				"D_32$BETSCHDORF\n" + 
				"D_32$BOUXWILLER\n" + 
				"D_32$HAGUENAU\n" + 
				"D_32$MOLSHEIM\n" + 
				"D_32$NIEDERBRONN-LES-BAINS\n" + 
				"D_32$PFAFFENHOFFEN\n" + 
				"D_32$REICHSHOFFEN\n" + 
				"D_32$SAVERNE\n" + 
				"D_32$STRASBOURG\n" + 
				"D_32$WALDERSBACH\n" + 
				"D_32$WINGEN-SUR-MODER\n" + 
				"D_32$WISSEMBOURG\n" + 
				"D_32$WOERTH\n" + 
				"D_33$ALTKIRCH\n" + 
				"D_33$BIESHEIM\n" + 
				"D_33$CERNAY\n" + 
				"D_33$COLMAR\n" + 
				"D_33$GUEBWILLER\n" + 
				"D_33$HUNINGE\n" + 
				"D_33$KAYSERSBERG\n" + 
				"D_33$KIENTZHEIM\n" + 
				"D_33$MULHOUSE\n" + 
				"D_33$NEUF-BRISACH\n" + 
				"D_33$OLTINGUE\n" + 
				"D_33$RIQUEWIHR\n" + 
				"D_33$RIXHEIM\n" + 
				"D_33$THANN\n" + 
				"D_33$UNGERSHEIM\n" + 
				"D_42$BERGERAC\n" + 
				"D_42$BOURDEILLES\n" + 
				"D_42$BRANTOME\n" + 
				"D_42$CREYSSE\n" + 
				"D_42$DOMME\n" + 
				"D_42$LES EYZIES-DE-TAYAC\n" + 
				"D_42$MONTIGNAC\n" + 
				"D_42$MUSSIDAN\n" + 
				"D_42$NONTRON\n" + 
				"D_42$PERIGUEUX\n" + 
				"D_42$SAINT-AVIT-SENIEUR\n" + 
				"D_42$SARLAT-LA-CANEDA\n" + 
				"D_42$VILLEFRANCHE-DE-LONCHAT\n" + 
				"D_43$BLASIMON\n" + 
				"D_43$BLAYE\n" + 
				"D_43$BORDEAUX\n" + 
				"D_43$BOURG-SUR-GIRONDE\n" + 
				"D_43$LA REOLE\n" + 
				"D_43$LIBOURNE\n" + 
				"D_43$SAINT-EMILION\n" + 
				"D_43$VILLANDRAUT\n" + 
				"D_44$BISCARROSSE\n" + 
				"D_44$DAX\n" + 
				"D_44$HASTINGUES\n" + 
				"D_44$LUXEY\n" + 
				"D_44$MONT-DE-MARSAN\n" + 
				"D_44$MONTFORT-EN-CHALOSSE\n" + 
				"D_44$MOUSTEY\n" + 
				"D_44$SABRES\n" + 
				"D_44$SAINT-SEVER\n" + 
				"D_44$SAMADET\n" + 
				"D_44$SANGUINET\n" + 
				"D_45$AGEN\n" + 
				"D_45$MARMANDE\n" + 
				"D_45$MEZIN\n" + 
				"D_45$NERAC\n" + 
				"D_45$SAUVETERRE-LA-LEMANCE\n" + 
				"D_45$VILLENEUVE-SUR-LOT\n" + 
				"D_46$ARUDY\n" + 
				"D_46$BAYONNE\n" + 
				"D_46$CAMBO-LES-BAINS\n" + 
				"D_46$GUETHARY\n" + 
				"D_46$PAU\n" + 
				"D_61$CERILLY\n" + 
				"D_61$GANNAT\n" + 
				"D_61$IZEURE\n" + 
				"D_61$MONTLUCON\n" + 
				"D_61$MOULINS\n" + 
				"D_61$NERIS-LES-BAINS\n" + 
				"D_61$SOUVIGNY\n" + 
				"D_61$VICHY\n" + 
				"D_62$AURILLAC\n" + 
				"D_62$RUYNES-EN-MARGERIDE\n" + 
				"D_62$SAINT-FLOUR\n" + 
				"D_63$CHILHAC\n" + 
				"D_63$LAVAUDIEU\n" + 
				"D_63$LE PUY-EN-VELAY\n" + 
				"D_63$RETOURNAC\n" + 
				"D_63$SAINT ARCONS D'ALLIER\n" + 
				"D_64$ARLANC\n" + 
				"D_64$CLERMONT-FERRAND\n" + 
				"D_64$LEZOUX\n" + 
				"D_64$MARSAC-EN-LIVRADOIS\n" + 
				"D_64$MENAT\n" + 
				"D_64$MOZAC\n" + 
				"D_64$MUROL\n" + 
				"D_64$RIOM\n" + 
				"D_64$THIERS\n" + 
				"D_64$VOLVIC\n" + 
				"D_50$ALISE-SAINTE-REINE\n" + 
				"D_50$AUXONNE\n" + 
				"D_50$BEAUNE\n" + 
				"D_50$BUFFON\n" + 
				"D_50$CHATILLON-SUR-SEINE\n" + 
				"D_50$DIJON\n" + 
				"D_50$FIXIN\n" + 
				"D_50$GEVREY-CHAMBERTIN\n" + 
				"D_50$MONTBARD\n" + 
				"D_50$NUITS-SAINT-GEORGES\n" + 
				"D_50$SAULIEU\n" + 
				"D_50$SEMUR-EN-AUXOIS\n" + 
				"D_51$CHATEAU-CHINON\n" + 
				"D_51$CLAMECY\n" + 
				"D_51$COSNE-SUR-LOIRE\n" + 
				"D_51$LA CHARITE-SUR-LOIRE\n" + 
				"D_51$LA MACHINE\n" + 
				"D_51$NEVERS\n" + 
				"D_51$POUILLY-SUR-LOIRE\n" + 
				"D_51$SAINT-AMAND-EN-PUISAYE\n" + 
				"D_51$VARZY\n" + 
				"D_52$AUTUN\n" + 
				"D_52$BLANZY\n" + 
				"D_52$BOURBON-LANCY\n" + 
				"D_52$CHALON-SUR-SAONE\n" + 
				"D_52$CHAROLLES\n" + 
				"D_52$CLUNY\n" + 
				"D_52$LE CREUSOT\n" + 
				"D_52$LOUHANS\n" + 
				"D_52$MACON\n" + 
				"D_52$MARCIGNY\n" + 
				"D_52$PARAY-LE-MONIAL\n" + 
				"D_52$PIERRE-DE-BRESSE\n" + 
				"D_52$ROMANECHE-THORINS\n" + 
				"D_52$ROMENAY\n" + 
				"D_52$SOLUTRE-POUILLY\n" + 
				"D_52$TOURNUS\n" + 
				"D_52$VERDUN-SUR-LE-DOUBS\n" + 
				"D_53$AUXERRE\n" + 
				"D_53$AVALLON\n" + 
				"D_53$NOYERS-SUR-SEREIN\n" + 
				"D_53$SAINT-FARGEAU\n" + 
				"D_53$SAINT-SAUVEUR-EN-PUISAYE\n" + 
				"D_53$SENS\n" + 
				"D_53$TONNERRE\n" + 
				"D_53$VEZELAY\n" + 
				"D_53$VILLENEUVE-SUR-YONNE\n" + 
				"D_53$VILLIERS-SAINT-BENOIT\n" + 
				"D_54$DINAN\n" + 
				"D_54$LAMBALLE\n" + 
				"D_54$SAINT-BRIEUC\n" + 
				"D_55$BREST\n" + 
				"D_55$COMMANA\n" + 
				"D_55$CONCARNEAU\n" + 
				"D_55$DOUARNENEZ\n" + 
				"D_55$MORLAIX\n" + 
				"D_55$OUESSANT\n" + 
				"D_55$PONT-AVEN\n" + 
				"D_55$PONT-L'ABBE\n" + 
				"D_55$QUIMPER\n" + 
				"D_55$RIVOAL\n" + 
				"D_55$TREGARVAN\n" + 
				"D_56$MONTFORT-SUR-MEU\n" + 
				"D_56$MONTREUIL-SOUS-PEROUSE\n" + 
				"D_56$RENNES\n" + 
				"D_56$SAINT-MALO\n" + 
				"D_56$VITRE\n" + 
				"D_57$BREC'H\n" + 
				"D_57$CARNAC\n" + 
				"D_57$ILE DE GROIX\n" + 
				"D_57$INZINZAC-LOCHRIST\n" + 
				"D_57$LE FAOUET\n" + 
				"D_57$PORT-LOUIS\n" + 
				"D_57$SAINT-MARCEL - MALESTROIT\n" + 
				"D_57$SARZEAU\n" + 
				"D_57$VANNES\n" + 
				"D_5$BOURGES\n" + 
				"D_5$CHATEAUMEILLANT\n" + 
				"D_5$MEHUN-SUR-YEVRE\n" + 
				"D_5$SAINT-AMAND-MONTROND\n" + 
				"D_5$VIERZON\n" + 
				"D_6$BONNEVAL\n" + 
				"D_6$CHARTRES\n" + 
				"D_6$CHARTRES-MAINVILLIERS\n" + 
				"D_6$CHATEAUDUN\n" + 
				"D_6$DREUX\n" + 
				"D_6$ILLIERS-COMBRAY\n" + 
				"D_6$NOGENT-LE-ROTROU\n" + 
				"D_6$SAINVILLE\n" + 
				"D_7$ARGENTON-SUR-CREUSE\n" + 
				"D_7$AZAY-LE-FERRON\n" + 
				"D_7$CHATEAUROUX\n" + 
				"D_7$ISSOUDUN\n" + 
				"D_7$LA CHATRE\n" + 
				"D_7$LANGE\n" + 
				"D_7$LE BLANC\n" + 
				"D_7$SAINT-MARCEL\n" + 
				"D_8$AMBOISE\n" + 
				"D_8$CHINON\n" + 
				"D_8$DESCARTES\n" + 
				"D_8$LE GRAND PRESSIGNY\n" + 
				"D_8$LOCHES\n" + 
				"D_8$RICHELIEU\n" + 
				"D_8$SACHE\n" + 
				"D_8$SAINTE-MAURE-DE-TOURAINE\n" + 
				"D_8$SAVIGNE-SUR-LATHAN\n" + 
				"D_8$SAVIGNY-EN-VERON\n" + 
				"D_8$SEUILLY\n" + 
				"D_8$TOURS\n" + 
				"D_8$YZEURES-SUR-CREUSE\n" + 
				"D_9$BLOIS\n" + 
				"D_9$MER\n" + 
				"D_9$NAVEIL\n" + 
				"D_9$ROMORANTIN-LANTHENAY\n" + 
				"D_9$THESEE\n" + 
				"D_9$VENDOME\n" + 
				"D_10$ARTENAY\n" + 
				"D_10$BEAUGENCY\n" + 
				"D_10$CHATEAUNEUF-SUR-LOIRE\n" + 
				"D_10$CHATILLON-COLIGNY\n" + 
				"D_10$GIEN\n" + 
				"D_10$MEUNG-SUR-LOIRE\n" + 
				"D_10$MONTARGIS\n" + 
				"D_10$ORLEANS\n" + 
				"D_10$PITHIVIERS\n" + 
				"D_65$BAZEILLES\n" + 
				"D_65$CHARLEVILLE-MEZIERES\n" + 
				"D_65$GIVET\n" + 
				"D_65$MOUZON\n" + 
				"D_65$RETHEL\n" + 
				"D_65$SEDAN\n" + 
				"D_66$BAR-SUR-AUBE\n" + 
				"D_66$BRIENNE-LE-CHATEAU\n" + 
				"D_66$MUSSY-SUR-SEINE\n" + 
				"D_66$NOGENT-SUR-SEINE\n" + 
				"D_66$TROYES\n" + 
				"D_67$BOURBONNE-LES-BAINS\n" + 
				"D_67$CHAUMONT\n" + 
				"D_67$LANGRES\n" + 
				"D_67$NOGENT\n" + 
				"D_67$SAINT-DIZIER\n" + 
				"D_68$CHALONS-EN-CHAMPAGNE\n" + 
				"D_68$EPERNAY\n" + 
				"D_68$POURCY\n" + 
				"D_68$REIMS\n" + 
				"D_68$SAINTE-MENEHOULD\n" + 
				"D_1$AJACCIO\n" + 
				"D_1$LEVIE\n" + 
				"D_1$SARTENE\n" + 
				"D_2$ALERIA\n" + 
				"D_2$BASTIA\n" + 
				"D_2$CORTE\n" + 
				"D_2$LUCCIANA\n" + 
				"D_2$MOROSAGLIA\n" + 
				"D_98$BESANCON\n" + 
				"D_98$MONTBELIARD\n" + 
				"D_98$NANCRAY\n" + 
				"D_98$ORNANS\n" + 
				"D_98$PONTARLIER\n" + 
				"D_99$CHAMPLITTE\n" + 
				"D_99$FOUGEROLLES\n" + 
				"D_99$GRAY\n" + 
				"D_99$LE HAUT-DU-THEM\n" + 
				"D_99$LUXEUIL-LES-BAINS\n" + 
				"D_99$VESOUL\n" + 
				"D_100$ARBOIS\n" + 
				"D_100$CHAMPAGNOLE\n" + 
				"D_100$DOLE\n" + 
				"D_100$LONS-LE-SAUNIER\n" + 
				"D_100$MOIRANS-EN-MONTAGNE\n" + 
				"D_100$MOREZ\n" + 
				"D_100$POLIGNY\n" + 
				"D_100$SAINT-CLAUDE\n" + 
				"D_100$SALINS-LES-BAINS\n" + 
				"D_100$VOITEUR\n" + 
				"D_101$BEAUCOURT\n" + 
				"D_101$BELFORT\n" + 
				"D_101$ETUEFFONT\n" + 
				"D_97$BASSE TERRE\n" + 
				"D_97$GRAND-BOURG de MARIE-GALANTE\n" + 
				"D_97$LE MOULE\n" + 
				"D_97$POINTE-A-PITRE\n" + 
				"D_34$CAYENNE\n" + 
				"D_34$REGINA\n" + 
				"D_12$BIEVRES\n" + 
				"D_12$BOUSSY-SAINT-ANTOINE\n" + 
				"D_12$BRUNOY\n" + 
				"D_12$DOURDAN\n" + 
				"D_12$ETAMPES\n" + 
				"D_13$BOULOGNE-BILLANCOURT\n" + 
				"D_13$CLAMART\n" + 
				"D_13$COLOMBES\n" + 
				"D_13$COURBEVOIE\n" + 
				"D_13$ISSY-LES-MOULINEAUX\n" + 
				"D_13$MEUDON\n" + 
				"D_13$NEUILLY-SUR-SEINE\n" + 
				"D_13$RUEIL-MALMAISON\n" + 
				"D_13$SAINT-CLOUD\n" + 
				"D_13$SCEAUX\n" + 
				"D_13$SEVRES\n" + 
				"D_13$SURESNES\n" + 
				"D_14$PARIS\n" + 
				"D_15$BARBIZON\n" + 
				"D_15$CHELLES\n" + 
				"D_15$COULOMMIERS\n" + 
				"D_15$COUPVRAY\n" + 
				"D_15$CRECY-LA-CHAPELLE\n" + 
				"D_15$FONTAINEBLEAU\n" + 
				"D_15$LAGNY-SUR-MARNE\n" + 
				"D_15$LE MEE-SUR-SEINE\n" + 
				"D_15$MEAUX\n" + 
				"D_15$MELUN\n" + 
				"D_15$MORET-SUR-LOING\n" + 
				"D_15$NEMOURS\n" + 
				"D_15$PROVINS\n" + 
				"D_15$SAINT-CYR-SUR-MORIN\n" + 
				"D_15$SAVIGNY-LE-TEMPLE\n" + 
				"D_15$VULAINES-SUR-SEINE\n" + 
				"D_16$LE BOURGET\n" + 
				"D_16$LIVRY-GARGAN\n" + 
				"D_16$MONTREUIL-SOUS-BOIS\n" + 
				"D_16$SAINT-DENIS\n" + 
				"D_16$SAINT-OUEN\n" + 
				"D_17$ARGENTEUIL\n" + 
				"D_17$ECOUEN\n" + 
				"D_17$GUIRY-EN-VEXIN\n" + 
				"D_17$L'ISLE-ADAM\n" + 
				"D_17$LOUVRES\n" + 
				"D_17$MONTMORENCY\n" + 
				"D_17$PONTOISE\n" + 
				"D_18$BRY-SUR-MARNE\n" + 
				"D_18$CHAMPIGNY-SUR-MARNE\n" + 
				"D_18$FRESNES\n" + 
				"D_18$LA VARENNE-SAINT-HILAIRE\n" + 
				"D_18$MAISONS-ALFORT\n" + 
				"D_18$NOGENT-SUR-MARNE\n" + 
				"D_18$VILLIERS-SUR-MARNE\n" + 
				"D_18$VITRY SUR SEINE\n" + 
				"D_19$CONFLANS-SAINTE-HONORINE\n" + 
				"D_19$JOUY-EN-JOSAS\n" + 
				"D_19$LOUVECIENNES\n" + 
				"D_19$MAGNY-LES-HAMEAUX\n" + 
				"D_19$MANTES-LA-JOLIE\n" + 
				"D_19$MAULE\n" + 
				"D_19$MEDAN\n" + 
				"D_19$MONTFORT-L'AMAURY\n" + 
				"D_19$POISSY\n" + 
				"D_19$RAMBOUILLET\n" + 
				"D_19$SAINT-GERMAIN-EN-LAYE\n" + 
				"D_19$SAINT-QUENTIN-YVELINES\n" + 
				"D_19$ST-REMY-LES-CHEVREUSE\n" + 
				"D_19$VERSAILLES\n" + 
				"D_22$BRAM\n" + 
				"D_22$CARCASSONNE\n" + 
				"D_22$CASTELNAUDARY\n" + 
				"D_22$LASTOURS\n" + 
				"D_22$LIMOUX\n" + 
				"D_22$NARBONNE\n" + 
				"D_22$SALLELES D'AUDE\n" + 
				"D_22$SIGEAN\n" + 
				"D_23$ALES\n" + 
				"D_23$BAGNOLS-SUR-CEZE\n" + 
				"D_23$BEAUCAIRE\n" + 
				"D_23$LE VIGAN\n" + 
				"D_23$NIMES\n" + 
				"D_23$PONT-SAINT-ESPRIT\n" + 
				"D_23$SAINT-GILLES-DU-GARD\n" + 
				"D_23$SAINT-JEAN DU GARD\n" + 
				"D_23$UZES\n" + 
				"D_23$VILLENEUVE-LES-AVIGNON\n" + 
				"D_24$AGDE\n" + 
				"D_24$BEZIERS\n" + 
				"D_24$BOUZIGUES\n" + 
				"D_24$FRONTIGNAN-LA-PEYRADE\n" + 
				"D_24$HEREPIAN\n" + 
				"D_24$LATTES\n" + 
				"D_24$LE CAP D'AGDE\n" + 
				"D_24$LES MATELLES\n" + 
				"D_24$LODEVE\n" + 
				"D_24$MINERVE\n" + 
				"D_24$MONTPELLIER\n" + 
				"D_24$MURVIEL-LES-MONTPELLIER\n" + 
				"D_24$PEZENAS\n" + 
				"D_24$SAINT-PONS-DE-THOMIERES\n" + 
				"D_24$SETE\n" + 
				"D_25$MENDE\n" + 
				"D_25$PONT DE MONTVERT\n" + 
				"D_26$CERET\n" + 
				"D_26$COLLIOURE\n" + 
				"D_26$PERPIGNAN\n" + 
				"D_26$PORT-VENDRES\n" + 
				"D_26$SAINTE-LEOCADIE\n" + 
				"D_26$TAUTAVEL\n" + 
				"D_47$BRIVE-LA-GAILLARDE\n" + 
				"D_47$SARRAN\n" + 
				"D_47$TULLE\n" + 
				"D_47$USSEL\n" + 
				"D_48$AUBUSSON\n" + 
				"D_48$GUERET\n" + 
				"D_49$CHATEAUPONSAC\n" + 
				"D_49$LIMOGES\n" + 
				"D_49$ROCHECHOUART\n" + 
				"D_27$DENEUVRE\n" + 
				"D_27$JARVILLE-LA-MALGRANGE\n" + 
				"D_27$LANEUVEVILLE-DEVANT-NANCY\n" + 
				"D_27$LONGWY\n" + 
				"D_27$LUNEVILLE\n" + 
				"D_27$NANCY\n" + 
				"D_27$PONT-A-MOUSSON\n" + 
				"D_27$TOUL\n" + 
				"D_28$BAR-LE-DUC\n" + 
				"D_28$COMMERCY\n" + 
				"D_28$MONTMEDY\n" + 
				"D_28$SAINT-MIHIEL\n" + 
				"D_28$SAMPIGNY\n" + 
				"D_28$STENAY\n" + 
				"D_28$VARENNES-EN-ARGONNE\n" + 
				"D_28$VAUCOULEURS\n" + 
				"D_28$VERDUN\n" + 
				"D_29$GRAVELOTTE\n" + 
				"D_29$MARSAL\n" + 
				"D_29$MEISENTHAL\n" + 
				"D_29$METZ\n" + 
				"D_29$NEUFCHEF\n" + 
				"D_29$PETITE-ROSSELLE\n" + 
				"D_29$PHALSBOURG\n" + 
				"D_29$SARREBOURG\n" + 
				"D_29$SARREGUEMINES\n" + 
				"D_29$THIONVILLE\n" + 
				"D_29$VIC-SUR-SEILLE\n" + 
				"D_30$EPINAL\n" + 
				"D_30$MIRECOURT\n" + 
				"D_30$PLOMBIERES-LES-BAINS\n" + 
				"D_30$REMIREMONT\n" + 
				"D_30$SAINT-DIE-DES-VOSGES\n" + 
				"D_31$FORT-DE-FRANCE\n" + 
				"D_31$FORT-DE-FRANCE TERRE-SAINVILLE\n" + 
				"D_31$LES TROIS ILETS\n" + 
				"D_31$RIVIERE-PILOTE\n" + 
				"D_31$SAINT-PIERRE\n" + 
				"D_69$FOIX\n" + 
				"D_69$LAVELANET\n" + 
				"D_69$LE MAS D'AZIL\n" + 
				"D_69$MONTGAILHARD\n" + 
				"D_69$MONTSEGUR\n" + 
				"D_69$SAINT-LIZIER\n" + 
				"D_70$DECAZEVILLE\n" + 
				"D_70$ESPALION\n" + 
				"D_70$MILLAU\n" + 
				"D_70$RODEZ\n" + 
				"D_70$ROQUEFORT-SUR-SOULZON\n" + 
				"D_70$SALLES-LA-SOURCE\n" + 
				"D_70$SALMIECH\n" + 
				"D_70$VILLEFRANCHE-DE-ROUERGUE\n" + 
				"D_71$AUCH\n" + 
				"D_71$CONDOM\n" + 
				"D_71$EAUZE\n" + 
				"D_71$L'ISLE JOURDAIN\n" + 
				"D_71$LECTOURE\n" + 
				"D_71$MARCIAC\n" + 
				"D_71$MIRANDE\n" + 
				"D_72$AURIGNAC\n" + 
				"D_72$BAGNERES-DE-LUCHON\n" + 
				"D_72$MARTRES-TOLOSANE\n" + 
				"D_72$SAINT-BERTRAND-DE-COMMINGES\n" + 
				"D_72$SAINT-GAUDENS\n" + 
				"D_72$TOULOUSE\n" + 
				"D_73$BAGNERES-DE-BIGORRE\n" + 
				"D_73$LOURDES\n" + 
				"D_73$LUZ-SAINT-SAUVEUR\n" + 
				"D_73$MAUVEZIN\n" + 
				"D_73$TARBES\n" + 
				"D_74$CABRERETS\n" + 
				"D_74$CAHORS\n" + 
				"D_74$FIGEAC\n" + 
				"D_74$LABASTIDE MURAT\n" + 
				"D_74$LUZECH\n" + 
				"D_74$MARTEL\n" + 
				"D_74$ROCAMADOUR\n" + 
				"D_74$SAULIAC-SUR-CELE\n" + 
				"D_74$SOUILLAC\n" + 
				"D_74$VAYRAC\n" + 
				"D_75$ALBI\n" + 
				"D_75$ANDILLAC\n" + 
				"D_75$CASTRES\n" + 
				"D_75$CORDES-SUR-CIEL\n" + 
				"D_75$FERRIERES\n" + 
				"D_75$GAILLAC\n" + 
				"D_75$LA-BASTIDE-ROUAIROUX\n" + 
				"D_75$LAVAUR\n" + 
				"D_75$LISLE-SUR-TARN\n" + 
				"D_75$RABASTENS\n" + 
				"D_76$AUVILLAR\n" + 
				"D_76$GRISOLLES\n" + 
				"D_76$MOISSAC\n" + 
				"D_76$MONTAUBAN\n" + 
				"D_76$SAINT-ANTONIN-NOBLE-VAL\n" + 
				"D_20$ANZIN\n" + 
				"D_20$AVESNES-SUR-HELPE\n" + 
				"D_20$BAILLEUL\n" + 
				"D_20$BAVAY\n" + 
				"D_20$BERGUES\n" + 
				"D_20$BOUCHAIN\n" + 
				"D_20$CAMBRAI\n" + 
				"D_20$CASSEL\n" + 
				"D_20$DENAIN\n" + 
				"D_20$DOUAI\n" + 
				"D_20$DUNKERQUE\n" + 
				"D_20$ESCAUDAIN\n" + 
				"D_20$FOURMIES\n" + 
				"D_20$GRAVELINES\n" + 
				"D_20$HAZEBROUCK\n" + 
				"D_20$LE CATEAU-CAMBRESIS\n" + 
				"D_20$LEWARDE\n" + 
				"D_20$LILLE\n" + 
				"D_20$MARCHIENNES\n" + 
				"D_20$MAUBEUGE\n" + 
				"D_20$ROUBAIX\n" + 
				"D_20$SAINT-AMAND-LES-EAUX\n" + 
				"D_20$SARS-POTERIES\n" + 
				"D_20$TOURCOING\n" + 
				"D_20$VALENCIENNES\n" + 
				"D_20$VILLENEUVE-D'ASCQ\n" + 
				"D_21$ARRAS\n" + 
				"D_21$BERCK-SUR-MER\n" + 
				"D_21$BETHUNE\n" + 
				"D_21$BOULOGNE-SUR-MER\n" + 
				"D_21$CALAIS\n" + 
				"D_21$DESVRES\n" + 
				"D_21$ETAPLES-SUR-MER\n" + 
				"D_21$HARNES\n" + 
				"D_21$LE TOUQUET-PARIS-PLAGE\n" + 
				"D_21$LENS\n" + 
				"D_21$MONTREUIL-SUR-MER\n" + 
				"D_21$SAINT-OMER\n" + 
				"D_21$SAINT-POL-SUR-TERNOISE\n" + 
				"D_21$SAMER\n" + 
				"D_58$ARROMANCHES\n" + 
				"D_58$BAYEUX\n" + 
				"D_58$BEAUMONT-EN-AUGE\n" + 
				"D_58$CAEN\n" + 
				"D_58$HONFLEUR\n" + 
				"D_58$LE MOLAY-LITTRY\n" + 
				"D_58$LISIEUX\n" + 
				"D_58$ORBEC\n" + 
				"D_58$PONTECOULANT\n" + 
				"D_58$SAINT-PIERRE-SUR-DIVES\n" + 
				"D_58$TILLY-SUR-SEULLES\n" + 
				"D_58$TROUVILLE-SUR-MER\n" + 
				"D_58$VIEUX\n" + 
				"D_58$VILLERS-SUR-MER\n" + 
				"D_58$VIRE\n" + 
				"D_59$AVRANCHES\n" + 
				"D_59$BARENTON\n" + 
				"D_59$BRICQUEBEC\n" + 
				"D_59$CERISY-LA-FORET\n" + 
				"D_59$CHERBOURG-OCTEVILLE\n" + 
				"D_59$COUTANCES\n" + 
				"D_59$EQUEURDREVILLLE-HAINEVILLE\n" + 
				"D_59$GRANVILLE\n" + 
				"D_59$SAINT-LO\n" + 
				"D_59$SAINT-MICHEL-DE-MONTJOIE\n" + 
				"D_59$SAINT-SAUVEUR-LE-VICOMTE\n" + 
				"D_59$SAINT-VAAST-LA-HOUGUE\n" + 
				"D_59$TORIGNI-SUR-VIRE\n" + 
				"D_59$VALOGNES\n" + 
				"D_59$VILLEDIEU-LES-POELES\n" + 
				"D_60$ALENCON\n" + 
				"D_60$FLERS\n" + 
				"D_60$L'AIGLE\n" + 
				"D_60$LA FERTE-MACE\n" + 
				"D_60$MORTAGNE-AU-PERCHE\n" + 
				"D_60$SAINT-CYR LA ROSIERE\n" + 
				"D_60$SEES\n" + 
				"D_3$BERNAY\n" + 
				"D_3$CONCHES-EN-OUCHE\n" + 
				"D_3$EVREUX\n" + 
				"D_3$LA COUTURE-BOUSSEY\n" + 
				"D_3$LES ANDELYS\n" + 
				"D_3$LOUVIERS\n" + 
				"D_3$PONT-AUDEMER\n" + 
				"D_3$VERNON\n" + 
				"D_4$BARENTIN\n" + 
				"D_4$CANTELEU\n" + 
				"D_4$CAUDEBEC-EN-CAUX\n" + 
				"D_4$DIEPPE\n" + 
				"D_4$ELBEUF\n" + 
				"D_4$EU\n" + 
				"D_4$FECAMP\n" + 
				"D_4$HARFLEUR\n" + 
				"D_4$LE HAVRE\n" + 
				"D_4$LE PETIT-COURONNE\n" + 
				"D_4$LILLEBONNE\n" + 
				"D_4$MARTAINVILLE-EPREVILLE\n" + 
				"D_4$MONTVILLE\n" + 
				"D_4$NEUFCHATEL-EN-BRAY\n" + 
				"D_4$NOTRE-DAME-DE-BLIQUETUIT\n" + 
				"D_4$NOTRE-DAME-DE-BONDEVILLE\n" + 
				"D_4$ROUEN\n" + 
				"D_4$SAINT-NICOLAS-D'ALIERMONT\n" + 
				"D_4$VILLEQUIER\n" + 
				"D_4$YVETOT\n" + 
				"D_77$BATZ-SUR-MER\n" + 
				"D_77$BLAIN\n" + 
				"D_77$BOURGNEUF-EN-RETZ\n" + 
				"D_77$CHATEAUBRIANT\n" + 
				"D_77$GUERANDE\n" + 
				"D_77$LE PALLET\n" + 
				"D_77$NANTES\n" + 
				"D_77$SAINT-JOACHIM\n" + 
				"D_77$SAINT-LYPHARD\n" + 
				"D_77$SAINT-MALO DE GUERSAC\n" + 
				"D_77$SAINT-NAZAIRE\n" + 
				"D_78$ANGERS\n" + 
				"D_78$BAUGE\n" + 
				"D_78$BEAUFORT-EN-VALLEE\n" + 
				"D_78$CHOLET\n" + 
				"D_78$PARCAY-LES-PINS\n" + 
				"D_78$SAINT LAMBERT-DU-LATTAY\n" + 
				"D_78$SAUMUR\n" + 
				"D_78$TRELAZE\n" + 
				"D_79$AMBRIERES-LES-VALLEES\n" + 
				"D_79$CHATEAU-GONTIER\n" + 
				"D_79$COSSE-LE-VIVIEN\n" + 
				"D_79$ERNEE\n" + 
				"D_79$JUBLAINS\n" + 
				"D_79$LAVAL\n" + 
				"D_79$MAYENNE\n" + 
				"D_79$RENAZE\n" + 
				"D_80$CHATEAU-DU-LOIR\n" + 
				"D_80$LE MANS\n" + 
				"D_80$MALICORNE-SUR-SARTHE\n" + 
				"D_80$SAINT-CALAIS\n" + 
				"D_81$FAYMOREAU\n" + 
				"D_81$FONTENAY-LE-COMTE\n" + 
				"D_81$LA BARRE-DE-MONTS\n" + 
				"D_81$LA GUERINIERE\n" + 
				"D_81$LA ROCHE-SUR-YON\n" + 
				"D_81$LA-CHAIZE-LE-VICOMTE\n" + 
				"D_81$LES LUCS-SUR-BOULOGNE\n" + 
				"D_81$LES SABLES D'OLONNE\n" + 
				"D_81$MONTAIGU\n" + 
				"D_81$MOUILLERON-EN-PAREDS\n" + 
				"D_81$NOIRMOUTIER EN L'ILE\n" + 
				"D_81$NOIRMOUTIER-EN-L'ILE\n" + 
				"D_81$SAINT-HILAIRE-DE-RIEZ\n" + 
				"D_81$SOULLANS\n" + 
				"D_35$BLERANCOURT\n" + 
				"D_35$CHATEAU-THIERRY\n" + 
				"D_35$CHAUNY\n" + 
				"D_35$GUISE\n" + 
				"D_35$HIRSON\n" + 
				"D_35$LA FERE\n" + 
				"D_35$LAON\n" + 
				"D_35$ORIGNY-EN-THIERACHE\n" + 
				"D_35$SAINT-MICHEL-EN-THIERACHE\n" + 
				"D_35$SAINT-QUENTIN\n" + 
				"D_35$SOISSONS\n" + 
				"D_35$TERGNIER\n" + 
				"D_35$VERVINS\n" + 
				"D_35$VILLERS COTTERETS\n" + 
				"D_36$AUNEUIL\n" + 
				"D_36$BEAUVAIS\n" + 
				"D_36$CHAUMONT-EN-VEXIN\n" + 
				"D_36$COMPIEGNE\n" + 
				"D_36$CREIL\n" + 
				"D_36$CREPY-EN-VALOIS\n" + 
				"D_36$MERU\n" + 
				"D_36$NOYON\n" + 
				"D_36$SENLIS\n" + 
				"D_36$VENDEUIL-CAPLY\n" + 
				"D_37$ABBEVILLE\n" + 
				"D_37$AMIENS\n" + 
				"D_37$DOULLENS\n" + 
				"D_37$PERONNE\n" + 
				"D_38$ANGOULEME\n" + 
				"D_38$COGNAC\n" + 
				"D_39$ESNANDES\n" + 
				"D_39$FOURAS\n" + 
				"D_39$ILE D'AIX\n" + 
				"D_39$LA ROCHELLE\n" + 
				"D_39$MARANS\n" + 
				"D_39$ROCHEFORT\n" + 
				"D_39$SAINT-JEAN-D'ANGELY\n" + 
				"D_39$SAINT-MARTIN-DE-RE\n" + 
				"D_39$SAINTES\n" + 
				"D_39$ST-PIERRE D'OLERON\n" + 
				"D_40$BOUGON\n" + 
				"D_40$BRESSUIRE\n" + 
				"D_40$NIORT\n" + 
				"D_40$PARTHENAY\n" + 
				"D_40$PRAHECQ\n" + 
				"D_40$THOUARS\n" + 
				"D_41$CHATELLERAULT\n" + 
				"D_41$CHAUVIGNY\n" + 
				"D_41$CIVRAY\n" + 
				"D_41$LOUDUN\n" + 
				"D_41$LUSSAC-LES-CHATEAUX\n" + 
				"D_41$MONTMORILLON\n" + 
				"D_41$POITIERS\n" + 
				"D_82$BARCELONNETTE\n" + 
				"D_82$DIGNE-LES-BAINS\n" + 
				"D_82$FORCALQUIER\n" + 
				"D_82$MANE\n" + 
				"D_82$MOUSTIERS-STE-MARIE\n" + 
				"D_82$QUINSON\n" + 
				"D_82$RIEZ-LA-ROMAINE\n" + 
				"D_82$SISTERON\n" + 
				"D_82$VACHERES\n" + 
				"D_83$ANTIBES\n" + 
				"D_83$BIOT\n" + 
				"D_83$CAGNES-SUR-MER\n" + 
				"D_83$CANNES\n" + 
				"D_83$GRASSE\n" + 
				"D_83$LE CANNET\n" + 
				"D_83$MENTON\n" + 
				"D_83$NICE\n" + 
				"D_83$PUGET-ROSTANG\n" + 
				"D_83$TENDE\n" + 
				"D_83$VALLAURIS\n" + 
				"D_83$VILLEFRANCHE-SUR-MER\n" + 
				"D_84$AIX-EN-PROVENCE\n" + 
				"D_84$ARLES\n" + 
				"D_84$AUBAGNE\n" + 
				"D_84$CASSIS\n" + 
				"D_84$FONTVIEILLE\n" + 
				"D_84$ISTRES\n" + 
				"D_84$LA CIOTAT\n" + 
				"D_84$LAMBESC\n" + 
				"D_84$LES BAUX DE PROVENCE\n" + 
				"D_84$LES-BAUX-DE-PROVENCE\n" + 
				"D_84$MAILLANE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARTIGUES\n" + 
				"D_84$PUYLOUBIER\n" + 
				"D_84$SAINT-CANNAT\n" + 
				"D_84$SAINT-CHAMAS\n" + 
				"D_84$SAINT-REMY-DE-PROVENCE\n" + 
				"D_84$SAINTES-MARIES-DE-LA-MER\n" + 
				"D_84$SALON-DE-PROVENCE\n" + 
				"D_85$AIGUILLES\n" + 
				"D_85$GAP\n" + 
				"D_86$AIGUINES\n" + 
				"D_86$BORMES-LES-MIMOSAS\n" + 
				"D_86$BRIGNOLES\n" + 
				"D_86$DRAGUIGNAN\n" + 
				"D_86$FREJUS\n" + 
				"D_86$HYERES\n" + 
				"D_86$LE POUVEREL LA GARDE\n" + 
				"D_86$SAINT-RAPHAËL\n" + 
				"D_86$SAINT-TROPEZ\n" + 
				"D_86$SOLLIES-VILLE\n" + 
				"D_86$TOULON\n" + 
				"D_87$APT\n" + 
				"D_87$AVIGNON\n" + 
				"D_87$CARPENTRAS\n" + 
				"D_87$CAVAILLON\n" + 
				"D_87$CUCURON\n" + 
				"D_87$FONTAINE-DE-VAUCLUSE\n" + 
				"D_87$LOUMARIN - CADENET\n" + 
				"D_87$MAZAN\n" + 
				"D_87$ORANGE\n" + 
				"D_87$SAULT\n" + 
				"D_87$VAISON-LA-ROMAINE\n" + 
				"D_87$VALREAS\n" + 
				"D_96$PITON-SAINT-LEU\n" + 
				"D_96$SAINT-DENIS\n" + 
				"D_96$SAINT-DENIS DE LA REUNION\n" + 
				"D_96$SAINT-GILLES-LES-HAUTS\n" + 
				"D_96$SAINT-LOUIS\n" + 
				"D_88$BOURG-EN-BRESSE\n" + 
				"D_88$BRIORD\n" + 
				"D_88$IZERNORE\n" + 
				"D_88$LOCHIEU\n" + 
				"D_88$NANTUA\n" + 
				"D_88$OYONNAX\n" + 
				"D_88$PEROUGES\n" + 
				"D_88$PONT-DE-VAUX\n" + 
				"D_88$SAINT-CYR-SUR-MENTHON\n" + 
				"D_88$SAINT-PAUL-DE-VARAX\n" + 
				"D_88$SEYSSEL\n" + 
				"D_88$TREFFORT-CUISIAT\n" + 
				"D_88$VILLARS DE LA DOMBE\n" + 
				"D_89$ANNONAY\n" + 
				"D_89$LES VANS\n" + 
				"D_89$ORGNAC-L'AVEN\n" + 
				"D_89$PRIVAS\n" + 
				"D_89$SERRIERES\n" + 
				"D_89$SOYONS\n" + 
				"D_89$TOURNON-SUR-RHÔNE\n" + 
				"D_90$DIE\n" + 
				"D_90$GRIGNAN\n" + 
				"D_90$MONTELIMAR\n" + 
				"D_90$MOURS SAINT-EUSEBE\n" + 
				"D_90$ROMANS\n" + 
				"D_90$SAINT-PAUL-TROIS-CHATEAUX\n" + 
				"D_90$VALENCE\n" + 
				"D_90$VASSIEUX-EN-VERCORS\n" + 
				"D_91$ANNECY\n" + 
				"D_91$CHAMONIX\n" + 
				"D_91$LOVAGNY\n" + 
				"D_91$RUMILLY\n" + 
				"D_91$THONES\n" + 
				"D_91$THONON-LES-BAINS\n" + 
				"D_92$ALLEMONT\n" + 
				"D_92$ALLEVARD-LES-BAINS\n" + 
				"D_92$ALPE D'HUEZ\n" + 
				"D_92$AOSTE\n" + 
				"D_92$BOURGOIN-JALLIEU\n" + 
				"D_92$CHARAVINES\n" + 
				"D_92$ECHIROLLES\n" + 
				"D_92$GRENOBLE\n" + 
				"D_92$HIERES SUR AMBY\n" + 
				"D_92$LA MURE\n" + 
				"D_92$LA TRONCHE\n" + 
				"D_92$LA-COTE-SAINT-ANDRE\n" + 
				"D_92$SAINT-PIERRE-DE-CHARTREUSE\n" + 
				"D_92$VIENNE\n" + 
				"D_92$VIZILLE\n" + 
				"D_92$VOIRON\n" + 
				"D_93$AMBIERLE\n" + 
				"D_93$CHARLIEU\n" + 
				"D_93$CHAZELLES-SUR-LYON\n" + 
				"D_93$ESTIVAREILLES\n" + 
				"D_93$FEURS\n" + 
				"D_93$GREZOLLES\n" + 
				"D_93$MONTBRISON\n" + 
				"D_93$POMMIERS-EN-FOREZ\n" + 
				"D_93$RIORGES\n" + 
				"D_93$ROANNE\n" + 
				"D_93$SAINT-ETIENNE\n" + 
				"D_93$SAINT-ETIENNE-LE-MOLARD\n" + 
				"D_93$SAINT-GERMAIN-LAVAL\n" + 
				"D_93$SAINT-JUST-SAINT-RAMBERT\n" + 
				"D_93$USSON EN FOREZ\n" + 
				"D_94$AMPLEPUIS\n" + 
				"D_94$BEAUJEU\n" + 
				"D_94$LYON\n" + 
				"D_94$ROCHETAILLEE-SUR-SAONE\n" + 
				"D_94$SAINT-ROMAIN-EN-GAL\n" + 
				"D_94$THIZY\n" + 
				"D_94$VILLEFRANCHE-SUR-SAONE\n" + 
				"D_95$AIME-EN-TARENTAISE\n" + 
				"D_95$AIX-LES-BAINS\n" + 
				"D_95$ALBERTVILLE\n" + 
				"D_95$BOURG-SAINT-MAURICE\n" + 
				"D_95$CHAMBERY\n" + 
				"D_95$MOÛTIERS\n" + 
				"D_11$SAINT-PIERRE ET MIQUELON";
		
		String tmp2 = "D_32$BARR\n" + 
				"D_32$BETSCHDORF\n" + 
				"D_32$BOUXWILLER\n" + 
				"D_32$HAGUENAU\n" + 
				"D_32$HAGUENAU\n" + 
				"D_32$MOLSHEIM\n" + 
				"D_32$NIEDERBRONN-LES-BAINS\n" + 
				"D_32$PFAFFENHOFFEN\n" + 
				"D_32$REICHSHOFFEN\n" + 
				"D_32$SAVERNE\n" + 
				"D_32$STRASBOURG\n" + 
				"D_32$STRASBOURG\n" + 
				"D_32$STRASBOURG\n" + 
				"D_32$STRASBOURG\n" + 
				"D_32$STRASBOURG\n" + 
				"D_32$STRASBOURG\n" + 
				"D_32$STRASBOURG\n" + 
				"D_32$STRASBOURG\n" + 
				"D_32$STRASBOURG\n" + 
				"D_32$STRASBOURG\n" + 
				"D_32$WALDERSBACH\n" + 
				"D_32$WINGEN-SUR-MODER\n" + 
				"D_32$WISSEMBOURG\n" + 
				"D_32$WOERTH\n" + 
				"D_33$ALTKIRCH\n" + 
				"D_33$BIESHEIM\n" + 
				"D_33$CERNAY\n" + 
				"D_33$COLMAR\n" + 
				"D_33$COLMAR\n" + 
				"D_33$COLMAR\n" + 
				"D_33$GUEBWILLER\n" + 
				"D_33$HUNINGE\n" + 
				"D_33$KAYSERSBERG\n" + 
				"D_33$KIENTZHEIM\n" + 
				"D_33$MULHOUSE\n" + 
				"D_33$MULHOUSE\n" + 
				"D_33$MULHOUSE\n" + 
				"D_33$MULHOUSE\n" + 
				"D_33$MULHOUSE\n" + 
				"D_33$MULHOUSE\n" + 
				"D_33$MULHOUSE\n" + 
				"D_33$MULHOUSE\n" + 
				"D_33$NEUF-BRISACH\n" + 
				"D_33$OLTINGUE\n" + 
				"D_33$RIQUEWIHR\n" + 
				"D_33$RIXHEIM\n" + 
				"D_33$THANN\n" + 
				"D_33$UNGERSHEIM\n" + 
				"D_42$BERGERAC\n" + 
				"D_42$BOURDEILLES\n" + 
				"D_42$BRANTOME\n" + 
				"D_42$CREYSSE\n" + 
				"D_42$DOMME\n" + 
				"D_42$LES EYZIES-DE-TAYAC\n" + 
				"D_42$MONTIGNAC\n" + 
				"D_42$MUSSIDAN\n" + 
				"D_42$NONTRON\n" + 
				"D_42$PERIGUEUX\n" + 
				"D_42$PERIGUEUX\n" + 
				"D_42$PERIGUEUX\n" + 
				"D_42$SAINT-AVIT-SENIEUR\n" + 
				"D_42$SARLAT-LA-CANEDA\n" + 
				"D_42$VILLEFRANCHE-DE-LONCHAT\n" + 
				"D_43$BLASIMON\n" + 
				"D_43$BLAYE\n" + 
				"D_43$BORDEAUX\n" + 
				"D_43$BORDEAUX\n" + 
				"D_43$BORDEAUX\n" + 
				"D_43$BORDEAUX\n" + 
				"D_43$BORDEAUX\n" + 
				"D_43$BORDEAUX\n" + 
				"D_43$BORDEAUX\n" + 
				"D_43$BOURG-SUR-GIRONDE\n" + 
				"D_43$LA REOLE\n" + 
				"D_43$LIBOURNE\n" + 
				"D_43$LIBOURNE\n" + 
				"D_43$SAINT-EMILION\n" + 
				"D_43$VILLANDRAUT\n" + 
				"D_44$BISCARROSSE\n" + 
				"D_44$DAX\n" + 
				"D_44$HASTINGUES\n" + 
				"D_44$LUXEY\n" + 
				"D_44$MONT-DE-MARSAN\n" + 
				"D_44$MONTFORT-EN-CHALOSSE\n" + 
				"D_44$MOUSTEY\n" + 
				"D_44$SABRES\n" + 
				"D_44$SAINT-SEVER\n" + 
				"D_44$SAMADET\n" + 
				"D_44$SANGUINET\n" + 
				"D_45$AGEN\n" + 
				"D_45$MARMANDE\n" + 
				"D_45$MEZIN\n" + 
				"D_45$NERAC\n" + 
				"D_45$SAUVETERRE-LA-LEMANCE\n" + 
				"D_45$VILLENEUVE-SUR-LOT\n" + 
				"D_46$ARUDY\n" + 
				"D_46$BAYONNE\n" + 
				"D_46$BAYONNE\n" + 
				"D_46$BAYONNE\n" + 
				"D_46$CAMBO-LES-BAINS\n" + 
				"D_46$GUETHARY\n" + 
				"D_46$PAU\n" + 
				"D_46$PAU\n" + 
				"D_46$PAU\n" + 
				"D_46$PAU\n" + 
				"D_61$CERILLY\n" + 
				"D_61$GANNAT\n" + 
				"D_61$IZEURE\n" + 
				"D_61$MONTLUCON\n" + 
				"D_61$MOULINS\n" + 
				"D_61$MOULINS\n" + 
				"D_61$NERIS-LES-BAINS\n" + 
				"D_61$SOUVIGNY\n" + 
				"D_61$VICHY\n" + 
				"D_62$AURILLAC\n" + 
				"D_62$AURILLAC\n" + 
				"D_62$RUYNES-EN-MARGERIDE\n" + 
				"D_62$SAINT-FLOUR\n" + 
				"D_62$SAINT-FLOUR\n" + 
				"D_63$CHILHAC\n" + 
				"D_63$LAVAUDIEU\n" + 
				"D_63$LE PUY-EN-VELAY\n" + 
				"D_63$RETOURNAC\n" + 
				"D_63$SAINT ARCONS D'ALLIER\n" + 
				"D_64$ARLANC\n" + 
				"D_64$CLERMONT-FERRAND\n" + 
				"D_64$CLERMONT-FERRAND\n" + 
				"D_64$CLERMONT-FERRAND\n" + 
				"D_64$LEZOUX\n" + 
				"D_64$MARSAC-EN-LIVRADOIS\n" + 
				"D_64$MENAT\n" + 
				"D_64$MOZAC\n" + 
				"D_64$MUROL\n" + 
				"D_64$RIOM\n" + 
				"D_64$RIOM\n" + 
				"D_64$THIERS\n" + 
				"D_64$VOLVIC\n" + 
				"D_50$ALISE-SAINTE-REINE\n" + 
				"D_50$AUXONNE\n" + 
				"D_50$BEAUNE\n" + 
				"D_50$BEAUNE\n" + 
				"D_50$BEAUNE\n" + 
				"D_50$BUFFON\n" + 
				"D_50$CHATILLON-SUR-SEINE\n" + 
				"D_50$DIJON\n" + 
				"D_50$DIJON\n" + 
				"D_50$DIJON\n" + 
				"D_50$DIJON\n" + 
				"D_50$DIJON\n" + 
				"D_50$DIJON\n" + 
				"D_50$DIJON\n" + 
				"D_50$FIXIN\n" + 
				"D_50$GEVREY-CHAMBERTIN\n" + 
				"D_50$MONTBARD\n" + 
				"D_50$MONTBARD\n" + 
				"D_50$NUITS-SAINT-GEORGES\n" + 
				"D_50$SAULIEU\n" + 
				"D_50$SEMUR-EN-AUXOIS\n" + 
				"D_51$CHATEAU-CHINON\n" + 
				"D_51$CHATEAU-CHINON\n" + 
				"D_51$CLAMECY\n" + 
				"D_51$COSNE-SUR-LOIRE\n" + 
				"D_51$LA CHARITE-SUR-LOIRE\n" + 
				"D_51$LA MACHINE\n" + 
				"D_51$NEVERS\n" + 
				"D_51$NEVERS\n" + 
				"D_51$POUILLY-SUR-LOIRE\n" + 
				"D_51$SAINT-AMAND-EN-PUISAYE\n" + 
				"D_51$VARZY\n" + 
				"D_52$AUTUN\n" + 
				"D_52$AUTUN\n" + 
				"D_52$AUTUN\n" + 
				"D_52$AUTUN\n" + 
				"D_52$BLANZY\n" + 
				"D_52$BOURBON-LANCY\n" + 
				"D_52$CHALON-SUR-SAONE\n" + 
				"D_52$CHALON-SUR-SAONE\n" + 
				"D_52$CHAROLLES\n" + 
				"D_52$CHAROLLES\n" + 
				"D_52$CLUNY\n" + 
				"D_52$LE CREUSOT\n" + 
				"D_52$LOUHANS\n" + 
				"D_52$MACON\n" + 
				"D_52$MACON\n" + 
				"D_52$MARCIGNY\n" + 
				"D_52$PARAY-LE-MONIAL\n" + 
				"D_52$PARAY-LE-MONIAL\n" + 
				"D_52$PIERRE-DE-BRESSE\n" + 
				"D_52$ROMANECHE-THORINS\n" + 
				"D_52$ROMENAY\n" + 
				"D_52$SOLUTRE-POUILLY\n" + 
				"D_52$TOURNUS\n" + 
				"D_52$TOURNUS\n" + 
				"D_52$VERDUN-SUR-LE-DOUBS\n" + 
				"D_53$AUXERRE\n" + 
				"D_53$AUXERRE\n" + 
				"D_53$AUXERRE\n" + 
				"D_53$AVALLON\n" + 
				"D_53$NOYERS-SUR-SEREIN\n" + 
				"D_53$SAINT-FARGEAU\n" + 
				"D_53$SAINT-SAUVEUR-EN-PUISAYE\n" + 
				"D_53$SENS\n" + 
				"D_53$TONNERRE\n" + 
				"D_53$VEZELAY\n" + 
				"D_53$VILLENEUVE-SUR-YONNE\n" + 
				"D_53$VILLIERS-SAINT-BENOIT\n" + 
				"D_54$DINAN\n" + 
				"D_54$LAMBALLE\n" + 
				"D_54$SAINT-BRIEUC\n" + 
				"D_55$BREST\n" + 
				"D_55$BREST\n" + 
				"D_55$COMMANA\n" + 
				"D_55$CONCARNEAU\n" + 
				"D_55$DOUARNENEZ\n" + 
				"D_55$MORLAIX\n" + 
				"D_55$OUESSANT\n" + 
				"D_55$OUESSANT\n" + 
				"D_55$PONT-AVEN\n" + 
				"D_55$PONT-L'ABBE\n" + 
				"D_55$QUIMPER\n" + 
				"D_55$QUIMPER\n" + 
				"D_55$RIVOAL\n" + 
				"D_55$TREGARVAN\n" + 
				"D_56$MONTFORT-SUR-MEU\n" + 
				"D_56$MONTREUIL-SOUS-PEROUSE\n" + 
				"D_56$RENNES\n" + 
				"D_56$RENNES\n" + 
				"D_56$RENNES\n" + 
				"D_56$SAINT-MALO\n" + 
				"D_56$SAINT-MALO\n" + 
				"D_56$VITRE\n" + 
				"D_56$VITRE\n" + 
				"D_56$VITRE\n" + 
				"D_57$BREC'H\n" + 
				"D_57$CARNAC\n" + 
				"D_57$ILE DE GROIX\n" + 
				"D_57$INZINZAC-LOCHRIST\n" + 
				"D_57$LE FAOUET\n" + 
				"D_57$PORT-LOUIS\n" + 
				"D_57$PORT-LOUIS\n" + 
				"D_57$SAINT-MARCEL - MALESTROIT\n" + 
				"D_57$SARZEAU\n" + 
				"D_57$VANNES\n" + 
				"D_57$VANNES\n" + 
				"D_5$BOURGES\n" + 
				"D_5$BOURGES\n" + 
				"D_5$BOURGES\n" + 
				"D_5$BOURGES\n" + 
				"D_5$BOURGES\n" + 
				"D_5$CHATEAUMEILLANT\n" + 
				"D_5$MEHUN-SUR-YEVRE\n" + 
				"D_5$SAINT-AMAND-MONTROND\n" + 
				"D_5$VIERZON\n" + 
				"D_6$BONNEVAL\n" + 
				"D_6$CHARTRES\n" + 
				"D_6$CHARTRES\n" + 
				"D_6$CHARTRES-MAINVILLIERS\n" + 
				"D_6$CHATEAUDUN\n" + 
				"D_6$DREUX\n" + 
				"D_6$ILLIERS-COMBRAY\n" + 
				"D_6$NOGENT-LE-ROTROU\n" + 
				"D_6$SAINVILLE\n" + 
				"D_7$ARGENTON-SUR-CREUSE\n" + 
				"D_7$AZAY-LE-FERRON\n" + 
				"D_7$CHATEAUROUX\n" + 
				"D_7$ISSOUDUN\n" + 
				"D_7$LA CHATRE\n" + 
				"D_7$LANGE\n" + 
				"D_7$LE BLANC\n" + 
				"D_7$SAINT-MARCEL\n" + 
				"D_8$AMBOISE\n" + 
				"D_8$AMBOISE\n" + 
				"D_8$CHINON\n" + 
				"D_8$DESCARTES\n" + 
				"D_8$LE GRAND PRESSIGNY\n" + 
				"D_8$LOCHES\n" + 
				"D_8$LOCHES\n" + 
				"D_8$RICHELIEU\n" + 
				"D_8$SACHE\n" + 
				"D_8$SAINTE-MAURE-DE-TOURAINE\n" + 
				"D_8$SAVIGNE-SUR-LATHAN\n" + 
				"D_8$SAVIGNY-EN-VERON\n" + 
				"D_8$SEUILLY\n" + 
				"D_8$TOURS\n" + 
				"D_8$TOURS\n" + 
				"D_8$TOURS\n" + 
				"D_8$TOURS\n" + 
				"D_8$TOURS\n" + 
				"D_8$YZEURES-SUR-CREUSE\n" + 
				"D_9$BLOIS\n" + 
				"D_9$BLOIS\n" + 
				"D_9$BLOIS\n" + 
				"D_9$MER\n" + 
				"D_9$NAVEIL\n" + 
				"D_9$ROMORANTIN-LANTHENAY\n" + 
				"D_9$THESEE\n" + 
				"D_9$VENDOME\n" + 
				"D_10$ARTENAY\n" + 
				"D_10$BEAUGENCY\n" + 
				"D_10$CHATEAUNEUF-SUR-LOIRE\n" + 
				"D_10$CHATILLON-COLIGNY\n" + 
				"D_10$GIEN\n" + 
				"D_10$MEUNG-SUR-LOIRE\n" + 
				"D_10$MONTARGIS\n" + 
				"D_10$MONTARGIS\n" + 
				"D_10$ORLEANS\n" + 
				"D_10$ORLEANS\n" + 
				"D_10$ORLEANS\n" + 
				"D_10$PITHIVIERS\n" + 
				"D_65$BAZEILLES\n" + 
				"D_65$CHARLEVILLE-MEZIERES\n" + 
				"D_65$CHARLEVILLE-MEZIERES\n" + 
				"D_65$GIVET\n" + 
				"D_65$MOUZON\n" + 
				"D_65$RETHEL\n" + 
				"D_65$SEDAN\n" + 
				"D_66$BAR-SUR-AUBE\n" + 
				"D_66$BRIENNE-LE-CHATEAU\n" + 
				"D_66$MUSSY-SUR-SEINE\n" + 
				"D_66$NOGENT-SUR-SEINE\n" + 
				"D_66$TROYES\n" + 
				"D_66$TROYES\n" + 
				"D_66$TROYES\n" + 
				"D_66$TROYES\n" + 
				"D_66$TROYES\n" + 
				"D_66$TROYES\n" + 
				"D_66$TROYES\n" + 
				"D_67$BOURBONNE-LES-BAINS\n" + 
				"D_67$CHAUMONT\n" + 
				"D_67$CHAUMONT\n" + 
				"D_67$LANGRES\n" + 
				"D_67$LANGRES\n" + 
				"D_67$NOGENT\n" + 
				"D_67$SAINT-DIZIER\n" + 
				"D_68$CHALONS-EN-CHAMPAGNE\n" + 
				"D_68$CHALONS-EN-CHAMPAGNE\n" + 
				"D_68$CHALONS-EN-CHAMPAGNE\n" + 
				"D_68$EPERNAY\n" + 
				"D_68$POURCY\n" + 
				"D_68$REIMS\n" + 
				"D_68$REIMS\n" + 
				"D_68$REIMS\n" + 
				"D_68$REIMS\n" + 
				"D_68$SAINTE-MENEHOULD\n" + 
				"D_1$AJACCIO\n" + 
				"D_1$AJACCIO\n" + 
				"D_1$AJACCIO\n" + 
				"D_1$LEVIE\n" + 
				"D_1$SARTENE\n" + 
				"D_2$ALERIA\n" + 
				"D_2$BASTIA\n" + 
				"D_2$CORTE\n" + 
				"D_2$LUCCIANA\n" + 
				"D_2$MOROSAGLIA\n" + 
				"D_98$BESANCON\n" + 
				"D_98$BESANCON\n" + 
				"D_98$BESANCON\n" + 
				"D_98$BESANCON\n" + 
				"D_98$BESANCON\n" + 
				"D_98$MONTBELIARD\n" + 
				"D_98$MONTBELIARD\n" + 
				"D_98$NANCRAY\n" + 
				"D_98$ORNANS\n" + 
				"D_98$PONTARLIER\n" + 
				"D_99$CHAMPLITTE\n" + 
				"D_99$FOUGEROLLES\n" + 
				"D_99$GRAY\n" + 
				"D_99$LE HAUT-DU-THEM\n" + 
				"D_99$LUXEUIL-LES-BAINS\n" + 
				"D_99$VESOUL\n" + 
				"D_100$ARBOIS\n" + 
				"D_100$ARBOIS\n" + 
				"D_100$CHAMPAGNOLE\n" + 
				"D_100$DOLE\n" + 
				"D_100$LONS-LE-SAUNIER\n" + 
				"D_100$LONS-LE-SAUNIER\n" + 
				"D_100$MOIRANS-EN-MONTAGNE\n" + 
				"D_100$MOREZ\n" + 
				"D_100$POLIGNY\n" + 
				"D_100$SAINT-CLAUDE\n" + 
				"D_100$SALINS-LES-BAINS\n" + 
				"D_100$SALINS-LES-BAINS\n" + 
				"D_100$VOITEUR\n" + 
				"D_101$BEAUCOURT\n" + 
				"D_101$BELFORT\n" + 
				"D_101$BELFORT\n" + 
				"D_101$ETUEFFONT\n" + 
				"D_97$BASSE TERRE\n" + 
				"D_97$GRAND-BOURG de MARIE-GALANTE\n" + 
				"D_97$LE MOULE\n" + 
				"D_97$POINTE-A-PITRE\n" + 
				"D_97$POINTE-A-PITRE\n" + 
				"D_97$POINTE-A-PITRE\n" + 
				"D_34$CAYENNE\n" + 
				"D_34$CAYENNE\n" + 
				"D_34$REGINA\n" + 
				"D_12$BIEVRES\n" + 
				"D_12$BOUSSY-SAINT-ANTOINE\n" + 
				"D_12$BRUNOY\n" + 
				"D_12$DOURDAN\n" + 
				"D_12$ETAMPES\n" + 
				"D_13$BOULOGNE-BILLANCOURT\n" + 
				"D_13$BOULOGNE-BILLANCOURT\n" + 
				"D_13$BOULOGNE-BILLANCOURT\n" + 
				"D_13$BOULOGNE-BILLANCOURT\n" + 
				"D_13$CLAMART\n" + 
				"D_13$COLOMBES\n" + 
				"D_13$COURBEVOIE\n" + 
				"D_13$COURBEVOIE\n" + 
				"D_13$ISSY-LES-MOULINEAUX\n" + 
				"D_13$MEUDON\n" + 
				"D_13$MEUDON\n" + 
				"D_13$NEUILLY-SUR-SEINE\n" + 
				"D_13$RUEIL-MALMAISON\n" + 
				"D_13$RUEIL-MALMAISON\n" + 
				"D_13$RUEIL-MALMAISON\n" + 
				"D_13$SAINT-CLOUD\n" + 
				"D_13$SCEAUX\n" + 
				"D_13$SEVRES\n" + 
				"D_13$SURESNES\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_14$PARIS\n" + 
				"D_15$BARBIZON\n" + 
				"D_15$CHELLES\n" + 
				"D_15$CHELLES\n" + 
				"D_15$COULOMMIERS\n" + 
				"D_15$COUPVRAY\n" + 
				"D_15$CRECY-LA-CHAPELLE\n" + 
				"D_15$FONTAINEBLEAU\n" + 
				"D_15$FONTAINEBLEAU\n" + 
				"D_15$LAGNY-SUR-MARNE\n" + 
				"D_15$LE MEE-SUR-SEINE\n" + 
				"D_15$MEAUX\n" + 
				"D_15$MEAUX\n" + 
				"D_15$MELUN\n" + 
				"D_15$MELUN\n" + 
				"D_15$MORET-SUR-LOING\n" + 
				"D_15$NEMOURS\n" + 
				"D_15$NEMOURS\n" + 
				"D_15$PROVINS\n" + 
				"D_15$SAINT-CYR-SUR-MORIN\n" + 
				"D_15$SAVIGNY-LE-TEMPLE\n" + 
				"D_15$VULAINES-SUR-SEINE\n" + 
				"D_16$LE BOURGET\n" + 
				"D_16$LIVRY-GARGAN\n" + 
				"D_16$MONTREUIL-SOUS-BOIS\n" + 
				"D_16$SAINT-DENIS\n" + 
				"D_16$SAINT-OUEN\n" + 
				"D_17$ARGENTEUIL\n" + 
				"D_17$ECOUEN\n" + 
				"D_17$GUIRY-EN-VEXIN\n" + 
				"D_17$L'ISLE-ADAM\n" + 
				"D_17$LOUVRES\n" + 
				"D_17$MONTMORENCY\n" + 
				"D_17$PONTOISE\n" + 
				"D_17$PONTOISE\n" + 
				"D_18$BRY-SUR-MARNE\n" + 
				"D_18$CHAMPIGNY-SUR-MARNE\n" + 
				"D_18$FRESNES\n" + 
				"D_18$LA VARENNE-SAINT-HILAIRE\n" + 
				"D_18$MAISONS-ALFORT\n" + 
				"D_18$NOGENT-SUR-MARNE\n" + 
				"D_18$VILLIERS-SUR-MARNE\n" + 
				"D_18$VITRY SUR SEINE\n" + 
				"D_19$CONFLANS-SAINTE-HONORINE\n" + 
				"D_19$JOUY-EN-JOSAS\n" + 
				"D_19$LOUVECIENNES\n" + 
				"D_19$MAGNY-LES-HAMEAUX\n" + 
				"D_19$MANTES-LA-JOLIE\n" + 
				"D_19$MAULE\n" + 
				"D_19$MEDAN\n" + 
				"D_19$MONTFORT-L'AMAURY\n" + 
				"D_19$POISSY\n" + 
				"D_19$POISSY\n" + 
				"D_19$RAMBOUILLET\n" + 
				"D_19$SAINT-GERMAIN-EN-LAYE\n" + 
				"D_19$SAINT-GERMAIN-EN-LAYE\n" + 
				"D_19$SAINT-GERMAIN-EN-LAYE\n" + 
				"D_19$SAINT-QUENTIN-YVELINES\n" + 
				"D_19$ST-REMY-LES-CHEVREUSE\n" + 
				"D_19$VERSAILLES\n" + 
				"D_19$VERSAILLES\n" + 
				"D_22$BRAM\n" + 
				"D_22$CARCASSONNE\n" + 
				"D_22$CASTELNAUDARY\n" + 
				"D_22$LASTOURS\n" + 
				"D_22$LIMOUX\n" + 
				"D_22$NARBONNE\n" + 
				"D_22$NARBONNE\n" + 
				"D_22$SALLELES D'AUDE\n" + 
				"D_22$SIGEAN\n" + 
				"D_23$ALES\n" + 
				"D_23$ALES\n" + 
				"D_23$BAGNOLS-SUR-CEZE\n" + 
				"D_23$BAGNOLS-SUR-CEZE\n" + 
				"D_23$BEAUCAIRE\n" + 
				"D_23$LE VIGAN\n" + 
				"D_23$NIMES\n" + 
				"D_23$NIMES\n" + 
				"D_23$NIMES\n" + 
				"D_23$NIMES\n" + 
				"D_23$NIMES\n" + 
				"D_23$NIMES\n" + 
				"D_23$PONT-SAINT-ESPRIT\n" + 
				"D_23$PONT-SAINT-ESPRIT\n" + 
				"D_23$SAINT-GILLES-DU-GARD\n" + 
				"D_23$SAINT-JEAN DU GARD\n" + 
				"D_23$UZES\n" + 
				"D_23$VILLENEUVE-LES-AVIGNON\n" + 
				"D_24$AGDE\n" + 
				"D_24$BEZIERS\n" + 
				"D_24$BEZIERS\n" + 
				"D_24$BEZIERS\n" + 
				"D_24$BOUZIGUES\n" + 
				"D_24$FRONTIGNAN-LA-PEYRADE\n" + 
				"D_24$HEREPIAN\n" + 
				"D_24$LATTES\n" + 
				"D_24$LE CAP D'AGDE\n" + 
				"D_24$LES MATELLES\n" + 
				"D_24$LODEVE\n" + 
				"D_24$MINERVE\n" + 
				"D_24$MONTPELLIER\n" + 
				"D_24$MONTPELLIER\n" + 
				"D_24$MONTPELLIER\n" + 
				"D_24$MONTPELLIER\n" + 
				"D_24$MONTPELLIER\n" + 
				"D_24$MURVIEL-LES-MONTPELLIER\n" + 
				"D_24$PEZENAS\n" + 
				"D_24$SAINT-PONS-DE-THOMIERES\n" + 
				"D_24$SETE\n" + 
				"D_25$MENDE\n" + 
				"D_25$PONT DE MONTVERT\n" + 
				"D_26$CERET\n" + 
				"D_26$COLLIOURE\n" + 
				"D_26$PERPIGNAN\n" + 
				"D_26$PERPIGNAN\n" + 
				"D_26$PERPIGNAN\n" + 
				"D_26$PERPIGNAN\n" + 
				"D_26$PERPIGNAN\n" + 
				"D_26$PORT-VENDRES\n" + 
				"D_26$SAINTE-LEOCADIE\n" + 
				"D_26$TAUTAVEL\n" + 
				"D_47$BRIVE-LA-GAILLARDE\n" + 
				"D_47$SARRAN\n" + 
				"D_47$TULLE\n" + 
				"D_47$TULLE\n" + 
				"D_47$USSEL\n" + 
				"D_48$AUBUSSON\n" + 
				"D_48$GUERET\n" + 
				"D_49$CHATEAUPONSAC\n" + 
				"D_49$LIMOGES\n" + 
				"D_49$LIMOGES\n" + 
				"D_49$ROCHECHOUART\n" + 
				"D_27$DENEUVRE\n" + 
				"D_27$JARVILLE-LA-MALGRANGE\n" + 
				"D_27$LANEUVEVILLE-DEVANT-NANCY\n" + 
				"D_27$LONGWY\n" + 
				"D_27$LUNEVILLE\n" + 
				"D_27$NANCY\n" + 
				"D_27$NANCY\n" + 
				"D_27$NANCY\n" + 
				"D_27$NANCY\n" + 
				"D_27$PONT-A-MOUSSON\n" + 
				"D_27$TOUL\n" + 
				"D_28$BAR-LE-DUC\n" + 
				"D_28$COMMERCY\n" + 
				"D_28$MONTMEDY\n" + 
				"D_28$SAINT-MIHIEL\n" + 
				"D_28$SAMPIGNY\n" + 
				"D_28$STENAY\n" + 
				"D_28$VARENNES-EN-ARGONNE\n" + 
				"D_28$VAUCOULEURS\n" + 
				"D_28$VERDUN\n" + 
				"D_29$GRAVELOTTE\n" + 
				"D_29$MARSAL\n" + 
				"D_29$MEISENTHAL\n" + 
				"D_29$METZ\n" + 
				"D_29$METZ\n" + 
				"D_29$NEUFCHEF\n" + 
				"D_29$PETITE-ROSSELLE\n" + 
				"D_29$PHALSBOURG\n" + 
				"D_29$SARREBOURG\n" + 
				"D_29$SARREGUEMINES\n" + 
				"D_29$SARREGUEMINES\n" + 
				"D_29$THIONVILLE\n" + 
				"D_29$VIC-SUR-SEILLE\n" + 
				"D_30$EPINAL\n" + 
				"D_30$EPINAL\n" + 
				"D_30$MIRECOURT\n" + 
				"D_30$PLOMBIERES-LES-BAINS\n" + 
				"D_30$REMIREMONT\n" + 
				"D_30$REMIREMONT\n" + 
				"D_30$SAINT-DIE-DES-VOSGES\n" + 
				"D_31$FORT-DE-FRANCE\n" + 
				"D_31$FORT-DE-FRANCE\n" + 
				"D_31$FORT-DE-FRANCE TERRE-SAINVILLE\n" + 
				"D_31$LES TROIS ILETS\n" + 
				"D_31$RIVIERE-PILOTE\n" + 
				"D_31$SAINT-PIERRE\n" + 
				"D_69$FOIX\n" + 
				"D_69$LAVELANET\n" + 
				"D_69$LE MAS D'AZIL\n" + 
				"D_69$MONTGAILHARD\n" + 
				"D_69$MONTSEGUR\n" + 
				"D_69$SAINT-LIZIER\n" + 
				"D_70$DECAZEVILLE\n" + 
				"D_70$ESPALION\n" + 
				"D_70$ESPALION\n" + 
				"D_70$MILLAU\n" + 
				"D_70$RODEZ\n" + 
				"D_70$RODEZ\n" + 
				"D_70$RODEZ\n" + 
				"D_70$ROQUEFORT-SUR-SOULZON\n" + 
				"D_70$SALLES-LA-SOURCE\n" + 
				"D_70$SALMIECH\n" + 
				"D_70$VILLEFRANCHE-DE-ROUERGUE\n" + 
				"D_71$AUCH\n" + 
				"D_71$CONDOM\n" + 
				"D_71$EAUZE\n" + 
				"D_71$L'ISLE JOURDAIN\n" + 
				"D_71$LECTOURE\n" + 
				"D_71$MARCIAC\n" + 
				"D_71$MIRANDE\n" + 
				"D_72$AURIGNAC\n" + 
				"D_72$BAGNERES-DE-LUCHON\n" + 
				"D_72$MARTRES-TOLOSANE\n" + 
				"D_72$SAINT-BERTRAND-DE-COMMINGES\n" + 
				"D_72$SAINT-GAUDENS\n" + 
				"D_72$TOULOUSE\n" + 
				"D_72$TOULOUSE\n" + 
				"D_72$TOULOUSE\n" + 
				"D_72$TOULOUSE\n" + 
				"D_72$TOULOUSE\n" + 
				"D_72$TOULOUSE\n" + 
				"D_72$TOULOUSE\n" + 
				"D_72$TOULOUSE\n" + 
				"D_73$BAGNERES-DE-BIGORRE\n" + 
				"D_73$BAGNERES-DE-BIGORRE\n" + 
				"D_73$BAGNERES-DE-BIGORRE\n" + 
				"D_73$LOURDES\n" + 
				"D_73$LUZ-SAINT-SAUVEUR\n" + 
				"D_73$MAUVEZIN\n" + 
				"D_73$TARBES\n" + 
				"D_74$CABRERETS\n" + 
				"D_74$CAHORS\n" + 
				"D_74$FIGEAC\n" + 
				"D_74$FIGEAC\n" + 
				"D_74$LABASTIDE MURAT\n" + 
				"D_74$LUZECH\n" + 
				"D_74$MARTEL\n" + 
				"D_74$ROCAMADOUR\n" + 
				"D_74$SAULIAC-SUR-CELE\n" + 
				"D_74$SOUILLAC\n" + 
				"D_74$VAYRAC\n" + 
				"D_75$ALBI\n" + 
				"D_75$ANDILLAC\n" + 
				"D_75$CASTRES\n" + 
				"D_75$CASTRES\n" + 
				"D_75$CORDES-SUR-CIEL\n" + 
				"D_75$FERRIERES\n" + 
				"D_75$GAILLAC\n" + 
				"D_75$GAILLAC\n" + 
				"D_75$GAILLAC\n" + 
				"D_75$LA-BASTIDE-ROUAIROUX\n" + 
				"D_75$LAVAUR\n" + 
				"D_75$LISLE-SUR-TARN\n" + 
				"D_75$RABASTENS\n" + 
				"D_76$AUVILLAR\n" + 
				"D_76$GRISOLLES\n" + 
				"D_76$MOISSAC\n" + 
				"D_76$MONTAUBAN\n" + 
				"D_76$MONTAUBAN\n" + 
				"D_76$SAINT-ANTONIN-NOBLE-VAL\n" + 
				"D_20$ANZIN\n" + 
				"D_20$AVESNES-SUR-HELPE\n" + 
				"D_20$BAILLEUL\n" + 
				"D_20$BAVAY\n" + 
				"D_20$BERGUES\n" + 
				"D_20$BOUCHAIN\n" + 
				"D_20$CAMBRAI\n" + 
				"D_20$CAMBRAI\n" + 
				"D_20$CASSEL\n" + 
				"D_20$DENAIN\n" + 
				"D_20$DOUAI\n" + 
				"D_20$DUNKERQUE\n" + 
				"D_20$DUNKERQUE\n" + 
				"D_20$DUNKERQUE\n" + 
				"D_20$ESCAUDAIN\n" + 
				"D_20$FOURMIES\n" + 
				"D_20$GRAVELINES\n" + 
				"D_20$HAZEBROUCK\n" + 
				"D_20$LE CATEAU-CAMBRESIS\n" + 
				"D_20$LEWARDE\n" + 
				"D_20$LILLE\n" + 
				"D_20$LILLE\n" + 
				"D_20$LILLE\n" + 
				"D_20$MARCHIENNES\n" + 
				"D_20$MAUBEUGE\n" + 
				"D_20$ROUBAIX\n" + 
				"D_20$SAINT-AMAND-LES-EAUX\n" + 
				"D_20$SARS-POTERIES\n" + 
				"D_20$TOURCOING\n" + 
				"D_20$VALENCIENNES\n" + 
				"D_20$VILLENEUVE-D'ASCQ\n" + 
				"D_21$ARRAS\n" + 
				"D_21$BERCK-SUR-MER\n" + 
				"D_21$BETHUNE\n" + 
				"D_21$BOULOGNE-SUR-MER\n" + 
				"D_21$BOULOGNE-SUR-MER\n" + 
				"D_21$CALAIS\n" + 
				"D_21$DESVRES\n" + 
				"D_21$ETAPLES-SUR-MER\n" + 
				"D_21$HARNES\n" + 
				"D_21$LE TOUQUET-PARIS-PLAGE\n" + 
				"D_21$LENS\n" + 
				"D_21$MONTREUIL-SUR-MER\n" + 
				"D_21$SAINT-OMER\n" + 
				"D_21$SAINT-OMER\n" + 
				"D_21$SAINT-POL-SUR-TERNOISE\n" + 
				"D_21$SAMER\n" + 
				"D_58$ARROMANCHES\n" + 
				"D_58$BAYEUX\n" + 
				"D_58$BEAUMONT-EN-AUGE\n" + 
				"D_58$CAEN\n" + 
				"D_58$CAEN\n" + 
				"D_58$CAEN\n" + 
				"D_58$CAEN\n" + 
				"D_58$CAEN\n" + 
				"D_58$CAEN\n" + 
				"D_58$HONFLEUR\n" + 
				"D_58$HONFLEUR\n" + 
				"D_58$LE MOLAY-LITTRY\n" + 
				"D_58$LE MOLAY-LITTRY\n" + 
				"D_58$LISIEUX\n" + 
				"D_58$LISIEUX\n" + 
				"D_58$ORBEC\n" + 
				"D_58$PONTECOULANT\n" + 
				"D_58$SAINT-PIERRE-SUR-DIVES\n" + 
				"D_58$TILLY-SUR-SEULLES\n" + 
				"D_58$TROUVILLE-SUR-MER\n" + 
				"D_58$VIEUX\n" + 
				"D_58$VILLERS-SUR-MER\n" + 
				"D_58$VIRE\n" + 
				"D_59$AVRANCHES\n" + 
				"D_59$BARENTON\n" + 
				"D_59$BRICQUEBEC\n" + 
				"D_59$CERISY-LA-FORET\n" + 
				"D_59$CHERBOURG-OCTEVILLE\n" + 
				"D_59$CHERBOURG-OCTEVILLE\n" + 
				"D_59$CHERBOURG-OCTEVILLE\n" + 
				"D_59$COUTANCES\n" + 
				"D_59$EQUEURDREVILLLE-HAINEVILLE\n" + 
				"D_59$GRANVILLE\n" + 
				"D_59$GRANVILLE\n" + 
				"D_59$GRANVILLE\n" + 
				"D_59$SAINT-LO\n" + 
				"D_59$SAINT-LO\n" + 
				"D_59$SAINT-MICHEL-DE-MONTJOIE\n" + 
				"D_59$SAINT-SAUVEUR-LE-VICOMTE\n" + 
				"D_59$SAINT-VAAST-LA-HOUGUE\n" + 
				"D_59$TORIGNI-SUR-VIRE\n" + 
				"D_59$VALOGNES\n" + 
				"D_59$VILLEDIEU-LES-POELES\n" + 
				"D_60$ALENCON\n" + 
				"D_60$FLERS\n" + 
				"D_60$L'AIGLE\n" + 
				"D_60$LA FERTE-MACE\n" + 
				"D_60$MORTAGNE-AU-PERCHE\n" + 
				"D_60$SAINT-CYR LA ROSIERE\n" + 
				"D_60$SEES\n" + 
				"D_3$BERNAY\n" + 
				"D_3$CONCHES-EN-OUCHE\n" + 
				"D_3$EVREUX\n" + 
				"D_3$LA COUTURE-BOUSSEY\n" + 
				"D_3$LES ANDELYS\n" + 
				"D_3$LOUVIERS\n" + 
				"D_3$PONT-AUDEMER\n" + 
				"D_3$VERNON\n" + 
				"D_4$BARENTIN\n" + 
				"D_4$CANTELEU\n" + 
				"D_4$CAUDEBEC-EN-CAUX\n" + 
				"D_4$CAUDEBEC-EN-CAUX\n" + 
				"D_4$DIEPPE\n" + 
				"D_4$ELBEUF\n" + 
				"D_4$EU\n" + 
				"D_4$FECAMP\n" + 
				"D_4$FECAMP\n" + 
				"D_4$HARFLEUR\n" + 
				"D_4$LE HAVRE\n" + 
				"D_4$LE HAVRE\n" + 
				"D_4$LE HAVRE\n" + 
				"D_4$LE HAVRE\n" + 
				"D_4$LE HAVRE\n" + 
				"D_4$LE PETIT-COURONNE\n" + 
				"D_4$LILLEBONNE\n" + 
				"D_4$MARTAINVILLE-EPREVILLE\n" + 
				"D_4$MONTVILLE\n" + 
				"D_4$NEUFCHATEL-EN-BRAY\n" + 
				"D_4$NOTRE-DAME-DE-BLIQUETUIT\n" + 
				"D_4$NOTRE-DAME-DE-BONDEVILLE\n" + 
				"D_4$ROUEN\n" + 
				"D_4$ROUEN\n" + 
				"D_4$ROUEN\n" + 
				"D_4$ROUEN\n" + 
				"D_4$ROUEN\n" + 
				"D_4$ROUEN\n" + 
				"D_4$ROUEN\n" + 
				"D_4$ROUEN\n" + 
				"D_4$SAINT-NICOLAS-D'ALIERMONT\n" + 
				"D_4$VILLEQUIER\n" + 
				"D_4$YVETOT\n" + 
				"D_77$BATZ-SUR-MER\n" + 
				"D_77$BLAIN\n" + 
				"D_77$BOURGNEUF-EN-RETZ\n" + 
				"D_77$CHATEAUBRIANT\n" + 
				"D_77$GUERANDE\n" + 
				"D_77$LE PALLET\n" + 
				"D_77$NANTES\n" + 
				"D_77$NANTES\n" + 
				"D_77$NANTES\n" + 
				"D_77$NANTES\n" + 
				"D_77$SAINT-JOACHIM\n" + 
				"D_77$SAINT-LYPHARD\n" + 
				"D_77$SAINT-MALO DE GUERSAC\n" + 
				"D_77$SAINT-NAZAIRE\n" + 
				"D_78$ANGERS\n" + 
				"D_78$ANGERS\n" + 
				"D_78$ANGERS\n" + 
				"D_78$ANGERS\n" + 
				"D_78$ANGERS\n" + 
				"D_78$BAUGE\n" + 
				"D_78$BEAUFORT-EN-VALLEE\n" + 
				"D_78$CHOLET\n" + 
				"D_78$CHOLET\n" + 
				"D_78$PARCAY-LES-PINS\n" + 
				"D_78$SAINT LAMBERT-DU-LATTAY\n" + 
				"D_78$SAUMUR\n" + 
				"D_78$TRELAZE\n" + 
				"D_79$AMBRIERES-LES-VALLEES\n" + 
				"D_79$CHATEAU-GONTIER\n" + 
				"D_79$COSSE-LE-VIVIEN\n" + 
				"D_79$ERNEE\n" + 
				"D_79$JUBLAINS\n" + 
				"D_79$LAVAL\n" + 
				"D_79$LAVAL\n" + 
				"D_79$MAYENNE\n" + 
				"D_79$RENAZE\n" + 
				"D_80$CHATEAU-DU-LOIR\n" + 
				"D_80$LE MANS\n" + 
				"D_80$LE MANS\n" + 
				"D_80$LE MANS\n" + 
				"D_80$MALICORNE-SUR-SARTHE\n" + 
				"D_80$SAINT-CALAIS\n" + 
				"D_81$FAYMOREAU\n" + 
				"D_81$FONTENAY-LE-COMTE\n" + 
				"D_81$LA BARRE-DE-MONTS\n" + 
				"D_81$LA GUERINIERE\n" + 
				"D_81$LA ROCHE-SUR-YON\n" + 
				"D_81$LA-CHAIZE-LE-VICOMTE\n" + 
				"D_81$LES LUCS-SUR-BOULOGNE\n" + 
				"D_81$LES SABLES D'OLONNE\n" + 
				"D_81$MONTAIGU\n" + 
				"D_81$MOUILLERON-EN-PAREDS\n" + 
				"D_81$NOIRMOUTIER EN L'ILE\n" + 
				"D_81$NOIRMOUTIER-EN-L'ILE\n" + 
				"D_81$SAINT-HILAIRE-DE-RIEZ\n" + 
				"D_81$SOULLANS\n" + 
				"D_35$BLERANCOURT\n" + 
				"D_35$CHATEAU-THIERRY\n" + 
				"D_35$CHAUNY\n" + 
				"D_35$GUISE\n" + 
				"D_35$HIRSON\n" + 
				"D_35$LA FERE\n" + 
				"D_35$LAON\n" + 
				"D_35$ORIGNY-EN-THIERACHE\n" + 
				"D_35$SAINT-MICHEL-EN-THIERACHE\n" + 
				"D_35$SAINT-QUENTIN\n" + 
				"D_35$SAINT-QUENTIN\n" + 
				"D_35$SOISSONS\n" + 
				"D_35$TERGNIER\n" + 
				"D_35$VERVINS\n" + 
				"D_35$VILLERS COTTERETS\n" + 
				"D_36$AUNEUIL\n" + 
				"D_36$BEAUVAIS\n" + 
				"D_36$CHAUMONT-EN-VEXIN\n" + 
				"D_36$COMPIEGNE\n" + 
				"D_36$COMPIEGNE\n" + 
				"D_36$COMPIEGNE\n" + 
				"D_36$COMPIEGNE\n" + 
				"D_36$CREIL\n" + 
				"D_36$CREPY-EN-VALOIS\n" + 
				"D_36$MERU\n" + 
				"D_36$NOYON\n" + 
				"D_36$NOYON\n" + 
				"D_36$SENLIS\n" + 
				"D_36$SENLIS\n" + 
				"D_36$VENDEUIL-CAPLY\n" + 
				"D_37$ABBEVILLE\n" + 
				"D_37$ABBEVILLE\n" + 
				"D_37$AMIENS\n" + 
				"D_37$AMIENS\n" + 
				"D_37$AMIENS\n" + 
				"D_37$DOULLENS\n" + 
				"D_37$PERONNE\n" + 
				"D_37$PERONNE\n" + 
				"D_38$ANGOULEME\n" + 
				"D_38$ANGOULEME\n" + 
				"D_38$ANGOULEME\n" + 
				"D_38$ANGOULEME\n" + 
				"D_38$COGNAC\n" + 
				"D_38$COGNAC\n" + 
				"D_39$ESNANDES\n" + 
				"D_39$FOURAS\n" + 
				"D_39$ILE D'AIX\n" + 
				"D_39$LA ROCHELLE\n" + 
				"D_39$LA ROCHELLE\n" + 
				"D_39$LA ROCHELLE\n" + 
				"D_39$LA ROCHELLE\n" + 
				"D_39$LA ROCHELLE\n" + 
				"D_39$MARANS\n" + 
				"D_39$ROCHEFORT\n" + 
				"D_39$ROCHEFORT\n" + 
				"D_39$ROCHEFORT\n" + 
				"D_39$SAINT-JEAN-D'ANGELY\n" + 
				"D_39$SAINT-MARTIN-DE-RE\n" + 
				"D_39$SAINTES\n" + 
				"D_39$SAINTES\n" + 
				"D_39$SAINTES\n" + 
				"D_39$SAINTES\n" + 
				"D_39$ST-PIERRE D'OLERON\n" + 
				"D_40$BOUGON\n" + 
				"D_40$BRESSUIRE\n" + 
				"D_40$NIORT\n" + 
				"D_40$NIORT\n" + 
				"D_40$NIORT\n" + 
				"D_40$PARTHENAY\n" + 
				"D_40$PRAHECQ\n" + 
				"D_40$THOUARS\n" + 
				"D_41$CHATELLERAULT\n" + 
				"D_41$CHATELLERAULT\n" + 
				"D_41$CHAUVIGNY\n" + 
				"D_41$CIVRAY\n" + 
				"D_41$LOUDUN\n" + 
				"D_41$LUSSAC-LES-CHATEAUX\n" + 
				"D_41$MONTMORILLON\n" + 
				"D_41$POITIERS\n" + 
				"D_41$POITIERS\n" + 
				"D_41$POITIERS\n" + 
				"D_41$POITIERS\n" + 
				"D_41$POITIERS\n" + 
				"D_82$BARCELONNETTE\n" + 
				"D_82$DIGNE-LES-BAINS\n" + 
				"D_82$FORCALQUIER\n" + 
				"D_82$MANE\n" + 
				"D_82$MOUSTIERS-STE-MARIE\n" + 
				"D_82$QUINSON\n" + 
				"D_82$RIEZ-LA-ROMAINE\n" + 
				"D_82$SISTERON\n" + 
				"D_82$VACHERES\n" + 
				"D_83$ANTIBES\n" + 
				"D_83$ANTIBES\n" + 
				"D_83$BIOT\n" + 
				"D_83$BIOT\n" + 
				"D_83$CAGNES-SUR-MER\n" + 
				"D_83$CAGNES-SUR-MER\n" + 
				"D_83$CANNES\n" + 
				"D_83$CANNES\n" + 
				"D_83$GRASSE\n" + 
				"D_83$GRASSE\n" + 
				"D_83$GRASSE\n" + 
				"D_83$LE CANNET\n" + 
				"D_83$MENTON\n" + 
				"D_83$MENTON\n" + 
				"D_83$MENTON\n" + 
				"D_83$NICE\n" + 
				"D_83$NICE\n" + 
				"D_83$NICE\n" + 
				"D_83$NICE\n" + 
				"D_83$NICE\n" + 
				"D_83$NICE\n" + 
				"D_83$NICE\n" + 
				"D_83$NICE\n" + 
				"D_83$NICE\n" + 
				"D_83$NICE\n" + 
				"D_83$NICE\n" + 
				"D_83$NICE\n" + 
				"D_83$PUGET-ROSTANG\n" + 
				"D_83$TENDE\n" + 
				"D_83$VALLAURIS\n" + 
				"D_83$VALLAURIS\n" + 
				"D_83$VILLEFRANCHE-SUR-MER\n" + 
				"D_84$AIX-EN-PROVENCE\n" + 
				"D_84$AIX-EN-PROVENCE\n" + 
				"D_84$AIX-EN-PROVENCE\n" + 
				"D_84$AIX-EN-PROVENCE\n" + 
				"D_84$AIX-EN-PROVENCE\n" + 
				"D_84$AIX-EN-PROVENCE\n" + 
				"D_84$AIX-EN-PROVENCE\n" + 
				"D_84$ARLES\n" + 
				"D_84$ARLES\n" + 
				"D_84$ARLES\n" + 
				"D_84$ARLES\n" + 
				"D_84$AUBAGNE\n" + 
				"D_84$CASSIS\n" + 
				"D_84$FONTVIEILLE\n" + 
				"D_84$ISTRES\n" + 
				"D_84$LA CIOTAT\n" + 
				"D_84$LAMBESC\n" + 
				"D_84$LES BAUX DE PROVENCE\n" + 
				"D_84$LES-BAUX-DE-PROVENCE\n" + 
				"D_84$MAILLANE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARSEILLE\n" + 
				"D_84$MARTIGUES\n" + 
				"D_84$PUYLOUBIER\n" + 
				"D_84$SAINT-CANNAT\n" + 
				"D_84$SAINT-CHAMAS\n" + 
				"D_84$SAINT-REMY-DE-PROVENCE\n" + 
				"D_84$SAINT-REMY-DE-PROVENCE\n" + 
				"D_84$SAINTES-MARIES-DE-LA-MER\n" + 
				"D_84$SALON-DE-PROVENCE\n" + 
				"D_84$SALON-DE-PROVENCE\n" + 
				"D_85$AIGUILLES\n" + 
				"D_85$GAP\n" + 
				"D_86$AIGUINES\n" + 
				"D_86$BORMES-LES-MIMOSAS\n" + 
				"D_86$BRIGNOLES\n" + 
				"D_86$DRAGUIGNAN\n" + 
				"D_86$DRAGUIGNAN\n" + 
				"D_86$DRAGUIGNAN\n" + 
				"D_86$DRAGUIGNAN\n" + 
				"D_86$FREJUS\n" + 
				"D_86$FREJUS\n" + 
				"D_86$HYERES\n" + 
				"D_86$LE POUVEREL LA GARDE\n" + 
				"D_86$SAINT-RAPHAËL\n" + 
				"D_86$SAINT-TROPEZ\n" + 
				"D_86$SOLLIES-VILLE\n" + 
				"D_86$TOULON\n" + 
				"D_86$TOULON\n" + 
				"D_86$TOULON\n" + 
				"D_87$APT\n" + 
				"D_87$AVIGNON\n" + 
				"D_87$AVIGNON\n" + 
				"D_87$AVIGNON\n" + 
				"D_87$CARPENTRAS\n" + 
				"D_87$CARPENTRAS\n" + 
				"D_87$CARPENTRAS\n" + 
				"D_87$CAVAILLON\n" + 
				"D_87$CAVAILLON\n" + 
				"D_87$CAVAILLON\n" + 
				"D_87$CUCURON\n" + 
				"D_87$FONTAINE-DE-VAUCLUSE\n" + 
				"D_87$FONTAINE-DE-VAUCLUSE\n" + 
				"D_87$LOUMARIN - CADENET\n" + 
				"D_87$MAZAN\n" + 
				"D_87$ORANGE\n" + 
				"D_87$SAULT\n" + 
				"D_87$VAISON-LA-ROMAINE\n" + 
				"D_87$VALREAS\n" + 
				"D_96$PITON-SAINT-LEU\n" + 
				"D_96$SAINT-DENIS\n" + 
				"D_96$SAINT-DENIS DE LA REUNION\n" + 
				"D_96$SAINT-GILLES-LES-HAUTS\n" + 
				"D_96$SAINT-LOUIS\n" + 
				"D_88$BOURG-EN-BRESSE\n" + 
				"D_88$BOURG-EN-BRESSE\n" + 
				"D_88$BRIORD\n" + 
				"D_88$IZERNORE\n" + 
				"D_88$LOCHIEU\n" + 
				"D_88$NANTUA\n" + 
				"D_88$OYONNAX\n" + 
				"D_88$PEROUGES\n" + 
				"D_88$PONT-DE-VAUX\n" + 
				"D_88$SAINT-CYR-SUR-MENTHON\n" + 
				"D_88$SAINT-PAUL-DE-VARAX\n" + 
				"D_88$SEYSSEL\n" + 
				"D_88$TREFFORT-CUISIAT\n" + 
				"D_88$VILLARS DE LA DOMBE\n" + 
				"D_89$ANNONAY\n" + 
				"D_89$LES VANS\n" + 
				"D_89$ORGNAC-L'AVEN\n" + 
				"D_89$PRIVAS\n" + 
				"D_89$SERRIERES\n" + 
				"D_89$SOYONS\n" + 
				"D_89$TOURNON-SUR-RHÔNE\n" + 
				"D_90$DIE\n" + 
				"D_90$GRIGNAN\n" + 
				"D_90$MONTELIMAR\n" + 
				"D_90$MOURS SAINT-EUSEBE\n" + 
				"D_90$ROMANS\n" + 
				"D_90$SAINT-PAUL-TROIS-CHATEAUX\n" + 
				"D_90$VALENCE\n" + 
				"D_90$VASSIEUX-EN-VERCORS\n" + 
				"D_91$ANNECY\n" + 
				"D_91$CHAMONIX\n" + 
				"D_91$LOVAGNY\n" + 
				"D_91$RUMILLY\n" + 
				"D_91$THONES\n" + 
				"D_91$THONON-LES-BAINS\n" + 
				"D_92$ALLEMONT\n" + 
				"D_92$ALLEVARD-LES-BAINS\n" + 
				"D_92$ALPE D'HUEZ\n" + 
				"D_92$AOSTE\n" + 
				"D_92$BOURGOIN-JALLIEU\n" + 
				"D_92$CHARAVINES\n" + 
				"D_92$ECHIROLLES\n" + 
				"D_92$GRENOBLE\n" + 
				"D_92$GRENOBLE\n" + 
				"D_92$GRENOBLE\n" + 
				"D_92$GRENOBLE\n" + 
				"D_92$GRENOBLE\n" + 
				"D_92$GRENOBLE\n" + 
				"D_92$HIERES SUR AMBY\n" + 
				"D_92$LA MURE\n" + 
				"D_92$LA TRONCHE\n" + 
				"D_92$LA-COTE-SAINT-ANDRE\n" + 
				"D_92$SAINT-PIERRE-DE-CHARTREUSE\n" + 
				"D_92$VIENNE\n" + 
				"D_92$VIENNE\n" + 
				"D_92$VIENNE\n" + 
				"D_92$VIZILLE\n" + 
				"D_92$VOIRON\n" + 
				"D_93$AMBIERLE\n" + 
				"D_93$CHARLIEU\n" + 
				"D_93$CHARLIEU\n" + 
				"D_93$CHAZELLES-SUR-LYON\n" + 
				"D_93$ESTIVAREILLES\n" + 
				"D_93$FEURS\n" + 
				"D_93$GREZOLLES\n" + 
				"D_93$MONTBRISON\n" + 
				"D_93$MONTBRISON\n" + 
				"D_93$POMMIERS-EN-FOREZ\n" + 
				"D_93$RIORGES\n" + 
				"D_93$ROANNE\n" + 
				"D_93$ROANNE\n" + 
				"D_93$SAINT-ETIENNE\n" + 
				"D_93$SAINT-ETIENNE\n" + 
				"D_93$SAINT-ETIENNE\n" + 
				"D_93$SAINT-ETIENNE\n" + 
				"D_93$SAINT-ETIENNE-LE-MOLARD\n" + 
				"D_93$SAINT-GERMAIN-LAVAL\n" + 
				"D_93$SAINT-JUST-SAINT-RAMBERT\n" + 
				"D_93$USSON EN FOREZ\n" + 
				"D_94$AMPLEPUIS\n" + 
				"D_94$BEAUJEU\n" + 
				"D_94$LYON\n" + 
				"D_94$LYON\n" + 
				"D_94$LYON\n" + 
				"D_94$LYON\n" + 
				"D_94$LYON\n" + 
				"D_94$LYON\n" + 
				"D_94$LYON\n" + 
				"D_94$LYON\n" + 
				"D_94$LYON\n" + 
				"D_94$LYON\n" + 
				"D_94$LYON\n" + 
				"D_94$LYON\n" + 
				"D_94$ROCHETAILLEE-SUR-SAONE\n" + 
				"D_94$SAINT-ROMAIN-EN-GAL\n" + 
				"D_94$THIZY\n" + 
				"D_94$VILLEFRANCHE-SUR-SAONE\n" + 
				"D_95$AIME-EN-TARENTAISE\n" + 
				"D_95$AIX-LES-BAINS\n" + 
				"D_95$AIX-LES-BAINS\n" + 
				"D_95$ALBERTVILLE\n" + 
				"D_95$BOURG-SAINT-MAURICE\n" + 
				"D_95$CHAMBERY\n" + 
				"D_95$CHAMBERY\n" + 
				"D_95$CHAMBERY\n" + 
				"D_95$CHAMBERY\n" + 
				"D_95$MOÛTIERS\n" + 
				"D_11$SAINT-PIERRE ET MIQUELON";

		for (String i : tmp.split("\n")){
			String d = i.split("\\$")[0];
			String v = i.split("\\$")[1];

			if (!villes.containsKey(d))
				villes.put(v, d);			
		}
		
		Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("filename.txt"), "utf-8"));
		    
		    int itv=1;
			Map<String, String> id = new HashMap<String, String>();
			for (String v : villes.keySet()){
				String toAdd = "###  http://www.musee.com/ontologies/musee.owl#V_"+itv+"\n\n";
				toAdd += ":V_"+itv+" rdf:type owl:NamedIndividual ;\n\n";
				toAdd += "    :estVilleDuDépartement :"+villes.get(v)+" ;\n\n";
				toAdd += "    :aNomVille \""+v+"\" .\n\n\n\n";
				id.put(v,"V_"+itv);
				writer.write(toAdd);
				itv++;
			}	    
		    
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
		
		
		
		/*for (String i : tmp2.split("\n")){
			System.out.println(id.get(i.split("\\$")[1]));
		}*/
		
/*
		int itr=1,itd=1;
		
		Map<String, String> id = new HashMap<String, String>();
		
		for (String r : villes.keySet()){
			String toAdd = "###  http://www.musee.com/ontologies/musee.owl#R_"+itr+"\n\n";
			toAdd += ":R_"+itr+" rdf:type owl:NamedIndividual ;\n\n";

			toAdd += "          :aNom \""+r+"\" .\n\n\n\n";

			for (String j : villes.get(r)){
				toAdd += "###  http://www.musee.com/ontologies/musee.owl#D_"+itd+"\n\n";
				toAdd += ":D_"+itd+" rdf:type owl:NamedIndividual ;\n\n";
				toAdd += "    :estDépartementDeLaRégion :R_"+itr+" ;\n\n";
				toAdd += "    :aNomDépartement \""+j+"\" .\n\n\n\n";
				id.put(j,"D_"+itd);
				itd++;
			}

			System.out.println(toAdd);
			itr++;
		}
		
		for (String i : tmp2.split("\n")){
			System.out.println(id.get(i.split("\\$")[1]));
		}
		*/
	}

}
