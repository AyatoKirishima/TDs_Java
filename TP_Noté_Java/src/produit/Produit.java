package produit;

public class Produit {
	//variables
	protected static int num;
	
	//getters and setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Produit [num=" + num + "]";
	}
	
	
	
}
