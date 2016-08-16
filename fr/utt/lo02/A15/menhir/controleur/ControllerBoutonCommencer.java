package fr.utt.lo02.A15.menhir.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import fr.utt.lo02.A15.menhir.modele.Partie;
import fr.utt.lo02.A15.menhir.modele.TaupeGeante;
import fr.utt.lo02.A15.menhir.vue.VueJeu;
import fr.utt.lo02.A15.menhir.vue.VuePartie;
import fr.utt.lo02.A15.menhir.vue.VueTaupeGeante;

/**
 * <html>Classe Controller qui intervient dans le cadre du pattern MVC <br>
 * C'est à partir de ce controller que la partie est configurée et instanciée
 * </html>
 * 
 * @author alain
 * @version 1.0
 */


public class ControllerBoutonCommencer implements ActionListener {

	
	Partie monModelePartie;
	JComboBox<Integer> cbNbJoueurs;
	JComboBox<String> cbTypePartie;
	
	int nbJoueurs;
	boolean partieAvancee;
	
	
	/**
	 * Constructeur du controller permettant d'afficher de créer une partie
	 * @param monModelePartie
	 * @param cbNbJoueurs
	 * @param cbTypePartie
	*/
	public ControllerBoutonCommencer(Partie monModelePartie, JComboBox<Integer> cbNbJoueurs, JComboBox<String> cbTypePartie) {
		this.monModelePartie = monModelePartie;
		this.cbNbJoueurs = cbNbJoueurs;
		this.cbTypePartie = cbTypePartie;
	}
	
	
	/**
	 * Provoque l'instanciation d'une partie et le début de la partie à proprement parlé <br>
	 * Une fenêtre adaptée pour le choix des cartes et une autre pour la présentation des éléments du jeu sont affichées <br>
	 * Si l'utilisateur a choisi une partie avancée, une fenêtre lui demandant de choisir entre deux graines et une carte alliée est affichée
	*/
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.nbJoueurs = (int) cbNbJoueurs.getSelectedItem();
		System.out.println("Je suis dans ActionPerform, il y a "+this.nbJoueurs+" joueurs");
		
		if (cbTypePartie.getSelectedItem() == "Partie Avancée") {
			this.partieAvancee = true;
			System.out.println("C'est une partie avancée");
		}
		else {
			this.partieAvancee = false;
			System.out.println("C'est une partie rapide");
		}
		//On construit finalement la partie
		monModelePartie = new Partie(nbJoueurs, partieAvancee);
		
		monModelePartie.jouerPartie();
		
        if (monModelePartie.getPartieAvancee()) {
        	Object[] options = {"Deux Graines", "Une Carte Alliée"};
     		int n = JOptionPane.showOptionDialog(new JFrame(),
     	    "Que préférez-vous pour commencer la manche ?",
     	    "Choix de début de manche pour une partie avancée",
     	    JOptionPane.YES_NO_OPTION,
     	    JOptionPane.QUESTION_MESSAGE,
     	    null,     
     	    options, 
     	    options[0]); 
     		System.out.println(n);
     		monModelePartie.getM().choisirGraineOuAllie(monModelePartie.getArrayListJoueurs(), monModelePartie.getPartieAvancee(), n);
        }
		
		//On va tenter de lancer la vue partie à partir d'ici
		VuePartie vuePartie = new VuePartie();
		vuePartie.init(monModelePartie);
		
		
		VueJeu vueJeu = new VueJeu(monModelePartie);
		
		//On ajoute un observer
		monModelePartie.getArrayListJoueurs().get(0).addObserver(vueJeu);
		monModelePartie.getArrayListJoueurs().get(1).addObserver(vueJeu);
		
