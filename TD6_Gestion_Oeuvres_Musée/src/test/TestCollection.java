package test;
import java.io.File;
import java.io.FileNotFoundException;
import musee.*;

public class TestCollection {

	public static void main(String[] args) throws FileNotFoundException {
		File f1= new File("././collection.txt");
		Musee mu = new Musee();
	
		mu = Fichier.get_collection_oeuvre(f1);
		mu.afficher();
	}

}
