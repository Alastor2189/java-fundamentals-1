package org.lessons.java.sondaggio;

import java.util.Scanner;

public class SondaggioOS {
	public static void main (String [] args) {
		Scanner os = new Scanner(System.in);
		
		System.out.print("Numero di studenti che posseggono windows:");
			int windows = os.nextInt();
		System.out.print("Numero di studenti che posseggono linux:");
			int linux = os.nextInt();
		System.out.print("Numero di studenti che posseggono mac:");
			int mac = os.nextInt();
		
			int totalStudents = windows + linux + mac;
			
		double statsWindows = (double) (windows * 100) / totalStudents;
			System.out.println("Studenti con Windows:" + statsWindows + "%");
		double statsLinux = (double) (linux * 100) / totalStudents;
			System.out.println("Studenti con Windows:" + statsLinux + "%");
		double statsMac = (double) (mac * 100) / totalStudents;
			System.out.println("Studenti con Windows:" + statsMac + "%");
	}
}
