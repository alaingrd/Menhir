package fr.utt.lo02.A15.menhir.modele;

import java.util.List;

/**
 * Classe décrivant un joueur virtuel et héritant de Joueur
 * @author alain
 *
 */
public class JoueurVirtuel extends Joueur{
	public StrategyItf typeStrategy;

	/**
	 * Constructeur qui définit par défaut une stratégie offensive pour le joueur virtuel
	 * @param nomJoueur
	 * @param partieAvancee
	 * @param id
	 */
	public JoueurVirtuel(String nomJoueur, Boolean partieAvancee, int id) {
		super(nomJoueur, partieAvancee, id);
		typeStrategy = new OffensiveStrategy();
	}
	
	
	/**
	 * Fait choisir au joueur virtuel une carte <br>
	 * Fait partie du patron de conception Strategy
	 */
	public int choixCarte() {
		return typeStrategy.choixCarte();
	}
	
	/**
	 * Fait choisir au joueur virtuel une action après qu'il ait choisi une carte <br>
	 * Fait partie du patron de conception Strategy
	 */
	public int choixAction() {
		return typeStrategy.choixAction();
	}
	
	
	
	public StrategyItf getTypeStrategy() {
		return typeStrategy;
	}


	public void setTypeStrategy(StrategyItf nouvelleStrategie) {

		typeStrategy = nouvelleStrategie;
	}


	@Override
	/**
	 * Fait choisir au joueur virtuel une carte (surchargé)<br>
	 * Fait partie du patron de conception Strategy
	 */
	public int choixCarte(List<CartesIngredients> listCartesIngredientsJoueur, Joueur j, String saisonCourante) {
		return typeStrategy.choixCarte(listCartesIngredientsJoueur, this, saisonCourante);
	}


	@Override
	/**
	 * Permet de changer de stratégie si nécessaire <br>
	 * Attribue une stratégie défensive au joueur virtuel si son nombre de graines est strictement supérieur à 2 <br>
	 * Est appelée à chaque fin de tour
	 */
	public void changerStrategie() {
		if (this.getNbGraines() > 2) {
			this.setTypeStrategy(new DefensiveStrategy());
			System.out.println("J"+this.getIdJoueur()+" a une strategie defensive.");
		}
		else {
			this.setTypeStrategy(new OffensiveStrategy());
			System.out.println("J"+this.getIdJoueur()+" a une strategie offensive.");
		}
		
	}

}
