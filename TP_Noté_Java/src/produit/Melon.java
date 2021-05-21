package produit;

public class Melon extends Produit {
	//Variable
	private double calibre;
	private final double calibreMin = 20;
	//private double prixVente;
	

	//Getters and setters
	public double getCalibre() {
		return calibre;
	}

	public void setCalibre(double calibre) {
		this.calibre = calibre;
	}
	
	public double getCalibreMin() {
		return calibreMin;
	}

@Override
	public String toString() {
		return "Melon : idProduit =" +Produit.num +" Calibre = " + calibre;
	}

	public Melon(double calibre) {
	super();
	this.calibre = calibre;
	
	
}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Melon other = (Melon) obj;
		if (Double.doubleToLongBits(calibre) != Double.doubleToLongBits(other.calibre))
			return false;
		if (Double.doubleToLongBits(calibreMin) != Double.doubleToLongBits(other.calibreMin))
			return false;
		return true;
	}

	// Methods
	private double coefCalibre() {
		double coefCalibre = 0;
		if (calibre <= 20 && calibre < 25) {
			coefCalibre = 0.05;
		}
		else if (calibre <= 25 && calibre < 30) {
			coefCalibre = 0.10;
		}
		else if (calibre >= 30) {
			coefCalibre = 0.20;
		}
		return coefCalibre;
	}
	
	private boolean Commercialisable() {
		boolean ok = true;
		if (calibreMin < calibre) {
			ok = false;
		}
		return ok;
	}
	
	public double prixVente() {
		double prixVente = (calibre * coefCalibre());
		return prixVente;
	}
}
