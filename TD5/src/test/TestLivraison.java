package test;

import librairie.*;

public class TestLivraison {

	public static void main(String[] args) {
		StockDocument st= new StockDocument();
		
		// Définition des variables
		Document d1 = new Document("les moulins",5.0,2.25);
		//Document m2 = new Manuel("le_sermon_sur_la_chute_de_Rome",40.0,"Jerome_Ferrari",1,4.0);
		//Document dic1 = new Dictionnaire("le_petit_robert","Française",2.5);
		Document l4 = new Livre(100,"le_fil_d'Ariane","Odile Marais","Français");
		
		// Ajout des variables dans liste
		st.list.add(d1); 
		//st.list.add(m2);
		//st.list.add(dic1);
		st.list.add(l4);
		//On ajoute dans Document ?
		st.AddDocument(d1);
		//st.AddDocument(m2);
		//st.AddDocument(dic1);
		st.AddDocument(l4);
		
		//Affichage
		System.out.println("Liste : " + d1.toString());
		System.out.println("Liste : " + l4.toString());
		System.out.println(l4.AfficherAuteurs());
	}

}
