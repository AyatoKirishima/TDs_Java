package calculPI;

public class TestcalculPI {
 
	/**
	 * 
	 * @param args
	 */
	public static void main (String args[])
	{
	 double somme = 0;
	 int maxDenom = 100000;
	 for (int i = 1; i<maxDenom ; i = i + 2) {
	   if (i % 4 == 1) 
	      somme = somme+ 1./i;
	    else if (i % 4 == 3) 
	      somme = somme- 1./i;
	   else 
	      System.out.println("The computer has gone crazy?!");
	   
	}
	 double valeurPI= 4*somme;
	 System.out.println("La valeur approximative de Pi obtenue est "+valeurPI);
	 System.out.println("La valeur  de Pi de la librairie math est "+Math.PI);

	 
	 double rapport= (valeurPI/Math.PI)*100;
	 System.out.println("La valeur obtenue approche la valeur de Math.PI a "+rapport);

	 
	 
	}
}
