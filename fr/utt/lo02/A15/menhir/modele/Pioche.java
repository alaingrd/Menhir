package fr.utt.lo02.A15.menhir.modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Classe décrivant la pioche <br>
 * Permet notamment de créer les cartes, les mélanger et les distribuer
 */
public class Pioche {

	
	//On utilise une List, il peut en effet y avoir des doublons
	static List <CartesIngredients> listCartesIngredients =new ArrayList<CartesIngredients>();
	static List <ChienDeGarde> listeCartesChienGarde = new ArrayList<ChienDeGarde>();
	static List <TaupeGeante> listeCartesTaupesGeantes = new ArrayList<TaupeGeante>();
	
	//On va constituer une pile de cartes allies
	static List <CartesAllies> listeCartesAllies = new ArrayList<CartesAllies>();
	
	
	/**
	 * Méthode static qui crée les cartes alliés
	 */
	public static void remplirCartesAllies() {
		Iterator <TaupeGeante> it = listeCartesTaupesGeantes.iterator();
		while (it.hasNext()) {
			TaupeGeante carteTaupeCourante = it.next();
			carteTaupeCourante.transfererValeurs();
			listeCartesAllies.add(carteTaupeCourante);
		}
		Iterator <ChienDeGarde> itPrime = listeCartesChienGarde.iterator();
		while (itPrime.hasNext()) {
			ChienDeGarde carteChienCourante = itPrime.next();
			carteChienCourante.transfererValeurs();
			listeCartesAllies.add(carteChienCourante);
		}
	}
	
	
	/**
	 * Méthode static qui mélange le tas de cartes alliés
	 */
	public static void melangerCartesAllies() {
		Collections.shuffle(Pioche.listeCartesAllies);
	}
	
	
	/**
	 * Méthode static permettant d'afficher dans la console les cartes ingrédients du tas
	 */
	public static void afficherCartes(){
		for(CartesIngredients elem: listCartesIngredients)
	    {
	    	 System.out.println (elem.getNomCarteIngredient());
	    	 System.out.println (elem.getMapForceGeant());
	    	 System.out.println (elem.getMapForceEngrais());
	    	 System.out.println (elem.getMapForceFarfadet());
	    }
	}

	/**
	 * Méthode static permettant d'afficher dans la console les chiens de garde du tas
	 */
	public static void afficherChien() {
		for(ChienDeGarde elem: listeCartesChienGarde) {
			System.out.println(elem.getNomCarteAllie());
			System.out.println(elem.getHmChienGarde());
		}
	}
	
	/**
	 * Méthode static permettant d'afficher dans la console les taupes géantes du tas
	 */
	public static void afficherTaupe() {
		for(TaupeGeante elem: listeCartesTaupesGeantes) {
			System.out.println(elem.getNomCarteAllie());
			System.out.println(elem.getHmChienGarde());
		}
	}
	
	/**
	 * Constructeur de la pioche
	 */
	public Pioche() {
		
	}
	
	
	static int i;
	
