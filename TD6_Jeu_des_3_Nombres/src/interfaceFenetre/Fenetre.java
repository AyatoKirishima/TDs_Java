package interfaceFenetre;
import javax.swing.JFrame;

public class Fenetre {

		
	public static class InterfaceG1 {
	private static JFrame fenetre;
	
	public InterfaceG1() {
	
		//On donne un nom � la fenetre
	fenetre = new JFrame("Fenetre");
		//On lui d�finit une taille � l'ouverture
	fenetre.setSize(300,300);
	fenetre.setLocation (100,100);
		//On d�finit la fermeture de la fenetre : USELESS HERE ?!!
	//fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	@SuppressWarnings("unused")
	public static void main (String[] argv) {
	InterfaceG1 monInterface = new InterfaceG1();
	fenetre.setVisible(true);
	}

  }

}
