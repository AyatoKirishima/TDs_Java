package automate3;

public class TestAutomate {

	public static void main(String[] args) {
		
		//Automate a = new Automate(0,false, "totototot.titi@titioumato@gmail.com");
		Automate a = new Automate(0,false, "titi.titioumato@gmail.com");

		a.initialiser();
		if (a.isValide()) System.out.println("la mail  est valide");
		else System.out.println("le mail  n'est pas valide");
		System.out.println("=============================");
	}

}
