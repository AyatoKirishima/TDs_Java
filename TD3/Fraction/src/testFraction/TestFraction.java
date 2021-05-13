package testFraction;

import fraction.Fraction;

public class TestFraction {
	


	public static void main(String[] args)
	{
		Fraction r1= new Fraction(1,6);
		Fraction r2=new Fraction(1,3);
		Fraction r3=new Fraction();
		
		System.out.println(" La somme est :");
		r3=r1.somme(r2);
		r3=r3.simplifier();
		r3.afficher();
		
		System.out.println(" La diffrence est :");
		r3=r1.difference(r2);
		r3=r3.simplifier();
		r3.afficher();
		
		System.out.println(" Le produit est :");
		r3=r1.produit(r2);
		r3.simplifier();
		r3.afficher();
		System.out.println(" La division est :");
		r3=r1.division(r2);
		r3.simplifier();
		r3.afficher();
		//--------------------------------------
		// 1/2 * x + 1/3*y= 11/36
		// 1/6*  x - 1/4*y=-1/12   
		// ------------------------------------
		Fraction a1=new Fraction(1,2);
		Fraction a2=new Fraction(1,6);
		Fraction b1=new Fraction(1,3);
		Fraction b2=new Fraction(1,4);
		Fraction c1=new Fraction(17,36);
		Fraction c2=new Fraction(1,4);
		Fraction x=new Fraction();
	    Fraction y=new Fraction();
		if (Resolution(a1,a2,b1,b2,c1,c2,x,y))
		{ 
			System.out.println("Le système a deux solutions : ");
			x.afficher();
			y.afficher();
		}
		}
		

	public static boolean  Resolution(Fraction a1, Fraction a2, Fraction b1, Fraction b2, Fraction c1, Fraction c2, Fraction sol1, Fraction sol2)
	{
		System.out.println("Je suis dans la fonction Resolution");
		boolean ok;
		// delta = a1*b2-a2*b1
		Fraction delta= (a1.produit(b2)).difference(a2.produit(b1));
		delta=delta.simplifier();
		delta.afficher();
		
		if (delta.getNum()==0){
			ok=false;
			return ok;
		}
		else{
			 ok=true;
			  //------------------------
			  //deltax=b2*c1-b1*c2;
			  //----------------------------
			  Fraction deltax=b2.produit(c1).difference(b1.produit(c2));
			  deltax=deltax.simplifier();
			
			  //------------------------
			  //deltay=a1*c2-a2*c1;
			  //-----------------------
			  Fraction deltay=a1.produit(c2).difference(a2.produit(c1));
			  deltay=deltay.simplifier();
			 
			  //-------------------------------------
			  // f1=delatx/delta  et f2=deltay/delta
			  //--------------------------------------
			  Fraction f1=deltax.division(delta).simplifier();
			  Fraction f2=deltay.division(delta).simplifier();
			  
			  sol1.setNum( (f1.getNum())); 
			  sol1.setDen( (f1.getDen())); 
			  
			  sol2.setNum( f2.getNum());
			  sol2.setDen( f2.getDen());
			  
			  return ok;
		    }

	}
}
	