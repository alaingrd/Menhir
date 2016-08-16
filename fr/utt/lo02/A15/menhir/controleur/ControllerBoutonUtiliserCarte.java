package fr.utt.lo02.A15.menhir.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import fr.utt.lo02.A15.menhir.modele.Joueur;
import fr.utt.lo02.A15.menhir.modele.Partie;
import fr.utt.lo02.A15.menhir.modele.Pioche;
import fr.utt.lo02.A15.menhir.vue.VueCarte;
import fr.utt.lo02.A15.menhir.vue.VuePartie;


/**
 * <html>Classe Controller qui intervient dans le cadre du pattern MVC <br>
 * C'est à l'aide de ce controller qu'une carte peut être utilisée
 * </html>
 * 
 * @author alain
 * @version 1.0
 */
public class ControllerBoutonUtiliserCarte implements ActionListener {
	
	static int numTourCourant = 1;
	static int numMancheCourante = 1;
	
	Partie monModelePartie;
	VueCarte vueCarte;
	private int idCarte;
	private int actionChoisieTour;
	private int idJoueurCibleFarfadet;
	
	String saisonCourante;
	ArrayList <Joueur> arrayListJoueurs;
	int nbJoueurs;

	/**
	 * Constructeur du controller permettant d'utiliser une carte
	 * @param monModelePartie
	 * @param vueCarte
	 * @param idCarte
	*/
	public ControllerBoutonUtiliserCarte(Partie monModelePartie, VueCarte vueCarte, int idCarte) {
		this.monModelePartie = monModelePartie;
		this.vueCarte = vueCarte;
		this.idCarte = idCarte;
	}
	
	
	
	/**
	 * Provoque l'utilisation d'une carte en fonction des choix de l'utilisateur <br>
	 * La vue du jeu est mise à jour 
	*/
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (vueCarte.getCbActionChoisie().getSelectedItem() == "Géant") {
			System.out.println("J'UTILISE LE GEANT");
			this.actionChoisieTour = 1;
		}
		else if (vueCarte.getCbActionChoisie().getSelectedItem() == "Engrais") {
			System.out.println("J'UTILISE L'ENGRAIS");
			this.actionChoisieTour = 2;
		}
		else {
			this.actionChoisieTour = 3;
			this.idJoueurCibleFarfadet = (int) vueCarte.getCbIDJoueurCibleFarfadet().getSelectedItem(); 
			System.out.println("J'UTILISERAI LE FARFADET CONTRE "+this.idJoueurCibleFarfadet);
		}
		System.out.println("ACTION UTILISÉE : "+this.actionChoisieTour);
		
		
		arrayListJoueurs = monModelePartie.getArrayListJoueurs();
		nbJoueurs = monModelePartie.getNbJoueurs();
		
		vueCarte.getFrame().dispose();
		
		
		if (monModelePartie.getNumMancheCourante() <= monModelePartie.getNbManches()) {
			if (monModelePartie.getM().getNumTourCourant() <=4) {
				System.out.println("Manche Courante : "+monModelePartie.getNumMancheCourante()+"/"+monModelePartie.getNbManches());
				System.out.println("Tour Courant : "+monModelePartie.getM().getNumTourCourant()+"/4");
				saisonCourante = monModelePartie.getM().getMapSaison().get(monModelePartie.getM().getNumTourCourant());
				System.out.println("Saison Courante : "+saisonCourante);
				
				
				if (this.actionChoisieTour == 1) {
					monModelePartie.getArrayListJoueurs().get(0).utiliserGeant(idCarte ,saisonCourante, arrayListJoueurs);
				}
				else if (this.actionChoisieTour == 2) {
					monModelePartie.getArrayListJoueurs().get(0).utiliserEngrais(idCarte ,saisonCourante);
				}
				else if (this.actionChoisieTour == 3) {
					monModelePartie.getArrayListJoueurs().get(0).utiliserFarfadet(idCarte, saisonCourante, arrayListJoueurs, nbJoueurs, idJoueurCibleFarfadet);
				}
				//On fait joueur les joueurs virtuels
				monModelePartie.getArrayListJoueurs().get(0).faireJouerJoueursVirtuels(saisonCourante, arrayListJoueurs, nbJoueurs, monModelePartie);
				//On incrémente le numéro du tour actuel
				monModelePartie.getM().setNumTourCourant(monModelePartie.getM().getNumTourCourant() + 1);
				if (monModelePartie.getM().getNumTourCourant() > 4) {
					monModelePartie.getM().setNumTourCourant(1);
					monModelePartie.setNumMancheCourante(monModelePartie.getNumMancheCourante() + 1);
					if (monModelePartie.getNumMancheCourante() > monModelePartie.getNbManches()) {
						int numVainqueur = Joueur.determinerGagnant(arrayListJoueurs);
						System.out.println("Et le gagnant de la partie est :::: J"+numVainqueur+" !");
						if (numVainqueur == 1) {
							monModelePartie.setVainqueur("Joueur J1 !");
						}
						else if (numVainqueur == 2) {
							monModelePartie.setVainqueur("Joueur J2 !");
						}
						else if (numVainqueur == 3) {
							monModelePartie.setVainqueur("Joueur J3 !");
						}
						else if (numVainqueur == 4) {
							monModelePartie.setVainqueur("Joueur J4 !");
						}
						else if (numVainqueur == 5) {
							monModelePartie.setVainqueur("Joueur J5 !");
						}
						else if (numVainqueur == 6) {
							monModelePartie.setVainqueur("Joueur J6 !");
						}
						System.out.println(monModelePartie.getVainqueur());
					}
					else {
						//S'il reste des manches à jouer (partie avancée), on les joue
						//On recrée les cartes et on redistribue
						Pioche.creerCartes();
						Pioche.melangerCartes();
						Pioche.distribuerCartes(monModelePartie.getArrayListJoueurs());
						//Pour les cartes allies
						Pioche.creerChiensGarde();
						Pioche.creerTaupesGeantes();
						Pioche.remplirCartesAllies();
						Pioche.melangerCartesAllies();
						//------------------------------------------------------------
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
						//On jette tout d'abord les cartes alliés s'il en reste
						VuePartie vuePartie = new VuePartie();
						vuePartie.init(monModelePartie);
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
					}
				}
			}
		}
	}

}
