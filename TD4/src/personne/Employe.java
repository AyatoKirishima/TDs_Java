package personne;

public class Employe {
	private Personne employe;
	private int anciennete;
	
	
	@Override
	public String toString() {
		return "Employe [employe=" + employe + ", anciennete=" + anciennete + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employe)) {
			return false;
		}
		Employe other = (Employe) obj;
		if (anciennete != other.anciennete) {
			return false;
		}
		if (employe == null) {
			if (other.employe != null) {
				return false;
			}
		} else if (!employe.equals(other.employe)) {
			return false;
		}
		return true;
	}

	public Personne getEmploye() {
		return employe;
	}
	public void setEmploye(Personne employe) {
		this.employe = employe;
	}
	public int getAnciennete() {
		return anciennete;
	}
	public void setAnciennete(int anciennete) {
		this.anciennete = anciennete;
	}
	
}
