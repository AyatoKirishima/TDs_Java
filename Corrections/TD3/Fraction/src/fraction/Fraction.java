package fraction;

public class Fraction {
	private int num;
	private int den;
	
	
	/**
	 * Constructeur sans paramétre : 0/1
	 */
	public Fraction() {
	 this.num=0;
	 this.den=1;
	}
	/**
	 * Constructeur à un paramétre : n/1 
	 * @param num
	 */
	public Fraction(int n) {
		this.num = n;
		this.den=1;
	}
	/**
	 * Constructeur à deux paramétres
	 * @param num
	 * @param den
	 */
	public Fraction(int n, int d) {
		this.num = n;
		this.den = d;
		if (this.den<0)
		 {
		  this.num=-this.num;
		  this.den=-this.den;
		 }
	}
	/**
	 * constructeur de copie
	 * @param r
	 */
	
	public Fraction(Fraction r)
	{
	 num=r.num;
	 den=r.den;
	}
	/**
	 * 
	 * @return
	 */
	public int getNum() {
		return num;
	}
	/**
	 * 
	 * @param num
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * 
	 * @return
	 */
	public int getDen() {
		return den;
	}
	/**
	 * 
	 * @param den
	 */
	public void setDen(int den) {
		this.den = den;
	}
	/**
	 * 
	 * @param r
	 * @return
	 */
	public Fraction somme(Fraction r)
	{
		Fraction res=new Fraction();
		res.num= num*r.den+den*r.num;
		res.den=den*r.den;
		return res;
		
	}
	
	public Fraction difference(Fraction r)
	{
	
		return new Fraction(num*r.den-den*r.num, den*r.den);
		 
	}
	
	public Fraction produit(Fraction r)
	{
	
		return new Fraction(num*r.num, den*r.den);
		 
	}
	/**
	 * 
	 * @return
	 */
	
	public Fraction inverse()
	{
	  try {
	  return new Fraction(den, num);
	  }
	  catch (ArithmeticException e) 
	  {  
          System.out.println("Denominateur nul!");	
		  return new Fraction(); 	
	  }
	}
	
	/**
	 * 
	 * @param r
	 * @return
	 */
	public Fraction division(Fraction r)
	{
	
		return this.produit(r.inverse());
		 
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int pgcd(int a , int b)
	{  a=Math.abs(a); b= Math.abs(b);
	   if (a==b) return a ;
	   else if (a>b) return pgcd(a-b, b);
	   else return pgcd(a, b-a);
	   
	}
	
	/**
	 * 
	 * @return
	 */
	public Fraction simplifier()
	{
		int p=pgcd(this.num, this.den);
	    return new Fraction(this.num/p, this.den/p);
	}
	
	/**
	 * 
	 */
	
	public void afficher()
	{
		System.out.println("Fraction : "+this.num+ "/" +this.den);
	}
		
}
	
	
	
	
	
	
	


