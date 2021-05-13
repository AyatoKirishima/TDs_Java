package compte;

public class Compte {
	private long numero;
	private String nomTitulaire;
	private double solde ;
	/**
	 * @param numero
	 * @param nomTitulaire
	 * @param solde
	 */
	public Compte(long numero, String nomTitulaire, double solde) {
		super();
		this.numero = numero;
		this.nomTitulaire = nomTitulaire;
		this.solde = solde;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getNomTitulaire() {
		return nomTitulaire;
	}
	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	

	public void consulter()
	{
		System.out.println( "Compte [numero=" + numero + ", nomTitulaire=" + nomTitulaire
				+ ", solde=" + solde + "]");
	}

	
	public double seuil()
	{
		return 0;
	}
	
	public void deposer(double d)
	{
		solde = solde + d;
	}

	public void retirer(double d)
	{  if (solde>d)
		solde = solde - d;
	   else System.out.println("Votre solde ne permet le retrait demandé") ;
	}

}
