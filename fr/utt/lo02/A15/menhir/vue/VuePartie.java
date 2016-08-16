package fr.utt.lo02.A15.menhir.vue;

import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import fr.utt.lo02.A15.menhir.modele.Partie;

/**
 * Classe vue intervenant dans le cadre du design pattern MVC <br>
 * Implémente l'interface Observer <br>
 * Permet de visualiser les cartes du joueur
 * @author alain
 *
 */
public class VuePartie extends JFrame implements Observer{
	
	private static final long serialVersionUID = 1L;




	public VuePartie() {
	}
	
	JFrame frame;
	JLabelObserver labelIDPremCarte;
	JLabelObserver labelIDDeuxCarte;
	JLabelObserver labelIDTroisCarte;
	JLabelObserver labelIDQuatCarte;
	JLabelObserver labelSaisonCourante;
	JLabelObserver labelTypePartie;
	JButton buttonCarteUne;
	JButton buttonCarteDeux;
	JButton buttonCarteTrois;
	JButton buttonCarteQuatre;
	JLabelObserver labelNbGrainesJoueurReel;
	JLabelObserver labelNbMenhirsJoueurReel;
	JLabelObserver labelManche;
	JButton buttonTaupeGeante;
	JLabelObserver labelPointsProtectChienGarde;
	JLabelObserver labelTypeCarteAllie;
	
	private int idPremCarte;
	private int idDeuxCarte;
	private int idTroisCarte;
	private int idQuatCarte;
	private int nbGrainesJoueurReel;
	private int nbMenhirsJoueurReel;
	private int numMancheCourante;
	private int nbManches;
	private String saisonCourante;
	
	

	
	public JFrame getFrame() {
		return frame;
	}


	public JButton getButtonCarteUne() {
		return buttonCarteUne;
	}


	public JButton getButtonCarteDeux() {
		return buttonCarteDeux;
	}


	public JButton getButtonCarteTrois() {
		return buttonCarteTrois;
	}


	public JButton getButtonCarteQuatre() {
		return buttonCarteQuatre;
	}


	public JLabelObserver getLabelIDPremCarte() {
		return labelIDPremCarte;
	}


	public JLabelObserver getLabelIDDeuxCarte() {
		return labelIDDeuxCarte;
	}


	public JLabelObserver getLabelIDTroisCarte() {
		return labelIDTroisCarte;
	}

	public JLabelObserver getLabelIDQuatCarte() {
		return labelIDQuatCarte;
	}



	/**
	 * Initialise la fenêtre <br>
	 * Affiche des boutons avec leur numéro ID unique
	 * @param monModelePartie Le modèle partie
	 */
	public void init(Partie monModelePartie) {
		
		frame = new JFrame("Jeu du Menhir - Manche "+monModelePartie.getNumMancheCourante());
		
		idPremCarte = monModelePartie.getArrayListJoueurs().get(0).getListCartesIngredientsJoueur().get(0).getIdUniq();
		labelIDPremCarte = new JLabelObserver("Carte "+idPremCarte);
		idDeuxCarte = monModelePartie.getArrayListJoueurs().get(0).getListCartesIngredientsJoueur().get(1).getIdUniq();
		labelIDDeuxCarte = new JLabelObserver("Carte "+idDeuxCarte);
		idTroisCarte = monModelePartie.getArrayListJoueurs().get(0).getListCartesIngredientsJoueur().get(2).getIdUniq();
		labelIDTroisCarte = new JLabelObserver("Carte "+idTroisCarte);
		idQuatCarte = monModelePartie.getArrayListJoueurs().get(0).getListCartesIngredientsJoueur().get(3).getIdUniq();
		labelIDQuatCarte = new JLabelObserver("Carte "+idQuatCarte);
		nbGrainesJoueurReel = monModelePartie.getArrayListJoueurs().get(0).getNbGraines();
		labelNbGrainesJoueurReel = new JLabelObserver("Nombre de Graines de J1 : "+nbGrainesJoueurReel);
		nbMenhirsJoueurReel = monModelePartie.getArrayListJoueurs().get(0).getNbMenhirs();
		labelNbMenhirsJoueurReel = new JLabelObserver("|||Nombre de Menhirs de J1 : "+nbMenhirsJoueurReel);
		saisonCourante = monModelePartie.getM().getSaisonCourante();
		labelSaisonCourante = new JLabelObserver(saisonCourante);
		numMancheCourante = monModelePartie.getJ();
		nbManches = monModelePartie.getNbManches();
		labelManche = new JLabelObserver("|||Manche : "+numMancheCourante+"/"+nbManches);
		
		buttonCarteUne = new JButton(labelIDPremCarte.getText());
		buttonCarteDeux = new JButton(labelIDDeuxCarte.getText());
		buttonCarteTrois = new JButton(labelIDTroisCarte.getText());
		buttonCarteQuatre = new JButton(labelIDQuatCarte.getText());
		buttonTaupeGeante = new JButton("Utiliser ma Taupe Géante");
		
		
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(buttonCarteUne);
		frame.getContentPane().add(buttonCarteDeux);
		frame.getContentPane().add(buttonCarteTrois);
		frame.getContentPane().add(buttonCarteQuatre);
		
		frame.setVisible(true);
		frame.pack();
		
		//Il faut maintenant ajouter des événements pour chacune des touches
		
	}
	
	
	

	public int getIdPremCarte() {
		return idPremCarte;
	}


	public int getIdDeuxCarte() {
		return idDeuxCarte;
	}


	public int getIdTroisCarte() {
		return idTroisCarte;
	}


	public int getIdQuatCarte() {
		return idQuatCarte;
	}


	@Override
	public void update(Observable o, Object arg) {
	}

}
