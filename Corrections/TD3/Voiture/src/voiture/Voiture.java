package voiture;

public class Voiture {

private String marque;
private String modele;
private String numero;
private double prixinitial;
/**
 * @param marque
 * @param modele
 * @param numero
 * @param prixinitial
 */
public Voiture(String marque, String modele, String numero, int prixinitial) {
	super();
	this.marque = marque;
	this.modele = modele;
	this.numero = numero;
	this.prixinitial = prixinitial;
}
/**
 * 
 * @return
 */
public String getMarque() {
	return marque;
}

/**
 * 
 * @param marque
 */
public void setMarque(String marque) {
	this.marque = marque;
}
/**
 * 
 * @return
 */
public String getModele() {
	return modele;
}
/**
 * 
 * @param modele
 */
public void setModele(String modele) {
	this.modele = modele;
}
/**
 * 
 * @return
 */
public String getNumero() {
	return numero;
}
/**
 * 
 * @param numero
 */
public void setNumero(String numero) {
	this.numero = numero;
}
/**
 * 
 * @return
 */
public double getPrixinitial() {
	return prixinitial;
}
/**
 * 
 * @param prixinitial
 */
public void setPrixinitial(double prixinitial) {
	this.prixinitial = prixinitial;
}

/**
 * 
 */
public void afficher() {
	System.out.println("Voiture [marque=" + marque + ", modele=" + modele + ", numero="
			+ numero + ", prixinitial=" + prixinitial + "]");
}
/**
 * 
 * @param taux
 * @return
 */
public double prixReel(double taux)
{
   return prixinitial+prixinitial*taux/100;	
}

}




