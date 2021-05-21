package gestionProduit;
import java.util.ArrayList;
import java.util.Iterator;
import produit.*;

public class GestionProduit {
	private ArrayList <Produit> tab;
	
	public GestionProduit(ArrayList<Produit> tab) {
		super();
		this.tab = tab;
	}
	
	public GestionProduit() {
		this.tab = new  ArrayList <Produit>();
 
	}
	
	public void add(Produit p)
	{
		tab.add(p);
	}
	
	public void afficher()
	{
		Iterator<Produit> it=tab.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public void afficherPrixTotal()
	{
		//cette partie peut largement être optimisée
		Iterator<Produit> it=tab.iterator();
		double prixTotal = 0;
		while(it.hasNext())
		{   Produit p= it.next();
		    if (p instanceof Melon)
		    { Melon m = (Melon) p;	
			  prixTotal = m.prixVente() + prixTotal;
			  //System.out.println(prixTotal);
		    }
		 }
		
		Iterator<Produit> it2=tab.iterator();
		double prixTotal2 = 0;
		while(it2.hasNext())
		{   Produit p= it2.next();
		    if (p instanceof Poulet)
		    { Poulet x = (Poulet) p;	
			  prixTotal2 = x.prixVente() + prixTotal2;
			  //System.out.println(prixTotal2);
		    }
		 }
		prixTotal = prixTotal + prixTotal2;
		System.out.println("----------------------------------------------------------\nVoici le prix total des produits commercialisables :\nLe prix des produits commercialisable est : " + prixTotal);
	}
}
