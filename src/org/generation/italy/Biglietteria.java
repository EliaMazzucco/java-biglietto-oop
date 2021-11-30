package org.generation.italy;

import java.util.Scanner;

public class Biglietteria {

	//////// LAVORO SVOLTO DALLA ROOM 1 ////////////////////

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int age, km;
		boolean flessibile;
		String sceltaFlessibile = "";

		try {
			System.out.print("How many kilometers do you want to ride?\nKm:");
			km = scanner.nextInt();
			System.out.print("\nHow old are you?\nAge:");
			age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("\nDo you want a flexibile ticket, sir? (yes/no)\n");
			sceltaFlessibile = scanner.nextLine();

			if (sceltaFlessibile.equalsIgnoreCase("yes")) {
				flessibile = true;
			} else {
				flessibile = false;
			}

			Biglietto biglietto = new Biglietto(km, age, flessibile);
			System.out.println(biglietto.calcolaPrezzo() + "\n");
			System.out.println(biglietto.calcolaDataScadenza());
		} catch (Exception e) {
			System.out.println("Insert a valid age (0 to 150) and the right km (1 to 100'000)");
		}

		scanner.close();
	}

}