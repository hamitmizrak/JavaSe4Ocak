package com.ecodation.examples;

import java.util.Scanner;

public class Examples013_KararDortIslemMath {
	// Haftanın günleri
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		while (true) {
			System.out.println("1-)Dört işlem 2-)Math 3-)Çıkış");
			int karar = klavye.nextInt();
			
			switch (karar) {
				case 1:
					System.out.println("Dört işlem");
					Scanner klavye2 = new Scanner(System.in);
					int sayi2 , sayi3;
					
					System.out.println("1.sayı giriniz");
					sayi2 = klavye2.nextInt();
					
					System.out.println("2.sayı giriniz");
					sayi3 = klavye2.nextInt();
					System.out.println("toplamları: " + (sayi2 + sayi3));
					System.out.println("çıkarma: " + (sayi2 - sayi3));
					System.out.println("çarpma: " + (sayi2 * sayi3));
					System.out.println("bölme: " + (sayi2 / sayi3) + "\n");
					break;
				
				case 2:
					Scanner klavye3 = new Scanner(System.in);
					System.out.println("bir sayı giriniz");
					int sayi5 = klavye.nextInt();
					System.out.println("Mutlak sayı: " + (Math.abs(sayi5)));
					System.out.println("üslü sayı: " + (Math.abs(Math.pow(2, sayi5))));
					System.out.println("karekök sayı: " + (Math.sqrt(sayi5)));
					System.out.println("yuvarlama: " + (Math.abs(Math.round(sayi5))));
					break;
				
				case 3:
					System.out.println("Çıkış yapılıyor");
					System.exit(0);
					break;
				
				default:
					System.out.println("Lütfen belirtilen aralıkta sayı giriniz");
					break;
				
			}
		}
	}
}
