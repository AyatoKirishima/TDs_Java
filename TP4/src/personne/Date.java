package personne;

public class Date {
	
	private int jour;
	private int mois;
	private int annee;
	
	public Date(int jour, int mois, int annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	@Override
	public String toString() {
		return jour + "/" + mois + "/" + annee;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Date)) {
			return false;
		}
		Date other = (Date) obj;
		if (annee != other.annee) {
			return false;
		}
		if (jour != other.jour) {
			return false;
		}
		if (mois != other.mois) {
			return false;
		}
		return true;
	}

	public int difference(Date d) {
		int nbj = nbJours(this.jour, this.mois, this.annee) - nbJours(d.jour, d.mois, d.annee);
		return nbj;
	}
	
	static int nbJours(int jour, int mois, int annee) {
		return (int)((1461 * (annee + 4800 + (mois - 14) / 12)) / 4 + (367 * (mois - 2 - 12 * ((mois - 14) / 12))) / 12 - (3 * ((annee + 4900 + (mois - 14) / 12) / 100)) / 4 + jour - 32075);
	}
	
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		if (this.jour <= 31 && this.jour >= 1) {
			this.jour = jour;
		}
			
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
}