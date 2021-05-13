import java.util.Random;
import java.util.Scanner;


public class TestMontecarlo {
	/**
	 * @param args
	 * 
	 */
	public static void main(String args[])
	{ double valeurPI;
	  int N ; // nb de points générees dans le carre
	  int n=0; // nb de point à l'intérieur du cercle
	  double x , y ;
	  Scanner sc=new Scanner(System.in);
      System.out.println("Entrer le nombre de point a generer");	
      N=sc.nextInt();
      Random r=new Random();
      for(int i=0;i<N;i++)
      { 
        x=r.nextDouble(); y=r.nextDouble();
        if ((Math.pow(x,2)+ Math.pow(y,2))<1)
        	n=n+1;
      }
	    
		System.out.println("La valeur de n est "+n);
		valeurPI=(double)4*n/N;
		
		System.out.println("La valeur approximative obtenue est "+valeurPI);
		System.out.println("La valeur de Math.PI est "+Math.PI);

		System.out.println("La valeur obtenue est à "+ (valeurPI/Math.PI)*100+"% égale à la valeur de Math.PI");
	}
	
}
