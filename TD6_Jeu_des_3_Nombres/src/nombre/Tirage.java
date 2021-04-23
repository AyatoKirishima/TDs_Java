package nombre;

public class Tirage {
//////////////////////////////////////////////////////////////////////
//Variables 
//////////////////////////////////////////////////////////////////////
	
	private int valeurLance;
	
	public int getValeurLance() {
		return valeurLance;
	}

	public void setValeurLance(int valeurFace) {
		this.valeurLance = valeurFace;
	}

//////////////////////////////////////////////////////////////////////
//Methods
//////////////////////////////////////////////////////////////////////
	
	private int lance() {
		int max = 9;
		int min = 0;
		int nombreAleatoire = min + (int)(Math.random() * ((max - min) + 1));
		return nombreAleatoire;
	}
	
	//public String jeu() {
		
	//}
}
