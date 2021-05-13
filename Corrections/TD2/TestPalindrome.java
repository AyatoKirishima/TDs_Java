import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * 
 * @author zidna
 *
 */

public class TestPalindrome {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrer la chaine ");
		ch=sc.nextLine();
		String ch2=nettoyer(ch);
		  System.out.println("la chaine sans les delimiteurs est "+ch2);
		if (estunpalindrome(ch2)) 
			  System.out.println("C'est un palindrome ");
		else   System.out.println("Ce n'est pas un palindrome");
    	}	
/**
 * 
 * @param ch
 * @return
 */
	public static String nettoyer(String ch){
		StringTokenizer st = new StringTokenizer(ch," \t\r\n\\!\\'");
		String ch2= "";
		while (st.hasMoreTokens()) 
		  {
		    ch2=ch2.concat(st.nextToken());
		    //System.out.println(st.nextToken());
	      } 
		return ch2;
		}
	/**
	 * 
	 * @param ch
	 * @return
	 */
		
	public static boolean estunpalindrome(String ch){
	 int i=0, j=ch.length()-1;
	 System.out.println("la longuer est "+j);
	 boolean ok =true;
	 while(ok && (i<j))
	 {  
		if (ch.charAt(i)!=ch.charAt(j)) ok=false;
		
		i++; j--;
	 }
	 return ok;
	}

}
