package fr.utt.lo02.A15.menhir.modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe qui décrit une stratégie défenisve <br>
 * Elle est mise en place dans le cardre du patron de conception Strategy <br>
 * Elle permet aux joueurs virtuels d'adopter une stratégie défensive
 * @author alain
 * @version 1.0
 */
public class DefensiveStrategy implements StrategyItf {
	
	//On surcharge les méthodes servant à choisir une carte et une action
	
	ArrayList <Integer> listIdCartesIngredientsJoueur = new ArrayList<Integer>();

	//On peut considérer qu'utiliser le géant ou l'engrais est un geste défensif
	public int choixCarte() {
		return 1;
	}

	
	/**
	 * Cette méthode choisit une carte pour le joueur virtuel <br>
	 * On peut considérer qu'utiliser le géant ou l'engrais est un geste défensif <br>
	 * On détermine si le joueur a besoin de faire pousser des menhirs ou pas <br>
	 * Sinon, on détermine le numéro de la carte ayant la plus grande force pour le Geant
	 * @param listCartesIngredientsJoueur
	 * @param j - Le joueur virtuel concerné
	 * @param saisonCourante
	 * @return ID unique de la carte choisie
	 */
	public int choixCarte(List <CartesIngredients> listCartesIngredientsJoueur, Joueur j, String saisonCourante) {
		int carteChoisieTour = 0;
		//On détermine si le joueur a besoin de faire pousser des menhirs ou pas
		if (j.getNbGraines() > 0) {
			carteChoisieTour = listCartesIngredientsJoueur.get(0).getIdUniq();
			int maxEngrais = listCartesIngredientsJoueur.get(0).getMapForceEngrais(saisonCourante);
			//On détermine le numéro de la carte ayant la plus grande force pour l'Engrais
			Iterator <CartesIngredients> it = listCartesIngredientsJoueur.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getMapForceEngrais(saisonCourante) > maxEngrais) {
					carteChoisieTour = carteCourante.getIdUniq();
					maxEngrais = carteCourante.getMapForceEngrais(saisonCourante);
				}
			}
		}
		else {
			//Sinon, on détermine le numéro de la carte ayant la plus grande force pour le Geant
			carteChoisieTour = listCartesIngredientsJoueur.get(0).getIdUniq();
			int maxGeant = listCartesIngredientsJoueur.get(0).getMapForceGeant(saisonCourante);
			
			
			Iterator <CartesIngredients> it = listCartesIngredientsJoueur.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getMapForceGeant(saisonCourante) > maxGeant) {
					carteChoisieTour = carteCourante.getIdUniq();
					maxGeant = carteCourante.getMapForceGeant(saisonCourante);
				}
			}
		}
		return carteChoisieTour;
	}
	
	
	/**
	 * Manière alternative de choisir une carte, d'abord utiliser
	 * Elle choisissait une action aléatoirement
	 * Elle n'est plus utilisée dans la dernière version du projet
	 */
	public int choixAction() {
		int choixAction = 1 + (int)(Math.random()*2);
		return choixAction;
	}
	
	/**
	 * Une fois la carte choisie, il faut choisir une action
	 * Si le joueur a graines, il va tenter de les faire pousser en choisissant l'engrais
	 * Sinon, il se procure dess graines en choisisssant le géant
	 * @param listCartesIngredientsJoueur
	 * @param j
	 * @return Le numéro de l'action, 2 pour l'Engrais, 1 pour le Géant
	 */
	public int choixAction(List <CartesIngredients> listCartesIngredientsJoueur, Joueur j) {
		if (j.getNbGraines() > 0) {
			return 2;
		}
		else {
			return 1;
		}
	}
	
	
}
