package com.ecodation.examples;

import java.util.Scanner;

public class Examples010_dongutoplamlari {
	// Kullanıcının Girdiği Sayının Negatif mi, Pozitif mi Olduğunu Bulan Java
	// Programı
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi , karar;
		int sayiToplam = 0 , ciftToplam = 0 , tekToplam = 0; // camelCase
		System.out.println("lütfen bir sayı giriniz");
		sayi = klavye.nextInt();
		
		while (true) {
			System.out.println("\n1-)Sayi Toplami\n2-)Sayinin tek toplamları\n3-)sayinin çift toplamları\n4-)Çıkış");
			karar = klavye.nextInt();
			
			switch (karar) {
				case 1:
					System.out.println("\nsayı toplamlari");
					for (int i = 0; i <= sayi; i++) {
						sayiToplam = sayiToplam + i;
					}
					System.out.println("toplam: " + sayiToplam);
					break;
				
				case 2:
					System.out.println("\ntek sayi toplamlari toplamlari");
					for (int i = 0; i <= sayi; i++) {
						if (i % 2 == 1) {
							tekToplam += i;
						}
						// System.out.println("tek toplam: " + tekToplam); // adım adım toplama
					}
					System.out.println("tek toplam: " + tekToplam);
					break;
				case 3:
					System.out.println("\nçiftsayı toplamlari");
					for (int i = 0; i <= sayi; i++) {
						if (i % 2 == 0) {
							ciftToplam += i;
						}
						// System.out.println("çift toplam: " + ciftToplam); // adım adım toplama
					}
					System.out.println("çift toplam: " + ciftToplam);
					break;
				case 4:
					System.err.println("çıkış yapılıyor...");
					System.exit(0);
					break;
				
				default:
					System.out.println("Lütfen belirtilen aralıkta sayı giriniz.");
					break;
			}
		}
		
	}
}
