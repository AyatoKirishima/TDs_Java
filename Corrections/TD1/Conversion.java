package Duree;


/** classe de manipulation des heures
 */

public class Conversion {


	  /** Les données h, m, s représentent un horaire : 
	      h heures, m minutes, s secondes.
	      La fonction calcule la durée en secondes que 
	      représente cet horaire.
	      Préconditions : h >= 0, 0 <= m <= 59, 0 <= s <= 59.
	   */
public	static int duree2seconde( int h, int m, int s)
	  {
	    int duree;
	    duree = 3600 * h + 60 * m + s;
	    return duree;
	  }
	  /** retourne une chaine de caractère contenant l'horaire
	      auquel correspond la durée donnée en paramètre
	      Le format de la chaine résultat est h ... min ... s
	      Préconditions : durée >= 0.
	   */
public	static String Seconde2ChaineHMS(int duree)
	  {
	    int heures, minutes, secondes;
	    heures = duree/3600;
	    minutes = duree/60 - 60 * heures;
	    secondes = duree%60 ;
	    return heures+"h"+minutes+"m"+secondes+"s";
	  }
	}


