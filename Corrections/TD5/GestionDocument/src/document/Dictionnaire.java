package document;

public class Dictionnaire extends Document {
	private String langue ;

	/**
	 * @param titre
	 * @param distance
	 * @param langue
	 */
	public Dictionnaire(String titre, double distance, String langue) {
		super(titre, distance);
		this.langue = langue;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	@Override
	 public String toString() {
		return "Dictionnaire ["+super.toString()+" langue=" + langue + " , fraisLivraison="+ fraisLivraison()+"]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Dictionnaire))
			return false;
		Dictionnaire other = (Dictionnaire) obj;
		if (langue == null) {
			if (other.langue != null)
				return false;
		} else if (!langue.equals(other.langue))
			return false;
		return true;
	}

	
}