		//On donne les valeurs initiales à la fenêtre
		if (monModelePartie.getPartieAvancee()) {
			vueJeu.getLabelObsTypePartie().setText("Avancée");
		}
		else {
			vueJeu.getLabelObsTypePartie().setText("Rapide");
		}
		//Pour le joueur réel J1
		vueJeu.getLabelObsNbGraines().setText(""+monModelePartie.getArrayListJoueurs().get(0).getNbGraines());
		vueJeu.getLabelObsNbMenhirs().setText(""+monModelePartie.getArrayListJoueurs().get(0).getNbMenhirs());
		//Pour le joueur virtuel J2
		vueJeu.getLabelObsNbGrainesJ2().setText(""+monModelePartie.getArrayListJoueurs().get(1).getNbGraines());
		vueJeu.getLabelObsNbMenhirsJ2().setText(""+monModelePartie.getArrayListJoueurs().get(1).getNbMenhirs());
		//S'il y en a, aussi pour les autres joueurs
		if (monModelePartie.getNbJoueurs()>=3) {
			vueJeu.getLabelObsNbGrainesJ3().setText(""+monModelePartie.getArrayListJoueurs().get(2).getNbGraines());
			vueJeu.getLabelObsNbMenhirsJ3().setText(""+monModelePartie.getArrayListJoueurs().get(2).getNbMenhirs());
			if (monModelePartie.getNbJoueurs()>=4) {
				vueJeu.getLabelObsNbGrainesJ4().setText(""+monModelePartie.getArrayListJoueurs().get(3).getNbGraines());
				vueJeu.getLabelObsNbMenhirsJ4().setText(""+monModelePartie.getArrayListJoueurs().get(3).getNbMenhirs());
				if (monModelePartie.getNbJoueurs()>=5) {
					vueJeu.getLabelObsNbGrainesJ5().setText(""+monModelePartie.getArrayListJoueurs().get(4).getNbGraines());
					vueJeu.getLabelObsNbMenhirsJ5().setText(""+monModelePartie.getArrayListJoueurs().get(4).getNbMenhirs());
					if (monModelePartie.getNbJoueurs()>=6) {
						vueJeu.getLabelObsNbGrainesJ6().setText(""+monModelePartie.getArrayListJoueurs().get(5).getNbGraines());
						vueJeu.getLabelObsNbMenhirsJ6().setText(""+monModelePartie.getArrayListJoueurs().get(5).getNbMenhirs());
					}
				}
			}
		}
		
		//On associe le modele à la vue avec les controllers
		ControllerBoutonCarte controlBCarteUne = new ControllerBoutonCarte(monModelePartie, vuePartie.getIdPremCarte());
		ControllerBoutonCarte controlBCarteDeux = new ControllerBoutonCarte(monModelePartie, vuePartie.getIdDeuxCarte());
		ControllerBoutonCarte controlBCarteTrois = new ControllerBoutonCarte(monModelePartie, vuePartie.getIdTroisCarte());
		ControllerBoutonCarte controlBCarteQuatre = new ControllerBoutonCarte(monModelePartie, vuePartie.getIdQuatCarte());
		
		
		
		//On associe ce controller au bouton avec addActionListener
		vuePartie.getButtonCarteUne().addActionListener(controlBCarteUne);
		vuePartie.getButtonCarteDeux().addActionListener(controlBCarteDeux);
		vuePartie.getButtonCarteTrois().addActionListener(controlBCarteTrois);
		vuePartie.getButtonCarteQuatre().addActionListener(controlBCarteQuatre);
		
		
		if (monModelePartie.getPartieAvancee() && !monModelePartie.getArrayListJoueurs().get(0).getListCartesAllieJoueur().isEmpty()) {
			if (monModelePartie.getArrayListJoueurs().get(0).getListCartesAllieJoueur().get(0) instanceof TaupeGeante) {
				Object[] options = {"Oui", "Non"};
	     		int n = JOptionPane.showOptionDialog(new JFrame(),
	     	    "Voulez-vous utiliser maitenant votre taupe géante ?",
	     	    "Utilisez maintenant votre taupe géante",
	     	    JOptionPane.YES_NO_OPTION,
	     	    JOptionPane.QUESTION_MESSAGE,
	     	    null,     
	     	    options, 
	     	    options[0]);
	     		if (n==0) {
	     			VueTaupeGeante vueTaupeGeante = new VueTaupeGeante();
					vueTaupeGeante.init(monModelePartie);
	     		}
			}
		}
		
	}

}
