package genowl;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HorOuv {

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

		String tmp = "Ouvert de mai à septembre du mercredi au lundi de 10h à 12h et de 14h à 18h, en octobre s amedi et dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mardi au samedi de 10h à 12h et de 13h à 18h, dimanche de 14h à 18h (ouvert du 26 avril à fin septembre)\n" + 
				"Fermé. Ouvert uniquement sur réservation pour les groupes\n" + 
				"Ouvert du lundi au vendredi de 9h à 12h et de 14h à 17h, samedi-dimanche de 14h à 17h\n" + 
				"Ouvert lundi de 14h à 18h, mercredi au vendredi de 10h à 12h et de 14h à 18h, samedi-dimanche de 14h à 18h, juillet-août  de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du 2 mai au 15 septembre de 10h à 12h et de 14h à à 17h du mercredi au lundi, du 15 septembre au 15 octobre de 14h à 18h du mercredi au lundi\n" + 
				"Ouvert du 1er mars au 31 octobre dimanche et lundi et du mercredi au vendredi de 14h à 18h et du 1er novembre au 28 février de 14h à 17h le dimanche. Ouvert sur rendez-vous pour les groupes et les scolaires\n" + 
				"Ouvert de mai à septembre du mardi au dimanche de  14h à 18h et d'octobre à avril du mercredi au dimanche de 14h à 17h\n" + 
				"Ouvert du mercredi au dimanche de 14h à 18h du 1er mai au 30 septembre, le reste de l'année sur rendez-vous pour les groupes\n" + 
				"Ouvert du 2 janvier au 15 juin et du 16 septembre au 23 décembre du mercredi au lundi de 14h à 18h le samedi et dimanche et jours fériés 10h à 12h et 14h à 18h et du 15 juin au 15 septembre du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert le lundi et du mercredi au dmanche de 10h à 18h\n" + 
				"Ouvert le lundi et du mercredi au dimanche de 10h à 18h\n" + 
				"Ouvert le lundi et du mercredi au dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert lundi, mercredi à vendredi de 12h à 18h, samedi et dimanche de 10h à 18h\n" + 
				"Ouvert le lundi, mercredi au dimanche de 10h à 18h\n" + 
				"Ouvert lundi, mercredi à samedi de 12h à 18h et le dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au  dimanche de 10h à 18h\n" + 
				"Ouvert du lundi au vendredi de 9h à 17h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du 1er avril au 30 septembre de 10h à 19h et du 1er octobre au 31 mars de 14h à 18h (matin sur rdv)\n" + 
				"Ouvert d'avril à septembre tous les jours de 10h à 19h, d'octobre à mars du mardi au dimanche de 10h à 18h. Pendant les vacances scolaires de toutes les zones de 10h à 19h\n" + 
				"\n" + 
				"Ouvert d'avril à septembre mercredi, jeudi, samedi, dimanchede 14h à 18h\n" + 
				"Ouvert de septembre à juin le dimanche de 14h30 à 17h30, juillet-août du mardi au dimanche de 14h30 à 17h30. Lors des expositions temporaires du mardi au dimanche de 14h30 à 17h30\n" + 
				"Ouvert le mercredi et vendredi de 14h à 17h30, le jeudi de 9h à 12h et de 14h à 17h30, le samedi et dimanche de 14h à 17h\n" + 
				"Ouvert de début mai au 2 octobre 2011 les vendredis, samedis de 14h à 17h, les dimanches de 14h à 18h Sur rendez-vous toute l'année pour les groupes de 10 personnes et plus\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 17h, le dimanche de 14h à 18h\n" + 
				"Ouvert de mai à octobre tous les jours de 9h à 18h, de novembre à avril du mercredi au lundi  de 9h à 12h et de 14h à  17h du 8 au 31 décembre tous les jours de 9h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h du 1 mars au 31 décembre\n" + 
				"Ouvert le lundi et du mercredi au vendredi de 14h à 18h, les week-ends et jours féris de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert le premier et troisième dimanche du mois de 14h30 à 17h30\n" + 
				"Ouvert en juillet-août de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du 1er juin au 31 octobre de 10h à 12h et de 14h à 18h, en mai les week-end et jours de fériés\n" + 
				"Ouvert du mercredi au lundi de 13h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h, 18h30 en juillet-août , 19h en décembre\n" + 
				"\n" + 
				"Ouvert de 10h à 17h du 1er au 7 janvier, du 3 février au 30 mars et du 5 novembre au 31 décembre, du 8 janvier au 2 février de 10h à 14h et le week-end de 10h à 17h, du 31 mars au 4 novembre de 10h à 18h\n" + 
				"Ouvert sur rendez-vous\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du 1er au 4 janvier de 10h à 17h du 5 janvier au 5 février de 14h à 17h le week-end de 10h à 17h, du 6 février au 2 avril de 10h à 17h, du 3 avril au 29 octobre de 10h à 17h, du 30 octobre au 31 décembre de 10h à 17h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi du 1er mai au 31 octobre de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert du 1er mars au 15 juin, du 1er octobre au 15 décembre le dimanche de 14h à 17h, du 16 juin au 30 septembre mardi, jeudi, samedi, dimanche de 15h à 18h, et du 1er mars au 30 novembre sur rendez-vous pour les groupes\n" + 
				"Ouvert tous les jours du 8  juillet au 19 août  de 14h à 18h, du 6 avril au 8 juillet et du 20 août au 4 novembre les week-ends et jours fériés de 14h à 18h\n" + 
				"Ouvert tous les jours de 10h à 12h et de 14h à 18h de juin à septembre et du mercredi au dimanche de novembre à avril\n" + 
				"Ouvert en juin et septembre vendredi-samedi-dimanche,en juillet-août du mardi au dimanche de 14h à 18h\n" + 
				"Ouvert du 22 mars au 3 novembre 2013. De 10h à 18h, en de mars à  juin et de septembre à décembre, du 1er au 11 juillet et du 19 août au 1er septembre de 10h à 18h et du 12 juillet au 18 août  de 10h à 21h\n" + 
				"Ouvert du mardi au vendredi de 10h à 12h et de 14h à 18h, le samedi de 10h à 12h et d'avril à fin septembre le samedi de 14h à 18h et le dimanche de 14h30 à 18h30\n" + 
				"Ouvert tous les jours en saison et hors saison du mercredi au lundi\n" + 
				"Ouvert du mercredi au dimanche (février, mars, octobre à décembre) de 10h à 12h et de 14h à 17 et  d'avril à juin et septembre de 10h à 18h, et en juillet-août de 10h à 19h tous les jours\n" + 
				"\n" + 
				"Ouvert tous les jours d'avril à juin et septembre de 10h30 à 12h30 et de 14h30 à 18h, en juillet-août de 10h30 à 19h\n" + 
				"Ouvert en juillet-août tlj de 9h30 à 18h30, en juin et septembre de 9h30 à 18h, d'octobre à mai de 9h30 à 12h30 et de 14h à 17h30\n" + 
				"\n" + 
				"Ouvert du 1er avril au 31 mai week end et jours fériés de 14h à 18h. Du 1er juin au 30 septembre tous les jours de 9h30 à 12h et de 14h à 18h.\n" + 
				"\n" + 
				"Ouvert de janvier à mars de 14h à 18h les mercredis et samedis et d'avril à décembre de 14h à 18h du lundi au samedi\n" + 
				"Ouvert du 1er avril au 30septembre de 10h30 à 17h30 et le week-end de 13h à 18h. Du 1er octobre au 31 mars de 10h à 17h et le week-end de 13h à 18h, les jeudi de 12h à 14h d'octobre à mai\n" + 
				"Ouvert d'avril à juin et septembre du mardi au vendredi er 9h30 à 17h30, le week-end et jours fériés de 10h à 12h30 et de 14h30 à 18h, en juillet-août tous les jours de 10h à 19h, d'octobre à mars du mardi au vendredi de 9h30 à 12h30 et de 13h30 à 17h, le\n" + 
				"Fermé depuis 2011\n" + 
				"Ouvert selon les expositions et les périodes\n" + 
				"Ouvert de juin à septembre le mardi de 10h à 12h et de 14h à 17h et à la demande le reste de l'année\n" + 
				"\n" + 
				"\n" + 
				"Musée Aquitaine - Le musée Goupil fonctionne uniquement sur exposition temporaire, à raison d’une par an, en général à l’automne.\n" + 
				"Ouvert du mardi au dimanche de 14h à 18h - (ouvert le 14 juillet et le 15 août)\n" + 
				"Fermé au public individuel depuis septembre 2008, ouvert pour les scolaires sur rendez-vous\n" + 
				"Ouvert du mardi au dimanche de 11h à 18h. Le mercredi jusqu'à 20h\n" + 
				"Ouvert du mercredi au lundi de 11h à 18h\n" + 
				"Ouvert du mardi au dimanche de 11h à 18h\n" + 
				"Ouvert du mercredi au lundi de 14h à 18h. Expositions ouvertes de 11h à 18h en semaine et le week-end de 14h à 18h\n" + 
				"Ouvert de mars à mai et octobre week-end et jours fériés de 10h à 13h et de 14h à 19h, et de juin à septembre tous les jours\n" + 
				"\n" + 
				"Collections permanentes : ouvert le mardi de 14h à 18h et du mercredi au samedi de 9h30 à 13h et de 14h à 18h. Expositions temporaires : ouvert du mardi au samedi de 9h30 à 12h30 et de 14h à 18h\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Ouvert du mercredi au lundi de 14h à 18h et en juillet-août tous les jours de 10h à 19h\n" + 
				"Ouvert du mardi au samedi de 14h à 18h et le premier dimanche du mois\n" + 
				"Ouvert du 1er avril au 30 septembre du mardi au dimanche de 10h30 à 13h et de 14h à 18h30 et du 1er octobre au 15 décembre du mardi au dimanche de 14h à 17h\n" + 
				"Ouvert de juin à septembre depuis 2008\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h de mai à septembre, et du lundi au dimanche de 10h à 12h et de 14h à 18h durant la période estivale et pendant les vacances scolaires\n" + 
				"Ouvert de novembre à mars du mardi au vendredi de 14h à 17h30, d'avril à octobre du mardi au vendredi de 10h à 12h et du mardi au dimanche de 14h à 18h (18h30 en juin, juillet, août)\n" + 
				"Ouvert de juin à septembre\n" + 
				"Ouvert en basse saison (avril au 31 mai et 15 septembre au 4 novembre du lundi au samedi de 14h à 16h40, dimanche et jours fériés de 10h à 12h et de 14h à 16h40, en haute saison tous les jours de 10h à 12h et de 14h à 16h40, fermeture à 18h ou 19h\n" + 
				"Ouvert de juillet à septembre de 14h30 à 18h\n" + 
				"Ouvert du 15 janvier au 15 mai de 14h à  18h et du 16 mai au 30 septembre de 10h à 12h et du 14h à 18h30 du mardi au dimanche, et d'octobre au 15 décembre de 14h à 18h du mardi au dimanche\n" + 
				"Ouvert de mi-avril à fin juin le mercredi et samedi de 14h à 18h, en juillet août du mercredi au lundi de 10h à 13h et de 15h30 à 19h et de septembre à mi-octobre mercredi et samedi de 14h à 18h\n" + 
				"Ouvert du 1er octobre au 30 avril de 10h à 12h30 et de 13h30 à 18h du mercredi au lundi et de mai à septembre de 10h à 18h\n" + 
				"Ouvert du mercredi au vendredi de 15h à 18h et le samedi de 10h à 12h et de 15h à 18h\n" + 
				"Ouvert du 1er avril au 31 mai du mardi au dimanche de 14h à 18h, du 1er juin au 30 septembre du mardi au vendredi de 10h à 12h30 et de 14h à 18h, en octobre du mardi au vendredi de 14h à 18h\n" + 
				"Ouvert d'octobre à mars de 14h à 18h du mardi au jeudi et week-end et d'avril à septembre tous les jours de 10h à 18h\n" + 
				"Ouvert du 15 avril au 31 juin et de septembre à octobre du mardi au samedi de 10h à 12h30 et de 14h à 17h30, dimanche de 14h à 17h30, en juillet-août tous les jours de 10h à 18h30, et du 15 octobre au 31 décembre du mardi au samedi de 10h à 12h30 et de 14\n" + 
				"Ouvert du lundi au vendredi de 10h à 12h et de 14h à 18h, samedi et dimanche de 14h à 18h\n" + 
				"Ouvert du 1er janvier au 30 juin et en septembre du mardi au vendredi de 14h à 17h, le dimanche de 15h à 18h en juillet-août tous les jours de 10 h à 12 h et de 15 h à 18 h et du 1er octobre au 31 décembre le dimanche de 15 h à 18 h\n" + 
				"Ouvert du 1er octobre au 31 mai de 10h30 à 12h30 et de 13H30 à 18h30 du mercredi au lundi et du 1er juin au 30 septembre de 10h30 à 18h30\n" + 
				"Ouvert du 15 avril au 14 octobre du mardi au dimanche de 10h30 à 12h30 et de 13h30 à 18h et du 15 octobre au 14 avril du mardi au vendredi de 13h30 à 17h samedi, dimanche de 11h à 12h30 et de 13h30 à 17h\n" + 
				"Ouvert du mardi au dimanche d'octobre à mars de 10h30 à 18h, et d'avril à septembre de 10h à 18h30,  tous les jours en juillet-août de 10h à 18h30 nocturnes le jeudi jusqu'à 20h30\n" + 
				"Ouvert tous les jours d'avril à juin  et de septembre au 14 octobre de 9h30 à 12h30 et de 14h30 à 18h30, en juillet-août de 10h à 19h, et du 15 octobre à la fin des vacances de la Toussaint de 14h30 à 18h\n" + 
				"Ouvert de mai à juin et de septembre à octobre lundi, mercredi au samedi de 14h30 à 18h30, en juillet-août lundi, mercredi au samedi de 15h à 19h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de  14h à 18h\n" + 
				"Ouvert de 10h à 12h et de 14h à 18h\n" + 
				"\n" + 
				"Ouvert du 16 septembre au 14 juin 2010 de 9h30 à 11h45 et de 14h à 17h et du 15 juin au 15 septembre de 9h30 à 12h30 et de 13h30 à 18h45\n" + 
				"Ouvert du 1er mai au 30 juin et du 1er septembre au 31 octobre de 15h à 18h, samedi, dimanche et jours fériés  de 15h à 18h, en juillet-août tous les jours de 15h à 18h. En dehors de ces périodes, possibilité de visite tous les jours uniquement sur rende\n" + 
				"Ouvert d'avril à juin et septembre à mi-octobre du mardi au dimanche de 14h à 18h et juillet/août du mardi au samedi de 10h30 à 12h et de 14h à 19h et le dimanche de 14h à 19h\n" + 
				"\n" + 
				"Fermé en 2012 : chantier des collections\n" + 
				"Ouvert tous les jours de 10h à 18h, en juillet-août de 10h à 19h\n" + 
				"Ouvert de septembre à juin du mardi au samedi de 10h à 12h et de 14h à 18h, dimanches et jours fériés de 14h à 18h. En juillet-août ouvert du mardi au samedi de 13h à 18h\n" + 
				"Ouvert d'avril à octobre du mercredi au samedi de 14h30 à 18h\n" + 
				"Ouvert d'avril à mai et d'octobre à mi- novembre du mercredi au lundi de 9h à 12h et de 14h à 18h, de juin à septembre tous les jours de 9h à 12h et de 14h à 18h, en juillet-août de 9h à 12h et de 14h à 19h\n" + 
				"Ouvert du mardi au dimanche de 14h à 18 h\n" + 
				"Ouvert du 3 janvier au 18 juin et du 5 septembre au 31 décembre du mardi au samedi de 14h à l8h et du 20 juin au 4 septembre du lundi au samedi de 10h à 18h30 et le dimanche de 14h à 18h30\n" + 
				"Ouvert de février à novembre du mardi au samedi de 10h à 12h et de 14h à 18h, le dimanche de 14h à 18h en juillet-août Expositions temporaires (Ecuries) du lundi au samedi de 13h30 à 18h30 Expositions temporaires (Sellerie) du mardi au samedi de 14h à 1\n" + 
				"Ouvert tous les jours en juin et septembre tous les jours de 14h à 18h et en juillet aôut tous les jours de 10h à 13h et de 15h à 19h\n" + 
				"Ouvert du 2 mai au 30 septembre tous les jours de 10h à 12h et de 14h à 18h, du 1er octobre au 30 avril le lundi et du mercredi au samedi de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert du 2 mai au 30 septembre tous les jours de 10h à 12h et de 14h à 18h, du 1er octobre au 30 avril du lundi au samedi de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert (Pâqes à la Toussaint) avril à juin et de septembre à Toussaint le dimanche et jours fériés de 14h à 18h, et en juillet-août tous les jours de 10h à 12h et de 15h à 19h\n" + 
				"Ouvert d'avril à juin, et de septembre à novembre du mercredi au lundi de 10h à 12h et de 14h à 18h, en juillet-août tous les jours de 10h à 12h45 et de 14h à 18h45\n" + 
				"Ouvert de juin à septembre de 10h à 13h et de 14h à 19h et d'octobre à novembre de 10h à 12h et de 14h à 16h\n" + 
				"Ouvert tous les jours de 14h à 18h et de 14h à 19h en juillet-août\n" + 
				"\n" + 
				"Ouvert du 1er mai au 30 juin week-end et jours fériés de 15h à 18h, du 1er juillet au 31 août tous les jours de 10h à 12h30 et de 15h à 18h,  du 1er au 30 septembre les week-end de 15h à 18h\n" + 
				"Ouvert du mardi au vendredi de 10h à 18h et du samedi au dimanche de 10h à 12h et de 13h à 18h\n" + 
				"Ouvert du mardi au samedi de 10h à 12h et de 13h à 17h, le dimanche de 14h à 19h\n" + 
				"Ouvert d'octobre à avril du mardi au samedi de 10h à 12h et de 14h à 17h dimanche de 14h à 17h, du 1er mai au 30 septembre de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de novembre à avril de 10h à 17h et de mai à octobre de 10h à 18h\n" + 
				"Ouvert en Juillet et août tous les jours de 14h30h à 18h30, hors saison sur rendez-vous\n" + 
				"Ouvert de Pâques à fin mai week-end et jours fériés de 10h30 à 12h et de 14h à 18h30 et de juin à septembre du mercredi au lundi de 10h30 à 12h et de 14h à 18h30\n" + 
				"Visite incluse dans visite globale de l'abbatiale Saint-Pierre de Mozac qui a lieu les jeudis à 15h pendant les vacances scolaires d'octobre à mai et les jeudis, vendredis, dimanches à 15h de juin à septembre\n" + 
				"Ouvert du 1er juin au 31 octobre tous les jours de 10h à 12h et de 14h30 à 18h30. Le reste de l'année durant les vacances scolaires (sauf mardi), les week-ends, jours fériés de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 17h30 de septembre à juin, et en  juillet-août de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 17h30, et en  juillet-août de 10h à 18h\n" + 
				"Ouverture du musée  d'octobre à mai du mardi au dimanche de 10h à 12h et de 14h à 18h, en juin et septembre tous les jours de 10h à 12h et de 14h à 18h, en juillet-août tous les jours de 10h à 12h30 et de 13h30 à 19h. Ouverture de la Vallée des Rouets de\n" + 
				"Ouvert d'avril à octobre du mardi au dimanche de 14h à 18h. Pour les groupe sur réservation de novembre à mars\n" + 
				"Ouvert du site des vestiges de la ville gallo-romaine du 1er février au 11 novembre et du centre d'interprétation du 26 mars au 31 décembre 2012 de 10h à 17h. Ouvert du 1er avril au 30 juin de 9h à 18h, du 1er juillet au 31 août de 9h à 19h, du 1er au 30\n" + 
				"Ouvert de mai à septembre tous les jours de 10h à 12h et de 15h à 18h\n" + 
				"\n" + 
				"Ouvert du 1er mai au 30 septembre tous les jours de 9h30 à 18h, du 1er octobre au 30 novembre et du 1er au 30 avril du mercredi au dimanche de 9h30 à 18h1er décembre au 31 mars 9h30 à 17h du mercredi au dimanche\n" + 
				"Ouvert du mercredi au lundi de 11h à 13h et de 14h à  18h\n" + 
				"\n" + 
				"Ouvert du 1er septembre au 30 juin du mercredi au lundi de 9h à 12h et de 14h à 18h et du 1er juillet  au 31 août tous les jours de 10h à 19h\n" + 
				"Ouvert du mercredi au lundi de 9h à 12h et de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 9h à 12h et de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert de juin à octobre du mercredi au lundi de 9h30 à 18h\n" + 
				"Ouvert le lundi et du mercredi au vendredi de 9h à12h30 et de 14h à 18h, samedi et dimanche de 14h à 18h. En juillet août de 14h à 19h. Le mardi ouvert sur réservation pour les groupes\n" + 
				"Ouvert du mercredi au lundi du 2 mai au 31 octobre de 9h30 à 18h et du 2 novembre au 30 avril de 10h à 17h\n" + 
				"Ouvert du 1er octobre au 14 mai du mercredi au dimanche de 9h à 12h30 et de 13h30 à 18h, pour les scolaires le lundi sur rendez-vous et du 15 mai au 30 septembre du mercredi au lundi de 9h à 12h30 et de 13h30 à 18h\n" + 
				"Ouvert du 16 avril au 17 spetembre samedi et dimanche de 14h à 18h\n" + 
				"\n" + 
				"Ouvert du 1er juillet au 31 août du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du 1er avril au 30 septembre de 10h à 12h et de 14h à 18h du mercredi au dimanche (et lundi en juillet-août) et du 1er octobre au 31 mars de 10h à 12h et de 14h à 17h du mercredi au dimanche\n" + 
				"Ouvert du 2 mai au 31 octobre du mercredi au lundi de 10h à 12h et de 14h à 18h. Pour les groupes ouverture sur réservation toute l'année\n" + 
				"Ouvert du 1er avril au 30 septembre le lundi 10h à 12h30, du mercredi au samedi de 10h à 12h30 et de 14h à 18h et du 1er octobre au 31 décembre et en mars de 10h à 12h30 et de 14h à 17h30. Dimanches et jours fériés de 10h30 à 12h et de 14h30 à 17h\n" + 
				"Ouvert du 1er octobre au 31 mars, lundi, mercredi, jeudi vendredi de 14h à 18h, du 1er avril au 30 septembre lundi, mercredi, jeudi et vendredi et week-end de 14h à 18h, dont du 1er juin au 30 septembre lundi, mercredi, jeudi et vendredi de 10h à 12h30 et\n" + 
				"Ouvert des vacances de février au 30 avril et du 1er octobre au 31 décembre de 10 à 12h et de 14 à 18h,du 1er mai au 30 juin et en septembre de 10 à 13h et de 14 à 18h - Juillet/août tlj de 10 à 13h et de 14 à 19h\n" + 
				"Ouvert des vacances de février au 30 avril et du 1er octobre au 31 décembre de 10 à 12h et de 14 à 18h,du 1er mai au 30 juin et en septembre de 10 à 13h et de 14 à 18h - Juillet/août tlj de 10 à 13h et de 14 à 19h\n" + 
				"Ouvert de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert de mars à octobre de 10h à 12h et de 14h à 18h. De novembre à février de 10h à 12h et de 14h à 17h30\n" + 
				"Ouvert de juin à septembre de 10h à 12h et de 15h à18h. Pendant les expositions du mercredi au dimanche de 10h à 12h et de 15h à 18h\n" + 
				"Ouvert du 1er mars au 14 juin et du 16 septembre au 31 octobre les dimanches et jours fériés de 14h à 18h, du 15 juin au 15 septembre tous les jours de 14h à 18h. Ouvert pour les groupes (+ 12 pers.) tous les jours sur rendez-vous du 1er mars au 31 octobr\n" + 
				"\n" + 
				"Ouvert uniquement lors des journées européennes du patrimoine\n" + 
				"\n" + 
				"Ouvert du 1er juin au 30 septembre tous les jours de 10h à 12h30 et de 14h30 à 18h30\n" + 
				"Ouvert du 1er avril au 30 octobre, dimanche et lundi de 14h à 18h et du mercredi au samedi de 10h à 12h et de 14h à 18h, en juillet-août tous les jours de 10h à 12h30 et de 14h à 19h, dimanche de 14h à 19h\n" + 
				"Ouvert de septembre à mai le mercredi de 14h à 17h et sur rendez-vous les autres jours et de Juin à août de 14h à 17h30 du mercredi au dimanche\n" + 
				"\n" + 
				"Ouvert du 1er octobre au 14 décembre et du 2 mars au 31 mars du lundi au samedi de 10h à 12h et de 14h à 17h, le dimanche de 14h30 à 17h et du 1er avril au 30 septembre de 9h30 à 12h et de 13h30 à 18h\n" + 
				"\n" + 
				"Ouvert de mi-mars à fin juin le week-end et jours fériés, en juillet-août du mercredi au lundi, de septembre à novembre le week-end et jours fériés. Sinon tous les jours sur réservation pour les groupes\n" + 
				"Ouvert en juillet août de 15h à 18h ou sur demande + ouverture exceptionnelle lors de la nuit des musées et JEP\n" + 
				"Ouvert de septembre à juin de 9h30 à 11h45 et de 14h à 17h45 et en juillet-août de 10h à 18h\n" + 
				"Ouvert du mercredi au lundi de 9h30 à 12h et de 14h à 17h30\n" + 
				"Ouvert en juin et septembre du mercredi au lundi de 14h à 18h,  en juillet-août de 10h à 12h et de 14h à 18h lundi, mercredi au dimanche matin, le reste de l'année sur réservation pour les groupes\n" + 
				"\n" + 
				"Ouvert d'octobre à mars de 9h30 à 17h, d'avril à juin et septembre de 9h30 à 18h en juillet août de 9h30 à 19h\n" + 
				"Ouvert en basse saison en semaine de 10h à 12h et de 14h à 16h45, week-end et jours fériés  de 14h à 16h. En juillet, août, d'avril à juin et septembre en semaine de 10h à 12h et de 14h à 18h, week-end et jours fériés de 14h à 18h\n" + 
				"Ouvert du 15 mai au 30 septembre tous les jours de 14h à 18h, du 1er octobre au 14 mai du lundi au vendredi de 14h à 18h\n" + 
				"Ouvert du mardi au samedi de 10h à 12h et de 14h à 18h, le dimanche et jours fériés de 14h à 18h\n" + 
				"Ouvert du mardi au samedi de 10h à 12h et de 14h à 18h, le dimanche et jours fériés de 14h à 18h\n" + 
				"Ouvert du 1er avril au 14 juin de 14h à 18h du mercredi au lundi et du 15 juin au 15 septembre tous les jours de 10h à 12h30 et de 14h à 18h et du 16 septembre au 31 octobre de 14h à 18h du mercredi au dimanche\n" + 
				"Ouvert du 21 mars au 31 décembre du mardi au dimanche de 10h30 à 12h30 et de 14h à 18h et en juillet-août tous les jours de 11h à 18h\n" + 
				"\n" + 
				"Ouvert tous les jours de 10h à 12h et de 14h à 18h (sauf les samedis et dimanches matins du 1er octobre au 14 mai)\n" + 
				"Ouvert tous les jours de janvier à mai et d'octobre à décembre de 14h à 18h, de juin à septembre de 10h à 18h\n" + 
				"Ouvert du 15 mai au 30 octobre du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert en hiver de 10h à 12h et de 14h à 17h et en été de 10h à 18h\n" + 
				"\n" + 
				"Ouvert du dernier week-end de mars au premier week-end de novembre de 10h à 13h et de 14h à  18h. Accueil de groupes toute l'année\n" + 
				"Ouvert toute l'année et tous les jours de 14h à 18h\n" + 
				"Ouvert du 1er octobre au 30 avril de 10h à 12h et de 14h à 17h samedi et dimanche uniquement et du 2 mai au 30 septembre de 10h à 12h et de 14h à 18h30 du mercredi au dimanche\n" + 
				"Ouvert du mercredi au lundi du 1er octobre au 31 mai de 10h à 12h et de 14h à 18h, du 1er juin au 30 septembre de 10h à 18h30\n" + 
				"Ouvert du lundi au vendredi de 13h30 à 17h30 et le dimanche de 14h à 17h30, les scolaires et les groupes sont accueillis du lundi au vendredi de 8h à 12h et de 13h30 à 17h30\n" + 
				"Ouvert du 1er avril au 30 septembre 2011 de 14h à 18h\n" + 
				"Ouvert du 1er octobre au 31 mai de 14h30 à 18h les week-end et jours fériés et toutes les zones de vacances scolaires, juin et septembre de 11h à 12h30 et de 14h à 18h du mercredi au lundi, juillet et août de 10h à 18h30 du mercredi au lundi\n" + 
				"Ouvert en mars, avril, octobre du mercredi au lundi de 14h à 18h, de mai à septembre tous les jours de 10h à 12h et de 14h à 18h. Hors périodes d'ouverture sur rdv pour les groupes\n" + 
				"Ouvert en saison du 1 avril au 31 octobre du mercredi au lundi de 10 heures à 18 heures. Hors saison : janvier à mars, novembre, décembre : les fins de semaine et jours fériés, de 14h à 18h et sur rendez-vous pour les groupes. Vacances scolaires (tout\n" + 
				"Ouvert d'octobre à mai, lundi, jeudi, vendredi, de 14h à 18h, mercredi, samedi dimanche de 10h à 12h et de 14h à 18h, de juin à septembre + les vacances scolaires du mercred au lundi de 10h à 12h et de 14h à 18h\n" + 
				"\n" + 
				"Ouvert du 15 mars au 15 novembre du mercredi au lundi  de 10h à 18h et tous les jours en  juillet-août\n" + 
				"Ouvert du mercredi au dimanche de 14h30 à 18h30 en juillet-août\n" + 
				"Ouvert du 15 mars au 30 avril et du 1er octobre au 15 novembre du mercredi au dimanche de 10h à 12h et de 14h à 17h et du 2  mai au 30 septembre de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert tous les jours du 1er novembre au 31 mai de 13h30 à 17h30, du 1er juin au 30 septembre de 10h à 18h30\n" + 
				"Ouvert de avril à septembre du mardi au samedi de 14h à  18h, vacances de la Toussaint du mardi au samedi de 14h à 17h, vacances de Noël du 26 au 29 décembre de 14h à 17h et durant les jours fériés en pleine saison de 14h à 18h et en basse saison de 14h à\n" + 
				"Ouvert du mardi au samedi de 10h à 18h pour le  Pavillon des exposition et du mardi au samedi de 10h à 12h et de 13h30 à 18h  pour les galeries permanentes, dimanche et certains jours fériés de 14h à 18h pour les deux bâtiments\n" + 
				"Ouvert du mardi au samedi de 10h à 12h et de 14h à 18h, le dimanche de 14h à 18h, 14 juillet et 15 août de 14h à 18h\n" + 
				"Ouvert du 1er avril au 30 septembre tous les jours de 10h à 18h30 et du 1er octobre au 30 mars tous les jours de 13h30 à 18h30\n" + 
				"Ouvert du 15 mars au 31 mai et 1er septembre au 31 octobre du lundi au vendredi de 10h à 18h, dimanche et jours fériés de 14h à 18h, en juin 10h à 18h, juillet/août de 11h à 19h tous les jours, Vacances scolaires, Noël, Février, Toussaint du lundi au vend\n" + 
				"Ouvert tous les jours des vacances de février aux vacances de la Toussaint. Février-mars, novembre et décembre  de 10h à 12h et de 14h à 18h, avril, juin, septembre  de 10h à 18h, juillet/août de 9h30 à 20h\n" + 
				"Ouvert de février à juin et de septembre à novembre et vacances de Noël de 10h à 12h30 et de 14h à 18h et en juillet-août tous les jours de 10h à 19h\n" + 
				"Ouvert d'octobre à juin du mardi au samedi de 10h à 12h et de 14h à 17h, de juillet à septembre tous les jours de 10h à 12h30 et de 14h à 18h, le premier dimanche du mois de 14h à 17h\n" + 
				"Ouvert d'octobre à mars de 13h30 à 17h30 du mardi au dimanche et d'avril à septembre de 11h à 17h/18h tous les jours et durant les vacances scolaires en juillet-août de 10h30 à 18h\n" + 
				"Ouvert d'octobre à mars de 13h30 à 17h30 du mardi au dimanche et d'avril à septembre de 11h à 17h/18h tous les jours et durant les vacances scolaires en juillet-août tous les jours de 10h30 à 18h\n" + 
				"Ouvert tous les jours de 10h à 12h30 et de 14h à 18h30. Juillet/août de 10h à 19h. Novembre, décembre, février et mars de 10h à 12h30 et de 14h à 18h. Janvier de 14h à 18h\n" + 
				"Ouvert en avril et octobre mardi au dimanche de 14h à 18h, en mai de 14h à 18h, de juin à septembre tous les jours de 10h à 12h30 et de 14h à 18h, ouverture jusqu'à 18h30 en juillet-août, vacances Toussaint de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 9h30 à 12h et de 14h à 18h en septembre-octobre, avril à juin, de novembre à mars de 9h30 à 12h et de 14h à 17h30 et en  juillet-août tous les jours de 10h à 19h\n" + 
				"Ouvert du 1er octobre au 31 mai du mardi au samedi de 9h à 12h30 et de 13h30 à 17h et le dimanche de 14h à 17h et du 1er juin au 30 septembre tous les jours de 9h à 18h\n" + 
				"Ouvert en juin les vendredis et samedis de 11h à 19h et en juillet-août tous les jours de 11h à 19h\n" + 
				"Ouvert du 1er décembre au 15 février de 14h à 17h du lundi au vendredi, du 15 février au 30 juin  du dimanche au samedi, et en septembre de 14h à 18h en juillet-août de 10h30 à 19h, octobre et novembre du dimanche au vendredi de 14h à 17h\n" + 
				"Ouvert du mardi au vendredi de 9h à 12h et de 14h à 18h toute l'année du 1er avril au 30 septembre du mardi au vendredi et le samedi, dimanche et jours fériés de 14h à 18h\n" + 
				"Ouvert du 1er octobre au 30 avril de 10h à 12h15 et de 14h à 17h30 le lundi, du mercredi au samedi, et le dimanche de 14h à 17h30 et du 1er mai au 30 septembre de 10h à 12h15 et de 14h à 18h du mercredi au lundi\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du 1er avril au 30 septembre du mardi au vendredi de 9h à18h, samedi de 14h à 18h et dimanche de 14h à 19h, du 1er octobre au 31 mars du mardi au vendredi de 9h à 12h et de 14h à 18h, samedi de 14h à 18h et dimanche de 14h à 19h\n" + 
				"Ouvert le mardi de 12h à 21h, mercredi à vendredi de 12h à 19h, samedi et dimanche de 14h à 19h, juillet-août du mardi au dimanche de 13h à 19h\n" + 
				"Ouvert d'avril à septembre tous les jours de 10h à 12h30 et de 14h à 18h et d'octobre à mars de 10h à 12h et de 14h à 18h du mardi au dimanche\n" + 
				"Ouvert d'avril à septembre tous les jours de 10h à 12h30 et de 14h à 18h et d'octobre à mars de 10h à 12h et de 14h à 18h du mardi au dimanche\n" + 
				"Ouvert du 1er octobre au 31 mars de 10h30 à 12h15 et de 14h à 17h30 le vendredi, samedi et le dimanche de 14h à 17h30 et du 1er avril au 30 septembre de 10h30 à 12h30 et de 14h à 18h30 tous les jours\n" + 
				"Ouvert du 1er octobre au 31 mars de14h à 17h30 le vendredi, samedi, dimanche et du 1er avril au 30 septembre de 10h30 à 12h30 et de 14h à 18h30 tous le jours\n" + 
				"Ouvert du 1er octobre au 31 mars de 10h30 à 12h15 et de 14h à 17h30 le lundi, du mercredi au samedi, et le dimanche de 14h à 17h30 et du 1er avril au 30 septembre de 10h30 à 12h30 et de 14h à 18h30 tous les jours\n" + 
				"Ouvert de février à fin novembre, et vacances scolaires de Noël du lundi au vendredi de 14h à 17h30 et certains dimanches selon programme d'animations, en juillet etaoût tous les jours de 10h à 19h\n" + 
				"Ouvert d'octobre à fin mars de 10h à 12h30 et de 14h à 17h, d'avril à  juin et septembrede 10h à 12h30 et de 14h à 18h, en juillet-août tous les jours de 10h à 18h\n" + 
				"Ouvert de mai à septembre tous les jours de 9h45 à 12h30 et de 14h à  18h, d'octobre à novembre et avril du mardi au dimanche de 9h45 à 12h et de 14h à 17h, de décembre à mars le mercredi, samedi et dimanche (sauf vacances scolaires du mercredi au dimanch\n" + 
				"Ouvert de mars à décembre du lundi au vendredi de 10h à 12h et de 14h à 18h, dimanche de 14h à 18h, en juin ouvert également le samedi de 14h à 18h, en juillet-août du lundi au vendredi de 10h à 18h30, samedi et dimanche de 14h à 18h30\n" + 
				"Ouvert du 1er avril au 17 juin puis du 1er juillet au 14 octobre. Ouvert en Avril, mai, juin, septembre et octobre du mardi au samedi de 10h à 12h et de 14h à 18h, le dimanche de 14h à 18h, les jours fériés de 10h à 12h et de 14h à 18h. En juillet-août t\n" + 
				"Ouvert du 1er février au 30 avril du mercredi au lundi de 10h à 12h30 et de 14h à 18h, du 2 mai au 31 août tous les jours de 10h à 18h30, du 1er septembre au 15 décembre du mercredi au lundi de 13h30 à 18h\n" + 
				"Ouvert du 2 mai au 31 août tous les jours de 10h à 18h30 et du 1er septembre au 30 avril du mercredi au lundi de 13h30 à 18h\n" + 
				"Ouvert  du 15 juin au 15 septembre tous les jours de 10h à 19h et du 16 septembre au 14 juin au de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert d'avril àseptembre e 10h à 19h, en octobre, février, mars de 10h à12h et de 14h à 17h, de novembre à janvier de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert de mi-mai à mi-juin tous les jours de 13h30 à 18h et de mi-juin au 30 septembre 2009 tous les jours de 10h à 18h\n" + 
				"Ouvert du 14 juin au 30 septembre tous les jours de 10h à 18h, du  1er octobre au 31 mai tous les jours (sauf fériés) de 13h30 à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert tous les jours de 14h à 18h et pendant les vacances scolaires de la zone B et de 10h à 12h et de 14h à 18h tous les jours\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du 1mardi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert hors saison le lundi de 14h à 17h, du 1er février au 31 mai mercredi de 10h à 12h et du 1er octobre au 17 décembre jeudi, vendredi samedi de 10h à 12h et de 14h à 17h, du 1er juin au 30 septembre tous les jours de 10h à 12h et de 14h30 à 18h\n" + 
				"Ouvert tous les jours en juillet et août, de 10h à 12h et de 14h à 18h, en mai, juin et septembre de 14h à 18h, en mars, avril, octobre tous les week-ends de 14h à 18h et sur rendez-vous pour les groupes\n" + 
				"Ouvert du 1er avril au 30 septembre du mercredi au vendredi de 10h à 12h et de 14h à 18h, le samedi et dimanche de 14h à 18h, du 1er octobre au 31 mars du mercredi au vendredi de 10h à 12h et de 14h à 17h, le samedi et dimanche de 14h à 17h\n" + 
				"Ouvert de 15h à 18h30 tous les jours\n" + 
				"\n" + 
				"Ouvert le lundi, du mercredi au samedi de 10h à 12h et de 14h à 18, le dimanche de 14h à 18h du 2 mai au 31 octobre, de 10h à 12h et de 14h à 17h du 2 novembre au 30 avril\n" + 
				"Ouvert durant les vacances scolaires du lundi au vendredi de 14h à 18h, hors vacances scolaires le mercredi et dimanche de 14h à 17h. Accueil des groupes sur rendez-vous toute la semaine\n" + 
				"Ouvert du mardi au vendredi de 9h à 12h30 et de 13h30 à 18h, samedi, dimanche et jours fériés de 10h à 12h30 et de 13h30 à 19h\n" + 
				"Ouvert d'octobre à mai du lundi au vendredi, de 9h30 à 12h et de 13h30 à 17h, et, les week-ends et jours fériés, de 14h à 17h de juin à septembre du mercredi au lundi de 9h30 à 12h et de 13h30 à 18h. Ouvert également le mardi en juillet et août\n" + 
				"Ouvert du 1er avril au 1er octobre du lundi au dimanche et du 1er octobre au 31 mars du lundi au vendredi, le premier dimanche du mois de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 14h15 à 17h de septembre à juin et en juillet-août de 10h45 à 12h et de 14h15 à 17h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h de mai à octobre et de novembre à avril de 10h à 12h et de 14h à 17h\n" + 
				"\n" + 
				"Ouvert du 15 février au 30 juin et du 1er septembre au 23 décembre du mardi au dimanche de 9h30 à 12h et de 14h à 18h, juillet-août lundi de 14h à 18h  et du mardi au dimanche de 10h à 12h30 et de 14h à 18h30\n" + 
				"Ouvert en 2012 du 1er avril au 30 juin et du 1er au 30 septembre tous les jours de 10h à 12h et de 14h à 18h, dimanche et jours fériés de 10h à 18h. Du 1er juillet au 31 août tous les jours de 10h à 18h30. Du 1er au 27 octobre samedi dimanche de 10h à 12h\n" + 
				"Ouvert du mardi au dimanche d'octobre à mai de 14h à 18h et de juin à septembre de 10h à 12h et de 14h à 18h, le week-end de 10h à 12h30 et de 14h à 18h. Le Couvent des Cordeliers est ouvert lors des manifestations ou expositions et la maison des ATP sur\n" + 
				"Ouvert du 1er octobre au 30 décembre et du 1er février au 30 avril du mercredi au vendredi de 14h à 18h, samedi et dimanche de 10h à 12h et de 14h à 18h, et du 2 mai au 30 septembre lundi et mardi de 14h à 18h et mercredi à dimanche de 10h à 12h et de 14h\n" + 
				"Ouvert du mercredi au lundi en février, mars, novembre, décembre de 14h à 17h, avril, octobre de 14h30 à 18h30, mai, juin, septembre de 10h à 12h et de 14h à 18h30, le dimanche de 14h à 18h30, et en juillet-août tous les jours de 10h à 12h et de 14h à 18h\n" + 
				"\n" + 
				"Ouvert d'octobre à avril du mardi au dimanche de 10h à 12h et de 14h à 17h et en mai, juin et septembre de 9h30 à 12h30 et de 14h à 18h, en juillet-août tous les jours de 9h30 à 18h\n" + 
				"Ouvert du 1er septembre au 30 juin du mercredi au lundi de 9h30-12h et de 14h-18h et en juillet-août tous les jours\n" + 
				"\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h30 et de 14h à 18h du 15 juin aux journées du patrimoine. Le reste de l'année ouvert pour les groupes sur demande\n" + 
				"Ouvert du mercredi au lundi du 1er mai  au 15 septembre de 14h30 à 18h30, du 20 février au 30 avril et du 16 septembre au 11 novembre du vendredi au lundi de 14h à 18h\n" + 
				"Ouvert de 14h à 17h du mercredi au lundi en basse saison, de 10h à 12h et de 14h à 18h en haute saison\n" + 
				"Ouvert de janvier à fin mars et d'octobre à décembre tous les jours de 10h à 12h30 et de 14h à 18h et d'avril à fin juin et septembre de 10h à 18h et en juillet-août de 10h à 19h\n" + 
				"\n" + 
				"Ouvert en avril, mai, octobre les mercredi, jeudi, vendredi de 14h à 17h, week-end et jours fériés de 10h30 à 12h30 et de 14h à 17h, et de juin à septembre du mercredi au lundi de 10h30 à 12h30 et de 14h à 18h\n" + 
				"Ouvert du 2 janvier au 6 avril et du 1er octobre au 28 décembre du lundi au vendredi de 10h à 12h et de 14h à 18h, du 7 avril au 30 septembre du mercredi au lundi de  10h à 12h et de 14h à 18\n" + 
				"Ouvert de janvier à mars et d'octobre à décembre de 10h à 12h30 et de 14h à 17h, d'avril à juin et septembre de 10h à 18h et en juillet-août de 10h à 19h\n" + 
				"Ouvert du lundi au vendredi du 1er mai au 30 septembre de 14h à 17h30\n" + 
				"Ouvert du 15 mars au 15 juin et du 15 septembre au 15 novembre les samedis, dimanches et jours fériés de 14h30 à 18h et du 16 juin au 14 septembre du mercredi au lundi\n" + 
				"Ouvert du 14 février au 31 mai lundi, mercredi au vendredi de 10h à 12h30 et de 14h à 18h, week-end et jours fériés de 14h à 18h, de juin à septembre du lundi au vendredi de 10h à 12h30 et de 14h à 18h week-end et jours fériés de 10h à 12h30 et de 14h à 1\n" + 
				"Ouvert tous les jours en juillet-août de 10h à 19h, d'octobre à mars du mercredi au dimanche de 10h à 12h30 et de 14h à 17h, d'avril à juin et septembre du mercredi au lundi de 10h à 12h30 et de 14h à 18h\n" + 
				"Ouvert du mardi au vendredi de 10h à 12h et de 14h à 18h, samedi, dimanche et jours fériés de 14h à 19h, le lundi est réservé aux scoloires\n" + 
				"Ouvert du 2 janvier au 15 juin du mercredi au lundi de 9h à 12h30 et de 14h à 18h, du 16 juin au 15 septembre tous les jours de 9h à 12h30 et de 14h à 18h et du 16 septembre au 31 décembre du mercredi au lundi de 9h à 12h30 et de 14h à 18h\n" + 
				"Ouvert vendredi, samedi dimanche de 9h à 12h et de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 9h à 12h45 et de 14h à 18h, et de 9h à 18h pendant les expositions temporaires\n" + 
				"\n" + 
				"Ouvert d'avril à octobre de 8h à 18h tous les jours\n" + 
				"Ouvert tous les jours d'octobre à mars de 9h à 12h30 et de 13h30 à 17h30. Du 1er avril au 30 septembre de 9h à 18h30\n" + 
				"Ouvert du mardi au dimanche de 14h à 18h, pendant les vacances scolaires du mardi au vendredi de 10h à 12h et de 14h à 18h, et le week-end de 14h à 18h. Groupes du lundi au vendredi de 9h à 12h et de 14h à 18h sur rendez-vous\n" + 
				"Ouvert  du 9 avril au 25 septembre 2011 et durant les vacances de la Toussaint tous les jours de 10h à 12h30 et de 14h à 18h30\n" + 
				"Ouvert durant les expositions temporaires mercredi, samedi et dimanche de 14h à 18h et en juillet-août du mercredi au dimanche de 10h à 13h et de 14h à 18h\n" + 
				"Ouvert occsionnellement\n" + 
				"Ouvert du 2 janvier au 31 décembre de 10h à 12h et de 14h à 18h dimanche et jours fériés de 14h à 18h\n" + 
				"Ouvert samedi, dimanche et jours fériés de Pâques à fin juin de 15h à 18h et du mercredi au lundi de 15h à 18h de juillet à octobre\n" + 
				"Ouvert du 1er avril au 31 octobre du mercredi au lundi de 10h à 12h et de 14h à 18h et du 1er novembre au 31 mars le lundi et du mercredi au samedi de 10h à 12h et de 13h30 à 17h30\n" + 
				"Ouvert du 1er juin au 30 septembre de 10h à 12h et de 14h à 18h, du 1er octobre au 31 mai de 14h à 17h\n" + 
				"\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h du 1er avril au 31 octobre et de 14h à 18h du 1er novembre au 31 mars\n" + 
				"Ouvert du 1er avril au 30 septembre du mardi au vendredi de 14h à 17h30, samedi et dimanche 10h à 12h et de 14h à 17h30 et du 1er octobre au 31 mars samedi de 9h à 12h et de 14h à 17h30\n" + 
				"Ouvert du 1er février au 31 mars et du 1er octobre au 31 décembre de 14h à 17h et du 1er avril au 30 juin et du 1er au 30 septembre de 13h30 à 18h, en juillet/août tous les jours de 13h30 à 18h\n" + 
				"Ouvert le mercredi et vendredi de 14h30 à 18h30, le samedi de 9h30 à 12h30, le dimanche de 15h à 18h\n" + 
				"Ouvert du mercredi au dimanche 9h à 12h et de 13h30 à 17h30 (vendredi 17h)\n" + 
				"Ouvert samedi et dimanche de 13h30 à 17h30 depuis le 16 janvier 2008, depuis le 15 avril 2009 ouvert le mercredi et samedi de 13h30 à 17h30\n" + 
				"Ouvert tous les jours de 14h à 18h pour les individuels Tous les jours de 9h à 12h et de 14h à 18h pour les scolaires et groupes\n" + 
				"Ouvert de 10h à 18h du mardi au dimanche\n" + 
				"Ouvert du 1er octobre au 30 avril le mercredi de 13h30 à 17h45, le dimanche de 14h à 18h, du 1er mai au 30 juin et en septembre du mardi au samedi de 13h30 à 17h45, le dimanche de 14h à 18h, en juillet-août du mardi au samedi de 9h30 à 12h15 et de 13h30 à\n" + 
				"\n" + 
				"Ouvert du mercredi au dimanche de 10h à 12h et de 13h30 à 18h du 15 juin au 30 septembre et du 30 septembre au 15 juin de 13h30 à 17h. Tlj sur réservation pour les groupes\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"\n" + 
				"Ouvert tous les jours de mai à septembre de 14h à 18h, en avril et octobre les W.E. de 14h à 18h. Tous les jours sur réservation pour les groupes\n" + 
				"\n" + 
				"Ouvert d'avril à septembre et vacances scolaires (zone B, Belgique, Pays-Bas) tous les jours de 10h à 12h et de 13h30 à 17h, d'octobre à mars (hors vacances scolaires) du mardi au dimanche de 10h à 12h et de 13h30 à 17h, en juillet-août tous les jours de\n" + 
				"\n" + 
				"Ouvert du 1er novembre au 31 mars du mardi au vendredi de 10h à 12h30 et de 14h à 17h, week-end et jours fériés de 14h à 17h, du 1er avril au 31 octobre tous les jours de 10h à 12h30 et de 14h à 18h\n" + 
				"Ouvert d'octobre à mars du mardi au vendredi de 9h à 13h et de 14h30 à 17h30, d'avril à mai du lundi au vendredi de 9h à 13h et de 14h à 18h et de juin à septembre du mardi au samedi de 9h à 13h et de 14h à 18h\n" + 
				"Ouvert du mercredi au dimanche de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 9 h à 12 h et de 13h à 17h\n" + 
				"Ouvert du mardi au dimanche au  de 10h à 13h et de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 13h à 18h\n" + 
				"Ouvert du mardi au dimanche de 9 h à 12 h et de 13 h à 17 h\n" + 
				"Ouvert du mardi au dimanche de 9 h à 12 h et de 13h à 17h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 17h en basse saison et en haute saison de 10h à 13h et de 14h à 19h\n" + 
				"Ouvert d'octobre à mars du mercredi au lundi de 10h à 18h et d'avril à septembre tous les jours de 10h à 18h\n" + 
				"Ouvert  mardi, jeudi, vendredi de 14h à 18h,  mercredi de 13h à 18h et le samedi de 10h30 à 12h et de 14h à 18h\n" + 
				"\n" + 
				"Ouvert du mercredi au lundi de 14h à 18h de mi-septembre à mi-mai et de 14h30 à 18h30 du 14 mai au 18 septembre\n" + 
				"\n" + 
				"Ouvert tous les jours de 9h30 à 12h et de 14h à 18h du mercredi au lundi\n" + 
				"Ouvert du 1er avril au 30 septembre tous les jours de 10h à 12h et de 14h à 18h et sur réservation en mars et octobre\n" + 
				"\n" + 
				"Ouvert du mercredi au lundi de 14h à 18h\n" + 
				"Ouvert du lundi au vendredi de 14h à 18h, samedi de 10h à 12h et de 14h à 18h, dimanche de 10h à 12h et de 14h30 à 18h30\n" + 
				"Ouvert du 1er avril au 30 septembre du mercredi au lundi de 10h à 12h et de 14h à 18h et du 1er octobre au 31 mars du lundi au vendredi de 10h à 12h et de 14h à 17h et du samedi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"\n" + 
				"\n" + 
				"Ouvert du mardi au dimanche de 14h à 18h\n" + 
				"Ouvert du lundi au vendredi de 9h à 12h et de 14h à 18h, samedi et dimanche et jours fériés de 14h à 18h. Ateliers certains jours de 18h à 21h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h, du 14 décembre 2012 au 26 mai 2013 le jeudi de 10h à 20h\n" + 
				"Ouvert du lundi au vendredi de 14h à 18h30  samedi et le dimanche de 14h à 19h\n" + 
				"\n" + 
				"Ouvert du 1er octobre au 31 mars de 10h30 à 12h30 et de 13h15 à 16h30, du 1er avril au 30 septembre de 10h30 à 12h30 et de 13h15 à 18h\n" + 
				"Ouvert le lundi, mercredi, samedi de 10h à 17h et le jeudi vendredi et dimanche du 3eme week end du mois de 12h à 17h du 1er octobre  au 30 avril, et le lundi mercredi, samedi de 10h30 à 18h et le jeudi, vendredi et dimanche de 12h00 à 18h du 1er mai au 3\n" + 
				"Ouvert du 15 juin au 15 septembre du lundi au vendredi de 9h à 11h45 et de 14h à 17h45 et du 16 septembre au 14 juin du lundi au vendredi de 9h à 11h45 et de 14h à  16h45\n" + 
				"Ouvert du mardi au samedi d'octobre à mai de 10h à 17h et de juin à septembre tous les jours de 10h à 18h\n" + 
				"\n" + 
				"Ouvert du 16 mai au 30 septembre de 9h à 12h et de 13h à 18h et du 1er octobre au 15 mai de 8h à 12h et de 13h à 17h\n" + 
				"Ouvert du 1er avril au 30 juin, et du 16 septembre au 31 octobre du mardi au dimanche de 10h à 18h et du 1er juillet au 15 septembre du mardi au dimanche de 10h à 19h30, du 1 er novembre au 31 mars du mardi au samedi de 9h à 12h et de 14h à 17h30\n" + 
				"Ouvert du 1er novembre au 31 mars de 10h à 17h du lundi au samedi, du 1er avril au 21 juin de 10h à 18h du mardi au dimanche, du 22 juin au 20 septembre de 10h à 20h tous les jours, du 22 septembre au 31 octobre de 10h à 18h du mardi au dimanche\n" + 
				"\n" + 
				"Ouvert du 16 mai au 30 septembre de 9h à 12h et de 13h à 18h et du 1er octobre au 15 mai de 8h à 12h et de 13h à 17h\n" + 
				"Ouvert du 2 janvier au 29 mars 2008 inclus  de 10h à 17h, du 30 mars au 4 juillet 2008 inclus de 9h à 18h, du 5 juillet au 24 août 2008 inclus de 9h à 19h, du 25 août au 25 octobre 2008 inclus de 9h à 18h, du 26 octobre au 5 novembre 2008 inclus de 10h à\n" + 
				"Ouvert du mercredi au lundi de 9h30 à 12h et de 14h à 18h, samedi dimanche de 9h30 à 18h, le jeudi de 18h à 20h en période d'expositions temporaires\n" + 
				"Ouverture de la Citadelle du mercredi au lundi du 2 janvier au 29 mars de 10h à 17h, du 30 mars au 4 juillet tlj de 9h à 18h, du 5 juillet au 24 août tlj de 9h à 19h, du 25 août au 25 octobre tlj de 9h à 18h, du 26 octobre au 5 novembre tlj de 10h à 17h30\n" + 
				"Ouvert de novembre à mars du mercredi au lundi de 10h à 16h45, d'avril à mai et de septembre à octobre tous les jours de 9h à 17h45 et en juillet août tous les jours de 9h à 18h45\n" + 
				"Ouvert du mardi au samedi de 9h15 à 12h et de 14h à 18h , dimanche et jours fériés de 10h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert de mars à avril de 13h30 à 18h30, les dimanche et jours fériés de 10h à 18h30, en mai-juin tlj de 10h à 18h30, en juillet-août jusqu'au 14 septembre tlj de 10h à 19h30, et du 15 septembre au 11 novembre de 13h30 à 18h30, les dimanches et jours féri\n" + 
				"Ouvert du 1er octobre au 30 juin  du mercredi au lundi de 10h à 12h et de 14h à 18h et du 1er juillet au 30 septembre du mercredi au lundi de  10h à 18h\n" + 
				"Ouvert le lundi et du mercredi au vendredi de 10h à 12h et de 14h à 18h samedi, dimanche et jours fériés de 14h à 18h\n" + 
				"Ouvert du 1er avril au 30 septembre de 9h30 à 12h et de 14h à 18h et  du 1er octobre au 31 mars de 14h à 17h\n" + 
				"Ouvert du 15 février au 30 juin et du 1er septembre au 15 novembre du mercredi au dimanche de 14h à 18h, en juillet-août du lundi au samedi de 11h à 19h, le dimanche de 14h à 19h\n" + 
				"Ouvert du mercredi au lundi du 2 mai au 30 septembre de 10h à 12h et de 14h à 18h, le reste de l'année de 14h à 17h\n" + 
				"Ouvert du 1er octobre au 31 mars de 14h à 17h du mercredi au lundi, du 1er avril au 30 juin et en septembre de 9h30 à 12h et de 14h à 18h, lundi et du mercredi au vendredi, samedi et dimanche de 14h à 18h, en juillet-août ouvert tous les jours de 9h30 à 1\n" + 
				"Ouvert de mai à octobre de 14h à 18h du mercredi au lundi\n" + 
				"Ouvert du mercredi au lundi de 14h à 18h. Groupes sur réservation le matin\n" + 
				"Ouvert du 1er juillet au 31 août de 15h à 18h30 du mercredi au lundi et du 1er au 16 septembre ddu jeudi au dimanche de 15h à 18h30\n" + 
				"Ouvert de novembre à février de 14h à 18h du mercredi au lundi, de mars à octobre de 10h à 12h et de 14h à 18h du mercredi au lundi, tous les jours en juillet-aôut de 10h à 12h30 et de 14h à 18h. Visites guidées toute l'année pour les groupes.\n" + 
				"Ouvert du mercredi au lundi en juillet et août de 14h à 18h + journées du patrimoine. Ouvert toute l'année pour les groupes sur réservation\n" + 
				"Ouvert mardi, jeudi, vendredi et samedi de 10h à 12h et de 14h à 18h, le mercredi de 10h à 12h et de 14h à 20h, dimanche de 14h à 18h\n" + 
				"Ouvert du mardi au vendredi de 14h à 17h, samedi, dimanche et jours fériés de 14h à 17h\n" + 
				"Pas de salle d'expositions actuellement, mais maintien de conférences et animations toute l'année\n" + 
				"Ouvert de septembre à juin lundi, mercredi au vendredi de 10h à 12h et de 14h à 18h30, samedi de 10h à 12h et de 14h30 à 18h30, dimanche de 14h30 à 18h30, et en juillet août tous les jours de 10h à 19h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h, juillet-août de 10h à 13h et de 14h à 18h\n" + 
				"\n" + 
				"Ouvert du 1er septembre au 30 juin du mercredi au dimanche de 10h à 12h et de 14h à 18h et du 1er juillet au 31 aôut du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"\n" + 
				"Ouvert de janvier à mars et de novembre à décembre tous les jours de 10h à 12h et de 14h à 17h, visites guidées à 10h30, 14h15 et 15h30. D'avril à mai et en octobre tous les jours de 9h à 12h et de 14h à 18h, visites guidées à 9h30, 10h30, 14h15, 15h30 et\n" + 
				"Ouvert en juillet-août et les week-end de septembre à octobre\n" + 
				"Ouvert du 1er mars au 22 décembre du mercredi au dimanche de 14h à 17h, en juillet-août du mercredi au dimanche de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert du 1er avril au 30 juin et en septembre de 10h à 12h et de 14h à 18h, du 1er octobre au 31 mars de 10h à 12h et de  14h à 17h, en juillet-août de 10h  à 18h\n" + 
				"Ouvert du 1er avril au 30 juin et en septembre de 10h à 12h et de 14h à 18h, du 1er octobre au 31 mars de 10h à 12h et de  14h à 17h, en juillet-août de 10h  à 18h\n" + 
				"Ouvert du 1er avril au 31 octobre du mercredi au lundi de 14h à 18h et de 9h à 12h, ouvert sur réservation pour les groupes\n" + 
				"\n" + 
				"Ouvert du lundi au vendredi de 9h à 17h30 et samedi dimanche de 9h à 13h30 depuis le 8 mars 2008\n" + 
				"Ouvert lundi, mardi, jeudi de 9h à 17h, mercredi, vendredi de 9h à 13h\n" + 
				"Ouvert du lundi au vendredi de 9h à 17h, le  samedi de 8h30 à 12h30\n" + 
				"\n" + 
				"Ouvert du lundi au vendredi de 9h à 17h\n" + 
				"Ouvert lundi et mardi de 8h à 13h et de 15h à 17h45, mercredi de 8h à 13h, jeudi et vendredi de 8h à 13h et de 15h à 17h45, samedi de 8h à 11h45\n" + 
				"Ouvert le lundi, mercredi, jeudi et vendredi de 8h00 à 13h15 et Lundi et Jeudi de 15h00 à 17h45\n" + 
				"Ouvert mercredi, vendredi, samedi et dimanche de 9h30 à 17h30. Accueil à la carte et sur rendez-vous pour les groupes. Ouvert lors des vacances scolaires de 9h30 à 17h30 sauf le mardi\n" + 
				"Ouvert du mercredi au dimanche de 13h30 à 17h30\n" + 
				"\n" + 
				"Ouvert du mercredi au dimanche de 14h à 18h du 1er mai au 31 octobre et de 14h à 17h du 1er novembre au 30 avril. Pour les scolaire ouvert du mercredi au vendredi de 9h à 12h et de 14h à 17h\n" + 
				"Ouvert du mercredi au dimanche ainsi que les jours fériés de 10 h à 12 h et de 14 h à 18 h, 17h le vendredi\n" + 
				"Ouvert du mercredi au dimanche de 14h à 17h\n" + 
				"Ouvert du mardi au dimanche de 11h à 18h\n" + 
				"Ouvert les mercredi, samedi et dimanche de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert du mardi au vendredi de 14h à 18h et du samedi au dimanche de 11h à 18h\n" + 
				"Ouvert du mardi au dimanche de 11h à 18h d'octobre à avril et de 11h à 19 h de mai à septembre\n" + 
				"Ouverture les vendredi, samedi, dimanche de 14 à 18h et sur rendez-vous\n" + 
				"Ouvert du mercredi au samedi de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h30 à 18h\n" + 
				"\n" + 
				"Ouvert du mercredi au vendredi de 11h à 17h, samedi et dimanche de 14h à 18h,  juillet-août du mercredi au dimanche de 13h à 18h. Groupes sur rendez-vous le mardi\n" + 
				"Ouvert du 1er week-end d'avril au dernier week-end de septembre, les vendredis, samedis et dimanches de 13h à 18h\n" + 
				"Ouvert du mercredi au dimanche de 14h à 18h. Pour les groupes et centre de documentation ouvert du lundi au dimanche de 9h à 12h et de 14h à 18h\n" + 
				"Musée en travaux ouvert 6 jours en 2010\n" + 
				"Ouvert du mercredi au lundi du 1er octobre au 31 mars de 10h à 12h30 et de 13h30 à 17h15, week-end 17h45, du 1er avril au 30 septembre de 10h à 12h30 et de 13h30 à 17h45, week-end 18h15. Ouverture du parc du 1er octobre au 31 mars de 10h à 18h et du 1er a\n" + 
				"ouvert tous les jeudis de 14h30 à 18h ou sur rendez-vous les autres jours\n" + 
				"Ouvert du lundi au samedi de 14h30 à 18h\n" + 
				"Ouvert du mercredi au samedi de 12h à 18h et le dimanche de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi d'avril à octobre de 10h à 13h et 14h à 18h (18h30 le dimanche) de novembre à mars de 10h à 13h et de 14h à 17h. Ouverture en continu le week-end toute l'année\n" + 
				"Les espaces d'exposition sont ouverts tous les jours de 10h à 17h\n" + 
				"Ouvert du mercredi au samedi de 10h à 13h et de 14h à 18h , le jeudi de 14h à 18h. Ouvert tous les jours pour les expositions temporaires hors les murs jusqu'à mai 2012\n" + 
				"Ouvert du mercredi au lundi de 9h15 à 17h45\n" + 
				"Ouvert du mardi au dimanche de 11h à 18h et le mercredi de 11h à 21h30\n" + 
				"Ouvert du lundi au vendredi de 11h à 18h et le dimanche de 10h à 18h. Nocturne jusqu'à 21h lors des expositions temporaires\n" + 
				"Ouvert de 9h30 à 18h d'avril à septembre et de 9h30 à 17h30 d'octobre à mars\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"\n" + 
				"Ouvert du mardi au jeudi et le 1er dimanche de chaque mois  de 10h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 17h30\n" + 
				"\n" + 
				"Ouvert du mercredi au lundi de 10h à 17h\n" + 
				"Ouvert de 10h à 18h du mardi au dimanche\n" + 
				"Ouvert de 10h à 18h\n" + 
				"Ouvert du mardi au vendredi de 11h à 18h, samedi et dimanche de 10h à 18h, nocturnele jeudi jusqu'à 21h\n" + 
				"Ouvert du mercredi au lundi de 9h30 à 17h\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h\n" + 
				"Ouvert d'avril à septembre de 10h à 18h (18h30 le dimanche), d'octobre à mars de 10h à 17h (17h30 le dimanche). Du 15 juin au 15 septembre l'église du dôme reste ouverte jusqu'à 19h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert lundi, jeudi, samedi et dimanche de  9h à 18h, mercredi et vendredi de 9h à 22h. Le hall Napoléon est ouvert de 9h à 22h\n" + 
				"Ouvert lundi, mercredi au vendredi de 11h à 18h, samedi-dimanche de 11h à 19h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au vendredi de 10h à 18h et le samedi et premier dimanche du mois et jours fériés de 14h à 18h\n" + 
				"Ouvert de 11h-18h du mercredi au lundi. Nocturne jusqu’à 21h le premier jeudi du mois\n" + 
				"Ouvert de 10h à 18h toute l'année\n" + 
				"\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 17h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert le mardi, mercredi, vendredi au dimanche de 9h30 à 18h, le jeudi de 9h30 à 21h45\n" + 
				"Ouvert du mercredi au dimanche de 13h à 18h. Accessible le mardi pour les groupes sur réservation\n" + 
				"Ouvert du mardi au samedi de 12h à 18h, dimanche de 10h à 18h. Nocturne expositions temporaires le vendredi\n" + 
				"Ouvert tous les jours de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"\n" + 
				"Ouvert tous les jours du mardi au vendredi de 10h à 17h15, le week-end de 10h à 19h, y compris certains jours fériés\n" + 
				"Ouvert du mardi au vendredi de 10h à 17h30 et le samedi et dimanche de 10h à 19h\n" + 
				"Entrée sur rdv uniquement\n" + 
				"Ouvert du mercredi au dimanche de 10h à 17h30\n" + 
				"\n" + 
				"Ouvert lundi, mercredi, vendredi au dimanche de 11h à 19h, le jeudi de 11h à 21h\n" + 
				"Ouvert du mardi au jeudi de 10h à 18h, le vendredi de 10h à 21h30, week-end et jours fériés de 10h à 19h\n" + 
				"Mardi au vendredi de 11h à 18h - samedi et dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h45 et de 14h à 17h15\n" + 
				"Ouvert du Lundi au vendredi de 10h à 12h30 et de  14h à 18h, le samedi de 10h à 13h et de 14h à 19h\n" + 
				"Ouvert du mercredi au lundi de 9h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10 à 18 h. Nocturne le mercredi jusqu'a 22h pour les expositions temporaires\n" + 
				"Ouvert les jeudis, samedis et dimanches après-midi uniquement en visite conférence, sur réservation\n" + 
				"Ouvert en fonction des expositions temporaires\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10 h à 18h, jeudi jusqu'à 21h30\n" + 
				"Ouvert du mercredi au lundi de 11h à 21h (musée et expositions)\n" + 
				"Ouvert de mardi au jeudi et samedi, dimanche de 12 h à 18 h\n" + 
				"Ouvert du mardi au vendredi de 11h à 17h30 et le samedi et dimanche de 12h à 17h30\n" + 
				"Ouvert mardi, mercredi, dimanche de 11h à 19h - jeudi, vendredi, samedi de 11h à 21h. Groupes tous les matin de 9h30 à 11h sauf le dimanche. Ouverture exceptionnelle les lundis de 11h à 19h pendant les vacances de Pâques\n" + 
				"Ouvert du lundi au samedi de 10h à 18h et le premier jeudi jusqu'à 20h\n" + 
				"Ouvert de 10h à 12h30 et de 14h à 17h30 en  juillet-août de 10h à 12h30 et de 14h à 18h\n" + 
				"Ouvert le mercredi de 10h à 12h et de 14h à 18h, le dimanche de 14h à 17h, lundi, mardi, jeudi et vendredi sur réservation pour les groupes\n" + 
				"Accueil de groupe sur rendez-vous\n" + 
				"Ouvert de mai à septembre le mercredi, vendredi, samedi, dimanche de 14h à 18h, d'octobre à avril le mercredi, samedi et dimanche de 14h à 17h30\n" + 
				"Ouvert en visites guidées d'avril à septembre du mardi au dimanche (10h, 11h, 14h, 15h, 16h et 17h) et d'octobre à mars du mardi au dimanche (14h, 15h et 16h) groupe sur réservation uniquement le vendredi (octobre à mars). Ouvert de 10h à 12h pour les éco\n" + 
				"\n" + 
				"Fermé pour chantiers des collections et récolement\n" + 
				"Ouvert de 9h30 à 17h d'octobre à mars et de 9h30 à 18h d'avril à septembre\n" + 
				"Ouvert du mercredi au dimanche de 14h à 18h\n" + 
				"Ouvert les samedis et dimanches de 15h à 18h l'été et de 14h à 17h l'hiver et sur rendez-vouspour les groupes\n" + 
				"Ouvert du 1er avril au 30 septembre de 10h à 12h et de 14h à18h, du 1er octobre au 31 mars de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert de mai à septembre de 9h30 à 18h30 et d’octobre à avril de 10h à 17h30\n" + 
				"\n" + 
				"Ouvert du mercredi au dimanche de 14h à 18h\n" + 
				"Ouvert du vendredi au dimanche et jours fériés de 14h à 19h de mars à novembre\n" + 
				"Ouvert de jeudi à mardi 10h à 12h30 et de 14h à 17h30 de septembre à juin et de 10h à 12h30 et de 14h à 18h en juillet et août\n" + 
				"Ouvert du mercredi au samedi de 10h à 12h30 et de 14h à 18h, dimanche de 14h à 18h. Mardi réservé aux groupes et aux scolaires sur réservation\n" + 
				"Ouvert du mardi 3 janvier au vendredi 6 avril inclus et du lundi 12 novembre au dimanche 16 décembre inclus : les w-e et jours fériés, et tous les jours sauf le lundi pendant les vacances scolaires (zone C) de 12h à 17h30. Du 7 avril au vendredi 15 juin i\n" + 
				"Ouvert du dimanche au vendredi de septembre à juin de 10h à 12h30 et de 14h à 17h30 - En juillet et août de 10h à 12h30 et de 14h à 18h30\n" + 
				"Ouvert du mercredi au vendredi de 14h à 17h, le samedi et dimanche de 15h à 18h. Sur réservation de 10h à 12h\n" + 
				"Ouvert du mercredi au lundi de septembre à juin de 10h à 12h30 et de 14h à 17h30, juillet- août de 10h à 12h30 et de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche d'octobre à mars de 10h à 17h et d'avril à septembre de 10h à 18h\n" + 
				"Ouvert du mercredi au dimanche de 14h à 17h ou de 14h à 18h selon les saisons\n" + 
				"Ouvert du mercredi au vendredi de 14h à 17, le week-end de 14h à 18h\n" + 
				"Ouvert lundi, mercredi, vendredi de 10h à 17h30, le jeudi de 10h à 20h, le week-end de 14h à 18h30\n" + 
				"\n" + 
				"Ouvert mercredi et premier dimanche du mois de 14h à 17h30 (hors expos), mercredi et dimanche de 14h à 17h30 pendant la période d'exposition, tous les jours sur réservation pour les groupes\n" + 
				"Ouvert du 1er octobre au 15 avril de 9h30 à 12h45 et de 14h à 17h15 et du 16 avril au 30 septembre de 9h30 à 12h45 et de 14h à 17h45\n" + 
				"Ouvert de 9h à12h et de 13h30 à 17h30, week-end et jours fériés de 13h30 à 18h30 du 15 octobre au 14 mars et de 10h à 12h et de 14h à 19h du 15 mars au 14 octobre\n" + 
				"Ouvert du mercredi au lundi de 14h à 18h\n" + 
				"Ouvert du mercredi au vendredi de 13h30 à 18h et le samedi et dimanche et jours fériés de 11h à 18h\n" + 
				"Ouvert du mardi au dimanche de 14h à 18h et pour les groupes du mardi au samedi de 10h à 13h\n" + 
				"Ouvert du mercredi au dimanche de 10h à 12h30 et de 13h30 à 18h\n" + 
				"Ouvert du mercredi au dimanche de 14h à 18h\n" + 
				"Ouverture de l'Espace Joron mardi, mercredi, vendredi de  9h30 à 12h et de 14h30 à 18h, samedi de 9h30 à 12h\n" + 
				"Ouvert du mardi au vendredi de 9h à 12h30 et de 14h à 17h30. Samedi et Dimanche de 14h à 18h, le 8 mai\n" + 
				"Ouvert mercredi, samedi de 10h à 12h et de 14h à 18h, mardi, jeudi, vendredi et dimanche de 14h à 18h\n" + 
				"Ouvert du mardi au samedi de 10h à 12h et de 14h à 18h, le dimanche de 11h à 13h et de 14h à 18h\n" + 
				"Ouvert le mercredi et jeudi de 14h à 18h, le week-end de 13h à 18h\n" + 
				"Ouvert du mardi au jeudi, dimanche, de 14h à 18 h, et le samedi de 10h à 12h et de 14h à 18h. Tous les jours pour les groupes sauf jours fériés\n" + 
				"Ouvert chaque samedi de 14 h 30 à 17 h 30. Visites de groupes et scolaires, sur réservation, du lundi au vendredi\n" + 
				"Ouvert du mardi au vendredi de 10h à 18h, samedi, dimanche de 12h à 19h\n" + 
				"Ouvert du lundi au vendredi de 9h à 12h et de 13h30 à 18h, mardi de 13h30 à 18h, samedi dimanche et jours fériés de 14h à 17h en hiver et de 15h à 18h en été\n" + 
				"Ouvert du mardi au dimanche de 11h à 18h\n" + 
				"Ouvert du mercredi au dimanche de 14h à 17h30 d'octobre à mars et de 14h à 18h30 d'avril à septembre. Pour les scolaires du lundi au vendredi de 9h à12h30 et de 13h30 à 17h. Pour les groupes adultes du mardi au vendredi de 9h à 12h et mardi au dimanche de\n" + 
				"Ouvert du 1er novembre au 31 mars le lundi du mercredi au vendredi de 10h à 12h et de 14h à 17h30, samedi et dimanche de 14h à 18h et du 1er avril au 31 octobre de 10h30 à 12h30 et de 14h à 18h samedi et dimanche de 10h30 à 18h30\n" + 
				"Ouvert lundi, mercredi  à vendredi de 13h à 18h et de 9h à 12 pour les groupes, samedi de 10h à 18h, dimanche et jours fériés de 13h à 19h et du 1er novembre au 31 mars le lundi, mercredi au vendredi de 13h à 18h, samedi de 10h à 18h et dimanches et jours\n" + 
				"Ouvert chaque mercredi et dimanche du mois de 15h à 18h\n" + 
				"Visites guidées samedi et jours fériés à 15h et 16h30, dimanche à 14h30, 15h30, 16h30 et 17h. Ouverture pour les groupes tous les jours sauf dimanche sur rdv. Pour les individuels, samedi, dimanche et jours fériés de 14h à 18h30\n" + 
				"Ouvert depuis 2010, uniquement les week-end de 10h à 11h, 14h30 à 16h30 sur réservation et par groupe de 6 maximum (individuel). Pour les groupes sur rendez-vous du mardi au vendredi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 9h30 à 12h et de 14h à 17h30\n" + 
				"\n" + 
				"Ouvert du mercredi au dimanche et jours fériés de 10h à 12h et de 14h à 17h30\n" + 
				"Ouvert du mercredi au vendredi de 14h à 19h, samedi, dimanche de 15h à 19h\n" + 
				"Ouvert du mardi au vendredi de 10h à 17h30 et samedi et dimanche de 10h à 18h30\n" + 
				"Ouvert de 10h à 17h15, du 1er mai au 30 septembre le week-end et jours fériés de 10h à 18h15\n" + 
				"Ouvert du mercredi au samedi de 14h à 18 le samedi et le premier dimanche du mois de 14h à 18h, mercredi, jeudi et vendredi toute la journée pour les scolaires et centres de loisirs et autres groupes\n" + 
				"Musée et parc ouverts pour tous pendant la période d'exposition et le JEP et le reste de l'année sur RDV pour les groupes (visites scolaires et visites-conférences). Exposition 2010 ouverte du vendredi au dimanche de 13h à 18h30\n" + 
				"Ouvert du lundi au jeudi et du samedi au dimanche de 14h à 18h\n" + 
				"Ouvert du 1er novembre au 31 mars du mardi au dimanche de 9h à 17h30 et du 1er avril au 31 octobre de 9h à18h30\n" + 
				"Ouvert d'avril à juin, septembre à octobre du mercredi au dimanche de 10h à 12h et de 14h à 18h. En juillet-août tous les jours de 10h à 12h et de 14h à 19h. De novembre à mars ouvert sur rendez-vous pour les groupes et scolaires\n" + 
				"Ouvert du 15 septembre au 15 juin du mardi au samedi de 10 h à 12 h et de 14 h à 18 h et le premier dimanche du mois de 14h30 à 17h30, du 15 juin au 15 septembre tous les jours de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 14h30 à 18h30 de juin à septembre\n" + 
				"\n" + 
				"Ouvert de septembre à juin du mercredi au vendredi de 9h à 12h et de 14h à 18h, le samedi de 10h à 12h et de 14h à 17h. Juillet-août du mardi au dimanche de 9h à 12h et de 14h à 18h\n" + 
				"Ouvert du 1er novembre au 31 mars du mercredi au lundi de 14h à 17h, du 1er avril au 14 juillet du mercredi au lundi de 10h à 12h et de 14h à 17h, et du 15 juillet au 31 octobre tous les jours de 10h à 13h et de 14h30 à 18h\n" + 
				"Ouvert du 1er novembre au 31 mars du mercredi au lundi de 14h à 17h, du 1er avril au 14 juillet du mercredi au lundi de 10h à 12h et de 14h à 17h, et du 15 juillet au 31 octobre tous les jours de 10h à 13h et de 14h30 à 18h\n" + 
				"Ouvert d'octobre à mai du mardi au vendredi de 13h à 17h, samedi-dimanche de 10h à 12h et de 14h à 17h et de juin à septembre du mardi au dimanche de 10h à 12h et de 15h à 19h\n" + 
				"Ouvert en hiver le mardi, mercredi, jeudi de 9h à 12h et vendredi de 14h à 17h, samedi visite guidée de 9h à 12h, en juillet-août du mardi au samedi de 9h à 12h\n" + 
				"Ouvert du lundi au dimanche de septembre à juin de 14h à 18h\n" + 
				"Ouvert du lundi au dimanche de septembre à juin de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert mardi, jeudi et vendredi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du 1er avril au 31 octobre de 10h à 12h30 et de 14h à 18h et du 1er novembre au 31 mars de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert du 1er avril au 31 octobre de 10h à 12h et de 14h à 18h + lundi de Pâques et Pentecôte. Du 1er novembre au 31 mars du mercredi au vendredi et durant les vacances scolaires zone A de 10h à 12h et de 14h à 17h. En juillet-août tous les jours de 10h à\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h de juin à novembre\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h et le second jeudi de chaque mois de 10h à 21h (jeudi des copistes) et tous les jeudis en juillet-août\n" + 
				"Ouvert du mardi au vendredi, et un dimanche sur deux de 10h à 12h et de 14h à 18h de septembre à juin et en  juillet-août de 10h à 12h et de 15h à 18h30 du mardi au vendredi et dimanche\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h de septembre à juin et en juillet-août de 10h à 12h30 et de 15h à 18h30\n" + 
				"Ouvert du lundi au samedi de 8h30 à 13h30 à 17h d'octobre à mai, de 9h à 12h et de 14h à 18h de juin à septembre et de 9h à 12h et de 14h à 18h en juillet/août de 9h à 12h et de 15h à 19h\n" + 
				"Ouvert d'avril à juin et de septembre à octobre tous les jours de 10h à 12h30 et de 14h à 19h, de juillet à août tous les jours de 10h à 19h, de novembre à mars le mardis et le jeudis de 9h à 12h et de 14h à 18h, et le dimanche de 14h à 18h les autres jou\n" + 
				"Ouvert du mardi au dimanche de  novembre à février de 14h à 17h, de mars à juin et septembre à octobre de 15h à 18h, juillet-août de 10h à 12h et de 15h à 18h\n" + 
				"Ouvert du mardi, jeudi et vendredi de 14h à 17h, mercredi de 10h à 12h et de 14H à 17h de novembre à avril, et de mai à octobre du mardi au dimanche de 10h à 12h30 et de 14h à 18H\n" + 
				"Ouvert de janvier à mai et d'octobre à décembre du mercredi au lundi de 9h à 12h et de 14h à 18h, de juin à septembre tous les jours de 9h30 à 18h30\n" + 
				"Ouvert du 1er octobre au 31 mai du mardi au vendredi de 10h à 17h, samedi et dimanche de 10h à 18h et du 1er juin au 30 septembre du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du  1 er avril au 30 juin de 9h à 12h et de 14h à 18h,  du 1 er juillet au 31 août de 10h à 18h, duer septembre au 31 octobre de 9h à 12h et de 14h à 18h, duer novembre au 31 mars de 9h à 12h et de 14h 17h\n" + 
				"Ouvert du 1er octobre au 31 mai du mardi au vendredi de 10h à 17h, samedi et dimanche de 10h à 18h et du 1er juin au 30 septembre du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du lundi au dimanche en juillet-août de 10 h à 12h30 et de 14h30 à 19h, de novembre à février de 10h à 12h et de 14h à 17h, de mars à Juin et de septembre à Octobre de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert de mars à novembre du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"\n" + 
				"Ouvert le lundi, mercredi au vendredi de 10h à 12h et de 13h30 à 17h30, samedi, dimanche et jours fériés de 14h à 18h, de 14h à 19h lors des expositions temporaires\n" + 
				"Ouvert du lundi au vendredi de 10h à 12h et de 14h à 18h le week-end de 9h à 12h et de 14h à 17h. En juillet-août du lundi au dimanche de 10h à 18h\n" + 
				"Ouvert de juin à septembre du mercredi au dimanche de 14h30 à 18h30, de mars à juin et octobre à novembre, mercredi, samedi et dimanche de 14h à 18h\n" + 
				"Ouvert de juin à novembre du mardi au dimanche de 10h à 18h, le reste de l'année du mardi au dimanche de 9h30 à 12h et de 14h à 18h\n" + 
				"Ouvert tous les jours de 10h à 13h et de 14h à 18h du 1er mars à mi-novembre\n" + 
				"Ouvert tous les mardis, jeudis, vendredis et dimanches de 10 à 18h, les mercredis de 13h à 21h, les samedis de 11h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h30 à 12h30 et de 13h30 à 18h\n" + 
				"Ouvert jusqu'au 30 juin 2011 du jeudi au mardi de 10h à 18h et le mercredi de 13h à 21h Ouvert à partir du 1er juillet du mardi au  dimanche de 10h à 18h pour le musée permanent, du mardi au dimanche de 14h à 18h pour l'Sabatier d'Espeyran et de 10h à 19\n" + 
				"Ouvert du lundi au samedi de 14h30 à 17h30, du 15 juin au 15 septembre du lundi au samedi de 15h à 18h\n" + 
				"Ouvert du lundi au vendredi de 10h à 12h30 et de 14h à 18\n" + 
				"Ouvert le mercredi et samedi de 14h à 17h\n" + 
				"Ouvert de juin à septembre de 10h à 12h et de 15h à 19h, nocturne du 1er juillet au 15 septembre les mercredis et vendredis de 21h à 23h,  du 13 février au 31 mai et du 1er octobre au 11 novembre de 10h à 12h et de 14h à 17h30\n" + 
				"Ouvert des vacances de Pâques à fin juin de mi-septembre à fin septembre vacances de Toussaint du jeudi au dimanche de 15h à 18h, de juillet à mi-septembre du mardi au dimanche de 10h à 12h et de 15h à  18h\n" + 
				"Ouvert du 1er avril au 31 octobre de 9h30 à 19h tous les jour, du 2 novembre au 31 mars de 10h à 18h du mardi au dimanche\n" + 
				"\n" + 
				"Ouvert en février, mars, novembre, décembre les samedis de 15h à 18h, en avril, mai, octobre tous les jours de 15h à 18h, de juin à septembre tous les jours de 10h30 à 12h30 et de 14h30 à 18h30\n" + 
				"Ouvert tous les jours du 1er mai au 30 septembre. Du 1er juillet au 15 septembre de 10h à 19h, et de 10h à 18h du 16 septembre au 30 juin de 10h à 18h\n" + 
				"Ouvert tous les jours du 1er juin au 30 septembre de 10h à 12h et de 14h à 18h et du mercredi au lundi de 10h à 12h et de 14h à 18h du 1er octobre au 31 mai\n" + 
				"\n" + 
				"Ouvert du lundi au Vendredi de 9h30 à 17h\n" + 
				"Ouvert mercredi et samedi de 10h à 18h et du  mardi au vendredi sur rendez-vous pour les groupes\n" + 
				"Ouvert du mardi au dimanche de 10h30 à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h30 à 18h\n" + 
				"\n" + 
				"Ouvert du 1er juillet au 14 octobre du dimanche au vendredi de 14 à 19h30, en juillet de 14h à 19h30 en août de 14h à 20h, en septembre et octobre de 14h à 18h30. Tous le sjours pour les groupes d'avril à octobre.\n" + 
				"Ouvert toute l'année en été de 10h à 19h, en hiver de 10h à 12h30 et de 14h à 17h, au printemps de 10h à 12h30 et de 14h à 18h\n" + 
				"Musée ouvert du mercredi au lundi du 1er avril au 31 octobre de 10h à 18h30 et du 1er novembre au 31 mars de 13h30 à 18h & expositions temporaires d'avril à octobre de 10h à 12h et de 13h30 à 18h30 et de novembre à mars de 10h à 12h et de 13h30 à 18h. Ch\n" + 
				"Ouvert tous les jours du 1er février à la fin des vacances scolaires de Noël de 10h à 12h30 et de 13h30 à 18h\n" + 
				"Ouvert du mercredi au lundi, les 1er et 3ème dimanche du mois du 1er mai au 31 octobre de 10h à 13h et de 14h à 18h30 et du 1er novembre au 30 avril de 13h à 18h\n" + 
				"Ouvert du 1er mai au 31 octobre de 10h à 13h et de 14h à 18h30, du 1er novembre au 30 avril de 13h à 18h le lundi et de mercredi et jeudi\n" + 
				"Ouverture des 4 pôles du musée (Hôtel Bonnet de Bay, Maison Moncourier Beauregard, Imprimerie, Chapelle des Pénitents) tous les jours du 14 mai au 30 septembre 2011 de 14h à 18h et sur rendez-vous hors saison pour les groupes. La galerie d'exposition a ou\n" + 
				"Ouvert du mercredi au lundi de 9h30 à 12h et de 14h à 18h de septembre à juin, en juillet-août de 10h à 18h sauf mardi matin\n" + 
				"Ouvert du 2 mai au 30 juin et du 1er septembre au 31 octobre du mercredi au lundi de 10h à12h et de 14h à 18h. En juillet-août tous les jours sauf fériés de 10 h à 12h et de 14h à 18h. Du 2 novembre au 30 avril du mercredi au lundi et les 1er et 3ème dima\n" + 
				"Ouvert tous les jours du 1er juin au 30 septembre de 14h à 18h et d'octobre à mai, mercredi, samedi, dimanche et vacances scolaires zones B et C de 14h à 18h. Pour les groupes visites guidées tous les jours de 8h à 12h et de 13h30 à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h30 et de 14h à 17h45\n" + 
				"Ouvert du 1er avril au 30 septembre de 10h à 18h du mercredi au lundi et du 1er octobre au 31 mars, le lundi et du mercredi au samedi de 10h à 12h et de 14h à 17h et le dimanche de 14h à 17h\n" + 
				"Ouvert mercredi au lundi du 1er mars au 30 septembre de 10h à 12h30 et de 13h30 à 18h et du 1er octobre au 15 décembre  de 10h à 12h30 et de 14h à 17h\n" + 
				"Ouvert du 1er mars au 30 avril  et en octobre le week-end, vacances scolaires de la zone A et jours fériés de 14h à 17h et du 1er mai au 30 septembre tous les jours de 10h à 12h et 14h à 18h. Groupes toute l'année sur rendez-vous\n" + 
				"Ouvert lundi, mercredi au vendredi de 14h à 18h, samedi, dimanche et jours fériés de 10h à 12h et de 14h à 18h\n" + 
				"\n" + 
				"Ouvert de novembre à avril  de 14h à 18h du mardi au vendredi et de 10h à 12h et 14h à 18h le week-end, et de mai à octobre du mardi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert tous les jours de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h30 et de 14h à 18h\n" + 
				"Ouvert du mercredi au dimanche de 10h à 18h. Le premier Dimanche de chaque mois de 10h30 à 13h30\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h\n" + 
				"Ouvert du 2 mai au 30 septembre lundi, mercredi au samedi de 14h à 18h, dimanche de 10h à 12h et de 14h à 18h, du 1er octobre au 30 avril lundi, mercredi au lundi de 14h à 17h\n" + 
				"Ouvert du 1er octobre au 30 avril de 14h à 17h et les matins aux groupes sur réservation et du 2 mai au 30 septembre de 10h à 12h30 et de 13h30 à 18h\n" + 
				"Ouvert du mercredi au dimanche de  14h à 18h.\n" + 
				"Ouvert du 1er juillet au 1er mai de 14h à 18h et du 1er mai au 30 juin et du 1er septembre au 1er octobre les week-end et jours fériés de 14h à 18h. Visite pour les groupes toute l'année sauf mardi\n" + 
				"Ouverture en janvier du lundi au vendredi de 10h30 à 13h et de 13h30 à 17h, en février, mars tous les jours de 10h30 à 13h et de 13h30 à 17h, en avril-septembre tous les jours de 10h à 13h et de 13h30 à 18h, en octobre-novembre tous les jours de 10h30 à 1\n" + 
				"Ouvert en avril, mai et octobre les week-ends et jours fériés de 14h à 18h, de juin à septembre du mercredi au lundi de 14h à 18h y compris les jours fériés\n" + 
				"Ouvert du 15 mai au 15 octobre le lundi  et du mercredi au vendredi de 14h à 17h, le samedi de 14h à 18h et le dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert tous les jours du 1er mars au 1er novembre de 10h à 12h30 et de 13h30 à 18h\n" + 
				"Ouvert d'avril à juin et septembre les week-end et jours fériés de 14h à 17h30, en juillet-août tous les jours de 14h30 à 17h30\n" + 
				"Ouvert de mai à septembre du lundi au vendredi de 10h à 12h et de 14h à 18h, samedi, dimanche et jours fériés de 14h à 18h.\n" + 
				"Ouvert du mercredi au lundi de 9h30 à 12h et de 14h à 18h du 1er avril au 31 octobre\n" + 
				"Musée actuellement fermé. Réouverture au public mi 2013\n" + 
				"Ouvert du mardi au dimanche de 9h30 à 12h et de 13h30 à 18h\n" + 
				"Ouvert de Pâques au 31 octobre de 14h à 18h du mercredi au lundi + saison Noël de mi- novembre à fin décembre de 14h à 17h\n" + 
				"Ouvert du mercredi au vendredi, et lundi de 9h à 17h et le week-end de 10h à 17h en été de 10h à 18h\n" + 
				"Ouvert lundi et mercredi de 11h à 18h, jeudi et vendredi de 11h à 20h, samedi de 10h à 20h, dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 14h à 18h toute l'année, pour les groupes de 8h30 à 18h tous les jours\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du lundi au vendredi de 9h à 12h et de 13h30 à 17h, le samedi de 10h à 12h, en juillet-août en semaine et dimanche de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert du mercredi au samedi de 10h à 12h et de 14h à 18h et le dimanche et jours fériés de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h + lundis fériés\n" + 
				"Ouvert du mardi au dimanche & lundis fériés de 10h à 12h et de 14h à 18h du 1er novembre au 31 mars et du 1er avril au 31 octobre de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 14h à 18h du 16 septembre au 14 juin, du mardi au dimanche de 9h30 à 11h30 et de 14h à 18h du 15 juin au 15 septembre\n" + 
				"Ouvert du mardi au dimanche de 9h30 à 12h et de 13h30 à 18h\n" + 
				"Ouvert tous les jours du 1er septembre au 30 juin de 9h30 à 12h et de 14h à 18h, vendredi de 9h30 à 18h, dimanche et jours fériés de 10h à 12h et de 14h à 18h, en juillet-août tous les jours de 9h30 à 12h30 et de 13h30 à 18h30, vendredi de 9h30 à 18h30, d\n" + 
				"Ouvert le lundi et du mercredi au samedi de 9h à 12h30 et de 13h30 à 18h, le dimanche de 13h30 à 18h\n" + 
				"Ouvert de mai à septembre, vacances d'été du lundi au samedi de 10h à 12h et de 14h à 18h, d'octobre à avril mercredi et samedi de 10h à 12h et de 14h à 18h, vacances scolaires (3 zones) lundi et du mercredi au samedi de 10h à 12h et de 14h à 18h, dimanch\n" + 
				"Ouvert en 2012 en visite guidée accompagnée et lors de certaines grandes manifestations\n" + 
				"Ouvert de janvier à mars du lundi au samedi de 14h à 18h, et en avril de 14h à 18h et de mai à septembre de 10h à 12h et de 14h à 18h, de novembre à décembre de 14h à 18h du mercredi au lundi\n" + 
				"Ouvert de janvier à mars du lundi au samedi de 14h à 18h, et en avril de 14h à 18h et de mai à septembre de 10h à 12h et de 14h à 18h, de novembre à décembre de 14h à 18h du mercredi au lundi\n" + 
				"Ouvert de mai à mi-octobre du mardi au samedi de 10h à 12h et de 14h à 18h, le dimanche de 14h à 18h, et de mi-octobre à avril du mardi au dimanche de  14h à 18h + mercredi de 10h à 12h\n" + 
				"Ouvert le lundi de 13h à 17h,  du mardi au vendredi de 8h à 17h, le samedi de 9h à 12h\n" + 
				"Ouvert le lundi, mercredi à vendredi de 8h30 à 17h, le mardi de 14h à 17h, le samedi de 8h30 à 12h\n" + 
				"\n" + 
				"Ouvert du mardi au jeudi de 8h30 à 17h30, vendredi et samedi de 8h30 à 17h et le dimanche de 9h à 17h\n" + 
				"Ouvert du mardi au jeudi de 8h30 à 17h30, le vendredi de 8h30 à 17h, le samedi de 8h30 à 13h et de 14h à 17h, le dimanche de 9h à 13h et de 14h à 17h\n" + 
				"Ouvert tous les jours de 9h à 17h\n" + 
				"Ouvert de janvier à avril et d'octobre à décembre de 10h30 à 12h et de 14h à 17h30, en janvier la 1ère semaine puis seulement les week-ends, en mai de 10h30 à12h et de 14h à 17h30 en semaine et de 9h45 à 12h et de 14h à 18h les week-ends et jours fériés,\n" + 
				"Ouvert en juillet et août de 14h à 19h et de mi-avril à mi-octobre de 14h à 18h du mardi au dimanche\n" + 
				"Ouvert en février, mars vacances et dimanches de 14h à 18h, d'avril à juin et septembre du mardi au dimanche de 14h à 18h, juillet/août tous les jours de 11h à 13h et de 14h à 19h, octobre/novembre les dimanches, jours fériés et vacances de 14h à 18h (fer\n" + 
				"Ouvert lors des vacances d'hiver toutes zones, les vacances de Noël et du 1er dimanche d'avril au 30 juin tous les jours de 10h à 12h et de 13h30 à 18h, le dimanche et jours fériés de 10h à 12h et de 13h30 à 18h30, en juillet-août tous les jours de 10h à\n" + 
				"Ouvert de février à avril de 14h à 19h et de mai à septembre de 11h à 19h et d'octobre à décembre de 14h à 17h\n" + 
				"Réouverture le 10 avril 2011. Avril, mai, juin, 1er et 2 juillet,  29 au 31 août, septembre, octobre, 1er février, 11 au 13 novembre de 14h-18h, du 03 juillet  au 28 août tous les jours de  10h à 18h30 et durant les vacances de Noël de  14h à 18h\n" + 
				"Ouvert du mardi au samedi de 10h à 12h et de 14h à 18h. Ouvert le dimanche et le lundi uniquement sur réservation pour les groupes\n" + 
				"Ouvert de juin à septembre du mardi au dimanche de 10h à 12h et de 14h à 18h. Accueil des groupes sur rendez-vous\n" + 
				"Ouvert de juin à septembre du mardi au dimanche de 10h à 12h et de 14h à 18h. Accueil des groupes sur rendez-vous\n" + 
				"Ouvert de mai à juin, en septembre et d'octobre à mars du lundi au samedi de 10h à 12h et de 14h à 18h, en juillet-août tous les jours de 10h à 18h\n" + 
				"Ouvert mardi, jeudi et vendredi de 10h à 12h et de 14h à 18h, mercredi et samedi de 13h à 19h, dimanche de 14h à 18h - Du 1er juillet au 31 août mardi, jeudi, vendredi de 10h à 18h et mercredi, samedi de 12h à 18h. Du 15 juillet au 15 août ouvert tous les\n" + 
				"Ouvert du mardi au vendredi de 10 h à 12 h et de 14 h à 18 h, samedi et dimanche de 14h à 18h\n" + 
				"\n" + 
				"\n" + 
				"Ouvert en avril les  mercredi , jeudi et dimanche de 14h à 18h, mai/juin/septembre du mercredi au lundi de 14h à 18h, juillet-août du mardi au vendredi de 10h à 12h30 et de 13h30 à 18h30, les samedi, dimanche et lundi de 13h30 à 18h30, en octobre mercredi\n" + 
				"Ouvert en Juillet et Août tous les jours de 11h à 12h et de 14h30 à 18h30. Autres jours de l'année, sur rendez-vous\n" + 
				"Ouvert d'avril à juin et septembre du mardi au samedi de 14h à 18h, juillet-août du mardi au samedi de 10h à 12h et de 14h30 à 18h30\n" + 
				"Ouvert du 1er avril au 31 octobre tous les jours de 10h à 12h et de 14h à 18h et du 2 novembre au 31 mars du lundi au vendredi de 14h à 17h, samedi et dimanche de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert de novembre à mars du mercredi au dimanche de 14h à 17h et d'avril à octobre du mercredi au lundi de 10h à 12h et de 15h à 18h\n" + 
				"Ouvert du 1er juin au 30 septembre de 10h à 12h30 et de 14h à 18h et du 1er février au 31 mai et du 1er octobre au 31 décembre de 14h à 17h, le matin sur réservation\n" + 
				"Ouvert du 15 juin au 14 septembre de 10h à 12h et de 14h30 à 18h30, du 15 septembre au 14 juin de 10h à 12h et de 14h30 à 17h30\n" + 
				"Ouvert du mercredi au lundi du 1er février au 30 avril et du 1er novembre au 31 décembre de 14h à 17h et du 1er mai au 31 octobre de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert du lundi au vendredi de 8h30 à 12h et de 13h30 à 17h\n" + 
				"Ouvert du lundi au vendredi de 9h à 12h et de 14h à 18h, le samedi de 10h à 12h et de 15h à 18h, en juillet août de 10h à 12h le dimanche\n" + 
				"\n" + 
				"Ouvert en janvier et décembre le mardi, jeudi et vendredi de 10h à 12h et de 15h à 18h, le mercredi, samedi et dimanche de 9j à 12h et de 14h à 18h. De février à juin et de septembre à octobre le lundi, mardi, jeudi et vendredi de 10h à 12h et de 15h à 18\n" + 
				"Ouvert du mardi au vendredi de 9h30 à 12h30 et de 13h30 à 17h30  de décembre à février - de mars à mi-juin et de mi-septembre à fin novembre du mardi au samedi de 9h30 à 12h30 et de 13h30 à 17h30 - de mi-juin à mi septembre tous les jours et jours fériés\n" + 
				"Expositions temporaires tous les jours de 10h à 18h\n" + 
				"Exposition hors les murs ouvert du 7 juillet au 10 novembre 2012 du lundi au samedi de 10h à 12h et de 14h30 à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 17h d'octobre à mai et de 10h à 18h de juin à septembre\n" + 
				"Ouvert du mardi au dimanche de 10h à 17h d'octobre à mai et de 10h à 18h de juin à septembre\n" + 
				"Ouvert du 2 mai au 10 novembre du lundi au samedi de 14h à 18h. Ouvert toute l'année sur rendez-vous pour les groupes.\n" + 
				"Ouvert les jeudis de 10h à 12h et de 14h à 16h\n" + 
				"Ouvert de 10h à 18h du mardi au dimanche\n" + 
				"Ouvert tous les jours de 10h à 18h, de 10h à 19h du 1er juillet au 31 août. Fermeture exceptionnelle à 17h les 24 et 31 décembre\n" + 
				"Ouvert tous les jours de 10h à 18h. Nocturne le mercredi jusqu'à 21h\n" + 
				"Ouvert du mercredi au vendredi de 10h à 18h et du samedi et dimanche de 11h à 19h en été de 11h à 19h\n" + 
				"\n" + 
				"Ouvert du 18 mai au 30 octobre 2010 du mercredi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert de mai à octobre du mercredi au dimanche de 15h à 18h, de novembre à avril le mercredi et dimanche de 15h à 18h\n" + 
				"Ouvert du 1er avril au 30 septembre de 9h à 12h et de 13h30 à 18h30 et du 1er octobre au 31 mars de 9h à 12h et de 14h à 18h (17h le vendredi)\n" + 
				"Ouvert tous les jours de juin à septembre de 16h à 18h30\n" + 
				"Ouvert tous les jours du 16 octobre au 31 mars de 13h30 à 17h30 et du 1er avril au 15 octobre de 10h à 19h\n" + 
				"Ouvert tous les jours du mercredi au lundi de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert tous les jours du d' avril au 11 novembre 2012 de 9h45 à 12h45 et de 13h45 à 18h30\n" + 
				"Ouvert du mercredi au lundi de 11h à 18h, dimanche et jours fériés de 14h à 18h\n" + 
				"Ouvert juillet-août tous les jours de 10h30 à 18h, et du mardi au dimanche d'avril à  juin et septembre de 10h30 à 12h30 et de 14h à 18h, octobre à mars de 14h à 17h30. Ouvert les lundis de Pâques et de Pentecôte\n" + 
				"Ouvert en juillet/août tous les jours de 9h à 19h, d'octobre à avril du lundi au samedi de 9h à 12h30 et de 14h à 18h, en mai, juin et septembre du lundi au samedi de 9h à 12h30 et de 14h à 18h, le dimanche de 10h à 13h\n" + 
				"Ouvert du mercredi au lundi du 15 juillet au 15 septembre de 10h à 12h et de 15h à 18h ainsi que les deux jours JEP\n" + 
				"Ouvert en juillet/août de 10h à 13h et de 14h à 18h du lundi au samedi. Autre période contacter l'O.T.\n" + 
				"Ouvert de 10h à 12h30 et de 15h à 18h30 en juillet-Août 2012\n" + 
				"\n" + 
				"Ouvert en mai, juin et septembre du  mercredi au dimanche de 14h à 18h, en juillet-août tous les jours de 10h à 19h et toute l'année pour les groupes sur réservation\n" + 
				"Ouvert en  juillet-août tous les jours de 10h à 18h, du mardi au dimanche d'avril à juin et en septembre de 10h à 12h et de 15h à 18h et du mercredi au dimanche de janvier à mars et d'octobre à décembre de 14h30 à 17h\n" + 
				"Ouvert en juillet août du mardi au dimanche de 10h à 12h30 et de 16h à 19h\n" + 
				"Ouvert en janvier de 10h à 12h et de 14h à 17h, février,novembre et décembre de 10h à 12h et de 14h à 17h30, avril/mai et octobre de 10h à 12h et de 14h à 18h, du 1er au 20 juin de 9h à 12h et de 14h à 18h de mi-juin au 30 septembre de 9h à 18h, juillet-a\n" + 
				"Ouvert en janvier et février, samedi et dimanche de 14h à 17h, de mars à avril et de novembre à décembre du mercredi au dimanche de 14h à 17h, de mai à juin et de septembre à octobre du mercredi au lundi de 10h à 12h et de 14h à 18h, juillet & août tous l\n" + 
				"Ouvert de 10h à 12h et de 14h à 18h (17h du 1er octobre au 31 mars), juillet-août ouvert tous les jours\n" + 
				"Ouvert de 9h à 12h et de 14h à 17 du 1er octobre au 31 mars, dimanche et jours fériés OUVERT 0 10H, en  juillet-août tous les jours de 10h à 18h\n" + 
				"Ouvert de Pâques à la Toussaint vendredi, samedi, dimanche et jours fériés de 15h à 18 et en juillet-août du mercredi au lundi de 14h30 à 18h30\n" + 
				"Ouvert de juillet à septembre tous les jours de 10h à 12h et de 15h à 19h, mardi et dimanche de 15h à 19h, visites guidées à 15h30 et 17h, hors saison du lundi au vendredi de 14h à 17h, dimanches et jours fériés de 14h à 18h, visites guidées à 14h30 et 16\n" + 
				"Ouvert vendredi, samedi et dimanche de 10h à 12h et de 14h à 18h de novembre à mars et d'avril à octobre du mercredi au lundi de 10h à 12h et de 14h à 18h, en juillet-août du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert tous les jours de 10h à 12h et de 14h à 18h, en juillet-août tous les jours de 9h30 à 13h et de 14h à 19h\n" + 
				"Ouvert vendredi, samedi et dimanche de 10h à 12h et de 14h à 18h de novembre à mars et d'avril à octobre du mercredi au lundi de 10h à 12h et de 14h à 18h, en juillet-août du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert de mars à avril du mercredi au dimanche de 14h à 17h, de mai à juin du mercredi au lundi de 10h à 12h et de 14h à 18h, de juillet à août tous les jours de 10h à 12h30 et de 14h à 19h de septembre à octobre du mercredi au lundi de 10h à 12h et de 14\n" + 
				"Ouvert du 15 mai à fin juin mercredi et du vendredi au dimanche de 14h à 18h, du 1er juillet au 31 août tous les jours de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 15h à 18h du 1er avril au 31 octobre\n" + 
				"Ouvert du mardi au vendredi de 10h à 12h et de 14h à 18h, samedi, dimanche et jours fériés de 15h à 18h\n" + 
				"Ouvert du 15 avril au 15 octobre du mercredi au lundi de 14h30 à 18h30 et du 15 octobre au 14 avril  samedi et dimanche de 14h30 à 17h30\n" + 
				"Ouvert du mercredi au dimanche de 15h à 18h et sur endez-vous pour les groupes et les scolaires\n" + 
				"Ouvert d'avril à juin et de septembre à octobre du mardi au dimanche  de 10h à 12h et de 14h à 17h, en  juillet-août tous les jours de 10h à 13h et de 14h à 18h\n" + 
				"Ouvert du mardi au samedi de 10h à 12h et de 14h à 18h et le dimanche de 14h à 18h\n" + 
				"Ouvert du 1er novembre au 30 mars du mardi au samedi de 10h à 12h et de 14h à 18h, le dimanche de 14h à 18h, du 1er avril au 31 octobre du mardi au dimanche de 10h à 12h et de 14h à 18h, de  juillet à septembre tous les jours de 10h à 18h\n" + 
				"Ouvert de 15h à 18h du mercredi au lundi en juillet-août\n" + 
				"Ouverture du mardi au vendredi de 14h30 à 18h et le samedi de 14h30 à 18h30\n" + 
				"\n" + 
				"Ouvert de 14h à 17h30 du mercredi au dimanche de 14h à 17h30 et sur réservation les lundi et mardi\n" + 
				"Ouvert tous les jours de 9h à 12h et de 13h à 18h\n" + 
				"Ouvert du 5 mai au 30 septembre. Juin à août du jeudi au lundi de 14h à 18h,  en mai et septembre de 14h à 17h  du jeudi au lundi et de 14h à 18h le week-end\n" + 
				"Ouvert le dimanche de 15h à 18h d'avril à novembre, les autres jours toute l'année sur rendez-vous\n" + 
				"Ouvert du mercredi au dimanche de 10h à 12h et de 14h à 18h pour tous les publics et les lundis et mardis uniquement aux groupes sur réservation (8h30 à 12h30 et 14h à 18h)\n" + 
				"Salle d'exposition ouverte 20 jours en 2012 (septembre-décembre)\n" + 
				"Ouvert du mardi au vendredi de 10h à 12h30 et de 14h à 18h, samedi et dimanche de 10h à 18h\n" + 
				"Ouvert du mardi au vendredi de 14h à 16h, samedi et dimanche de 10h à 12h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Musée à quai ouvert de 10h à 12h45 et de 13h30 à 18h, en juillet-août tous les jours de 10h à 18h.  Le Musée à flot est ouvert le dimanche après-midi et pendant les vacances scolaires\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h15 et de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h15 et de 14h à 18h\n" + 
				"Ouvert le dimanche de 10h à 12h, et le premier dimanche du mois de 15h à 17h\n" + 
				"Ouvert de février à novembre du mardi au vendredi de 9h à 12h et de 14h à 18h, week-end et jours fériés de 14h30 à 18h30\n" + 
				"Ouvert du lundi, mercredi au vendredi de 14h à 17h, le week-end et jours fériés de 15h à 18h du 1er septembre au 30 juin et en juillet-août le lundi, mercredi au vendredi de 14h à 18h, le week-end et jours fériés de 10h à 12h et de 15h à 18h\n" + 
				"Ouvert mercredi, jeudi, samedi de 10h à 12h et 14h à 17h et le dimanche de 10h à 12h et 15h à 18h. Accueil de groupes les autres jours sur réservation\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h\n" + 
				"Ouvert de novembre à février du lundi au samedi de 13h à 19h, dimanche, vacances scolaires et jours fériés de 10h à 19h, de mars à mi-novembre tous les jours de 9h à 19h30. Accueil des groupes à partir de 8h sur réservation.\n" + 
				"Ouvert lundi de 14h à 18h, mercredi au dimanche de 10h à 12h30 et de 14h à 18h\n" + 
				"Ouvert en semaine de 9h à 12h et de 14h à 17h et le dimanche et jours fériés de 10h à 17h\n" + 
				"Ouvert le lundi de 14h à 18h, mercredi à dimanche de 10h à 18h\n" + 
				"Ouvert du mercredi au samedi de 14h à 17h d'avril à fin septembre, le 1er dimanche du mois visite à 15h30. Visite de groupes toute l'année sur réservation.\n" + 
				"\n" + 
				"Ouvert du mardi au jeudi de 11h à 18h, vendredi de 11h à 20h, samedi et dimanche de 13h à 18h\n" + 
				"Ouvert du 1er octobre au 31 mars, tous les jours, de 14h à 17h ; samedi, dimanche et jour férié de 10h à 12h30 et de 14h à 17h. Du 1er avril au 30 septembre, tous les jours, de 14h à 17h ; samedi, dimanche et jour férié de 10h à 12h30 et de 15h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h30 et de 13h30 à 18h\n" + 
				"Ouvert du mercredi au lundi de  13h à 18h\n" + 
				"Ouvert du mercredi au dimanche de 10h à 18h, le jeudi jusqu'à 20h, le lundi uniquement pour les groupes sur réservation\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du mercredi au lundi de 11h à 18h pour les individuels et pour les groupes de 9h30 à 18h. Samedi dimanche et jours fériés de 9h30 à 18h pour tous\n" + 
				"Ouvert du 1er septembre au 30 juin, le lundi de 15h à 18h, du mercredi au dimanche de 10h à 12h et de 15h à 18h, et en juillet-août du mercredi au lundi de 10h à 12h30 et de 14h à 18h\n" + 
				"Musée en restructuration, ouverture du lieu d'exposition en fonction de l'expositio du lundi au dimanche de 14h à 18h. Locaux administratifs et centre de documentation (accessible sur rendez-vous) ouvert tous les jours du lundi au vendredi de 9h à 17h\n" + 
				"\n" + 
				"Ouvert de 10h à 12h30 et de 14h à 17h30, le dimanche de 10 h à 12h30 et de 14h30 à 18h\n" + 
				"Ouvert du 2 novembre au 31 mars du mardi au samedi de 10h à 12h et de 14h à 17h, le dimanche de 14h à 17h et du 1er avril au 31 octobre du mardi au samedi de 10h à 12h et de 14h à 18h, le dimanche de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de janvier à mars de14h à 17h30, d'avril à décembre du mardi au samedi de 10h à 12h et de 14h à 17h30, le dimanche de 14h à 17h30\n" + 
				"Ouvert de janvier à juin et de septembre à décembre du mercredi au samedi de 14h à 17h, le dimanche de 14h30 à 17h30 et en juillet-août du mercredi au samedi de 10h à 12h et de 14h à 18h, le dimanche de 10h à 12h et de 14h30 à 18h30\n" + 
				"Ouvert le mercredi de 10h à 12h et de 15h à 18h et le samedi de 15h à 18h. Ouvert pour les groupes tous les jours sur rendez-vous\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h. En juillet-août de 10h à 12h30 et de 14h à 18h30\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 14h à 18h de décembre à janvie, de février à mi-avril et d'octobre à novembre de 10h à 12h et de 14h à 17h, d'avril à octobre de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mercredi au dimanche de 10h à 12h et de 14h à 18h, un jeudi par mois jusqu'à 20h, ouverture le lundi aux scolaires uniquement sur réservation\n" + 
				"\n" + 
				"Ouvert le lundi de 11h à 13h, le mercredi et samedi de 15h à 18h, dimanche de 11h à 12h30 et de 15h à 18h\n" + 
				"Ouvert du lundi au vendredi de 9h à12h et de 14h à 17h et le samedi de 9h à12h\n" + 
				"Ouvert tous les jours de février à décembre. Février, novembre et décembre de 10h à 12h30 et de 13h30 à 17h, mars et octobre de 9h30 à 12h30 et de 13h30 à 17h30, avril de 9h à 12h30 et de 13h30 à 18h, mai, juin à août de 9h à 19h, septembre de 9h à 18h. W\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Ouvert du 1er novembre au 31 mai du mercredi au lundi de 9h30 à 18h, tous les jours les autres mois de 9h30 à 18h\n" + 
				"Ouvert du mercredi au lundi de 9h30 à 18h\n" + 
				"Ouvert toute l'année du mardi au samedi\n" + 
				"Ouvert tous les jours de 9h à 19h\n" + 
				"Ouvert le mercredi toute l'année de 14h à 18h, et de Pâque à la Toussaint du lundi au vendredi de 14h à 18h\n" + 
				"Ouvert du 13 février au 31 mars et du 1er octobre au 30 novembre du mardi au vendredi de 14h30 à 17h30, samedi, dimanche de 10h à 12h et de 14h30 à 17h30, du 1er avril au 30 septembre du mardi au dimanche de 10h à 12h et de 14h à 18h30\n" + 
				"Ouvert du 10 février au 14 mars et du 1er octobre au 31 décembre 2012 le lundi et du mercredi au vendredi de 14h30 à 17h30, le week-end de 10h à 12h et de 14h30 à 17h30, du 7 juillet au 30 septembre tous les jours de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du 1er jeudi d'avril au dernier dimanche de septembre de 10h à 12h et de 14h à 18h. Accueil des groupes sur rendez-vous\n" + 
				"Ouvert le 1er jeudi d'avril au dernier dimanche de septembre de 10h à 12h et de 14h à 18h du mardi au dimanche. Accueil des groupes sur rendez-vous\n" + 
				"Fermé pour travaux depuis 2011\n" + 
				"Ouvert du mercredi au lundi de février à juin, septembre et du 15 au 31 octobre de 11h à 18h, en juillet-août tous les jours de 10h à 19h, en novembre samedi et dimanche de 14h à 18h\n" + 
				"Ouvert en avril samedi et dimanche de 10h à 12h30 et de 15h à 18h, de mai à octobre du mercredi au dimanche de 10h à 12h30 et de 15h à 18h, en novembre et décembre suivant les expositions du mercredi au dimanche de 10h à 12h30 et de 15h à 18h\n" + 
				"Ouvert de la mi-mars à la mi-novembre tous le sjours de 10h à 12h30 et de 14h à 18h\n" + 
				"Ouvert du 15 octobre au 15 avril du lundi au vendredi de 9h30 à 12h30 et de 13h30 à 17h30, du 16 avril au 14 octobre du lundi au vendredi de 9h30 à 12h30 et de 13h30 à 18h, le samedi de 10h30 à 12h30 et de 14h à 17h\n" + 
				"Ouvert du 1er Mai au 30 Septembre, tous les Week-ends et jours fériés de 10 h à 12 h et 14 h à 18 h\n" + 
				"Ouvert du 21 mars au 1er juin et du 1er septembre au 4 octobre du lundi au vendredi de 14h à 17h30, samedi, dimanche et jours fériés de 11h à 13h et de 14h à 17h30, du 4 juillet au 31 août de 11h à 13h et de 14h à 18h\n" + 
				"Ouvert de février à juin et de septembre à décembre, lundi, mardi, jeudi, vendredi de 9h à 17h, samedi, dimanche de 10h à 18h, juillet-août tous les jours de 10h à 18h\n" + 
				"Ouvert de février à mars, en avril et octobre du mercredi au dimanche de 10h à 18h, en mai et juin de 10h à 18h, en juillet-août de 10h à 19h, en novembre et décembre uniquement le week-end de 10h à 18h en septembre de 10h à 18h\n" + 
				"Ouvert samedi, dimanche de 10h à 12h30 et de 14h à 18h, mercredi, jeudi, vendredi (le matin sur rdv) de 14h à 18h. En juillet/août du mercredi au dimanche de 10h à 12h30 et de 14h à 18h.\n" + 
				"Ouvert de juin à septembre du mardi au dimanche de 10h à 12h30 et de 14h à 18h\n" + 
				"Ouvert tous les jours du 1er avril au 15 octobre de 10h à 12h (12h30 l'été) et de 14h à 18h (18h30 l'été)\n" + 
				"Ouvert du 1er juillet au 31 août du mercredi au lundi\n" + 
				"Ouvert du 1er avril au 15 novembre de 11h à 18h,  tous les jours de juin à août\n" + 
				"Ouvert de mai à septembre du mardi au dimanche de 14h à 18h, et d'octobre à avril du mardi au dimanche de 14h à 18h\n" + 
				"Ouvert de mai à septembre du mardi au samedi de 10h à 12h et de 14h à 18h, dimanche de 14h à 18h et d'octobre à avril du mardi au dimanche de 14h à 18h\n" + 
				"Ouvert de mai à septembre du mardi au samedi de 10h à 12h et de 14h à 18h, et dimanche de 14h à 18h, et d'octobre à avril du mardi au dimanche de 14h à 18h\n" + 
				"Ouvert de 10h à 12h et de 14h à 17h, juillet-août tous les jours de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du lundi au vendredi de 13h30 à 17h30 et deux dimanches du mois de 15h à 18h lors des expositions\n" + 
				"Ouvert de juin à septembre du mardi au dimanche de 11h à 18h, d'octobre à mai du mercredi au dimanche de 14h à 18h\n" + 
				"Ouvert du 1er avril au 30 septembre du mercredi au lundi de 10h à 12h et de 14h à 18h et du 1er octobre au 31 mars mercredi, samedi et dimanche de 14h à 18h\n" + 
				"Musée ouvert en fonction des expositions. En 2011 du 14 mai au 25 septembre tous les jours de 10h à 18h30\n" + 
				"Ouvert de novembre à février du jeudi au dimanche de 14h à 18h, de mars à mai et octobre du mercredi au dimanche de 14h à 18h, de juin à septembre du mercredi au vendredi de 10h à 12h et de 14h à 18h, le samedi et le dimanche de 14h à 18h, les jours férié\n" + 
				"Ouvert du mercredi au dimanche de 14h à 18h, sur rendez-vous le matin\n" + 
				"Ouvert du 1er juin au 15 septembre tous les jours de 14h à 18h\n" + 
				"Ouvert d'avril à juin et de septembre à octobre du mercredi au lundi de 13h à 18h et en juillet-août du mercredi au lundi de 11h à 18h. Ouvert les jours fériés\n" + 
				"D'avril à septembre tous les jours de 10h à 18h, d'octobre à mars les weeks-ends et vacances scolaires (l'après-midi).\n" + 
				"ouvert de juin à début juillet les week-end ainsi que du 1er au 15 septembre, juillet-août tous les jours. Ouvert toute l'année pour les groupes sur rendez-vous\n" + 
				"Ouvert du 1er avril au 14 juin et du 15 au 30 septembre de 14h à 17h du mercredi au lundi, du 15 juin au 14 septembre de 11h à 17h, le dimanche de 14h à 17h, durant les vacances de la Toussaint de 14h à 17h\n" + 
				"Ouvert du mercredi au samedi de 10h à 12h30 et de 14h à 18h30, le mardi de 14h à 18h30 et un dimanche sur deux de 14h à 18h30\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h, et tous les jours en juillet/août\n" + 
				"Ouvert du lundi au vendredi de 10h à 12h et de 14h à 18h, week-end de 14h à 18h\n" + 
				"Ouvert d'avril à octobre le mardi, mercredi, samedi et dimanche de 14h à 18h\n" + 
				"Ouvert d'avril à juin et septembre samedi, dimanche et jours fériés de 15h à 18h, juillet-août tous les jours de 15h à 18h, octobre à mars sur rendez-vous pour les groupes\n" + 
				"Ouvert du 15 juin au 15 septembre du mardi au dimanche de 14h à 18h  et samedi de 10h à 12h et les journées du patrimoine\n" + 
				"Ouvert toute l'année d'avril à septembre de 10h30 à 18h30 et d'octobre à mars de 10h30 à 18h en semaine et le W.E. de 14h à 18h\n" + 
				"Ouvert de juillet à septembre de 12h à 18 h du mercredi au lundi. Visites de groupes sur rendez-vous hors périodes\n" + 
				"Ouvert du mardi au dimanche du 18 septembre au 21 juin de 14h à 17h30 et du 23 juin au 16 septembre de 11h à 18h\n" + 
				"Ouvert de mars à novembre du mercredi au dimanche de 14h à 18h - ouvert le 14 juillet et 15 août\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 14h à 18h du 1er février au 15 novembre, et sur rdv pour les groupes\n" + 
				"Ouvert du mercredi au lundi de 14h à 18h, visite sur rendez-vous le matin\n" + 
				"Ouvert du mercredi au lundi de 14h à 18h, pour les scolaires jeudi et vendredi sur rendez-vous pour les visites guidées et ateliers pédagogiques\n" + 
				"Ouvert de mai à septembre lundi, mercredi, jeudi, vendredi  de 14h à 17h30 et samedi, dimanche de 10h à 12h30 et de 14h à 18h, d'octobre à avril mercredi, vendredi de 14h à 18h, samedi dimanche de 10h à 12h30 et de 14h à 18h\n" + 
				"Ouvert du mardi au vendredi d'avril à septembre de 10h30 à 18h le week-end de 14h30 à 17h30 et d'octobre à mars du mardi au dimanche de 14h à 17h\n" + 
				"\n" + 
				"Ouvert en mai-juin-septembre samedi et dimanche de 14h à 18h, en juillet-août de 9h à 12h du mercredi au samedi uniquement sur réservation et de 14h à 18h, de février à novembre du mardi au vendredi de 9h à 12h uniquement sur réservation\n" + 
				"Ouvert en été mercredi, jeudi, vendredi, dimanche de 14h30 à 18h30, le samedi de 10h à 12h et de 14h30 à 18h30. En hiver le mardi, mercredi, jeudi, vendredi de 14h à 18h\n" + 
				"Ouvert en février, mars, octobre, novembre tous les week-end de 14h à 17h30 et en avril,mai, juin et septembre du mercredi au lundi de 14h à 18h et en juillet-août de 14h à 18h30\n" + 
				"Ouvert du 1er juin  au 30 septembre tous les jours de 10h à 12h et de 14h à 18h et du 1er octobre au 31 mai du mercredi au lundi de 10h à 12h et de 14h à 17h, 18h le dimanche\n" + 
				"Ouvert du mardi au dimanche de 14h à 18h, pour les groupes sur réservation du lundi au samedi de 10h à 12h\n" + 
				"Ouvert du 15 mars au dimanche qui suit la Toussaint, de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert de janvier à juin et de septembre à décembre  du mercredi au lundi de 10h à 12h et de 14h à 17h30, juillet-août tous les jours de 10h à 19h\n" + 
				"\n" + 
				"Ouvert de juin à septembre du mercredi, samedi, dimanche de 15h à 18h, en juillet-août du mercredi au dimanche et d'octobre à ma, les mercredis, samedis et dimanches de 15h à 18h\n" + 
				"Ouvert du 15 avril au 31 décembre. Du 15 avril au 1er novembre tous les jours de 11h à 12h30 et de 13h30 à 18h et le mercredi de 14h à 18h, du 2 novembre au 14 avril le vendredi, samedi et dimanche de 11h à 12h30 et de 13h30 à 18h\n" + 
				"Ouvert le lundi et du mercredi au vendredi de 11h à 18h  le samedi et dimanche de 11h à 19h\n" + 
				"Ouvert lundi, jeudi, vendredi, samedi et dimanche de 11h à 12h30 et de 13h30 à 18h, le mercredi de 14h à 18h\n" + 
				"Ouvert lundi, jeudi et vendredi de 10h à 12h30 et de 13h30 à 18h, le mercredi de 14h à 18h et le samedi et dimanche de 10h30 à 12h30 et de 13h30 à 18h\n" + 
				"Ouvert du mardi au dimanche de 9h30 à 12h et de 14h à 18h\n" + 
				"Ouvert du mercredi au samedi de 10h à 12h30 et de 14h à 18h, le dimanche de 14h à 18h (17h30 du 1er octobre au 31 mars)\n" + 
				"Ouvert de novembre à avril du mercredi au lundi de 14h à 18h et de mai à octobre tous les jours de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert lundi, mercredi au samedi de 10h à 12h30 et de 14h à 17h (18h du 1er avril au 1er octobre), dimanche de 14h à 17h30 (18h30 du 1er avril au 1er octobre)\n" + 
				"Ouvert tous les jours du 1er avril au 31 octobre de 9h à 12h30 et de 14h à 18h le week-end de 14h à 18h et du 2 novembre au 31 mars de 9h à 12h30 et de 14h à 17h le dimanche de 14h à 17h\n" + 
				"Ouvert d'avril à mi-juin et de mi-septembre à fin octobre les dimanches de 15h à 18h, de mi-juin à mi-septembre du mardi au dimanche de 15h à 18h et sur rendez-vous toute l'année\n" + 
				"Ouvert du lundi au vendredi d'avril à juin et septembre à octobre de 9h à 18h, le week-end de 12h à 18h sauf octobre, juillet-août du lundi au vendredi de 9h à 18h30, le week-end de 10h à 18h30, novembre à mars du lundi au vendredi de 9h à 18h\n" + 
				"Ouvert tous les jours de 13h30 à 18h\n" + 
				"Ouvert mardi au samedi de 13h30 à 17h30, dimanche de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 13h et de 14h à 18h\n" + 
				"Ouvert de 10h à 18h du mercredi au lundi\n" + 
				"Ouvert le mardi de 10h à 18h, du mercredi au samedi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 13h et de 14h à 18h\n" + 
				"Ouvert lundi et du  mercredi au vendredi de 10h à 12h30 et de 13h30 à 17h45, samedi, dimanche de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 14h à 17h30. Ouvert tous les jours de 9h à 12h et de 14h à 17h30 pour les scolaires\n" + 
				"Ouvert en juillet-août du mercredi au dimanche de 14h à 18h, le matin uniquement sur réservation et de septembre à juin du mardi au dimanche de 14h à 18h et les samedis 9h à 12h et sur réservation le matin\n" + 
				"Ouvert du 1er juin au 30 septembre du mardi au dimanche de 10h à 12h et de 14h à 18h, du 1er octobre au 31 décembre et du 16 février au 31 mai du mercredi au dimanche de 14h30 à 18h. Toute l'année sur réservation pour les groupes\n" + 
				"Ouvert lundi, mercredi à samedi de 10h à 12h30 et de 14h à 18h, dimanche de 14h à 18h (17h30 du 1er octobre au 31 mars)\n" + 
				"Ouvert d'avril à juin, et septembre du lundi après-midi au samedi de 9h à 12h30 et de 14h à 18h et d'octobre à mars du mardi au samedi de 9h à 12h30 et de 14h à 17h30, en juillet-août du lundi après-midi au samedi de 9h à 12h45 et de 13h30 à 18h30\n" + 
				"Fermé pour travaux\n" + 
				"Ouvert du mardi au vendredi de 14h à 18h et samedi de 14h à 17h30\n" + 
				"Ouvert du 31 mars au 30 juin et du 1er septembre au 31 octobre de 10h à 12h et de 14h à 18h et en juillet-août tous les jours de 10h30 à 13h et de 14h à 18h30\n" + 
				"\n" + 
				"Ouvert d'avril à septembre du lundi après-midi au dimanche de 10h à 12h30 et de 14h30 à 19h, en octobre de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du 1er avril au 15 juin et du 15 septembre au 11 novembre du dimanche au vendredi de 14h à 18h et du 15 juin au 15 septembre de 10h à 18h\n" + 
				"Ouvert du mercredi au lundi  de 10h à 18h\n" + 
				"La Chapelle de l'Oratoire est ouverte du mercredi au lundi de 10h à 18h,  du 15 juin au 19 août ouvert du mardi au dimanche de 10h à 19h, nocturne le jeudi jusqu'à 20h. La HAB Galerie est ouverte du 19 octobre au 6 janvier du mercredi au dimanche de 13h30\n" + 
				"Ouvert du 1er janvier au 30 juin et du 1er septembre au 31 décembre de 10h à 18h et en juillet-août tous les jours de 10h à 19h\n" + 
				"Le jardin est ouvert tous les jours de 8h30 à 17h30 jusqu'en décembre 2012\n" + 
				"Ouvert d'avril à septembre du lundi au dimanche et sur réservation pour les groupes en dehors des périodes d'ouverture. D'avril à juin de 14h30 à 18h30 - de juillet à mi-septembre de 10h30 à 13h et de 14h30 à 18h30\n" + 
				"Ouvert d'avril à septembre du lundi au dimanche et sur réservation pour les groupes en dehors des périodes d'ouverture. D'avril à juin de 14h30 à 18h30 - de juillet à mi-septembre de 10h30 à 13h et de 14h30 à 18h30\n" + 
				"Ouvert d'avril à septembre du lundi au dimanche et sur réservation pour les groupes en dehors des périodes d'ouverture. D'avril à juin de 14h30 à 18h30 - de juillet à mi-septembre de 10h30 à 13h et de 14h30 à 18h30\n" + 
				"Ouvert en février, mars du mercredi au dimanche de 14h à 18h, en avril, juin tous les jours de 10h à 12h30 et de 14h à 18h, juillet-août tous les jours de 10h à 19h, septembre, octobre tous les jours de 10h à 12h30 et de 14h à 18h, octobre-décembre mercre\n" + 
				"\n" + 
				"Ouvert du 1er octobre au 31 mai du mardi au dimanche de 10h à 12h et de 14h à 18h (collections permanentes) et de 10h à 18h (expositions temporaires), du 1er juin au 30 septembre tous les jours de 10h à 18h30\n" + 
				"Ouvert du 1er octobre au 31 mai du mardi au dimanche de 10h à 12h et de 14h à 18h, du 1er juin au 30 septembre tous les jours de 10h à 18h30\n" + 
				"Ouvert du 1er octobre au 31 mai  du mardi au dimanche de 10h à 12h et de 14h à 18h, du 1er juin au 30 septembre tous les jours de 10h à 18h30\n" + 
				"Ouvert du mardi au dimanche de 14h à 18h. Le matin pour les groupes sur réservation\n" + 
				"Ouvert du 11 avril au 10 juin et du 10 septembre au 4 novembre du mercredi au dimanche de 14 à 18h et du 11 juin au 9 septembre  tous les jours de 10h à 12h30 et de 13h30 à 18h\n" + 
				"Ouvert du 31 mars au 14 juin et du 17 septembre au 21 octobre les week-end et jours fériés de 14h30 à 18h, du 15 juin au 16 septembre et du 27 octobre au 7 novembre du mardi au dimanche de 11h à 13h et de 14h30 à 18h\n" + 
				"Ouvert du mercredi au dimanche de 10h à 12h et de 14h à 18h, en juillet-août ouverture supplémentaire le mardi. Ouvert tous les jours pour les groupes\n" + 
				"Ouvert du mercredi au dimanche de 10h à 12h et de 14h à 18h, en juillet-août tous les jours de 10h à 12h et de 14h à 18h. Ouvert pour les groupes tous les jours sauf le lundi matin\n" + 
				"Ouvert du 31 mars au 14 juin et du 16 septembre au 1er novembre les week-ends et jours fériés de 14h30 à 18h et du 15 juin au 15 septembre du mardi au dimanche de 11h à 13h et de 14h30 à 18h\n" + 
				"Ouvert du 1er avril  au 30 juin et du 1er septembre au 11 novembre du mercredi au vendredi de 14h30 à 17h30 et  le week-end  et jour férié de 14h30 à 18h30. Du 1er juillet au 31 août tous les jours de 11h à 13h et de 15h à 19h. Toute l'année sur réservati\n" + 
				"Ouvert du mardi au dimanche et les lundi fériés de 10h à 13h et de 14h à 17h30 du 30 mars au 14 juin et du 16 septembre au 3 novembre (basse saison)  et du 15 juin au 15 septembre tous les jours de 10h à 18h30 (haute saison)\n" + 
				"Ouvert du 15 février au 30 juin et du 1er septembre au 30 novembre du mardi au vendredi  de 10h à 12h et de 14h à 17h et week-end, et jours fériés et vacances scolaires de 14h30 à 18h30, en juillet-août du mardi au dimanche et jours fériés de 10h à 12h et\n" + 
				"Ouvert en juillet août de 14h30 à 18h30 du mardi au dimanche. Ouvert pour les groupes sur rendez-vous toute l'année\n" + 
				"Ouvert d'avril à juin les jours fériés de 14h à 18h, de juillet à septembre tous les vendredis et jours fériés de 14h à 18h. Ouvert toute l'année sur rendez-vous\n" + 
				"Ouvert du 1er avril au 30 septembre tous les jours de 10h à 19h et du 1er octobre au 31 mars tous les jours de 14h à 18h. Ouvert toute l'année pour les groupes sur réservation\n" + 
				"Ouvert le lundi de 14h à 18h, du mardi au vendredi de 9h30 à 12h30 et de 13h30 à 18h, le samedi de 9h30 à 12h30 en juillet-août\n" + 
				"Ouvert d'octobre à fin avril de 9h30 à 12h30 et de 13h30 à 17h du jeudi au mardi, en mai, juin et septembre tous les jours de 9h à 12h30 et de 13h30 à 18h, en juillet-août de 9h à 18h tous les jours\n" + 
				"Ouvert du 1er juin au 30 septembre du mardi au samedi de 10h à 12h et de 14h à 18h, dimanche, 14 juillet et 15 août de 14h à 18h, du 1er octobre au 31 mai du mardi au samedi de 9h30 à 12h30 et de 13h30 à 19h et le matin sur rdv (groupes & écoles), le dima\n" + 
				"Ouvert tous les jours de 10h à 12h et de 14h à 18h pour les individuels et du lundi au vendredi de 9h à 12h et de 13h30 à 17h30 pour les groupes\n" + 
				"Ouvert d'octobre à février de 10h à 12h30 et de 14h à 17h, de mars à mai de 10h à 12h30 et de 14h à 18h et de juin à septembre de 10h à 19h\n" + 
				"Ouvert dimanche et jours fériés en mai, juin, septembre, octobre, du mercredi au dimanche et jours fériés en juillet-août de 14h à 17h30. Pour les groupes toute l'année sur réservation\n" + 
				"\n" + 
				"Ouvert du mardi au dimanche de 14h à 18h d'octobre à mai et de juin à septembre du mardi au dimanche de 10h à 12h30 et de 14h à 18h\n" + 
				"Ouvert du lundi au vendredi de 9h à12h et de 14h à 18h, dimanche de 14h à 18h\n" + 
				"Ouvert du 1er septembre au 30 juin du mardi au samedi de 9h à 12h et de 14h à 18h, dimanche et jours fériés de 10h à 12h30 et de 14h à 18h en juillet-août du mardi au dimanche de 10h à 12h30 et de 14h à 18h30\n" + 
				"Ouvert de novembre à Pâques du mercredi au lundi de 10h à 12h30 et de 14h30 à 18h30, et de Pâques à la Toussaint tous les jours de 10h à 19h\n" + 
				"Ouvert le mercredi de 10h à 12h et de 15h à 17h (ou en fonction des demandes\n" + 
				"Ouvert en février-mars et octobre à décembre  le mercredi, samedi et dimanche de 14h à 18h, d'avril à juin et septembre du mardi au dimanche de 14h à 19h, en juillet-août tlj de 10h à 19h\n" + 
				"Ouvert du 1er octobre au 30 avril les mercredi, samedi et dimanche de 14h30 à 18h, et du 2 mai au 30 septembre du mardi au dimanche de 14h30 à 18h\n" + 
				"Ouvert du 9 février au 30 avril et du 22 septembre au 9 novembre du mardi au samedi de 14h à 18h le dimanche et jours fériés de 15h à 18h, du 1er mai au 30 juin, 1er septembre au 21 septembre tlj de 10h à 19h, dimanche et jours fériés de 14h à 19h. Juille\n" + 
				"Ouvert du mardi au dimanche du 1er avril au 30 juin et du 1er septembre au 31 octobre et tous les jours en juillet-août\n" + 
				"Ouvert du mardi au samedi de 13h à 18h. Visites commentées et accueil des groupes du mardi au vendredi de 9h à 12 h et de 13 h à 17 h (sur Rendez-vous)\n" + 
				"Ouvert du lundi au jeudi de 8h30 à 12h30 et de 13h30 à 17h et en juillet-août tous les jours de 8h30 à 12h30 et de 13h30 à 17h\n" + 
				"Ouvert du mardi au dimanche de 10h à 19h du 1er avril au 30 septembre, et de 10h à 18h du 1er octobre au 31 mars, en juillet-août tous les jours de 10h à 19h\n" + 
				"Ouvert du mardi au dimanche du 15 juin au 30 septembre du mardi au dimanche  de 13h à 19h et du 1er octobre au 14 juin du mardi au dimanche de 14h30 à 17h30\n" + 
				"Ouvert tous les jour du mercredi au lundi de 10h à 12h et 14h et 18h au mois de mai\n" + 
				"Ouvert du 15 avril au 15 octobre de 9h30 à 12h et de 14h à 18h et du 16 octobre au 14 avril de 10h à 12h et de 14h à 17h\n" + 
				"\n" + 
				"Ouvert en 2012 du 11 février au 8 avril de 14h à 18h, du 9 avril au 8 mai de 11h à 18h, du 9 mai au 17 juin de 11h à 18h, du 18 juin au 18 septembre de 10h à 19h et du 19 septembre au 6 novembre de 13h à 18h\n" + 
				"De février à mars du lundi au vendredi de 14h à 18h, avril du mardi au dimanche, et jours fériés de 14h à 18h, mai, juin et septembre du lundi au samedi de 10h à 12h et de 14h à 18h, dimanches et jours fériés de 15h à 19h, juillet-août du lundi au samedi\n" + 
				"Ouvert d'avril à juin, en septembre du mercredi au dimanche de 14h à 18h, en juillet-août tous les jours de 10h à 19h30 et le samedi de 14h à 19h30\n" + 
				"\n" + 
				"Ouvert du mardi au dimanche de 9h30 à 12h et de 14h à 17h30\n" + 
				"Ouvert mercredi et jeudi de 14h à 17h. Ouvert sur rendez-vous pour les groupes scolaires\n" + 
				"Ouvert de septembre à juin du mardi au dimanche et jours fériés de 10h à 18h,  en juillet-août tous les jours de 10h à 18h. Visite guidée individuelle à 10h30, 14h30, 16h30\n" + 
				"Ouvert lundi, mardi, jeudi, vendredi, samedi de 13h30 à 16h30, les matins, les mercredis et dimanches sur rendez-vous\n" + 
				"Ouvert en semaine pair mercredi et jeudi de 8h à 12h et de 14h à 18h, vendredi, samedi, dimanche de 14h à 18h et en semaine impair lundi, jeudi vendredi de 8h à 12h et de 14h à 18h, samedi et dimanche de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche 1er juin au 30 septembre de 11h à 18h et du 1er octobre au 31 mai de 14h à 18h et le matin sur rendez-vous\n" + 
				"Uniquement sur rendez-vous. Ouvert à l'occasion de la nuit des musees et durant les journees europeennes du patrimoine\n" + 
				"Ouvert du 1er avril au 31 octobre du lundi au vendredi de 14h à 18h, le week-end et jours fériés de 14h30 à 18h30\n" + 
				"Ouvert du mercredi au  lundi de 14h à 18h. Accueil des scolaires le matin sur rendez-vous\n" + 
				"Ouvert lundi, mercredi, jeudi et vendredi de 10h à 12h et de 14h à 17h (18h en juillet-août), le samedi de 10h à 12h et de 14h à 18h, le dimanche de 14h à 18h\n" + 
				"Ouvert du 1er octobre au 31 mars du lundi au vendredi de 9h à 12h et de 14h à 17h, week-end et jours fériés de 14h à 18h  du 1er avril au 30 septembre du lundi au vendredi de 9h à 12h et de 14h à 18h, week-end et jours fériés de 14h à 19h\n" + 
				"Ouvert du mardi au samedi de 9h à 12h et de 14h à 18h, le dimanche de 14h30 à 18h30\n" + 
				"Ouvert du 15 octobre au 15 avril du lundi midi au samedi midi de 9h à 12h30 et de 13h30 à 17h30, du 15 avril au 30 juin et du 4 septembre au 15 octobre du lundi midi au samedi midi de 9h à 12h30 et de 13h30 à 18h et en juillet-août du mardi au samedi de 9\n" + 
				"Ouvert du mercredi au lundi de 14h à 17h, dimanche de 14h à 18h\n" + 
				"Musée fermé au public\n" + 
				"Ouvert du lundi au dimanche de 10h à 12h et de 14h à 18h et du 1er juillet au 30 septembre de 10h à 18h\n" + 
				"Le 3ème Week-end d'avril à octobre 10h à 12h et de 14h à 18h et sur rendez-vous pour les visites guidées\n" + 
				"Ouvert de mars à octobre du mardi au samedi de 9h à 12h et de 14h à 18h et dimanche de 14h à 18h, de novembre à février du mardi au samedi de 9h à 12h et de 14h à 17h et dimanche de 14h à 17h\n" + 
				"Voir musée national de Compiègne\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h Entre 12h30 et 13h30 les appartements de l'Empereur et de l'Impératrice sont uniquement accessibles en visite commentée sans supplément\n" + 
				"Ouvers de mars à octobre du mardi au dimanche de 9h à 12h et de 14h à 18h, de novembre à février du mardi au dimanche de 9h à 12h et de 14h à 17h\n" + 
				"Ouvert du mercredi au samedi 14h à 17h avec des visites guidées obligatoires à 14h, 15h et 16h, le dimanche à 14h30 à 17h30. Pour les groupes le mardi, et mercredi, jeudi, vendredi et samedi le matin sur rendez-vous\n" + 
				"Ouvert du mercredi au lundi du dernier week-end de mars au 11 novembre de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 14h30 à 18h30 avec visite guidée à 15h, 16h ou 17h Accueil des groupes le mardi et le matin en semaine\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h, 17h du 1er novembre au 31 mars\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h, 17h du 1er novembre au 31 mars\n" + 
				"Ouvert lundi, jeudi, vendredi de 10h à 12h et de 14h à 18h, mercredi de 14h à 18h, samedi, dimanche et jours fériés de 11h à 13h et de 14h à 18h\n" + 
				"Ouvert mardi de 14h à 18h, mercredi,  jeudi, vendredi de 10h à 12h et de 14h à 18h, samedi, dimanche et jours fériés de 11h à 13h et de 14h à 18h\n" + 
				"Ouvert du 1er mai au 30 septembre tous les jours de 14h à 19h, et du 1er octobre au 30 mars les samedis, dimanches et vacance de zone B de 14h à 18h30\n" + 
				"Ouvert du mercredi au lundi de 14h à 18h. Pour les groupes, autres horaires possibles sur rendez-vous du lundi au vendredi matin\n" + 
				"Ouvert tlj du 19 mars au 29 avril et du 1er octobre au 18 novembre de 14h à 18h. Week-end et jours fériés de 10h à 12h et de 14h à 18h. Du 30 avril au 30 septembre tlj de 10h à 18h du 24 novembre au 16 décembre, vendredi, xeek-end de 14h à 18h\n" + 
				"\n" + 
				"\n" + 
				"Ouvert mardi, vendredi, samedi de 10h à 12h et de 14h à 18h, mercredi de 10h à 18h, jeudi de 10h à 12h et de 14h à 21h, dimanche de 14h à 19h\n" + 
				"Ouvert du mardi au vendredi de 14h à 17h, sur rendez-vous le matin, le samedi et le premier dimanche du mois de 10h à 12h et de 14h à 17h.\n" + 
				"Ouvert tous les jours de 10h à 18h\n" + 
				"Ouvert du mardi au vendredi de 14h à 17h30, le samedi de 9h à 12h et de 14h à 16h30. Le matin sur rendez-vous les mercredi jeudi et vendredi\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"\n" + 
				"Ouvert du 1er septembre au 30 juin du mardi au vendredi de 10h à 12h et de 14h à 18h, samedi et dimanche de 14h à 18h et du 1er juillet au 30 août du mardi au dimanche de 12h à 18h30\n" + 
				"Ouvert de septembre à juin du mardi au vendredi de 10h à 18h, samedi, dimanche et jours fériés de 14h à 18h,  en juillet-août de 10h à 19h, samedi, dimanche, 14 juillet et 15 août de 14h à 19h\n" + 
				"Ouvert en juillet-août du mardi au dimanche de 10h à 18h30, en mai, juin et septembre du mardi au vendredi de 11h à 18h et samedi et dimanche de 13h à 18h, d'octobre à avril du mardi au dimanche de 14h à 17h30\n" + 
				"Ouvert en juillet-août du mercredi au lundi de 10h à 18h30, en mai, juin et septembre lundi, mercredi au vendredi de 11h à 13h et de 14h à 18h, le samedi et dimanche, de 13h à 18h, d'octobre à avril du mercredi au lundi de 14h à 17h30\n" + 
				"Ouvert en juillet-août tous les jours de 10h à 18h, durant les vacances scolaires (toutes zones) et en septembre tous les jours de 10h à 12h30 et de 13h30 à 18h, de mai à juin et octobre (hors vacances) mercredi, samedi et dimanche de 14h à 18h\n" + 
				"Ouvert tous les samedis, dimanches et jours fériés de 14h30 à 17h30 hors saison, durant les vacances scolaires toutes zones du mardi au dimanche de 14h30 à 17h30, du 1er juin au 15 septembre de 10h à 12h et de 15h à 18h30 et le lundi après-midi\n" + 
				"Ouvert du 1er avril au 30 septembre tous les jours de 9h30 à 12h et de 14h à 18h, du 1er au 31 octobre du mercredi au lundi de 9h30 à 12h et de 14h à 18h, du 1er novembre au 31 mars du mercredi au lundi de 9h30 à 12h et de 14h à 17h\n" + 
				"Ouvert du 22 juin au 30 septembre du lundi au samedi de 14h à 18h, et sur rendez-vous en dehors de la saison\n" + 
				"Ouvert d'octobre à mi mai du mardi au vendredi de 9h à 18h, samedi dimanche et jours fériés de 14h à 18h, 1er samedi du moi de 14h à 21h, 1er dimanche du mois de 9h à 18h, et de mi-mai à septembre du mardi au vendredi de 10h à 19h, samedi dimanche et jour\n" + 
				"Ouvert du 1er octobre au 30 juin le lundi, mercredi, jeudi, vendredi de 9h30 à 12h30 et de 13h30 à 17h, week-end de 14h à 18h et du 1erjuillet au 30 septembre de 10h à 13h et de 13h45 à 18h, week-end de 14h à 18h\n" + 
				"Ouvert du 1er octobre au 30 juin le lundi, mercredi, jeudi, vendredi de 9h30 à 12h30 et de 13h30 à 17h, week-end de 14h à 18h et du 1erjuillet au 30 septembre de 10h à 13h et de 13h45 à 18h, week-end de 14h à 18h\n" + 
				"Ouvert du 1er octobre au 30 juin le lundi, mercredi, jeudi, vendredi de 9h30 à 12h30 et de 13h30 à 17h, week-end de 14h à 18h et du 1erjuillet au 30 septembre de 10h à 13h et de 13h45 à 18h, week-end de 14h à 18h\n" + 
				"Ouvert du 16 septembre au 30 juin sauf vacances de Pâques, du lundi au vendredi de 9h0 à 12h0 et de 14h à 18h, le samedi de 9h30 à 12h30, du 1er juillet au 15 septembre et pendant les vacances de Pâques (pour toutes les zones) du lundi au vendredi de 9h0\n" + 
				"Ouvert de février à mai et d'octobre à décembre de 9h30 à 11h30 (groupes) de 14h à 16h (individuel)\n" + 
				"Ouvert du 1er février au 14 juin et du 1er octobre au 31 décembre du mardi au vendredi de 10h30 à 12h30 et de 14h à 18h et le week-end de 14h à 18h. Du 15 juin au 30 septembre  du mardi au vendredi de 10h30 à 12h30 et de 14h à 19h et le week-end de 14h à\n" + 
				"Ouvert tous les jours d'octobre à avril de 13h30 à 18h30 et de mai à juin de 10h à 18h30, de juillet à septembre de 10h à 20h pour l'Hôtel de Cheusses. Visites guidées à 10h30 - Visites découvertes (30 mn) pour l'Ancienne école (14h, 15h, 16h)\n" + 
				"Ouvert de mi septembre à mi juin du mercredi au vendredi de 14h à 18h samedi et dimanche et jours fériés de 15h à 18h30, et de mi juin à mi septembre du mardi au dimanche et jours fériés de 10h30 à 12h30 et de 14h30 à 19h, nocturne le samedi à 20h\n" + 
				"Ouvert du 1er octobre au 31 mars de 14h à 17h, du 1er avril au 30 juin, et septembre de 14h à 18h, juillet-août de 10h à 19h\n" + 
				"Ouvert du 1er avril au 30 septembre du mardi au samedi de 10h à 12h30 et de 13h30 à 18h, le dimanche et jours fériés de 14h à 18h, du 1er octobre au 31 mars du mardi au dimanche de 14h à 17h, jours fériés de 14h à 17h\n" + 
				"\n" + 
				"Ouvert du 1er avril au 30 septembre du mardi au samedi de 10h à 12h30 et de 13h30 à 18h, le dimanche et jours fériés de 14h à 18h, du 1er octobre au 31 mars du mardi au dimanche de 14h à 17h, jours fériés de 14h à 17h\n" + 
				"Ouvert du 1er avril au 30 septembre du mardi au samedi de 10h à 12h30 et de 13h30 à 18h, le dimanche et jours fériés de 14h à 18h, du 1er octobre au 31 mars du mardi au dimanche de 14h à 17h, jours fériés de 14h à 17h\n" + 
				"Ouvert du 1er novembre au 31 mars du mardi au dimanche de 14h à 18h, du 1er avril au 30 juin et du 1er septembre au 31 octobre tous les jours de 10h à 12h et de 14h à 18h,  juillet-août tous les jours de  10h à 19h\n" + 
				"Ouvert le dimanche en janvier de 13h à 17h30, et de février à avril et d'octobre à décembre le mardi, jeudi et vendredi de 10h à 13h à 17h30 et le mercredi, samedi et dimanche de 13h à 17h30, et de mai à septembre de 10h à 18h30, le mercredi de 13h à 18h3\n" + 
				"Ouvert samedi et dimanche de 14h à 18h. Pour les scolaires visites sur rendez-vous\n" + 
				"Ouvert du mardi au dimanche de 10h à 17h du 16 septembre au 30 avril et de 10h à 18h du 1er mai au 15 septembre\n" + 
				"\n" + 
				"Ouvert du mardi au dimanchei de 10h à 12h30 et de 14h à 18h du 1ermai au 15 septembre et de 10h à 12h30 et de 14h à 17h du 16 septembre au 30 avril (musée ouvert ponctuellement lors de expositions temporaires ou pendant les vacances scolaires)\n" + 
				"Ouvert du mercredi au vendredi de 10h à 12h et de 14h à 18h, le dimanche de 14h30 à 18h\n" + 
				"\n" + 
				"Ouvert en avril, mai et octobre les week-ends et jours fériés de 14h30 à 18h30, du 1er juin au 30 septembre du mercredi au lundi de 14h30 à 18h30. Visite guidée sur rdv toute l'année\n" + 
				"\n" + 
				"Ouvert du 1er février au 30 juin et du 17 septembre au 31 décembre du mercredi au dimanche de 14h à 18h, du 1er juillet au 16 septembre  du mercredi au lundi de 10h à 12h et de 14h à 18h. Ouverture le lundi toute la journée, du mercredi au samedi le matin\n" + 
				"Ouvert de novembre à mars samedi et dimanche de 14h à 18h, du 1er avril au 14 juin et 1er septembre au 31 octobre tous les jours 14h à 18h, du 15 juin au 31 août du lundi au vendredi de 10h à 12h30 et de 14h30 à 18h30, le samedi de 14h30 à 18h30, le diman\n" + 
				"Ouvert en juillet-août du lundi au samedi de 9h30 à 12h30 et de 14h à 18h, le reste de l'année mardi, vendredi de 9h30 à 12h30 et de 14h à 18h samedi de 9h30 à 12h30 de mars à juin, septembre et novembre lundi et jeudi de 9h30 à 12h30 et de 14h à 18h\n" + 
				"Ouvert mercredi, samedi et dimanche de 15h à 18h, vacances de Pâques, juillet-août du mercredi au lundi de 15h à 18h\n" + 
				"Ouvert de janvier à mars, d'octobre à décembre le mercredi et samedi de 10h à 12h et de 14h à 17h, d'avril à juin et septembre mercredi et samedi de 10h à 12h et de 14h à 17h et jeudi, vendredi et dimanche de 14h à 17h, en juillet-août du mardi au dimanch\n" + 
				"\n" + 
				"Ouvert du 1er octobre au 31 mai le mardi de 10h à 17h, du mercredi au vendredi de 10h à 12h et de 13h15 à 17, le samedi et dimanche de 14h à 18h, du 1er juin au 30 septembre du mardi au vendredi de 10h à 12h et de 13h15 à 18h, le samedi et dimanche de 10h\n" + 
				"\n" + 
				"\n" + 
				"Ouvert du 1er avril au 30 septembre de 10h30 à 12h30 et de 15h à 18h du mercredi au lundi, juillet-août tous les jours, du 1er octobre au 31 mars de 14h30 à 16h30\n" + 
				"Ouvert du mardi au vendredi de 9h30 à 18h30, samedi, dimanche, lundi et certains  jours fériés de 14h à 18h30\n" + 
				"Ouvert du mercredi au samedi de 14h30 à 18h\n" + 
				"Ouvert du mercredi au lundi du 1er avril au 30 septembre de 11h à 19h et du 1er octobre au 31 mars de 13h30 à 17h30\n" + 
				"Ouvert 3 jours par semaine, lundi, mercredi et vendredi de 15h à 18h uniquement en été\n" + 
				"Ouvert tous les jours de février à avril, octobre à 15 décembre de 14h à 18h, en mai et septembre de 10h à 19h, de  juin à août de 10h à 20h\n" + 
				"Ouvert tous les jours en juillet-août de 10h à 12h30 et de 14h à 19, d'avril à octobre du mercredi au lundi de 10h à 12h30 et de 14h à 18h, de novembre à décembre et de février à mars de 14h à 17h les week-ends et vacances scolaires zone B\n" + 
				"Ouvert en février-mars de 10h à 18h, avril à juin de 10h à 19h, juillet-août tous les jours de 10h à 20h, septembre de 10h à 19h, octobre à mi-décembre de 10h à 18h\n" + 
				"Ouvert le mardi 10h, jeudi et samedi 18h du 15 juin au 15 septembre (3 visites commentées de collections par semaine). Ouvert toute l'année sur rendez-vous pour les groupes sauf en juillet-août\n" + 
				"Ouvert en juillet-août du mardi au samedi de 10h à 12h et de 14h à 18h30\n" + 
				"\n" + 
				"Ouvert du 16 septembre au 14 juin de 10h à 12h et de 14h à  18h, du  15 juin au 15 septembre de 10h à 18h. Nocturnes en juillet et août le mercredi et le vendredi jusqu’à 20h\n" + 
				"Ouvert du mardi au dimanche du 16 septembre au 14 juin de 10h à 13h et de 14h à 17h et du 15 juin au 15 septembre de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert de 10h à 17h de novembre à avril et de 10h à 18h de mai à octobre\n" + 
				"Ouvert de juillet à septembre de 10h à 18h du mardi au dimanche. En hiver de 10h à 18h les jeudi et vendredi et de 14h à 18h les mercredi, samedi et dimanche\n" + 
				"Ouvert de novembre à avril du mercredi au lundi de 10h à 12h et de 14h à 17h, fermeture à 18h de mai à octobre\n" + 
				"Ouvert de novembre à avril du mercredi au lundi de 10h à 12h et de 14h à 17h fermeture à 18h de mai à octobre\n" + 
				"Ouvert d'octobre à mars de 10h30 à 13h15 et de 14h15 à 16h45, d'avril à mai de 10h30 à 13h15 et de 14h15 à 17h45, de juin à septembre ouvert tous les jours de 10h à 17h45\n" + 
				"Ouvert d'octobre à mars de 10h à 13h et de 14h à 17h, d'avril à juin et septembre de 10h à 13h et de 14h à 18h, juillet-août tous les jours de 10h à 19h\n" + 
				"Ouvert de mai à septembre (été) de 10h à 19h et d'octobre à avril (hiver) de 11h à 18h\n" + 
				"Ouvert de mai à septembre de 10h à 19h et octobre à avril de 11h et 18h\n" + 
				"Ouvert de mai à septembre (été) de 10h à 19h et d'octobre à avril (hiver) de 11h à 18h\n" + 
				"Ouvert du mardi au dimanche de la mi-octobre à mi-avril de 10h à 18h et de mi-avril à mi-octobre de 11h à 20h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert de novembre à avril de 10 h à 17 h et de mai à octobre de 10 h à 18 h\n" + 
				"Ouvert de 10h à 18h du mercredi au lundi\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h\n" + 
				"Ouvert de mai à mi-octobre de 10h à 18h et de mi-octobre à avril de 10h à 17h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10 h à 18 h\n" + 
				"Ouvert le mercredi  de 15h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h. Ouvert le lundi pour les groupes\n" + 
				"Ouvert de mai à septembre du mardi au dimanche de 10h à 12h et 14h à 18h, d'octobre à avril du mardi au vendredi de 10h  à 12h et 14h à 18h sur rendez-vous le week-end\n" + 
				"Ouvert du 2 mai au 15 octobre de 10h à 18h30 et du 16 octobre au 30 avril de 10h à 17h\n" + 
				"Ouvert du 15 juin au 14 septembre de 10h à 12h15 et de 14h à 18h - du 15 septembre au 14 juin de 10h à 12h15 et de 14h à 17h\n" + 
				"Ouvert Du 15 juin au 15 septembre de 10h à 12h et de 14h à 18h et du 16 septembre au 14 juin de 10h à 12h et de 14h à 17h - en juillet-août de 10h à 12h30 et de 14h à 18h30\n" + 
				"Ouvert d'octobre à mai de 10h à 12h et de 14h à 17h30, et de juin à septembre de 10h à 12h et de 15h à 18h30, en juillet-août de 10h à 12h et de 14h30 à 19h\n" + 
				"Ouvert du mercredi au lundi de 13h30 à 17h du 16 octobre au 15 avril, de 10h à 12h30 et de 13h30 à 18h du 16 avril au 15 octobre\n" + 
				"Ouvert du 15 avril au 15 octobre du mercredi au lundi de 10h à 18h et du 16 octobre au 14 avril de 13h à 17h\n" + 
				"Ouvert hors expo du mardi au dimanche de 12h à 18h d’octobre à mai, de 11h à 19h de juin à septembre Pendant expo Picasso Cézanne : tous les jours de 9h à 19h, les jeudi de 12h à 23h + le samedi jusqu’à 20h en août et septembre\n" + 
				"Ouvert du mardi au samedi de 14h à 17h. Visite de groupe de préférence le matin sur rdv\n" + 
				"Ouvert du 15 avril au 15 octobre de 10h à 18h et du 16 octobre au 14 avril de 13h  à 17h\n" + 
				"Ouvert de lundi à dimanche de 10h à 12h et de 14h à 17h jusqu'à 18h de juin à septembre\n" + 
				"Ouvert tous les jours de 10h à 12h et de 13h à 17h\n" + 
				"Ouvert d'octobre à mars du mercredi au lundi de 10h à 12h30 et de 13h à 17h et d'avril à septembre de 9h à 12h30 et de 13h à 18h\n" + 
				"Ouvert en septembre, avril et mai de 9h30 à 12h et de 14h à 17h30 d'octobre à mars de 9h30 à 12h et de 14h à 16h30 de juin à août de 9h30 à 12h30 et de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de juillet à septembre de 10h à 19h et d'octobre à juin de 10h à 12h30 et de 14h à 18h30\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h\n" + 
				"Ouvert du 1er octobre au 31 mai, les mercredi, samedi et dimanche de 10h à 12h et de 14h à 18h, du 1er juin au 30 septembre  mardi, mercredi vendredi samedi dimanche de 10h à 12h et de 15h à 19h\n" + 
				"Ouvert d'octobre à mai du mercredi au samedi de 10h à 12h30 et de 14h30 à 17h30 et de juin à septembre du mercredi au samedi de 10h à 12h30 et de 14h à 18h\n" + 
				"Ouvert de 9h à 18h tous les jours du 1er février au 31 décembre\n" + 
				"Ouvert du lundi au samedi du 1er avril au 30 septembre de 14h à 18h et du 1er octobre au 31 mars de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de septembre à juin de 15h à 18h et en  juillet-août de 16h à 19h, pour les jours fériés se renseigner\n" + 
				"Ouvert le samedi de 10h à 12h et les 2 derniers dimanches de chaque mois de 15h à 18h Sur demande et rendez-vous les autres jours. Tous les jours pendant les expositions de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert en juillet et tous les mercredis\n" + 
				"Ouvert sur rendez-vous téléphonique ou en fonction des horaires affichés du jeudi au dimanche de 11h à 17h30 de fin janvier à mars, d'avril à octobre de 11h à 13h et de 13h30 à 18h, de novembre à mi-décembre de 11h à 17h30\n" + 
				"Ouvert du mardi au dimanche d'avril à septembre de 9h30 à 11h30 et de 13h à 18h et d'octobre à mars de 10h à 11h30 et de 13h à 16h30. En hiver visites sur rdv, sauf pendant le W-E et les vacances scolaires\n" + 
				"Ouvert du mardi au dimanche de 10h à 17h du 1er octobre au 31 mai et de 11h à 18h du 1er juin au 30 septembre\n" + 
				"Ouvert du 1er octobre au 31 mai de 10h à 17h et du 1er juin au 30 septembre de 11h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 17h du 1er octobre au 31 mai, de 11h à 18h du 1er juin au 30 septembre\n" + 
				"Ouvert du lundi au samedi de 12h à 19h\n" + 
				"Ouvert du mardi au vendredi de 9h à 12h et de 13h à 17h\n" + 
				"Ouvert du mardi au dimanche  de 10h à 17h d'octobre à mai et de 11h à 18h de juin à septembre\n" + 
				"Ouvert du mardi au dimanche de 10h à 17h du 1er octobre au 31 mai et de 11h à 18h du 1er juin au 30 septembre\n" + 
				"\n" + 
				"Ouvert du 1er octobre au 31 mai du mardi au dimanche de 10h à 17h et du 1er juin au 30 septembre du mardi au dimanche de 11h à 18h\n" + 
				"Ouvert du 1er octobre au 31 mai du mardi au dimanche de 10h à 17h, et du 1er juin au 30 septembre du mardi au dimanche de 11h à 18h\n" + 
				"\n" + 
				"Ouvert tous les jours de 10h à 17h du 01/10 au 31/05 et de 11h à 18h du 01/06 au 30/09\n" + 
				"Ouvert du mardi au dimanche de 10h à 17h\n" + 
				"Ouvert du mardi au dimanche de 11h à 18h de juin à septembre et de 10h à 17h d'octobre à mai\n" + 
				"Ouvert du mercredi au lundi de 11h à 19h en été et de 11h à 18h en hiver\n" + 
				"Ouvert du 1er septembre au 30 juin du mercredi au dimanche de 14h30 à 18h30, en juillet-août du mercredi au lundi de 10h à 12h et de 14h30 à 18h30. Pour les groupes tous les jours sur réservation.\n" + 
				"Ouvert tous les jours de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert  les premiers dimanches de chaque mois de 15h à 18h et de mai à septembre du mardi au vendredi de 15h à 18h sur rendez-vous pour les groupes\n" + 
				"Ouvert mardi, jeudi et vendredi de 14h à 17h. Samedi après-midi activités culturelles et mercredi après-midi atelier Boutis. Possibilité d'ouverture les autres jours sur rendez-vous\n" + 
				"Ouvert en 2012 de mars à mai de 10h à 12h30 et de 14h à 18h\n" + 
				"Ouvert d'octobre à mai du mardi au samedi  de 13h à 17h30 , de juin à septembredu mardi au dimanche  de 10h à 18h. Ouvert en nocturne tous les mardis de juillet et d'août de 19h à 22h.\n" + 
				"\n" + 
				"Ouvert du mardi au dimanche du 16 avril au 30 septembre de 9h30 à 12h et de 14h à 18h et du 1er octobre au 15 avril de 13h30 à 18h\n" + 
				"Ouvert du mardi au dimanche du 16 avril au 30 septembre de 9h30 à 12h et de 14h à 18h et du 1er octobre au 15 avril de 13h30 à 18h\n" + 
				"\n" + 
				"Ouvert lundi, mercredi au vendredi de 14h à 17h, samedi et dimanche de 14h à 18h du 1er septembre au 30 juin et du 1er juillet au 31 août tous les jours de 10h à 12h et de 14h à 18h y compris les jours fériés\n" + 
				"\n" + 
				"Ouvert du mardi au samedi de 10h à 12h et de 14h30 à 17h30  d'octobre à mai, de 10h à 12h et de 15h30 à 18h30 de juin à septembre, le dimanche de 10h à 12h\n" + 
				"Ouverture du mercredi au samedi d'avril à septembre de 9h à 12h et de 14h30 à 18h, dimanche de 9h à 12h et de 15h à 18h et d'octobre à mars de 10h à 12h et de 14h30 à 17h\n" + 
				"Ouvert du lundi au samedi de 9h à 12h et de 14h à 18h\n" + 
				"\n" + 
				"Ouvert du mardi au samedi de 8h à 12h et de 14h à 18h du 1er octobre au 31 mars et du mardi au samedi du 1er avril au 30 septembre de 8h à 12h et de 14h à 18h et le dimanche et jours fériés de 14h à 18h\n" + 
				"Ouvert du dimanche au mercredi de 9h à 12h et de 13h30 à 17h30, le jeudi pour les groupes sur demande\n" + 
				"Ouvert du 15 avril au 14 octobre du mardi au dimanche de 9h30 à 12h30 et de 14h à 18h, du 15 octobre au 14 avril du mardi au dimanche de 9h30 à 12h30 et de 14h à 17h\n" + 
				"Ouvert de juin à septembre de 10h à 12h et de 14h à 18h du lundi au vendredi  et d'octobre à mai de 14h à 18h le dimanche et lundi, et du mercredi au vendredi\n" + 
				"Les salles d'expositions : du mercredi au dimanches + jours fériés de 10h à 12h et de 14h à 17h30 pour la Rotonde, et en hiver de 10h à 12h et de 16h à 17h30 et en été de 10h à 12h et de 16h à 19h du mercredi au dimanche pour la Tour des Templiers\n" + 
				"Ouvert du mardi au samedi de 12h à 18h\n" + 
				"Ouvert du mardi au samedi de 9h à 12h et de 14h à 18h\n" + 
				"Ouvert de décembre à juin du mercredi au lundi de 10h à 12h et de 14h à 18h, de juillet à septembre tous les jours de 10h à 12h et de 14h à 18h, en octobre du mecredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mardi au samedi de 10h à 12h et de 14h à 17h30,  visite à 10h, 14h et 16h\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h de septembre à juin et tous les jours en juillet-août\n" + 
				"Ouvert du mardi au dimanche de 12h à 18h\n" + 
				"Ouvert du mardi au dimanche de 9h à 18h\n" + 
				"Ouvert du 1er octobre au 31 mai  du mardi au samedi de 10h à 12h et de 14h à 17h30, du 1er juin au 30 septembre le lundi et du mercredi au samedi de 10h à 12h et de 15h à 18h30, le dimanche de 15h à 19h\n" + 
				"Ouvert du mercredi au lundi de 10h à 13h et de 14h à 18h\n" + 
				"Ouverture du musée Calvet de 10h à 13h et de 14h à 18h du mercredi au lundi et du musée Lapidaire du mardi au dimanche de 10h à 13h et de 14h à 18h\n" + 
				"Ouvert du mardi au samedi du 1er octobre au 31 mai de 10h à 13h et de 14h à 18h, du 1er juin au 30 septembre de 10h à 18h. Ouverture exclusive le lundi pour les scolaires\n" + 
				"Ouvert du 1er avril au 30 septembre du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du 1er avril au 30 septembre du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"\n" + 
				"\n" + 
				"Ouvert du 2 mai au 30 septembre de 14h à 18h, et sur rendez-vous en hiver\n" + 
				"Ouvert du 2 mai au 30 septembre de 9h30 à 12h30 et de 14h30 à 18h30 - En octobre de 9h à 12h et de 14h à 17h - Du 1er novembre au 3o avril de 9h à12h  et de 14h à 17h.  La synagogue est ouverte en période d’hiver de 9h à 12h et de 14h à 17h (sauf mardi et\n" + 
				"Ouvert tous les jours de 10h30 à 12h et de 14h  à 18h\n" + 
				"Ouvert du mercredi au lundi du 1er avril au 31 mai de 10h à 12h et de 14h à 18h, du 1er juin au 30 septembre de 10h à 18h, du 1er au 15 octobre de 10h à 12h et de 14h à 18h, du 16 au 31 octobre et durant les vacances de la Toussaint de 10h à 12h et de 14h\n" + 
				"Ouvert d'avril à mai de 10h à 12h et de 14h à 18h, de juin à septembre de 10h à 12h30 et de 13h30 à 18h, 1ère quinzaine d'octobre de 10h à 12h et de 14h à 18h, 2ème quinzaine d'octobre à la fin des vacances de Toussaint de 10h à 12h et de 14h à 17h\n" + 
				"\n" + 
				"Ouvert d'avril au 18 mai deux après-midi par semaine et du 18 mai au 31 octobre du mercredi au lundi 2h le matin et 3h l'après-midi\n" + 
				"Ouvert en janvier, février, novembre, décembre de 9h30 et 16h30, mars, octobre de 9h30 à 17h30, avril, mai, septembre de 9h à 18h, de juin à août de 9h à 19h\n" + 
				"Ouvert en juillet à août du lundi au samedi de 15h à 18h\n" + 
				"Ouvert de novembre à février de 10h à 12h et de 14h à 17h, de mars à octobre de 10h à 12h30 et de 14h à 17h30, d'avril et mai de 9h30 à 18h, de juin à septembre de 9h30 à 18h30\n" + 
				"Ouvert lundi, mercredi au dimanche après-midi d'avril à octobre de 10h à 12h et de 15h à 18h, de novembre à mars de 10h à 12h et de 14h à 17h\n" + 
				"Ouvert du mardi au dimanche de 9h30 à 17h30, à partir du 7 décembre 2010, ouvert du lundi au dimanche de 9h30 à 17h30\n" + 
				"Ouvert du mardi au dimanche 9h30 à 17h30\n" + 
				"Ouvert du mardi au dimanche et jours fériés de 9h30 à 17h30\n" + 
				"Ouvert du mardi au dimanche et les jours fériés de 9h30 à 12h30 et de 13h30 à 17h30\n" + 
				"Ouvert le lundi de 12h à 18h et du mardi au dimanche de 10h à 18h\n" + 
				"\n" + 
				"Ouvert tous les jours du 1er octobre au 31 mars de 9h à 12h et de 14h à 17h, du 1er avril au 30 juin de 9h à 12h30 et de 14h à 18h, du 1er juillet au 30 septembre de 9h à 18h\n" + 
				"Ouvert le jeudi de 14h à 18h de mai à septembre\n" + 
				"Ouvert en basse saison mi-septembre à mi-juin le mardi 14 à 18h, mercredi au vendredi de 9h à 12h et de 14h à 18h, le samedi de 9h à 12h, en haute saison mi-juin à mi-septembre du mardi au samedi de 9h à 12h et de 14h à 18h\n" + 
				"Ouvert  de 10h à 18h jours fériés compris\n" + 
				"Ouvert du 1er mai au 1er octobre de 10h à 13h et de 14h à 18h du mardi au lundi, du 2 octobre au 30 avril du mercredi au lundi sur réservation de 8h30 à 12h30 et de 14h à 18h\n" + 
				"Ouvert d'octobre à juin du mardi au samedi de 14h à 18h et de juillet à septembre du lundi au samedi de 14h à 18h\n" + 
				"Ouvert de 10h à 12h et de 14h à 18h tous les jours de mai à septembre et le week-end de mars à octobre\n" + 
				"Ouvert d'avril à novembre du mercredi au lundi de 14h à 18h. Sur rendez-vous pour les groupes\n" + 
				"Ouvert du 1er mars au 15 novembre du mercredi au lundi de 10h à 18h\n" + 
				"De mi-mai au 11 juillet le samedi et le dimanche de 15h à 17h, du 12 juillet à mi-septembre le vendredi, samedi et dimanche de 15h à 17h. Visite de groupes sur demande toute l'année\n" + 
				"Musée fermé pour rénovation\n" + 
				"Ouvert  du 1er avril au 1er novembre de 10h à 13h et de 14h à 18h\n" + 
				"\n" + 
				"Ouvert en juillet-août tous les jours de 14h30 à 18h et de septembre à juin mercredi, samedi et dimanche de 14h30 à 18h\n" + 
				"Ouvert tous les mercredis de 14h à 18h de septembre à juin, et du lundi au vendredi de 10h à 12h30 et de 16h à 19h en juillet-août\n" + 
				"Fermé en 2012\n" + 
				"\n" + 
				"Ouvert mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du 1er avril au 31 octobre du mercredi au dimanche de 14h à 18h, en juillet -août tous les jours de 10h à 19h. Visites exceptionnelles durant les vacances de février, Toussaint et Noël. Visite guidée toute l'année pour les groupes sur rendez-vous\n" + 
				"Ouvert du 20 mars au 31 mai et du 1er septembre au 10 novembre du jeudi au mardi de 14h à 18h, en juin et septembre tous les jours de 14h à 18h, en juillet-août tous les jours de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert d'avril à septembre le mercredi et samedi de 14h à 17h, en juillet à août du lundi au samedi de 15h à 18h, du 1er novembre au 31 mars sur réservation pour les groupes et scolaires\n" + 
				"Ouvert tous les jours de 9h30 à 12h et de 14h à 18h\n" + 
				"\n" + 
				"Ouvert du 1er mai au 31 octobre de 14h30 à 18h30 du dimanche au vendredi. En dehors de ces périodes sur réservation pour les groupes de plus de 15 personnes\n" + 
				"Ouvert en mai, juin septembre du mardi au samedi de 10h à 18h, en juillet-août du lundi au samedi de 10h à 18h, toute l'année dimanche et jours fériés de 14h30 à 18h, janvier à avril et octobre à décembre du mardi au samedi de 10h à 17h\n" + 
				"Ouvert du mardi au samedi de 14h30 à 18h, le premier dimanche du mois de 14h30 à 18h\n" + 
				"\n" + 
				"Ouvert d'octobre à mars week-end de 10h à 12h30 et de 14h à 17h, d'avril à juin et septembre tous les jours de 10h à 12h30 et de 14h à 17h, en juillet-août tous les jours de 10h à 18h\n" + 
				"Ouvert tous les jours de 10h à 18h de juin à septembre et du mercredi au lundi de 10h à 12h et de 14h à 17h d'octobre à mai\n" + 
				"Ouvert du mercredi au lundi de 14h à 19h et de 10h à 12h et de 14h à 19h pendant les vacances scolaires, tous les jours de 10h à 12h et de 14h à 19h\n" + 
				"Ouvert du 15 mars au 15 octobre de 9h30 à 12h et de 14h à 18h\n" + 
				"Ouvert en juin, septembre, octobre de 9h à 11h et de 14h à 18h, en juillet-août de 10h à 12h et de 15h à 19h\n" + 
				"Ouvert du lundi au samedi de 9h à 12h et de 13h30 à 17h30 en juillet août. Hors saison du lundi au samedi de 9h à 12h, les lundi mercredi et samedi de 13h30 à 17h30\n" + 
				"Ouvert du 30 mars au 11 novembre 2012 du mercredi au dimanche de 14h30 à 18h, en juillet août tous les jours de 10h30 à 12h30 et de 15h à 18h30, ouvert le 14 juillet et le 15 août.\n" + 
				"Ouvert du 15 juin au 15 septembre du mardi au vendredi de 10h à 18h week-end et jours fériés de 14h à 18h et du 16 septembre au 14 juin week-end et jours fériés et petites vacances scolaires de 14h à 18h. Tous les jours sur réservation pour les groupes\n" + 
				"Ouvert de mi-mai à mi-septembre du dimanche au vendredi de 14h à 18h et en juillet-août tous les jours de 14h à 18h. Accueilde groupes sur réservation du lundi au vendredi hors période d'ouverture\n" + 
				"Ouvert du lundi au vendredi (samedi en août) de 10h à 12h et de 14h à 18h (19h à partir de décembre)\n" + 
				"Ouvert lundi, jeudi vendredi de 10h à 12h et de 14h à 18h, samedi, dimanche de 14h à 18h\n" + 
				"Ouvert du mardi au dimanche de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert de mai à septembre tous les jours de 14h à 18h et d'octobre à avril du lundi au vendredi de 14h à 17h. Toute l'année sur réservation.\n" + 
				"Ouvert le lundi et du mercredi au vendredi de 14h à 18h, samedi, dimanche de 14h à 19h\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h30\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h et du 1er juin au 31 août de 10h à 19h\n" + 
				"Ouvert du 1er septembre au 30 juin de 9h à 18h, samedi et dimanche de 10h à 18h, mardi de 13h30 à 18h, en juillet-août de 10h à 19h, mardi de 13h30 à 19h\n" + 
				"\n" + 
				"Ouvert du mardi au vendredi de 9h15 à 12h et de 13h30 à 17h30 eh hiver et 18h en été, samedi, dimanche et jours fériés de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi du 1er octobre au 31 mai de 10h à 18h et du 1er juin au 30 septembre de 10h à 19h\n" + 
				"Ouvert tous les jours du 1er avril au 1er novembre de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de mai à octobre de 13h à 18h30, sur rdv pour les groupes de novembre à avril, accueil du public scolaire et des groupes toute l'année sur réservation\n" + 
				"Ouvert du 1er juin au 30 septembre du mercredi au lundi de 10h à 18h, jusqu'à 19h le dimanche du 1er juin au 30 septembre\n" + 
				"Ouvert du 1er septembre au 30 juin de 10h à 12h30 et de 13h30 à 18h, en juillet-août de 10h à 12h30 et de 13h30 à 19h\n" + 
				"Ouvert de mai à septembre de 10h à 18h30 et d'octobre à novembre de 13h30 à 18h en semaine de 10h à 18h et les W.E. et jours fériés\n" + 
				"Ouvert du mardi au dimanche de 9h30 à 13h et de 14h à 18h d'avril à octobre et du mardi au vendredi de 9h30 à 12h30 et de 14h à 17h, le samedi et dimanche de 13h30 à 17h30 de novembre à mars\n" + 
				"Ouvert du mardi au dimanche de 9h30 à 13h et de 14h à 18h d'avril à octobre et du mardi au vendredi de 9h30 à 12h30 et de 14h à 17h, le samedi et dimanche de 13h30 à 17h30 de novembre à mars\n" + 
				"Ouvert du mardi au dimanche de 9h30 à 13h et de 14h à 18h d'avril à octobre et du mardi au vendredi de 9h30 à 12h30 et de 14h à 17h, le samedi et dimanche de 13h30 à 17h30 de novembre à mars\n" + 
				"Ouvert d'avril à octobre de 10h à 12h30 et de 13h30 à 18h, de novembre à mars de 10h à 12h30 et de 13h30 à 17h\n" + 
				"Ouvert du mardi au dimanche de 14h à 18h\n" + 
				"Ouvert tous les jours de février à novembre de 10h à 12h et de 14h à 18h. Sur réservation pour les groupes de décembre à janvier\n" + 
				"Ouvert de mars à mi-juin et de mi-septembre à décembre du mardi au dimanche de 14h à 18h et en  juillet-août tous les jours de 10h à 13h et de 14h à 19h\n" + 
				"Ouvert de mars à mi-juin et mi-septembre à décembre du mardi au dimanche de 14h à 18h et en  juillet-août tous les jours de 10h à 13h et de 14h à 19h\n" + 
				"Ouvert du mercredi au lundi de 14h à 18h et en juillet-aôut tous les jours de 14h à 18h, dimanche et jours fériés de 14h30 à 18h30, ouvert le matin sur rendez-vous pour les groupes à partir de 10 personnes\n" + 
				"Ouvert toute l'année de 14 h à 18 h\n" + 
				"Ouvert du mardi au vendredi de 14 h à 18 h + le second dimanche du mois de 14h à 18h\n" + 
				"\n" + 
				"Ouvert du mercredi au lundi de 14 h à 18 h et tous les jours pour les groupes sur rendez-vous\n" + 
				"Ouvert les mardi et vendredi de 14h à 17h et les  mercredis et samedis de 9 h à 12 h et de 14 h à 17 h\n" + 
				"\n" + 
				"\n" + 
				"Ouvert lundi, mercredi au vendredi de 10h à 12h et de 14h à 18h, samedi de 10h à 18h, dimanche de 14h à 18h\n" + 
				"\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h. Ouvert le mardi pour les groupes scolaires\n" + 
				"Ouvert du mercredi au lundi de 9h à 12h15 et de 14h à 19h\n" + 
				"Ouvert du mardi au samedi de 14 h 30 à 18 h\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h\n" + 
				"Ouvert d'avril à septembre tous les jours de 10h à 19h, d'octobre à novembre et du 16 au 31 mars tous les jours de 10h à 13h et de 14h à 17h et de décembre au 15 mars samedi et dimanche de 10h à 13h et de 14h à 17h. Visite guidée du lundi au vendredi sur\n" + 
				"Ouvert du lundi au vendredi de 8h30 à 12h et de 13h30 à 17h30\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h, le week-end de 14h à 18h\n" + 
				"Ouvert tous les jours de 14h à 18h. Ouverture possible le matin pour les groupe\n" + 
				"Ouvertdu mardi au dimanche et jours fériés de mars à octobre de 14h30 à 18h30 et tous les jours de septembre à avril de 14h30 à 18h30\n" + 
				"Ouvert du mardi au dimanche en mars/avril, octobre/novembre de 10h à 12h et de 14h30 à 18h, de mai à septembre tous les jours de 9h30 à 12h30 et de 14h30 à 18h30, fermeture à 19h en juillet-août\n" + 
				"Ouvert du mercredi au dimanche de 11h à 18h, les groupes sur réservation du mardi au dimanche de 9h à 17h30\n" + 
				"Ouvert du mercredi au dimanche de 9h30 à 12h et de 14h à 18h pour les individuels. Tous les jours sur rdv de 9h à 12h et de 14h à 18h pour les groupes sauf lundi matin\n" + 
				"Ouvert  du mardi au dimanche de 10h à 12h et de 14h à 17h30\n" + 
				"Fermé pour travaux\n" + 
				"Ouvert du mardi au dimanche de 10h à 17h30\n" + 
				"Ouvert du mercredi au lundi de 10h à 18h, vendredi de 10h30 à 18h\n" + 
				"Ouvert du mardi au dimanche de 10 h à 18 h\n" + 
				"Ouvert du mercredi au samedi de 13h à 18h, dimanche de 10h à 12h et de 13h à 18h (local d'information pendant les travaux)\n" + 
				"Ouvert du mercredi au vendredi de 9h à 12h et de 14h à 17h, les autre jours ouvert sur réservation pour les groupes\n" + 
				"Ouvert du mercredi à vendredi de 9h à 17h30, samedi et dimanche de 9h30 à 18h. Le mardi sur réservation pour les groupes de 9h à 17h30\n" + 
				"Espace d'information ouvert du mardi au samedi de 13h à 18h, le dimanche de 10h à 12h et de 13h à 18h\n" + 
				"Ouvert du mercredi au dimanche de 11h à 18h30\n" + 
				"Ouvert du mardi au dimanche et les lundis fériés de 9h à 18h, en juillet et août  de 10h à 19h\n" + 
				"Ouvert du mardi au dimanche de 10h à 18h et de 10h à 17h de novembre à mars\n" + 
				"Ouvert durant les travaux uniquement lors des journées du patrimoine de 14h à 18h\n" + 
				"Ouvert le mercredi de 13h30 à 18h, jeudi et vendredi de 10h à 12h30 et de 13h30 à 18h, samedi et dimanche de 14h30 à 18h\n" + 
				"Ouvert du lundi au samedi en juillet-août de 10h à 12h et de 14h à 18h, le reste de l'année visite guidée sur demande\n" + 
				"\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 13h30 à 18h\n" + 
				"Ouvert du 1er juin au 30 septembre tous les jours de 10h à 12h et de 14h à 19h et du 1er octobre au 31 mai de 14h à 18h\n" + 
				"\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Fermé en 2009. Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h\n" + 
				"Ouvert du mercredi au lundi de 10h à 12h et de 14h à 18h. Fermeture à 16h30 du 1er octobre au 31 mars\n" + 
				"Ouvert du mardi au vendredi, lematin sur rdv pour les groupes et de 14h à 17h30, le samedi de 14h à 17h30\n" + 
				"Ouvert du lundi au samedi de 9h à 12h et de 14h à 18h\n" + 
				"Ouvert samedi et dimanche de 10h à 12h et de 13h30 à 17h du 1er juin au 30 septembre, sur rendez-vous hors saison estivale + Nuit Blanche\n" + 
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
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("owl/split/ho.txt"), "utf-8"));

			for (String k : map.keySet()){
				String toAdd = "###  http://www.musee.com/ontologies/musee.owl#HO_"+map.get(k)+"\n\n";
				toAdd += ":HO_"+map.get(k)+" rdf:type owl:NamedIndividual ;\n\n";
				toAdd += "    :aHoraireOuverture \""+k+"\" .\n\n\n\n";
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
				System.out.println("HO_"+map.get(i));
		}*/

	}

}
