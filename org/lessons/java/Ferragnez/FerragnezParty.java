package org.lessons.java.ferragnez;

import java.util.Scanner;

public class FerragnezParty {
	public static void main (String[] args) {
		String  [] guestParty = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili"};
		Scanner s = new Scanner(System.in);
		System.out.print("Dica il suo nominativo:");
		String guestName = s.nextLine();
        
		s.close();
		
		boolean checkGuest = false;
		
		for (int i = 0; i < guestParty.length; i++) {
			if(guestName.equalsIgnoreCase(guestParty[i])) {
				checkGuest = true;
			}
		} if(checkGuest) {
			System.out.println("Benvenuto, entri pure");
		} else {
			System.out.println("Mi dispiace, non risulta in lista e non posso darle accesso");
		}
	}
}
