package min;

import java.util.Scanner;

public class tst {
	static Scanner kbd = new Scanner(System.in);
	public static void main(String[] args) {
		String reponse;
		do{
			System.out.println("Quelle est la capitale de");
			reponse = kbd.next();
		}while(reponse == null);
	}
}