	public static void transfererVal() {
		
	}
	
	
	/**
	 * Méthode static créant les différentes taupes géantes du jeu <br>
	 * Est inspiré du document PDF décrivant les taupes géantes du jeu
	 */
	public static void creerTaupesGeantes() {
		//Création de la premiere taupe geante
		for (i=1; i<=1; i++) {
			listeCartesTaupesGeantes.add(new TaupeGeante("Taupe Geante", 2, 1));
			Iterator <TaupeGeante> it = listeCartesTaupesGeantes.iterator();
			while (it.hasNext()) {
				TaupeGeante carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapTaupeGeante.put("Printemps", 1);
				}
			}
			it = listeCartesTaupesGeantes.iterator();
			while (it.hasNext()) {
				TaupeGeante carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapTaupeGeante.put("Ete", 1);
				}
			}
			it = listeCartesTaupesGeantes.iterator();
			while (it.hasNext()) {
				TaupeGeante carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapTaupeGeante.put("Automne", 1);
				}
			}
			it = listeCartesTaupesGeantes.iterator();
			while (it.hasNext()) {
				TaupeGeante carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapTaupeGeante.put("Hiver", 1);
				}
			}
		}
		//Création de la deuxième taupe géante
		for (i=1; i<=1; i++) {
			listeCartesTaupesGeantes.add(new TaupeGeante("Taupe Geante", 2, 2));
			Iterator <TaupeGeante> it = listeCartesTaupesGeantes.iterator();
			while (it.hasNext()) {
				TaupeGeante carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapTaupeGeante.put("Printemps", 0);
				}
			}
			it = listeCartesTaupesGeantes.iterator();
			while (it.hasNext()) {
				TaupeGeante carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapTaupeGeante.put("Ete", 2);
				}
			}
			it = listeCartesTaupesGeantes.iterator();
			while (it.hasNext()) {
				TaupeGeante carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapTaupeGeante.put("Automne", 2);
				}
			}
			it = listeCartesTaupesGeantes.iterator();
			while (it.hasNext()) {
				TaupeGeante carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapTaupeGeante.put("Hiver", 0);
				}
			}
		}
		//Création de la troisième taupe géante
		for (i=1; i<=1; i++) {
			listeCartesTaupesGeantes.add(new TaupeGeante("Taupe Geante", 2, 3));
			Iterator <TaupeGeante> it = listeCartesTaupesGeantes.iterator();
			while (it.hasNext()) {
				TaupeGeante carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapTaupeGeante.put("Printemps", 0);
				}
			}
			it = listeCartesTaupesGeantes.iterator();
			while (it.hasNext()) {
				TaupeGeante carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapTaupeGeante.put("Ete", 1);
				}
			}
			it = listeCartesTaupesGeantes.iterator();
			while (it.hasNext()) {
				TaupeGeante carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapTaupeGeante.put("Automne", 2);
				}
			}
			it = listeCartesTaupesGeantes.iterator();
			while (it.hasNext()) {
				TaupeGeante carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapTaupeGeante.put("Hiver", 1);
				}
			}
		}
	}
	
	/**
	 * Méthode static créant les différents chiens de garde du jeu <br>
	 * Est inspiré du document PDF décrivant les chiens de garde du jeu
	 */
	public static void creerChiensGarde() {
		//Création premier chien de garde
		for (i=1; i<=1; i++) {
			listeCartesChienGarde.add(new ChienDeGarde("Chien de Garde", 1, 1));
			Iterator <ChienDeGarde> it = listeCartesChienGarde.iterator();
			while (it.hasNext()) {
				ChienDeGarde carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.hmChienGarde.put("Printemps", 2);
				}
			}
			it = listeCartesChienGarde.iterator();
			while (it.hasNext()) {
				ChienDeGarde carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.hmChienGarde.put("Ete", 0);
				}
			}
			it = listeCartesChienGarde.iterator();
			while (it.hasNext()) {
				ChienDeGarde carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.hmChienGarde.put("Automne", 2);
				}
			}
			it = listeCartesChienGarde.iterator();
			while (it.hasNext()) {
				ChienDeGarde carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.hmChienGarde.put("Hiver", 0);
				}
			}
		}
		//Création du deuxième chien de garde
		for (i=1; i<=1; i++) {
			listeCartesChienGarde.add(new ChienDeGarde("Chien de Garde", 1, 2));
			Iterator <ChienDeGarde> it = listeCartesChienGarde.iterator();
			while (it.hasNext()) {
				ChienDeGarde carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.hmChienGarde.put("Printemps", 1);
				}
			}
			it = listeCartesChienGarde.iterator();
			while (it.hasNext()) {
				ChienDeGarde carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.hmChienGarde.put("Ete", 2);
				}
			}
			it = listeCartesChienGarde.iterator();
			while (it.hasNext()) {
				ChienDeGarde carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.hmChienGarde.put("Automne", 0);
				}
			}
			it = listeCartesChienGarde.iterator();
			while (it.hasNext()) {
				ChienDeGarde carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.hmChienGarde.put("Hiver", 1);
				}
			}
		}
		//Création du troisième chien de garde
		for (i=1; i<=1; i++) {
			listeCartesChienGarde.add(new ChienDeGarde("Chien de Garde", 1, 3));
			Iterator <ChienDeGarde> it = listeCartesChienGarde.iterator();
			while (it.hasNext()) {
				ChienDeGarde carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.hmChienGarde.put("Printemps", 0);
				}
			}
			it = listeCartesChienGarde.iterator();
			while (it.hasNext()) {
				ChienDeGarde carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.hmChienGarde.put("Ete", 1);
				}
			}
			it = listeCartesChienGarde.iterator();
			while (it.hasNext()) {
				ChienDeGarde carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.hmChienGarde.put("Automne", 3);
				}
			}
			it = listeCartesChienGarde.iterator();
			while (it.hasNext()) {
				ChienDeGarde carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.hmChienGarde.put("Hiver", 0);
				}
			}
		}
	}
	
	
	//Il faut une méthode pour créer les cartes
	/**
	 * Méthode static qui crée les cartes ingrédients <br>
	 * Est inspiré du docuement PDF décrivant toutes les cartes ingrédient du jeu
	 */
	public static void creerCartes() {
		//Première carte -> PREMIER RAYON DE LUNE
		//Stratégèmre = utiliser boucle for
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Rayon de Lune", 1, 1));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapForceGeant.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapForceGeant.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapForceGeant.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapForceGeant.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapForceEngrais.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapForceEngrais.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {	
					carteCourante.mapForceEngrais.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {	
					carteCourante.mapForceEngrais.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {	
					carteCourante.mapForceFarfadet.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapForceFarfadet.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapForceFarfadet.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 1) {
					carteCourante.mapForceFarfadet.put("Hiver", 0);
				}
			}
		}
		//Deuxième carte -> DEUXIÈME RAYON DE LUNE
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Rayon de Lune", 1, 2));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapForceGeant.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapForceGeant.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapForceGeant.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapForceGeant.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapForceEngrais.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapForceEngrais.put("Automne", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapForceEngrais.put("Hiver", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapForceFarfadet.put("Printemps", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapForceFarfadet.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapForceFarfadet.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 2) {
					carteCourante.mapForceFarfadet.put("Hiver", 1);
			}
		}
		}
		//Troisième carte -> TROISIÈME RAYON DE LUNE
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Rayon de Lune", 1, 3));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapForceGeant.put("Printemps", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapForceGeant.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapForceGeant.put("Automne", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapForceGeant.put("Hiver", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapForceEngrais.put("Printemps", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapForceEngrais.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapForceEngrais.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapForceEngrais.put("Hiver", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapForceFarfadet.put("Printemps", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapForceFarfadet.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapForceFarfadet.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 3) {
					carteCourante.mapForceFarfadet.put("Hiver", 3);
				}
			}
		}
		//Quatrième carte -> PREMIER CHANT DE SIRÈNE
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Chant de Sirene", 2, 4));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 4) {
					carteCourante.mapForceGeant.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 4) {
					carteCourante.mapForceGeant.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 4) {
					carteCourante.mapForceGeant.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 4) {
					carteCourante.mapForceGeant.put("Hiver", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 4) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 4) {
					carteCourante.mapForceEngrais.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 4) {
					carteCourante.mapForceEngrais.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 4) {
					carteCourante.mapForceEngrais.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 4) {
					carteCourante.mapForceFarfadet.put("Printemps", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 4) {
					carteCourante.mapForceFarfadet.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 4) {
					carteCourante.mapForceFarfadet.put("Automne", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 4) {
					carteCourante.mapForceFarfadet.put("Hiver", 0);
			}
		}
		}
		//Cinquième carte -> DEUXIÈME CHANT DE SIRÈNE
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Chant de Sirene", 2, 5));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 5) {
					carteCourante.mapForceGeant.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 5) {
					carteCourante.mapForceGeant.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 5) {
					carteCourante.mapForceGeant.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 5) {
					carteCourante.mapForceGeant.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 5) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 5) {
					carteCourante.mapForceEngrais.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 5) {
					carteCourante.mapForceEngrais.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 5) {
					carteCourante.mapForceEngrais.put("Hiver", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 5) {
					carteCourante.mapForceFarfadet.put("Printemps", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 5) {
					carteCourante.mapForceFarfadet.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 5) {
					carteCourante.mapForceFarfadet.put("Automne", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 5) {
					carteCourante.mapForceFarfadet.put("Hiver", 2);
			}
		}
		}
		//Sixième carte -> TROISIÈME CHANT DE SIRÈNE
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Chant de Sirene", 2, 6));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 6) {
					carteCourante.mapForceGeant.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 6) {
					carteCourante.mapForceGeant.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 6) {
					carteCourante.mapForceGeant.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 6) {
					carteCourante.mapForceGeant.put("Hiver", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 6) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 6) {
					carteCourante.mapForceEngrais.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 6) {
					carteCourante.mapForceEngrais.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 6) {
					carteCourante.mapForceEngrais.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 6) {
					carteCourante.mapForceFarfadet.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 6) {
					carteCourante.mapForceFarfadet.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 6) {
					carteCourante.mapForceFarfadet.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 6) {
					carteCourante.mapForceFarfadet.put("Hiver", 2);
			}
		}
		}
		//Septième carte -> PREMIER LARMES DE DRYADE
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Larmes de Dryade", 3, 7));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 7) {
					carteCourante.mapForceGeant.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 7) {
					carteCourante.mapForceGeant.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 7) {
					carteCourante.mapForceGeant.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 7) {
					carteCourante.mapForceGeant.put("Hiver", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 7) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 7) {
					carteCourante.mapForceEngrais.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 7) {
					carteCourante.mapForceEngrais.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 7) {
					carteCourante.mapForceEngrais.put("Hiver", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 7) {
					carteCourante.mapForceFarfadet.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 7) {
					carteCourante.mapForceFarfadet.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 7) {
					carteCourante.mapForceFarfadet.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 7) {
					carteCourante.mapForceFarfadet.put("Hiver", 2);
			}
		}
		}
		//Huitième carte -> DEUXIÈME LARMES DE DRYADE
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Larmes de Dryade", 3, 8));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 8) {
					carteCourante.mapForceGeant.put("Printemps", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 8) {
					carteCourante.mapForceGeant.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 8) {
					carteCourante.mapForceGeant.put("Automne", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 8) {
					carteCourante.mapForceGeant.put("Hiver", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 8) {
					carteCourante.mapForceEngrais.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 8) {
					carteCourante.mapForceEngrais.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 8) {
					carteCourante.mapForceEngrais.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 8) {
					carteCourante.mapForceEngrais.put("Hiver", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 8) {
					carteCourante.mapForceFarfadet.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 8) {
					carteCourante.mapForceFarfadet.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 8) {
					carteCourante.mapForceFarfadet.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 8) {
					carteCourante.mapForceFarfadet.put("Hiver", 1);
			}
		}
		}
		//Neuvième carte -> TROISIÈME LARMES DE DRYADE
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Larmes de Dryade", 3, 9));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 9) {
					carteCourante.mapForceGeant.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 9) {
					carteCourante.mapForceGeant.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 9) {
					carteCourante.mapForceGeant.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 9) {
					carteCourante.mapForceGeant.put("Hiver", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 9) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 9) {
					carteCourante.mapForceEngrais.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 9) {
					carteCourante.mapForceEngrais.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 9) {
					carteCourante.mapForceEngrais.put("Hiver", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 9) {
					carteCourante.mapForceFarfadet.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 9) {
					carteCourante.mapForceFarfadet.put("Ete", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 9) {
					carteCourante.mapForceFarfadet.put("Automne", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 9) {
					carteCourante.mapForceFarfadet.put("Hiver", 0);
			}
		}
		}
		//Dixième carte -> PREMIER FONTAINE D'EAU PURE
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Fontaine d'eau pure", 4, 10));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 10) {
					carteCourante.mapForceGeant.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 10) {
					carteCourante.mapForceGeant.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 10) {
					carteCourante.mapForceGeant.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 10) {
					carteCourante.mapForceGeant.put("Hiver", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 10) {
					carteCourante.mapForceEngrais.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 10) {
					carteCourante.mapForceEngrais.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 10) {
					carteCourante.mapForceEngrais.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 10) {
					carteCourante.mapForceEngrais.put("Hiver", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 10) {
					carteCourante.mapForceFarfadet.put("Printemps", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 10) {
					carteCourante.mapForceFarfadet.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 10) {
					carteCourante.mapForceFarfadet.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 10) {
					carteCourante.mapForceFarfadet.put("Hiver", 4);
			}
		}
		}
		//Onzième carte -> DEUXIÈME FONTAINE D'EAU PURE
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Fontaine d'eau pure", 4, 11));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 11) {
					carteCourante.mapForceGeant.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 11) {
					carteCourante.mapForceGeant.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 11) {
					carteCourante.mapForceGeant.put("Automne", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 11) {
					carteCourante.mapForceGeant.put("Hiver", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 11) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 11) {
					carteCourante.mapForceEngrais.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 11) {
					carteCourante.mapForceEngrais.put("Automne", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 11) {
					carteCourante.mapForceEngrais.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 11) {
					carteCourante.mapForceFarfadet.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 11) {
					carteCourante.mapForceFarfadet.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 11) {
					carteCourante.mapForceFarfadet.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 11) {
					carteCourante.mapForceFarfadet.put("Hiver", 3);
			}
		}
		}
		//Douzième carte -> TROISIÈME FONTAINE D'EAU PURE
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Fontaine d'eau pure", 4, 12));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 12) {
					carteCourante.mapForceGeant.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 12) {
					carteCourante.mapForceGeant.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 12) {
					carteCourante.mapForceGeant.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 12) {
					carteCourante.mapForceGeant.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 12) {
					carteCourante.mapForceEngrais.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 12) {
					carteCourante.mapForceEngrais.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 12) {
					carteCourante.mapForceEngrais.put("Automne", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 12) {
					carteCourante.mapForceEngrais.put("Hiver", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 12) {
					carteCourante.mapForceFarfadet.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 12) {
					carteCourante.mapForceFarfadet.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 12) {
					carteCourante.mapForceFarfadet.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 12) {
					carteCourante.mapForceFarfadet.put("Hiver", 3);
			}
		}
		}
		//Treizième carte -> PREMIER POUDRE D'OR
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Poudre d'Or", 5, 13));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 13) {
					carteCourante.mapForceGeant.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 13) {
					carteCourante.mapForceGeant.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 13) {
					carteCourante.mapForceGeant.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 13) {
					carteCourante.mapForceGeant.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 13) {
					carteCourante.mapForceEngrais.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 13) {
					carteCourante.mapForceEngrais.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 13) {	
					carteCourante.mapForceEngrais.put("Automne", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 13) {	
					carteCourante.mapForceEngrais.put("Hiver", 13);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 13) {	
					carteCourante.mapForceFarfadet.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 13) {
					carteCourante.mapForceFarfadet.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 13) {
					carteCourante.mapForceFarfadet.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 13) {
					carteCourante.mapForceFarfadet.put("Hiver", 3);
				}
			}
		}
		//Quatorzième carte -> DEUXIÈME POUDRE D'OR
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Poudre d'Or", 5, 14));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 14) {
					carteCourante.mapForceGeant.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 14) {
					carteCourante.mapForceGeant.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 14) {
					carteCourante.mapForceGeant.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 14) {
					carteCourante.mapForceGeant.put("Hiver", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 14) {
					carteCourante.mapForceEngrais.put("Printemps", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 14) {
					carteCourante.mapForceEngrais.put("Ete", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 14) {
					carteCourante.mapForceEngrais.put("Automne", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 14) {
					carteCourante.mapForceEngrais.put("Hiver", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 14) {
					carteCourante.mapForceFarfadet.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 14) {
					carteCourante.mapForceFarfadet.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 14) {
					carteCourante.mapForceFarfadet.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 14) {
					carteCourante.mapForceFarfadet.put("Hiver", 2);
			}
		}
		}
		//Quinzième carte -> TROISIÈME POUDRE D'OR
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Poudre d'Or", 5, 15));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 15) {
					carteCourante.mapForceGeant.put("Printemps", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 15) {
					carteCourante.mapForceGeant.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 15) {
					carteCourante.mapForceGeant.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 15) {
					carteCourante.mapForceGeant.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 15) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 15) {
					carteCourante.mapForceEngrais.put("Ete", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 15) {
					carteCourante.mapForceEngrais.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 15) {
					carteCourante.mapForceEngrais.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 15) {
					carteCourante.mapForceFarfadet.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 15) {
					carteCourante.mapForceFarfadet.put("Ete", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 15) {
					carteCourante.mapForceFarfadet.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 15) {
					carteCourante.mapForceFarfadet.put("Hiver", 1);
				}
			}
		}
		//Seizième carte -> PREMIER RACINES D'ARC-EN-CIEL
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Racines d'Arc-En-Ciel", 6, 16));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 16) {
					carteCourante.mapForceGeant.put("Printemps", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 16) {
					carteCourante.mapForceGeant.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 16) {
					carteCourante.mapForceGeant.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 16) {
					carteCourante.mapForceGeant.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 16) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 16) {
					carteCourante.mapForceEngrais.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 16) {
					carteCourante.mapForceEngrais.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 16) {
					carteCourante.mapForceEngrais.put("Hiver", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 16) {
					carteCourante.mapForceFarfadet.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 16) {
					carteCourante.mapForceFarfadet.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 16) {
					carteCourante.mapForceFarfadet.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 16) {
					carteCourante.mapForceFarfadet.put("Hiver", 2);
			}
		}
		}
		//Dix-spetième carte -> DEUXIÈME RACINES D'ARC-EN-CIEL
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Racines d'Arc-En-Ciel", 6, 17));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 17) {
					carteCourante.mapForceGeant.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 17) {
					carteCourante.mapForceGeant.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 17) {
					carteCourante.mapForceGeant.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 17) {
					carteCourante.mapForceGeant.put("Hiver", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 17) {
					carteCourante.mapForceEngrais.put("Printemps", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 17) {
					carteCourante.mapForceEngrais.put("Ete", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 17) {
					carteCourante.mapForceEngrais.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 17) {
					carteCourante.mapForceEngrais.put("Hiver", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 17) {
					carteCourante.mapForceFarfadet.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 17) {
					carteCourante.mapForceFarfadet.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 17) {
					carteCourante.mapForceFarfadet.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 17) {
					carteCourante.mapForceFarfadet.put("Hiver", 3);
			}
		}
		}
		//Dix-huitième carte -> TROISIÈME RACINES D'ARC-EN-CIEL
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Racines d'Arc-En-Ciel", 6, 18));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 18) {
					carteCourante.mapForceGeant.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 18) {
					carteCourante.mapForceGeant.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 18) {
					carteCourante.mapForceGeant.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 18) {
					carteCourante.mapForceGeant.put("Hiver", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 18) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 18) {
					carteCourante.mapForceEngrais.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 18) {
					carteCourante.mapForceEngrais.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 18) {
					carteCourante.mapForceEngrais.put("Hiver", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 18) {
					carteCourante.mapForceFarfadet.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 18) {
					carteCourante.mapForceFarfadet.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 18) {
					carteCourante.mapForceFarfadet.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 18) {
					carteCourante.mapForceFarfadet.put("Hiver", 2);
			}
		}
		}
		//Dix-neuvième carte -> PREMIER ESPRIT DE DOLMEN
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Esprit de Dolmen", 7, 19));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 19) {
					carteCourante.mapForceGeant.put("Printemps", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 19) {
					carteCourante.mapForceGeant.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 19) {
					carteCourante.mapForceGeant.put("Automne", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 19) {
					carteCourante.mapForceGeant.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 19) {
					carteCourante.mapForceEngrais.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 19) {
					carteCourante.mapForceEngrais.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 19) {
					carteCourante.mapForceEngrais.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 19) {
					carteCourante.mapForceEngrais.put("Hiver", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 19) {
					carteCourante.mapForceFarfadet.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 19) {
					carteCourante.mapForceFarfadet.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 19) {
					carteCourante.mapForceFarfadet.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 19) {
					carteCourante.mapForceFarfadet.put("Hiver", 2);
			}
		}
		}
		//Vingtième carte -> DEUXIÈME ESPRIT DE DOLMEN
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Esprit de Dolmen", 7, 20));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 20) {
					carteCourante.mapForceGeant.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 20) {
					carteCourante.mapForceGeant.put("Ete", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 20) {
					carteCourante.mapForceGeant.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 20) {
					carteCourante.mapForceGeant.put("Hiver", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 20) {
					carteCourante.mapForceEngrais.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 20) {
					carteCourante.mapForceEngrais.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 20) {
					carteCourante.mapForceEngrais.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 20) {
					carteCourante.mapForceEngrais.put("Hiver", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 20) {
					carteCourante.mapForceFarfadet.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 20) {
					carteCourante.mapForceFarfadet.put("Ete", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 20) {
					carteCourante.mapForceFarfadet.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 20) {
					carteCourante.mapForceFarfadet.put("Hiver", 1);
			}
		}
		}
		//Vingt-et-unième carte -> TROISIÈME ESPRIT DE DOLMEN
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Esprit de Dolmen", 7, 21));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 21) {
					carteCourante.mapForceGeant.put("Printemps", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 21) {
					carteCourante.mapForceGeant.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 21) {
					carteCourante.mapForceGeant.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 21) {
					carteCourante.mapForceGeant.put("Hiver", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 21) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 21) {
					carteCourante.mapForceEngrais.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 21) {
					carteCourante.mapForceEngrais.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 21) {
					carteCourante.mapForceEngrais.put("Hiver", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 21) {
					carteCourante.mapForceFarfadet.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 21) {
					carteCourante.mapForceFarfadet.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 21) {
					carteCourante.mapForceFarfadet.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 21) {
					carteCourante.mapForceFarfadet.put("Hiver", 3);
			}
		}
		}
		//Vingt-deuxième carte -> PREMIER RIRES DE FÉES
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Rires de Fees", 8, 22));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 22) {
					carteCourante.mapForceGeant.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 22) {
					carteCourante.mapForceGeant.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 22) {
					carteCourante.mapForceGeant.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 22) {
					carteCourante.mapForceGeant.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 22) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 22) {
					carteCourante.mapForceEngrais.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 22) {
					carteCourante.mapForceEngrais.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 22) {
					carteCourante.mapForceEngrais.put("Hiver", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 22) {
					carteCourante.mapForceFarfadet.put("Printemps", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 22) {
					carteCourante.mapForceFarfadet.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 22) {
					carteCourante.mapForceFarfadet.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 22) {
					carteCourante.mapForceFarfadet.put("Hiver", 2);
			}
		}
		}
		//Vingt-troisième carte -> DEUXIÈME RIRES DE FEES
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Rires de Fees", 8, 23));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 23) {
					carteCourante.mapForceGeant.put("Printemps", 4);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 23) {
					carteCourante.mapForceGeant.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 23) {
					carteCourante.mapForceGeant.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 23) {
					carteCourante.mapForceGeant.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 23) {
					carteCourante.mapForceEngrais.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 23) {
					carteCourante.mapForceEngrais.put("Ete", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 23) {
					carteCourante.mapForceEngrais.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 23) {
					carteCourante.mapForceEngrais.put("Hiver", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 23) {
					carteCourante.mapForceFarfadet.put("Printemps", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 23) {
					carteCourante.mapForceFarfadet.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 23) {
					carteCourante.mapForceFarfadet.put("Automne", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 23) {
					carteCourante.mapForceFarfadet.put("Hiver", 3);
			}
		}
		}
		//Vingt-quatrième carte -> TROISIÈME RIRES DE FÉES
		for (i=1; i<=1; i++) {
			listCartesIngredients.add(new CartesIngredients("Rires de Fees", 8, 24));
			Iterator <CartesIngredients> it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 24) {
					carteCourante.mapForceGeant.put("Printemps", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 24) {
					carteCourante.mapForceGeant.put("Ete", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 24) {
					carteCourante.mapForceGeant.put("Automne", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 24) {
					carteCourante.mapForceGeant.put("Hiver", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 24) {
					carteCourante.mapForceEngrais.put("Printemps", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 24) {
					carteCourante.mapForceEngrais.put("Ete", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 24) {
					carteCourante.mapForceEngrais.put("Automne", 0);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 24) {
					carteCourante.mapForceEngrais.put("Hiver", 3);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 24) {
					carteCourante.mapForceFarfadet.put("Printemps", 1);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 24) {
					carteCourante.mapForceFarfadet.put("Ete", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 24) {
					carteCourante.mapForceFarfadet.put("Automne", 2);
				}
			}
			it = listCartesIngredients.iterator();
			while (it.hasNext()) {
				CartesIngredients carteCourante = it.next();
				if (carteCourante.getIdUniq() == 24) {
					carteCourante.mapForceFarfadet.put("Hiver", 1);
			}
		}
		}
}

	
	

	/**
	 * Méthode static qui mélange le tas de cartes ingrédient formé
	 * @return Un tas de cartes ingrédient mélangé
	 */
	public static ArrayList<CartesIngredients> melangerCartes() {
		Collections.shuffle(Pioche.listCartesIngredients);
		return (ArrayList<CartesIngredients>) listCartesIngredients;
	}
	
	/**
	 * Méthode static qui distribue les cartes ingrédient aux joueurs
	 * @param arrayListJoueurs
	 */
	public static void distribuerCartes(ArrayList <Joueur> arrayListJoueurs) {
		for (i=0; i<4; i++){
			Iterator <Joueur> it = arrayListJoueurs.iterator();
			while (it.hasNext()) {
					it.next().listCartesIngredientsJoueur.add(listCartesIngredients.get(0));
					listCartesIngredients.remove(0);
				}
		}		
	}
	
	/**
	 * Méthode static qui distribue une carte allié à un joueur en particulier qui l'a demandé
	 * @param j
	 */
	public static void distribuerCarteAllie(Joueur j) {
		j.listCartesAllieJoueur.add(listeCartesAllies.get(0));
		listeCartesAllies.remove(0);
	}
	
	
}
	