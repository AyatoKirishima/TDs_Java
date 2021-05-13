import java.util.Scanner;
/**
 * 
 * @author zidna
 *
 */
public class TestStatistique  {
	static double Tab[]; //
	static int nb;
	/**
	 * 
	 * @param args
	 */
	public static  void main(String[] args){
	LireNotes();
	System.out.println("La moyenne est" + moyenne());
	System.out.println("Le minimum est " + min());
	System.out.println("Le maximum est " + max());
	System.out.println("L'ecart type est " + Ecart());
	}
	/**
	 * Verifier bien que les notes sont valides.
	 */
	public static void LireNotes()  {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Entre le nombre de notes");
		nb=sc.nextInt();
	    Tab=new double[nb];
		for(int i= 0; i<Tab.length; i++)
		{  
			System.out.println(" Entre la"+i+ "nombre de notes");
			Tab[i]=sc.nextDouble();
		}
			
    }
	/**
	 * Retourne la moyenne des notes
	 * @return
	 */
	public static double moyenne() {
		double somme = 0;
		for(int i= 0; i<nb; i++)
		{
			somme= somme+Tab[i];
		}
		return somme/nb;
	}
	/**
	 * Retourne la valeur maximum
	 * @return
	 */
	public static double max() {
		double max=Tab[0];
		for(int i= 1; i<nb; i++)
		{
			if (Tab[i]>max) max=Tab[i];
		}
		return max;
		
	}
	/**
	 * Retourne la valeur minimum
	 * @return
	 */
	public static double min() { 	
	double min=Tab[0];
	for(int i= 1; i<nb; i++)
	{
		if (Tab[i]<min) min=Tab[i];
	}
	return min;
	}
	/**
	 * Retourne l'ecart type
	 * @return
	 */
	public static double Ecart() {
		double sigma;
		double sommecarre=0;
		for(int i= 0; i<nb; i++)
		{
			sommecarre=sommecarre+Math.pow(Tab[i], 2);
		}
		sigma=Math.sqrt(sommecarre/nb-Math.pow(moyenne(),2));
		return sigma;
	}

}
