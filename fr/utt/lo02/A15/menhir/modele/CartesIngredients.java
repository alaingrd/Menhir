package fr.utt.lo02.A15.menhir.modele;

import java.util.HashMap;
import java.util.Observable;

/**
 * Classe qui décrit une carte Ingerdient <br>
 * 
 * @author alain
 * @version 1.0
 */
public class CartesIngredients extends Observable{

	private String nomCarteIngredient;
	private int id;
	private int idUniq;
	
	HashMap <String, Integer> mapForceGeant = new HashMap <String, Integer>();
	HashMap <String, Integer> mapForceFarfadet = new HashMap <String, Integer>();
	HashMap <String, Integer> mapForceEngrais = new HashMap <String, Integer>();
	
	
	
	//LE CONSTRUCTEUR
	/**
	 * Le constructeur des cartes ingrédients
	 * @param nomCarteIngredient
	 * @param id
	 * @param idUniq
	 */
	public CartesIngredients(String nomCarteIngredient, int id, int idUniq) {
		this.nomCarteIngredient = nomCarteIngredient;
		this.id = id;
		this.idUniq = idUniq;
		this.setChanged();
		this.notifyObservers();
	}
	
	
	//On surcharge les getter pour pouvoir afficher toutes les cartes et si besoin une carte en particulier
	public HashMap<String, Integer> getMapForceGeant() {
		return mapForceGeant;
	}
	
	public HashMap<String, Integer> getMapForceFarfadet() {
		return mapForceFarfadet;
	}
	
	public HashMap<String, Integer> getMapForceEngrais() {
		return mapForceEngrais;
	}
	
	
	public int getMapForceGeant(String saisonCourante) {
		return mapForceGeant.get(saisonCourante);
	}
	public void setMapForceGeant(HashMap<String, Integer> mapForceGeant) {
		this.mapForceGeant = mapForceGeant;
	}
	
	public int getMapForceFarfadet(String saisonCourante) {
		return mapForceFarfadet.get(saisonCourante);
	}
	public void setMapForceFarfadet(HashMap<String, Integer> mapForceFarfadet) {
		this.mapForceFarfadet = mapForceFarfadet;
	}
	public int getMapForceEngrais(String saisonCourante) {
		return mapForceEngrais.get(saisonCourante);
	}
	public void setMapForceEngrais(HashMap<String, Integer> mapForceEngrais) {
		this.mapForceEngrais = mapForceEngrais;
	}
	
	
	
	
	
	public String getNomCarteIngredient() {
		return nomCarteIngredient;
	}
	public void setNomCarteIngredient(String nomCarteIngredient) {
		this.nomCarteIngredient = nomCarteIngredient;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUniq() {
		return idUniq;
	}
	public void setIdUniq(int idUniq) {
		this.idUniq = idUniq;
	}

}
