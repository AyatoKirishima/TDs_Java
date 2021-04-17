package librairie;

public class Livre extends Document {
//////////////////////////////////////////////////////////////////////
//Variables 
//////////////////////////////////////////////////////////////////////

protected int distance;
protected String titre;
protected String auteur;
protected String langue;

//////////////////////////////////////////////////////////////////////
//Constructor
//////////////////////////////////////////////////////////////////////

public Livre(int distance, String titre, String auteur, String langue) {
	super(distance, langue, langue, langue);
	this.distance = distance;
	this.titre = titre;
	this.auteur = auteur;
	this.langue = langue;
}

//////////////////////////////////////////////////////////////////////
//toString
//////////////////////////////////////////////////////////////////////

@Override
public String toString() {
	return "Livre [distance=" + distance + ", titre=" + titre + ", auteur=" + auteur + ", langue=" + langue + "]";
}

//////////////////////////////////////////////////////////////////////
//Getters & setters 
//////////////////////////////////////////////////////////////////////

public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public String getLangue() {
	return langue;
}
public void setLangue(String langue) {
	this.langue = langue;
}


}
