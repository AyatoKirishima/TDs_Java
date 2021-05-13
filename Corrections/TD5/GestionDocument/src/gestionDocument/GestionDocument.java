package gestionDocument;

import java.util.ArrayList;
import java.util.Iterator;



import document.Document;
import document.Livre;

public class GestionDocument {

	private ArrayList <Document> tab ;

	/**
	 * @param tab
	 */
	public GestionDocument(ArrayList<Document> tab) {
		this.tab = tab;
	}
	
	
	public GestionDocument() {
		this.tab = new  ArrayList < Document > ();
 
	}
	
	public void add(Document d)
	{
		tab.add(d);
	}
	

	public void afficher()
	{
		Iterator<Document> it=tab.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public void afficherAuteur()
	{
		Iterator<Document> it=tab.iterator();
		while(it.hasNext())
		{   Document d= it.next();
		    if (d instanceof Livre)
		    { Livre l = (Livre) d;	
			  System.out.println(l.getAuteur());
		    }
		 }
		
	}
	
	
}
