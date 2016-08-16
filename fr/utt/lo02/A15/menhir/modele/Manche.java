package fr.utt.lo02.A15.menhir.modele;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Observable;
import java.util.Scanner;



/**
 * Classe observable décrivant une manche
 * @author alain
 *
 */
public class Manche extends Observable {
	static Scanner sc = new Scanner(System.in);

	//LES ATTRIBUTS******************************************************
	private String saisonCourante;
	private int numTourCourant = 1;
	static int curseurJoueur = 0;
	//*********************************************************************
	
	static int idJoueurTour = 0;
	
	
	
	

	public int getNumTourCourant() {
		return numTourCourant;
	}


	public void setNumTourCourant(int numTourCourant) {
		this.numTourCourant = numTourCourant;
		this.setChanged();
		this.notifyObservers();
	}

	//On utilise plutôt une HashMap pour les saisons
	//On ne peut pas utiliser de type primitif dans une map (pas de int)
	//Utiliser type Objet associé -> Integer
	HashMap <Integer, String> mapSaison = new LinkedHashMap<Integer, String>();
	/**
	 * Crée les saisons dans une HashMap
	 */
	public void remplissageSaisons() {
		mapSaison.put(1, "Printemps");
		mapSaison.put(2, "Ete");
		mapSaison.put(3, "Automne");
		mapSaison.put(4, "Hiver");
	}
	
	
	public HashMap<Integer, String> getMapSaison() {
		return mapSaison;
	}


	//*********************************************************************
	//LE CONSTRUCTEUR
	public Manche() {
			
	}
	//*********************************************************************

	//*********************************************************************
	//LES GETTERS ET SETTERS
	public String getSaisonCourante() {
		return saisonCourante;
	}

	public void setSaisonCourante(String saisonCourante) {
		this.saisonCourante = saisonCourante;
	}
	//*********************************************************************

	/**
	 * Fait choisir une carte Allié ou deux Graines aux joueurr réel et virtuels <br>
	 * Est appelée au début de chaque manche dans le cas d'une partie avancée
	 * @param arrayListJoueurs
	 * @param partieAvancee
	 * @param choixDuJoueurReel
	 */
	public void choisirGraineOuAllie(ArrayList <Joueur> arrayListJoueurs, boolean partieAvancee, int choixDuJoueurReel) {
		if (partieAvancee) {
			int choix;
			int i=1;
			Iterator <Joueur> it = arrayListJoueurs.iterator();
			while (it.hasNext()) {
					 Joueur joueurCourant = it.next();
					 if (joueurCourant instanceof JoueurReel) {
						 System.out.println("J"+i+", Veuillez faire une choix ::::: 1 - Une carte Allie ||| ou ||| 2 - Deux graines");
						 if (choixDuJoueurReel == 1) {
							 Pioche.distribuerCarteAllie(joueurCourant);
							 System.out.println("Le joueur réel J"+i+" a choisi une carte allie");
							 joueurCourant.afficherCarteAllie();
						 }
						 else if (choixDuJoueurReel == 0){
							 joueurCourant.setNbGraines(2);
							 System.out.println("Le joueur réel J"+i+" a choisi deux graines");
						 }
					 }
					 else {
						 choix = 1 + (int)(Math.random()*2);
						 if (choix == 1) {
							 Pioche.distribuerCarteAllie(joueurCourant);
							 System.out.println("Le joueur virtuel J"+i+" a choisi une carte allie");
							 joueurCourant.afficherCarteAllie();
						 }
						 else {
							 joueurCourant.setNbGraines(2);
							 System.out.println("Le joueur virtuel J"+i+" a choisi deux graines");
						 }
					 }
					 i++;
			}
		}
		else {
			System.out.println("Il s'agit d'une partie rapide, vous n'avez pas le choix entre une graine et un allie");
		}
	}
	
	
	//*********************************************************************
	//NOS MÉTHODES
	/**
	 * Fait tourner les tours et les saisons lorsque le jeu fonctionnait en mode console uniquement
	 * @param arrayListJoueurs
	 * @param nbJoueurs
	 * @param partieAvancee
	 */
	public void jouerManche(ArrayList <Joueur> arrayListJoueurs, int nbJoueurs, boolean partieAvancee) {
		
		//CRÉATION ET DISTRIBUTION DES CARTES DÉJÀ FAITE DANS jouerPartie(), AU BON ENDROIT
		
		remplissageSaisons();
		
		//Il ne faut pas que le programme demande quelque chose, on doit lui donner !
		//Sinon la fenêtre bloque

		int i;
		//On faisait tourner les tours ici, avant que l'on ne mette en place l'interface graphique
		//Il faut appeler la méthode jouerTour chez chacun des joueurs
		//On va tenter d'utilier Iterator
		for(i=1; i<=4; i++)
		{
			
			saisonCourante = mapSaison.get(i);
		}
	}
	
	

}