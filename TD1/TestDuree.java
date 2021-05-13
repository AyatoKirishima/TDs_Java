package main;

import java.util.Scanner;

import Duree.Conversion;

public class TestDuree {
	
	  public static void main(String args[])
	  {
	    int h, m, s, duree;
	    String hor;
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Saisie d'un horaire");
	    System.out.println("Donnez les heures");
	    
	    h = sc.nextInt();
	    System.out.println("Donnez les minutes");
	    m = sc.nextInt();
	    System.out.println(" Donnez les secondes");
	    s =sc.nextInt();
	    duree = Conversion.duree2seconde(h,m,s);
	    System.out.println(" Cet horaire dure" + duree + " secondes.");
	    hor = Conversion.Seconde2ChaineHMS(duree);
	    System.out.println(" L'horaire de départ est" + hor);
	  }
	}

