package td4;

import java.util.Scanner;

public class TestCraps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le nombre de partie");
		int n=sc.nextInt();
		Craps c=new Craps();
		int wins = 0;
		String result;
		
		for (int i=1; i<=n; i++) {		//pour faire n parties
			result=c.jeuCraps();
			if (result=="Gagn�") {
				wins++;
			}
			System.out.println(result);//on affiche le resultat
		}
		System.out.println("Sur "+n+" parties, "+wins+" sont gagnantes");
		System.out.println("Soit "+(float)(wins*100)/n+"% de victoire royale");//on pr�cise qu'on veut un r�sultat float
	}

}








//bvn o mcdo
//pren� votr comende