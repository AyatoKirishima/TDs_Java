package td4;

public class De {
	private final int MAXFACE=6;//on définis 6 face constantes
	private int valeurFace;
	
	
	public void de() {
		this.valeurFace=1;
	}
	
	
	public int getValeurFace() {
		return valeurFace;
	}
	public void setValeurFace(int valeurFace) {
		this.valeurFace = valeurFace;
	}
	
	
	public void lancer() {
		this.valeurFace = (int) (Math.random()*MAXFACE + 1);//on lance le dé à 6 faces
	}
	
	public void afficher() {
	System.out.println(this.valeurFace);
	}
}
