package librairie;

public class Document {
//////////////////////////////////////////////////////////////////////
//Variables 
//////////////////////////////////////////////////////////////////////
	
	protected int distance;
	protected String titre;
	protected String auteur;
	protected String langue;
	
//////////////////////////////////////////////////////////////////////
//toString
//////////////////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "Document [distance=" + distance + ", titre=" + titre + ", auteur=" + auteur + ", langue=" + langue
				+ "]";
	}

//////////////////////////////////////////////////////////////////////
//Getters & setters 
//////////////////////////////////////////////////////////////////////
	
	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getLangue() {
		return langue;
	}


	public void setLangue(String langue) {
		this.langue = langue;
	}

//////////////////////////////////////////////////////////////////////
//Constructor
//////////////////////////////////////////////////////////////////////
	
	public Document(int distance, String titre, String auteur, String langue) {
		super();
		this.distance = distance;
		this.titre = titre;
		this.auteur = auteur;
		this.langue = langue;
	}
	
	public double fraisLivraison() {
		return (distance * Livraison.prixUnitaire) + Livraison.fraisFixes;
	}
}
