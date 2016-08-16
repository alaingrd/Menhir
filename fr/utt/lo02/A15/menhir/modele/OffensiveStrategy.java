package fr.utt.lo02.A15.menhir.modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe qui décrit une stratégie offensive <br>
 * Elle est mise en place dans le cardre du patron de conception Strategy <br>
 * Elle permet aux joueurs virtuels d'adopter une stratégie offensive
 * @author alain
 *
 */
public class OffensiveStrategy implements StrategyItf {

	ArrayList <Integer> listIdCartesIngredientsJoueur = new ArrayList<Integer>();
	
	
	
	/**
	 * Choisit une carte (surchargé)
	 */
	public int choixCarte() {
		return 1;
	}
	
	//On peut considérer qu'utiliser le farfadet est un acte agressif
	
	
	//On récupère les numéros des cartes possédées
	//On surcharge le choix de la carte
	/**
	 * Choisit une carte pour le joueur virtuel <br>
	 * On récupère les numéros des cartes possédées <br>
	 * @return ID unique de la carte ayant la plus grande valeur pour le farfadet cette saison
	 */
	public int choixCarte(List <CartesIngredients> listCartesIngredientsJoueur, Joueur j, String saisonCourante) {
		int carteChoisieTour = listCartesIngredientsJoueur.get(0).getIdUniq();
		int maxFarfadet = listCartesIngredientsJoueur.get(0).getMapForceFarfadet(saisonCourante);
		//On détermine le numéro de la carte ayant la plus grande force pour le Farfadet
		Iterator <CartesIngredients> it = listCartesIngredientsJoueur.iterator();
		while (it.hasNext()) {
			CartesIngredients carteCourante = it.next();
			if (carteCourante.getMapForceFarfadet(saisonCourante) > maxFarfadet) {
				carteChoisieTour = carteCourante.getIdUniq();
				maxFarfadet = carteCourante.getMapForceEngrais(saisonCourante);
			}
		}
		return carteChoisieTour;
	}
	

	
	/**
	 * Choisit l'action après avoir choisi la carte <br>
	 * @return Le numéro de l'action farfadet
	 */
	public int choixAction() {
		return 3;
	}
}
