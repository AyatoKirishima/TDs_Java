 package document;

public class Manuel extends Livre{
	private int niveau;

	/**
	 * @param titre
	 * @param distance
	 * @param auteur
	 * @param langue
	 */
	public Manuel(String titre, double distance, String auteur, int niveau) {
		super(titre, distance, auteur);
		this.niveau = niveau;
	}

	public int getNiveau() {
		return niveau;
	}

	
	public void setNiveau(String langue) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Manuel["+super.toString()+", niveau=" + niveau + ", fraisLivraison="+fraisLivraison()+ "]";

	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Manuel))
			return false;
		Manuel other = (Manuel) obj;
		if (niveau != other.niveau)
			return false;
		return true;
	}


	

}
