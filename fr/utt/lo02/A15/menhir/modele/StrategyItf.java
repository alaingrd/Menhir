package fr.utt.lo02.A15.menhir.modele;

import java.util.List;

/**
 * Interface intervenant dans le cadre du design pattern Strategy
 * @author alain
 *
 */
public interface StrategyItf {

	public int choixCarte();
	public int choixAction();
	
	//Surcharge	
	public int choixCarte(List <CartesIngredients> listCartesIngredientsJoueur, Joueur j, String saisonCourante);
}
