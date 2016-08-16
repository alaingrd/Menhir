package fr.utt.lo02.A15.menhir.vue;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

import fr.utt.lo02.A15.menhir.modele.Joueur;

/**
 * Classe permettant de rendre un JLabel en particulier observer <br>
 * Hérite de JLabel et implémente Observer <br>
 * Changé d'idée en rendant la fenêtre entière observer <br>
 * M'a permis de savoir plus facilement qui sont les observers
 * @author alain
 *
 */
public class JLabelObserver extends JLabel implements Observer {

	private static final long serialVersionUID = 1L;

	public JLabelObserver(String l) {
		super(l);
	}
	
	@Override
	//Sera appelé quand observé dira "au fait j'ai changé"
	/**
	 * Méthode update du design pattern Observer-Observable
	 * Sera appelé quand l'observé dira "au fait j'ai changé"
	 */
	public void update(Observable arg0, Object arg1) {
		Joueur joueurObserve = (Joueur) arg0;
		this.setText(""+joueurObserve.getNbGraines());
	}

}