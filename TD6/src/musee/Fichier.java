package musee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fichier {
	
/**
 * Fonction statique qui traduit un fichier texte en
 * une collection ArrayList de String
 * @param f
 * @return
 * @throws FileNotFoundException
 */
	public static ArrayList<String> get_array_list_from_file(File f)
	throws FileNotFoundException {
		Scanner s;
		ArrayList<String> list = new ArrayList<String>();
		s = new Scanner(f);
		while(s.hasNext()) {
			list.add(s.next());
		}
		s.close();
		return list;
	}
	
/* Fonction statique qui crée une collection d'oeuvres à partir d'un fichier texte */
	public static Musee get_collection_oeuvre(File f)
	throws FileNotFoundException {
		ArrayList<String> l= get_array_list_from_file(f);
		Musee mu = new Musee();
		Iterator<String> it = l.iterator();
		while(it.hasNext())
		{
			Oeuvre o = new Oeuvre(it.next());
			mu.addDocument(o);
		}
		return mu;
	}

}
