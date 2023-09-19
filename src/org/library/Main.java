package org.library;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int n   = 0;
		
		System.out.println("Quanti libri vuoi aggiungere?");
		n = Integer.valueOf(scan.nextLine());
		
		Libro[] libri = new Libro[n];
		
		for (int i = 0; i < n ; i++) {
			System.out.print("Autore: ");
			String autore = scan.nextLine();
			System.out.print("Titolo: ");
			String titolo = scan.nextLine();
			System.out.print("Editore: ");
			String editore = scan.nextLine();
			System.out.print("Pagine: ");
			String pagine = scan.nextLine();
			System.out.println(" ");
			
			try {
				libri[i] = new Libro(titolo, pagine, autore, editore);				
			} catch (Exception e) {			
				System.err.println(e);
				System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
				i--;
			}
		}
		
		scan.close();
		
		FileWriter myWriter = null;
	
		try {
			myWriter = new FileWriter("file.txt");	
			for (int i = 0; i < n; i++) {
				myWriter.write("\n°°°° Libro " + (i+1) + " °°°°");
				myWriter.write(libri[i] + "\n");
				myWriter.write("°°°°°°°°°°°°°°°°°\n");
			}
		} catch (IOException e) {		
			System.err.println("Error updating file: " + e.getMessage());
		} finally {		
			try {
				myWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		File tmpFile = new File("file.txt");
		Scanner reader = null;
		try {		
			reader = new Scanner(tmpFile);		
			while (reader.hasNextLine()) {			
				String line = reader.nextLine();
				System.out.println(line);
			}
		} catch (Exception e) { 
			System.out.println("Error reading file: " + e.getMessage());
		} finally {		
			if (reader != null)
				reader.close();
		}
		
	}
}
