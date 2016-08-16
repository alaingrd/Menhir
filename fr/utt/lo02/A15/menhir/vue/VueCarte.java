package fr.utt.lo02.A15.menhir.vue;

import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import fr.utt.lo02.A15.menhir.modele.CartesIngredients;
import fr.utt.lo02.A15.menhir.modele.Partie;

/**
 * Classe vue intervenant dans le cadre du design pattern MVC <br>
 * Permet de voir les détails d'une carte
 * @author alain
 *
 */
public class VueCarte extends JFrame implements Observer {

	private static final long serialVersionUID = 1L;



	public VueCarte() {
	}
	
	JFrame frame;
	JLabelObserver labelDetailsCarte;
	JButton buttonUtiliserCarte;
	JLabelObserver labelDemandeActionCarte;
	JComboBox<String> cbActionChoisie;
	JLabel labelDemandeIDJoueurCible;
	JComboBox<Integer> cbIDJoueurCibleFarfadet;
	
	
	
	public JFrame getFrame() {
		return frame;
	}



	/**
	 * Construction de la vue <br>
	 * Ajout des widgets à la fenêtre
	 * @param monModelePartie Le modèle
	 * @param carteAfficher La carte à afficher
	 */
	public void init(Partie monModelePartie, CartesIngredients carteAfficher) {
		
		frame = new JFrame("Détails de la carte "+carteAfficher.getIdUniq());
		
		System.out.println("Je suis dans VueCarte");
		System.out.println ("NUMERO "+carteAfficher.getIdUniq()+" - " +carteAfficher.getNomCarteIngredient());
		System.out.println ("1 - Geant : "+carteAfficher.getMapForceGeant());
		System.out.println ("2 - Engrais : "+carteAfficher.getMapForceEngrais());
   	 	System.out.println ("3 - Farfadet : "+carteAfficher.getMapForceFarfadet());
   	 	
   	 	
   	 	labelDetailsCarte = new JLabelObserver("<html>NUMERO "+carteAfficher.getIdUniq()+" - " +carteAfficher.getNomCarteIngredient()+"<br>1 - Geant : "+carteAfficher.getMapForceGeant()+"<br>2 - Engrais : "+carteAfficher.getMapForceEngrais()+"<br>3 - Farfadet : "+carteAfficher.getMapForceFarfadet()+"</html>");
   	 	labelDemandeActionCarte = new JLabelObserver("Action choisie : ");
   	 	cbActionChoisie = new JComboBox<String>();
   	 	cbActionChoisie.setModel(new DefaultComboBoxModel<String>(new String[] {"Géant", "Engrais", "Farfadet"}));
   	 	buttonUtiliserCarte = new JButton("Utiliser cette carte");
   	 	labelDemandeIDJoueurCible = new JLabel("ID du joueur cible pour le Farfadet : ");
   	 	cbIDJoueurCibleFarfadet = new JComboBox<Integer>();
   	 	
   	 	if (monModelePartie.getNbJoueurs() == 2) {
   	 		cbIDJoueurCibleFarfadet.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2}));
   	 	}
   	 	else if (monModelePartie.getNbJoueurs() == 3) {
   	 		cbIDJoueurCibleFarfadet.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2, 3}));
   	 	}
   	 	else if (monModelePartie.getNbJoueurs() == 4) {
    	 	cbIDJoueurCibleFarfadet.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2, 3, 4}));
    	 }
   	 	else if (monModelePartie.getNbJoueurs() == 5) {
   	 		cbIDJoueurCibleFarfadet.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2, 3, 4, 5}));
   	 	}
   	 	else {
   	 		cbIDJoueurCibleFarfadet.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2, 3, 4, 5, 6}));
		}
   		
   
   	 			
   	 	frame.setLayout(new FlowLayout());
   	 	frame.getContentPane().add(labelDetailsCarte);
   	 	frame.getContentPane().add(labelDemandeActionCarte);
   	 	frame.getContentPane().add(cbActionChoisie);
   	 	frame.getContentPane().add(labelDemandeIDJoueurCible);
   	 	frame.getContentPane().add(cbIDJoueurCibleFarfadet);
   	 	frame.getContentPane().add(buttonUtiliserCarte);
   	 	
   	 	
   	 	frame.pack();
   	 	frame.setVisible(true);
		
		
	}
	
	
	
	
	public JComboBox<String> getCbActionChoisie() {
		return cbActionChoisie;
	}




	public JComboBox<Integer> getCbIDJoueurCibleFarfadet() {
		return cbIDJoueurCibleFarfadet;
	}




	public JLabelObserver getLabelDetailsCarte() {
		return labelDetailsCarte;
	}




	public JButton getButtonUtiliserCarte() {
		return buttonUtiliserCarte;
	}




	@Override
	public void update(Observable arg0, Object arg1) {
	}

}
