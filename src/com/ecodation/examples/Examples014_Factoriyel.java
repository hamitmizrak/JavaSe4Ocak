package com.ecodation.examples;

import java.util.Scanner;

public class Examples014_Factoriyel {
	// Haftanın günleri
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi , sonuc = 1;
		System.out.println("Sayı giriniz");
		sayi = Math.abs(klavye.nextInt());
		
		for (int i = sayi; i > 0; i--) {
			sonuc = sonuc * i;
			
		}
		System.out.println(sayi + " sayının faktöriyeli: " + sonuc);
		
	}
}
