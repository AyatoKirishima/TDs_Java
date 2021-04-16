package personne;

public class Etudiant {
	private Personne etudiant;
	private String email;
	
	@Override
	public String toString() {
		return "Etudiant [etudiant=" + etudiant + ", email=" + email + "]";
	}
	
	public Personne getEtudiant() {
		return etudiant;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Etudiant)) {
			return false;
		}
		Etudiant other = (Etudiant) obj;
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (etudiant == null) {
			if (other.etudiant != null) {
				return false;
			}
		} else if (!etudiant.equals(other.etudiant)) {
			return false;
		}
		return true;
	}

	public void setEtudiant(Personne etudiant) {
		this.etudiant = etudiant;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
