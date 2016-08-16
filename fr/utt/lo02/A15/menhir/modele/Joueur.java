package fr.utt.lo02.A15.menhir.modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import fr.utt.lo02.A15.menhir.vue.VueTaupeGeante;

/**
 * Classe abstraite et observable qui décrit un joueur au sens le plus général qu'il soit <br>
 * C'est la classe mère de JoueurReel et de JoueurVirtuel
 * 
 * @author alain
 *
 */
public abstract class Joueur extends Observable{
	
	static Scanner sc = new Scanner(System.in);
	
	
	//*********************************************************************
	//LES ATTRIBUTS******************************************************
	private int nbPointsManche;
	private int nbGraines;
	private int nbMenhirs = 0;
	
	private String nom;
	private String joueurCibleTour;
	
	private int idJoueur;
	
	protected int carteChoisieTour;
	protected int actionChoisieTour;
	protected String saisonCourante;
	protected String derniereAction;
	
	List <CartesIngredients> listCartesIngredientsJoueur =new ArrayList<CartesIngredients>();
	//*********************************************************************
	List <CartesAllies> listCartesAllieJoueur =new ArrayList<>();
	
	
	//*********************************************************************
	//LE CONSTRUCTEUR
	/**
	 * Constructeur qui sera appelé par les classes filles à l'aide de la méthode super()
	 * @param nomJoueur
	 * @param partieAvancee
	 * @param id
	 */
	public Joueur(String nomJoueur, Boolean partieAvancee, int id) {
		this.idJoueur = id;
		this.nom = nomJoueur;
		this.nbPointsManche = 0;
		if (!partieAvancee) {
			this.nbGraines = 2;
		}
	}

	/**
	 * Affiche les toutes les cartes ingrédients du joueur
	 * A été conçue pour le mode console
	 * Affiche l'ID unique, le nom et les valeurs pour le Géant, l'Engrais et le Farfadet
	 */
	public void afficherCartesJoueur(){
		for(CartesIngredients elem: listCartesIngredientsJoueur)
	    {
	    	 System.out.println ("NUMERO "+elem.getIdUniq()+" - " +elem.getNomCarteIngredient());
	    	 System.out.println ("1 - Geant : "+elem.getMapForceGeant());
	    	 System.out.println ("2 - Engrais : "+elem.getMapForceEngrais());
	    	 System.out.println ("3 - Farfadet : "+elem.getMapForceFarfadet());
	    }
	}
	
	/**
	 * Affiche les caractéristiques de la carte alliée du joueur
	 * A été conçue pour le mode console
	 */
	public void afficherCarteAllie() {
		System.out.println("NUMERO : "+listCartesAllieJoueur.get(0).getIdUniq()+" - "+listCartesAllieJoueur.get(0).getNomCarteAllie());
		System.out.println("Valeurs : "+listCartesAllieJoueur.get(0).getMapValCarteAllie());
	}
	
	/**
	 * Affiche les caractéristiques de la carte alliée d'un joueur particulier
	 * A été conçue pour le mode console
	 */
	public void afficherCarteAllie(Joueur joueurCourant) {
		System.out.println("NUMERO : "+joueurCourant.listCartesAllieJoueur.get(0).getIdUniq()+" - "+joueurCourant.listCartesAllieJoueur.get(0).getNomCarteAllie());
		System.out.println("Valeurs : "+joueurCourant.listCartesAllieJoueur.get(0).getMapValCarteAllie());
	}
	
	
	public List<CartesIngredients> getListCartesIngredientsJoueur() {
		return listCartesIngredientsJoueur;
	}

	public void setListCartesIngredientsJoueur(
			List<CartesIngredients> listCartesIngredientsJoueur) {
		this.listCartesIngredientsJoueur = listCartesIngredientsJoueur;
	}

	public List<CartesAllies> getListCartesAllieJoueur() {
		return listCartesAllieJoueur;
	}

	public void setListCartesAllieJoueur(List<CartesAllies> listCartesAllieJoueur) {
		this.listCartesAllieJoueur = listCartesAllieJoueur;
	}

