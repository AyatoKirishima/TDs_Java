package document;

public class Document implements Livraison{
	
	protected String titre ;
	protected double distance;
	/**
	 * @param titre
	 * @param distance
	 */
	public Document(String titre, double distance) {
		this.titre = titre;
		this.distance = distance;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "[\ntitre=" + titre + "\ndistance=" + distance + "\nfrais de Livraison= "+fraisLivraison()+"]";
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Document))
			return false;
		Document other = (Document) obj;
		if (distance != other.distance)
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}
	@Override
	public double fraisLivraison() {
		return fraisfixe+prixunitaire*distance;
	}

}
