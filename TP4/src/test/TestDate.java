package test;

import java.util.Scanner;

import personne.Date;

public class TestDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez les donnees : ");
		System.out.print("Jour : ");
		int j=sc.nextInt();
		System.out.print("Mois : ");
		int m=sc.nextInt();
		System.out.print("Annee : ");
		int a=sc.nextInt();
		Date d1 = new Date(j, m, a);
		System.out.println("Affichage de la date : " + d1.toString());
	}

}
