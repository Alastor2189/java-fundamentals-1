package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main (String [] args) {
		int userKm, userAge;
		float priceKm = 0.21F;
		float totalPrice = 0;
		int discUnder18 = 20;
		int discOver65 = 40;
		
		Scanner v = new Scanner (System.in);
		
		System.out.print("Quanti km devi percorrere?:");
			userKm = Integer.parseInt(v.nextLine());
		
		System.out.print("Quanti anni hai?:");
			userAge = Integer.parseInt(v.nextLine());
			
		float price = priceKm * userKm;
		
		if (userAge < 18) {
			totalPrice = (float) (price - (price * discUnder18/100));
		
		} else if (userAge>65) {
			totalPrice = (float) (price - (price * discOver65/100));
		} else {
			totalPrice = price;
		}
			
		
		System.out.println("Costo totale del biglietto:" + totalPrice + "€");
		
		
	}
}
