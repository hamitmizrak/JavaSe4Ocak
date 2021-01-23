package com.ecodation.examples;

public class Examples012_WhileRepeat {
	// Haftanın günleri
	
	public static void main(String[] args) {
		
		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15);
		// 6000
		
		int sayi = 1;
		int toplam = 0;
		while (sayi <= 2000) {
			toplam += sayi;
			sayi++;
		}
		System.out.println(toplam);
		
	}
}
