package min;

import java.util.*;

import javax.swing.JOptionPane;

public class devin {
	static Scanner kbd = new Scanner(System.in);
	public static void main(String[] args) {
		
		String nombreUs;
		int nombreM, nombreU, i = 1;
		final int NOMBRESSAIS = 10;
		JOptionPane.showMessageDialog(null, "Vous avez 10 essais pour trouver le nombre mystere.");
		nombreM =(int) ((Math.random()*999)+1);
		nombreUs = JOptionPane.showInputDialog("Saisissez un nombre entier positif: ");
	
		
		
		nombreU = Integer.valueOf(nombreUs);
		do {
			if(nombreU > nombreM) {
				JOptionPane.showMessageDialog(null,"Ce nombre est trop grand.");
			}
			if(nombreU < nombreM) {
				JOptionPane.showMessageDialog(null, "Ce nombre est trop petit.");
			}
			JOptionPane.showMessageDialog(null, "Il vous reste " + (NOMBRESSAIS - i) + " essais");
			nombreUs = JOptionPane.showInputDialog("Saisissez-en un autre: ");
			nombreU = Integer.valueOf(nombreUs);
			i++;
		}while(nombreU != nombreM && i < NOMBRESSAIS);
		JOptionPane.showMessageDialog(null, "Felicitation!!!\nVous avez trouvez le nombre mystere!!!");
		JOptionPane.showMessageDialog(null, "Votre score: "+(NOMBRESSAIS-i)+ "/"+NOMBRESSAIS);
		
	}
}
