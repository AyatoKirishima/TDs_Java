package produit;

public class Poulet extends Produit {
	//Variables
	private double poids;
	//constantes
	private final double prixUnKilo = 2.5; 
	private final double poidsMin = 1;
	//private double prixVente;
	
	//Getters and setters
	public double getPoids() {
		return poids;
	}
	
	public void setPoids(double poids) {
		this.poids = poids;
	}
	
	public double getPoidsMin() {
		return poidsMin;
	}

	public double getPrixUnKilo() {
		return prixUnKilo;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poulet other = (Poulet) obj;
		if (Double.doubleToLongBits(poids) != Double.doubleToLongBits(other.poids))
			return false;
		if (Double.doubleToLongBits(poidsMin) != Double.doubleToLongBits(other.poidsMin))
			return false;
		if (Double.doubleToLongBits(prixUnKilo) != Double.doubleToLongBits(other.prixUnKilo))
			return false;
		return true;
	}

	//Constructor
	public Poulet(double poids) {
		super();
		this.poids = poids;
	}

	//Methods
	public boolean Commercialisable() {
		boolean ok = true;
		if(poids < poidsMin) {
			ok = false;
		}
		return ok;
	}
	
	public double prixVente() {
		double prixVente = (poids * prixUnKilo);
		return prixVente;
	}

	@Override
	public String toString() {
		return "Poulet : idProduit =" +Produit.num + " poids=" + poids;
	}
	
	
}
