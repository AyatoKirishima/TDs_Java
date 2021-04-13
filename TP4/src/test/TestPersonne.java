package test;

import java.util.Scanner;

import personne.Date;
import personne.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* System.out.println("Entrez les donnees : ");
		System.out.print("Jour : ");
		int j=sc.nextInt();
		System.out.print("Mois : ");
		int m=sc.nextInt();
		System.out.print("Annee : ");
		int a=sc.nextInt(); */
		//System.out.println("Affichage de la date : " + d1.toString());
		// Saisie personne
		System.out.println("Entrez les donnees personne : ");
		System.out.print("Nom : ");
		String nom=sc.next();
		System.out.print("Prenom : ");
		String prenom=sc.next();
		System.out.println("Entrez les donnees date: ");
		System.out.print("Jour : ");
		int j=sc.nextInt();
		System.out.print("Mois : ");
		int m=sc.nextInt();
		System.out.print("Annee : ");
		int a=sc.nextInt(); 
		Date d1 = new Date(j, m, a);
		Personne p1 = new Personne(nom, prenom, d1);
		Personne p2 = new Personne("Nom2","Prénom",d1);
		System.out.println(p1.toString() + p2.toString());
		System.out.println(p1.equals(p2));
		d1 = new Date(13, 05, 2020);
		System.out.println(p1.toString() + p2.toString());
		System.out.println(p1.equals(p2));
	}

}
