package automate3;

public class Automate {
	
  private int compteur ;
  private boolean valide;
  private String ch;
  
  
public Automate(int compteur, boolean valide, String ch) {
	super();
	this.compteur = compteur;
	this.valide = valide;
	this.ch = ch;
}

public int getCompteur() {
	return compteur;
}
public void setCompteur(int compteur) {
	this.compteur = compteur;
}
public boolean isValide() {
	return valide;
}
public void setValide(boolean valide) {
	this.valide = valide;
}
public String getCh() {
	return ch;
}
public void setCh(String ch) {
	this.ch = ch;
}

/**
 * ===============================
 *  Fonction initialiser 
 * ===============================
 */

public void initialiser()
{
	compteur = 0;
	valide = false ;
	q0();
}

/**
 * ===============================
 *  Fonction q0() 
 * =============================== 
 */
public void q0(){
	System.out.println("Je suis en q0");
	if ( compteur < ch.length()){ 
	if  ( Character.isLetter(ch.charAt(compteur)) )
	{ 		compteur++;  q1() ;} 
	else if  ((ch.charAt(compteur)=='.') || (ch.charAt(compteur)=='@') )
	{ qError();}
	}
}	
	
	/**
	 * ===============================
	 *  Fonction q1() 
	 * =============================== 
	 */
	public void q1(){
		System.out.println("Je suis en q1");
		if ( compteur < ch.length()){ 
		if  ( Character.isLetter(ch.charAt(compteur)) )
		{ compteur++;  q1() ;}
		else if ( (ch.charAt(compteur)=='.'))
		{ compteur++; q2(); }
		else if  ((ch.charAt(compteur)=='@'))
		{ qError();}
		}
	}
	
	
	/**
	 * ===============================
	 *  Fonction q2() 
	 * =============================== 
	 */
	public void q2(){
		System.out.println("Je suis en q2");
		if ( compteur < ch.length()){ 
		if  ( Character.isLetter(ch.charAt(compteur)) )
		{ compteur++;  q3() ;}
		else if ( (ch.charAt(compteur)=='@')||(ch.charAt(compteur)=='.'))
		{ qError();}
		}	
	}
	
	/**
	 * ===============================
	 *  Fonction q3() 
	 * =============================== 
	 */
	public void q3(){
		System.out.println("Je suis en q3");
		if ( compteur < ch.length()){ 
		if  ( Character.isLetter(ch.charAt(compteur)) )
		{ compteur++;  q3() ;}
		else if ( (ch.charAt(compteur)=='@'))
		{ compteur++; q4(); }
		else if  ((ch.charAt(compteur)=='.'))
		{ qError();}
		}	
	}	
	
	/**
	 * ===============================
	 *  Fonction q4() 
	 * =============================== 
	 */
	public void q4(){
		System.out.println("Je suis en q4");
		if ( compteur < ch.length()){ 
		
		if ( (ch.charAt(compteur)=='g'))
		{ compteur++; q5(); }
		else 
		{ qError();}
		}	
	}	
	
	/**
	 * ===============================
	 *  Fonction q5() 
	 * =============================== 
	 */
	public void q5(){
		System.out.println("Je suis en q5");
		if ( compteur < ch.length()){ 
		if ( (ch.charAt(compteur)=='m'))
		{ compteur++; q6(); }
		else 
		{ qError();}
		}	
	}	

	/**
	 * ===============================
	 *  Fonction q6() 
	 * =============================== 
	 */
	public void q6(){
		System.out.println("Je suis en q6");
		if ( compteur < ch.length()){ 
		if ( (ch.charAt(compteur)=='a'))
		{ compteur++; q7(); }
		else 
		{ qError();}
		}	
	}	

	/**
	 * ===============================
	 *  Fonction q7() 
	 * =============================== 
	 */
	public void q7(){
		System.out.println("Je suis en q7");
		if ( compteur < ch.length()){ 
		if ( (ch.charAt(compteur)=='i'))
		{ compteur++; q8(); }
		else 
		{ qError();}
		}	
	}	

	/**
	 * ===============================
	 *  Fonction q8() 
	 * =============================== 
	 */
	public void q8(){
		System.out.println("Je suis en q8");
		if ( compteur < ch.length()){ 
		if ( (ch.charAt(compteur)=='l'))
		{ compteur++; q9(); }
		else 
		{ qError();}
		}	
	}	
	
	/**
	 * ===============================
	 *  Fonction q9() 
	 * =============================== 
	 */
	public void q9(){
		System.out.println("Je suis en q9");
		if ( compteur < ch.length()){ 
		if ( (ch.charAt(compteur)=='.'))
		{ compteur++; q10(); }
		else 
		{ qError();}
		}	
	}	
	
	/**
	 * ===============================
	 *  Fonction q10() 
	 * =============================== 
	 */
	public void q10(){
		System.out.println("Je suis en q10");
		if ( compteur < ch.length()){ 
		if ( (ch.charAt(compteur)=='c'))
		{ compteur++; q11(); }
		else 
		{ qError();}
		}	
	}	


	/**
	 * ===============================
	 *  Fonction q11() 
	 * =============================== 
	 */
	public void q11(){
		System.out.println("Je suis en q11");
		if ( compteur < ch.length()){ 
		if ( (ch.charAt(compteur)=='o'))
		{ compteur++; q12(); }
		else 
		{ qError();}
		}	
	}	
  
	/**
	 * ===============================
	 *  Fonction q12() 
	 * =============================== 
	 */
	public void q12(){
		System.out.println("Je suis en q12");
		if ( compteur < ch.length()){ 
		if ( (ch.charAt(compteur)=='m'))
		{ compteur++; q13(); }
		else 
		{ qError();}
		}	
	}	
  
	/**
	 * ===============================
	 *  Fonction q13() 
	 * =============================== 
	 */
	public void q13(){
		System.out.println("Je suis en q13");
		if ( compteur < ch.length())
		{
			compteur++ ; // j'ai ajouté 
			qError();
		}
		else valide = true;
	}	

	/**
	 * ===============================
	 *  Fonction qError() 
	 * =============================== 
	 */
	public void qError(){
		System.out.println("Je suis en qError");
		if ( compteur < ch.length())
		{  compteur++ ; // j'ai ajouté 
			qError();
		}
		else valide = false;
	}	

	
}
