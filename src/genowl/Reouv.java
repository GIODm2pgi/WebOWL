package genowl;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reouv {

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

		String tmp = "\n" + 
				"\n" + 
				"29 juin 2013\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"29 Juin 2007\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"2013\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Juin 2013\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"2013\n" + 
				"Non prévue\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"2015\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Réflexion pour CIAP\n" + 
				"\n" + 
				"Inconnue\n" + 
				"Projet CIAP\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Fermeture définitive\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"Fermeture définitive\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Fermeture définitive\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"Inconnue\n" + 
				"Non prévue\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Fusion des musées\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Fermeture définitive\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Pas de musée\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"2013\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Fermeture définitive\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"Fermeture définitive\n" + 
				"\n" + 
				"Fermeture définitive\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"2016\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Pas encore ouvert\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Fermeture définitive\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"7 juin 2013\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Pas encore ouvert\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"2013\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Transfert Roubaix\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"2013 à Marseille\n" + 
				"\n" + 
				"2014\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"2013\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Début 2014\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"2015\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Fermeture définitive\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Mi 2013\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Mai 2014\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"2014\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"2013\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Transfert en cours\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"2016\n" + 
				"\n" + 
				"2015\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"Ouverture partielle\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"Fermeture définitive\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"En cours\n" + 
				"\n" + 
				"Inconnue\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"Printemps 2014\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"2014\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"\n" + 
				"2013\n" + 
				"\n" + 
				"\n" + 
				"2013\n" + 
				"2013\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Octobre 2013\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"Fermeture définitive\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"Février 2014\n" + 
				"Inconnue\n" + 
				"Ouverture partielle\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Décembre 2013\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"2013\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"Inconnue\n" + 
				"\n" + 
				"Fermeture définitive\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"2014\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"Non prévue\n" + 
				"\n" + 
				"Inconnue\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Inconnue\n" + 
				"\n" + 
				"\n";

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
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("owl/split/ro.txt"), "utf-8"));

			for (String k : map.keySet()){
				String toAdd = "###  http://www.musee.com/ontologies/musee.owl#RO_"+map.get(k)+"\n\n";
				toAdd += ":RO_"+map.get(k)+" rdf:type owl:NamedIndividual ;\n\n";
				toAdd += "    :aPériodeRéouverture \""+k+"\" .\n\n\n\n";
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
				System.out.println("RO_"+map.get(i));
		}*/

	}

}
