package nombre;

import java.awt.Container;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



//////////////////////////////////////////////////////////////////////
//Methods
//////////////////////////////////////////////////////////////////////
	
	@SuppressWarnings("serial")
	// Cr�er le cadre JFrame
public class Jeu extends JFrame implements ActionListener {
		private JTextField nb1, nb2, nb3, res;
		private JButton bouton;
		
		public Jeu() {
			setTitle("Jeu des 3 nombres");
			//Acc�s au contenu du cadre : getContentPane
			Container c= this.getContentPane();
			//Cr�er le panel : JPanel
			JPanel p1 = new JPanel();
			//Cr�er 3 zones de texte : JTextField
			nb1 = new JTextField(3);
			nb2 = new JTextField(3);
			nb3 = new JTextField(3);
			//Associer ces zones de texte au panel 1
			p1.add(nb1);
			p1.add(nb2);
			p1.add(nb3);
			c.add("North",p1);
			
			//Cr�er le panel2 : JPanel
			JPanel p2 = new JPanel();
			//Cr�er un bouton TIRAGE : JButton
			bouton = new JButton("TIRAGE");
			p2.add(bouton);
			//Cr�er un JLabel RESULTAT
			p2.add(new Label("Resultat"));
			//Cr�er un TextFiel RESULTAT
			res = new JTextField(6);
			p2.add(res);
			
			c.add("South", p2);
			//Associer au bouton tirage un �couteur : ActionListener
			bouton.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e) {
			//Ecrire la m�thode actionPerformed associ�e au bouton TIRAGE
			JButton b = (JButton) e.getSource();
			if (b == bouton) {
				int v1 = (int) (Math.random()*10);
				int v2 = (int) (Math.random()*10);
				int v3 = (int) (Math.random()*10);
				nb1.setText(Integer.toString(v1));
				nb2.setText(Integer.toString(v2));
				nb3.setText(Integer.toString(v3));
				int somme = v1+v2+v3;
				if (somme > 10) res.setText("GAGNE");
				else res.setText("PERDU");
			}
		}
		public static void main(String args[]) {
		Jeu f = new Jeu();
		f.pack(); //autosize
		f.setVisible(true);
	}
}
	
	


