package org.library;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n   = 0;
		
		System.out.println("Quanti libri vuoi aggiungere?");
		n = scan.nextInt();
		scan.nextLine();
		
		Libro[] libri = new Libro[n];
		
		for (int i = 0; i < n ; i++) {
			System.out.print("Autore: ");
			String autore = scan.nextLine();
			System.out.print("Titolo: ");
			String titolo = scan.nextLine();
			System.out.print("Editore: ");
			String editore = scan.nextLine();
			System.out.print("Pagine: ");
			int pagine = scan.nextInt();
			System.out.println(" ");
			scan.nextLine();
			
			libri[i] = new Libro(titolo, pagine, autore, editore);
		}
		
		scan.close();
		
		for (int i = 0; i < n; i++) {
			System.out.println("\n°°° Libro " + (i + 1) + " °°°");
			System.out.println(libri[i]);			
		}
		
	}
}
