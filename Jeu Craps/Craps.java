package td4;

public class Craps {
	private De d1=new De();
	private De d2=new De();

	public De getD1() {		//honnetement, les getters et seters servent � rien ici
		return d1;
	}

	public void setD1(De d1) {
		this.d1 = d1;
	}

	public De getD2() {
		return d2;
	}

	public void setD2(De d2) {
		this.d2 = d2;
	}
	
	public void lanceCraps() {
		d1.lancer();
		d2.lancer();
	}
	
	public void afficheCraps() {
		d1.afficher();
		d2.afficher();
	}
	
	
	public String jeuCraps() {			//pour d�marrer une partie
		lanceCraps();					//on lance les d�s
		String result= new String();
		int s = d1.getValeurFace() + d2.getValeurFace();//total des d�s
		switch(s) {
		case 7:case 11:result="Gagn�";break;		//cas gagnant
		case 2:case 3: case 12:result="Perdu";break;//cas perdant
		default:result=rerollCraps(s);break;		//cas ou on a besoin de relancer les d�s
		}
		return result;
	}
	
	public String rerollCraps(int s) {		//si on a besoin de relancer les d�s
		String result= new String();
		int s2;							//pour stocker le 2e resultat
		do {
			lanceCraps();				//on relance les d�s
			s2=d1.getValeurFace()+d2.getValeurFace();
		}while(s2!=7 && s2!=s);			//on relance tant que le r�sultat n'est pas interressant
		if (s2==7) {
			result="Perdu";
		}
		else {
			result="Gagn�";
		}
		return result;
	}	
}
