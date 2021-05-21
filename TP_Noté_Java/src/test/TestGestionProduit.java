package test;
import gestionProduit.*;
import produit.*;

public class TestGestionProduit {

	public static void main(String[] args) {
		GestionProduit g=new GestionProduit();
		Poulet p = new Poulet(3);
		Melon m = new Melon(30);
		g.add(p);
		g.add(m);
		System.out.println("----------------------------------------------------------\nVoici la liste des produits de la ferme : ");
		g.afficher();
		g.afficherPrixTotal();
		System.out.println("----------------------------------------------------------\nVoici la liste des produits non commerciables :");
		
	}

}
