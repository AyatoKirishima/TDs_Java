
import java.util.Scanner;


public class TestTriTableau {

	public static void main(String[] args) {
	int [] Tab ; int nb ;
	Scanner sc= new Scanner(System.in);
	System.out.println("Entrer la valeur de n");
	nb=sc.nextInt();
	Tab=Lire(nb);
	afficher(Tab); 
	TriTableau(Tab);
	afficher(Tab); 
	StringBuffer x = new StringBuffer("janvier");
	StringBuffer y = new StringBuffer("mars");
	echanger(x,y);
	System.out.println("x ="+x +"et y="+y);
	}
		
	public static int [] Lire (int n)
	{
		Scanner sc= new Scanner(System.in);
		int [] T=new int[n];
		for(int i=0; i<n; i++)
			T[i]=sc.nextInt();
		return T;
	}

	
	
	public static void TriTableau(int [] T)
	{ 
	  for(int i=0; i<T.length-1; i++)
	  for(int j=i+1;j<T.length;j++)
		  if (T[i]>T[j]) echange (T,i,j); 
	}
	
	
	public static void echange(int T[], int i , int j)
	{
		int temp=T[i];
		    T[i]=T[j];
            T[j]=temp;
	}
	
	 static void echanger(StringBuffer s, StringBuffer t) {
	     StringBuffer aux=new StringBuffer(s.toString());
	     s.replace(0, s.length(), t.toString()) ;
	     t.replace(0, t.length(), aux.toString()) ;
	     
	 }
	
	
    public static void afficher(int [] T)
    {
    	for(int i=0; i<T.length; i++)
			System.out.println("T["+i+"]="+T[i]);
    }	
	
}


