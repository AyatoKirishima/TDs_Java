package document;

public class Livre extends Document{
	private String auteur ;

	/**
	 * @param titre
	 * @param distance
	 * @param auteur
	 */
	public Livre(String titre, double distance, String auteur) {
		super(titre, distance);
		this.auteur = auteur;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "["+super.toString()+", auteur=" + auteur + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Livre))
			return false;
		Livre other = (Livre) obj;
		if (auteur == null) {
			if (other.auteur != null)
				return false;
		} else if (!auteur.equals(other.auteur))
			return false;
		return true;
	}


}
