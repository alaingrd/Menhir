package fr.utt.lo02.A15.menhir.vue;

import fr.utt.lo02.A15.menhir.controleur.ControllerBoutonCommencer;
import fr.utt.lo02.A15.menhir.modele.Partie;

/**
 * Classe main
 * Permet de lancer la permière fenêtre permettant d'initialiser la partie
 * @author alain
 *
 */
public class MonMain {

	/**
	 * Crée la première vue
	 * Associe le modèle à la vue avec les controller
	 * Associe le controller au bouton avec addActionListener
	 * @param args
	 */
	public static void main(String[] args) {
		AppVue view = new AppVue();
		view.init();
		
		//On fait ruse pour construire la partie
		Partie monModelePartie = new Partie(0, false);
		
		//On associe modele à la vue avec les controller
		ControllerBoutonCommencer controlBCommencer = new ControllerBoutonCommencer(monModelePartie, view.cbNbJoueurs, view.cbTypePartie);
		
		
		//On associe ce controller au bouton avec addActionListener
		view.getButtonCommencer().addActionListener(controlBCommencer);
	}

}
