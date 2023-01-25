package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main (String [] args) {
		Scanner p = new Scanner(System.in);
		System.out.print("Inserisci il nome");
			String name = p.nextLine();
		System.out.print("Inserisci il cognome");
			String surname = p.nextLine();
		System.out.print("Inserisci il colore preferito");
			String favoriteColor = p.nextLine();
		System.out.print("Inserisci il giorno di nascita");
			int dayBirth = p.nextInt();
		System.out.print("Inserisci il mese di nascita");
			int monthBirth = p.nextInt();
		System.out.print("Inserisci l'anno di nascita");
			int yearBirth = p.nextInt();
			
		int fullBirthday = dayBirth + monthBirth + yearBirth;
		
		String password = name+surname+favoriteColor+fullBirthday;
		
		System.out.println("la password generata è questa:" + password);
		
		p.close();
		
		
		
		
		
	}
}
