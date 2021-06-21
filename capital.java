package min;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

import java.util.*;

public abstract class capital {

	static Scanner kbd = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> nombreU = new ArrayList<>();
		final int NOMBREQUESTION = 20;
		int score = 0, j = 1, repu;
		boolean b = false;
		String reponse;
		String[][] capital = { { "Burundi", "Gitega" },
				{ "Australie", "Cambera" },
				{ "Nigeria", "Abuja" },
				{ "Portugal", "Lisbone" }, 
				{ "Republique Democratique du Congo", "Kinshasa" },
				{ "Somalie", "Mogadiscio" }, { "Rwanda", "Kigali" },
				{ "Belgique", "Bruxelles" }, { "France", "Paris" },
				{ "Ethiopie", "Addis Abeba" }, { "Iraq", "Bagdad" },
				{ "Iran", "Teheran" }, { "Brasil", "Brasilia" },
				{ "Argentine", "Buenos Aires" }, { "Chilie", "Santiago" },
				{ "Cuba", "Bogota" }, { "Uganda", "Entebe" },
				{ "Tanzania", "Dodoma" }, { "Mali", "Bamako" },
				{ "Burkina Faso", "Ouagadougou" },
				{ "Allemagne", "Berlin" }, { "Inde", "New Delhi" }, 
				{ "Russie", "Moscow" }, { "Turquie", "Ankara" },
				{ "Tunisie", "Tunis" }, { "Niger", "Niamey" },
				{ "Namibie", "Windoehck" }, { "Erythrea", "Asmara" },
				{ "Madagascar", "Antananarivo" }, { "Coree du Sud", "Seoul" },
				{ "Japon", "Tokyo" },
				{ "Chine", "Pekin" }, { "Bielorussie", "Minsk" },
				{ "Ukraine", "Kiev" }, { "Finland", "Helsinki" },
				{ "Canada", "Otawa" }, { "Lesotho", "Maseru" }, 
				{ "Colombie", "Bogota" }, { "Mexique", "Mexico" },
				{ "Arabie Saoudite", "Riyad" }, { "Republique Tcheque", "Prague" },
				{ "Liban", "Beyrouth" },
				{ "Pays-Bas", "Amsterdam" }, { "Yemen", "Sanaa" }, 
				{ "Oman", "Mascate" },
				{ "Papouasie Nouvelle-Guinee", "Port Moresby" }, };
		JOptionPane.showMessageDialog(null,"Jeux de Capitales\n-----------------\n");
		System.out.println("Regles:\n"
				+ "1. Donnez en reponse la capitale du pays qui vous sera demande\n"
				+ "2. A chaque bonne reponse votre score augmente d'un point\n"
				+ "3. Une mauvaise reponse ne change votre score\n"
				+ "4. Vous avez 20 chances, soit 20 questons\n"
				+ "5. Une note sous la moyenne correspond a un echec\n"
				+ "6. Une note parfaite correspond a une victoire absolue\n"
				+ "7. Enfin une note en dessous de la note parfaite peut etre amelioree\n\n");
		do {
			for (int i = 0; i < NOMBREQUESTION; i++) {
				int k;
				do {
					k = (int) (Math.random() * 45);
				}while(nombreU.contains(k));
				nombreU.add(k);
				
				do{
					try (PrintStream printf("%d. Quelle est la capitale de %s?\n", j, capital[k][0])) {
						
					};
					reponse = kbd.next();
				}while(reponse == null);
				j++;
				if (reponse.equalsIgnoreCase(capital[k][1])) {
					score++;
					System.out.println("Bonne reponse!!!\n:) :) )");
				} else {
					System.out.println("Mauvaise reponse\n:( :( :(\nLa vraie reponse est: " + capital[k][1]);
				}
			}
			j = 0;
			System.out.println("Votre score est: " + score + "/" + NOMBREQUESTION);
			if(score < 10) {
				System.out.println("Vous avez echoue\n:( :( :(");
				do {
					System.out.print("Voulez-vous tenter d'ameliorer votre score?(Repondez par 1 = \"oui\" ou 2 = \"non\"):");
					repu = kbd.nextInt();
				}while(repu != 1 && repu != 0);
			}
			else if(score == 20) {
				System.out.println("Votre score est parfait.\nVous avez obtenu une victoire aboslue\n:) :) :)");
				repu = 0;
			}
			else {
				System.out.println("Score satisfaisant mais vous pouvez toujours faire mieux\n:) :) :)");
				do {
					System.out.print("Voulez-vous tenter d'ameliorer votre score?(Repondez par 1 = \"oui\" ou 2 = \"non\")");
					repu = kbd.nextInt();
				}while(repu != 1 && repu != 0);
			}
			if(repu == 1) {
				System.out.println("Nouveau jeux\n");
			}
			
		}while(repu == 1);
		if(repu == 0) {
			System.out.println("Au revoir");
		}

	}

}
