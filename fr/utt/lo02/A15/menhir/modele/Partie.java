package fr.utt.lo02.A15.menhir.modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Scanner;

/**
 * Classe observable décrivant une partie
 * @author alain
 *
 */
public class Partie extends Observable{
	
	static Scanner sc = new Scanner(System.in);
	
	//LES ATTRIBUTS******************************************************
	private int nbJoueurs;
	private int nbManches;
	private Boolean partieAvancee;
	
	private Joueur gagnant;
	
	private String vainqueur ="";

	private ArrayList <Joueur> arrayListJoueurs;
	private Manche m;
	//Numero manche courante :
	int j;
	int numMancheCourante = 1;
	//*********************************************************************

	public int getJ() {
		return j;
	}


	
	
	/**
	 * Une manière de récupérer le vainqueur
	 * @return Le vainqueur
	 */
	public String getVainqueur() {
		return vainqueur;
	}




	/**
	 * Une manière de paramétrer le vainqueur
	 * @param vainqueur
	 */
	public void setVainqueur(String vainqueur) {
		this.setChanged();
		this.notifyObservers();
		this.vainqueur = vainqueur;
		this.setChanged();
		this.notifyObservers();
	}


	public int getNumMancheCourante() {
		return numMancheCourante;
	}



	public void setNumMancheCourante(int numMancheCourante) {
		this.numMancheCourante = numMancheCourante;
	}



	//LE CONSTRUCTEUR
	/**
	 * Constructeur de la partie
	 * @param nbJoueurs
	 * @param partieAvancee
	 */
	public Partie(int nbJoueurs, boolean partieAvancee) {
		this.nbJoueurs = nbJoueurs;
		this.partieAvancee = partieAvancee;
	}
	//*********************************************************************

	
	//*********************************************************************
	//LES GETTERS ET LES SETTERS
	public int getNbJoueurs() {
		return nbJoueurs;
	}



	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}



	public int getNbManches() {
		return nbManches;
	}



	public void setNbManches(int nbManches) {
		this.nbManches = nbManches;
	}



	public Boolean getPartieAvancee() {
		return partieAvancee;
	}



	public void setPartieAvancee(Boolean partieAvancee) {
		this.partieAvancee = partieAvancee;
	}



	public Joueur getGagnant() {
		return gagnant;
	}



	public void setGagnant(Joueur gagnant) {
		this.gagnant = gagnant;
	}

	
	//*********************************************************************

	//*********************************************************************
	//NOS MÉTHODES
	/**
	 * Détermine le nombre de manches
	 */
	public void determinerNbManches() {
		if (this.partieAvancee) {
			this.nbManches = this.nbJoueurs;
		}
		else {
			this.nbManches = 1;
		}
	}
	
	/**
	 * Permet de jouer la partie <br>
	 * Crée notamment un tableau de joueurs <br>
	 * Faisait tourner les manches en mode console
	 */
	public void jouerPartie() {
		//Aura besoin de nbJoueurs, nbManches
		
		//Elle commence par créer un tableau de joueur
		
		
		//VERSION HASHSET----------------------------------------------------
		// HashSet declaration - CRÉATION DES JOUEURS
		arrayListJoueurs = new ArrayList<Joueur>();
		//On crée un seul joueur réel qui aura l'ID 1
		//Les autres auront des ID à partir de 2
		arrayListJoueurs.add(new JoueurReel("J"+1, partieAvancee, 1));
		//Création des joueurs Virtuels
		int i;
		for (i=2; i<=this.nbJoueurs; i++) {
			arrayListJoueurs.add(new JoueurVirtuel("J"+i, partieAvancee, i));
		}
		
		
		//Déterminons maintenant le nombre de manches
		determinerNbManches();
		
		System.out.println("---------------DEBUT DE LA PARTIE---------------");
		System.out.println("Il y aura "+nbManches+" manches.");
		
		System.out.println("Les joueurs participants sont les suivants : ");
		Iterator <Joueur> it = arrayListJoueurs.iterator();
		while (it.hasNext()) {
			it.next().afficherNom();
		}
		
		//Ensuite elle crée les manches
		//Finalement, on stocke les anciennes manches pour pouvoir déterminer le gagnant
		m = new Manche();
		for (j=1; j<=this.nbManches; j++) {
			System.out.println("Manche : "+j);
			Pioche.creerCartes();
			Pioche.melangerCartes();
			Pioche.distribuerCartes(arrayListJoueurs);
			//Pour les cartes allies
			Pioche.creerChiensGarde();
			Pioche.creerTaupesGeantes();
			Pioche.remplirCartesAllies();
			Pioche.melangerCartesAllies();
	        m.jouerManche(arrayListJoueurs, nbJoueurs, this.partieAvancee);
		}
	}

	public Manche getM() {
		return m;
	}

	public ArrayList<Joueur> getArrayListJoueurs() {
		return arrayListJoueurs;
	}
	
}