package genowl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FermAnnu {

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

		String tmp = "Novembre à avril\n" + 
				"Novembre à mi-avril\n" + 
				"\n" + 
				"1er janvier, dimanche de Pâques, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er janvier, dimanche de Pâques, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"5 semaines de fermeture annuelle après le 8 janvier. 1er janvier, vendredi Saint, 1er mai, 1er novembre, les 24 et 25 décembre\n" + 
				"\n" + 
				"1er janvier, vendredi saint, 1er mai, 1er novembre, 24 et 25 décembre\n" + 
				"1er janvier, vendredi saint, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, vendredi saint, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, vendredi saint, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"1er janvier, vendredi saint, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, Vendredi Saint, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, vendredi saint, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, vendredi saint, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"1er janvier, vendredi saint, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, vendredi Saint, dimanche de Pâques, 1er mai, dimanche de Pentecôte, 1er novembre, 24, 25, 31 décembre\n" + 
				"Janvier (hors vacances scolaires),  25 décembre\n" + 
				"\n" + 
				"Janvier, les 24, 25, 26 et 31 Décembre et jours fériés\n" + 
				"\n" + 
				"\n" + 
				"Du 24 décembre au 28 février\n" + 
				"1er mai, 1er novembre, janvier\n" + 
				"1er janvier, 1er  mai, 1er  novembre, 25 décembre\n" + 
				"Janvier et février, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"Août\n" + 
				"\n" + 
				"Novembre à avril\n" + 
				"1er janvier, vendredi saint, lundi de Pâques et de Pentecôte, 1er mai, 14 juillet, 1er et 11 novembre, 25 et 26 décembre\n" + 
				"1er janvier, vendredi saint, lundi de Pâques et de Pentecôte, 1er mai, 14 juillet, 1er et 11 novembre, 25 et 26 décembre\n" + 
				"\n" + 
				"25 décembre\n" + 
				"\n" + 
				"1er janvier, vendredi saint, 1er mai, 1er et 11 novembre, 25 et 26 décembre\n" + 
				"25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"Décembre, janvier, février, mars\n" + 
				"1er janvier, vendredi saint, 1er mai et 25 décembre\n" + 
				"\n" + 
				"Décembre, janvier, février. Fermé les 17,18,31 mars, les 1, 21, 22, 28, 29 avril et 6, 7, 13, 14,20 ,21 octobre\n" + 
				"\n" + 
				"\n" + 
				"Janvier\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"De décembre à mars\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"Fermeture les 2ème et 3ème semaines de janvier, et les jours fériés d'octobre à mars\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Musée Aquitaine\n" + 
				"Certains jours fériés\n" + 
				"\n" + 
				"Tous les jours fériés\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"1er mai\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"1er mai, 1er et 11 novembre\n" + 
				"16 décembre au 31 mars, 1er mai, 1er et 11 novembre\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Du 15 décembre au 15 janvier\n" + 
				"\n" + 
				"1er mai, 1er novembre, 25 décembre et 1er janvier\n" + 
				"\n" + 
				"\n" + 
				"25 décembre, 1er janvier\n" + 
				"Jours fériés sauf 14 juillet et 15 août\n" + 
				"Jours fériés\n" + 
				"Octobre à décembre\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Novembre à avril\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"25 décembre, 1erjanvier, 1er mai et lors du montage des expositions\n" + 
				"1er janvier, 25 décembre, 1er mai\n" + 
				"\n" + 
				"1er mai, 25 décembre, 1er janvier - Mars\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"Décembre et janvier\n" + 
				"1er mai, jours fériés du 01/10 au 30/04\n" + 
				"1er mai, jours fériés du 16/10 au 14/04\n" + 
				"\n" + 
				"Décembre à mars\n" + 
				"Novembre à mai\n" + 
				"1er mai, 24, 25 et 31 décembre, 1er janvier\n" + 
				"\n" + 
				"Décembre à mi mars\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"Janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"Janvier, février, mars\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre. Entre les vacances de la Toussaint et celles de Noël, celles de Noël et celles d'hiver\n" + 
				"\n" + 
				"De décembre à mars\n" + 
				"Janvier àprès les vacances scolaires, 1er mai, 24 et 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er mai\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 11 novembre, 25 & 31 décembre\n" + 
				"1er janvier, 1er et 8 mai, 14 juillet, 1er et 8 novembre, 25 décembre\n" + 
				"1er janvier, 1er et 8 mai, 14 juillet, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier et 25 décembre\n" + 
				"14 juillet\n" + 
				"\n" + 
				"1er janvier, 1er & 8 mai, 14 juillet, 1er & 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er et 8 mai, 14 juillet, 1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"Octobre à juin\n" + 
				"Fermé du 24 décembre au 1er janvier\n" + 
				"\n" + 
				"Janvier et février, 1er mai et 25 décembre\n" + 
				"\n" + 
				"Du 1er janvier jusqu'aux vacances de février, le 25 décembre\n" + 
				"Du 1er janvier jusqu'aux vacances de février, le 25 décembre\n" + 
				"Janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"Du 25 décembre au 31 janvier\n" + 
				"Octobre à mai\n" + 
				"1er mai et du 1er novembre au 28 février\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"D'octobre à fin fin mars\n" + 
				"Janvier et février\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"1er mai, 14 juillet, 1er et 11 novembre, du 15 décembre au 1er mars inclus\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"23 décembre au 2 janvier + jours fériés\n" + 
				"\n" + 
				"Janvier à mars\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre et 25 décembre\n" + 
				"1er mai, 24 décembre au 31 décembre\n" + 
				"Semaine de Noël et jour de l'an\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er novembre, 25 décembre\n" + 
				"Fermeture annuelle du 1er novembre au 31 mars 2011\n" + 
				"31 décembre au 21 mars\n" + 
				"\n" + 
				"1er mai, 22 décembre 2012 au 6 janvier 2013\n" + 
				"1er mai\n" + 
				"\n" + 
				"Décembre, 1er janvier, 1er mai\n" + 
				"\n" + 
				"\n" + 
				"Du 20 décembre  au 21 janvier inclus\n" + 
				"1er et 8 mai, 1er et 11 novembre, 25 décembre au 1er janvier\n" + 
				"1er et 8 mai, 1er et 11 novembre, du 25 décembre au 1er janvier\n" + 
				"Jours fériés et du 25 décembre au 1er janvier\n" + 
				"\n" + 
				"Janvier\n" + 
				"1er novembre, 25 décembre, 1er janvier\n" + 
				"Décembre, janvier\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er mai, 1er et 11 novembre, 16 octobre au 14 mars 2009\n" + 
				"Janvier\n" + 
				"Janvier à mars, 9 avril, 28 mai, 11 novembre et 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre et 25 décembre\n" + 
				"Jours fériés\n" + 
				"Janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"6 novembre au 19 décembre 2009\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 25 décembre\n" + 
				"1er mai\n" + 
				"1er et 11 novembre, 25 décembre et 1er janvier, 1er mai\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, dimanche de Pâques, 1er novembre et 25 décembre\n" + 
				"Jours fériés\n" + 
				"16 au 31 janvier, jours fériés\n" + 
				"Jours fériés\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, dimanche de Pâques, 1er novembre et 25 décembre\n" + 
				"1er janvier, dimanche de Pâques, 1er novembre et 25 décembre\n" + 
				"1er janvier, dimanche de Pâques, 1er novembre et 25 décembre\n" + 
				"1er et 11 novembre, 24, 25 30 et 31 décembre\n" + 
				"janvier, 1er mai, 25 décembre\n" + 
				"Jours fériés\n" + 
				"Janvier, février\n" + 
				"Mi octobre à fin mars\n" + 
				"1er mai, mi- décembre au 31 janvier inclus\n" + 
				"15 décembre au 31 janvier, 1er mai\n" + 
				"Week-end de la semaine 45 à la semaine 50 en 2009\n" + 
				"24, 25, 31 décembre et 1er janvier\n" + 
				"Octobre à mars\n" + 
				"25 décembre, 1er janvier\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er mai, foires annuelles, Noël, 1er janv.\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er & 8 mai, 1 & 11 novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai et 25 décembre\n" + 
				"Les 15 derniers jours de décembre - Jours fériés sauf 14 juillet\n" + 
				"15 décembre au 15 janvier, 1er mai, 1er & 11 novembre\n" + 
				"1er janvier, 1er mai, 1er novembre,  25 décembre\n" + 
				"\n" + 
				"24 au 31 décembre, Janvier, du 1er au 14 février\n" + 
				"Fermé du 12 novembre au 31 mars\n" + 
				"Janvier et jours fériés sauf 14 juillet, 15 août et 1er novembre. D'octobre à décembre pour le couvent des cordeliers et sur rdv toute l'année pour la maison des ATP\n" + 
				"1er mai, 1 & 11 novembre, 24 au 26 décembre 31 décembre au 31 Janvier\n" + 
				"Janvier, 1er mai, 25 et 26 décembre\n" + 
				"\n" + 
				"Janvier, 11 novembre et 25 décembre\n" + 
				"du 24 décembre au 1er janvier inclus et durant les trois premières semaines de janvier\n" + 
				"\n" + 
				"1er octobre au 30 juin excepté du 14 au 22 novembre\n" + 
				"\n" + 
				"1er mai, 1er novembre\n" + 
				"1er janvier, 25 décembre\n" + 
				"\n" + 
				"1er novembre au 31 mars\n" + 
				"jours fériés\n" + 
				"25 décembre, 1er janvier\n" + 
				"\n" + 
				"Janvier et février\n" + 
				"1er mai, 1er et 11 novembre\n" + 
				"25 décembre et 1er janvier\n" + 
				"1er janvier, 1er mai, 14 juillet, 25 décembre\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er janvier et 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"17 avril, 1er et 8 mai, 5 juin\n" + 
				"\n" + 
				"\n" + 
				"Les 1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"1er janvier, le 1er mai, le 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"25 décembre et en janvier\n" + 
				"Fermé pendant les vacances scolaires de Noël, 1er mai et 1er novembre\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"\n" + 
				"1er et 11 novembre, 25 décembre\n" + 
				"1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"Fêtes de Noël et du Jour de l’An\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Octobre à avril\n" + 
				"\n" + 
				"25 décembre et 1er janvier\n" + 
				"\n" + 
				"1er mai, vacances de Noël\n" + 
				"\n" + 
				"Décembre et  janvier\n" + 
				"1er janvier, 1er mai, 11 novembre et 25 décembre\n" + 
				"1er janvier, 1er mai, 11 novembre et 25 décembre\n" + 
				"1er janvier, 1er mai, 11 novembre et 25 décembre\n" + 
				"1er janvier, 1er mai, 11 novembre et 25 décembre\n" + 
				"1er janvier, 1er mai, 11 novembre et 25 décembre\n" + 
				"1er janvier, 1er mai, 11 novembre et 25 décembre\n" + 
				"25 décembre,  1ère semaine de janvier, lundi de la Pentecôte\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"Novembre à février, 1er mai\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er & 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er & 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 11 novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"25 janvier 1er janvier\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 14 juillet, 10 et 15 août, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"1er mai, 24 décembre, autres jours fériés, 31 décembre au 14 janvier inclus\n" + 
				"\n" + 
				"1er janvier, 1er et 8 mai, 1er et 11 novembre et 25 janvier\n" + 
				"1er janvier, 25 décembre\n" + 
				"les 1er janvier, 1er mai, 1er novembre et 25 décembre\n" + 
				"25 décembre, 1er janvier\n" + 
				"1er janvier, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"musée fermé de mi-novembre à fin mars\n" + 
				"\n" + 
				"1er & 2 janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er mai, 1er novembre, 11 novembre, et congés scolaires de fin d'année\n" + 
				"\n" + 
				"24, 31 décembre\n" + 
				"1er et 11 novembre, et congés scolaires de fin d'année\n" + 
				"Novembre à avril\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre, Janvier (sauf vacances scolaires)\n" + 
				"Jours fériés\n" + 
				"1er mai, 1er novembre, du 24 décembre au 1er janvier\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"25 décembre, 1er janvier\n" + 
				"Jours fériés et du 1er au 25 décembre inclus\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 25 décembre\n" + 
				"\n" + 
				"1er février au 1er mars - 1er mai, 1er novembre\n" + 
				"le 1er novembre, 25 décembre, 1er janvier\n" + 
				"Le 1er novembre, le 25 décembre et le 1er janvier\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Août  et jours fériés et du 25 décembre 2010 au 4 janvier 2011\n" + 
				"du 1er au 14 Janvier\n" + 
				"Jours fériés\n" + 
				"Du 1er au 18 août inclus\n" + 
				"1er janvier, 1er mai, Août, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"25 décembre 2011 au 2 janvier 2012\n" + 
				"Août, semaine entre Noël et Nouvel An\n" + 
				"Aoüt et 1 semaine durant les vacances de Noël\n" + 
				"Fermé le 1er janvier, 1er mai, Pâques, Toussaint, Noël\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Août\n" + 
				"25 décembre, 1er janvier\n" + 
				"25 décembre, 1er janvier\n" + 
				"Juillet et août\n" + 
				"Août et jours fériés\n" + 
				"Août\n" + 
				"Une semaine de fermeture pendant les vacances d'hiver\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai et 25 décembre\n" + 
				"Jours fériés\n" + 
				"1er janvier, 1er mai, Roch Hachana, Yom Kippour\n" + 
				"1er janvier et 25 décembre\n" + 
				"Certains jours fériés\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Août et jours fériés\n" + 
				"1er mai\n" + 
				"\n" + 
				"1er mai\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"14 juillet\n" + 
				"1er mai\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"le 1er janvier, le 1er mai, le 8 mai et le 25 décembre 2007\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 15 août, 25 décembre\n" + 
				"1er janvier, 1er mai, dimanche et lundi de Pentecôte, 14 juillet, 15 août, Noël\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés, dimanche de Pâques et de Pentecôtes\n" + 
				"Jours fériés\n" + 
				"Musée fermé en dehors des expositions temporaires. Certains jours fériés\n" + 
				"Jours fériés\n" + 
				"1er janvier, 1er mai, 15 août, 1er novembre et 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"25 décembre ,  1er janvier, 24 mars, 1er mai, 12 mai et 14 juillet 2008\n" + 
				"\n" + 
				"1er janvier, 1er mai, 15 août et 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"Jours fériés\n" + 
				"1er mai et 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er mai, 25 décembre\n" + 
				"1er mai\n" + 
				"\n" + 
				"\n" + 
				"1er mai\n" + 
				"Jours fériés\n" + 
				"1er mai - du  22 décembre au 1er janvier 2010\n" + 
				"Vacances scolaires de fin d'année et août\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"Jours fériés\n" + 
				"Août\n" + 
				"1er Janvier, 1er Mai, 14 Juillet et 25 Décembre\n" + 
				"1er janvier, le 1er mai, le 25 décembre\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er mai, 25 décembre, 1er janvier\n" + 
				"26 août 2012 et du 17 décembre 2012 au 1er janvier inclus\n" + 
				"24 décembre au 1er janvier et 1er mai\n" + 
				"25 décembre, 1er janvier, 1er novembre et 1er mai\n" + 
				"24 décembre au 1er janvier, 1er mai\n" + 
				"25 décembre, 1er janvier\n" + 
				"25 décembre et 1er mai et août\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Août\n" + 
				"Les 1er janvier, 1er mai et 25 décembre\n" + 
				"25 décembre et 1er janvier\n" + 
				"\n" + 
				"Entre le 25 décembre et le 1er janvier, et le 1er mai\n" + 
				"1er mai et fêtes de fin d’année\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Septembre, 1er janvier, lundi de Pâques, 1er mai, lundi de Pentecôtes, Ascension, 14 juillet, Assomption, 15 août, 1er novembre, 25 décembre\n" + 
				"Août - 1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 14 juillet, 25 décembre. Fermé du 30 juillet au 15 août 2012\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Les 1er janvier, 1er mai et 25 décembre\n" + 
				"\n" + 
				"25 décembre, 1er janvier\n" + 
				"Jours fériés\n" + 
				"Fermé du 21 décembre au 4 janvier\n" + 
				"25 décembre, 1er janvier\n" + 
				"\n" + 
				"15 janvier au 28 février\n" + 
				"25 décembre, 1er janvier\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"25 décembre et 1er janvier\n" + 
				"\n" + 
				"Février 2012 - du 24 janvier au 8 mars et du 14 octobre au 1er novembre 2012\n" + 
				"\n" + 
				"Fermé du 13 juillet au 19 août\n" + 
				"\n" + 
				"1er janvier, dimanche et lundi de Pâques, 1er mai, ascension, lundi de Pentecôte, 8 mai, 14 juillet, 1er et 11 novembre, 25 décembre\n" + 
				"Certains jours fériés\n" + 
				"De novembre à mars\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er mai, 1er et 11 novembre et du 23 décembre au 6 janvier\n" + 
				"\n" + 
				"2ème quinzaine de février, 1er janvier, 1er mai, jeudi de l'Ascension, 14 juillet, 1er novembre, 25 décembre\n" + 
				"1ère quinzaine de février, 1er novembre, 25 décembre, 1er janvier, 1er mai, 14 juillet, jeudi de l'Ascension\n" + 
				"Février\n" + 
				"Février\n" + 
				"Du 25 décembre au 2 janvier inclus + jours fériés\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er novembre et 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre et 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre et 25 décembre. De la Toussaint à l'Ascension\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1 & 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"Février\n" + 
				"Février\n" + 
				"Janvier et jours fériés\n" + 
				"\n" + 
				"Janvier, 1er novembre, 25 décembre\n" + 
				"Janvier\n" + 
				"24 décembre au 2 janvier\n" + 
				"1er janvier, dimanche de Pâques, 1er mai et 25 décembre\n" + 
				"1er janvier, dimanche de Pâques, 1er mai et 25 décembre\n" + 
				"1er janvier, dimanche de Pâques, 1er mai et 25 décembre\n" + 
				"1er Janvier, 25 Décembre\n" + 
				"De décembre à mars\n" + 
				"\n" + 
				"1er janvier, 1er mai, 14 juillet, 15 août, 1er novembre et 25 décembre\n" + 
				"\n" + 
				"Décembre, janvier, février\n" + 
				"1er Janvier, 1er Mai, 1er Novembre, 25 Décembre\n" + 
				"Décembre, janvier et 22 jours en février\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"1er janvier, 1er mai, 15 août, 1er novembre, 25 décembre\n" + 
				"Jours fériés - du 21 décembre 2007 au 2 janvier 2008\n" + 
				"\n" + 
				"\n" + 
				"Janvier et décembre, mardi gras.\n" + 
				"Fermeture annuelle de novembre à mars\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"Autres mois\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai,  Assomption, 25 décembre\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"1er janvier, 1er mai, 14 juillet, 25 décembre\n" + 
				"\n" + 
				"mi-novembre à la mi-décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"24, 25 décembre, 1er janvier et de la fin des vacances scolaires de Noël au 1er février\n" + 
				"\n" + 
				"\n" + 
				"De mi-septembre aà mi-mai\n" + 
				"25 décembre, 1er janvier\n" + 
				"Jours fériés, 2ème, 4ème et 5ème dimanches du mois\n" + 
				"Entre les vacances de Noël et les vacances de février\n" + 
				"1er janvier, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"Entre le 15 décembre et le 1er mars\n" + 
				"\n" + 
				"1er janvier, dimanche de Pâques, 1er novembre, 25 décembre\n" + 
				"Fermé en janvier, février et mars 2005\n" + 
				"1er janvier, 25 décembre, 1er mai\n" + 
				"\n" + 
				"1er janvier, 1er mai et  25 décembre,\n" + 
				"1er janv., 1er mai, 14 juil., 1er nov. et 25 déc.\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er novembre, 25 décembre\n" + 
				"1er janvier, dimanche de Pâques, 1er mai, 14 juillet, 1er novembre,  25 décembre\n" + 
				"1er janvier, dimanche et lundi de Pâques, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 14 juillet, 15 août, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"24 décembre au 2 janvier\n" + 
				"\n" + 
				"\n" + 
				"Du 1er novembre au 31 mars\n" + 
				"Octobre à avril\n" + 
				"\n" + 
				"Novembre à mars\n" + 
				"\n" + 
				"1er mai, 22 décembre au 7 janvier\n" + 
				"De Novembre à Pâques\n" + 
				"1er janvier, Vendredi Saint, 1er et 8 mai, Ascension, 14 juil, 15 août, 1er et 11 novembre, 25 décembre, et 24 et 31 décembre après-midi\n" + 
				"\n" + 
				"\n" + 
				"25 et 26 décembre et 1ère semaine de janvier\n" + 
				"\n" + 
				"le 1er janvier, le jour de Pâques, le 1er mai, le 25 et 26 décembre\n" + 
				"1er Janvier, Dimanche de Pâques, 1er Mai, 25 Décembre\n" + 
				"1er Janvier, Dimanche de Pâques, 1er Mai, 1er Novembre et 25 Décembre\n" + 
				"dimanche de Pâques, 1er novembre, 25 et 26 décembre, 1er janvier\n" + 
				"1er mai, 23 décembre au 7 janvier inclus\n" + 
				"25 décembre, 1er janvier et le mardi suivant Päques\n" + 
				"1er Janvier, 1er mai, 1er novembre et 25 décembre\n" + 
				"3 premières semaines de janvier, 14 juillet, 15 août\n" + 
				"\n" + 
				"1er janvier, 1er mai, Ascension, Toussaint, 25 décembre, en octobre\n" + 
				"1er janvier, 1er mai, Ascension, Toussaint, 25 décembre, en octobre\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier\n" + 
				"1er septembre, 25 décembre, 1er janvier\n" + 
				"1er mai\n" + 
				"Janvier, 25 décembre\n" + 
				"25 décembre et 1er janvier\n" + 
				"Janvier et 25 décembre\n" + 
				"Fermé les lundis hors vacances scolaires zone A - 25 décembre\n" + 
				"\n" + 
				"Les autres mois\n" + 
				"Octobre à mai\n" + 
				"Jours fériés d'octobre à mai\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"De novembre à mars\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"Janvier et jours fériés\n" + 
				"Janvier\n" + 
				"Janvier, jours fériés et 1er week-end de juillet\n" + 
				"1er janvier au 15 janvier, 1er mai, 25 décembre\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"Première semaine de janvier\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1 mai et 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai et 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er & 11 novembre, 25 décembre et 1er janvier\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"15 décembre au 15 janvier\n" + 
				"1er janvier, 1er mai, 25 décembre et pendant les montages d'expositions\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Entre octobre et avril\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"1er Janvier, 1er Mai, 1er Novembre, et 25 Décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er novembre et 25 décembre\n" + 
				"\n" + 
				"15 décembre au 15 mars\n" + 
				"Janvier\n" + 
				"\n" + 
				"Janvier\n" + 
				"1er mai, 1er novembre, 11 novembre et du 24 décembre à fin février\n" + 
				"\n" + 
				"\n" + 
				"Décembre et janvier\n" + 
				"Décembre, janvier\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés, samedi au mardi gras inclus (carnaval), du samedi des vacances de Noël à début janvier de l'année suivante\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre - Fermetures annuelles la 1ère quinzaine de septembre et la 2ème quinzaine de janvier\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er et 8 mai, 14 juillet, 15 août, 1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, lundi de Pâques, lundi de Pentecôte, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, ascension, 14 juillet, 15 août, 1er & 11 septembre, 25 décembre\n" + 
				"1er janvier, la veille du Mardi Gras, le 1er mai et le 25 décembre\n" + 
				"1er janvier, dimanche & lundi après-midi précédent mardi gras, 1er mai, 15 août, 1er novembre, 24  et 31 am et 25 décembre\n" + 
				"1er janvier, dimanche & lundi après-midi précédent mardi gras, 1er mai, 15 août, 1er novembre, 24  et 31 am et 25 décembre\n" + 
				"\n" + 
				"Du 15 décembre  au 31 janvier\n" + 
				"1er mai, le 1er novembre et du 24 décembre au 1er janvier inclus\n" + 
				"\n" + 
				"1er janvier, 1er novembre, 25 décembre\n" + 
				"Janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 14 juillet 1er week-end de septembre (braderie de Lille), 1er novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, jeudi de l'Ascension, 14 juillet, 15 août, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai et 25 décembre\n" + 
				"1er janvier, dimanche et lundi de Pâques, 1er et 8 mai, jeudi de l'Ascension, dimanche et lundi de Pentecôte, 14 juillet, dernier lundi de juillet (Foire de Tourcoing), 15 août, Saint Louis (lundi braderie de Lille), 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre, le lundi suivant le 2ème dimanche de septembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Entre Noël et le jour de l'an -  1er mai\n" + 
				"Jours fériés\n" + 
				"les 24, 25,26, 31 décembre et le 1er et 2  janvier\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"1er mai\n" + 
				"11 novembre, 24 décembre 2010 au 3 janvier 2011\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Janvier et 24, 25, 26 et 31 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, dimanche de Pâques, 1er mai, Ascension, 1er novembre, 25 décembre\n" + 
				"1er janvier, dimanche de Pâques, 1er mai, Jeudi de l'Ascension, 1er novembre, 25 décembre\n" + 
				"Jours fériés\n" + 
				"1er janvier, du 4 au 26 janvier 2009, 25 décembre\n" + 
				"\n" + 
				"30 novembre au 12 février 2010, 1er mai\n" + 
				"1er mai, 14 juillet et 25 décembre\n" + 
				"Décembre et janvier\n" + 
				"15 Décembre au 15 janvier\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er mai, du 1er décembre au 31 janvier, et du 1er octobre au 15 octobre\n" + 
				"Janvier à mars\n" + 
				"Mi-novembre à mi-mars\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"\n" + 
				"1er mai, 1er & 11 nov,embre, 25 décembre, 1er janvier. Fermeture technique du musée en janvier\n" + 
				"Janvier, février et entre les vacances scolaires, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"Novembre à mars\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Décembre et janvier et jours fériés\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Janvier\n" + 
				"Janvier\n" + 
				"\n" + 
				"1er janvier, 25 décembre, 1er mai\n" + 
				"1er janvier, Pâques, 1er mai, Ascension, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"Novembre à mars\n" + 
				"Décembre et  janvier\n" + 
				"\n" + 
				"1er mai, 1er novembre\n" + 
				"Décembre, janvier et février\n" + 
				"Le 1er janvier, le 1er mai et le 25 décembre\n" + 
				"1er mai, 13 juillet\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"24, 25, 31 décembre, 1er janvier\n" + 
				"\n" + 
				"1er janvier, 1er mai et 25 décembre\n" + 
				"1er janvier, 1er et 8 mai, 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 11 novembre, 25 décembre\n" + 
				"1er mai, du 16 novembre au 31 janvier\n" + 
				"1er janvier, 1er mai, 8 mai et 25 décembre\n" + 
				"1er janvier, 1er mai et 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"Certains jours fériés\n" + 
				"\n" + 
				"Jours fériés sauf lundi de Pentecôtes et lundi de Pâques\n" + 
				"\n" + 
				"Janvier, 1er et 11 Novembre, 24, 25 et 31 Décembre\n" + 
				"1er janvier et 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai et 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 8 mai, 14 juillet, 11 novembre et 25 décembre\n" + 
				"1er janvier, 1er mai, 14 juillet, 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er et 8 mai, 14 juillet, 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er et 8 mai, 14 juillet, 11 novembre et 25 décembre\n" + 
				"1er janvier, 1er et 8 mai, 14 juillet, 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre et pendant les vacances scolaires de Noël\n" + 
				"1er janvier, 1er novembre et 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er, 8 et 13 mai, Ascension, 14 juillet, 15 août, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er, 8 et 13 mai, Ascension, 14 juillet, 15 août, 1er et 11 novembre, 25 décembre\n" + 
				"Jours fériés\n" + 
				"1er janvier, 1er, 8  et 13 mai, Ascension, 14 juillet, 15 août, 1er et 11 novembre, 25 décembre\n" + 
				"Jours fériés\n" + 
				"1er janvier, Lundi de Pâques, 1er mai, 8 mai, Lundi de Pentecôte, Ascension, 14 juillet, 15 août, 1er novembre, 11 novembre, 25 décembre\n" + 
				"Fermé les jours fériés, sauf le lundi de Pentecôte et le lundi de Pâques\n" + 
				"Janvier à mi-février, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"\n" + 
				"Janvier à mars et de novembre à décembre\n" + 
				"Mi-décembre, janvier, février\n" + 
				"\n" + 
				"1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre et 25 décembre\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Janvier au 8 février\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre et 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre et 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre et 25 décembre\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre et 25 décembre\n" + 
				"Janvier, février,mars\n" + 
				"\n" + 
				"1er janvier, 1ermai, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"Janvier, février, mars\n" + 
				"3 semaines de fermeture annuelle\n" + 
				"\n" + 
				"24 décembre au 2 janvier\n" + 
				"\n" + 
				"\n" + 
				"Janvier, 25 décembre\n" + 
				"\n" + 
				"15 décembre au 5 janvier\n" + 
				"1er janvier, Pâques, Pentecôte, 1er mai, 8 mai, Ascension, 14 juillet, 15 août, 1er novembre, 11 novembre et 25 décembre\n" + 
				"Jours fériés\n" + 
				"Janvier, 25 décembre, 1er mai\n" + 
				"\n" + 
				"\n" + 
				"1er janvier\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Janvier, 24 et 31 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"11 novembre\n" + 
				"Novembre à mars\n" + 
				"\n" + 
				"\n" + 
				"25 décembre, 1er janvier\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"les 1er mai, 25 décembre et 31 décembre\n" + 
				"\n" + 
				"Décembre et janvier\n" + 
				"1er novembre, 25 décembre et 1er janvier\n" + 
				"1er novembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 25 décembre - Lors des fêtes de fin d'année\n" + 
				"\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 14 juillet, 24,25 et 31 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, dimanche de la Pentecôte, 14 juillet, lundi de la Braderie en septembre, 1er novembre et 25 décembre\n" + 
				"1er janvier, 25 décembre\n" + 
				"1er mai, 1er  novembre et entre le 25 décembre et le 1er janvier\n" + 
				"\n" + 
				"Jours fériés et dernier dimanche du mois\n" + 
				"\n" + 
				"1er janvier, lundi de Pâques, 1er mai, lundi de Pentecôte, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er novembre et 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 14 juillet, 1er novembre et 25 décembre\n" + 
				"Jours fériés\n" + 
				"Mi novembre à mi-mars, 1er mai\n" + 
				"1er janvier, 1ère semaine de janvier, 25 décembre\n" + 
				"1er janvier, 11 novembre, 25 décembre\n" + 
				"1ermai , 11 novembre, du 25 décembre au 2 janvier\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er & 11 novembre, 25 décembre\n" + 
				"\n" + 
				"1er au 15 janvier et 17 au 31 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"25 décembre, 1er janvier et 1er mai\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"Janvier, 1er mai, 25 décembre\n" + 
				"Janvier, 1er mai, 25 décembre\n" + 
				"Du 16 décembre au 31 janvier, 1er mai (Hôtel de Cheusses) - Janvier, 1er mai 25 décembre pour l'Ancienne école de Médecine\n" + 
				"\n" + 
				"1er janvier, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"Janvier sauf le dimanche\n" + 
				"Janvier\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Janvier, 1er mai, le 25 décembre\n" + 
				"20 décembre au 3 janvier\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er Mai, 8 Mai, 1er novembre, 11 novembre et 25 décembre.\n" + 
				"\n" + 
				"Jours fériés sauf 11 novembre, jeudi de l'Ascension, 14 juillet et 15 août\n" + 
				"\n" + 
				"\n" + 
				"25 décembre, 1er janvier, 1er mai\n" + 
				"\n" + 
				"Du 19 novembre au 19 décembre inclus et 1er mai, 25 décembre et 1er janvier\n" + 
				"Entre Noël et le Jour de l'an et les jours fériés en hiver\n" + 
				"\n" + 
				"A partir du 16 décembre et en janvier\n" + 
				"Janvier\n" + 
				"16 décembre au 31 janvier inclus\n" + 
				"\n" + 
				"\n" + 
				"Janvier\n" + 
				"1er janvier, le 1er mai, le 1er novembre et le 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre et une semaine en décembre\n" + 
				"1er janvier, 25 décembre - une semaine au début de décembre\n" + 
				"1er janvier, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre - 3 dernières semaines de novembre\n" + 
				"3 dernières semaines de Novembre - 1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre - 3 dernières semaines de Novembre\n" + 
				"1er janvier, 1er mai, 1er novembre et 25 décembre\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, dimanche de Pâques, 1er mai et 25 décembre\n" + 
				"1er janvier, le dimanche de Pâques, 1er ami, 25 décembre\n" + 
				"1er janvier, 1er mai et 25 décembre\n" + 
				"1er janvier, dimanche de Pâques, 1er mai, 25 décembre\n" + 
				"1er janvier, Dimanche de Pâques, 1er mai, 25 décembre\n" + 
				"1er janvier, dimanche de Pâques, 1er mai, 25 décembre\n" + 
				"Certains jours fériés\n" + 
				"1er janvier, le jour de Pâques, 1er mai, 25 décembre\n" + 
				"1er janvier, le dimanche de Pâques, le 1er mai, le 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai, dimanche de Pâques, 25 décembre\n" + 
				"Mi-décembre à mi-janvier\n" + 
				"Du 12 au 24 mars, du 13 au 25 novembre, le 25 décembre, le 1er janvier et le 1er mai\n" + 
				"1er janvier, le 1er mai,  le 1er novembre, le 11 novembre et le 25 décembre\n" + 
				"\n" + 
				"Novembre - 1er janvier, 1er mai, 14 juillet matin, 15 août matin, et le 25 décembre\n" + 
				"Jours fériés\n" + 
				"Janvier\n" + 
				"1er janvier, 1er mai, 25 et 26 décembre\n" + 
				"\n" + 
				"Janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai,  25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Janvier\n" + 
				"1er mai, 1er janvier, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Fermé de mi-décembre à fin janvier\n" + 
				"1er janvier, 1er et 8 mai, Ascencion, 15 août, 1er et 11 novembre, 25 décembre\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Jours férié\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er novembre, 25 décembre\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"24 et 31 décembre\n" + 
				"Fermé pour travaux à partir de fin mai 2012  jusqu'en octobre 2013\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"Certains jours fériés\n" + 
				"\n" + 
				"1er ajvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"Du 15 décembre au 15 janvier\n" + 
				"Jours fériés\n" + 
				"Du 24 décembre au 2 janvier\n" + 
				"\n" + 
				"1er janver, lundi de Pâques, 1er & 8 mai, Ascension, lundi de Pentecôte, 14 juillet, Assomption, 1er & 11 novembre et du 24 au 31 décembre\n" + 
				"Jours fériés\n" + 
				"Novembre,  1er janvier, 1er et 17 mai, Ascension, Noël\n" + 
				"Pâques, 1er novembre, Noël et jour de l'An\n" + 
				"Janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"25 décembre au 20 février 2006 et Jours fériés\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"Du 1er octobre au 30 mars\n" + 
				"1er octobre au 30 mars + jours fériés\n" + 
				"\n" + 
				"\n" + 
				"Fermé de novembre au 2 mai\n" + 
				"\n" + 
				"\n" + 
				"1er mai, 25 décembre\n" + 
				"1er mai, 25 décembre\n" + 
				"\n" + 
				"Décembre à janvier\n" + 
				"\n" + 
				"\n" + 
				"Entre les vacances de Noël et de février\n" + 
				"Jours fériés (sauf 14 juillet et 15 août)\n" + 
				"1er janvier, 1er mai, 1er novembre et du 20 au  25 décembre\n" + 
				"\n" + 
				"1er mai\n" + 
				"1er mai, 1er janvier, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er et 11 novembre, 25 décembre\n" + 
				"\n" + 
				"Jours fériés, et fermeture exceptionnelle\n" + 
				"2 novembre à mars pour les individuels\n" + 
				"\n" + 
				"14 juillet et 15 août\n" + 
				"Novembre à Avril\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Fermé en 2012\n" + 
				"\n" + 
				"\n" + 
				"Décembre et janvier\n" + 
				"Novembre à février et 1er mai\n" + 
				"Novembre à mars sauf groupes sur rdv\n" + 
				"1er janvier, 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 1er novembre et 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 25 décembre et de la fin des vacances de la Toussaint aux vacances de Noël\n" + 
				"\n" + 
				"\n" + 
				"Du 15 octobre au 15 mars\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre - mi-novembre-mi-décembre\n" + 
				"Novembre\n" + 
				"Mai, juin et septembre à novembre - Jours fériés\n" + 
				"Décembre, janvier, 1er mai\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai et 31 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"Novembre à avril\n" + 
				"\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"\n" + 
				"1er janvier, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er et 11 novembre, 25 décembre\n" + 
				"1er janvier, 1er et 11 novembre, 25 décembre\n" + 
				"1er mai, autres jours fériés, et pendant les congés de fin d'année\n" + 
				"1er janvier, 1er mai, 11 novembre, 25 décembre\n" + 
				"Janvier et décembre\n" + 
				"Janvier, février et 25 décembre\n" + 
				"Janvier, février et 25 décembre\n" + 
				"1er janvier, 1er mai, 25 décembre\n" + 
				"25 décembre et 1er janvier\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"25 décembre et 1er janvier\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, 1er mai, 14 juillet, 15 août, 1er novembre, 25 décembre\n" + 
				"1er janvier, 1er mai, 14 juillet, 15 août, 1er novembre, 25 décembre\n" + 
				"Jours fériés\n" + 
				"1er janvier, 1er mai, 14 juillet, 15 août, 1er novembre, 25 décembre\n" + 
				"1er janvier, 24, 25 et 31 décembre\n" + 
				"\n" + 
				"1er janvier, 1er mai et 25 décembre\n" + 
				"1er janvier et 25 décembre\n" + 
				"Pendant les fêtes de fin d'année et au mois de janvier\n" + 
				"Décembre-Janvier-Février\n" + 
				"\n" + 
				"\n" + 
				"Jours fériés, dimanche de Pâques et de Pentecôte\n" + 
				"\n" + 
				"Jours fériés, dimanche de Pâques et de Pentecôte\n" + 
				"Jours fériés\n" + 
				"1er janvier, 1er mai, 1er novembre et 25 décembre\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"1er janvier, dimanche de Pâques, 1er mai, 14 juillet et le 25 décembre\n" + 
				"25 décembre, 1er janvier et dernière semaine de janvier\n" + 
				"1er janvier, 1er mai, 1er novembre et 25 décembre\n" + 
				"\n" + 
				"23, 24, 31 décembre, 1er janvier\n" + 
				"Jours fériés\n" + 
				"\n" + 
				"Du 20 décembre au 5 janvier et les jours fériés\n" + 
				"24, 25 et 31 décembre, 1er janvier, 1er mai\n" + 
				"\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"Jours fériés\n" + 
				"Fêtes\n" + 
				"";

		Map<String,Integer> map = new HashMap<String,Integer>();

		int j=1;
		for (String i : tmp.split("\n")){			
			if (i.length() > 0){
				map.put(i.substring(0, 1).toUpperCase()+i.substring(1),j);
				j++;
			}
		}

		/*Writer writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("owl/split/fa.txt"), "utf-8"));

			for (String k : map.keySet()){
				String toAdd = "###  http://www.musee.com/ontologies/musee.owl#FA_"+map.get(k)+"\n\n";
				toAdd += ":FA_"+map.get(k)+" rdf:type owl:NamedIndividual ;\n\n";
				toAdd += "    :aPériodeFermeture \""+k.substring(0, 1).toUpperCase()+k.substring(1)+"\" .\n\n\n\n";
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
				System.out.println("FA_"+map.get(i));
		}

	}

}
