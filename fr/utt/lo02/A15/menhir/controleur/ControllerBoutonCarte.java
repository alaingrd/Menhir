package fr.utt.lo02.A15.menhir.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.utt.lo02.A15.menhir.modele.CartesIngredients;
import fr.utt.lo02.A15.menhir.modele.Partie;
import fr.utt.lo02.A15.menhir.vue.VueCarte;


/**
 * <html>Classe Controller qui intervient dans le cadre du pattern MVC <br>
 * On va afficher une fenêtre avec toutes les infos sur la carte et on demande  à l'utilisates'il veut l'utiliser
 * </html>
 * 
 * @author alain
 * @version 1.0
 */
public class ControllerBoutonCarte implements ActionListener {

	Partie monModelePartie;
	private int idCarte;
	private CartesIngredients carteAfficher;
	
	/**
	 * Constructeur du controller permettant d'afficher une carte
	 * @param monModelePartie
	 * @param idCarte
	*/
	public ControllerBoutonCarte(Partie monModelePartie, int idCarte) {
		this.monModelePartie = monModelePartie;
		this.idCarte = idCarte;
	}
	
	
	/**
	 * Affiche une fenêtre avec toutes les infos sur la carte et on demande s'il veut l'utiliser
	 * Les modalités d'association avec le modèle et la vue sont respectées
	*/
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//On va afficher une fenêtre avec toutes les infos sur la carte et on demande s'il veut l'utiliser
		int i = 0;
		int idCourant;
		boolean carteTrouvee = false;
		
		while (carteTrouvee == false) {
			if (monModelePartie.getArrayListJoueurs().get(0).getListCartesIngredientsJoueur().get(i) != null) {
				idCourant = monModelePartie.getArrayListJoueurs().get(0).getListCartesIngredientsJoueur().get(i).getIdUniq();
				if (idCarte == idCourant) {
					System.out.println(monModelePartie.getArrayListJoueurs().get(0).getListCartesIngredientsJoueur().get(i).getNomCarteIngredient());
					carteAfficher = monModelePartie.getArrayListJoueurs().get(0).getListCartesIngredientsJoueur().get(i);
					VueCarte vueCarte = new VueCarte();
					vueCarte.init(monModelePartie, carteAfficher);
					
					//On associe le modele à la vue avec les controllers
					ControllerBoutonUtiliserCarte controlBUtiliserCarte = new ControllerBoutonUtiliserCarte(monModelePartie, vueCarte, idCarte);
					
					//On associe ce controller au bouton avec addActionListener
					vueCarte.getButtonUtiliserCarte().addActionListener(controlBUtiliserCarte);
					carteTrouvee = true;
				}
			}
			i++;
		}
		
	}

}
