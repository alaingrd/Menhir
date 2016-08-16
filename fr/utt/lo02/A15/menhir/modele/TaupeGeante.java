package fr.utt.lo02.A15.menhir.modele;

import java.util.HashMap;

/**
 * Classe qui décrit une taupe géante <br>
 * La taupe géante est l'une des deux cartes alliées <br>
 * Donc TaupeGeante hérite de CartesAllies <br>
 * Elle permet de détruire un certain nombre de menhirs adultes chez un adversaire
 * @author alain
 * @version 1.0
 */
public class TaupeGeante extends CartesAllies {
	
	/**
	 * Constructeur de la taupe géante
	 * @param nomCarteAllie
	 * @param id
	 * @param idUniq
	 */
	public TaupeGeante(String nomCarteAllie, int id, int idUniq) {
		super(nomCarteAllie, id, idUniq);
	}
	
	HashMap<String, Integer> mapTaupeGeante = new HashMap<String, Integer>();
	
	

	public HashMap<String, Integer> getHmChienGarde() {
		return mapTaupeGeante;
	}

	public void setHmChienGarde(HashMap<String, Integer> mapTaupeGeante) {
		this.mapTaupeGeante = mapTaupeGeante;
	}
	
	/**
	 * Définit la carte allié du joueur
	 */
	public void transfererValeurs() {
		super.setMapValCarteAllie(mapTaupeGeante);
	}

}
