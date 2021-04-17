package librairie;

public class Roman extends Livre {
//////////////////////////////////////////////////////////////////////
//Variables 
//////////////////////////////////////////////////////////////////////

private int distance;
private String titre;
private String auteur;
private String langue;

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

//////////////////////////////////////////////////////////////////////
//toString
//////////////////////////////////////////////////////////////////////

@Override
public String toString() {
	return "Roman [distance=" + distance + ", titre=" + titre + ", auteur=" + auteur + ", langue=" + langue + "]";
}

//////////////////////////////////////////////////////////////////////
//Constructor
//////////////////////////////////////////////////////////////////////

public Roman(int distance, String titre, String auteur, String langue, int distance2, String titre2, String auteur2,
		String langue2) {
	super(distance, titre, auteur, langue);
	distance = distance2;
	titre = titre2;
	auteur = auteur2;
	langue = langue2;
}
}
