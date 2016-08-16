package fr.utt.lo02.A15.menhir.vue;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import fr.utt.lo02.A15.menhir.modele.CartesAllies;
import fr.utt.lo02.A15.menhir.modele.Joueur;
import fr.utt.lo02.A15.menhir.modele.Partie;

/**
 * Classe vue intervenant dans le cadre du design pattern MVC <br>
 * Implémente l'interface Observer <br>
 * Permet de visualiser la taupe géante
 * @author alain
 *
 */
public class VueTaupeGeante implements Observer {

	JFrame frame;
	JLabel labelUtiliserTaupeGeante;
	JLabelObserver labelObsDetailsTaupeGeante;
	JButton buttonUtiliserTaupeGeante;
	JComboBox<Integer> cbIDJoueurCibleTaupeGeante;
	Partie monModelePartie;
	
	
	
	public JFrame getFrame() {
		return frame;
	}

	public JComboBox<Integer> getCbIDJoueurCibleTaupeGeante() {
		return cbIDJoueurCibleTaupeGeante;
	}

	public VueTaupeGeante() {
	}

	
	/**
	 * Initialise la fenêtre <br>
	 * Propose au joueur d'utiliser sa taupe géante <br>
	 * Prend la forme d'une Dialog Box qui s'ouvre à chaque tour, même à celui des autres
	 * @param monModelePartie Le modèle partie
	 */
	public void init(Partie monModelePartie) {
		this.monModelePartie = monModelePartie;
		frame = new JFrame("Utilisez votre taupe géante maintenant !");
		
		
		CartesAllies taupeGeanteDuJoueurReel = monModelePartie.getArrayListJoueurs().get(0).getListCartesAllieJoueur().get(0);
		labelObsDetailsTaupeGeante = new JLabelObserver("<html>NUMERO : "+taupeGeanteDuJoueurReel.getIdUniq()+" - "+taupeGeanteDuJoueurReel.getNomCarteAllie()+"<br> Valeurs : "+taupeGeanteDuJoueurReel.getMapValCarteAllie()+"</html>");
		labelUtiliserTaupeGeante = new JLabel("Souhaitez-vous utiliser votre taupe géante maintenant ? Joueur Cible : ");
		cbIDJoueurCibleTaupeGeante = new JComboBox<Integer>();
   	 	
   	 	if (monModelePartie.getNbJoueurs() == 2) {
   	 		cbIDJoueurCibleTaupeGeante.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2}));
   	 	}
   	 	else if (monModelePartie.getNbJoueurs() == 3) {
   	 		cbIDJoueurCibleTaupeGeante.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2, 3}));
   	 	}
   	 	else if (monModelePartie.getNbJoueurs() == 4) {
   	 		cbIDJoueurCibleTaupeGeante.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2, 3, 4}));
    	 }
   	 	else if (monModelePartie.getNbJoueurs() == 5) {
   	 		cbIDJoueurCibleTaupeGeante.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2, 3, 4, 5}));
   	 	}
   	 	else {
   	 		cbIDJoueurCibleTaupeGeante.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2, 3, 4, 5, 6}));
		}
   	 	buttonUtiliserTaupeGeante = new JButton("Attaquer !");
   	 	buttonUtiliserTaupeGeante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				utiliserTaupeGeante();
			}
		});
   	 	
   	 	
   	 	frame.setLayout(new FlowLayout());
   	 	frame.getContentPane().add(labelObsDetailsTaupeGeante);
   	 	frame.getContentPane().add(labelUtiliserTaupeGeante);
   	 	frame.getContentPane().add(cbIDJoueurCibleTaupeGeante);
   	 	frame.getContentPane().add(buttonUtiliserTaupeGeante);
   	 	
   	 	
   	 	frame.pack();
	 	frame.setVisible(true);
   	 	
	}
	
	
	
	
	/**
	 * Si le joueur choisit d'utiliser sa taupe géante, fait le changements nécessaires
	 */
	protected void utiliserTaupeGeante() {
		ArrayList<Joueur> arrayListJoueurs = monModelePartie.getArrayListJoueurs();
		String saisonCourante = monModelePartie.getM().getSaisonCourante();
		int idCible = (int) this.getCbIDJoueurCibleTaupeGeante().getSelectedItem();
		Joueur joueurAttaquant = monModelePartie.getArrayListJoueurs().get(0);
		monModelePartie.getArrayListJoueurs().get(0).utiliserTaupeGeante(arrayListJoueurs, saisonCourante, idCible, joueurAttaquant);
		//On ferme la fenêtre
		this.getFrame().dispose();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
	}

}
