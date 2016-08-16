package fr.utt.lo02.A15.menhir.vue;

import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * Classe vue intervenant dans le cadre du design pattern MVC <br>
 * Permet d'initialiser une partie
 * @author alain
 *
 */
public class AppVue {
	JFrame frame;
	JButton buttonCommencer;
	JLabel labelNbJoueurs;
	JComboBox<Integer> cbNbJoueurs;
	JLabel labelTypePartie;
	JComboBox<String> cbTypePartie;

	

	public JFrame getFrame() {
		return frame;
	}
	
	
	public JButton getButtonCommencer() {
		return buttonCommencer;
	}
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	/**
	 * Construction de la vue <br>
	 * Ajout des widgets à la fenêtre
	 */
	public void init() {
		//On construit la vue
		frame = new JFrame("Jeu du Menhir - Initialisation");
		buttonCommencer = new JButton("Commencer");
		labelNbJoueurs = new JLabel("Nombre de Joueurs : ");
		cbNbJoueurs = new JComboBox<Integer>();
		cbNbJoueurs.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2, 3, 4, 5, 6}));
		labelTypePartie = new JLabel("Type de Partie : ");
		cbTypePartie = new JComboBox<String>();
		cbTypePartie.setModel(new DefaultComboBoxModel<String>(new String[] {"Partie Rapide", "Partie Avancée"}));
		
		
		
		//On ajoute les widgets à la fenêtre
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(labelNbJoueurs);
		frame.getContentPane().add(cbNbJoueurs);
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(labelTypePartie);
		frame.getContentPane().add(cbTypePartie);
		frame.getContentPane().add(buttonCommencer);
		
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
