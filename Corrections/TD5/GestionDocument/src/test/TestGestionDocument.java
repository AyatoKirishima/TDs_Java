package test;

import document.Document;
import document.Manuel;
import document.Roman;
import document.Dictionnaire;
import gestionDocument.GestionDocument;

public class TestGestionDocument {

	public static void main(String[] args) {
     
	GestionDocument g=new GestionDocument();
     Document d= new Document("les moulins",5);
     Roman r=new Roman("le sermon sur la chute de Rome", 40, "Jerome Ferrari",1);
     Dictionnaire dico=new Dictionnaire("le petir robert",10,"Française");
     Manuel m=new Manuel("le fil d'Ariane",100,"Odile Marais",6);
     g.add(d); g.add(r); g.add(dico); g.add(m);
     g.afficher();
     g.afficherAuteur();
     
	}

}
