package conversion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

@SuppressWarnings("serial")
public class Conversion extends JFrame implements ActionListener {
	private JTextField tempF, tempC;
	private JButton button;
	private JLabel lbl1, lbl2;
	
	public Conversion() {
		// On nomme la fenêtre
		setTitle("Fahrenheit");
		
		// On donne accès au contenu du cadre : getContentPane() ici nous utilisons BorderLayout()
		
		this.setSize(800,800);
		this.setLayout(new BorderLayout());
		
		//On crée un nouveau panel
		JPanel p1 = new JPanel();
		//Variables
		tempF = new JTextField(6); //On peut entrer jusqu'à 6 nombres
		lbl1 = new JLabel("Entrer la température en Fahrenheit : ");

		//On ajoute les éléments au panel
		p1.add(lbl1);
		p1.add(tempF);
		this.add(p1,"North");
		
		//On définit la couleur d'arrière plan
		p1.setBackground(Color.cyan);
		
		//On crée un nouveau panel
		JPanel p2 = new JPanel();
		
		//Variables
		tempC = new JTextField(6);
		tempC.setEditable(false);
		lbl2 = new JLabel("Température en Celcius : ");
		button = new JButton("OK");
		
		//On ajoute les éléments au panel
		p2.add(lbl2);
		p2.add(tempC);
		p2.add(button);
		this.add("Center",p2);
		
		//Associer au bouton tirage un écouteur : ActionListener
		button.addActionListener(this);
		
		//On définit la couleur d'arrière plan
		p2.setBackground(Color.cyan);
		pack();
	}

	
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b == button) {
			String s = tempF.getText(); //string
			try {
				int F = Integer.parseInt(s);
			//int
				//DecimalFormat f = new DecimalFormat("0.00");
				int res = (int) ((5./9)*(F-32));   //double
				String result =  String.valueOf(res); //string
				// System.out.println(df.format(mon_double));
				tempC.setText(result);
				} catch (NumberFormatException nfe) {}
			
		}	
	}
	
	public static void main(String args[]) {
		Conversion f = new Conversion();
		
		f.setVisible(true);
	}
}