	//*********************************************************************
	//LES GETTERS ET SETTERS
	public int getNbPointsManche() {
		return nbPointsManche;
	}
	public void setNbPointsManche(int nbPointsManche) {
		this.nbPointsManche = nbPointsManche;
	}
	public String getNom() {
		return nom;
	}
	public void afficherNom() {
		System.out.println(this.nom);
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getJoueurCibleTour() {
		return joueurCibleTour;
	}
	public void setJoueurCibleTour(String joueurCibleTour) {
		this.joueurCibleTour = joueurCibleTour;
	}
	public int getCarteChoisieTour() {
		return carteChoisieTour;
	}
	public void setCarteChoisieTour(int carteChoisieTour) {
		this.carteChoisieTour = carteChoisieTour;
	}
	public int getActionChoisieTour() {
		return actionChoisieTour;
	}
	public void setActionChoisieTour(int actionChoisieTour) {
		this.actionChoisieTour = actionChoisieTour;
	}
	
	//*********************************************************************

	public String getDerniereAction() {
		return derniereAction;
	}

	public void setDerniereAction(String derniereAction) {
		this.derniereAction = derniereAction;
	}

	//*********************************************************************
	//LES MÉTHODES
	/**
	 * Permet de joueur un tour en mode console <br>
	 * Fait les opérations qu'il faut
	 * @param saisonCourante
	 * @param arrayListJoueurs
	 * @param nbJoueurs
	 */
	public void jouerTour(String saisonCourante, ArrayList <Joueur> arrayListJoueurs, int nbJoueurs) {
		System.out.println("JE SUIS DANS JOUERTOUR");
		
		this.saisonCourante = saisonCourante;
	
		System.out.println("Joueur Courant : "+this.nom);
	}

	/**
	 * Fait jouer un tour à un joueur virtuel <br>
	 * Est appelée depuis la méthode faireJouerJoueursVirtuels <br>
	 * Utilise le patron de conception Strategy <br>
	 * Utilise donc les méthodes choixCarte, choixAction et changerMéthode() de ce patron de conception
	 * @param saisonCourante
	 * @param arrayListJoueurs
	 * @param nbJoueurs
	 */
	public void jouerTourVirtuel(String saisonCourante, ArrayList <Joueur> arrayListJoueurs, int nbJoueurs) {
		System.out.println("Voici les cartes dont vous disposez : ");
		afficherCartesJoueur();
		

		carteChoisieTour = choixCarte(listCartesIngredientsJoueur, this, saisonCourante);
		
		actionChoisieTour = choixAction();
		
		if (actionChoisieTour == 1) {
			utiliserGeant(carteChoisieTour ,saisonCourante, arrayListJoueurs);
		}
		else if (actionChoisieTour == 2) {
			utiliserEngrais(carteChoisieTour ,saisonCourante);
		}
		else if (actionChoisieTour == 3) {
			utiliserFarfadet(carteChoisieTour, saisonCourante, arrayListJoueurs, nbJoueurs);
		}
		
		
		if (saisonCourante == "Hiver") {
			if (!listCartesAllieJoueur.isEmpty()) {
				jeterCarteAllie();
			}
			if (!listCartesIngredientsJoueur.isEmpty()) {
				jeterCartesIngredients();
			}
		}
		
		//On change de strategie s'il le faut
		changerStrategie();
		this.setChanged();
		this.notifyObservers();
	}

	
	/**
	 * Fait tourner les tours des joueurs virtuels <br>
	 * Appelle jouerTourVirtuel() chez chaque joueur <br>
	 * Si nécessaire, affiche une fenêtre proposant d'utiliser la taupe géante au début du tour de chaque joueur <br>
	 * @param saisonCourante
	 * @param arrayListJoueurs
	 * @param nbJoueurs
	 * @param monModelePartie
	 */
	public void faireJouerJoueursVirtuels(String saisonCourante, ArrayList <Joueur> arrayListJoueurs, int nbJoueurs, Partie monModelePartie) {
		boolean carteTaupeUtilisee = false;
		Joueur joueurCourant;
		Iterator <Joueur> it = arrayListJoueurs.iterator();
		while (it.hasNext()) {
			if (monModelePartie.getPartieAvancee() && !monModelePartie.getArrayListJoueurs().get(0).getListCartesAllieJoueur().isEmpty() && carteTaupeUtilisee == false) {
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
		     			carteTaupeUtilisee = true;
		     			VueTaupeGeante vueTaupeGeante = new VueTaupeGeante();
						vueTaupeGeante.init(monModelePartie);
		     		}
				}
			}
			joueurCourant = it.next();
			if (joueurCourant instanceof JoueurVirtuel) {
				joueurCourant.jouerTourVirtuel(saisonCourante, arrayListJoueurs, nbJoueurs);
				this.setChanged();
				this.notifyObservers();
			}
		}
	}
	

	/**
	 * Permet d'utiliser la taupe géante <br>
	 * Détruit un certain nombre de menhirs adultes en fontion de la saison
	 * @param arrayListJoueurs
	 * @param saisonCourante
	 * @param idCible
	 * @param joueurAttaquant
	 */
	public void utiliserTaupeGeante(ArrayList <Joueur> arrayListJoueurs, String saisonCourante, int idCible, Joueur joueurAttaquant) {
		for (Iterator <Joueur> it =  arrayListJoueurs.iterator(); it.hasNext(); ) {
			Joueur joueurCourant = it.next();
			if (joueurCourant.getIdJoueur() == idCible) {
				System.out.println("Ancien nombre de menhirs du joueur "+idCible+" : "+ joueurCourant.getNbMenhirs());
				int nouvNbMenhirs = joueurCourant.getNbMenhirs() - joueurAttaquant.listCartesAllieJoueur.get(0).getMapValCarteAllie(saisonCourante);
				if (nouvNbMenhirs < 0) {
					nouvNbMenhirs = 0;
				}
				joueurCourant.setNbMenhirs(nouvNbMenhirs);
				System.out.println("Nouveau nombre de menhirs du joueur "+idCible+" : "+ joueurCourant.getNbMenhirs());
			}
		}
		joueurAttaquant.listCartesAllieJoueur.remove(0);
	}


	/**
	 * Jette la carte allié du Joueur <br>
	 * Est utilisée en fin de manche, si le joueur n'a pas utilisé sa carte allié
	 */
	public void jeterCarteAllie() {
		listCartesAllieJoueur.clear();
	}
	
	/**
	 * Jette les éventuelles cartes Ingrédients restant du joueur en fin de manche
	 */
	public void jeterCartesIngredients() {
		listCartesIngredientsJoueur.clear();
	}
	
	
	/**
	 * Vérifie si le numéro de carte saisi est légal ou pas
	 * A été pensée pour le mode console
	 * @param tabCartesLeg
	 * @param carteChoisieTour
	 * @return carteOK, un booléen indiquant la validité de la carte
	 */
	public boolean verifCarteLeg(int[] tabCartesLeg, int carteChoisieTour) {
		boolean carteOk = false;
		for (int i=0; i<listCartesIngredientsJoueur.size(); i++) {
			if (carteChoisieTour == tabCartesLeg[i]) {
				carteOk = true;
			}	
		}
		return carteOk;
	}
	
	
	
	/**
	 * Méthode abstraite du design pattern Strategy permettant de choisir une carte
	 * @return ID unique de la carte choisie
	 */
	public abstract int choixCarte();
	
	/**
	 * Méthode abstraite du design pattern Strategy permettant de choisir une action une fois la carte choisie
	 * @return Numéro de l'action
	 */
	public abstract int choixAction();
	
	//Surcharge
	/**
	 * Méthode abstraite du design pattern Strategy permettant de choisir une carte (surchargée)
	 * @return ID unique de la carte choisie
	 */
	public abstract int choixCarte(List <CartesIngredients> listCartesIngredientsJoueur, Joueur j, String saisonCourante);
	
	/**
	 * Méthode abstraite du design pattern Strategy faisant les tests nécessaires pour changer ou pas de stratégie
	 */
	public abstract void changerStrategie();
	
	
	public abstract StrategyItf getTypeStrategy();
	

	/**
	 * Permet d'utiliser le Géant <br>
	 * Ajoute le nombre de graines qu'il faut et jette la carte utilisée
	 * @param carteChoisieTour
	 * @param saisonCourante
	 * @param arrayListJoueurs
	 */
	public void utiliserGeant(int carteChoisieTour, String saisonCourante,  ArrayList <Joueur> arrayListJoueurs) {
		boolean choixLegal = false;
		int valFinASupp = 0;
		
		for (int i=1; i<=24; i++) {
			if (carteChoisieTour == i) {
				int j=0;
				for(CartesIngredients elem: listCartesIngredientsJoueur) {
					if (elem.getIdUniq() == i) {
						System.out.println("Ancien nombre de graines pour le joueur "+(this.idJoueur)+" : "+this.nbGraines);			
						this.nbGraines += elem.getMapForceGeant(saisonCourante);
						this.setChanged();
						this.notifyObservers();
						System.out.println("Nombre de graines ajoutées : "+elem.getMapForceGeant(saisonCourante));
						System.out.println("Nouveau nombre de graines pour le joueur "+(this.idJoueur)+" : "+this.nbGraines);			
						choixLegal = true;
						//On retire la carte utilisée de la main du joueur
						valFinASupp = j;
					}
					j++;
				}
			}
		}
		
		if (choixLegal == false) {
			System.out.println("Vous avez choisi une carte que vous n'avez pas, tant pis pour vous :(");
		}
		else {
			listCartesIngredientsJoueur.remove(valFinASupp);
		}
		derniereAction = "Utilise un Géant";
		this.setChanged();
		this.notifyObservers();
	}
		

	
	/**
	 * Permet d'utiliser l'Engrais
	 * Transforme le nombre de graines qu'il faut en menhirs
	 * Ensuite, jette la carte utilisée
	 * @param carteChoisieTour
	 * @param saisonCourante
	 */
	public void utiliserEngrais(int carteChoisieTour, String saisonCourante) {
		//On récupère d'abord la force de la carte pour l'engrais
		int forceEngrais = 0;
		boolean choixLegal = false;
		int valFinASupp = 0;
		for (int i=1; i<=24; i++) {
			if (carteChoisieTour == i) {
				int j=0;
				for(CartesIngredients elem: listCartesIngredientsJoueur) {					
					if (elem.getIdUniq() == i) {
						forceEngrais = elem.getMapForceEngrais(saisonCourante);
						System.out.println("Nombre de graines que l'on peut transformer en menhirs : "+forceEngrais);
						choixLegal = true;
						valFinASupp = j;
					}
					j++;
				}
			}
		}
		if (choixLegal == false) {
			System.out.println("Vous avez choisi une carte que vous n'avez pas, tant pis pour vous :(");
		}
		else {
			listCartesIngredientsJoueur.remove(valFinASupp);
			if (forceEngrais >= this.nbGraines) {
				this.nbMenhirs += this.nbGraines;
				this.nbGraines = 0;
				System.out.println("Nouveau nombre de menhirs pour le joueur "+(this.idJoueur)+" : "+this.nbMenhirs);
				System.out.println("Nouveau nombre de graines pour le joueur "+(this.idJoueur)+" : "+this.nbGraines);
			}
			else {
				this.nbMenhirs += forceEngrais;
				this.nbGraines -= forceEngrais;
				System.out.println("Nouveau nombre de menhirs pour le joueur "+(this.idJoueur)+" : "+this.nbMenhirs);
				System.out.println("Nouveau nombre de graines pour le joueur "+(this.idJoueur)+" : "+this.nbGraines);
			}
			derniereAction = "Utilise de l'Engrais";
		}
		this.setChanged();
		this.notifyObservers();
	}

	
	
	/**
	 * Permet d'utilsier le Farfadet
	 * Dérobe le nombre de graines qu'il faut au joueur cible et les ajoutes aux graines du joueur
	 * Cette action prend en compte la présence ou non de chien de garde chez le joueur cible
	 * Ensuite, la carte utilisée est jetée
	 * @param carteChoisieTour
	 * @param saisonCourante
	 * @param arrayListJoueurs
	 * @param nbJoueurs
	 */
	public void utiliserFarfadet(int carteChoisieTour, String saisonCourante, ArrayList <Joueur> arrayListJoueurs, int nbJoueurs) {
		//On récupère d'abord la force de la carte
		boolean choixLegal = false;
		int valFinASupp = 0;
		int forceFarfadet = 0;
		for (int i=1; i<=24; i++) {
			if (carteChoisieTour == i) {
				int j=0;
				for(CartesIngredients elem: listCartesIngredientsJoueur) {
					if (elem.getIdUniq() == i) {
						forceFarfadet += elem.getMapForceFarfadet(saisonCourante);
						choixLegal = true;
						//On retire la carte utilisée de la main du joueur
						valFinASupp = j;
					}
					j++;
				}
				
			}
		}
		if (choixLegal == false) {
			System.out.println("Vous avez choisi une carte que vous n'avez pas, tant pis pour vous :(");
		}
		else {
			listCartesIngredientsJoueur.remove(valFinASupp);
			int nbGrainesVolees = 0;
			int idCible =0;
			if (this instanceof JoueurReel) {	
				System.out.println("Veuillez saisir l'ID du joueur cible : ");
				idCible = sc.nextInt();
			}
			else {
				boolean idSelected = false;
				Iterator <Joueur> itPrime = arrayListJoueurs.iterator();
				while (itPrime.hasNext()) {
					Joueur joueurCiblePotentielle = itPrime.next();
					if (idSelected == false) {
						if (joueurCiblePotentielle.getNbGraines() > 0 && joueurCiblePotentielle.getIdJoueur() != this.getIdJoueur()) {
							idCible = joueurCiblePotentielle.getIdJoueur();
							System.out.println("J"+this.getIdJoueur()+" utilise son farfadet contre J"+idCible);
							derniereAction = "Utilise un farfadet contre J"+idCible;
							idSelected = true;
						}
					}
				}
			}
			
			
			
			for(Joueur elem: arrayListJoueurs)
		    {
				int grainesRetirees = 0;
				if (elem.getIdJoueur() == (idCible)) {
					if (elem.getNbGraines() > forceFarfadet) {
						System.out.println("Ancien nombre de graines pour le joueur "+(idCible)+" : "+elem.getNbGraines());
						if (!listCartesAllieJoueur.isEmpty()) {
							//On vérifie s'il a un chien de garde
							if (listCartesAllieJoueur.get(0).getId() == 1) {
								grainesRetirees = forceFarfadet - listCartesAllieJoueur.get(0).getMapValCarteAllie(saisonCourante);
								if (grainesRetirees < 0) {
									grainesRetirees = 0;
								}
								elem.setNbGraines(elem.getNbGraines() - grainesRetirees);
								nbGrainesVolees = forceFarfadet;
								System.out.println("Nombre de graines protegees par le chien de garde : "+listCartesAllieJoueur.get(0).getMapValCarteAllie(saisonCourante));
								System.out.println("Nombre de graines volees au joueur "+(idCible)+" : "+nbGrainesVolees);
								System.out.println("Nouveau nombre de graines pour le joueur "+(idCible)+" : "+elem.getNbGraines());
								//On supprime le chien de garde
								listCartesAllieJoueur.remove(0);
							}
							else {
								elem.setNbGraines(elem.getNbGraines() - forceFarfadet);
								nbGrainesVolees = forceFarfadet;
								System.out.println("Nombre de graines volees au joueur "+(idCible)+" : "+nbGrainesVolees);
								System.out.println("Nouveau nombre de graines pour le joueur "+(idCible)+" : "+elem.getNbGraines());
							}
						}
						else {
						elem.setNbGraines(elem.getNbGraines() - forceFarfadet);
						nbGrainesVolees = forceFarfadet;
						System.out.println("Nombre de graines volees au joueur "+(idCible)+" : "+nbGrainesVolees);
						System.out.println("Nouveau nombre de graines pour le joueur "+(idCible)+" : "+elem.getNbGraines());
						}
					}
					else if (elem.getNbGraines() <= forceFarfadet) {
						System.out.println("Ancien nombre de graines pour le joueur "+(idCible)+" : "+elem.getNbGraines());
						nbGrainesVolees = elem.getNbGraines();
						elem.setNbGraines(0);
						System.out.println("Nombre de graines volees au joueur "+(idCible)+" : "+nbGrainesVolees);
						System.out.println("Nouveau nombre de graines pour le joueur "+(idCible)+" : "+elem.getNbGraines());
					}
				}
		    }
			System.out.println("Ancien nombre de graines pour le joueur "+(this.idJoueur)+" : "+this.nbGraines);
			this.nbGraines += nbGrainesVolees;
			System.out.println("Nouveau nombre de graines pour le joueur "+(this.idJoueur)+" : "+this.nbGraines);					
		}
		this.setChanged();
		this.notifyObservers();
	}

	/**
	 * Permet d'utilsier le Farfadet (surcharge, demande ici en plus l'ID du joueur cible
	 * Dérobe le nombre de graines qu'il faut au joueur cible et les ajoutes aux graines du joueur
	 * Cette action prend en compte la présence ou non de chien de garde chez le joueur cible
	 * Ensuite, la carte utilisée est jetée
	 * @param carteChoisieTour
	 * @param saisonCourante
	 * @param arrayListJoueurs
	 * @param nbJoueurs
	 */
	public void utiliserFarfadet(int carteChoisieTour, String saisonCourante, ArrayList <Joueur> arrayListJoueurs, int nbJoueurs, int idCible) {
		//On récupère d'abord la force de la carte
		derniereAction = "Utilise un farfadet contre J"+idCible;
		boolean choixLegal = false;
		int valFinASupp = 0;
		int forceFarfadet = 0;
		for (int i=1; i<=24; i++) {
			if (carteChoisieTour == i) {
				int j=0;
				for(CartesIngredients elem: listCartesIngredientsJoueur) {
					if (elem.getIdUniq() == i) {
						forceFarfadet += elem.getMapForceFarfadet(saisonCourante);
						choixLegal = true;
						//On retire la carte utilisée de la main du joueur
						valFinASupp = j;
					}
					j++;
				}
				
			}
		}
		if (choixLegal == false) {
			System.out.println("Vous avez choisi une carte que vous n'avez pas, tant pis pour vous :(");
		}
		else {
			listCartesIngredientsJoueur.remove(valFinASupp);
			int nbGrainesVolees = 0;
			int idCibleTour =0;
			if (this instanceof JoueurReel) {	
				System.out.println("Veuillez saisir l'ID du joueur cible : ");
				idCibleTour = idCible;
			}
			else {
				boolean idSelected = false;
				Iterator <Joueur> itPrime = arrayListJoueurs.iterator();
				while (itPrime.hasNext()) {
					Joueur joueurCiblePotentielle = itPrime.next();
					if (idSelected == false) {
						if (joueurCiblePotentielle.getNbGraines() > 0 && joueurCiblePotentielle.getIdJoueur() != this.getIdJoueur()) {
							idCible = joueurCiblePotentielle.getIdJoueur();
							System.out.println("J"+this.getIdJoueur()+" utilise son farfadet contre J"+idCible);
							idSelected = true;
						}
					}
				}
			}
			
			
			
			for(Joueur elem: arrayListJoueurs)
		    {
				int grainesRetirees = 0;
				if (elem.getIdJoueur() == (idCibleTour)) {
					if (elem.getNbGraines() > forceFarfadet) {
						System.out.println("Ancien nombre de graines pour le joueur "+(idCibleTour)+" : "+elem.getNbGraines());
						if (!listCartesAllieJoueur.isEmpty()) {
							//On vérifie s'il a un chien de garde
							if (listCartesAllieJoueur.get(0).getId() == 1) {
								grainesRetirees = forceFarfadet - listCartesAllieJoueur.get(0).getMapValCarteAllie(saisonCourante);
								if (grainesRetirees < 0) {
									grainesRetirees = 0;
								}
								elem.setNbGraines(elem.getNbGraines() - grainesRetirees);
								nbGrainesVolees = forceFarfadet;
								System.out.println("Nombre de graines protegees par le chien de garde : "+listCartesAllieJoueur.get(0).getMapValCarteAllie(saisonCourante));
								System.out.println("Nombre de graines volees au joueur "+(idCibleTour)+" : "+nbGrainesVolees);
								System.out.println("Nouveau nombre de graines pour le joueur "+(idCibleTour)+" : "+elem.getNbGraines());
								//On supprime le chien de garde
								listCartesAllieJoueur.remove(0);
							}
							else {
								elem.setNbGraines(elem.getNbGraines() - forceFarfadet);
								nbGrainesVolees = forceFarfadet;
								System.out.println("Nombre de graines volees au joueur "+(idCibleTour)+" : "+nbGrainesVolees);
								System.out.println("Nouveau nombre de graines pour le joueur "+(idCibleTour)+" : "+elem.getNbGraines());
							}
						}
						else {
						elem.setNbGraines(elem.getNbGraines() - forceFarfadet);
						nbGrainesVolees = forceFarfadet;
						System.out.println("Nombre de graines volees au joueur "+(idCibleTour)+" : "+nbGrainesVolees);
						System.out.println("Nouveau nombre de graines pour le joueur "+(idCibleTour)+" : "+elem.getNbGraines());
						}
					}
					else if (elem.getNbGraines() <= forceFarfadet) {
						System.out.println("Ancien nombre de graines pour le joueur "+(idCibleTour)+" : "+elem.getNbGraines());
						nbGrainesVolees = elem.getNbGraines();
						elem.setNbGraines(0);
						System.out.println("Nombre de graines volees au joueur "+(idCibleTour)+" : "+nbGrainesVolees);
						System.out.println("Nouveau nombre de graines pour le joueur "+(idCibleTour)+" : "+elem.getNbGraines());
					}
				}
		    }
			System.out.println("Ancien nombre de graines pour le joueur "+(this.idJoueur)+" : "+this.nbGraines);
			this.nbGraines += nbGrainesVolees;
			System.out.println("Nouveau nombre de graines pour le joueur "+(this.idJoueur)+" : "+this.nbGraines);					
		}
		this.setChanged();
		this.notifyObservers();
	}
	
	
	
	
	public int getNbGraines() {
		return nbGraines;
	}

	public void setNbGraines(int nbGraines) {
		this.nbGraines = nbGraines;
	}

	public int getNbMenhirs() {
		return nbMenhirs;
	}

	public void setNbMenhirs(int nbMenhirs) {
		this.nbMenhirs = nbMenhirs;
	}

	public int getIdJoueur() {
		return idJoueur;
	}

	public void setIdJoueur(int idJoueur) {
		this.idJoueur = idJoueur;
	}
	
	
	//On fait une méthode static ici pour déterminer le gagnant
	/**
	 * Méthode static permettant de déterminer le gagnant
	 * Est appelée à la toute fin de la partie
	 * @param arrayListJoueurs
	 * @return ID du joueur gagnant
	 */
	public static int determinerGagnant(ArrayList <Joueur> arrayListJoueurs) {
		int idGagnant = arrayListJoueurs.get(0).getIdJoueur();
		int nbMenhirsMax = arrayListJoueurs.get(0).getNbMenhirs();
		int nbGrainesMax = arrayListJoueurs.get(0).getNbGraines();
		Joueur joueurCourant;
		for (Iterator <Joueur> it = arrayListJoueurs.iterator(); it.hasNext(); ) {
			joueurCourant = it.next();
			if (joueurCourant.getNbMenhirs() > nbMenhirsMax) {
				nbMenhirsMax = joueurCourant.getNbMenhirs();
				nbGrainesMax = joueurCourant.getNbGraines();
				idGagnant = joueurCourant.getIdJoueur();
			}
			else if (joueurCourant.getNbMenhirs() == nbMenhirsMax) {
				if (joueurCourant.getNbGraines() > nbGrainesMax) {
					nbMenhirsMax = joueurCourant.getNbMenhirs();
					nbGrainesMax = joueurCourant.getNbGraines();
					idGagnant = joueurCourant.getIdJoueur();
				}
			}
		}
		return idGagnant;
	}
	
}