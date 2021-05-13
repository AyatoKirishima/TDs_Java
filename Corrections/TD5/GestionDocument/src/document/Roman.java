package document;

public class Roman extends Livre {
 private int prixlitterraire;



/**
 * @param titre
 * @param distance
 * @param auteur
 * @param prixlitterraire
 */
public Roman(String titre, double distance, String auteur, int prixlitterraire) {
	super(titre, distance, auteur);
	this.prixlitterraire = prixlitterraire;
}
 
public int getPrixlitterraire() {
	return prixlitterraire;
}


public void setPrixlitterraire(int prixlitterraire) {
	this.prixlitterraire = prixlitterraire;
}

@Override
public String toString() {
	return "Roman["+super.toString()+ ", prix littérraire= "+prixlitterraire+ ", fraix de livraison=" + fraisLivraison()+"]";
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (!(obj instanceof Roman))
		return false;
	Roman other = (Roman) obj;
	if (prixlitterraire != other.prixlitterraire)
		return false;
	return true;
}






 
}
