package com.ecodation.examples;

import java.util.Random;
import java.util.Scanner;

/*
konsoldan kaç elemanlı elemanlı bir dizi olacak bu elemanlara rastgele sayılar girilecek
-a) ilk sayı ile son sayının toplamını alalım.
-b) metota verecem metot şunu yapacak girilen sayının 10 küçük olup olmadığını kontol edecek.

 */
public class Examples016_Dizi {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi, altIndis, UstIndis;
		double toplam = 0.0, ortalama;

		System.out.println("Lütfen dizi için bir eleman giriniz");
		sayi = klavye.nextInt();
		int[] dizi = new int[sayi];

		System.out.println("alt indis");
		altIndis = klavye.nextInt();

		System.out.println("Üst indis");
		UstIndis = klavye.nextInt();

		Random rnd = new Random();

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = rnd.nextInt(UstIndis) + altIndis;
			toplam = toplam + dizi[i];
		}

		// forEach
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}

		System.out.println("\nToplam: " + toplam);
		System.out.println("Ortalama: " + (toplam / dizi.length));
		System.out.println("Ortalama yuvarla: " + (Math.round(toplam / dizi.length)));
		System.out.println("ilk sayı: " + dizi[0]);
		System.out.println("son sayı: " + dizi[dizi.length - 1]);

	}

}
