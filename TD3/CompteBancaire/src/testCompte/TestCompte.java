package testCompte;

import compte.Compte;

public class TestCompte {

	public static void main(String [] args)
	{
		Compte c1= new Compte(123,"Mr Durand", 1000);
		c1.consulter();
		c1.deposer(100);
		c1.consulter();
		
		Compte c2=new Compte(234,"Mr Dupont", 5500);
		c2.consulter();
		c2.retirer(200);
		c2.consulter();
		
	}
	
}
