package com.ecodation.examples;

import java.util.Scanner;

public class Examples015_AsalSayi {
	// Haftanın günleri
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi;
		
		while (true) {// sonsuz
			System.out.println("Sayı giriniz");
			sayi = klavye.nextInt();
			
			boolean flag = true;
			
			if (sayi < 2) {
				System.out.println("2'den küçük asal sayı olamaz.");
			} else if (sayi == 2) {
				System.out.println("2 asal sayıdır en küçük asal sayıdır ve tek çift sayıdır.");
				// break;
				// System.exit(0);
			} else {
				for (int i = 2; i < sayi; i++) {
					if (sayi % i == 0) {
						flag = false;
						break;
					}
				}
				
				if (flag) {
					System.out.println(sayi + " sayısı Asal sayıdır");
				} else {
					System.out.println(sayi + " sayısı Asal değildir.");
				}
			}
			// klavye.close();
		}
		
	}
}
