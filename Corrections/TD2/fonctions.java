package FonctionVerif;
/**
 * 
 * @author zidna
 *
 */
public class fonctions {
	/**
	 * 
	 * @param str une chaine de carcatères qui represente 
	 * un adresse IP
	 * @return un booleen qui signifie que la chaine est 
	 * est un nombre entier.
	 */

  	 public static boolean isNumeric(String str)  
	  {  
	    try  
	    {  
	      int d = Integer.parseInt(str);  
	    }  
	    catch(NumberFormatException nfe)  
	    {  
	      return false;  
	    }  
	    return true;  
	  }  
}
