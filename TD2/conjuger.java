import java.util.Scanner;


public class conjuger {
	
	static String replaceLast(String motif, String partie, String remplacement)
	{
	  int index = motif.lastIndexOf(partie);
	  if (index == -1)
	    return motif;
	  return motif.substring(0, index) + remplacement
	          + motif.substring(index+partie.length());
	}
    
	public static void main(String[] args) {
		String pronom[]={"je","tu","il","nous","vous", "ils"};
		String terminaison[]={"e","es","e","ons","ez", "ent"};

		String verbe ;
		String term="er";
		Scanner sc= new Scanner(System.in);
		do{
		System.out.println("Entrer un verbe du premier groupe");
		verbe= sc.next();
		} while (verbe.equals(term));	
		
     for(int i=0; i<6;i++)
     {
       System.out.println(pronom[i]+" "+ replaceLast(verbe,"er",terminaison[i]));	 
     }
     }
	

}
