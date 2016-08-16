package fr.utt.lo02.A15.menhir.modele;

import java.util.HashMap;


/**
 * Classe qui décrit un chien de garde <br>
 * Le chien de garde est l'une des deux cartes alliées <br>
 * Donc ChienDeGarde hérite de CartesAllies <br>
 * Il permet de protéger un nombre variable de graines de menhirs contre les Farfadets Chapardeurs
 * @author alain
 * @version 1.0
 */
public class ChienDeGarde extends CartesAllies {
	
	HashMap<String, Integer> hmChienGarde = new HashMap<String, Integer>();

	
	/**
	 * Constructeur du chien de garde
	 * @param nomCarteAllie
	 * @param id
	 * @param idUniq
	 */
	public ChienDeGarde(String nomCarteAllie, int id, int idUniq) {
		super(nomCarteAllie, id, idUniq);
	}
	

	public HashMap<String, Integer> getHmChienGarde() {
		return hmChienGarde;
	}
	
	public int getHmChienGarde(String saisonCourante) {
		return hmChienGarde.get(saisonCourante);
	}

	public void setHmChienGarde(HashMap<String, Integer> hmChienGarde) {
		this.hmChienGarde = hmChienGarde;
	}

	/**
	 * Définit la carte allié du joueur
	 */
	public void transfererValeurs() {
		super.setMapValCarteAllie(hmChienGarde);
	}
	
	
}
