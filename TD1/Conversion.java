package Duree;


/** classe de manipulation des heures
 */

public class Conversion {


	  /** Les donn�es h, m, s repr�sentent un horaire : 
	      h heures, m minutes, s secondes.
	      La fonction calcule la dur�e en secondes que 
	      repr�sente cet horaire.
	      Pr�conditions : h >= 0, 0 <= m <= 59, 0 <= s <= 59.
	   */
public	static int duree2seconde( int h, int m, int s)
	  {
	    int duree;
	    duree = 3600 * h + 60 * m + s;
	    return duree;
	  }
	  /** retourne une chaine de caract�re contenant l'horaire
	      auquel correspond la dur�e donn�e en param�tre
	      Le format de la chaine r�sultat est h ... min ... s
	      Pr�conditions : dur�e >= 0.
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


