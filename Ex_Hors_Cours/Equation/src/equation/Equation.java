package equation;

public class Equation {
	public static void main(String[] args) {
		//Definition des Variables
		int nb = 0; //on commence � tester � partir de 0
		int res1 = (nb *8)+7;
		int res2 = (nb*6)+13;
		
		//Test Egalite du Resultat
		for(nb = 0; res1!=res2; nb++) {
			res1 = (nb *8)+7;
			res2 = (nb*6)+13;
			//System.out.println("test " +res1 +" "+res2);
		}
		nb = nb-1; //On retire 1 car on commence � 0, or nb = le nombre d'it�rations
		System.out.println("Les deux �quations sont �gales :\n" +"- Le nombre de d�part utilis� est  " +nb +"\n- Le r�sultat commun est " +res1);
	}
}
