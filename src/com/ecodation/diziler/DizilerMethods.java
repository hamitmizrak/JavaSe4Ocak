package com.ecodation.diziler;

import java.util.Random;
import java.util.Scanner;

public class DizilerMethods {

	// 1method
	public static int[] sayilar() {
		Scanner klavye = new Scanner(System.in);
		int sayi, altIndis, UstIndis;

		System.out.println("Lütfen dizi için bir eleman giriniz");
		sayi = klavye.nextInt();

		System.out.println("alt indis");
		altIndis = klavye.nextInt();

		System.out.println("Üst indis");
		UstIndis = klavye.nextInt();

		int[] dizi = { sayi, altIndis, UstIndis };

		return dizi;
	}

	// 2.methods
	public static int[] diziElemani() {
		Scanner klavye = new Scanner(System.in);
		int altIndis, UstIndis;
		int gelenSayilar[] = sayilar();

		int[] dizi = new int[gelenSayilar[0]];
		altIndis = gelenSayilar[1];
		UstIndis = gelenSayilar[2];

		Random rnd = new Random();

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = rnd.nextInt(UstIndis) + altIndis;

		}

		// forEach
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}

		return dizi;
	}

	// 3.method
	public static void result() {

		int[] gelenSayilar = diziElemani();
		double toplam = 0.0;

		for (int i = 0; i < gelenSayilar.length; i++) {
			toplam = toplam + gelenSayilar[i];
		}

		System.out.println("\nToplam: " + toplam);
		System.out.println("Ortalama: " + (toplam / gelenSayilar.length));
		System.out.println("Ortalama yuvarla: " + (Math.round(toplam / gelenSayilar.length)));
		System.out.println("ilk sayı: " + gelenSayilar[0]);
		System.out.println("son sayı: " + gelenSayilar[gelenSayilar.length - 1]);

	}

	//
	public static void ciftSayilar() {
		int[] dizi = diziElemani();
		System.out.println("---------");
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] % 2 == 0) {
				System.out.println(dizi[i]);
			}
		}
	}
}
