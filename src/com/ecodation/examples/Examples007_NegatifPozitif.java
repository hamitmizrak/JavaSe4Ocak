package com.ecodation.examples;

import java.util.Scanner;

public class Examples007_NegatifPozitif {
	// Kullanıcının Girdiği Sayının Negatif mi, Pozitif mi Olduğunu Bulan Java
	// Programı
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		while (true) {
			System.out.println("Lütfen bir sayı giriniz.");
			int sayi = klavye.nextInt();
			
			if (sayi < 0) {
				System.out.println("sayı negatiftir");
			} else {
				System.out.println("sayı pozitiftir.");
			}
		}
		
	}
}
