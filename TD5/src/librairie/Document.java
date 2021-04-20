package librairie;

public class Document {
//////////////////////////////////////////////////////////////////////
//Variables 
//////////////////////////////////////////////////////////////////////
	
	protected double distance;
	protected String titre;
	protected String auteur;
	protected String langue;
	protected double frais;
	
//////////////////////////////////////////////////////////////////////
//toString
//////////////////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "Document [distance=" + distance + ", titre=" + titre + ", auteur=" + auteur + ", langue=" + langue + ", frais=" + frais + "]";
	}
	
	public String AfficherAuteurs() {
		return "[" + auteur + /*" , " + auteur +*/ "]";
	}

//////////////////////////////////////////////////////////////////////
//Getters & setters 
//////////////////////////////////////////////////////////////////////
	
	public double getDistance() {
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
	
	public Document(String titre, double distance, double frais) {
		this.titre = titre;
		this.distance = distance;
		this.frais = frais;
	}

	public double fraisLivraison() {
		return (distance * Livraison.prixUnitaire) + Livraison.fraisFixes;
	}
}
