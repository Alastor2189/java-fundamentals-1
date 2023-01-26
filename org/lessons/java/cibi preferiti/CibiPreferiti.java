package org.lessons.java.food;

public class CibiPreferiti {
	public static void main (String  [] args) {
		String [] favoriteFoods = {"Pennette alla carbonara","Pizza", "Bistecca di cavallo", "Pesce arrosto","Fregola di mare", "pecorino", "Lasagna bolognese"};
		
		System.out.println("numero cibi in classifica:" + favoriteFoods.length);
		
		System.out.println("Al primo posto:" + favoriteFoods[0]);
		
		System.out.println("Ultimo posto:" + favoriteFoods[favoriteFoods.length-1]);
	}
}
