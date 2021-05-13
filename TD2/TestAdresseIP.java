package main;

import java.util.Scanner;

import FonctionVerif.fonctions;
/**
 * 
 * @author zidna
 *
 */
public class TestAdresseIP {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entrer une chaine de caractères");
		Scanner sc=new Scanner(System.in);
		String s =sc.next();
		String mot[];
		mot=s.split("\\.");
		boolean Ok=true;
		Ok=Ok && (mot.length==4);
		if (Ok)
		{
		int i =0;		
		while( Ok && (i<mot.length))
		{    
			int n = Integer.parseInt(mot[i]);
	        // int i = Integer.valueOf(m);
	    	Ok=Ok && (fonctions.isNumeric(mot[i])) && (0<= n)&&(n <= 255);
	    	i=i+1;
		}
		}
	   if( Ok )  
	   System.out.println("la chaine  : "+s + " est une adresse IP");
	   else System.out.println("la chaine  : "+s + " n'est pas une adresse IP");

	}

}
