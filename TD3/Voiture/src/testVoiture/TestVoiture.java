package testVoiture;

import voiture.Voiture;

public class TestVoiture {

	public static void main(String [] args)
	{
		Voiture v1= new Voiture("Citroen", "Picasso", "123CV57",17500);
		double taux=20.0;
		double prix=v1.prixReel(taux);
		v1.afficher();
		System.out.println("Le prix relle de la voiture v1 est = "+ prix);
		
	}
	
}
