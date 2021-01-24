package com.ecodation.isbn;

import java.util.Scanner;

//110%11=10
//(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6  * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
//ISBN­10 standartlarına göre eğer sağlama değeri 10​ elde edilirse, bu X olarak gösterilir. Kullanıcıdan ilk
//9 basamağı alan ve 10 basamaklı ISBN numarasını gösteren bir program yazınız. (Baştaki sıfırları da
//gösteriniz.) Programınız girdiyi tam sayı olarak okumalıdır. Programın örnek akışını inceleyiniz:
//013031997

public class Isbn {

	public static void main(String[] args) {
		// System.out.println("Lütfen girilecek sayı miktarını yazınız");
		int sayi, toplam = 0;
		int[] dizi = new int[9];
		Scanner klavye = new Scanner(System.in);
		for (int i = 0; i <= 8; i++) {
			System.out.println("Lütfen " + (i + 1) + ". sayıyı giriniz");
			sayi = klavye.nextInt();
			dizi[i] = sayi * (i + 1);
			toplam += dizi[i];
		}

		for (int temp : dizi) {
			System.out.println(temp);
		}

		System.out.println("Toplam: " + toplam);

		if (toplam % 11 == 10) {
			System.out.println("sonucundak kalan: " + (toplam % 11 == 10));
		}

	}

}
