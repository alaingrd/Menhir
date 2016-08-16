package fr.utt.lo02.A15.menhir.modele;

import java.util.List;

/**
 * Classe décrivant un joueur réel et héritant de Joueur
 * @author alain
 *
 */
public class JoueurReel extends Joueur{
	
	
	/**
	 * Constructeur
	 * @param nomJoueur
	 * @param partieAvancee
	 * @param id
	 */
	public JoueurReel(String nomJoueur, Boolean partieAvancee, int id) {
		super(nomJoueur, partieAvancee, id);
	}
	
	/**
	 * Demande au joueur réel de choisir une carte
	 * @return ID de la carte choisie pour le tour
	 */
	public int choixCarte() {
		System.out.println("Veuillez saisir le numero de la carte choisie : ");
		
		carteChoisieTour = sc.nextInt();
		
		if (carteChoisieTour < 1 || carteChoisieTour > 24) {
			System.out.println("Veuillez saisir un numero legal de carte : ");
			carteChoisieTour = sc.nextInt();
		}
		return carteChoisieTour;
	}
	
	/**
	 * Demande au joueur réel de choisir une action, après avoir choisi une carte
	 * @return Numéro de l'action choisie
	 */
	public int choixAction() {
		System.out.println("Veuillez saisir le numero de l'action choisie : ");
		actionChoisieTour = sc.nextInt();
		if (actionChoisieTour < 1 || actionChoisieTour > 3) {
			System.out.println("Veuillez saisir un numero legal d'action : ");
			carteChoisieTour = sc.nextInt();
		}
		return actionChoisieTour;
	}


	@Override
	public int choixCarte(List<CartesIngredients> listCartesIngredientsJoueur, Joueur j, String saisonCourante) {
		return 0;
	}

	@Override
	public void changerStrategie() {
	}

	@Override
	public StrategyItf getTypeStrategy() {
		return null;
	}
	

}
