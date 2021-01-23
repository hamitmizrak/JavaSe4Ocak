package com.ecodation.examples;

import java.util.Scanner;

public class Examples009_NegatifTernary {
	// Kullanıcının Girdiği Sayının Negatif mi, Pozitif mi Olduğunu Bulan Java
	// Programı
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		while (true) {
			System.out.println("Lütfen bir sayı giriniz.");
			int sayi = klavye.nextInt();
			
			// String result = sayi < 0 ? "negatif" : "pozitif";
			// System.out.println(result);
			System.out.println(sayi < 0 ? "negatif" : "pozitif");
		}
		
	}
}
