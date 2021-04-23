package musee;
import java.util.ArrayList;

public class Musee {
	
//////////////////////////////////////////////////////////////////////
//	Variables 
//////////////////////////////////////////////////////////////////////
	
	public ArrayList<Oeuvre> list;

//////////////////////////////////////////////////////////////////////
//	Methods
//////////////////////////////////////////////////////////////////////
		
	// Méthode d'ajout d'un document // oeuvre
	public void addDocument(Oeuvre file) {
			list.add(file);
		}
		
	// Pour afficher les documents
	public void afficher() {
		/*Iterator <Oeuvre> i = list.iterator();
		while(i.hasNext()) {
			System.out.println("["+i.next()+"]");
		}*/
	
		for(int j =0; j<list.size();j++)
		{
			System.out.println(list.get(j).toString());
		}
	}
	
	public int prixTotal() {
		int prixTotal=0;
		
		for(int j =0; j<list.size();j++)
		{
			prixTotal = prixTotal + list.get(j).getPrix();
		}
		
		return prixTotal;
		
	}

//////////////////////////////////////////////////////////////////////
//	Constructor
//////////////////////////////////////////////////////////////////////
	
	//Demandé pour créer une liste vide
	public Musee()
	{
		list = new ArrayList<>();
	}
	
	/*
	// Création d'une liste vide de documents // autre tp
		
		public StockDocument(){
	        list = new ArrayList<>();

	}*/
}
