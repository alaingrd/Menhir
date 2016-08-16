package fr.utt.lo02.A15.menhir.modele;

import java.util.HashMap;


/**
 * Classe Abstraite qui décrit une carte alliée <br>
 * C'est la classe mère des classes TaupeGeante et ChienDeGarde <br>
 * Hormis le constructeur, elle ne possède pas de méthode dans la mesure où les comportements de ces deux classes sont très différents
 * 
 * @author alain
 * @version 1.0
 */
public abstract class CartesAllies {
	
	protected HashMap<String, Integer> mapValCarteAllie = new HashMap<String, Integer>();

	private String nomCarteAllie;
	private int id;
	private int idUniq;
	
	//LE CONSTRUCTEUR
	/**
	 * Le constructeur sera appelé par les deux classes filles TaupeGeante et ChienDeGarde à l'aide de super() <br>
	 * C'est en effet le seul point commun dans le comportement de ces deux classes
	 * @param nomCarteAllie
	 * @param id
	 * @param idUniq
	 */
	public CartesAllies(String nomCarteAllie, int id, int idUniq) {
		this.nomCarteAllie = nomCarteAllie;
		this.id = id;
		this.idUniq = idUniq;
	}
	
	
	public HashMap<String, Integer> getMapValCarteAllie() {
		return mapValCarteAllie;
	}

	public void setMapValCarteAllie(HashMap<String, Integer> mapValCarteAllie) {
		this.mapValCarteAllie = mapValCarteAllie;
	}
	
	
	public int getMapValCarteAllie(String saisonCourante) {
		return mapValCarteAllie.get(saisonCourante);
	}

	public String getNomCarteAllie() {
		return nomCarteAllie;
	}

	public void setNomCarteAllie(String nomCarteAllie) {
		this.nomCarteAllie = nomCarteAllie;
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
