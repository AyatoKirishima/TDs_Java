package musee;

import java.util.ArrayList;

public class Oeuvre {
//////////////////////////////////////////////////////////////////////
// Variables 
//////////////////////////////////////////////////////////////////////
	
	private String titre;
	private String artiste;
	private int prix;
	private boolean enPret;
	public ArrayList<Oeuvre> list;

	
//////////////////////////////////////////////////////////////////////	
// Constructor
//////////////////////////////////////////////////////////////////////
	
	public Oeuvre(String titre, String artiste, int prix, boolean enPret) {
		super();
		this.titre = titre;
		this.artiste = artiste;
		this.prix = prix;
		this.enPret = enPret;
	}
	
	

	public Oeuvre(String titre) {
		super();
		this.titre = titre;
	}


//////////////////////////////////////////////////////////////////////
// Equals 
//////////////////////////////////////////////////////////////////////
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Oeuvre)) {
			return false;
		}
		Oeuvre other = (Oeuvre) obj;
		if (artiste == null) {
			if (other.artiste != null) {
				return false;
			}
		} else if (!artiste.equals(other.artiste)) {
			return false;
		}
		if (enPret != other.enPret) {
			return false;
		}
		if (prix != other.prix) {
			return false;
		}
		if (titre == null) {
			if (other.titre != null) {
				return false;
			}
		} else if (!titre.equals(other.titre)) {
			return false;
		}
		return true;
	}

//////////////////////////////////////////////////////////////////////
// Getters & setters 
//////////////////////////////////////////////////////////////////////

	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public String getArtiste() {
		return artiste;
	}



	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}



	public int getPrix() {
		return prix;
	}



	public void setPrix(int prix) {
		this.prix = prix;
	}



	public boolean isEnPret() {
		return enPret;
	}



	public void setEnPret(boolean enPret) {
		this.enPret = enPret;
	}


//////////////////////////////////////////////////////////////////////
// toString
//////////////////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "Oeuvre [titre=" + titre + ", artiste=" + artiste + ", prix=" + prix + ", enPret=" + enPret + "]";
	}	
//////////////////////////////////////////////////////////////////////
}
