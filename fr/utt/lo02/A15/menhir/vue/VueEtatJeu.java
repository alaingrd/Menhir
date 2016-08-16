package fr.utt.lo02.A15.menhir.vue;

import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe vue intervenant dans le cadre du design pattern MVC <br>
 * Implémente l'interface Observer <br>
 * Permet de visualiser l'état du jeu
 * @author alain
 *
 */
public class VueEtatJeu extends JFrame implements Observer {
	
	private static final long serialVersionUID = 1L;

	public VueEtatJeu() {
		init();
	}

	JFrame frame;
	JLabel labelPresentTypePartie;
	JLabelObserver labelObsTypePartie;
	JLabel labelPresentMancheCourante;
	JLabelObserver labelObsMancheCourante;
	JLabelObserver labelObsNbManches;
	JLabel labelPresentTourCourant;
	JLabelObserver labelObsTourCourant;
	JLabel labelPresentNbGraines;
	JLabelObserver labelObsNbGraines;
	JLabel labelPresentNbMenhirs;
	JLabelObserver labelObsNbMenhirs;
	
	JLabel labelPresentJoueur;
	JLabelObserver labelObsJoueur;
	
	//Ajouter des Observables et des update là où il faut
	
	/**
	 * Construction de la vue <br>
	 * Affiche le type de partie, la manche courante, le tour courant et le nombre de graines et de menhirs
	 */
	public void init() {
		frame = new JFrame("Jeu du Menhir");
		labelPresentTypePartie = new JLabel("Type de partie : ");
		labelPresentMancheCourante = new JLabel("Manche courante : ");
		labelPresentTourCourant = new JLabel("Tour courant : ");
		labelPresentNbGraines = new JLabel("Nombre de graines : ");
		labelPresentNbMenhirs = new JLabel("Nombre de menhirs : ");
		
		
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(labelPresentTypePartie, BorderLayout.NORTH);
		
		
		frame.setVisible(true);
		frame.pack();
	}
	
	
	
	@Override
	public void update(Observable arg0, Object arg1) {
	}

}
